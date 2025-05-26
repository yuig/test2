package gk2;

/* loaded from: classes4.dex */
public final class p0 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final ak2.f f65570c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f65571d;

    /* renamed from: e, reason: collision with root package name */
    public final int f65572e;

    public p0(k1 k1Var, androidx.appcompat.widget.q qVar) {
        super(k1Var);
        this.f65570c = qVar;
        this.f65571d = false;
        this.f65572e = Integer.MAX_VALUE;
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        this.f65321b.l(new o0(this.f65572e, this.f65570c, bVar, this.f65571d));
    }
}
