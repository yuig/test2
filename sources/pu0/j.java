package pu0;

import com.pinterest.api.model.uq;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f101391a;

    /* renamed from: b, reason: collision with root package name */
    public final uq f101392b;

    /* renamed from: c, reason: collision with root package name */
    public final long f101393c;

    /* renamed from: d, reason: collision with root package name */
    public final long f101394d;

    /* renamed from: e, reason: collision with root package name */
    public final long f101395e;

    public j(String overlayId, uq overlayType, long j13, long j14, long j15) {
        Intrinsics.checkNotNullParameter(overlayId, "overlayId");
        Intrinsics.checkNotNullParameter(overlayType, "overlayType");
        this.f101391a = overlayId;
        this.f101392b = overlayType;
        this.f101393c = j13;
        this.f101394d = j14;
        this.f101395e = j15;
    }

    public final long a() {
        return this.f101394d;
    }

    public final long b() {
        return this.f101395e;
    }

    public final String c() {
        return this.f101391a;
    }

    public final uq d() {
        return this.f101392b;
    }

    public final long e() {
        return this.f101393c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f101391a, jVar.f101391a) && this.f101392b == jVar.f101392b && this.f101393c == jVar.f101393c && this.f101394d == jVar.f101394d && this.f101395e == jVar.f101395e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f101395e) + a.a.c(this.f101394d, a.a.c(this.f101393c, (this.f101392b.hashCode() + (this.f101391a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OverlayDurationViewModel(overlayId=");
        sb3.append(this.f101391a);
        sb3.append(", overlayType=");
        sb3.append(this.f101392b);
        sb3.append(", startTimeMs=");
        sb3.append(this.f101393c);
        sb3.append(", endTimeMs=");
        sb3.append(this.f101394d);
        sb3.append(", mediaDurationMs=");
        return a.a.o(sb3, this.f101395e, ")");
    }
}
