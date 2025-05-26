package y01;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f136499a;

    public v0(String screenshotPath) {
        Intrinsics.checkNotNullParameter(screenshotPath, "screenshotPath");
        this.f136499a = screenshotPath;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0) && Intrinsics.d(this.f136499a, ((v0) obj).f136499a);
    }

    public final int hashCode() {
        return this.f136499a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OnStartScreenshotObserver(screenshotPath="), this.f136499a, ")");
    }
}
