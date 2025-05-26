package y01;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements w {

    /* renamed from: a, reason: collision with root package name */
    public final String f136496a;

    public u(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f136496a = path;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f136496a, ((u) obj).f136496a);
    }

    public final int hashCode() {
        return this.f136496a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("StartScreenshotObserver(path="), this.f136496a, ")");
    }
}
