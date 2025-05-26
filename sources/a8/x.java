package a8;

import g8.a1;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a */
    public final w f1470a;

    /* renamed from: b */
    public final l8.w f1471b;

    /* renamed from: c */
    public final a1 f1472c;

    /* renamed from: d */
    public boolean f1473d;

    /* renamed from: e */
    public boolean f1474e;

    /* renamed from: f */
    public final /* synthetic */ z f1475f;

    public x(z zVar, c0 c0Var, int i13, d dVar) {
        this.f1475f = zVar;
        this.f1471b = new l8.w(a.a.d("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper ", i13));
        a1 a1Var = new a1(zVar.f1479a, null, null);
        this.f1472c = a1Var;
        this.f1470a = new w(zVar, c0Var, i13, a1Var, dVar);
        a1Var.f64191f = zVar.f1481c;
    }

    public final void c() {
        if (this.f1473d) {
            return;
        }
        this.f1470a.f1467b.f1320j = true;
        this.f1473d = true;
        z.z(this.f1475f);
    }

    public final void d() {
        this.f1471b.g(this.f1470a.f1467b, this.f1475f.f1481c, 0);
    }
}
