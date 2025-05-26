package qo2;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v extends y0 {

    /* renamed from: l, reason: collision with root package name */
    public final oo2.m f104636l;

    /* renamed from: m, reason: collision with root package name */
    public final xk2.v f104637m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(String name, int i13) {
        super(name, null, i13);
        Intrinsics.checkNotNullParameter(name, "name");
        this.f104636l = oo2.m.f96902a;
        this.f104637m = xk2.m.b(new mu0.i(i13, name, this));
    }

    @Override // qo2.y0, oo2.g
    public final oo2.n c() {
        return this.f104636l;
    }

    @Override // qo2.y0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof oo2.g)) {
            return false;
        }
        oo2.g gVar = (oo2.g) obj;
        if (gVar.c() != oo2.m.f96902a) {
            return false;
        }
        return Intrinsics.d(this.f104656a, gVar.i()) && Intrinsics.d(w0.a(this), w0.a(gVar));
    }

    @Override // qo2.y0, oo2.g
    public final oo2.g h(int i13) {
        return ((oo2.g[]) this.f104637m.getValue())[i13];
    }

    @Override // qo2.y0
    public final int hashCode() {
        int hashCode = this.f104656a.hashCode();
        Intrinsics.checkNotNullParameter(this, "<this>");
        int i13 = 1;
        oo2.i iVar = new oo2.i(this, 1);
        while (iVar.hasNext()) {
            int i14 = i13 * 31;
            String str = (String) iVar.next();
            i13 = i14 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i13;
    }

    @Override // qo2.y0
    public final String toString() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        return CollectionsKt.Z(new oo2.j(this, 1), ", ", ep.b.k(new StringBuilder(), this.f104656a, '('), ")", 0, null, null, 56);
    }
}
