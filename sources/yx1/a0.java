package yx1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0 extends jk.v {

    /* renamed from: b, reason: collision with root package name */
    public final jw1.b f140350b;

    public a0(wx1.b adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f140350b = adapter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.f140350b, ((a0) obj).f140350b);
    }

    public final jw1.b g0() {
        return this.f140350b;
    }

    public final int hashCode() {
        return this.f140350b.hashCode();
    }

    public final String toString() {
        return "Success(adapter=" + this.f140350b + ")";
    }
}
