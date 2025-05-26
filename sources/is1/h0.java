package is1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f73596a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f73597b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f73598c;

    /* renamed from: d, reason: collision with root package name */
    public final String f73599d;

    /* renamed from: e, reason: collision with root package name */
    public final String f73600e;

    /* renamed from: f, reason: collision with root package name */
    public final t10.g f73601f;

    public h0(String pinId, boolean z13, boolean z14, String str, String str2, t10.g gVar) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f73596a = pinId;
        this.f73597b = z13;
        this.f73598c = z14;
        this.f73599d = str;
        this.f73600e = str2;
        this.f73601f = gVar;
    }

    public static h0 a(h0 h0Var, boolean z13, boolean z14, int i13) {
        if ((i13 & 2) != 0) {
            z13 = h0Var.f73597b;
        }
        boolean z15 = z13;
        if ((i13 & 4) != 0) {
            z14 = h0Var.f73598c;
        }
        String pinId = h0Var.f73596a;
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        return new h0(pinId, z15, z14, h0Var.f73599d, h0Var.f73600e, h0Var.f73601f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Intrinsics.d(this.f73596a, h0Var.f73596a) && this.f73597b == h0Var.f73597b && this.f73598c == h0Var.f73598c && Intrinsics.d(this.f73599d, h0Var.f73599d) && Intrinsics.d(this.f73600e, h0Var.f73600e) && Intrinsics.d(this.f73601f, h0Var.f73601f);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f73598c, ep.b.e(this.f73597b, this.f73596a.hashCode() * 31, 31), 31);
        String str = this.f73599d;
        int hashCode = (e13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f73600e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        t10.g gVar = this.f73601f;
        return hashCode2 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        return "TranslationsState(pinId=" + this.f73596a + ", showTranslations=" + this.f73597b + ", showRichTranslations=" + this.f73598c + ", translatedTitle=" + this.f73599d + ", translatedDescription=" + this.f73600e + ", translatedRichRecipe=" + this.f73601f + ")";
    }
}
