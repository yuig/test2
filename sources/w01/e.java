package w01;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f126995a;

    public e(String str) {
        this.f126995a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f126995a, ((e) obj).f126995a);
    }

    public final int hashCode() {
        String str = this.f126995a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PinCloseupExtraTrackingData(feedTrackingParam="), this.f126995a, ")");
    }
}
