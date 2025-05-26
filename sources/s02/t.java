package s02;

import a.cb;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t implements v {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f110349a;

    /* renamed from: b, reason: collision with root package name */
    public final String f110350b;

    /* renamed from: c, reason: collision with root package name */
    public final String f110351c;

    /* renamed from: d, reason: collision with root package name */
    public final String f110352d;

    /* renamed from: e, reason: collision with root package name */
    public final String f110353e;

    /* renamed from: f, reason: collision with root package name */
    public final String f110354f;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f110355g;

    public t(i0 pinalyticsContext, String actionId, String str, String str2, String str3, String str4, boolean z13) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        this.f110349a = z13;
        this.f110350b = actionId;
        this.f110351c = str;
        this.f110352d = str2;
        this.f110353e = str3;
        this.f110354f = str4;
        this.f110355g = pinalyticsContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f110349a == tVar.f110349a && Intrinsics.d(this.f110350b, tVar.f110350b) && Intrinsics.d(this.f110351c, tVar.f110351c) && Intrinsics.d(this.f110352d, tVar.f110352d) && Intrinsics.d(this.f110353e, tVar.f110353e) && Intrinsics.d(this.f110354f, tVar.f110354f) && Intrinsics.d(this.f110355g, tVar.f110355g);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f110350b, Boolean.hashCode(this.f110349a) * 31, 31);
        String str = this.f110351c;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f110352d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f110353e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f110354f;
        return this.f110355g.hashCode() + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SubmitFormEffectRequest(isYourAccountTab=" + this.f110349a + ", actionId=" + this.f110350b + ", userId=" + this.f110351c + ", explanation=" + this.f110352d + ", attachmentBase64=" + this.f110353e + ", objectId=" + this.f110354f + ", pinalyticsContext=" + this.f110355g + ")";
    }
}
