package q5;

import android.os.Build;
import android.view.DisplayCutout;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f102459a;

    public i(DisplayCutout displayCutout) {
        this.f102459a = displayCutout;
    }

    public static i e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new i(displayCutout);
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return c5.y.e(this.f102459a);
        }
        return 0;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return c5.y.f(this.f102459a);
        }
        return 0;
    }

    public final int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return c5.y.g(this.f102459a);
        }
        return 0;
    }

    public final int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return c5.y.h(this.f102459a);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f102459a, ((i) obj).f102459a);
    }

    public final int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.f102459a;
        if (displayCutout == null) {
            return 0;
        }
        hashCode = displayCutout.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f102459a + "}";
    }
}
