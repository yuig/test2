package xe1;

import c0.s0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends s0 {

    /* renamed from: b, reason: collision with root package name */
    public final h f134732b;

    /* renamed from: c, reason: collision with root package name */
    public final List f134733c;

    /* renamed from: d, reason: collision with root package name */
    public final int f134734d;

    /* renamed from: e, reason: collision with root package name */
    public final int f134735e;

    /* renamed from: f, reason: collision with root package name */
    public final float f134736f;

    /* renamed from: g, reason: collision with root package name */
    public final int f134737g;

    /* renamed from: h, reason: collision with root package name */
    public final int f134738h;

    /* renamed from: i, reason: collision with root package name */
    public final float f134739i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j(java.util.ArrayList r6) {
        /*
            r5 = this;
            xe1.h r0 = xe1.h.AVATAR_STACK
            int r1 = xe1.v.f134801p
            int r2 = xe1.v.f134784b
            int r3 = xe1.v.f134802q
            java.lang.String r4 = "viewType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.String r4 = "avatarImages"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r4)
            r5.<init>(r0)
            r5.f134732b = r0
            r5.f134733c = r6
            r5.f134734d = r1
            r6 = 3
            r5.f134735e = r6
            r6 = 1051260355(0x3ea8f5c3, float:0.33)
            r5.f134736f = r6
            r5.f134737g = r2
            r5.f134738h = r3
            r5.f134739i = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xe1.j.<init>(java.util.ArrayList):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f134732b == jVar.f134732b && Intrinsics.d(this.f134733c, jVar.f134733c) && this.f134734d == jVar.f134734d && this.f134735e == jVar.f134735e && Float.compare(this.f134736f, jVar.f134736f) == 0 && this.f134737g == jVar.f134737g && this.f134738h == jVar.f134738h && Float.compare(this.f134739i, jVar.f134739i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f134739i) + ep.b.b(this.f134738h, ep.b.b(this.f134737g, a.a.a(this.f134736f, ep.b.b(this.f134735e, ep.b.b(this.f134734d, ep.b.c(this.f134733c, this.f134732b.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AvatarStackViewModel(viewType=");
        sb3.append(this.f134732b);
        sb3.append(", avatarImages=");
        sb3.append(this.f134733c);
        sb3.append(", avatarSize=");
        sb3.append(this.f134734d);
        sb3.append(", maxNumChips=");
        sb3.append(this.f134735e);
        sb3.append(", avatarOverlap=");
        sb3.append(this.f134736f);
        sb3.append(", borderColor=");
        sb3.append(this.f134737g);
        sb3.append(", borderWidth=");
        sb3.append(this.f134738h);
        sb3.append(", overlapPercentage=");
        return d7.g.i(sb3, this.f134739i, ")");
    }
}
