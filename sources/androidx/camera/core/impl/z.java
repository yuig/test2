package androidx.camera.core.impl;

import android.hardware.camera2.CaptureResult;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public interface z {
    t C();

    default void c(e0.n nVar) {
        int i13;
        y p13 = p();
        if (p13 == y.UNKNOWN) {
            return;
        }
        int i14 = e0.j.f56714a[p13.ordinal()];
        if (i14 == 1) {
            i13 = 0;
        } else if (i14 == 2) {
            i13 = 32;
        } else {
            if (i14 != 3) {
                kh2.m0.X0("ExifData", "Unknown flash state: " + p13);
                return;
            }
            i13 = 1;
        }
        int i15 = i13 & 1;
        ArrayList arrayList = nVar.f56722a;
        if (i15 == 1) {
            nVar.c("LightSource", String.valueOf(4), arrayList);
        }
        nVar.c("Flash", String.valueOf(i13), arrayList);
    }

    u2 f();

    long h();

    y p();

    default CaptureResult r() {
        return null;
    }

    v t();

    x y();
}
