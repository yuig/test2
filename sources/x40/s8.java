package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s8 implements z40.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133242a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133243b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133244c;

    /* renamed from: d, reason: collision with root package name */
    public final String f133245d;

    /* renamed from: e, reason: collision with root package name */
    public final j8 f133246e;

    /* renamed from: f, reason: collision with root package name */
    public final r8 f133247f;

    /* renamed from: g, reason: collision with root package name */
    public final l8 f133248g;

    /* renamed from: h, reason: collision with root package name */
    public final String f133249h;

    /* renamed from: i, reason: collision with root package name */
    public final g8 f133250i;

    /* renamed from: j, reason: collision with root package name */
    public final p8 f133251j;

    /* renamed from: k, reason: collision with root package name */
    public final n8 f133252k;

    /* renamed from: l, reason: collision with root package name */
    public final i8 f133253l;

    /* renamed from: m, reason: collision with root package name */
    public final h8 f133254m;

    /* renamed from: n, reason: collision with root package name */
    public final String f133255n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f133256o;

    /* renamed from: p, reason: collision with root package name */
    public final String f133257p;

    /* renamed from: q, reason: collision with root package name */
    public final String f133258q;

    public s8(String __typename, String id3, String str, String entityId, j8 j8Var, r8 r8Var, l8 l8Var, String str2, g8 g8Var, p8 p8Var, n8 n8Var, i8 i8Var, h8 h8Var, String str3, Integer num, String str4, String str5) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133242a = __typename;
        this.f133243b = id3;
        this.f133244c = str;
        this.f133245d = entityId;
        this.f133246e = j8Var;
        this.f133247f = r8Var;
        this.f133248g = l8Var;
        this.f133249h = str2;
        this.f133250i = g8Var;
        this.f133251j = p8Var;
        this.f133252k = n8Var;
        this.f133253l = i8Var;
        this.f133254m = h8Var;
        this.f133255n = str3;
        this.f133256o = num;
        this.f133257p = str4;
        this.f133258q = str5;
    }

    @Override // z40.b0
    public final String a() {
        return this.f133245d;
    }

    @Override // z40.b0
    public final String b() {
        return this.f133257p;
    }

    @Override // z40.b0
    public final String c() {
        return this.f133255n;
    }

    @Override // z40.b0
    public final String e() {
        return this.f133258q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8)) {
            return false;
        }
        s8 s8Var = (s8) obj;
        return Intrinsics.d(this.f133242a, s8Var.f133242a) && Intrinsics.d(this.f133243b, s8Var.f133243b) && Intrinsics.d(this.f133244c, s8Var.f133244c) && Intrinsics.d(this.f133245d, s8Var.f133245d) && Intrinsics.d(this.f133246e, s8Var.f133246e) && Intrinsics.d(this.f133247f, s8Var.f133247f) && Intrinsics.d(this.f133248g, s8Var.f133248g) && Intrinsics.d(this.f133249h, s8Var.f133249h) && Intrinsics.d(this.f133250i, s8Var.f133250i) && Intrinsics.d(this.f133251j, s8Var.f133251j) && Intrinsics.d(this.f133252k, s8Var.f133252k) && Intrinsics.d(this.f133253l, s8Var.f133253l) && Intrinsics.d(this.f133254m, s8Var.f133254m) && Intrinsics.d(this.f133255n, s8Var.f133255n) && Intrinsics.d(this.f133256o, s8Var.f133256o) && Intrinsics.d(this.f133257p, s8Var.f133257p) && Intrinsics.d(this.f133258q, s8Var.f133258q);
    }

    @Override // z40.b0
    public final z40.z f() {
        return this.f133250i;
    }

    @Override // z40.b0
    public final z40.a0 g() {
        return this.f133253l;
    }

    @Override // z40.b0
    public final String getId() {
        return this.f133243b;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133243b, this.f133242a.hashCode() * 31, 31);
        String str = this.f133244c;
        int d13 = a.cb.d(this.f133245d, (d2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        j8 j8Var = this.f133246e;
        int hashCode = (d13 + (j8Var == null ? 0 : j8Var.f132595a.hashCode())) * 31;
        r8 r8Var = this.f133247f;
        int hashCode2 = (hashCode + (r8Var == null ? 0 : r8Var.hashCode())) * 31;
        l8 l8Var = this.f133248g;
        int hashCode3 = (hashCode2 + (l8Var == null ? 0 : l8Var.hashCode())) * 31;
        String str2 = this.f133249h;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        g8 g8Var = this.f133250i;
        int hashCode5 = (hashCode4 + (g8Var == null ? 0 : g8Var.hashCode())) * 31;
        p8 p8Var = this.f133251j;
        int hashCode6 = (hashCode5 + (p8Var == null ? 0 : p8Var.hashCode())) * 31;
        n8 n8Var = this.f133252k;
        int hashCode7 = (hashCode6 + (n8Var == null ? 0 : n8Var.hashCode())) * 31;
        i8 i8Var = this.f133253l;
        int hashCode8 = (hashCode7 + (i8Var == null ? 0 : i8Var.hashCode())) * 31;
        h8 h8Var = this.f133254m;
        int hashCode9 = (hashCode8 + (h8Var == null ? 0 : h8Var.hashCode())) * 31;
        String str3 = this.f133255n;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f133256o;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f133257p;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f133258q;
        return hashCode12 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Pin(__typename=");
        sb3.append(this.f133242a);
        sb3.append(", id=");
        sb3.append(this.f133243b);
        sb3.append(", title=");
        sb3.append(this.f133244c);
        sb3.append(", entityId=");
        sb3.append(this.f133245d);
        sb3.append(", pinnedToBoard=");
        sb3.append(this.f133246e);
        sb3.append(", storyPinData=");
        sb3.append(this.f133247f);
        sb3.append(", pinner=");
        sb3.append(this.f133248g);
        sb3.append(", storyPinDataId=");
        sb3.append(this.f133249h);
        sb3.append(", embed=");
        sb3.append(this.f133250i);
        sb3.append(", richSummary=");
        sb3.append(this.f133251j);
        sb3.append(", richMetadata=");
        sb3.append(this.f133252k);
        sb3.append(", imageMediumSizePixels=");
        sb3.append(this.f133253l);
        sb3.append(", imageLargeSizePixels=");
        sb3.append(this.f133254m);
        sb3.append(", imageSignature=");
        sb3.append(this.f133255n);
        sb3.append(", commentCount=");
        sb3.append(this.f133256o);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f133257p);
        sb3.append(", imageLargeUrl=");
        return a.a.p(sb3, this.f133258q, ")");
    }
}
