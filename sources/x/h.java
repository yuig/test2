package x;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final o f131248a;

    public h(int i13, Surface surface) {
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            this.f131248a = new n(new OutputConfiguration(i13, surface));
        } else if (i14 >= 28) {
            this.f131248a = new m(new l(new OutputConfiguration(i13, surface)));
        } else {
            this.f131248a = new k(new j(new OutputConfiguration(i13, surface)));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        return this.f131248a.equals(((h) obj).f131248a);
    }

    public final int hashCode() {
        return this.f131248a.hashCode();
    }

    public h(k kVar) {
        this.f131248a = kVar;
    }
}
