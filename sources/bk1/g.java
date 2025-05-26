package bk1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements n {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f23226a;

    public g(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f23226a = pin;
    }

    public final f30 a() {
        return this.f23226a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f23226a, ((g) obj).f23226a);
    }

    public final int hashCode() {
        return this.f23226a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("GoToAppInstall(pin="), this.f23226a, ")");
    }
}
