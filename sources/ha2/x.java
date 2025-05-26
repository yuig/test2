package ha2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f68477a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f68478b;

    /* renamed from: c, reason: collision with root package name */
    public final String f68479c;

    /* renamed from: d, reason: collision with root package name */
    public final vn1.c f68480d;

    /* renamed from: e, reason: collision with root package name */
    public final vn1.g f68481e;

    public x(int i13, Integer num, String str, vn1.c cVar, vn1.g gVar, int i14) {
        num = (i14 & 2) != 0 ? null : num;
        str = (i14 & 4) != 0 ? null : str;
        cVar = (i14 & 8) != 0 ? null : cVar;
        gVar = (i14 & 16) != 0 ? null : gVar;
        this.f68477a = i13;
        this.f68478b = num;
        this.f68479c = str;
        this.f68480d = cVar;
        this.f68481e = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f68477a == xVar.f68477a && Intrinsics.d(this.f68478b, xVar.f68478b) && Intrinsics.d(this.f68479c, xVar.f68479c) && this.f68480d == xVar.f68480d && this.f68481e == xVar.f68481e;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f68477a) * 31;
        Integer num = this.f68478b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f68479c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        vn1.c cVar = this.f68480d;
        int hashCode4 = (hashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        vn1.g gVar = this.f68481e;
        return hashCode4 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        return "GroupLabel(titleRes=" + this.f68477a + ", titleContentDescriptionRes=" + this.f68478b + ", titleResVariableSubstitution=" + this.f68479c + ", titleColor=" + this.f68480d + ", titleVariant=" + this.f68481e + ")";
    }
}
