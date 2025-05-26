package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class kk0 extends jk0 {

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f7342c;

    /* renamed from: d, reason: collision with root package name */
    public final yx0 f7343d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7344e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk0(Throwable exception, yx0 internalErrorCode, String str) {
        super(internalErrorCode, 0);
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(internalErrorCode, "internalErrorCode");
        this.f7342c = exception;
        this.f7343d = internalErrorCode;
        this.f7344e = str;
    }

    @Override // ads_mobile_sdk.jk0
    public final yx0 a() {
        return this.f7343d;
    }

    @Override // ads_mobile_sdk.jk0
    public final Throwable b() {
        return this.f7342c;
    }

    public final Throwable c() {
        return this.f7342c;
    }

    public final String d() {
        return this.f7344e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk0)) {
            return false;
        }
        kk0 kk0Var = (kk0) obj;
        return Intrinsics.d(this.f7342c, kk0Var.f7342c) && this.f7343d == kk0Var.f7343d && Intrinsics.d(this.f7344e, kk0Var.f7344e);
    }

    public final int hashCode() {
        int hashCode = (this.f7343d.hashCode() + (this.f7342c.hashCode() * 31)) * 31;
        String str = this.f7344e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        Throwable th3 = this.f7342c;
        yx0 yx0Var = this.f7343d;
        String str = this.f7344e;
        StringBuilder sb3 = new StringBuilder("ExceptionError(exception=");
        sb3.append(th3);
        sb3.append(", internalErrorCode=");
        sb3.append(yx0Var);
        sb3.append(", message=");
        return a.a.p(sb3, str, ")");
    }

    public /* synthetic */ kk0(Throwable th3, yx0 yx0Var, String str, int i13) {
        this(th3, (i13 & 2) != 0 ? yx0.f14443a : yx0Var, (i13 & 4) != 0 ? null : str);
    }
}
