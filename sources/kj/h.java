package kj;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;
import lb.l0;
import oi.u6;
import q5.m0;
import q5.v0;

/* loaded from: classes3.dex */
public final class h extends p0 {

    /* renamed from: f, reason: collision with root package name */
    public BottomSheetBehavior f79835f;

    /* renamed from: g, reason: collision with root package name */
    public FrameLayout f79836g;

    /* renamed from: h, reason: collision with root package name */
    public CoordinatorLayout f79837h;

    /* renamed from: i, reason: collision with root package name */
    public FrameLayout f79838i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f79839j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f79840k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f79841l;

    /* renamed from: m, reason: collision with root package name */
    public g f79842m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f79843n;

    /* renamed from: o, reason: collision with root package name */
    public vj.f f79844o;

    /* renamed from: p, reason: collision with root package name */
    public f f79845p;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.f79835f == null) {
            g();
        }
        super.cancel();
    }

    public final void g() {
        if (this.f79836g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), fj.i.design_bottom_sheet_dialog, null);
            this.f79836g = frameLayout;
            this.f79837h = (CoordinatorLayout) frameLayout.findViewById(fj.g.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f79836g.findViewById(fj.g.design_bottom_sheet);
            this.f79838i = frameLayout2;
            BottomSheetBehavior J2 = BottomSheetBehavior.J(frameLayout2);
            this.f79835f = J2;
            J2.C(this.f79845p);
            this.f79835f.T(this.f79839j);
            this.f79844o = new vj.f(this.f79835f, this.f79838i);
        }
    }

    public final FrameLayout h(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        g();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f79836g.findViewById(fj.g.coordinator);
        int i14 = 0;
        if (i13 != 0 && view == null) {
            view = getLayoutInflater().inflate(i13, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f79843n) {
            FrameLayout frameLayout = this.f79838i;
            u6 u6Var = new u6(this, 6);
            WeakHashMap weakHashMap = v0.f102521a;
            m0.n(frameLayout, u6Var);
        }
        this.f79838i.removeAllViews();
        if (layoutParams == null) {
            this.f79838i.addView(view);
        } else {
            this.f79838i.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(fj.g.touch_outside).setOnClickListener(new androidx.appcompat.app.c(this, 4));
        v0.o(this.f79838i, new d(this, 0));
        this.f79838i.setOnTouchListener(new e(this, i14));
        return this.f79836g;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z13 = this.f79843n && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f79836g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z13);
            }
            CoordinatorLayout coordinatorLayout = this.f79837h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z13);
            }
            l0.j1(window, !z13);
            g gVar = this.f79842m;
            if (gVar != null) {
                gVar.e(window);
            }
        }
        vj.f fVar = this.f79844o;
        if (fVar == null) {
            return;
        }
        if (this.f79839j) {
            fVar.a(false);
            return;
        }
        vj.c cVar = fVar.f125898a;
        if (cVar != null) {
            cVar.c(fVar.f125900c);
        }
    }

    @Override // androidx.appcompat.app.p0, androidx.activity.p, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        vj.c cVar;
        g gVar = this.f79842m;
        if (gVar != null) {
            gVar.e(null);
        }
        vj.f fVar = this.f79844o;
        if (fVar == null || (cVar = fVar.f125898a) == null) {
            return;
        }
        cVar.c(fVar.f125900c);
    }

    @Override // androidx.activity.p, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f79835f;
        if (bottomSheetBehavior == null || bottomSheetBehavior.L != 5) {
            return;
        }
        bottomSheetBehavior.X(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z13) {
        vj.f fVar;
        super.setCancelable(z13);
        if (this.f79839j != z13) {
            this.f79839j = z13;
            BottomSheetBehavior bottomSheetBehavior = this.f79835f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.T(z13);
            }
            if (getWindow() == null || (fVar = this.f79844o) == null) {
                return;
            }
            if (this.f79839j) {
                fVar.a(false);
                return;
            }
            vj.c cVar = fVar.f125898a;
            if (cVar != null) {
                cVar.c(fVar.f125900c);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z13) {
        super.setCanceledOnTouchOutside(z13);
        if (z13 && !this.f79839j) {
            this.f79839j = true;
        }
        this.f79840k = z13;
        this.f79841l = true;
    }

    @Override // androidx.appcompat.app.p0, androidx.activity.p, android.app.Dialog
    public final void setContentView(int i13) {
        super.setContentView(h(null, i13, null));
    }

    @Override // androidx.appcompat.app.p0, androidx.activity.p, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(h(view, 0, null));
    }

    @Override // androidx.appcompat.app.p0, androidx.activity.p, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(h(view, 0, layoutParams));
    }
}
