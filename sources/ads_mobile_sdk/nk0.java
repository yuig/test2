package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class nk0 extends jk0 {

    /* renamed from: c, reason: collision with root package name */
    public final String f8836c;

    /* renamed from: d, reason: collision with root package name */
    public final yx0 f8837d;

    public /* synthetic */ nk0(String str) {
        this(str, yx0.f14443a);
    }

    @Override // ads_mobile_sdk.jk0
    public final yx0 a() {
        return this.f8837d;
    }

    public final String c() {
        return this.f8836c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk0)) {
            return false;
        }
        nk0 nk0Var = (nk0) obj;
        return Intrinsics.d(this.f8836c, nk0Var.f8836c) && this.f8837d == nk0Var.f8837d;
    }

    public final int hashCode() {
        return this.f8837d.hashCode() + (this.f8836c.hashCode() * 31);
    }

    public final String toString() {
        return "MessageError(message=" + this.f8836c + ", internalErrorCode=" + this.f8837d + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk0(String message, yx0 internalErrorCode) {
        super(internalErrorCode, 0);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(internalErrorCode, "internalErrorCode");
        this.f8836c = message;
        this.f8837d = internalErrorCode;
    }
}
