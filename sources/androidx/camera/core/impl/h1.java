package androidx.camera.core.impl;

/* loaded from: classes2.dex */
public final class h1 implements z2, j1, h0.g {

    /* renamed from: b, reason: collision with root package name */
    public static final c f16850b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f16851c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f16852d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f16853e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f16854f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f16855g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f16856h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f16857i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f16858j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f16859k;

    /* renamed from: l, reason: collision with root package name */
    public static final c f16860l;

    /* renamed from: a, reason: collision with root package name */
    public final v1 f16861a;

    static {
        Class cls = Integer.TYPE;
        f16850b = new c(cls, null, "camerax.core.imageCapture.captureMode");
        f16851c = new c(cls, null, "camerax.core.imageCapture.flashMode");
        f16852d = new c(c0.y.class, null, "camerax.core.imageCapture.captureBundle");
        f16853e = new c(Integer.class, null, "camerax.core.imageCapture.bufferFormat");
        f16854f = new c(Integer.class, null, "camerax.core.imageCapture.outputFormat");
        f16855g = new c(c0.o0.class, null, "camerax.core.imageCapture.imageReaderProxyProvider");
        f16856h = new c(Boolean.TYPE, null, "camerax.core.imageCapture.useSoftwareJpegEncoder");
        f16857i = new c(cls, null, "camerax.core.imageCapture.flashType");
        f16858j = new c(cls, null, "camerax.core.imageCapture.jpegCompressionQuality");
        f16859k = new c(c0.g0.class, null, "camerax.core.imageCapture.screenFlash");
        f16860l = new c(Boolean.class, null, "camerax.core.useCase.isPostviewEnabled");
    }

    public h1(v1 v1Var) {
        this.f16861a = v1Var;
    }

    @Override // androidx.camera.core.impl.d2
    public final v0 getConfig() {
        return this.f16861a;
    }

    @Override // androidx.camera.core.impl.i1
    public final int l() {
        return ((Integer) f(i1.f16872an)).intValue();
    }
}
