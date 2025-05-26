package o82;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a3 implements x2 {

    /* renamed from: a, reason: collision with root package name */
    public final yq0.f f93530a;

    /* renamed from: b, reason: collision with root package name */
    public final b f93531b;

    /* renamed from: c, reason: collision with root package name */
    public final q f93532c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f93533d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.t1 f93534e;

    public a3(yq0.f viewCreator, b displayStateBinder, q itemViewModelCreator, Function1 vmStateConverter, androidx.lifecycle.t1 viewModelStore) {
        Intrinsics.checkNotNullParameter(viewCreator, "viewCreator");
        Intrinsics.checkNotNullParameter(displayStateBinder, "displayStateBinder");
        Intrinsics.checkNotNullParameter(itemViewModelCreator, "itemViewModelCreator");
        Intrinsics.checkNotNullParameter(vmStateConverter, "vmStateConverter");
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        this.f93530a = viewCreator;
        this.f93531b = displayStateBinder;
        this.f93532c = itemViewModelCreator;
        this.f93533d = vmStateConverter;
        this.f93534e = viewModelStore;
    }

    @Override // o82.x2
    public final yq0.f a() {
        return this.f93530a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        return Intrinsics.d(this.f93530a, a3Var.f93530a) && Intrinsics.d(this.f93531b, a3Var.f93531b) && Intrinsics.d(this.f93532c, a3Var.f93532c) && Intrinsics.d(this.f93533d, a3Var.f93533d) && Intrinsics.d(this.f93534e, a3Var.f93534e);
    }

    public final int hashCode() {
        return this.f93534e.hashCode() + d7.g.c(this.f93533d, (this.f93532c.hashCode() + ((this.f93531b.hashCode() + (this.f93530a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "SBAdapterMethods(viewCreator=" + this.f93530a + ", displayStateBinder=" + this.f93531b + ", itemViewModelCreator=" + this.f93532c + ", vmStateConverter=" + this.f93533d + ", viewModelStore=" + this.f93534e + ")";
    }
}
