package androidx.lifecycle;

/* loaded from: classes3.dex */
public final class i0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f18645a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f18646b;

    /* renamed from: c, reason: collision with root package name */
    public int f18647c = -1;

    public i0(h0 h0Var, m0 m0Var) {
        this.f18645a = h0Var;
        this.f18646b = m0Var;
    }

    @Override // androidx.lifecycle.m0
    public final void a(Object obj) {
        int i13 = this.f18647c;
        int i14 = this.f18645a.f18637g;
        if (i13 != i14) {
            this.f18647c = i14;
            this.f18646b.a(obj);
        }
    }
}
