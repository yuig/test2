package zc2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Long f141624a;

    public h(Long l13) {
        this.f141624a = l13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f141624a, ((h) obj).f141624a);
    }

    public final int hashCode() {
        Long l13 = this.f141624a;
        if (l13 == null) {
            return 0;
        }
        return l13.hashCode();
    }

    public final String toString() {
        return "SelectedRefreshUpdated(refreshInterval=" + this.f141624a + ")";
    }
}
