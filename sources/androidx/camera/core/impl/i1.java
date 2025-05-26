package androidx.camera.core.impl;

/* loaded from: classes2.dex */
public interface i1 extends d2 {

    /* renamed from: an, reason: collision with root package name */
    public static final c f16872an = new c(Integer.TYPE, null, "camerax.core.imageInput.inputFormat");

    /* renamed from: bn, reason: collision with root package name */
    public static final c f16873bn = new c(c0.z.class, null, "camerax.core.imageInput.inputDynamicRange");

    default int l() {
        return ((Integer) f(f16872an)).intValue();
    }

    default c0.z u() {
        c0.z zVar = (c0.z) j(f16873bn, c0.z.f24400c);
        zVar.getClass();
        return zVar;
    }
}
