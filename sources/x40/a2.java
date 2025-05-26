package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a2 implements z40.b0, z40.p {

    /* renamed from: a, reason: collision with root package name */
    public final String f131895a;

    /* renamed from: b, reason: collision with root package name */
    public final String f131896b;

    /* renamed from: c, reason: collision with root package name */
    public final String f131897c;

    /* renamed from: d, reason: collision with root package name */
    public final String f131898d;

    /* renamed from: e, reason: collision with root package name */
    public final r1 f131899e;

    /* renamed from: f, reason: collision with root package name */
    public final z1 f131900f;

    /* renamed from: g, reason: collision with root package name */
    public final t1 f131901g;

    /* renamed from: h, reason: collision with root package name */
    public final String f131902h;

    /* renamed from: i, reason: collision with root package name */
    public final o1 f131903i;

    /* renamed from: j, reason: collision with root package name */
    public final x1 f131904j;

    /* renamed from: k, reason: collision with root package name */
    public final v1 f131905k;

    /* renamed from: l, reason: collision with root package name */
    public final q1 f131906l;

    /* renamed from: m, reason: collision with root package name */
    public final p1 f131907m;

    /* renamed from: n, reason: collision with root package name */
    public final String f131908n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f131909o;

    /* renamed from: p, reason: collision with root package name */
    public final String f131910p;

    /* renamed from: q, reason: collision with root package name */
    public final String f131911q;

    public a2(String __typename, String id3, String str, String entityId, r1 r1Var, z1 z1Var, t1 t1Var, String str2, o1 o1Var, x1 x1Var, v1 v1Var, q1 q1Var, p1 p1Var, String str3, Integer num, String str4, String str5) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f131895a = __typename;
        this.f131896b = id3;
        this.f131897c = str;
        this.f131898d = entityId;
        this.f131899e = r1Var;
        this.f131900f = z1Var;
        this.f131901g = t1Var;
        this.f131902h = str2;
        this.f131903i = o1Var;
        this.f131904j = x1Var;
        this.f131905k = v1Var;
        this.f131906l = q1Var;
        this.f131907m = p1Var;
        this.f131908n = str3;
        this.f131909o = num;
        this.f131910p = str4;
        this.f131911q = str5;
    }

    @Override // z40.b0
    public final String a() {
        return this.f131898d;
    }

    @Override // z40.b0
    public final String b() {
        return this.f131910p;
    }

    @Override // z40.b0
    public final String c() {
        return this.f131908n;
    }

    @Override // z40.b0
    public final String e() {
        return this.f131911q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return Intrinsics.d(this.f131895a, a2Var.f131895a) && Intrinsics.d(this.f131896b, a2Var.f131896b) && Intrinsics.d(this.f131897c, a2Var.f131897c) && Intrinsics.d(this.f131898d, a2Var.f131898d) && Intrinsics.d(this.f131899e, a2Var.f131899e) && Intrinsics.d(this.f131900f, a2Var.f131900f) && Intrinsics.d(this.f131901g, a2Var.f131901g) && Intrinsics.d(this.f131902h, a2Var.f131902h) && Intrinsics.d(this.f131903i, a2Var.f131903i) && Intrinsics.d(this.f131904j, a2Var.f131904j) && Intrinsics.d(this.f131905k, a2Var.f131905k) && Intrinsics.d(this.f131906l, a2Var.f131906l) && Intrinsics.d(this.f131907m, a2Var.f131907m) && Intrinsics.d(this.f131908n, a2Var.f131908n) && Intrinsics.d(this.f131909o, a2Var.f131909o) && Intrinsics.d(this.f131910p, a2Var.f131910p) && Intrinsics.d(this.f131911q, a2Var.f131911q);
    }

    @Override // z40.b0
    public final z40.z f() {
        return this.f131903i;
    }

    @Override // z40.b0
    public final z40.a0 g() {
        return this.f131906l;
    }

    @Override // z40.b0
    public final String getId() {
        return this.f131896b;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f131896b, this.f131895a.hashCode() * 31, 31);
        String str = this.f131897c;
        int d13 = a.cb.d(this.f131898d, (d2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        r1 r1Var = this.f131899e;
        int hashCode = (d13 + (r1Var == null ? 0 : r1Var.f133131a.hashCode())) * 31;
        z1 z1Var = this.f131900f;
        int hashCode2 = (hashCode + (z1Var == null ? 0 : z1Var.hashCode())) * 31;
        t1 t1Var = this.f131901g;
        int hashCode3 = (hashCode2 + (t1Var == null ? 0 : t1Var.hashCode())) * 31;
        String str2 = this.f131902h;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        o1 o1Var = this.f131903i;
        int hashCode5 = (hashCode4 + (o1Var == null ? 0 : o1Var.hashCode())) * 31;
        x1 x1Var = this.f131904j;
        int hashCode6 = (hashCode5 + (x1Var == null ? 0 : x1Var.hashCode())) * 31;
        v1 v1Var = this.f131905k;
        int hashCode7 = (hashCode6 + (v1Var == null ? 0 : v1Var.hashCode())) * 31;
        q1 q1Var = this.f131906l;
        int hashCode8 = (hashCode7 + (q1Var == null ? 0 : q1Var.hashCode())) * 31;
        p1 p1Var = this.f131907m;
        int hashCode9 = (hashCode8 + (p1Var == null ? 0 : p1Var.hashCode())) * 31;
        String str3 = this.f131908n;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f131909o;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f131910p;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f131911q;
        return hashCode12 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Pin(__typename=");
        sb3.append(this.f131895a);
        sb3.append(", id=");
        sb3.append(this.f131896b);
        sb3.append(", title=");
        sb3.append(this.f131897c);
        sb3.append(", entityId=");
        sb3.append(this.f131898d);
        sb3.append(", pinnedToBoard=");
        sb3.append(this.f131899e);
        sb3.append(", storyPinData=");
        sb3.append(this.f131900f);
        sb3.append(", pinner=");
        sb3.append(this.f131901g);
        sb3.append(", storyPinDataId=");
        sb3.append(this.f131902h);
        sb3.append(", embed=");
        sb3.append(this.f131903i);
        sb3.append(", richSummary=");
        sb3.append(this.f131904j);
        sb3.append(", richMetadata=");
        sb3.append(this.f131905k);
        sb3.append(", imageMediumSizePixels=");
        sb3.append(this.f131906l);
        sb3.append(", imageLargeSizePixels=");
        sb3.append(this.f131907m);
        sb3.append(", imageSignature=");
        sb3.append(this.f131908n);
        sb3.append(", commentCount=");
        sb3.append(this.f131909o);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f131910p);
        sb3.append(", imageLargeUrl=");
        return a.a.p(sb3, this.f131911q, ")");
    }
}
