package s02;

import a.cb;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q implements r {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f110340a;

    /* renamed from: b, reason: collision with root package name */
    public final String f110341b;

    /* renamed from: c, reason: collision with root package name */
    public final String f110342c;

    /* renamed from: d, reason: collision with root package name */
    public final String f110343d;

    /* renamed from: e, reason: collision with root package name */
    public final String f110344e;

    /* renamed from: f, reason: collision with root package name */
    public final String f110345f;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f110346g;

    public q(i0 pinalyticsContext, String actionId, String str, String str2, String str3, String str4, boolean z13) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        this.f110340a = z13;
        this.f110341b = actionId;
        this.f110342c = str;
        this.f110343d = str2;
        this.f110344e = str3;
        this.f110345f = str4;
        this.f110346g = pinalyticsContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f110340a == qVar.f110340a && Intrinsics.d(this.f110341b, qVar.f110341b) && Intrinsics.d(this.f110342c, qVar.f110342c) && Intrinsics.d(this.f110343d, qVar.f110343d) && Intrinsics.d(this.f110344e, qVar.f110344e) && Intrinsics.d(this.f110345f, qVar.f110345f) && Intrinsics.d(this.f110346g, qVar.f110346g);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f110341b, Boolean.hashCode(this.f110340a) * 31, 31);
        String str = this.f110342c;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f110343d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f110344e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f110345f;
        return this.f110346g.hashCode() + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SubmitPressed(isYourAccountTab=" + this.f110340a + ", actionId=" + this.f110341b + ", userId=" + this.f110342c + ", explanation=" + this.f110343d + ", attachmentBase64=" + this.f110344e + ", objectId=" + this.f110345f + ", pinalyticsContext=" + this.f110346g + ")";
    }
}
