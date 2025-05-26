package yx1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u extends gh0.b {

    /* renamed from: b, reason: collision with root package name */
    public final gw1.a f140410b;

    /* renamed from: c, reason: collision with root package name */
    public final List f140411c;

    /* renamed from: d, reason: collision with root package name */
    public final ww1.c f140412d;

    public u(gw1.g adapter, List metrics, ww1.c currentMetricType) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(currentMetricType, "currentMetricType");
        this.f140410b = adapter;
        this.f140411c = metrics;
        this.f140412d = currentMetricType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f140410b, uVar.f140410b) && Intrinsics.d(this.f140411c, uVar.f140411c) && this.f140412d == uVar.f140412d;
    }

    public final int hashCode() {
        return this.f140412d.hashCode() + ep.b.c(this.f140411c, this.f140410b.hashCode() * 31, 31);
    }

    public final gw1.a r0() {
        return this.f140410b;
    }

    public final ww1.c s0() {
        return this.f140412d;
    }

    public final List t0() {
        return this.f140411c;
    }

    public final String toString() {
        return "Success(adapter=" + this.f140410b + ", metrics=" + this.f140411c + ", currentMetricType=" + this.f140412d + ")";
    }
}
