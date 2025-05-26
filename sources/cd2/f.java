package cd2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final com.pinterest.widget.configuration.i f27555a;

    public f(com.pinterest.widget.configuration.i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f27555a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f27555a, ((f) obj).f27555a);
    }

    public final int hashCode() {
        return this.f27555a.hashCode();
    }

    public final String toString() {
        return "WrappedConfigurationEvent(event=" + this.f27555a + ")";
    }
}
