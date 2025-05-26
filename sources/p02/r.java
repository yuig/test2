package p02;

import a.cb;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r implements t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f98450a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f98451b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f98452c;

    /* renamed from: d, reason: collision with root package name */
    public final String f98453d;

    /* renamed from: e, reason: collision with root package name */
    public final String f98454e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f98455f;

    /* renamed from: g, reason: collision with root package name */
    public final String f98456g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f98457h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f98458i;

    /* renamed from: j, reason: collision with root package name */
    public final String f98459j;

    public r(boolean z13, boolean z14, boolean z15, String actionId, String str, boolean z16, String str2, i0 pinalyticsContext, boolean z17, String str3) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        this.f98450a = z13;
        this.f98451b = z14;
        this.f98452c = z15;
        this.f98453d = actionId;
        this.f98454e = str;
        this.f98455f = z16;
        this.f98456g = str2;
        this.f98457h = pinalyticsContext;
        this.f98458i = z17;
        this.f98459j = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f98450a == rVar.f98450a && this.f98451b == rVar.f98451b && this.f98452c == rVar.f98452c && Intrinsics.d(this.f98453d, rVar.f98453d) && Intrinsics.d(this.f98454e, rVar.f98454e) && this.f98455f == rVar.f98455f && Intrinsics.d(this.f98456g, rVar.f98456g) && Intrinsics.d(this.f98457h, rVar.f98457h) && this.f98458i == rVar.f98458i && Intrinsics.d(this.f98459j, rVar.f98459j);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f98453d, ep.b.e(this.f98452c, ep.b.e(this.f98451b, Boolean.hashCode(this.f98450a) * 31, 31), 31), 31);
        String str = this.f98454e;
        int e13 = ep.b.e(this.f98455f, (d2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f98456g;
        int e14 = ep.b.e(this.f98458i, (this.f98457h.hashCode() + ((e13 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31);
        String str3 = this.f98459j;
        return e14 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MoreActionsMenuSideEffectRequest(isYourAccountTab=");
        sb3.append(this.f98450a);
        sb3.append(", showAppealButton=");
        sb3.append(this.f98451b);
        sb3.append(", showSelfHarmLink=");
        sb3.append(this.f98452c);
        sb3.append(", actionId=");
        sb3.append(this.f98453d);
        sb3.append(", userId=");
        sb3.append(this.f98454e);
        sb3.append(", attachmentEnabled=");
        sb3.append(this.f98455f);
        sb3.append(", objectId=");
        sb3.append(this.f98456g);
        sb3.append(", pinalyticsContext=");
        sb3.append(this.f98457h);
        sb3.append(", appealByCounterNoticeForm=");
        sb3.append(this.f98458i);
        sb3.append(", legalTakedownRequestId=");
        return a.a.p(sb3, this.f98459j, ")");
    }
}
