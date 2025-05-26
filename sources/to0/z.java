package to0;

import h32.c1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final c1 f118703a;

    public z(c1 c1Var) {
        this.f118703a = c1Var;
    }

    public final c1 a() {
        return this.f118703a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.d(this.f118703a, ((z) obj).f118703a);
    }

    public final int hashCode() {
        c1 c1Var = this.f118703a;
        if (c1Var == null) {
            return 0;
        }
        return c1Var.hashCode();
    }

    public final String toString() {
        return "PinLoggingEventData(data=" + this.f118703a + ")";
    }
}
