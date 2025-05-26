package gk2;

/* loaded from: classes2.dex */
public final class m1 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final int f65533c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f65534d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f65535e;

    /* renamed from: f, reason: collision with root package name */
    public final ak2.a f65536f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(fk2.d0 d0Var, int i13) {
        super(d0Var);
        ck2.c cVar = ck2.i.f27923c;
        this.f65533c = i13;
        this.f65534d = true;
        this.f65535e = false;
        this.f65536f = cVar;
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        this.f65321b.l(new l1(bVar, this.f65533c, this.f65534d, this.f65535e, this.f65536f));
    }
}
