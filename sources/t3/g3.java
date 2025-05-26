package t3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;

/* loaded from: classes2.dex */
public final class g3 implements i2 {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f116006g = true;

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f116007a;

    /* renamed from: b, reason: collision with root package name */
    public int f116008b;

    /* renamed from: c, reason: collision with root package name */
    public int f116009c;

    /* renamed from: d, reason: collision with root package name */
    public int f116010d;

    /* renamed from: e, reason: collision with root package name */
    public int f116011e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f116012f;

    public g3(c0 c0Var) {
        RenderNode create = RenderNode.create("Compose", c0Var);
        this.f116007a = create;
        if (f116006g) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                n3 n3Var = n3.f116103a;
                n3Var.c(create, n3Var.a(create));
                n3Var.d(create, n3Var.b(create));
            }
            m3.f116092a.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            f116006g = false;
        }
    }

    @Override // t3.i2
    public final void A(Matrix matrix) {
        this.f116007a.getMatrix(matrix);
    }

    @Override // t3.i2
    public final void B(int i13) {
        this.f116008b += i13;
        this.f116010d += i13;
        this.f116007a.offsetLeftAndRight(i13);
    }

    @Override // t3.i2
    public final void C(h1.b bVar, b3.o0 o0Var, k3 k3Var) {
        int j13 = j();
        int i13 = i();
        RenderNode renderNode = this.f116007a;
        DisplayListCanvas start = renderNode.start(j13, i13);
        Canvas t13 = bVar.b().t();
        bVar.b().u((Canvas) start);
        b3.d b13 = bVar.b();
        if (o0Var != null) {
            b13.j();
            b13.d(o0Var, 1);
        }
        k3Var.invoke(b13);
        if (o0Var != null) {
            b13.restore();
        }
        bVar.b().u(t13);
        renderNode.end(start);
    }

    @Override // t3.i2
    public final int D() {
        return this.f116011e;
    }

    @Override // t3.i2
    public final void E(float f13) {
        this.f116007a.setPivotX(f13);
    }

    @Override // t3.i2
    public final void F(float f13) {
        this.f116007a.setPivotY(f13);
    }

    @Override // t3.i2
    public final void G(Outline outline) {
        this.f116007a.setOutline(outline);
    }

    @Override // t3.i2
    public final void H(int i13) {
        if (Build.VERSION.SDK_INT >= 28) {
            n3.f116103a.c(this.f116007a, i13);
        }
    }

    @Override // t3.i2
    public final int I() {
        return this.f116010d;
    }

    @Override // t3.i2
    public final void J(boolean z13) {
        this.f116007a.setClipToOutline(z13);
    }

    @Override // t3.i2
    public final void K(int i13) {
        if (Build.VERSION.SDK_INT >= 28) {
            n3.f116103a.d(this.f116007a, i13);
        }
    }

    @Override // t3.i2
    public final float L() {
        return this.f116007a.getElevation();
    }

    @Override // t3.i2
    public final float a() {
        return this.f116007a.getAlpha();
    }

    @Override // t3.i2
    public final void b(float f13) {
        this.f116007a.setTranslationY(f13);
    }

    @Override // t3.i2
    public final void c() {
        m3.f116092a.a(this.f116007a);
    }

    @Override // t3.i2
    public final boolean d() {
        return this.f116007a.isValid();
    }

    @Override // t3.i2
    public final void e(float f13) {
        this.f116007a.setScaleX(f13);
    }

    @Override // t3.i2
    public final void f(float f13) {
        this.f116007a.setCameraDistance(-f13);
    }

    @Override // t3.i2
    public final void g(float f13) {
        this.f116007a.setRotationX(f13);
    }

    @Override // t3.i2
    public final void h(float f13) {
        this.f116007a.setRotationY(f13);
    }

    @Override // t3.i2
    public final int i() {
        return this.f116011e - this.f116009c;
    }

    @Override // t3.i2
    public final int j() {
        return this.f116010d - this.f116008b;
    }

    @Override // t3.i2
    public final void k() {
    }

    @Override // t3.i2
    public final void l(float f13) {
        this.f116007a.setRotation(f13);
    }

    @Override // t3.i2
    public final void m(float f13) {
        this.f116007a.setScaleY(f13);
    }

    @Override // t3.i2
    public final void n(float f13) {
        this.f116007a.setAlpha(f13);
    }

    @Override // t3.i2
    public final void o(float f13) {
        this.f116007a.setTranslationX(f13);
    }

    @Override // t3.i2
    public final void p(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f116007a);
    }

    @Override // t3.i2
    public final int q() {
        return this.f116008b;
    }

    @Override // t3.i2
    public final void r(boolean z13) {
        this.f116012f = z13;
        this.f116007a.setClipToBounds(z13);
    }

    @Override // t3.i2
    public final boolean s(int i13, int i14, int i15, int i16) {
        this.f116008b = i13;
        this.f116009c = i14;
        this.f116010d = i15;
        this.f116011e = i16;
        return this.f116007a.setLeftTopRightBottom(i13, i14, i15, i16);
    }

    @Override // t3.i2
    public final void t(float f13) {
        this.f116007a.setElevation(f13);
    }

    @Override // t3.i2
    public final void u(int i13) {
        this.f116009c += i13;
        this.f116011e += i13;
        this.f116007a.offsetTopAndBottom(i13);
    }

    @Override // t3.i2
    public final void v(int i13) {
        boolean b13 = b3.s0.b(i13, 1);
        RenderNode renderNode = this.f116007a;
        if (b13) {
            renderNode.setLayerType(2);
            renderNode.setHasOverlappingRendering(true);
        } else if (b3.s0.b(i13, 2)) {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // t3.i2
    public final boolean w() {
        return this.f116007a.setHasOverlappingRendering(true);
    }

    @Override // t3.i2
    public final boolean x() {
        return this.f116012f;
    }

    @Override // t3.i2
    public final int y() {
        return this.f116009c;
    }

    @Override // t3.i2
    public final boolean z() {
        return this.f116007a.getClipToOutline();
    }
}
