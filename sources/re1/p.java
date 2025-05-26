package re1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final n50.a f107623a;

    /* renamed from: b, reason: collision with root package name */
    public final String f107624b;

    /* renamed from: c, reason: collision with root package name */
    public final String f107625c;

    /* renamed from: d, reason: collision with root package name */
    public final q f107626d;

    /* renamed from: e, reason: collision with root package name */
    public final v f107627e;

    /* renamed from: f, reason: collision with root package name */
    public final e f107628f;

    /* renamed from: g, reason: collision with root package name */
    public final d f107629g;

    public p(e50.s headerDisplay, String str, q headerDimensionSpec, v subtitleStyleSpec) {
        Intrinsics.checkNotNullParameter(headerDisplay, "headerDisplay");
        Intrinsics.checkNotNullParameter(headerDimensionSpec, "headerDimensionSpec");
        Intrinsics.checkNotNullParameter(subtitleStyleSpec, "subtitleStyleSpec");
        this.f107623a = headerDisplay;
        this.f107624b = str;
        this.f107625c = null;
        this.f107626d = headerDimensionSpec;
        this.f107627e = subtitleStyleSpec;
        this.f107628f = null;
        this.f107629g = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f107623a, pVar.f107623a) && Intrinsics.d(this.f107624b, pVar.f107624b) && Intrinsics.d(this.f107625c, pVar.f107625c) && Intrinsics.d(this.f107626d, pVar.f107626d) && Intrinsics.d(this.f107627e, pVar.f107627e) && Intrinsics.d(this.f107628f, pVar.f107628f) && Intrinsics.d(this.f107629g, pVar.f107629g);
    }

    public final int hashCode() {
        int hashCode = this.f107623a.hashCode() * 31;
        String str = this.f107624b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f107625c;
        int hashCode3 = (this.f107627e.hashCode() + ((this.f107626d.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        e eVar = this.f107628f;
        int hashCode4 = (hashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        d dVar = this.f107629g;
        return hashCode4 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "GQLHeaderModel(headerDisplay=" + this.f107623a + ", title=" + this.f107624b + ", subtitle=" + this.f107625c + ", headerDimensionSpec=" + this.f107626d + ", subtitleStyleSpec=" + this.f107627e + ", action=" + this.f107628f + ", headerUserViewModel=" + this.f107629g + ")";
    }
}
