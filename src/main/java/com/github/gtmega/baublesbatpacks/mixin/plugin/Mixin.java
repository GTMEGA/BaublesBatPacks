package com.github.gtmega.baublesbatpacks.mixin.plugin;

import com.falsepattern.lib.mixin.IMixin;
import com.falsepattern.lib.mixin.ITargetedMod;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.function.Predicate;

import static com.falsepattern.lib.mixin.IMixin.PredicateHelpers.require;
import static com.falsepattern.lib.mixin.IMixin.Side.COMMON;
import static com.github.gtmega.baublesbatpacks.mixin.plugin.TargetedMod.IC2;

@Getter
@RequiredArgsConstructor
public enum Mixin implements IMixin {
    // @formatter:off
    IC2_CHARGE_PAD_MIXIN(COMMON, require(IC2), "ic2.ChargePadMixin"),
    // @formatter:on
    ;

    private final Side side;
    private final Predicate<List<ITargetedMod>> filter;
    private final String mixin;
}
