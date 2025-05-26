package x;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final e f131247a;

    public g(e eVar) {
        this.f131247a = eVar;
    }

    public static g a(InputConfiguration inputConfiguration) {
        if (inputConfiguration == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new g(new f(inputConfiguration)) : new g(new e(inputConfiguration));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f131247a.equals(((g) obj).f131247a);
    }

    public final int hashCode() {
        return this.f131247a.hashCode();
    }

    public final String toString() {
        return this.f131247a.toString();
    }
}
