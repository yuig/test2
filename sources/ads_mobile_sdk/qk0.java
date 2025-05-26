package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class qk0 extends jk0 {

    /* renamed from: c, reason: collision with root package name */
    public final String f10114c;

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f10115d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk0(String message, Throwable th3) {
        super(yx0.f14452j, 0);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f10114c = message;
        this.f10115d = th3;
    }

    @Override // ads_mobile_sdk.jk0
    public final Throwable b() {
        return this.f10115d;
    }

    public final String c() {
        return this.f10114c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk0)) {
            return false;
        }
        qk0 qk0Var = (qk0) obj;
        return Intrinsics.d(this.f10114c, qk0Var.f10114c) && Intrinsics.d(this.f10115d, qk0Var.f10115d);
    }

    public final int hashCode() {
        int hashCode = this.f10114c.hashCode() * 31;
        Throwable th3 = this.f10115d;
        return hashCode + (th3 == null ? 0 : th3.hashCode());
    }

    public final String toString() {
        return "TimeoutError(message=" + this.f10114c + ", exception=" + this.f10115d + ")";
    }

    public /* synthetic */ qk0(TimeoutCancellationException timeoutCancellationException, int i13) {
        this(oc0.f9213c.a(), (i13 & 2) != 0 ? null : timeoutCancellationException);
    }
}
