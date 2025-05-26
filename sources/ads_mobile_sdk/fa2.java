package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class fa2 implements cj.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f5090a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5091b;

    public fa2(String type, int i13) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f5090a = i13;
        this.f5091b = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa2)) {
            return false;
        }
        fa2 fa2Var = (fa2) obj;
        return this.f5090a == fa2Var.f5090a && Intrinsics.d(this.f5091b, fa2Var.f5091b);
    }

    @Override // cj.a
    public final int getAmount() {
        return this.f5090a;
    }

    @Override // cj.a
    public final String getType() {
        return this.f5091b;
    }

    public final int hashCode() {
        return this.f5091b.hashCode() + (Integer.hashCode(this.f5090a) * 31);
    }

    public final String toString() {
        return "RewardItemImpl(amount=" + this.f5090a + ", type=" + this.f5091b + ")";
    }
}
