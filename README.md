# LootTablePatch


**LootTablePatch** is a Minecraft Fabric mod with multi-version support (1.18 through 1.21.8) that automatically patches missing loot tables for other mods, starting with `imst:lumberjack/spruce`.

## Supported Minecraft Versions
- 1.18
- 1.18.1
- 1.18.2
- 1.19
- 1.19.1
- 1.19.2
- 1.19.3
- 1.19.4
- 1.20
- 1.20.1
- 1.20.4
- 1.21.1
- 1.21.2
- 1.21.3
- 1.21.4
- 1.21.5
- 1.21.6
- 1.21.7
- 1.21.8

---

## Features
- Multi-version workspace: Each supported Minecraft version has its own folder with code and resources.
- Automatically adds missing loot tables to prevent errors and broken gameplay.
- Starts with support for `imst:lumberjack/spruce` (more can be added easily).

## Project Structure
- All mod code and resources are organized by version in the `versions/` folder.
- Legacy root files have been removed for clarity and maintainability.
- Designed for easy future expansion—patch additional loot tables as needed.
- Helps both players and modpack creators maintain a smooth experience.

## Purpose
> Prevents loot table errors that can break gameplay or mod compatibility. Ensures modded containers work even if a required loot table is missing.

## How it works
- Detects missing loot tables for supported mods.
- Injects a default loot table to avoid errors.
- Future updates can add support for more mods and loot tables.

---

**Multi-version support:**
Works with Fabric Loader and Fabric API versions appropriate for each supported Minecraft version (see individual version folders for details).
