package androidx.camera.core.impl;

import android.util.Size;
import java.util.List;

/* loaded from: classes2.dex */
public interface j1 extends d2 {

    /* renamed from: cn, reason: collision with root package name */
    public static final c f16880cn = new c(c0.d.class, null, "camerax.core.imageOutput.targetAspectRatio");

    /* renamed from: dn, reason: collision with root package name */
    public static final c f16881dn;

    /* renamed from: en, reason: collision with root package name */
    public static final c f16882en;

    /* renamed from: fn, reason: collision with root package name */
    public static final c f16883fn;

    /* renamed from: gn, reason: collision with root package name */
    public static final c f16884gn;

    /* renamed from: hn, reason: collision with root package name */
    public static final c f16885hn;

    /* renamed from: jn, reason: collision with root package name */
    public static final c f16886jn;

    /* renamed from: kn, reason: collision with root package name */
    public static final c f16887kn;

    /* renamed from: ln, reason: collision with root package name */
    public static final c f16888ln;

    /* renamed from: mn, reason: collision with root package name */
    public static final c f16889mn;

    static {
        Class cls = Integer.TYPE;
        f16881dn = new c(cls, null, "camerax.core.imageOutput.targetRotation");
        f16882en = new c(cls, null, "camerax.core.imageOutput.appTargetRotation");
        f16883fn = new c(cls, null, "camerax.core.imageOutput.mirrorMode");
        f16884gn = new c(Size.class, null, "camerax.core.imageOutput.targetResolution");
        f16885hn = new c(Size.class, null, "camerax.core.imageOutput.defaultResolution");
        f16886jn = new c(Size.class, null, "camerax.core.imageOutput.maxResolution");
        f16887kn = new c(List.class, null, "camerax.core.imageOutput.supportedResolutions");
        f16888ln = new c(o0.b.class, null, "camerax.core.imageOutput.resolutionSelector");
        f16889mn = new c(List.class, null, "camerax.core.imageOutput.customOrderedResolutions");
    }

    static void m(j1 j1Var) {
        boolean d2 = j1Var.d(f16880cn);
        boolean z13 = ((Size) j1Var.j(f16884gn, null)) != null;
        if (d2 && z13) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (((o0.b) j1Var.j(f16888ln, null)) != null) {
            if (d2 || z13) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default int n() {
        return ((Integer) j(f16881dn, 0)).intValue();
    }
}
