package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ja implements z40.b0, z40.p {

    /* renamed from: a, reason: collision with root package name */
    public final String f132597a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132598b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132599c;

    /* renamed from: d, reason: collision with root package name */
    public final String f132600d;

    /* renamed from: e, reason: collision with root package name */
    public final aa f132601e;

    /* renamed from: f, reason: collision with root package name */
    public final ia f132602f;

    /* renamed from: g, reason: collision with root package name */
    public final ca f132603g;

    /* renamed from: h, reason: collision with root package name */
    public final String f132604h;

    /* renamed from: i, reason: collision with root package name */
    public final x9 f132605i;

    /* renamed from: j, reason: collision with root package name */
    public final ga f132606j;

    /* renamed from: k, reason: collision with root package name */
    public final ea f132607k;

    /* renamed from: l, reason: collision with root package name */
    public final z9 f132608l;

    /* renamed from: m, reason: collision with root package name */
    public final y9 f132609m;

    /* renamed from: n, reason: collision with root package name */
    public final String f132610n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f132611o;

    /* renamed from: p, reason: collision with root package name */
    public final String f132612p;

    /* renamed from: q, reason: collision with root package name */
    public final String f132613q;

    public ja(String __typename, String id3, String str, String entityId, aa aaVar, ia iaVar, ca caVar, String str2, x9 x9Var, ga gaVar, ea eaVar, z9 z9Var, y9 y9Var, String str3, Integer num, String str4, String str5) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132597a = __typename;
        this.f132598b = id3;
        this.f132599c = str;
        this.f132600d = entityId;
        this.f132601e = aaVar;
        this.f132602f = iaVar;
        this.f132603g = caVar;
        this.f132604h = str2;
        this.f132605i = x9Var;
        this.f132606j = gaVar;
        this.f132607k = eaVar;
        this.f132608l = z9Var;
        this.f132609m = y9Var;
        this.f132610n = str3;
        this.f132611o = num;
        this.f132612p = str4;
        this.f132613q = str5;
    }

    @Override // z40.b0
    public final String a() {
        return this.f132600d;
    }

    @Override // z40.b0
    public final String b() {
        return this.f132612p;
    }

    @Override // z40.b0
    public final String c() {
        return this.f132610n;
    }

    @Override // z40.b0
    public final String e() {
        return this.f132613q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja)) {
            return false;
        }
        ja jaVar = (ja) obj;
        return Intrinsics.d(this.f132597a, jaVar.f132597a) && Intrinsics.d(this.f132598b, jaVar.f132598b) && Intrinsics.d(this.f132599c, jaVar.f132599c) && Intrinsics.d(this.f132600d, jaVar.f132600d) && Intrinsics.d(this.f132601e, jaVar.f132601e) && Intrinsics.d(this.f132602f, jaVar.f132602f) && Intrinsics.d(this.f132603g, jaVar.f132603g) && Intrinsics.d(this.f132604h, jaVar.f132604h) && Intrinsics.d(this.f132605i, jaVar.f132605i) && Intrinsics.d(this.f132606j, jaVar.f132606j) && Intrinsics.d(this.f132607k, jaVar.f132607k) && Intrinsics.d(this.f132608l, jaVar.f132608l) && Intrinsics.d(this.f132609m, jaVar.f132609m) && Intrinsics.d(this.f132610n, jaVar.f132610n) && Intrinsics.d(this.f132611o, jaVar.f132611o) && Intrinsics.d(this.f132612p, jaVar.f132612p) && Intrinsics.d(this.f132613q, jaVar.f132613q);
    }

    @Override // z40.b0
    public final z40.z f() {
        return this.f132605i;
    }

    @Override // z40.b0
    public final z40.a0 g() {
        return this.f132608l;
    }

    @Override // z40.b0
    public final String getId() {
        return this.f132598b;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132598b, this.f132597a.hashCode() * 31, 31);
        String str = this.f132599c;
        int d13 = a.cb.d(this.f132600d, (d2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        aa aaVar = this.f132601e;
        int hashCode = (d13 + (aaVar == null ? 0 : aaVar.f131941a.hashCode())) * 31;
        ia iaVar = this.f132602f;
        int hashCode2 = (hashCode + (iaVar == null ? 0 : iaVar.hashCode())) * 31;
        ca caVar = this.f132603g;
        int hashCode3 = (hashCode2 + (caVar == null ? 0 : caVar.hashCode())) * 31;
        String str2 = this.f132604h;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        x9 x9Var = this.f132605i;
        int hashCode5 = (hashCode4 + (x9Var == null ? 0 : x9Var.hashCode())) * 31;
        ga gaVar = this.f132606j;
        int hashCode6 = (hashCode5 + (gaVar == null ? 0 : gaVar.hashCode())) * 31;
        ea eaVar = this.f132607k;
        int hashCode7 = (hashCode6 + (eaVar == null ? 0 : eaVar.hashCode())) * 31;
        z9 z9Var = this.f132608l;
        int hashCode8 = (hashCode7 + (z9Var == null ? 0 : z9Var.hashCode())) * 31;
        y9 y9Var = this.f132609m;
        int hashCode9 = (hashCode8 + (y9Var == null ? 0 : y9Var.hashCode())) * 31;
        String str3 = this.f132610n;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f132611o;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f132612p;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f132613q;
        return hashCode12 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Pin(__typename=");
        sb3.append(this.f132597a);
        sb3.append(", id=");
        sb3.append(this.f132598b);
        sb3.append(", title=");
        sb3.append(this.f132599c);
        sb3.append(", entityId=");
        sb3.append(this.f132600d);
        sb3.append(", pinnedToBoard=");
        sb3.append(this.f132601e);
        sb3.append(", storyPinData=");
        sb3.append(this.f132602f);
        sb3.append(", pinner=");
        sb3.append(this.f132603g);
        sb3.append(", storyPinDataId=");
        sb3.append(this.f132604h);
        sb3.append(", embed=");
        sb3.append(this.f132605i);
        sb3.append(", richSummary=");
        sb3.append(this.f132606j);
        sb3.append(", richMetadata=");
        sb3.append(this.f132607k);
        sb3.append(", imageMediumSizePixels=");
        sb3.append(this.f132608l);
        sb3.append(", imageLargeSizePixels=");
        sb3.append(this.f132609m);
        sb3.append(", imageSignature=");
        sb3.append(this.f132610n);
        sb3.append(", commentCount=");
        sb3.append(this.f132611o);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f132612p);
        sb3.append(", imageLargeUrl=");
        return a.a.p(sb3, this.f132613q, ")");
    }
}
