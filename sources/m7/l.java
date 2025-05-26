package m7;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public l8.m f86243a;

    /* renamed from: b, reason: collision with root package name */
    public int f86244b = 50000;

    /* renamed from: c, reason: collision with root package name */
    public int f86245c = 50000;

    /* renamed from: d, reason: collision with root package name */
    public int f86246d = 1000;

    /* renamed from: e, reason: collision with root package name */
    public int f86247e = 2000;

    /* renamed from: f, reason: collision with root package name */
    public boolean f86248f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f86249g;

    public final n a() {
        bf.b.t(!this.f86249g);
        this.f86249g = true;
        if (this.f86243a == null) {
            this.f86243a = new l8.m(true);
        }
        return new n(this.f86243a, this.f86244b, this.f86245c, this.f86246d, this.f86247e, this.f86248f);
    }

    public final void b(l8.m mVar) {
        bf.b.t(!this.f86249g);
        this.f86243a = mVar;
    }

    public final void c(int i13) {
        bf.b.t(!this.f86249g);
        n.a("bufferForPlaybackMs", 500, 0, "0");
        n.a("bufferForPlaybackAfterRebufferMs", 1000, 0, "0");
        n.a("minBufferMs", 1000, 500, "bufferForPlaybackMs");
        n.a("minBufferMs", 1000, 1000, "bufferForPlaybackAfterRebufferMs");
        n.a("maxBufferMs", i13, 1000, "minBufferMs");
        this.f86244b = 1000;
        this.f86245c = i13;
        this.f86246d = 500;
        this.f86247e = 1000;
    }

    public final void d() {
        bf.b.t(!this.f86249g);
        this.f86248f = true;
    }
}
