package ww;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f131162a;

    public e(Object obj) {
        this.f131162a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f131162a, ((e) obj).f131162a);
    }

    public final int hashCode() {
        Object obj = this.f131162a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.f131162a + ")";
    }
}
