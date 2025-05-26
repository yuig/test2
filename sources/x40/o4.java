package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o4 implements z40.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132923a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132924b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132925c;

    /* renamed from: d, reason: collision with root package name */
    public final String f132926d;

    /* renamed from: e, reason: collision with root package name */
    public final f4 f132927e;

    /* renamed from: f, reason: collision with root package name */
    public final n4 f132928f;

    /* renamed from: g, reason: collision with root package name */
    public final h4 f132929g;

    /* renamed from: h, reason: collision with root package name */
    public final String f132930h;

    /* renamed from: i, reason: collision with root package name */
    public final c4 f132931i;

    /* renamed from: j, reason: collision with root package name */
    public final l4 f132932j;

    /* renamed from: k, reason: collision with root package name */
    public final j4 f132933k;

    /* renamed from: l, reason: collision with root package name */
    public final e4 f132934l;

    /* renamed from: m, reason: collision with root package name */
    public final d4 f132935m;

    /* renamed from: n, reason: collision with root package name */
    public final String f132936n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f132937o;

    /* renamed from: p, reason: collision with root package name */
    public final String f132938p;

    /* renamed from: q, reason: collision with root package name */
    public final String f132939q;

    public o4(String __typename, String id3, String str, String entityId, f4 f4Var, n4 n4Var, h4 h4Var, String str2, c4 c4Var, l4 l4Var, j4 j4Var, e4 e4Var, d4 d4Var, String str3, Integer num, String str4, String str5) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132923a = __typename;
        this.f132924b = id3;
        this.f132925c = str;
        this.f132926d = entityId;
        this.f132927e = f4Var;
        this.f132928f = n4Var;
        this.f132929g = h4Var;
        this.f132930h = str2;
        this.f132931i = c4Var;
        this.f132932j = l4Var;
        this.f132933k = j4Var;
        this.f132934l = e4Var;
        this.f132935m = d4Var;
        this.f132936n = str3;
        this.f132937o = num;
        this.f132938p = str4;
        this.f132939q = str5;
    }

    @Override // z40.b0
    public final String a() {
        return this.f132926d;
    }

    @Override // z40.b0
    public final String b() {
        return this.f132938p;
    }

    @Override // z40.b0
    public final String c() {
        return this.f132936n;
    }

    @Override // z40.b0
    public final String e() {
        return this.f132939q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4)) {
            return false;
        }
        o4 o4Var = (o4) obj;
        return Intrinsics.d(this.f132923a, o4Var.f132923a) && Intrinsics.d(this.f132924b, o4Var.f132924b) && Intrinsics.d(this.f132925c, o4Var.f132925c) && Intrinsics.d(this.f132926d, o4Var.f132926d) && Intrinsics.d(this.f132927e, o4Var.f132927e) && Intrinsics.d(this.f132928f, o4Var.f132928f) && Intrinsics.d(this.f132929g, o4Var.f132929g) && Intrinsics.d(this.f132930h, o4Var.f132930h) && Intrinsics.d(this.f132931i, o4Var.f132931i) && Intrinsics.d(this.f132932j, o4Var.f132932j) && Intrinsics.d(this.f132933k, o4Var.f132933k) && Intrinsics.d(this.f132934l, o4Var.f132934l) && Intrinsics.d(this.f132935m, o4Var.f132935m) && Intrinsics.d(this.f132936n, o4Var.f132936n) && Intrinsics.d(this.f132937o, o4Var.f132937o) && Intrinsics.d(this.f132938p, o4Var.f132938p) && Intrinsics.d(this.f132939q, o4Var.f132939q);
    }

    @Override // z40.b0
    public final z40.z f() {
        return this.f132931i;
    }

    @Override // z40.b0
    public final z40.a0 g() {
        return this.f132934l;
    }

    @Override // z40.b0
    public final String getId() {
        return this.f132924b;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132924b, this.f132923a.hashCode() * 31, 31);
        String str = this.f132925c;
        int d13 = a.cb.d(this.f132926d, (d2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        f4 f4Var = this.f132927e;
        int hashCode = (d13 + (f4Var == null ? 0 : f4Var.f132373a.hashCode())) * 31;
        n4 n4Var = this.f132928f;
        int hashCode2 = (hashCode + (n4Var == null ? 0 : n4Var.hashCode())) * 31;
        h4 h4Var = this.f132929g;
        int hashCode3 = (hashCode2 + (h4Var == null ? 0 : h4Var.hashCode())) * 31;
        String str2 = this.f132930h;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        c4 c4Var = this.f132931i;
        int hashCode5 = (hashCode4 + (c4Var == null ? 0 : c4Var.hashCode())) * 31;
        l4 l4Var = this.f132932j;
        int hashCode6 = (hashCode5 + (l4Var == null ? 0 : l4Var.hashCode())) * 31;
        j4 j4Var = this.f132933k;
        int hashCode7 = (hashCode6 + (j4Var == null ? 0 : j4Var.hashCode())) * 31;
        e4 e4Var = this.f132934l;
        int hashCode8 = (hashCode7 + (e4Var == null ? 0 : e4Var.hashCode())) * 31;
        d4 d4Var = this.f132935m;
        int hashCode9 = (hashCode8 + (d4Var == null ? 0 : d4Var.hashCode())) * 31;
        String str3 = this.f132936n;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f132937o;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f132938p;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f132939q;
        return hashCode12 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Pin(__typename=");
        sb3.append(this.f132923a);
        sb3.append(", id=");
        sb3.append(this.f132924b);
        sb3.append(", title=");
        sb3.append(this.f132925c);
        sb3.append(", entityId=");
        sb3.append(this.f132926d);
        sb3.append(", pinnedToBoard=");
        sb3.append(this.f132927e);
        sb3.append(", storyPinData=");
        sb3.append(this.f132928f);
        sb3.append(", pinner=");
        sb3.append(this.f132929g);
        sb3.append(", storyPinDataId=");
        sb3.append(this.f132930h);
        sb3.append(", embed=");
        sb3.append(this.f132931i);
        sb3.append(", richSummary=");
        sb3.append(this.f132932j);
        sb3.append(", richMetadata=");
        sb3.append(this.f132933k);
        sb3.append(", imageMediumSizePixels=");
        sb3.append(this.f132934l);
        sb3.append(", imageLargeSizePixels=");
        sb3.append(this.f132935m);
        sb3.append(", imageSignature=");
        sb3.append(this.f132936n);
        sb3.append(", commentCount=");
        sb3.append(this.f132937o);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f132938p);
        sb3.append(", imageLargeUrl=");
        return a.a.p(sb3, this.f132939q, ")");
    }
}
