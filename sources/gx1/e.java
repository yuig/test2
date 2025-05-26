package gx1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Float f66285a;

    /* renamed from: b, reason: collision with root package name */
    public final Float f66286b;

    /* renamed from: c, reason: collision with root package name */
    public final f f66287c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f66288d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f66289e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f66290f;

    /* renamed from: g, reason: collision with root package name */
    public final d f66291g;

    public e(Float f13, Float f14, f audienceViewDataSelection, boolean z13, boolean z14, boolean z15, d audienceType) {
        Intrinsics.checkNotNullParameter(audienceViewDataSelection, "audienceViewDataSelection");
        Intrinsics.checkNotNullParameter(audienceType, "audienceType");
        this.f66285a = f13;
        this.f66286b = f14;
        this.f66287c = audienceViewDataSelection;
        this.f66288d = z13;
        this.f66289e = z14;
        this.f66290f = z15;
        this.f66291g = audienceType;
    }

    public final f a() {
        return this.f66287c;
    }

    public final Float b() {
        return this.f66286b;
    }

    public final boolean c() {
        return this.f66290f;
    }

    public final Float d() {
        return this.f66285a;
    }

    public final boolean e() {
        return this.f66289e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f66285a, eVar.f66285a) && Intrinsics.d(this.f66286b, eVar.f66286b) && Intrinsics.d(this.f66287c, eVar.f66287c) && this.f66288d == eVar.f66288d && this.f66289e == eVar.f66289e && this.f66290f == eVar.f66290f && this.f66291g == eVar.f66291g;
    }

    public final boolean f() {
        return this.f66288d;
    }

    public final int hashCode() {
        Float f13 = this.f66285a;
        int hashCode = (f13 == null ? 0 : f13.hashCode()) * 31;
        Float f14 = this.f66286b;
        return this.f66291g.hashCode() + ep.b.e(this.f66290f, ep.b.e(this.f66289e, ep.b.e(this.f66288d, (this.f66287c.hashCode() + ((hashCode + (f14 != null ? f14.hashCode() : 0)) * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "AudienceViewData(totalAudience=" + this.f66285a + ", engagedAudience=" + this.f66286b + ", audienceViewDataSelection=" + this.f66287c + ", isTotalAudienceUpperBound=" + this.f66288d + ", isEngagedAudienceUpperBound=" + this.f66289e + ", shouldDisplayTopCategories=" + this.f66290f + ", audienceType=" + this.f66291g + ")";
    }
}
