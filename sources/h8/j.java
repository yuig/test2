package h8;

import g8.a1;
import g8.b1;
import g8.h0;

/* loaded from: classes.dex */
public final class j implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final l f68032a;

    /* renamed from: b, reason: collision with root package name */
    public final a1 f68033b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68034c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f68035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f68036e;

    public j(l lVar, l lVar2, a1 a1Var, int i13) {
        this.f68036e = lVar;
        this.f68032a = lVar2;
        this.f68033b = a1Var;
        this.f68034c = i13;
    }

    public final void a() {
        if (this.f68035d) {
            return;
        }
        l lVar = this.f68036e;
        h0 h0Var = lVar.f68043g;
        int[] iArr = lVar.f68038b;
        int i13 = this.f68034c;
        h0Var.b(iArr[i13], lVar.f68039c[i13], 0, null, lVar.f68056t);
        this.f68035d = true;
    }

    @Override // g8.b1
    public final void b() {
    }

    public final void c() {
        l lVar = this.f68036e;
        boolean[] zArr = lVar.f68040d;
        int i13 = this.f68034c;
        bf.b.t(zArr[i13]);
        lVar.f68040d[i13] = false;
    }

    @Override // g8.b1
    public final int i(qq2.c cVar, k7.e eVar, int i13) {
        l lVar = this.f68036e;
        if (lVar.A()) {
            return -3;
        }
        a aVar = lVar.f68058v;
        a1 a1Var = this.f68033b;
        if (aVar != null && aVar.c(this.f68034c + 1) <= a1Var.r()) {
            return -3;
        }
        a();
        return a1Var.C(cVar, eVar, i13, lVar.f68061y);
    }

    @Override // g8.b1
    public final boolean j() {
        l lVar = this.f68036e;
        return !lVar.A() && this.f68033b.x(lVar.f68061y);
    }

    @Override // g8.b1
    public final int o(long j13) {
        l lVar = this.f68036e;
        if (lVar.A()) {
            return 0;
        }
        boolean z13 = lVar.f68061y;
        a1 a1Var = this.f68033b;
        int t13 = a1Var.t(j13, z13);
        a aVar = lVar.f68058v;
        if (aVar != null) {
            t13 = Math.min(t13, aVar.c(this.f68034c + 1) - a1Var.r());
        }
        a1Var.H(t13);
        if (t13 > 0) {
            a();
        }
        return t13;
    }
}
