plugins {
    id("fpgradle-minecraft") version ("0.7.5")
}

group = "com.github.gtmega"

minecraft_fp {
    mod {
        modid = "baublesbatpacks"
        name = "BaublesBatPacks"
        rootPkg = "$group.baublesbatpacks"
    }

    mixin {
        pkg = "mixin.mixins"
        pluginClass = "mixin.plugin.MixinPlugin"
    }

    tokens {
        tokenClass = "Tags"
    }
}

repositories {
    modrinthEX()
    exclusive(mavenpattern(), "com.falsepattern")
    exclusive(mega(), "codechicken")
    exclusive(maven("ic2", "https://mvn.falsepattern.com/ic2/") {
        metadataSources {
            mavenPom()
            artifact()
        }
    }, "net.industrial-craft")
}

dependencies {
    implementationSplit("com.falsepattern:falsepatternlib-mc1.7.10:1.4.2")
    implementation("net.industrial-craft:industrialcraft-2:2.2.828-experimental:dev")
    implementation("codechicken:notenoughitems-mc1.7.10:2.3.1-mega:dev")
    runtimeOnlyNonPublishable("codechicken:codechickencore-mc1.7.10:1.4.0-mega:dev")
    implementation(deobfModrinth("baubles-expanded:2.1.4"))
}