package gk2;

/* loaded from: classes2.dex */
public final class h3 extends uj2.h {

    /* renamed from: b, reason: collision with root package name */
    public final xp2.a[] f65452b;

    /* renamed from: c, reason: collision with root package name */
    public final ak2.f f65453c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65454d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f65455e = false;

    public h3(xp2.a[] aVarArr, ck2.a aVar, int i13) {
        this.f65452b = aVarArr;
        this.f65453c = aVar;
        this.f65454d = i13;
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        xp2.a[] aVarArr = this.f65452b;
        aVarArr.getClass();
        int length = aVarArr.length;
        if (length == 0) {
            ok2.d.complete(bVar);
            return;
        }
        f3 f3Var = new f3(length, this.f65454d, this.f65453c, bVar, this.f65455e);
        bVar.d(f3Var);
        g3[] g3VarArr = f3Var.f65409b;
        for (int i13 = 0; i13 < length && !f3Var.f65414g; i13++) {
            if (!f3Var.f65413f && f3Var.f65412e.get() != null) {
                return;
            }
            aVarArr[i13].b(g3VarArr[i13]);
        }
    }
}
