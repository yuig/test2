package yf0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final h f138957a;

    public c(h insetMode) {
        Intrinsics.checkNotNullParameter(insetMode, "insetMode");
        this.f138957a = insetMode;
    }

    public final h a() {
        return this.f138957a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f138957a == ((c) obj).f138957a;
    }

    public final int hashCode() {
        return this.f138957a.hashCode();
    }

    public final String toString() {
        return "InsetsEnabled(insetMode=" + this.f138957a + ")";
    }
}
