package n;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.j1;
import androidx.appcompat.widget.x1;

/* loaded from: classes2.dex */
public final class f0 extends w implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: v, reason: collision with root package name */
    public static final int f88577v = i.g.abc_popup_menu_item_layout;

    /* renamed from: b, reason: collision with root package name */
    public final Context f88578b;

    /* renamed from: c, reason: collision with root package name */
    public final o f88579c;

    /* renamed from: d, reason: collision with root package name */
    public final l f88580d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f88581e;

    /* renamed from: f, reason: collision with root package name */
    public final int f88582f;

    /* renamed from: g, reason: collision with root package name */
    public final int f88583g;

    /* renamed from: h, reason: collision with root package name */
    public final int f88584h;

    /* renamed from: i, reason: collision with root package name */
    public final x1 f88585i;

    /* renamed from: j, reason: collision with root package name */
    public final e f88586j;

    /* renamed from: k, reason: collision with root package name */
    public final f f88587k;

    /* renamed from: l, reason: collision with root package name */
    public PopupWindow.OnDismissListener f88588l;

    /* renamed from: m, reason: collision with root package name */
    public View f88589m;

    /* renamed from: n, reason: collision with root package name */
    public View f88590n;

    /* renamed from: o, reason: collision with root package name */
    public z f88591o;

    /* renamed from: p, reason: collision with root package name */
    public ViewTreeObserver f88592p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f88593q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f88594r;

    /* renamed from: s, reason: collision with root package name */
    public int f88595s;

    /* renamed from: t, reason: collision with root package name */
    public int f88596t = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f88597u;

    public f0(int i13, int i14, Context context, View view, o oVar, boolean z13) {
        int i15 = 1;
        this.f88586j = new e(this, i15);
        this.f88587k = new f(this, i15);
        this.f88578b = context;
        this.f88579c = oVar;
        this.f88581e = z13;
        this.f88580d = new l(oVar, LayoutInflater.from(context), z13, f88577v);
        this.f88583g = i13;
        this.f88584h = i14;
        Resources resources = context.getResources();
        this.f88582f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(i.d.abc_config_prefDialogWidth));
        this.f88589m = view;
        this.f88585i = new x1(context, null, i13, i14);
        oVar.c(this, context);
    }

    @Override // n.e0
    public final boolean a() {
        return !this.f88593q && this.f88585i.f16397z.isShowing();
    }

    @Override // n.a0
    public final void b(o oVar, boolean z13) {
        if (oVar != this.f88579c) {
            return;
        }
        dismiss();
        z zVar = this.f88591o;
        if (zVar != null) {
            zVar.b(oVar, z13);
        }
    }

    @Override // n.a0
    public final boolean c(g0 g0Var) {
        if (g0Var.hasVisibleItems()) {
            View view = this.f88590n;
            y yVar = new y(this.f88583g, this.f88584h, this.f88578b, view, g0Var, this.f88581e);
            z zVar = this.f88591o;
            yVar.f88721i = zVar;
            w wVar = yVar.f88722j;
            if (wVar != null) {
                wVar.m(zVar);
            }
            boolean w13 = w.w(g0Var);
            yVar.f88720h = w13;
            w wVar2 = yVar.f88722j;
            if (wVar2 != null) {
                wVar2.q(w13);
            }
            yVar.f88723k = this.f88588l;
            this.f88588l = null;
            this.f88579c.d(false);
            x1 x1Var = this.f88585i;
            int i13 = x1Var.f16377f;
            int i14 = x1Var.i();
            if ((Gravity.getAbsoluteGravity(this.f88596t, this.f88589m.getLayoutDirection()) & 7) == 5) {
                i13 += this.f88589m.getWidth();
            }
            if (!yVar.b()) {
                if (yVar.f88718f != null) {
                    yVar.d(i13, i14, true, true);
                }
            }
            z zVar2 = this.f88591o;
            if (zVar2 != null) {
                zVar2.c(g0Var);
            }
            return true;
        }
        return false;
    }

    @Override // n.a0
    public final void d(Parcelable parcelable) {
    }

    @Override // n.e0
    public final void dismiss() {
        if (a()) {
            this.f88585i.dismiss();
        }
    }

    @Override // n.a0
    public final Parcelable f() {
        return null;
    }

    @Override // n.a0
    public final void h(boolean z13) {
        this.f88594r = false;
        l lVar = this.f88580d;
        if (lVar != null) {
            lVar.notifyDataSetChanged();
        }
    }

    @Override // n.a0
    public final boolean j() {
        return false;
    }

    @Override // n.e0
    public final void k() {
        View view;
        if (a()) {
            return;
        }
        if (this.f88593q || (view = this.f88589m) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f88590n = view;
        x1 x1Var = this.f88585i;
        x1Var.f16397z.setOnDismissListener(this);
        x1Var.f16387p = this;
        x1Var.f16396y = true;
        x1Var.f16397z.setFocusable(true);
        View view2 = this.f88590n;
        boolean z13 = this.f88592p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f88592p = viewTreeObserver;
        if (z13) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f88586j);
        }
        view2.addOnAttachStateChangeListener(this.f88587k);
        x1Var.f16386o = view2;
        x1Var.f16383l = this.f88596t;
        boolean z14 = this.f88594r;
        Context context = this.f88578b;
        l lVar = this.f88580d;
        if (!z14) {
            this.f88595s = w.o(lVar, context, this.f88582f);
            this.f88594r = true;
        }
        x1Var.n(this.f88595s);
        x1Var.f16397z.setInputMethodMode(2);
        Rect rect = this.f88711a;
        x1Var.f16395x = rect != null ? new Rect(rect) : null;
        x1Var.k();
        j1 j1Var = x1Var.f16374c;
        j1Var.setOnKeyListener(this);
        if (this.f88597u) {
            o oVar = this.f88579c;
            if (oVar.f88660m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(i.g.abc_popup_menu_header_item_layout, (ViewGroup) j1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(oVar.f88660m);
                }
                frameLayout.setEnabled(false);
                j1Var.addHeaderView(frameLayout, null, false);
            }
        }
        x1Var.j(lVar);
        x1Var.k();
    }

    @Override // n.e0
    public final ListView l() {
        return this.f88585i.f16374c;
    }

    @Override // n.a0
    public final void m(z zVar) {
        this.f88591o = zVar;
    }

    @Override // n.w
    public final void n(o oVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f88593q = true;
        this.f88579c.d(true);
        ViewTreeObserver viewTreeObserver = this.f88592p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f88592p = this.f88590n.getViewTreeObserver();
            }
            this.f88592p.removeGlobalOnLayoutListener(this.f88586j);
            this.f88592p = null;
        }
        this.f88590n.removeOnAttachStateChangeListener(this.f88587k);
        PopupWindow.OnDismissListener onDismissListener = this.f88588l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i13, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i13 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // n.w
    public final void p(View view) {
        this.f88589m = view;
    }

    @Override // n.w
    public final void q(boolean z13) {
        this.f88580d.f88643c = z13;
    }

    @Override // n.w
    public final void r(int i13) {
        this.f88596t = i13;
    }

    @Override // n.w
    public final void s(int i13) {
        this.f88585i.f16377f = i13;
    }

    @Override // n.w
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f88588l = onDismissListener;
    }

    @Override // n.w
    public final void u(boolean z13) {
        this.f88597u = z13;
    }

    @Override // n.w
    public final void v(int i13) {
        this.f88585i.f(i13);
    }
}
