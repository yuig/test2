package x;

import android.hardware.camera2.params.OutputConfiguration;

/* loaded from: classes2.dex */
public class m extends k {
    @Override // x.k, x.o
    public Object c() {
        Object obj = this.f131254a;
        com.bumptech.glide.d.h(obj instanceof l);
        return ((l) obj).f131252a;
    }

    @Override // x.k, x.o
    public final String d() {
        return null;
    }

    @Override // x.k, x.o
    public void f(long j13) {
        ((l) this.f131254a).f131253b = j13;
    }

    @Override // x.k, x.o
    public final void h(String str) {
        ((OutputConfiguration) c()).setPhysicalCameraId(str);
    }
}
