package jz;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f77732a;

    /* renamed from: b, reason: collision with root package name */
    public final String f77733b;

    /* renamed from: c, reason: collision with root package name */
    public final d f77734c;

    public a(String str, String str2, d dVar) {
        this.f77732a = str;
        this.f77733b = str2;
        this.f77734c = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f77732a, aVar.f77732a) && Intrinsics.d(this.f77733b, aVar.f77733b) && Intrinsics.d(this.f77734c, aVar.f77734c);
    }

    public final int hashCode() {
        String str = this.f77732a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f77733b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        d dVar = this.f77734c;
        return hashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "Inline(uid=" + this.f77732a + ", title=" + this.f77733b + ", question=" + this.f77734c + ")";
    }
}
