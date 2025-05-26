package y01;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements w {

    /* renamed from: a, reason: collision with root package name */
    public final String f136469a;

    public p(String screenshotPath) {
        Intrinsics.checkNotNullParameter(screenshotPath, "screenshotPath");
        this.f136469a = screenshotPath;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f136469a, ((p) obj).f136469a);
    }

    public final int hashCode() {
        return this.f136469a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("AddScreenshotToSilencedScreenshotList(screenshotPath="), this.f136469a, ")");
    }
}
