package h32;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a1 {

    /* renamed from: c, reason: collision with root package name */
    public static final vb0.i f66828c = new vb0.i(5);

    /* renamed from: a, reason: collision with root package name */
    public final List f66829a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f66830b;

    public a1(List list, Long l13) {
        this.f66829a = list;
        this.f66830b = l13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return Intrinsics.d(this.f66829a, a1Var.f66829a) && Intrinsics.d(this.f66830b, a1Var.f66830b);
    }

    public final int hashCode() {
        List list = this.f66829a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l13 = this.f66830b;
        return hashCode + (l13 != null ? l13.hashCode() : 0);
    }

    public final String toString() {
        return "EventBatch(events=" + this.f66829a + ", reportTime=" + this.f66830b + ")";
    }
}
