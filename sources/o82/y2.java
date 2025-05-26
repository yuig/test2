package o82;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y2 implements sq0.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final vq0.h f93762a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f93763b;

    public y2(vq0.h registryBinderMethods, Function1 vmStateToModelConverter) {
        Intrinsics.checkNotNullParameter(registryBinderMethods, "registryBinderMethods");
        Intrinsics.checkNotNullParameter(vmStateToModelConverter, "vmStateToModelConverter");
        this.f93762a = registryBinderMethods;
        this.f93763b = vmStateToModelConverter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        return Intrinsics.d(this.f93762a, y2Var.f93762a) && Intrinsics.d(this.f93763b, y2Var.f93763b);
    }

    public final int hashCode() {
        return this.f93763b.hashCode() + (this.f93762a.hashCode() * 31);
    }

    public final String toString() {
        return "LegacyMvpBinder(registryBinderMethods=" + this.f93762a + ", vmStateToModelConverter=" + this.f93763b + ")";
    }
}
