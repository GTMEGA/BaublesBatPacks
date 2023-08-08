package com.github.gtmega.baublesbatpacks.mixin.plugin;

import com.falsepattern.lib.mixin.IMixin;
import com.falsepattern.lib.mixin.IMixinPlugin;
import com.falsepattern.lib.mixin.ITargetedMod;
import com.github.gtmega.baublesbatpacks.Tags;
import lombok.Getter;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;

/**
 * The {@link IMixinConfigPlugin} implementation, delegating most of the logic to FalsePatternLib.
 */
public final class MixinPlugin implements IMixinPlugin {
    /**
     * Logger provided by FalsePatternLib.
     */
    @Getter
    private final Logger logger = IMixinPlugin.createLogger(Tags.MODNAME);

    /**
     * Invoked by FalsePattern Lib to decide what targeted mods to check for.
     *
     * @return targeted mods
     */
    @Override
    public ITargetedMod[] getTargetedModEnumValues() {
        return TargetedMod.values();
    }

    /**
     * Invoked by FalsePattern Lib to decide what mixins to load.
     *
     * @return mixins to load
     */
    @Override
    public IMixin[] getMixinEnumValues() {
        return Mixin.values();
    }
}
