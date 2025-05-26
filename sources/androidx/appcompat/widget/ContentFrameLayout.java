package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f16349a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f16350b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f16351c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f16352d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f16353e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f16354f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f16355g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.appcompat.app.w f16356h;

    public ContentFrameLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final TypedValue a() {
        if (this.f16353e == null) {
            this.f16353e = new TypedValue();
        }
        return this.f16353e;
    }

    public final TypedValue b() {
        if (this.f16354f == null) {
            this.f16354f = new TypedValue();
        }
        return this.f16354f;
    }

    public final TypedValue c() {
        if (this.f16351c == null) {
            this.f16351c = new TypedValue();
        }
        return this.f16351c;
    }

    public final TypedValue d() {
        if (this.f16352d == null) {
            this.f16352d = new TypedValue();
        }
        return this.f16352d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.appcompat.app.w wVar = this.f16356h;
        if (wVar != null) {
            wVar.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.app.w wVar = this.f16356h;
        if (wVar != null) {
            androidx.appcompat.app.n0 n0Var = wVar.f16143a;
            y0 y0Var = n0Var.f16098r;
            if (y0Var != null) {
                ((ActionBarOverlayLayout) y0Var).c();
            }
            if (n0Var.f16103w != null) {
                n0Var.f16092l.getDecorView().removeCallbacks(n0Var.f16104x);
                if (n0Var.f16103w.isShowing()) {
                    try {
                        n0Var.f16103w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                n0Var.f16103w = null;
            }
            q5.d1 d1Var = n0Var.f16105y;
            if (d1Var != null) {
                d1Var.b();
            }
            n.o oVar = n0Var.G(0).f16070h;
            if (oVar != null) {
                oVar.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public ContentFrameLayout(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f16355g = new Rect();
    }
}
