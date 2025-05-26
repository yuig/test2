package x;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* loaded from: classes2.dex */
public class k extends i {
    @Override // x.o
    public final void a(Surface surface) {
        ((OutputConfiguration) c()).addSurface(surface);
    }

    @Override // x.o
    public final void b() {
        ((OutputConfiguration) c()).enableSurfaceSharing();
    }

    @Override // x.o
    public Object c() {
        Object obj = this.f131254a;
        com.bumptech.glide.d.h(obj instanceof j);
        return ((j) obj).f131249a;
    }

    @Override // x.o
    public String d() {
        return ((j) this.f131254a).f131250b;
    }

    @Override // x.o
    public void f(long j13) {
        ((j) this.f131254a).f131251c = j13;
    }

    @Override // x.o
    public void h(String str) {
        ((j) this.f131254a).f131250b = str;
    }
}
