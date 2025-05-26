package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ok0 extends jk0 {

    /* renamed from: c, reason: collision with root package name */
    public final String f9325c;

    public /* synthetic */ ok0() {
        this(oc0.f9212b.a());
    }

    public final String c() {
        return this.f9325c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ok0) && Intrinsics.d(this.f9325c, ((ok0) obj).f9325c);
    }

    public final int hashCode() {
        return this.f9325c.hashCode();
    }

    public final String toString() {
        return a.a.k("NoFillError(message=", this.f9325c, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok0(String message) {
        super(yx0.f14445c, 0);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f9325c = message;
    }
}
