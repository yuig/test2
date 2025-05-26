package p02;

import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements m {

    /* renamed from: a, reason: collision with root package name */
    public final String f98416a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98417b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f98418c;

    /* renamed from: d, reason: collision with root package name */
    public final String f98419d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f98420e;

    public h(String actionId, String str, boolean z13, String str2, i0 pinalyticsContext) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        this.f98416a = actionId;
        this.f98417b = str;
        this.f98418c = z13;
        this.f98419d = str2;
        this.f98420e = pinalyticsContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f98416a, hVar.f98416a) && Intrinsics.d(this.f98417b, hVar.f98417b) && this.f98418c == hVar.f98418c && Intrinsics.d(this.f98419d, hVar.f98419d) && Intrinsics.d(this.f98420e, hVar.f98420e);
    }

    public final int hashCode() {
        int hashCode = this.f98416a.hashCode() * 31;
        String str = this.f98417b;
        int e13 = ep.b.e(this.f98418c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f98419d;
        return this.f98420e.hashCode() + ((e13 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DownloadPdfEvent(actionId=" + this.f98416a + ", userId=" + this.f98417b + ", isYourAccountTab=" + this.f98418c + ", objectId=" + this.f98419d + ", pinalyticsContext=" + this.f98420e + ")";
    }
}
