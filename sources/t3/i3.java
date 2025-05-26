package t3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* loaded from: classes2.dex */
public final class i3 implements i2 {

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f116037a = h3.d();

    @Override // t3.i2
    public final void A(Matrix matrix) {
        this.f116037a.getMatrix(matrix);
    }

    @Override // t3.i2
    public final void B(int i13) {
        this.f116037a.offsetLeftAndRight(i13);
    }

    @Override // t3.i2
    public final void C(h1.b bVar, b3.o0 o0Var, k3 k3Var) {
        RecordingCanvas beginRecording;
        RenderNode renderNode = this.f116037a;
        beginRecording = renderNode.beginRecording();
        b3.d dVar = (b3.d) bVar.f66449b;
        Canvas canvas = dVar.f21309a;
        dVar.f21309a = beginRecording;
        if (o0Var != null) {
            dVar.j();
            dVar.d(o0Var, 1);
        }
        k3Var.invoke(dVar);
        if (o0Var != null) {
            dVar.restore();
        }
        ((b3.d) bVar.f66449b).f21309a = canvas;
        renderNode.endRecording();
    }

    @Override // t3.i2
    public final int D() {
        int bottom;
        bottom = this.f116037a.getBottom();
        return bottom;
    }

    @Override // t3.i2
    public final void E(float f13) {
        this.f116037a.setPivotX(f13);
    }

    @Override // t3.i2
    public final void F(float f13) {
        this.f116037a.setPivotY(f13);
    }

    @Override // t3.i2
    public final void G(Outline outline) {
        this.f116037a.setOutline(outline);
    }

    @Override // t3.i2
    public final void H(int i13) {
        this.f116037a.setAmbientShadowColor(i13);
    }

    @Override // t3.i2
    public final int I() {
        int right;
        right = this.f116037a.getRight();
        return right;
    }

    @Override // t3.i2
    public final void J(boolean z13) {
        this.f116037a.setClipToOutline(z13);
    }

    @Override // t3.i2
    public final void K(int i13) {
        this.f116037a.setSpotShadowColor(i13);
    }

    @Override // t3.i2
    public final float L() {
        float elevation;
        elevation = this.f116037a.getElevation();
        return elevation;
    }

    @Override // t3.i2
    public final float a() {
        float alpha;
        alpha = this.f116037a.getAlpha();
        return alpha;
    }

    @Override // t3.i2
    public final void b(float f13) {
        this.f116037a.setTranslationY(f13);
    }

    @Override // t3.i2
    public final void c() {
        this.f116037a.discardDisplayList();
    }

    @Override // t3.i2
    public final boolean d() {
        boolean hasDisplayList;
        hasDisplayList = this.f116037a.hasDisplayList();
        return hasDisplayList;
    }

    @Override // t3.i2
    public final void e(float f13) {
        this.f116037a.setScaleX(f13);
    }

    @Override // t3.i2
    public final void f(float f13) {
        this.f116037a.setCameraDistance(f13);
    }

    @Override // t3.i2
    public final void g(float f13) {
        this.f116037a.setRotationX(f13);
    }

    @Override // t3.i2
    public final void h(float f13) {
        this.f116037a.setRotationY(f13);
    }

    @Override // t3.i2
    public final int i() {
        int height;
        height = this.f116037a.getHeight();
        return height;
    }

    @Override // t3.i2
    public final int j() {
        int width;
        width = this.f116037a.getWidth();
        return width;
    }

    @Override // t3.i2
    public final void k() {
        if (Build.VERSION.SDK_INT >= 31) {
            j3.f116046a.a(this.f116037a, null);
        }
    }

    @Override // t3.i2
    public final void l(float f13) {
        this.f116037a.setRotationZ(f13);
    }

    @Override // t3.i2
    public final void m(float f13) {
        this.f116037a.setScaleY(f13);
    }

    @Override // t3.i2
    public final void n(float f13) {
        this.f116037a.setAlpha(f13);
    }

    @Override // t3.i2
    public final void o(float f13) {
        this.f116037a.setTranslationX(f13);
    }

    @Override // t3.i2
    public final void p(Canvas canvas) {
        canvas.drawRenderNode(this.f116037a);
    }

    @Override // t3.i2
    public final int q() {
        int left;
        left = this.f116037a.getLeft();
        return left;
    }

    @Override // t3.i2
    public final void r(boolean z13) {
        this.f116037a.setClipToBounds(z13);
    }

    @Override // t3.i2
    public final boolean s(int i13, int i14, int i15, int i16) {
        boolean position;
        position = this.f116037a.setPosition(i13, i14, i15, i16);
        return position;
    }

    @Override // t3.i2
    public final void t(float f13) {
        this.f116037a.setElevation(f13);
    }

    @Override // t3.i2
    public final void u(int i13) {
        this.f116037a.offsetTopAndBottom(i13);
    }

    @Override // t3.i2
    public final void v(int i13) {
        boolean b13 = b3.s0.b(i13, 1);
        RenderNode renderNode = this.f116037a;
        if (b13) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (b3.s0.b(i13, 2)) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // t3.i2
    public final boolean w() {
        boolean hasOverlappingRendering;
        hasOverlappingRendering = this.f116037a.setHasOverlappingRendering(true);
        return hasOverlappingRendering;
    }

    @Override // t3.i2
    public final boolean x() {
        boolean clipToBounds;
        clipToBounds = this.f116037a.getClipToBounds();
        return clipToBounds;
    }

    @Override // t3.i2
    public final int y() {
        int top;
        top = this.f116037a.getTop();
        return top;
    }

    @Override // t3.i2
    public final boolean z() {
        boolean clipToOutline;
        clipToOutline = this.f116037a.getClipToOutline();
        return clipToOutline;
    }
}
