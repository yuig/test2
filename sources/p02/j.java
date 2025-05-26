package p02;

import a.cb;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f98423a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f98424b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f98425c;

    /* renamed from: d, reason: collision with root package name */
    public final String f98426d;

    /* renamed from: e, reason: collision with root package name */
    public final String f98427e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f98428f;

    /* renamed from: g, reason: collision with root package name */
    public final String f98429g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f98430h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f98431i;

    /* renamed from: j, reason: collision with root package name */
    public final String f98432j;

    public j(boolean z13, boolean z14, boolean z15, String actionId, String str, boolean z16, String str2, i0 pinalyticsContext, boolean z17, String str3) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        this.f98423a = z13;
        this.f98424b = z14;
        this.f98425c = z15;
        this.f98426d = actionId;
        this.f98427e = str;
        this.f98428f = z16;
        this.f98429g = str2;
        this.f98430h = pinalyticsContext;
        this.f98431i = z17;
        this.f98432j = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f98423a == jVar.f98423a && this.f98424b == jVar.f98424b && this.f98425c == jVar.f98425c && Intrinsics.d(this.f98426d, jVar.f98426d) && Intrinsics.d(this.f98427e, jVar.f98427e) && this.f98428f == jVar.f98428f && Intrinsics.d(this.f98429g, jVar.f98429g) && Intrinsics.d(this.f98430h, jVar.f98430h) && this.f98431i == jVar.f98431i && Intrinsics.d(this.f98432j, jVar.f98432j);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f98426d, ep.b.e(this.f98425c, ep.b.e(this.f98424b, Boolean.hashCode(this.f98423a) * 31, 31), 31), 31);
        String str = this.f98427e;
        int e13 = ep.b.e(this.f98428f, (d2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f98429g;
        int e14 = ep.b.e(this.f98431i, (this.f98430h.hashCode() + ((e13 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31);
        String str3 = this.f98432j;
        return e14 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MoreActionsMenuClickEvent(isYourAccountTab=");
        sb3.append(this.f98423a);
        sb3.append(", showAppealButton=");
        sb3.append(this.f98424b);
        sb3.append(", showSelfHarmLink=");
        sb3.append(this.f98425c);
        sb3.append(", actionId=");
        sb3.append(this.f98426d);
        sb3.append(", userId=");
        sb3.append(this.f98427e);
        sb3.append(", attachmentEnabled=");
        sb3.append(this.f98428f);
        sb3.append(", objectId=");
        sb3.append(this.f98429g);
        sb3.append(", pinalyticsContext=");
        sb3.append(this.f98430h);
        sb3.append(", appealByCounterNoticeForm=");
        sb3.append(this.f98431i);
        sb3.append(", legalTakedownRequestId=");
        return a.a.p(sb3, this.f98432j, ")");
    }
}
