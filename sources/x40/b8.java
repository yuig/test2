package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b8 implements z40.b0, z40.p {

    /* renamed from: a, reason: collision with root package name */
    public final String f132019a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132020b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132021c;

    /* renamed from: d, reason: collision with root package name */
    public final String f132022d;

    /* renamed from: e, reason: collision with root package name */
    public final s7 f132023e;

    /* renamed from: f, reason: collision with root package name */
    public final a8 f132024f;

    /* renamed from: g, reason: collision with root package name */
    public final u7 f132025g;

    /* renamed from: h, reason: collision with root package name */
    public final String f132026h;

    /* renamed from: i, reason: collision with root package name */
    public final p7 f132027i;

    /* renamed from: j, reason: collision with root package name */
    public final y7 f132028j;

    /* renamed from: k, reason: collision with root package name */
    public final w7 f132029k;

    /* renamed from: l, reason: collision with root package name */
    public final r7 f132030l;

    /* renamed from: m, reason: collision with root package name */
    public final q7 f132031m;

    /* renamed from: n, reason: collision with root package name */
    public final String f132032n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f132033o;

    /* renamed from: p, reason: collision with root package name */
    public final String f132034p;

    /* renamed from: q, reason: collision with root package name */
    public final String f132035q;

    public b8(String __typename, String id3, String str, String entityId, s7 s7Var, a8 a8Var, u7 u7Var, String str2, p7 p7Var, y7 y7Var, w7 w7Var, r7 r7Var, q7 q7Var, String str3, Integer num, String str4, String str5) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132019a = __typename;
        this.f132020b = id3;
        this.f132021c = str;
        this.f132022d = entityId;
        this.f132023e = s7Var;
        this.f132024f = a8Var;
        this.f132025g = u7Var;
        this.f132026h = str2;
        this.f132027i = p7Var;
        this.f132028j = y7Var;
        this.f132029k = w7Var;
        this.f132030l = r7Var;
        this.f132031m = q7Var;
        this.f132032n = str3;
        this.f132033o = num;
        this.f132034p = str4;
        this.f132035q = str5;
    }

    @Override // z40.b0
    public final String a() {
        return this.f132022d;
    }

    @Override // z40.b0
    public final String b() {
        return this.f132034p;
    }

    @Override // z40.b0
    public final String c() {
        return this.f132032n;
    }

    @Override // z40.b0
    public final String e() {
        return this.f132035q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8)) {
            return false;
        }
        b8 b8Var = (b8) obj;
        return Intrinsics.d(this.f132019a, b8Var.f132019a) && Intrinsics.d(this.f132020b, b8Var.f132020b) && Intrinsics.d(this.f132021c, b8Var.f132021c) && Intrinsics.d(this.f132022d, b8Var.f132022d) && Intrinsics.d(this.f132023e, b8Var.f132023e) && Intrinsics.d(this.f132024f, b8Var.f132024f) && Intrinsics.d(this.f132025g, b8Var.f132025g) && Intrinsics.d(this.f132026h, b8Var.f132026h) && Intrinsics.d(this.f132027i, b8Var.f132027i) && Intrinsics.d(this.f132028j, b8Var.f132028j) && Intrinsics.d(this.f132029k, b8Var.f132029k) && Intrinsics.d(this.f132030l, b8Var.f132030l) && Intrinsics.d(this.f132031m, b8Var.f132031m) && Intrinsics.d(this.f132032n, b8Var.f132032n) && Intrinsics.d(this.f132033o, b8Var.f132033o) && Intrinsics.d(this.f132034p, b8Var.f132034p) && Intrinsics.d(this.f132035q, b8Var.f132035q);
    }

    @Override // z40.b0
    public final z40.z f() {
        return this.f132027i;
    }

    @Override // z40.b0
    public final z40.a0 g() {
        return this.f132030l;
    }

    @Override // z40.b0
    public final String getId() {
        return this.f132020b;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132020b, this.f132019a.hashCode() * 31, 31);
        String str = this.f132021c;
        int d13 = a.cb.d(this.f132022d, (d2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        s7 s7Var = this.f132023e;
        int hashCode = (d13 + (s7Var == null ? 0 : s7Var.f133241a.hashCode())) * 31;
        a8 a8Var = this.f132024f;
        int hashCode2 = (hashCode + (a8Var == null ? 0 : a8Var.hashCode())) * 31;
        u7 u7Var = this.f132025g;
        int hashCode3 = (hashCode2 + (u7Var == null ? 0 : u7Var.hashCode())) * 31;
        String str2 = this.f132026h;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        p7 p7Var = this.f132027i;
        int hashCode5 = (hashCode4 + (p7Var == null ? 0 : p7Var.hashCode())) * 31;
        y7 y7Var = this.f132028j;
        int hashCode6 = (hashCode5 + (y7Var == null ? 0 : y7Var.hashCode())) * 31;
        w7 w7Var = this.f132029k;
        int hashCode7 = (hashCode6 + (w7Var == null ? 0 : w7Var.hashCode())) * 31;
        r7 r7Var = this.f132030l;
        int hashCode8 = (hashCode7 + (r7Var == null ? 0 : r7Var.hashCode())) * 31;
        q7 q7Var = this.f132031m;
        int hashCode9 = (hashCode8 + (q7Var == null ? 0 : q7Var.hashCode())) * 31;
        String str3 = this.f132032n;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f132033o;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f132034p;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f132035q;
        return hashCode12 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Pin(__typename=");
        sb3.append(this.f132019a);
        sb3.append(", id=");
        sb3.append(this.f132020b);
        sb3.append(", title=");
        sb3.append(this.f132021c);
        sb3.append(", entityId=");
        sb3.append(this.f132022d);
        sb3.append(", pinnedToBoard=");
        sb3.append(this.f132023e);
        sb3.append(", storyPinData=");
        sb3.append(this.f132024f);
        sb3.append(", pinner=");
        sb3.append(this.f132025g);
        sb3.append(", storyPinDataId=");
        sb3.append(this.f132026h);
        sb3.append(", embed=");
        sb3.append(this.f132027i);
        sb3.append(", richSummary=");
        sb3.append(this.f132028j);
        sb3.append(", richMetadata=");
        sb3.append(this.f132029k);
        sb3.append(", imageMediumSizePixels=");
        sb3.append(this.f132030l);
        sb3.append(", imageLargeSizePixels=");
        sb3.append(this.f132031m);
        sb3.append(", imageSignature=");
        sb3.append(this.f132032n);
        sb3.append(", commentCount=");
        sb3.append(this.f132033o);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f132034p);
        sb3.append(", imageLargeUrl=");
        return a.a.p(sb3, this.f132035q, ")");
    }
}
