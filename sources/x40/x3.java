package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x3 implements z40.b0, z40.p {

    /* renamed from: a, reason: collision with root package name */
    public final String f133655a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133656b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133657c;

    /* renamed from: d, reason: collision with root package name */
    public final String f133658d;

    /* renamed from: e, reason: collision with root package name */
    public final o3 f133659e;

    /* renamed from: f, reason: collision with root package name */
    public final w3 f133660f;

    /* renamed from: g, reason: collision with root package name */
    public final q3 f133661g;

    /* renamed from: h, reason: collision with root package name */
    public final String f133662h;

    /* renamed from: i, reason: collision with root package name */
    public final l3 f133663i;

    /* renamed from: j, reason: collision with root package name */
    public final u3 f133664j;

    /* renamed from: k, reason: collision with root package name */
    public final s3 f133665k;

    /* renamed from: l, reason: collision with root package name */
    public final n3 f133666l;

    /* renamed from: m, reason: collision with root package name */
    public final m3 f133667m;

    /* renamed from: n, reason: collision with root package name */
    public final String f133668n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f133669o;

    /* renamed from: p, reason: collision with root package name */
    public final String f133670p;

    /* renamed from: q, reason: collision with root package name */
    public final String f133671q;

    public x3(String __typename, String id3, String str, String entityId, o3 o3Var, w3 w3Var, q3 q3Var, String str2, l3 l3Var, u3 u3Var, s3 s3Var, n3 n3Var, m3 m3Var, String str3, Integer num, String str4, String str5) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133655a = __typename;
        this.f133656b = id3;
        this.f133657c = str;
        this.f133658d = entityId;
        this.f133659e = o3Var;
        this.f133660f = w3Var;
        this.f133661g = q3Var;
        this.f133662h = str2;
        this.f133663i = l3Var;
        this.f133664j = u3Var;
        this.f133665k = s3Var;
        this.f133666l = n3Var;
        this.f133667m = m3Var;
        this.f133668n = str3;
        this.f133669o = num;
        this.f133670p = str4;
        this.f133671q = str5;
    }

    @Override // z40.b0
    public final String a() {
        return this.f133658d;
    }

    @Override // z40.b0
    public final String b() {
        return this.f133670p;
    }

    @Override // z40.b0
    public final String c() {
        return this.f133668n;
    }

    @Override // z40.b0
    public final String e() {
        return this.f133671q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3)) {
            return false;
        }
        x3 x3Var = (x3) obj;
        return Intrinsics.d(this.f133655a, x3Var.f133655a) && Intrinsics.d(this.f133656b, x3Var.f133656b) && Intrinsics.d(this.f133657c, x3Var.f133657c) && Intrinsics.d(this.f133658d, x3Var.f133658d) && Intrinsics.d(this.f133659e, x3Var.f133659e) && Intrinsics.d(this.f133660f, x3Var.f133660f) && Intrinsics.d(this.f133661g, x3Var.f133661g) && Intrinsics.d(this.f133662h, x3Var.f133662h) && Intrinsics.d(this.f133663i, x3Var.f133663i) && Intrinsics.d(this.f133664j, x3Var.f133664j) && Intrinsics.d(this.f133665k, x3Var.f133665k) && Intrinsics.d(this.f133666l, x3Var.f133666l) && Intrinsics.d(this.f133667m, x3Var.f133667m) && Intrinsics.d(this.f133668n, x3Var.f133668n) && Intrinsics.d(this.f133669o, x3Var.f133669o) && Intrinsics.d(this.f133670p, x3Var.f133670p) && Intrinsics.d(this.f133671q, x3Var.f133671q);
    }

    @Override // z40.b0
    public final z40.z f() {
        return this.f133663i;
    }

    @Override // z40.b0
    public final z40.a0 g() {
        return this.f133666l;
    }

    @Override // z40.b0
    public final String getId() {
        return this.f133656b;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133656b, this.f133655a.hashCode() * 31, 31);
        String str = this.f133657c;
        int d13 = a.cb.d(this.f133658d, (d2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        o3 o3Var = this.f133659e;
        int hashCode = (d13 + (o3Var == null ? 0 : o3Var.f132922a.hashCode())) * 31;
        w3 w3Var = this.f133660f;
        int hashCode2 = (hashCode + (w3Var == null ? 0 : w3Var.hashCode())) * 31;
        q3 q3Var = this.f133661g;
        int hashCode3 = (hashCode2 + (q3Var == null ? 0 : q3Var.hashCode())) * 31;
        String str2 = this.f133662h;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        l3 l3Var = this.f133663i;
        int hashCode5 = (hashCode4 + (l3Var == null ? 0 : l3Var.hashCode())) * 31;
        u3 u3Var = this.f133664j;
        int hashCode6 = (hashCode5 + (u3Var == null ? 0 : u3Var.hashCode())) * 31;
        s3 s3Var = this.f133665k;
        int hashCode7 = (hashCode6 + (s3Var == null ? 0 : s3Var.hashCode())) * 31;
        n3 n3Var = this.f133666l;
        int hashCode8 = (hashCode7 + (n3Var == null ? 0 : n3Var.hashCode())) * 31;
        m3 m3Var = this.f133667m;
        int hashCode9 = (hashCode8 + (m3Var == null ? 0 : m3Var.hashCode())) * 31;
        String str3 = this.f133668n;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f133669o;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f133670p;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f133671q;
        return hashCode12 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Pin(__typename=");
        sb3.append(this.f133655a);
        sb3.append(", id=");
        sb3.append(this.f133656b);
        sb3.append(", title=");
        sb3.append(this.f133657c);
        sb3.append(", entityId=");
        sb3.append(this.f133658d);
        sb3.append(", pinnedToBoard=");
        sb3.append(this.f133659e);
        sb3.append(", storyPinData=");
        sb3.append(this.f133660f);
        sb3.append(", pinner=");
        sb3.append(this.f133661g);
        sb3.append(", storyPinDataId=");
        sb3.append(this.f133662h);
        sb3.append(", embed=");
        sb3.append(this.f133663i);
        sb3.append(", richSummary=");
        sb3.append(this.f133664j);
        sb3.append(", richMetadata=");
        sb3.append(this.f133665k);
        sb3.append(", imageMediumSizePixels=");
        sb3.append(this.f133666l);
        sb3.append(", imageLargeSizePixels=");
        sb3.append(this.f133667m);
        sb3.append(", imageSignature=");
        sb3.append(this.f133668n);
        sb3.append(", commentCount=");
        sb3.append(this.f133669o);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f133670p);
        sb3.append(", imageLargeUrl=");
        return a.a.p(sb3, this.f133671q, ")");
    }
}
