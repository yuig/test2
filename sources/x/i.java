package x;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* loaded from: classes2.dex */
public abstract class i extends o {
    @Override // x.o
    public final Surface e() {
        return ((OutputConfiguration) c()).getSurface();
    }
}
