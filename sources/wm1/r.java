package wm1;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r extends s {

    /* renamed from: d, reason: collision with root package name */
    public final u50.i0 f130327d;

    /* renamed from: e, reason: collision with root package name */
    public final Date f130328e;

    /* renamed from: f, reason: collision with root package name */
    public final u50.i0 f130329f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f130330g;

    /* renamed from: h, reason: collision with root package name */
    public final int f130331h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r(u50.f0 r2, java.util.Date r3, u50.f0 r4, boolean r5, int r6) {
        /*
            r1 = this;
            r0 = r6 & 4
            if (r0 == 0) goto L6
            u50.h0 r4 = u50.h0.f120562a
        L6:
            r6 = r6 & 8
            if (r6 == 0) goto Lb
            r5 = 0
        Lb:
            java.lang.String r6 = "subHeaderText"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
            java.lang.String r6 = "timestamp"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r6)
            java.lang.String r6 = "headerText"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r6)
            r1.<init>(r4, r2, r5)
            r1.f130327d = r2
            r1.f130328e = r3
            r1.f130329f = r4
            r1.f130330g = r5
            r2 = 100
            r1.f130331h = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wm1.r.<init>(u50.f0, java.util.Date, u50.f0, boolean, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f130327d, rVar.f130327d) && Intrinsics.d(this.f130328e, rVar.f130328e) && Intrinsics.d(this.f130329f, rVar.f130329f) && this.f130330g == rVar.f130330g && this.f130331h == rVar.f130331h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f130331h) + ep.b.e(this.f130330g, ep.b.d(this.f130329f, (this.f130328e.hashCode() + (this.f130327d.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NotificationDisplayState(subHeaderText=");
        sb3.append(this.f130327d);
        sb3.append(", timestamp=");
        sb3.append(this.f130328e);
        sb3.append(", headerText=");
        sb3.append(this.f130329f);
        sb3.append(", supportLinks=");
        sb3.append(this.f130330g);
        sb3.append(", subtextMaxLines=");
        return a.a.n(sb3, this.f130331h, ")");
    }
}
