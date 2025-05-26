package m7;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* loaded from: classes.dex */
public final class i0 implements n8.i0, j8.e, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f86205a;

    public i0(l0 l0Var) {
        this.f86205a = l0Var;
    }

    public final void a() {
        this.f86205a.K0();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i13, int i14) {
        l0 l0Var = this.f86205a;
        l0Var.getClass();
        Surface surface = new Surface(surfaceTexture);
        l0Var.D0(surface);
        l0Var.U = surface;
        l0Var.t0(i13, i14);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        l0 l0Var = this.f86205a;
        l0Var.D0(null);
        l0Var.t0(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i13, int i14) {
        this.f86205a.t0(i13, i14);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i13, int i14, int i15) {
        this.f86205a.t0(i14, i15);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        l0 l0Var = this.f86205a;
        if (l0Var.X) {
            l0Var.D0(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        l0 l0Var = this.f86205a;
        if (l0Var.X) {
            l0Var.D0(null);
        }
        l0Var.t0(0, 0);
    }
}
