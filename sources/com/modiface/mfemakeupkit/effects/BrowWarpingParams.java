package com.modiface.mfemakeupkit.effects;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public class BrowWarpingParams implements Cloneable {
    public float outerAlign = 0.0f;
    public float outerVertAlign = 0.0f;
    public float innerAlign = 0.0f;
    public float innerVertAlign = 0.0f;
    public float localArchPull = 0.0f;
    public float localArchPullPointiness = 0.0f;
    public float globalArchPull = 0.0f;
    public float innerThickness = 0.0f;
    public float middleThickness = 0.0f;
    public float outerThickness = 0.0f;
    public float cleaningTop = 0.0f;
    public float cleaningBottom = 0.0f;
    public float cleaningInnerVertical = 0.0f;
    public float cleaningInnerRoundness = 0.0f;
    public float horizontalShift = 0.0f;
    public float verticalShift = 0.0f;

    @NonNull
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BrowWarpingParams m114clone() {
        BrowWarpingParams browWarpingParams = new BrowWarpingParams();
        browWarpingParams.outerAlign = this.outerAlign;
        browWarpingParams.outerVertAlign = this.outerVertAlign;
        browWarpingParams.innerAlign = this.innerAlign;
        browWarpingParams.innerVertAlign = this.innerVertAlign;
        browWarpingParams.localArchPull = this.localArchPull;
        browWarpingParams.localArchPullPointiness = this.localArchPullPointiness;
        browWarpingParams.globalArchPull = this.globalArchPull;
        browWarpingParams.innerThickness = this.innerThickness;
        browWarpingParams.middleThickness = this.middleThickness;
        browWarpingParams.outerThickness = this.outerThickness;
        browWarpingParams.cleaningTop = this.cleaningTop;
        browWarpingParams.cleaningBottom = this.cleaningBottom;
        browWarpingParams.cleaningInnerVertical = this.cleaningInnerVertical;
        browWarpingParams.cleaningInnerRoundness = this.cleaningInnerRoundness;
        browWarpingParams.horizontalShift = this.horizontalShift;
        browWarpingParams.verticalShift = this.verticalShift;
        return browWarpingParams;
    }
}
