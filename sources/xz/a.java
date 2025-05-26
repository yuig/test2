package xz;

import com.pinterest.api.adapter.coroutine.NetworkResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends NetworkResponse {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f136204a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Throwable error) {
        super(null);
        Intrinsics.checkNotNullParameter(error, "error");
        this.f136204a = error;
    }

    public final Throwable a() {
        return this.f136204a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f136204a, ((a) obj).f136204a);
    }

    public final int hashCode() {
        return this.f136204a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("Failure(error="), this.f136204a, ")");
    }
}
