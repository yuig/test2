package m62;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q0 extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f86042a;

    public q0(ArrayList value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f86042a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && Intrinsics.d(this.f86042a, ((q0) obj).f86042a);
    }

    public final int hashCode() {
        return this.f86042a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("PointsValueChanged(value="), this.f86042a, ")");
    }
}
