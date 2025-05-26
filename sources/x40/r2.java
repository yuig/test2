package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r2 implements z40.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133132a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133133b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133134c;

    /* renamed from: d, reason: collision with root package name */
    public final String f133135d;

    /* renamed from: e, reason: collision with root package name */
    public final i2 f133136e;

    /* renamed from: f, reason: collision with root package name */
    public final q2 f133137f;

    /* renamed from: g, reason: collision with root package name */
    public final k2 f133138g;

    /* renamed from: h, reason: collision with root package name */
    public final String f133139h;

    /* renamed from: i, reason: collision with root package name */
    public final f2 f133140i;

    /* renamed from: j, reason: collision with root package name */
    public final o2 f133141j;

    /* renamed from: k, reason: collision with root package name */
    public final m2 f133142k;

    /* renamed from: l, reason: collision with root package name */
    public final h2 f133143l;

    /* renamed from: m, reason: collision with root package name */
    public final g2 f133144m;

    /* renamed from: n, reason: collision with root package name */
    public final String f133145n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f133146o;

    /* renamed from: p, reason: collision with root package name */
    public final String f133147p;

    /* renamed from: q, reason: collision with root package name */
    public final String f133148q;

    public r2(String __typename, String id3, String str, String entityId, i2 i2Var, q2 q2Var, k2 k2Var, String str2, f2 f2Var, o2 o2Var, m2 m2Var, h2 h2Var, g2 g2Var, String str3, Integer num, String str4, String str5) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133132a = __typename;
        this.f133133b = id3;
        this.f133134c = str;
        this.f133135d = entityId;
        this.f133136e = i2Var;
        this.f133137f = q2Var;
        this.f133138g = k2Var;
        this.f133139h = str2;
        this.f133140i = f2Var;
        this.f133141j = o2Var;
        this.f133142k = m2Var;
        this.f133143l = h2Var;
        this.f133144m = g2Var;
        this.f133145n = str3;
        this.f133146o = num;
        this.f133147p = str4;
        this.f133148q = str5;
    }

    @Override // z40.b0
    public final String a() {
        return this.f133135d;
    }

    @Override // z40.b0
    public final String b() {
        return this.f133147p;
    }

    @Override // z40.b0
    public final String c() {
        return this.f133145n;
    }

    @Override // z40.b0
    public final String e() {
        return this.f133148q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return Intrinsics.d(this.f133132a, r2Var.f133132a) && Intrinsics.d(this.f133133b, r2Var.f133133b) && Intrinsics.d(this.f133134c, r2Var.f133134c) && Intrinsics.d(this.f133135d, r2Var.f133135d) && Intrinsics.d(this.f133136e, r2Var.f133136e) && Intrinsics.d(this.f133137f, r2Var.f133137f) && Intrinsics.d(this.f133138g, r2Var.f133138g) && Intrinsics.d(this.f133139h, r2Var.f133139h) && Intrinsics.d(this.f133140i, r2Var.f133140i) && Intrinsics.d(this.f133141j, r2Var.f133141j) && Intrinsics.d(this.f133142k, r2Var.f133142k) && Intrinsics.d(this.f133143l, r2Var.f133143l) && Intrinsics.d(this.f133144m, r2Var.f133144m) && Intrinsics.d(this.f133145n, r2Var.f133145n) && Intrinsics.d(this.f133146o, r2Var.f133146o) && Intrinsics.d(this.f133147p, r2Var.f133147p) && Intrinsics.d(this.f133148q, r2Var.f133148q);
    }

    @Override // z40.b0
    public final z40.z f() {
        return this.f133140i;
    }

    @Override // z40.b0
    public final z40.a0 g() {
        return this.f133143l;
    }

    @Override // z40.b0
    public final String getId() {
        return this.f133133b;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133133b, this.f133132a.hashCode() * 31, 31);
        String str = this.f133134c;
        int d13 = a.cb.d(this.f133135d, (d2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        i2 i2Var = this.f133136e;
        int hashCode = (d13 + (i2Var == null ? 0 : i2Var.f132517a.hashCode())) * 31;
        q2 q2Var = this.f133137f;
        int hashCode2 = (hashCode + (q2Var == null ? 0 : q2Var.hashCode())) * 31;
        k2 k2Var = this.f133138g;
        int hashCode3 = (hashCode2 + (k2Var == null ? 0 : k2Var.hashCode())) * 31;
        String str2 = this.f133139h;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        f2 f2Var = this.f133140i;
        int hashCode5 = (hashCode4 + (f2Var == null ? 0 : f2Var.hashCode())) * 31;
        o2 o2Var = this.f133141j;
        int hashCode6 = (hashCode5 + (o2Var == null ? 0 : o2Var.hashCode())) * 31;
        m2 m2Var = this.f133142k;
        int hashCode7 = (hashCode6 + (m2Var == null ? 0 : m2Var.hashCode())) * 31;
        h2 h2Var = this.f133143l;
        int hashCode8 = (hashCode7 + (h2Var == null ? 0 : h2Var.hashCode())) * 31;
        g2 g2Var = this.f133144m;
        int hashCode9 = (hashCode8 + (g2Var == null ? 0 : g2Var.hashCode())) * 31;
        String str3 = this.f133145n;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f133146o;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f133147p;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f133148q;
        return hashCode12 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Pin(__typename=");
        sb3.append(this.f133132a);
        sb3.append(", id=");
        sb3.append(this.f133133b);
        sb3.append(", title=");
        sb3.append(this.f133134c);
        sb3.append(", entityId=");
        sb3.append(this.f133135d);
        sb3.append(", pinnedToBoard=");
        sb3.append(this.f133136e);
        sb3.append(", storyPinData=");
        sb3.append(this.f133137f);
        sb3.append(", pinner=");
        sb3.append(this.f133138g);
        sb3.append(", storyPinDataId=");
        sb3.append(this.f133139h);
        sb3.append(", embed=");
        sb3.append(this.f133140i);
        sb3.append(", richSummary=");
        sb3.append(this.f133141j);
        sb3.append(", richMetadata=");
        sb3.append(this.f133142k);
        sb3.append(", imageMediumSizePixels=");
        sb3.append(this.f133143l);
        sb3.append(", imageLargeSizePixels=");
        sb3.append(this.f133144m);
        sb3.append(", imageSignature=");
        sb3.append(this.f133145n);
        sb3.append(", commentCount=");
        sb3.append(this.f133146o);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f133147p);
        sb3.append(", imageLargeUrl=");
        return a.a.p(sb3, this.f133148q, ")");
    }
}
