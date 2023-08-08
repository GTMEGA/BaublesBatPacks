package com.github.gtmega.baublesbatpacks.mixin.plugin;

import com.falsepattern.lib.mixin.ITargetedMod;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Predicate;

import static com.falsepattern.lib.mixin.ITargetedMod.PredicateHelpers.contains;
import static com.falsepattern.lib.mixin.ITargetedMod.PredicateHelpers.startsWith;

/**
 * List of targeted mods used for mixing loading logic.
 */
@Getter
@RequiredArgsConstructor
public enum TargetedMod implements ITargetedMod {
    IC2 ("IndustrialCraft 2", true, startsWith("industrialcraft-2")),
    ;

    private final String modName;
    private final boolean loadInDevelopment;
    private final Predicate<String> condition;
}
