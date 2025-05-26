package cs;

import a.cb;
import com.pinterest.api.model.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f53115a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f53116b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f53117c;

    /* renamed from: d, reason: collision with root package name */
    public final g f53118d;

    /* renamed from: e, reason: collision with root package name */
    public final String f53119e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f53120f;

    /* renamed from: g, reason: collision with root package name */
    public final String f53121g;

    public a(String fieldName, boolean z13, boolean z14, g gVar, String pinUid, boolean z15, String pinPromotionId) {
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinPromotionId, "pinPromotionId");
        this.f53115a = fieldName;
        this.f53116b = z13;
        this.f53117c = z14;
        this.f53118d = gVar;
        this.f53119e = pinUid;
        this.f53120f = z15;
        this.f53121g = pinPromotionId;
    }

    public final g a() {
        return this.f53118d;
    }

    public final String b() {
        return this.f53115a;
    }

    public final boolean c() {
        return this.f53116b;
    }

    public final boolean d() {
        return this.f53117c;
    }

    public final String e() {
        return this.f53121g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f53115a, aVar.f53115a) && this.f53116b == aVar.f53116b && this.f53117c == aVar.f53117c && Intrinsics.d(this.f53118d, aVar.f53118d) && Intrinsics.d(this.f53119e, aVar.f53119e) && this.f53120f == aVar.f53120f && Intrinsics.d(this.f53121g, aVar.f53121g);
    }

    public final String f() {
        return this.f53119e;
    }

    public final boolean g() {
        return this.f53120f;
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f53117c, ep.b.e(this.f53116b, this.f53115a.hashCode() * 31, 31), 31);
        g gVar = this.f53118d;
        return this.f53121g.hashCode() + ep.b.e(this.f53120f, cb.d(this.f53119e, (e13 + (gVar == null ? 0 : gVar.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AdFormatsModularizationDiscrepancy(fieldName=");
        sb3.append(this.f53115a);
        sb3.append(", legacyResult=");
        sb3.append(this.f53116b);
        sb3.append(", modularizationResult=");
        sb3.append(this.f53117c);
        sb3.append(", adData=");
        sb3.append(this.f53118d);
        sb3.append(", pinUid=");
        sb3.append(this.f53119e);
        sb3.append(", isThirdPartyAd=");
        sb3.append(this.f53120f);
        sb3.append(", pinPromotionId=");
        return a.a.p(sb3, this.f53121g, ")");
    }
}
