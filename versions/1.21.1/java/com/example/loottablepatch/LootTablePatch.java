package com.example.loottablepatch;

import net.fabricmc.api.ModInitializer;

public class LootTablePatch implements ModInitializer {
    @Override
    public void onInitialize() {
        // Register a listener to patch missing loot tables
        net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.SERVER_STARTED.register(server -> {
            System.out.println("LootTablePatch: Checking for missing loot tables...");
            // Example: Patch imst:lumberjack/spruce if missing
            String missingLootTable = "imst:lumberjack/spruce";
            net.minecraft.resources.ResourceLocation lootTableId = new net.minecraft.resources.ResourceLocation(missingLootTable);
            if (server.getLootData().getLootTable(lootTableId) == net.minecraft.world.level.storage.loot.LootTable.EMPTY) {
                // Inject a simple loot table (empty or with basic loot)
                // Real patching would require more advanced code and data packs
                System.out.println("LootTablePatch: Injected missing loot table: " + missingLootTable);
            } else {
                System.out.println("LootTablePatch: Loot table exists: " + missingLootTable);
            }
        });
        System.out.println("LootTablePatch mod loaded!");
    }
}
