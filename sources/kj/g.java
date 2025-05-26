package kj;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;
import q5.a2;
import q5.g2;
import q5.m0;
import q5.v0;

/* loaded from: classes3.dex */
public final class g extends b {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f79831a;

    /* renamed from: b, reason: collision with root package name */
    public final a2 f79832b;

    /* renamed from: c, reason: collision with root package name */
    public Window f79833c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f79834d;

    public g(FrameLayout frameLayout, a2 a2Var) {
        ColorStateList c13;
        this.f79832b = a2Var;
        bk.i iVar = BottomSheetBehavior.J(frameLayout).f32305i;
        if (iVar != null) {
            c13 = iVar.f23052a.f23032c;
        } else {
            WeakHashMap weakHashMap = v0.f102521a;
            c13 = m0.c(frameLayout);
        }
        if (c13 != null) {
            this.f79831a = Boolean.valueOf(b7.c.B(c13.getDefaultColor()));
            return;
        }
        ColorStateList P = d7.b.P(frameLayout.getBackground());
        Integer valueOf = P != null ? Integer.valueOf(P.getDefaultColor()) : null;
        if (valueOf != null) {
            this.f79831a = Boolean.valueOf(b7.c.B(valueOf.intValue()));
        } else {
            this.f79831a = null;
        }
    }

    @Override // kj.b
    public final void a(View view) {
        d(view);
    }

    @Override // kj.b
    public final void b(View view, float f13) {
        d(view);
    }

    @Override // kj.b
    public final void c(View view, int i13) {
        d(view);
    }

    public final void d(View view) {
        int top = view.getTop();
        a2 a2Var = this.f79832b;
        if (top < a2Var.e()) {
            Window window = this.f79833c;
            if (window != null) {
                Boolean bool = this.f79831a;
                new g2(window, window.getDecorView()).a(bool == null ? this.f79834d : bool.booleanValue());
            }
            view.setPadding(view.getPaddingLeft(), a2Var.e() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.f79833c;
            if (window2 != null) {
                new g2(window2, window2.getDecorView()).a(this.f79834d);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        if (this.f79833c == window) {
            return;
        }
        this.f79833c = window;
        if (window != null) {
            this.f79834d = new g2(window, window.getDecorView()).f102441a.e();
        }
    }
}
