package dt0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final ha2.b f56229a;

    public c(ha2.a config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f56229a = config;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f56229a, ((c) obj).f56229a);
    }

    public final int hashCode() {
        return this.f56229a.hashCode();
    }

    public final String toString() {
        return "OnFilterButtonPressedEvent(config=" + this.f56229a + ")";
    }
}
