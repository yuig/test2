package xj1;

import a.cb;
import jj1.d;
import kotlin.jvm.internal.Intrinsics;
import u50.n;

/* loaded from: classes2.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final n f135159a;

    /* renamed from: b, reason: collision with root package name */
    public final String f135160b;

    /* renamed from: c, reason: collision with root package name */
    public final String f135161c;

    public b(n cornerRadius, String videoStatusTitle, String videoStatusDescription) {
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        Intrinsics.checkNotNullParameter(videoStatusTitle, "videoStatusTitle");
        Intrinsics.checkNotNullParameter(videoStatusDescription, "videoStatusDescription");
        this.f135159a = cornerRadius;
        this.f135160b = videoStatusTitle;
        this.f135161c = videoStatusDescription;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f135159a, bVar.f135159a) && Intrinsics.d(this.f135160b, bVar.f135160b) && Intrinsics.d(this.f135161c, bVar.f135161c);
    }

    public final int hashCode() {
        return this.f135161c.hashCode() + cb.d(this.f135160b, this.f135159a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinVideoStatusOverlayDisplayState(cornerRadius=");
        sb3.append(this.f135159a);
        sb3.append(", videoStatusTitle=");
        sb3.append(this.f135160b);
        sb3.append(", videoStatusDescription=");
        return a.a.p(sb3, this.f135161c, ")");
    }
}
