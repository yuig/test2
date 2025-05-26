package vt;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import lu.b0;

/* loaded from: classes3.dex */
public final class l extends r {

    /* renamed from: a, reason: collision with root package name */
    public final String f126602a;

    /* renamed from: b, reason: collision with root package name */
    public final String f126603b;

    /* renamed from: c, reason: collision with root package name */
    public final String f126604c;

    /* renamed from: d, reason: collision with root package name */
    public final String f126605d;

    /* renamed from: e, reason: collision with root package name */
    public final String f126606e;

    /* renamed from: f, reason: collision with root package name */
    public final String f126607f;

    /* renamed from: g, reason: collision with root package name */
    public final String f126608g;

    /* renamed from: h, reason: collision with root package name */
    public final int f126609h;

    /* renamed from: i, reason: collision with root package name */
    public final int f126610i;

    /* renamed from: j, reason: collision with root package name */
    public final bc2.q f126611j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f126612k;

    /* renamed from: l, reason: collision with root package name */
    public final b0 f126613l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f126614m;

    public l(String str, String str2, String str3, String str4, String str5, String str6, String promotedByString, int i13, int i14, bc2.q qVar, boolean z13, b0 bottomSheetState) {
        Intrinsics.checkNotNullParameter(promotedByString, "promotedByString");
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        this.f126602a = str;
        this.f126603b = str2;
        this.f126604c = str3;
        this.f126605d = str4;
        this.f126606e = str5;
        this.f126607f = str6;
        this.f126608g = promotedByString;
        this.f126609h = i13;
        this.f126610i = i14;
        this.f126611j = qVar;
        this.f126612k = z13;
        this.f126613l = bottomSheetState;
        this.f126614m = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f126602a, lVar.f126602a) && Intrinsics.d(this.f126603b, lVar.f126603b) && Intrinsics.d(this.f126604c, lVar.f126604c) && Intrinsics.d(this.f126605d, lVar.f126605d) && Intrinsics.d(this.f126606e, lVar.f126606e) && Intrinsics.d(this.f126607f, lVar.f126607f) && Intrinsics.d(this.f126608g, lVar.f126608g) && this.f126609h == lVar.f126609h && this.f126610i == lVar.f126610i && Intrinsics.d(this.f126611j, lVar.f126611j) && this.f126612k == lVar.f126612k && this.f126613l == lVar.f126613l && this.f126614m == lVar.f126614m;
    }

    public final int hashCode() {
        String str = this.f126602a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f126603b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f126604c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f126605d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f126606e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f126607f;
        int b13 = ep.b.b(this.f126610i, ep.b.b(this.f126609h, cb.d(this.f126608g, (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31), 31), 31);
        bc2.q qVar = this.f126611j;
        return Boolean.hashCode(this.f126614m) + ep.b.e(true, (this.f126613l.hashCode() + ep.b.e(this.f126612k, (b13 + (qVar != null ? qVar.hashCode() : 0)) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        return "ExpandedResults(pinId=" + this.f126602a + ", ctaText=" + this.f126603b + ", destinationUrl=" + this.f126604c + ", title=" + this.f126605d + ", description=" + this.f126606e + ", bitMapUrl=" + this.f126607f + ", promotedByString=" + this.f126608g + ", imageHeight=" + this.f126609h + ", imageWidth=" + this.f126610i + ", videoTracks=" + this.f126611j + ", userManuallyPaused=" + this.f126612k + ", bottomSheetState=" + this.f126613l + ", scrollingModuleInBackground=true, comingFromWebView=" + this.f126614m + ")";
    }
}
