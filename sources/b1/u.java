package b1;

import android.graphics.SurfaceTexture;
import android.view.Display;
import android.view.TextureView;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import c0.m1;
import com.pinterest.feature.camera2.view.BaseCameraView;
import kh2.m0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20831b;

    public /* synthetic */ u(Object obj, int i13) {
        this.f20830a = i13;
        this.f20831b = obj;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture texture, int i13, int i14) {
        int i15 = this.f20830a;
        Object obj = this.f20831b;
        switch (i15) {
            case 0:
                m0.p("TextureViewImpl", "SurfaceTexture available. Size: " + i13 + "x" + i14);
                v vVar = (v) obj;
                vVar.f20833f = texture;
                if (vVar.f20834g == null) {
                    vVar.g();
                    break;
                } else {
                    vVar.f20835h.getClass();
                    m0.p("TextureViewImpl", "Surface invalidated " + vVar.f20835h);
                    vVar.f20835h.f24310l.a();
                    break;
                }
            case 1:
                Intrinsics.checkNotNullParameter(texture, "texture");
                BaseCameraView baseCameraView = (BaseCameraView) obj;
                FragmentActivity fragmentActivity = ((m81.d) baseCameraView.g()).f86531a;
                if (fragmentActivity != null) {
                    baseCameraView.n(fragmentActivity, i13, i14);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(texture, "surface");
                ((tt0.k) obj).f119139b.a(i13, i14);
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture texture) {
        switch (this.f20830a) {
            case 0:
                v vVar = (v) this.f20831b;
                vVar.f20833f = null;
                r4.l lVar = vVar.f20834g;
                if (lVar == null) {
                    m0.p("TextureViewImpl", "SurfaceTexture about to be destroyed");
                    break;
                } else {
                    g0.m.a(lVar, new m1(12, this, texture), d5.a.c(vVar.f20832e.getContext()));
                    vVar.f20837j = texture;
                    break;
                }
            case 1:
                Intrinsics.checkNotNullParameter(texture, "texture");
                break;
            default:
                Intrinsics.checkNotNullParameter(texture, "surface");
                break;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture texture, int i13, int i14) {
        Display defaultDisplay;
        int i15 = this.f20830a;
        Object obj = this.f20831b;
        switch (i15) {
            case 0:
                m0.p("TextureViewImpl", "SurfaceTexture size changed: " + i13 + "x" + i14);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(texture, "texture");
                BaseCameraView baseCameraView = (BaseCameraView) obj;
                FragmentActivity fragmentActivity = ((m81.d) baseCameraView.g()).f86531a;
                if (fragmentActivity != null) {
                    WindowManager windowManager = fragmentActivity.getWindowManager();
                    baseCameraView.setTransform(baseCameraView.c((windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) ? 0 : defaultDisplay.getRotation(), i13, i14, baseCameraView.e()));
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(texture, "surface");
                ((tt0.k) obj).f119139b.a(i13, i14);
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture texture) {
        switch (this.f20830a) {
            case 0:
                r4.i iVar = (r4.i) ((v) this.f20831b).f20838k.getAndSet(null);
                if (iVar != null) {
                    iVar.b(null);
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(texture, "texture");
                break;
            default:
                Intrinsics.checkNotNullParameter(texture, "surface");
                break;
        }
    }
}
