package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dg implements ff {

    /* renamed from: a, reason: collision with root package name */
    public final String f132250a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132251b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132252c;

    /* renamed from: d, reason: collision with root package name */
    public final String f132253d;

    /* renamed from: e, reason: collision with root package name */
    public final sf f132254e;

    /* renamed from: f, reason: collision with root package name */
    public final String f132255f;

    /* renamed from: g, reason: collision with root package name */
    public final String f132256g;

    /* renamed from: h, reason: collision with root package name */
    public final ag f132257h;

    /* renamed from: i, reason: collision with root package name */
    public final hf f132258i;

    /* renamed from: j, reason: collision with root package name */
    public final wf f132259j;

    /* renamed from: k, reason: collision with root package name */
    public final yf f132260k;

    /* renamed from: l, reason: collision with root package name */
    public final jf f132261l;

    /* renamed from: m, reason: collision with root package name */
    public final Cif f132262m;

    /* renamed from: n, reason: collision with root package name */
    public final rf f132263n;

    /* renamed from: o, reason: collision with root package name */
    public final uf f132264o;

    /* renamed from: p, reason: collision with root package name */
    public final cg f132265p;

    /* renamed from: q, reason: collision with root package name */
    public final pf f132266q;

    /* renamed from: r, reason: collision with root package name */
    public final mf f132267r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f132268s;

    /* renamed from: t, reason: collision with root package name */
    public final String f132269t;

    /* renamed from: u, reason: collision with root package name */
    public final String f132270u;

    public dg(String __typename, String id3, String str, String entityId, sf sfVar, String str2, String str3, ag agVar, hf hfVar, wf wfVar, yf yfVar, jf jfVar, Cif cif, rf rfVar, uf ufVar, cg cgVar, pf pfVar, mf mfVar, Integer num, String str4, String str5) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132250a = __typename;
        this.f132251b = id3;
        this.f132252c = str;
        this.f132253d = entityId;
        this.f132254e = sfVar;
        this.f132255f = str2;
        this.f132256g = str3;
        this.f132257h = agVar;
        this.f132258i = hfVar;
        this.f132259j = wfVar;
        this.f132260k = yfVar;
        this.f132261l = jfVar;
        this.f132262m = cif;
        this.f132263n = rfVar;
        this.f132264o = ufVar;
        this.f132265p = cgVar;
        this.f132266q = pfVar;
        this.f132267r = mfVar;
        this.f132268s = num;
        this.f132269t = str4;
        this.f132270u = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg)) {
            return false;
        }
        dg dgVar = (dg) obj;
        return Intrinsics.d(this.f132250a, dgVar.f132250a) && Intrinsics.d(this.f132251b, dgVar.f132251b) && Intrinsics.d(this.f132252c, dgVar.f132252c) && Intrinsics.d(this.f132253d, dgVar.f132253d) && Intrinsics.d(this.f132254e, dgVar.f132254e) && Intrinsics.d(this.f132255f, dgVar.f132255f) && Intrinsics.d(this.f132256g, dgVar.f132256g) && Intrinsics.d(this.f132257h, dgVar.f132257h) && Intrinsics.d(this.f132258i, dgVar.f132258i) && Intrinsics.d(this.f132259j, dgVar.f132259j) && Intrinsics.d(this.f132260k, dgVar.f132260k) && Intrinsics.d(this.f132261l, dgVar.f132261l) && Intrinsics.d(this.f132262m, dgVar.f132262m) && Intrinsics.d(this.f132263n, dgVar.f132263n) && Intrinsics.d(this.f132264o, dgVar.f132264o) && Intrinsics.d(this.f132265p, dgVar.f132265p) && Intrinsics.d(this.f132266q, dgVar.f132266q) && Intrinsics.d(this.f132267r, dgVar.f132267r) && Intrinsics.d(this.f132268s, dgVar.f132268s) && Intrinsics.d(this.f132269t, dgVar.f132269t) && Intrinsics.d(this.f132270u, dgVar.f132270u);
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132251b, this.f132250a.hashCode() * 31, 31);
        String str = this.f132252c;
        int d13 = a.cb.d(this.f132253d, (d2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        sf sfVar = this.f132254e;
        int hashCode = (d13 + (sfVar == null ? 0 : sfVar.hashCode())) * 31;
        String str2 = this.f132255f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f132256g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ag agVar = this.f132257h;
        int hashCode4 = (hashCode3 + (agVar == null ? 0 : agVar.hashCode())) * 31;
        hf hfVar = this.f132258i;
        int hashCode5 = (hashCode4 + (hfVar == null ? 0 : hfVar.hashCode())) * 31;
        wf wfVar = this.f132259j;
        int hashCode6 = (hashCode5 + (wfVar == null ? 0 : wfVar.hashCode())) * 31;
        yf yfVar = this.f132260k;
        int hashCode7 = (hashCode6 + (yfVar == null ? 0 : yfVar.hashCode())) * 31;
        jf jfVar = this.f132261l;
        int hashCode8 = (hashCode7 + (jfVar == null ? 0 : jfVar.hashCode())) * 31;
        Cif cif = this.f132262m;
        int hashCode9 = (hashCode8 + (cif == null ? 0 : cif.hashCode())) * 31;
        rf rfVar = this.f132263n;
        int hashCode10 = (hashCode9 + (rfVar == null ? 0 : rfVar.hashCode())) * 31;
        uf ufVar = this.f132264o;
        int hashCode11 = (hashCode10 + (ufVar == null ? 0 : ufVar.hashCode())) * 31;
        cg cgVar = this.f132265p;
        int hashCode12 = (hashCode11 + (cgVar == null ? 0 : cgVar.hashCode())) * 31;
        pf pfVar = this.f132266q;
        int hashCode13 = (hashCode12 + (pfVar == null ? 0 : pfVar.hashCode())) * 31;
        mf mfVar = this.f132267r;
        int hashCode14 = (hashCode13 + (mfVar == null ? 0 : mfVar.hashCode())) * 31;
        Integer num = this.f132268s;
        int hashCode15 = (hashCode14 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f132269t;
        int hashCode16 = (hashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f132270u;
        return hashCode16 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinNode(__typename=");
        sb3.append(this.f132250a);
        sb3.append(", id=");
        sb3.append(this.f132251b);
        sb3.append(", title=");
        sb3.append(this.f132252c);
        sb3.append(", entityId=");
        sb3.append(this.f132253d);
        sb3.append(", pinnedToBoard=");
        sb3.append(this.f132254e);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f132255f);
        sb3.append(", storyPinDataId=");
        sb3.append(this.f132256g);
        sb3.append(", storyPinData=");
        sb3.append(this.f132257h);
        sb3.append(", embed=");
        sb3.append(this.f132258i);
        sb3.append(", richMetadata=");
        sb3.append(this.f132259j);
        sb3.append(", richSummary=");
        sb3.append(this.f132260k);
        sb3.append(", imageMediumSizePixels=");
        sb3.append(this.f132261l);
        sb3.append(", imageLargeSizePixels=");
        sb3.append(this.f132262m);
        sb3.append(", nativeCreator=");
        sb3.append(this.f132263n);
        sb3.append(", pinner=");
        sb3.append(this.f132264o);
        sb3.append(", thirdPartyPinOwner=");
        sb3.append(this.f132265p);
        sb3.append(", linkUserWebsite=");
        sb3.append(this.f132266q);
        sb3.append(", linkDomain=");
        sb3.append(this.f132267r);
        sb3.append(", commentCount=");
        sb3.append(this.f132268s);
        sb3.append(", imageSignature=");
        sb3.append(this.f132269t);
        sb3.append(", imageLargeUrl=");
        return a.a.p(sb3, this.f132270u, ")");
    }
}
