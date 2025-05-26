package ex1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i extends kh2.d {

    /* renamed from: a, reason: collision with root package name */
    public final List f60401a;

    /* renamed from: b, reason: collision with root package name */
    public final ww1.c f60402b;

    public i(List businessPins, ww1.c metricType) {
        Intrinsics.checkNotNullParameter(businessPins, "businessPins");
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        this.f60401a = businessPins;
        this.f60402b = metricType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f60401a, iVar.f60401a) && this.f60402b == iVar.f60402b;
    }

    public final int hashCode() {
        return this.f60402b.hashCode() + (this.f60401a.hashCode() * 31);
    }

    public final List r1() {
        return this.f60401a;
    }

    public final String toString() {
        return "Success(businessPins=" + this.f60401a + ", metricType=" + this.f60402b + ")";
    }
}
