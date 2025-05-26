package tt0;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import om0.m1;

/* loaded from: classes5.dex */
public final class h implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f119115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f119116b;

    public h(k kVar, m1 m1Var) {
        this.f119115a = kVar;
        this.f119116b = m1Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i13, int i14) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        this.f119115a.f119139b.a(i13, i14);
        this.f119116b.invoke();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i13, int i14) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        this.f119115a.f119139b.a(i13, i14);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
    }
}
