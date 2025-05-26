package ah2;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends f {

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f15192c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15193d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z13, Throwable exception) {
        super(z13);
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f15192c = exception;
        this.f15193d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f15192c, bVar.f15192c) && this.f15193d == bVar.f15193d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15193d) + (this.f15192c.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Incomplete(exception=");
        sb3.append(this.f15192c);
        sb3.append(", retry=");
        return cb.m(sb3, this.f15193d, ')');
    }
}
