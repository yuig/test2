package ua;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class y extends ViewGroup implements v {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f121370g = 0;

    /* renamed from: a, reason: collision with root package name */
    public ViewGroup f121371a;

    /* renamed from: b, reason: collision with root package name */
    public View f121372b;

    /* renamed from: c, reason: collision with root package name */
    public final View f121373c;

    /* renamed from: d, reason: collision with root package name */
    public int f121374d;

    /* renamed from: e, reason: collision with root package name */
    public Matrix f121375e;

    /* renamed from: f, reason: collision with root package name */
    public final a5.b f121376f;

    public y(View view) {
        super(view.getContext());
        this.f121376f = new a5.b(this, 1);
        this.f121373c = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    @Override // ua.v
    public final void f(View view, ViewGroup viewGroup) {
        this.f121371a = viewGroup;
        this.f121372b = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i13 = e0.ghost_view;
        View view = this.f121373c;
        view.setTag(i13, this);
        view.getViewTreeObserver().addOnPreDrawListener(this.f121376f);
        b1.e(view, 4);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view = this.f121373c;
        view.getViewTreeObserver().removeOnPreDrawListener(this.f121376f);
        b1.e(view, 0);
        view.setTag(e0.ghost_view, null);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        e0.t.o(canvas, true);
        canvas.setMatrix(this.f121375e);
        View view = this.f121373c;
        b1.e(view, 0);
        view.invalidate();
        b1.e(view, 4);
        drawChild(canvas, view, getDrawingTime());
        e0.t.o(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
    }

    @Override // android.view.View, ua.v
    public final void setVisibility(int i13) {
        super.setVisibility(i13);
        int i14 = e0.ghost_view;
        View view = this.f121373c;
        if (((y) view.getTag(i14)) == this) {
            b1.e(view, i13 == 0 ? 4 : 0);
        }
    }
}
