package v21;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f123862a;

    /* renamed from: b, reason: collision with root package name */
    public final String f123863b;

    /* renamed from: c, reason: collision with root package name */
    public final String f123864c;

    /* renamed from: d, reason: collision with root package name */
    public final List f123865d;

    /* renamed from: e, reason: collision with root package name */
    public final List f123866e;

    /* renamed from: f, reason: collision with root package name */
    public final zy.a0 f123867f;

    public c(String experienceId, String title, String subtitle, List pinImageUrls, List pinIds, zy.a0 pinalyticsDisplayState) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(pinImageUrls, "pinImageUrls");
        Intrinsics.checkNotNullParameter(pinIds, "pinIds");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        this.f123862a = experienceId;
        this.f123863b = title;
        this.f123864c = subtitle;
        this.f123865d = pinImageUrls;
        this.f123866e = pinIds;
        this.f123867f = pinalyticsDisplayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f123862a, cVar.f123862a) && Intrinsics.d(this.f123863b, cVar.f123863b) && Intrinsics.d(this.f123864c, cVar.f123864c) && Intrinsics.d(this.f123865d, cVar.f123865d) && Intrinsics.d(this.f123866e, cVar.f123866e) && Intrinsics.d(this.f123867f, cVar.f123867f);
    }

    public final int hashCode() {
        return this.f123867f.hashCode() + ep.b.c(this.f123866e, ep.b.c(this.f123865d, cb.d(this.f123864c, cb.d(this.f123863b, this.f123862a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "PinOrSpinRewardPreviewDisplayState(experienceId=" + this.f123862a + ", title=" + this.f123863b + ", subtitle=" + this.f123864c + ", pinImageUrls=" + this.f123865d + ", pinIds=" + this.f123866e + ", pinalyticsDisplayState=" + this.f123867f + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(zy.a0 r8, int r9) {
        /*
            r7 = this;
            kotlin.collections.q0 r5 = kotlin.collections.q0.f80391a
            r9 = r9 & 32
            if (r9 == 0) goto Lb
            zy.a0 r8 = new zy.a0
            r8.<init>()
        Lb:
            r6 = r8
            java.lang.String r3 = ""
            r0 = r7
            r1 = r3
            r2 = r3
            r4 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v21.c.<init>(zy.a0, int):void");
    }
}
