package b1;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.PreviewView;
import c0.p1;
import com.google.common.util.concurrent.c0;
import kh2.m0;
import kh2.n3;

/* loaded from: classes2.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public Size f20811a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f20812b;

    /* renamed from: c, reason: collision with root package name */
    public final f f20813c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20814d = false;

    public n(PreviewView previewView, f fVar) {
        this.f20812b = previewView;
        this.f20813c = fVar;
    }

    public abstract View a();

    public abstract void b();

    public abstract void c();

    public abstract void d(p1 p1Var, l0.d dVar);

    public final void e() {
        View a13 = a();
        if (a13 == null || !this.f20814d) {
            return;
        }
        FrameLayout frameLayout = this.f20812b;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        f fVar = this.f20813c;
        fVar.getClass();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            m0.X0("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            return;
        }
        if (fVar.d()) {
            boolean z13 = false;
            if (a13 instanceof TextureView) {
                TextureView textureView = (TextureView) a13;
                com.bumptech.glide.d.v(null, fVar.d());
                RectF rectF = new RectF(0.0f, 0.0f, fVar.f20799a.getWidth(), fVar.f20799a.getHeight());
                textureView.setTransform(e0.u.a(!fVar.f20805g ? fVar.f20801c : -n3.K0(fVar.f20803e), rectF, rectF, false));
            } else {
                Display display = a13.getDisplay();
                boolean z14 = (!fVar.f20805g || display == null || display.getRotation() == fVar.f20803e) ? false : true;
                boolean z15 = fVar.f20805g;
                if (!z15) {
                    if ((!z15 ? fVar.f20801c : -n3.K0(fVar.f20803e)) != 0) {
                        z13 = true;
                    }
                }
                if (z14 || z13) {
                    m0.s("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            com.bumptech.glide.d.v(null, fVar.d());
            Matrix c13 = fVar.c(layoutDirection, size);
            RectF rectF2 = new RectF(0.0f, 0.0f, fVar.f20799a.getWidth(), fVar.f20799a.getHeight());
            c13.mapRect(rectF2);
            a13.setPivotX(0.0f);
            a13.setPivotY(0.0f);
            a13.setScaleX(rectF2.width() / fVar.f20799a.getWidth());
            a13.setScaleY(rectF2.height() / fVar.f20799a.getHeight());
            a13.setTranslationX(rectF2.left - a13.getLeft());
            a13.setTranslationY(rectF2.top - a13.getTop());
        }
    }

    public abstract c0 f();
}
