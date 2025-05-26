package s7;

import android.os.Looper;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import n7.q0;

/* loaded from: classes.dex */
public final class o implements q {
    @Override // s7.q
    public final j c(m mVar, androidx.media3.common.b bVar) {
        if (bVar.f18769s == null) {
            return null;
        }
        return new s(new DrmSession$DrmSessionException(6001, new UnsupportedDrmException()));
    }

    @Override // s7.q
    public final int d(androidx.media3.common.b bVar) {
        return bVar.f18769s != null ? 1 : 0;
    }

    @Override // s7.q
    public final void e(Looper looper, q0 q0Var) {
    }
}
