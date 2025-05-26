package xz;

import com.pinterest.api.adapter.coroutine.NetworkResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends NetworkResponse {

    /* renamed from: a, reason: collision with root package name */
    public final Object f136205a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Object value) {
        super(null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.f136205a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f136205a, ((b) obj).f136205a);
    }

    public final int hashCode() {
        return this.f136205a.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.f136205a + ")";
    }
}
