package p72;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: w, reason: collision with root package name */
    public static final a f99092w;

    /* renamed from: a, reason: collision with root package name */
    public final String f99093a;

    /* renamed from: b, reason: collision with root package name */
    public final String f99094b;

    /* renamed from: c, reason: collision with root package name */
    public final String f99095c;

    /* renamed from: d, reason: collision with root package name */
    public final String f99096d;

    /* renamed from: e, reason: collision with root package name */
    public final String f99097e;

    /* renamed from: f, reason: collision with root package name */
    public final String f99098f;

    /* renamed from: g, reason: collision with root package name */
    public final String f99099g;

    /* renamed from: h, reason: collision with root package name */
    public final String f99100h;

    /* renamed from: i, reason: collision with root package name */
    public final String f99101i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f99102j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f99103k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f99104l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f99105m;

    /* renamed from: n, reason: collision with root package name */
    public final int f99106n;

    /* renamed from: o, reason: collision with root package name */
    public final int f99107o;

    /* renamed from: p, reason: collision with root package name */
    public final int f99108p;

    /* renamed from: q, reason: collision with root package name */
    public final int f99109q;

    /* renamed from: r, reason: collision with root package name */
    public final String f99110r;

    /* renamed from: s, reason: collision with root package name */
    public final String f99111s;

    /* renamed from: t, reason: collision with root package name */
    public final String f99112t;

    /* renamed from: u, reason: collision with root package name */
    public final int f99113u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f99114v;

    static {
        int i13 = b.f99115a;
        Intrinsics.checkNotNullParameter("", "value");
        f99092w = new a("", "", "", "", "", "", "", "", "", false, false, false, false, 0, 0, 0, 0, "", null, null, 0, false);
    }

    public a(String id3, String username, String firstName, String str, String str2, String str3, String str4, String str5, String str6, boolean z13, boolean z14, boolean z15, boolean z16, int i13, int i14, int i15, int i16, String str7, String str8, String str9, int i17, boolean z17) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        this.f99093a = id3;
        this.f99094b = username;
        this.f99095c = firstName;
        this.f99096d = str;
        this.f99097e = str2;
        this.f99098f = str3;
        this.f99099g = str4;
        this.f99100h = str5;
        this.f99101i = str6;
        this.f99102j = z13;
        this.f99103k = z14;
        this.f99104l = z15;
        this.f99105m = z16;
        this.f99106n = i13;
        this.f99107o = i14;
        this.f99108p = i15;
        this.f99109q = i16;
        this.f99110r = str7;
        this.f99111s = str8;
        this.f99112t = str9;
        this.f99113u = i17;
        this.f99114v = z17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = aVar.f99093a;
        int i13 = b.f99115a;
        return Intrinsics.d(this.f99093a, str) && Intrinsics.d(this.f99094b, aVar.f99094b) && Intrinsics.d(this.f99095c, aVar.f99095c) && Intrinsics.d(this.f99096d, aVar.f99096d) && Intrinsics.d(this.f99097e, aVar.f99097e) && Intrinsics.d(this.f99098f, aVar.f99098f) && Intrinsics.d(this.f99099g, aVar.f99099g) && Intrinsics.d(this.f99100h, aVar.f99100h) && Intrinsics.d(this.f99101i, aVar.f99101i) && this.f99102j == aVar.f99102j && this.f99103k == aVar.f99103k && this.f99104l == aVar.f99104l && this.f99105m == aVar.f99105m && this.f99106n == aVar.f99106n && this.f99107o == aVar.f99107o && this.f99108p == aVar.f99108p && this.f99109q == aVar.f99109q && Intrinsics.d(this.f99110r, aVar.f99110r) && Intrinsics.d(this.f99111s, aVar.f99111s) && Intrinsics.d(this.f99112t, aVar.f99112t) && this.f99113u == aVar.f99113u && this.f99114v == aVar.f99114v;
    }

    public final int hashCode() {
        int i13 = b.f99115a;
        int d2 = cb.d(this.f99095c, cb.d(this.f99094b, this.f99093a.hashCode() * 31, 31), 31);
        String str = this.f99096d;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f99097e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f99098f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f99099g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f99100h;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f99101i;
        int b13 = ep.b.b(this.f99109q, ep.b.b(this.f99108p, ep.b.b(this.f99107o, ep.b.b(this.f99106n, ep.b.e(this.f99105m, ep.b.e(this.f99104l, ep.b.e(this.f99103k, ep.b.e(this.f99102j, (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        String str7 = this.f99110r;
        int hashCode6 = (b13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f99111s;
        int hashCode7 = (hashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f99112t;
        return Boolean.hashCode(this.f99114v) + ep.b.b(this.f99113u, (hashCode7 + (str9 != null ? str9.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        int i13 = b.f99115a;
        StringBuilder o13 = cb.o("User(id=", a.a.p(new StringBuilder("UserId(value="), this.f99093a, ")"), ", username=");
        o13.append(this.f99094b);
        o13.append(", firstName=");
        o13.append(this.f99095c);
        o13.append(", lastName=");
        o13.append(this.f99096d);
        o13.append(", fullName=");
        o13.append(this.f99097e);
        o13.append(", email=");
        o13.append(this.f99098f);
        o13.append(", imageMediumUrl=");
        o13.append(this.f99099g);
        o13.append(", imageLargeUrl=");
        o13.append(this.f99100h);
        o13.append(", imageXLargeUrl=");
        o13.append(this.f99101i);
        o13.append(", isEmployee=");
        o13.append(this.f99102j);
        o13.append(", shufflesFollowedByMe=");
        o13.append(this.f99103k);
        o13.append(", shufflesFollowingMe=");
        o13.append(this.f99104l);
        o13.append(", blockedByMe=");
        o13.append(this.f99105m);
        o13.append(", shufflesPublicCount=");
        o13.append(this.f99106n);
        o13.append(", shufflesCount=");
        o13.append(this.f99107o);
        o13.append(", followersCount=");
        o13.append(this.f99108p);
        o13.append(", followingCount=");
        o13.append(this.f99109q);
        o13.append(", about=");
        o13.append(this.f99110r);
        o13.append(", gender=");
        o13.append(this.f99111s);
        o13.append(", customGender=");
        o13.append(this.f99112t);
        o13.append(", ageInYears=");
        o13.append(this.f99113u);
        o13.append(", isShufflesPrivateProfile=");
        return a.a.r(o13, this.f99114v, ")");
    }
}
