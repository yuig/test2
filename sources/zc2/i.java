package zc2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final com.pinterest.widget.configuration.i f141625a;

    public i(com.pinterest.widget.configuration.i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f141625a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f141625a, ((i) obj).f141625a);
    }

    public final int hashCode() {
        return this.f141625a.hashCode();
    }

    public final String toString() {
        return "WrappedConfigurationEvent(event=" + this.f141625a + ")";
    }
}
