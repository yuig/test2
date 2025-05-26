package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class dt1 {

    /* renamed from: a, reason: collision with root package name */
    public final ct1 f4433a;

    /* renamed from: b, reason: collision with root package name */
    public final lu1 f4434b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4435c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4436d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4437e;

    public dt1(ct1 mediaType, lu1 videoEventsOwner, boolean z13, String omidPartnerName, String omidHtml) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(videoEventsOwner, "videoEventsOwner");
        Intrinsics.checkNotNullParameter(omidPartnerName, "omidPartnerName");
        Intrinsics.checkNotNullParameter(omidHtml, "omidHtml");
        this.f4433a = mediaType;
        this.f4434b = videoEventsOwner;
        this.f4435c = z13;
        this.f4436d = omidPartnerName;
        this.f4437e = omidHtml;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt1)) {
            return false;
        }
        dt1 dt1Var = (dt1) obj;
        return this.f4433a == dt1Var.f4433a && this.f4434b == dt1Var.f4434b && this.f4435c == dt1Var.f4435c && Intrinsics.d(this.f4436d, dt1Var.f4436d) && Intrinsics.d(this.f4437e, dt1Var.f4437e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.f4434b.hashCode() + (this.f4433a.hashCode() * 31)) * 31;
        boolean z13 = this.f4435c;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        return this.f4437e.hashCode() + kh2.j1.t((hashCode + i13) * 31, this.f4436d);
    }

    public final String toString() {
        ct1 ct1Var = this.f4433a;
        lu1 lu1Var = this.f4434b;
        boolean z13 = this.f4435c;
        String str = this.f4436d;
        String str2 = this.f4437e;
        StringBuilder sb3 = new StringBuilder("OmidSettings(mediaType=");
        sb3.append(ct1Var);
        sb3.append(", videoEventsOwner=");
        sb3.append(lu1Var);
        sb3.append(", javascriptSessionServiceEnabled=");
        sb3.append(z13);
        sb3.append(", omidPartnerName=");
        sb3.append(str);
        sb3.append(", omidHtml=");
        return a.a.p(sb3, str2, ")");
    }
}
