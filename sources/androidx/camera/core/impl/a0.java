package androidx.camera.core.impl;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;

/* loaded from: classes2.dex */
public interface a0 extends d2 {
    public static final c Um = new c(c3.class, null, "camerax.core.camera.useCaseConfigFactory");
    public static final c Vm = new c(Integer.class, null, "camerax.core.camera.useCaseCombinationRequiredRule");
    public static final c Wm = new c(p2.class, null, "camerax.core.camera.SessionProcessor");
    public static final c Xm = new c(Boolean.class, null, "camerax.core.camera.isPostviewSupported");
    public static final c Ym = new c(Boolean.class, null, "camerax.core.camera.isCaptureProcessProgressSupported");

    default void p() {
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(j(Wm, null));
    }
}
