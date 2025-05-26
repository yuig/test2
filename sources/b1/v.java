package b1;

import a.o3;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import c0.p1;
import com.google.common.util.concurrent.c0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class v extends n {

    /* renamed from: e, reason: collision with root package name */
    public TextureView f20832e;

    /* renamed from: f, reason: collision with root package name */
    public SurfaceTexture f20833f;

    /* renamed from: g, reason: collision with root package name */
    public r4.l f20834g;

    /* renamed from: h, reason: collision with root package name */
    public p1 f20835h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20836i;

    /* renamed from: j, reason: collision with root package name */
    public SurfaceTexture f20837j;

    /* renamed from: k, reason: collision with root package name */
    public AtomicReference f20838k;

    /* renamed from: l, reason: collision with root package name */
    public l0.d f20839l;

    @Override // b1.n
    public final View a() {
        return this.f20832e;
    }

    @Override // b1.n
    public final void b() {
        if (!this.f20836i || this.f20837j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f20832e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f20837j;
        if (surfaceTexture != surfaceTexture2) {
            this.f20832e.setSurfaceTexture(surfaceTexture2);
            this.f20837j = null;
            this.f20836i = false;
        }
    }

    @Override // b1.n
    public final void c() {
        this.f20836i = true;
    }

    @Override // b1.n
    public final void d(p1 p1Var, l0.d dVar) {
        this.f20811a = p1Var.f24300b;
        this.f20839l = dVar;
        FrameLayout frameLayout = this.f20812b;
        frameLayout.getClass();
        this.f20811a.getClass();
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.f20832e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f20811a.getWidth(), this.f20811a.getHeight()));
        this.f20832e.setSurfaceTextureListener(new u(this, 0));
        frameLayout.removeAllViews();
        frameLayout.addView(this.f20832e);
        p1 p1Var2 = this.f20835h;
        if (p1Var2 != null) {
            p1Var2.d();
        }
        this.f20835h = p1Var;
        Executor c13 = d5.a.c(this.f20832e.getContext());
        p1Var.f24309k.a(new l0.e(28, this, p1Var), c13);
        g();
    }

    @Override // b1.n
    public final c0 f() {
        return com.bumptech.glide.d.L(new h(this));
    }

    public final void g() {
        SurfaceTexture surfaceTexture;
        Size size = this.f20811a;
        if (size == null || (surfaceTexture = this.f20833f) == null || this.f20835h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f20811a.getHeight());
        Surface surface = new Surface(this.f20833f);
        p1 p1Var = this.f20835h;
        r4.l L = com.bumptech.glide.d.L(new o3(13, this, surface));
        this.f20834g = L;
        L.f106128b.d(new w.b(this, surface, L, p1Var, 6), d5.a.c(this.f20832e.getContext()));
        this.f20814d = true;
        e();
    }
}
