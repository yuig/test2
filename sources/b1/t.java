package b1;

import a.a4;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.PreviewView;
import c0.p1;
import com.google.common.util.concurrent.c0;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class t extends n {

    /* renamed from: e, reason: collision with root package name */
    public SurfaceView f20828e;

    /* renamed from: f, reason: collision with root package name */
    public final s f20829f;

    public t(PreviewView previewView, f fVar) {
        super(previewView, fVar);
        this.f20829f = new s(this);
    }

    @Override // b1.n
    public final View a() {
        return this.f20828e;
    }

    @Override // b1.n
    public final void b() {
    }

    @Override // b1.n
    public final void c() {
    }

    @Override // b1.n
    public final void d(p1 p1Var, final l0.d dVar) {
        SurfaceView surfaceView = this.f20828e;
        boolean equals = Objects.equals(this.f20811a, p1Var.f24300b);
        if (surfaceView == null || !equals) {
            this.f20811a = p1Var.f24300b;
            FrameLayout frameLayout = this.f20812b;
            frameLayout.getClass();
            this.f20811a.getClass();
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.f20828e = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(this.f20811a.getWidth(), this.f20811a.getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.f20828e);
            this.f20828e.getHolder().addCallback(this.f20829f);
        }
        Executor c13 = d5.a.c(this.f20828e.getContext());
        p1Var.f24309k.a(new Runnable() { // from class: b1.q
            @Override // java.lang.Runnable
            public final void run() {
                l0.d.this.b();
            }
        }, c13);
        this.f20828e.post(new a4(this, p1Var, dVar, 19));
    }

    @Override // b1.n
    public final c0 f() {
        return g0.m.e(null);
    }
}
