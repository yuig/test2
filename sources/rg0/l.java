package rg0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f108048a;

    /* renamed from: b, reason: collision with root package name */
    public final vn1.c f108049b;

    /* renamed from: c, reason: collision with root package name */
    public final vn1.g f108050c;

    public l(String str, vn1.c cVar, vn1.g gVar) {
        this.f108048a = str;
        this.f108049b = cVar;
        this.f108050c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f108048a, lVar.f108048a) && this.f108049b == lVar.f108049b && this.f108050c == lVar.f108050c;
    }

    public final int hashCode() {
        String str = this.f108048a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        vn1.c cVar = this.f108049b;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        vn1.g gVar = this.f108050c;
        return hashCode2 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        return "Text(body=" + this.f108048a + ", color=" + this.f108049b + ", variant=" + this.f108050c + ")";
    }
}
