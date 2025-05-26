package p02;

import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p implements t {

    /* renamed from: a, reason: collision with root package name */
    public final String f98443a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98444b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f98445c;

    /* renamed from: d, reason: collision with root package name */
    public final String f98446d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f98447e;

    public p(String actionId, String str, boolean z13, String str2, i0 pinalyticsContext) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        this.f98443a = actionId;
        this.f98444b = str;
        this.f98445c = z13;
        this.f98446d = str2;
        this.f98447e = pinalyticsContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f98443a, pVar.f98443a) && Intrinsics.d(this.f98444b, pVar.f98444b) && this.f98445c == pVar.f98445c && Intrinsics.d(this.f98446d, pVar.f98446d) && Intrinsics.d(this.f98447e, pVar.f98447e);
    }

    public final int hashCode() {
        int hashCode = this.f98443a.hashCode() * 31;
        String str = this.f98444b;
        int e13 = ep.b.e(this.f98445c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f98446d;
        return this.f98447e.hashCode() + ((e13 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DownloadPdfSideEffectRequest(actionId=" + this.f98443a + ", userId=" + this.f98444b + ", isYourAccountTab=" + this.f98445c + ", objectId=" + this.f98446d + ", pinalyticsContext=" + this.f98447e + ")";
    }
}
