package com.modiface.mfemakeupkit.data;

/* loaded from: classes7.dex */
public class MFEMakeupRenderingParameters {
    public final boolean applyFaceChartEffect;
    public final boolean showDebugPoints;

    public MFEMakeupRenderingParameters(boolean z13, boolean z14) {
        this.showDebugPoints = z13;
        this.applyFaceChartEffect = z14;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public MFEMakeupRenderingParameters m110clone() {
        return new MFEMakeupRenderingParameters(this.showDebugPoints, this.applyFaceChartEffect);
    }

    public MFEMakeupRenderingParameters(boolean z13) {
        this(z13, false);
    }
}
