<h2 align="center">
  🌟⚒️ Itemer — Quick item setup
</h2>
<p align="center">
  ⚙️ Quick and easy creation and modification of <b>ItemStack</b> for Paper
</p>
<p align="center">
  <a href="https://www.codefactor.io/repository/github/totemmc/itemer"><img src="https://www.codefactor.io/repository/github/boxedthings/itemer/badge" alt="CodeFactor" /></a> <a href="https://jitpack.io/#BoxedThings/Itemer/"><img src="https://jitpack.io/v/BoxedThings/Itemer.svg" alt="JitPack" /></a> <img src="https://img.shields.io/badge/Software-Paper%201.21%2B-orange?style=flat" alt="software">
</p>

## 🔗 Links
- [**Pull requests**](https://github.com/BoxedThings/Itemer/pulls)
- [**Issues**](https://github.com/BoxedThings/Itemer/issues)

## ✨ Features
- **Item Builder**: Create complex ItemStacks.
- **Adventure API Support**: Full support for modern `Component` text.
- **Enchantment Groups**: Manage sets of enchantments easily.
- **Item Editor**: Modify existing items as easily as creating new ones.
- **Zero Dependencies**: No extra plugins or libraries required — only Paper API.

## ⚒️ Recommendations
- **Java 21+**: Itemer is built on Java 21 to utilize modern JVM features.
- **Paper 1.21+**: Optimized specifically for the latest Paper versions.
> These are just recommendations. They should work on lower server versions, but not everything will. You've been warned.

## 📕 Documentation
###  Connect with project
##### Maven (pom.xml):
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.TotemMC</groupId>
        <artifactId>Itemer</artifactId>
        <!-- Replace VERSION with the latest release tag -->
        <version>VERSION</version>
        <scope>compile</scope>
    </dependency>
</dependencies>
```
##### Gradle (build.gradle):
```gradle
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    // Replace VERSION with the latest release tag
    implementation 'com.github.TotemMC:Itemer:VERSION'
}
```

### Create a new item
```java
ItemStack sword = Item.builder(Material.DIAMOND_SWORD)
        .name(Component.text("Excalibur", NamedTextColor.GOLD))
        .lore("Legendary blade", "Sharpness X")
        .enchants(EnchantmentGroup.create().add(Enchantment.SHARPNESS, 10))
        .unbreakable(true)
        .build();
```
### Editing item

```java
ItemStack item = new ItemStack(Material.NETHERITE_SWORD);

ItemStack sword = Item.editor(item)
        .name(Component.text("Titan Sword", NamedTextColor.GOLD))
        .enchants(new EnchantmentGroup().add(Enchantment.SHARPNESS, 3))
        .flags(ItemFlag.HIDE_ENCHANTS)
        .toItem();
```

### Advanced Customization (modifyMeta)
If you need to access specific Meta types (like `SkullMeta`, `LeatherArmorMeta`, or `BookMeta`), use the `modifyMeta` method. It allows you to keep the builder chain while accessing low-level Bukkit features.

```java
ItemStack playerHead = Item.builder(Material.PLAYER_HEAD)
        .name(Component.text("User's Head", NamedTextColor.YELLOW))
        .modifyMeta(meta -> {
            if (meta instanceof SkullMeta skullMeta) {
                skullMeta.setOwningPlayer(somePlayer);
            }
        })
        .build();
```

## 🤝 Contributing
Contributions, issues, and feature requests are welcome!
Feel free to check the issues page.
[**More details...**](https://github.com/BoxedThings/Itemer/blob/main/CONTRIBUTING.md)


<h6 align="center">
    Developed with ❤️ by SuperCHIROK1 (2026)
</h6>
