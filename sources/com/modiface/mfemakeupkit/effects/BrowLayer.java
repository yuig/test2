package com.modiface.mfemakeupkit.effects;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public class BrowLayer extends MFEMakeupLayer implements Cloneable {
    public OverlayStyle overlayStyle = OverlayStyle.Custom;
    public FillOverlayStyle fillOverlayStyle = FillOverlayStyle.Custom;
    public BrowWarpingParams warpingParams = null;
    public BrowOverlayParams overlayParams = null;
    public BrowColoringParams coloringParams = null;
    public BrowOverlayParams fillOverlayParams = null;
    public float powderIntensity = 0.0f;

    public enum FillOverlayStyle {
        Custom,
        Overlay,
        OverlayOmbre,
        FeatherFill,
        PreciselyFill,
        FillFeatherV1,
        FillFeatherV2,
        Xtrabrow,
        XXtrabrow,
        XXXtrabrow,
        Xtrabrow2,
        XXtrabrow2,
        XXXtrabrow2,
        Microblade,
        XXXtrabrow3,
        XXXtrabrow4,
        XXXtrabrowNewmask1,
        XXXtrabrowNewmask2,
        XXXtrabrowNewmask3
    }

    public enum OverlayStyle {
        Custom,
        Overlay
    }

    public boolean hasPowder() {
        return this.powderIntensity > 0.001f;
    }

    @Override // com.modiface.mfemakeupkit.effects.MFEMakeupLayer
    @NonNull
    /* renamed from: clone */
    public BrowLayer mo112clone() {
        BrowLayer browLayer = new BrowLayer();
        copyBasePropertiesToOther(browLayer);
        browLayer.overlayStyle = this.overlayStyle;
        browLayer.fillOverlayStyle = this.fillOverlayStyle;
        BrowWarpingParams browWarpingParams = this.warpingParams;
        browLayer.warpingParams = browWarpingParams == null ? null : browWarpingParams.m114clone();
        BrowOverlayParams browOverlayParams = this.overlayParams;
        browLayer.overlayParams = browOverlayParams == null ? null : browOverlayParams.m113clone();
        BrowColoringParams browColoringParams = this.coloringParams;
        browLayer.coloringParams = browColoringParams == null ? null : browColoringParams.m111clone();
        BrowOverlayParams browOverlayParams2 = this.fillOverlayParams;
        browLayer.fillOverlayParams = browOverlayParams2 != null ? browOverlayParams2.m113clone() : null;
        browLayer.powderIntensity = this.powderIntensity;
        return browLayer;
    }
}
