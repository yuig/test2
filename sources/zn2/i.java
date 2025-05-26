package zn2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f142319a;

    /* renamed from: b, reason: collision with root package name */
    public final long f142320b;

    public i(Object obj, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this.f142319a = obj;
        this.f142320b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f142319a, iVar.f142319a) && b.d(this.f142320b, iVar.f142320b);
    }

    public final int hashCode() {
        Object obj = this.f142319a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        a aVar = b.f142311b;
        return Long.hashCode(this.f142320b) + (hashCode * 31);
    }

    public final String toString() {
        return "TimedValue(value=" + this.f142319a + ", duration=" + ((Object) b.o(this.f142320b)) + ')';
    }
}
