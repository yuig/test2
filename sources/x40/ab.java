package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ab implements z40.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f131942a;

    /* renamed from: b, reason: collision with root package name */
    public final String f131943b;

    /* renamed from: c, reason: collision with root package name */
    public final String f131944c;

    /* renamed from: d, reason: collision with root package name */
    public final String f131945d;

    /* renamed from: e, reason: collision with root package name */
    public final ra f131946e;

    /* renamed from: f, reason: collision with root package name */
    public final za f131947f;

    /* renamed from: g, reason: collision with root package name */
    public final ta f131948g;

    /* renamed from: h, reason: collision with root package name */
    public final String f131949h;

    /* renamed from: i, reason: collision with root package name */
    public final oa f131950i;

    /* renamed from: j, reason: collision with root package name */
    public final xa f131951j;

    /* renamed from: k, reason: collision with root package name */
    public final va f131952k;

    /* renamed from: l, reason: collision with root package name */
    public final qa f131953l;

    /* renamed from: m, reason: collision with root package name */
    public final pa f131954m;

    /* renamed from: n, reason: collision with root package name */
    public final String f131955n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f131956o;

    /* renamed from: p, reason: collision with root package name */
    public final String f131957p;

    /* renamed from: q, reason: collision with root package name */
    public final String f131958q;

    public ab(String __typename, String id3, String str, String entityId, ra raVar, za zaVar, ta taVar, String str2, oa oaVar, xa xaVar, va vaVar, qa qaVar, pa paVar, String str3, Integer num, String str4, String str5) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f131942a = __typename;
        this.f131943b = id3;
        this.f131944c = str;
        this.f131945d = entityId;
        this.f131946e = raVar;
        this.f131947f = zaVar;
        this.f131948g = taVar;
        this.f131949h = str2;
        this.f131950i = oaVar;
        this.f131951j = xaVar;
        this.f131952k = vaVar;
        this.f131953l = qaVar;
        this.f131954m = paVar;
        this.f131955n = str3;
        this.f131956o = num;
        this.f131957p = str4;
        this.f131958q = str5;
    }

    @Override // z40.b0
    public final String a() {
        return this.f131945d;
    }

    @Override // z40.b0
    public final String b() {
        return this.f131957p;
    }

    @Override // z40.b0
    public final String c() {
        return this.f131955n;
    }

    @Override // z40.b0
    public final String e() {
        return this.f131958q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return Intrinsics.d(this.f131942a, abVar.f131942a) && Intrinsics.d(this.f131943b, abVar.f131943b) && Intrinsics.d(this.f131944c, abVar.f131944c) && Intrinsics.d(this.f131945d, abVar.f131945d) && Intrinsics.d(this.f131946e, abVar.f131946e) && Intrinsics.d(this.f131947f, abVar.f131947f) && Intrinsics.d(this.f131948g, abVar.f131948g) && Intrinsics.d(this.f131949h, abVar.f131949h) && Intrinsics.d(this.f131950i, abVar.f131950i) && Intrinsics.d(this.f131951j, abVar.f131951j) && Intrinsics.d(this.f131952k, abVar.f131952k) && Intrinsics.d(this.f131953l, abVar.f131953l) && Intrinsics.d(this.f131954m, abVar.f131954m) && Intrinsics.d(this.f131955n, abVar.f131955n) && Intrinsics.d(this.f131956o, abVar.f131956o) && Intrinsics.d(this.f131957p, abVar.f131957p) && Intrinsics.d(this.f131958q, abVar.f131958q);
    }

    @Override // z40.b0
    public final z40.z f() {
        return this.f131950i;
    }

    @Override // z40.b0
    public final z40.a0 g() {
        return this.f131953l;
    }

    @Override // z40.b0
    public final String getId() {
        return this.f131943b;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f131943b, this.f131942a.hashCode() * 31, 31);
        String str = this.f131944c;
        int d13 = a.cb.d(this.f131945d, (d2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        ra raVar = this.f131946e;
        int hashCode = (d13 + (raVar == null ? 0 : raVar.f133178a.hashCode())) * 31;
        za zaVar = this.f131947f;
        int hashCode2 = (hashCode + (zaVar == null ? 0 : zaVar.hashCode())) * 31;
        ta taVar = this.f131948g;
        int hashCode3 = (hashCode2 + (taVar == null ? 0 : taVar.hashCode())) * 31;
        String str2 = this.f131949h;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        oa oaVar = this.f131950i;
        int hashCode5 = (hashCode4 + (oaVar == null ? 0 : oaVar.hashCode())) * 31;
        xa xaVar = this.f131951j;
        int hashCode6 = (hashCode5 + (xaVar == null ? 0 : xaVar.hashCode())) * 31;
        va vaVar = this.f131952k;
        int hashCode7 = (hashCode6 + (vaVar == null ? 0 : vaVar.hashCode())) * 31;
        qa qaVar = this.f131953l;
        int hashCode8 = (hashCode7 + (qaVar == null ? 0 : qaVar.hashCode())) * 31;
        pa paVar = this.f131954m;
        int hashCode9 = (hashCode8 + (paVar == null ? 0 : paVar.hashCode())) * 31;
        String str3 = this.f131955n;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f131956o;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f131957p;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f131958q;
        return hashCode12 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Pin(__typename=");
        sb3.append(this.f131942a);
        sb3.append(", id=");
        sb3.append(this.f131943b);
        sb3.append(", title=");
        sb3.append(this.f131944c);
        sb3.append(", entityId=");
        sb3.append(this.f131945d);
        sb3.append(", pinnedToBoard=");
        sb3.append(this.f131946e);
        sb3.append(", storyPinData=");
        sb3.append(this.f131947f);
        sb3.append(", pinner=");
        sb3.append(this.f131948g);
        sb3.append(", storyPinDataId=");
        sb3.append(this.f131949h);
        sb3.append(", embed=");
        sb3.append(this.f131950i);
        sb3.append(", richSummary=");
        sb3.append(this.f131951j);
        sb3.append(", richMetadata=");
        sb3.append(this.f131952k);
        sb3.append(", imageMediumSizePixels=");
        sb3.append(this.f131953l);
        sb3.append(", imageLargeSizePixels=");
        sb3.append(this.f131954m);
        sb3.append(", imageSignature=");
        sb3.append(this.f131955n);
        sb3.append(", commentCount=");
        sb3.append(this.f131956o);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f131957p);
        sb3.append(", imageLargeUrl=");
        return a.a.p(sb3, this.f131958q, ")");
    }
}
