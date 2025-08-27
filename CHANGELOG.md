# Changelog

## 1.0.0 - Initial Release
- Added automatic patch for missing loot table: `imst:lumberjack/spruce`.
- Prevents loot table errors for modded containers that rely on this loot table.
- Project structured for easy future expansion to patch other missing loot tables.
- Workspace updated for multi-version support:
	- Supported Minecraft versions: 1.18, 1.18.1, 1.18.2, 1.19, 1.19.1, 1.19.2, 1.19.3, 1.19.4, 1.20, 1.20.1, 1.20.4, 1.21.1, 1.21.2, 1.21.3, 1.21.4, 1.21.5, 1.21.6, 1.21.7, 1.21.8.
	- Each version has its own folder with code, resources, and build files for easy maintenance and expansion.
	- Legacy root files removed; all mod logic and assets are now versioned and organized for clarity.
- Legacy root files and folders cleaned up; all mod code and resources are now versioned.
