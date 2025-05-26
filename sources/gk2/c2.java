package gk2;

/* loaded from: classes2.dex */
public final class c2 extends uj2.h {

    /* renamed from: b, reason: collision with root package name */
    public final int f65363b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final int f65364c;

    public c2(int i13) {
        this.f65364c = 1 + i13;
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        boolean z13 = bVar instanceof dk2.a;
        int i13 = this.f65364c;
        int i14 = this.f65363b;
        if (z13) {
            bVar.d(new a2((dk2.a) bVar, i14, i13));
        } else {
            bVar.d(new b2(bVar, i14, i13));
        }
    }
}
