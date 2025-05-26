package bk;

/* loaded from: classes.dex */
public final class q implements hn.d {

    /* renamed from: f, reason: collision with root package name */
    public static q f23104f;

    /* renamed from: a, reason: collision with root package name */
    public float f23105a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23106b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23107c;

    /* renamed from: d, reason: collision with root package name */
    public Object f23108d;

    /* renamed from: e, reason: collision with root package name */
    public Object f23109e;

    public q(com.google.android.gms.common.api.d dVar, com.facebook.login.z zVar) {
        this.f23106b = dVar;
        this.f23107c = zVar;
    }

    public static q b() {
        if (f23104f == null) {
            f23104f = new q(new com.google.android.gms.common.api.d(17), new com.facebook.login.z(17));
        }
        return f23104f;
    }

    @Override // hn.d
    public final void a(boolean z13) {
        if (z13) {
            ln.b.f83970g.getClass();
            ln.b.c();
        } else {
            ln.b.f83970g.getClass();
            ln.b.b();
        }
    }
}
