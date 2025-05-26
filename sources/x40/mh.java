package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mh implements z40.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132830a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132831b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132832c;

    /* renamed from: d, reason: collision with root package name */
    public final String f132833d;

    /* renamed from: e, reason: collision with root package name */
    public final bh f132834e;

    /* renamed from: f, reason: collision with root package name */
    public final jh f132835f;

    /* renamed from: g, reason: collision with root package name */
    public final dh f132836g;

    /* renamed from: h, reason: collision with root package name */
    public final String f132837h;

    /* renamed from: i, reason: collision with root package name */
    public final og f132838i;

    /* renamed from: j, reason: collision with root package name */
    public final hh f132839j;

    /* renamed from: k, reason: collision with root package name */
    public final fh f132840k;

    /* renamed from: l, reason: collision with root package name */
    public final sg f132841l;

    /* renamed from: m, reason: collision with root package name */
    public final qg f132842m;

    /* renamed from: n, reason: collision with root package name */
    public final String f132843n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f132844o;

    /* renamed from: p, reason: collision with root package name */
    public final String f132845p;

    /* renamed from: q, reason: collision with root package name */
    public final String f132846q;

    /* renamed from: r, reason: collision with root package name */
    public final ah f132847r;

    /* renamed from: s, reason: collision with root package name */
    public final lh f132848s;

    /* renamed from: t, reason: collision with root package name */
    public final yg f132849t;

    /* renamed from: u, reason: collision with root package name */
    public final vg f132850u;

    /* renamed from: v, reason: collision with root package name */
    public final rg f132851v;

    /* renamed from: w, reason: collision with root package name */
    public final pg f132852w;

    public mh(String __typename, String id3, String str, String entityId, bh bhVar, jh jhVar, dh dhVar, String str2, og ogVar, hh hhVar, fh fhVar, sg sgVar, qg qgVar, String str3, Integer num, String str4, String str5, ah ahVar, lh lhVar, yg ygVar, vg vgVar, rg rgVar, pg pgVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132830a = __typename;
        this.f132831b = id3;
        this.f132832c = str;
        this.f132833d = entityId;
        this.f132834e = bhVar;
        this.f132835f = jhVar;
        this.f132836g = dhVar;
        this.f132837h = str2;
        this.f132838i = ogVar;
        this.f132839j = hhVar;
        this.f132840k = fhVar;
        this.f132841l = sgVar;
        this.f132842m = qgVar;
        this.f132843n = str3;
        this.f132844o = num;
        this.f132845p = str4;
        this.f132846q = str5;
        this.f132847r = ahVar;
        this.f132848s = lhVar;
        this.f132849t = ygVar;
        this.f132850u = vgVar;
        this.f132851v = rgVar;
        this.f132852w = pgVar;
    }

    @Override // z40.b0
    public final String a() {
        return this.f132833d;
    }

    @Override // z40.b0
    public final String b() {
        return this.f132845p;
    }

    @Override // z40.b0
    public final String c() {
        return this.f132843n;
    }

    @Override // z40.b0
    public final String e() {
        return this.f132846q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh)) {
            return false;
        }
        mh mhVar = (mh) obj;
        return Intrinsics.d(this.f132830a, mhVar.f132830a) && Intrinsics.d(this.f132831b, mhVar.f132831b) && Intrinsics.d(this.f132832c, mhVar.f132832c) && Intrinsics.d(this.f132833d, mhVar.f132833d) && Intrinsics.d(this.f132834e, mhVar.f132834e) && Intrinsics.d(this.f132835f, mhVar.f132835f) && Intrinsics.d(this.f132836g, mhVar.f132836g) && Intrinsics.d(this.f132837h, mhVar.f132837h) && Intrinsics.d(this.f132838i, mhVar.f132838i) && Intrinsics.d(this.f132839j, mhVar.f132839j) && Intrinsics.d(this.f132840k, mhVar.f132840k) && Intrinsics.d(this.f132841l, mhVar.f132841l) && Intrinsics.d(this.f132842m, mhVar.f132842m) && Intrinsics.d(this.f132843n, mhVar.f132843n) && Intrinsics.d(this.f132844o, mhVar.f132844o) && Intrinsics.d(this.f132845p, mhVar.f132845p) && Intrinsics.d(this.f132846q, mhVar.f132846q) && Intrinsics.d(this.f132847r, mhVar.f132847r) && Intrinsics.d(this.f132848s, mhVar.f132848s) && Intrinsics.d(this.f132849t, mhVar.f132849t) && Intrinsics.d(this.f132850u, mhVar.f132850u) && Intrinsics.d(this.f132851v, mhVar.f132851v) && Intrinsics.d(this.f132852w, mhVar.f132852w);
    }

    @Override // z40.b0
    public final z40.z f() {
        return this.f132838i;
    }

    @Override // z40.b0
    public final z40.a0 g() {
        return this.f132841l;
    }

    @Override // z40.b0
    public final String getId() {
        return this.f132831b;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132831b, this.f132830a.hashCode() * 31, 31);
        String str = this.f132832c;
        int d13 = a.cb.d(this.f132833d, (d2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        bh bhVar = this.f132834e;
        int hashCode = (d13 + (bhVar == null ? 0 : bhVar.f132057a.hashCode())) * 31;
        jh jhVar = this.f132835f;
        int hashCode2 = (hashCode + (jhVar == null ? 0 : jhVar.hashCode())) * 31;
        dh dhVar = this.f132836g;
        int hashCode3 = (hashCode2 + (dhVar == null ? 0 : dhVar.hashCode())) * 31;
        String str2 = this.f132837h;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        og ogVar = this.f132838i;
        int hashCode5 = (hashCode4 + (ogVar == null ? 0 : ogVar.hashCode())) * 31;
        hh hhVar = this.f132839j;
        int hashCode6 = (hashCode5 + (hhVar == null ? 0 : hhVar.hashCode())) * 31;
        fh fhVar = this.f132840k;
        int hashCode7 = (hashCode6 + (fhVar == null ? 0 : fhVar.hashCode())) * 31;
        sg sgVar = this.f132841l;
        int hashCode8 = (hashCode7 + (sgVar == null ? 0 : sgVar.hashCode())) * 31;
        qg qgVar = this.f132842m;
        int hashCode9 = (hashCode8 + (qgVar == null ? 0 : qgVar.hashCode())) * 31;
        String str3 = this.f132843n;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f132844o;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f132845p;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f132846q;
        int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ah ahVar = this.f132847r;
        int hashCode14 = (hashCode13 + (ahVar == null ? 0 : ahVar.hashCode())) * 31;
        lh lhVar = this.f132848s;
        int hashCode15 = (hashCode14 + (lhVar == null ? 0 : lhVar.hashCode())) * 31;
        yg ygVar = this.f132849t;
        int hashCode16 = (hashCode15 + (ygVar == null ? 0 : ygVar.hashCode())) * 31;
        vg vgVar = this.f132850u;
        int hashCode17 = (hashCode16 + (vgVar == null ? 0 : vgVar.hashCode())) * 31;
        rg rgVar = this.f132851v;
        int hashCode18 = (hashCode17 + (rgVar == null ? 0 : rgVar.hashCode())) * 31;
        pg pgVar = this.f132852w;
        return hashCode18 + (pgVar != null ? pgVar.hashCode() : 0);
    }

    public final String toString() {
        return "Node(__typename=" + this.f132830a + ", id=" + this.f132831b + ", title=" + this.f132832c + ", entityId=" + this.f132833d + ", pinnedToBoard=" + this.f132834e + ", storyPinData=" + this.f132835f + ", pinner=" + this.f132836g + ", storyPinDataId=" + this.f132837h + ", embed=" + this.f132838i + ", richSummary=" + this.f132839j + ", richMetadata=" + this.f132840k + ", imageMediumSizePixels=" + this.f132841l + ", imageLargeSizePixels=" + this.f132842m + ", imageSignature=" + this.f132843n + ", commentCount=" + this.f132844o + ", imageMediumUrl=" + this.f132845p + ", imageLargeUrl=" + this.f132846q + ", nativeCreator=" + this.f132847r + ", thirdPartyPinOwner=" + this.f132848s + ", linkUserWebsite=" + this.f132849t + ", linkDomain=" + this.f132850u + ", imageMediumDetails=" + this.f132851v + ", imageLargeDetails=" + this.f132852w + ")";
    }
}
