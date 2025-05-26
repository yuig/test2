package yx1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends e0.t {

    /* renamed from: m, reason: collision with root package name */
    public final jw1.b f140354m;

    public c(jw1.b adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f140354m = adapter;
    }

    public final jw1.b e1() {
        return this.f140354m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f140354m, ((c) obj).f140354m);
    }

    public final int hashCode() {
        return this.f140354m.hashCode();
    }

    public final String toString() {
        return "Success(adapter=" + this.f140354m + ")";
    }
}
