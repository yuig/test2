package y9;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f138092a;

    /* renamed from: b, reason: collision with root package name */
    public long f138093b;

    /* renamed from: c, reason: collision with root package name */
    public long f138094c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f138095d;

    public d(ArrayList states) {
        Intrinsics.checkNotNullParameter(states, "states");
        this.f138092a = states;
        this.f138093b = 0L;
        this.f138094c = 0L;
        this.f138095d = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.metrics.performance.FrameData");
        d dVar = (d) obj;
        return this.f138093b == dVar.f138093b && this.f138094c == dVar.f138094c && this.f138095d == dVar.f138095d && Intrinsics.d(this.f138092a, dVar.f138092a);
    }

    public int hashCode() {
        return this.f138092a.hashCode() + ep.b.e(this.f138095d, a.a.c(this.f138094c, Long.hashCode(this.f138093b) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("FrameData(frameStartNanos=");
        sb3.append(this.f138093b);
        sb3.append(", frameDurationUiNanos=");
        sb3.append(this.f138094c);
        sb3.append(", isJank=");
        sb3.append(this.f138095d);
        sb3.append(", states=");
        return d7.g.k(sb3, this.f138092a, ')');
    }
}
