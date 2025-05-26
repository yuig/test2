package r3;

import jk.r;

/* loaded from: classes2.dex */
public final class a extends ig1.b {

    /* renamed from: b, reason: collision with root package name */
    public g f106068b;

    public a(g gVar) {
        this.f106068b = gVar;
    }

    @Override // ig1.b
    public final Object J(i iVar) {
        if (iVar == this.f106068b.getKey()) {
            return this.f106068b.getValue();
        }
        r.y("Check failed.");
        throw null;
    }

    public final void s1(g gVar) {
        this.f106068b = gVar;
    }

    @Override // ig1.b
    public final boolean u(c cVar) {
        return cVar == this.f106068b.getKey();
    }
}
