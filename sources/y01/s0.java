package y01;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f136492a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f136493b;

    public s0(String str, boolean z13) {
        this.f136492a = str;
        this.f136493b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Intrinsics.d(this.f136492a, s0Var.f136492a) && this.f136493b == s0Var.f136493b;
    }

    public final int hashCode() {
        String str = this.f136492a;
        return Boolean.hashCode(this.f136493b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "OnScreenshotDetected(screenshotPath=" + this.f136492a + ", isSilencedScreenshot=" + this.f136493b + ")";
    }
}
