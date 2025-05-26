package d0;

import androidx.camera.core.impl.u2;
import c0.j0;

/* loaded from: classes2.dex */
public final class w implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f53579a;

    public w(long j13) {
        this.f53579a = j13;
    }

    @Override // c0.j0
    public final void c(e0.n nVar) {
        throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
    }

    @Override // c0.j0
    public final u2 f() {
        throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
    }

    @Override // c0.j0
    public final long h() {
        return this.f53579a;
    }
}
