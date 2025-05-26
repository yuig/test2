package androidx.camera.core.impl;

import android.util.Range;

/* loaded from: classes2.dex */
public interface z2 extends h0.k, i1 {

    /* renamed from: nn, reason: collision with root package name */
    public static final c f17016nn = new c(o2.class, null, "camerax.core.useCase.defaultSessionConfig");

    /* renamed from: on, reason: collision with root package name */
    public static final c f17017on = new c(s0.class, null, "camerax.core.useCase.defaultCaptureConfig");

    /* renamed from: pn, reason: collision with root package name */
    public static final c f17018pn = new c(l2.class, null, "camerax.core.useCase.sessionConfigUnpacker");

    /* renamed from: qn, reason: collision with root package name */
    public static final c f17019qn = new c(r0.class, null, "camerax.core.useCase.captureConfigUnpacker");

    /* renamed from: rn, reason: collision with root package name */
    public static final c f17020rn;

    /* renamed from: sn, reason: collision with root package name */
    public static final c f17021sn;

    /* renamed from: tn, reason: collision with root package name */
    public static final c f17022tn;

    /* renamed from: un, reason: collision with root package name */
    public static final c f17023un;

    /* renamed from: vn, reason: collision with root package name */
    public static final c f17024vn;

    /* renamed from: wn, reason: collision with root package name */
    public static final c f17025wn;

    /* renamed from: xn, reason: collision with root package name */
    public static final c f17026xn;

    static {
        Class cls = Integer.TYPE;
        f17020rn = new c(cls, null, "camerax.core.useCase.surfaceOccupancyPriority");
        f17021sn = new c(Range.class, null, "camerax.core.useCase.targetFrameRate");
        Class cls2 = Boolean.TYPE;
        f17022tn = new c(cls2, null, "camerax.core.useCase.zslDisabled");
        f17023un = new c(cls2, null, "camerax.core.useCase.highResolutionDisabled");
        f17024vn = new c(b3.class, null, "camerax.core.useCase.captureType");
        f17025wn = new c(cls, null, "camerax.core.useCase.previewStabilizationMode");
        f17026xn = new c(cls, null, "camerax.core.useCase.videoStabilizationMode");
    }

    default b3 A() {
        return (b3) f(f17024vn);
    }

    default int o() {
        return ((Integer) j(f17026xn, 0)).intValue();
    }

    default int r() {
        return ((Integer) j(f17025wn, 0)).intValue();
    }
}
