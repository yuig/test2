package k8;

import a7.c1;

/* loaded from: classes3.dex */
public final class g extends o implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final int f78526e;

    /* renamed from: f, reason: collision with root package name */
    public final int f78527f;

    public g(int i13, c1 c1Var, int i14, j jVar, int i15) {
        super(i13, i14, c1Var);
        this.f78526e = m7.h.p(i15, jVar.R) ? 1 : 0;
        this.f78527f = this.f78545d.b();
    }

    @Override // k8.o
    public final int a() {
        return this.f78526e;
    }

    @Override // k8.o
    public final /* bridge */ /* synthetic */ boolean b(o oVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f78527f, ((g) obj).f78527f);
    }
}
