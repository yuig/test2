package m7;

import android.media.MediaFormat;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;

/* loaded from: classes.dex */
public final class j0 implements n8.v, o8.a, q1 {

    /* renamed from: a, reason: collision with root package name */
    public n8.v f86217a;

    /* renamed from: b, reason: collision with root package name */
    public o8.a f86218b;

    /* renamed from: c, reason: collision with root package name */
    public o8.i f86219c;

    /* renamed from: d, reason: collision with root package name */
    public o8.i f86220d;

    @Override // o8.a
    public final void a(long j13, float[] fArr) {
        o8.i iVar = this.f86220d;
        if (iVar != null) {
            iVar.a(j13, fArr);
        }
        o8.a aVar = this.f86218b;
        if (aVar != null) {
            aVar.a(j13, fArr);
        }
    }

    @Override // m7.q1
    public final void b(int i13, Object obj) {
        if (i13 == 7) {
            this.f86217a = (n8.v) obj;
            return;
        }
        if (i13 == 8) {
            this.f86218b = (o8.a) obj;
            return;
        }
        if (i13 != 10000) {
            return;
        }
        SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
        if (sphericalGLSurfaceView == null) {
            this.f86219c = null;
            this.f86220d = null;
        } else {
            this.f86219c = sphericalGLSurfaceView.c();
            this.f86220d = sphericalGLSurfaceView.b();
        }
    }

    @Override // o8.a
    public final void c() {
        o8.i iVar = this.f86220d;
        if (iVar != null) {
            iVar.c();
        }
        o8.a aVar = this.f86218b;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // n8.v
    public final void d(long j13, long j14, androidx.media3.common.b bVar, MediaFormat mediaFormat) {
        o8.i iVar = this.f86219c;
        if (iVar != null) {
            iVar.d(j13, j14, bVar, mediaFormat);
        }
        n8.v vVar = this.f86217a;
        if (vVar != null) {
            vVar.d(j13, j14, bVar, mediaFormat);
        }
    }
}
