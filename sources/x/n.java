package x;

import android.hardware.camera2.params.OutputConfiguration;

/* loaded from: classes2.dex */
public final class n extends m {
    @Override // x.m, x.k, x.o
    public final Object c() {
        Object obj = this.f131254a;
        com.bumptech.glide.d.h(obj instanceof OutputConfiguration);
        return obj;
    }

    @Override // x.m, x.k, x.o
    public final void f(long j13) {
        ((OutputConfiguration) c()).setDynamicRangeProfile(j13);
    }

    @Override // x.o
    public final void g(int i13) {
        ((OutputConfiguration) c()).setMirrorMode(i13);
    }

    @Override // x.o
    public final void i(long j13) {
        if (j13 == -1) {
            return;
        }
        ((OutputConfiguration) c()).setStreamUseCase(j13);
    }
}
