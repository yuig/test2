package androidx.appcompat.app;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.f3;
import androidx.appcompat.widget.h3;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class d1 extends a implements androidx.appcompat.widget.f {

    /* renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f15969y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f15970z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f15971a;

    /* renamed from: b, reason: collision with root package name */
    public Context f15972b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f15973c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f15974d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.appcompat.widget.z0 f15975e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f15976f;

    /* renamed from: g, reason: collision with root package name */
    public final View f15977g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15978h;

    /* renamed from: i, reason: collision with root package name */
    public c1 f15979i;

    /* renamed from: j, reason: collision with root package name */
    public c1 f15980j;

    /* renamed from: k, reason: collision with root package name */
    public m.b f15981k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f15982l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f15983m;

    /* renamed from: n, reason: collision with root package name */
    public int f15984n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f15985o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f15986p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f15987q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f15988r;

    /* renamed from: s, reason: collision with root package name */
    public m.n f15989s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f15990t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f15991u;

    /* renamed from: v, reason: collision with root package name */
    public final b1 f15992v;

    /* renamed from: w, reason: collision with root package name */
    public final b1 f15993w;

    /* renamed from: x, reason: collision with root package name */
    public final gc.c f15994x;

    public d1(Activity activity, boolean z13) {
        new ArrayList();
        this.f15983m = new ArrayList();
        this.f15984n = 0;
        this.f15985o = true;
        this.f15988r = true;
        this.f15992v = new b1(this, 0);
        this.f15993w = new b1(this, 1);
        this.f15994x = new gc.c(this, 2);
        View decorView = activity.getWindow().getDecorView();
        q(decorView);
        if (z13) {
            return;
        }
        this.f15977g = decorView.findViewById(R.id.content);
    }

    @Override // androidx.appcompat.app.a
    public final boolean b() {
        f3 f3Var;
        androidx.appcompat.widget.z0 z0Var = this.f15975e;
        if (z0Var == null || (f3Var = ((h3) z0Var).f16581a.M) == null || f3Var.f16562b == null) {
            return false;
        }
        f3 f3Var2 = ((h3) z0Var).f16581a.M;
        n.q qVar = f3Var2 == null ? null : f3Var2.f16562b;
        if (qVar == null) {
            return true;
        }
        qVar.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public final void c(boolean z13) {
        if (z13 == this.f15982l) {
            return;
        }
        this.f15982l = z13;
        ArrayList arrayList = this.f15983m;
        if (arrayList.size() <= 0) {
            return;
        }
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(arrayList.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.a
    public final int d() {
        return ((h3) this.f15975e).f16582b;
    }

    @Override // androidx.appcompat.app.a
    public final Context e() {
        if (this.f15972b == null) {
            TypedValue typedValue = new TypedValue();
            this.f15971a.getTheme().resolveAttribute(i.a.actionBarWidgetTheme, typedValue, true);
            int i13 = typedValue.resourceId;
            if (i13 != 0) {
                this.f15972b = new ContextThemeWrapper(this.f15971a, i13);
            } else {
                this.f15972b = this.f15971a;
            }
        }
        return this.f15972b;
    }

    @Override // androidx.appcompat.app.a
    public final void g() {
        r(this.f15971a.getResources().getBoolean(i.b.abc_action_bar_embed_tabs));
    }

    @Override // androidx.appcompat.app.a
    public final boolean i(int i13, KeyEvent keyEvent) {
        n.o oVar;
        c1 c1Var = this.f15979i;
        if (c1Var == null || (oVar = c1Var.f15960d) == null) {
            return false;
        }
        oVar.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return oVar.performShortcut(i13, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public final void l(boolean z13) {
        if (this.f15978h) {
            return;
        }
        int i13 = z13 ? 4 : 0;
        h3 h3Var = (h3) this.f15975e;
        int i14 = h3Var.f16582b;
        this.f15978h = true;
        h3Var.a((i13 & 4) | (i14 & (-5)));
    }

    @Override // androidx.appcompat.app.a
    public final void m(boolean z13) {
        m.n nVar;
        this.f15990t = z13;
        if (z13 || (nVar = this.f15989s) == null) {
            return;
        }
        nVar.a();
    }

    @Override // androidx.appcompat.app.a
    public final void n(CharSequence charSequence) {
        h3 h3Var = (h3) this.f15975e;
        if (h3Var.f16587g) {
            return;
        }
        h3Var.f16588h = charSequence;
        if ((h3Var.f16582b & 8) != 0) {
            Toolbar toolbar = h3Var.f16581a;
            toolbar.D(charSequence);
            if (h3Var.f16587g) {
                q5.v0.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.app.a
    public final m.c o(a0 a0Var) {
        c1 c1Var = this.f15979i;
        if (c1Var != null) {
            c1Var.a();
        }
        this.f15973c.n(false);
        this.f15976f.e();
        c1 c1Var2 = new c1(this, this.f15976f.getContext(), a0Var);
        n.o oVar = c1Var2.f15960d;
        oVar.B();
        try {
            if (!c1Var2.f15961e.n(c1Var2, oVar)) {
                return null;
            }
            this.f15979i = c1Var2;
            c1Var2.g();
            this.f15976f.c(c1Var2);
            p(true);
            return c1Var2;
        } finally {
            oVar.A();
        }
    }

    public final void p(boolean z13) {
        q5.d1 n13;
        q5.d1 d1Var;
        if (z13) {
            if (!this.f15987q) {
                this.f15987q = true;
                s(false);
            }
        } else if (this.f15987q) {
            this.f15987q = false;
            s(false);
        }
        if (!this.f15974d.isLaidOut()) {
            if (z13) {
                ((h3) this.f15975e).f16581a.setVisibility(4);
                this.f15976f.setVisibility(0);
                return;
            } else {
                ((h3) this.f15975e).f16581a.setVisibility(0);
                this.f15976f.setVisibility(8);
                return;
            }
        }
        if (z13) {
            h3 h3Var = (h3) this.f15975e;
            n13 = q5.v0.b(h3Var.f16581a);
            n13.a(0.0f);
            n13.c(100L);
            n13.e(new m.m(h3Var, 4));
            d1Var = this.f15976f.n(0, 200L);
        } else {
            h3 h3Var2 = (h3) this.f15975e;
            q5.d1 b13 = q5.v0.b(h3Var2.f16581a);
            b13.a(1.0f);
            b13.c(200L);
            b13.e(new m.m(h3Var2, 0));
            n13 = this.f15976f.n(8, 100L);
            d1Var = b13;
        }
        m.n nVar = new m.n();
        ArrayList arrayList = (ArrayList) nVar.f85244c;
        arrayList.add(n13);
        View view = (View) n13.f102419a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) d1Var.f102419a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(d1Var);
        nVar.c();
    }

    public final void q(View view) {
        androidx.appcompat.widget.z0 z0Var;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(i.f.decor_content_parent);
        this.f15973c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.f16243u = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                ((d1) actionBarOverlayLayout.f16243u).f15984n = actionBarOverlayLayout.f16224b;
                int i13 = actionBarOverlayLayout.f16234l;
                if (i13 != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(i13);
                    WeakHashMap weakHashMap = q5.v0.f102521a;
                    q5.k0.c(actionBarOverlayLayout);
                }
            }
        }
        KeyEvent.Callback findViewById = view.findViewById(i.f.action_bar);
        if (findViewById instanceof androidx.appcompat.widget.z0) {
            z0Var = (androidx.appcompat.widget.z0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            Toolbar toolbar = (Toolbar) findViewById;
            if (toolbar.K == null) {
                toolbar.K = new h3(toolbar, true);
            }
            z0Var = toolbar.K;
        }
        this.f15975e = z0Var;
        this.f15976f = (ActionBarContextView) view.findViewById(i.f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(i.f.action_bar_container);
        this.f15974d = actionBarContainer;
        androidx.appcompat.widget.z0 z0Var2 = this.f15975e;
        if (z0Var2 == null || this.f15976f == null || actionBarContainer == null) {
            throw new IllegalStateException(d1.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((h3) z0Var2).f16581a.getContext();
        this.f15971a = context;
        if ((((h3) this.f15975e).f16582b & 4) != 0) {
            this.f15978h = true;
        }
        int i14 = context.getApplicationInfo().targetSdkVersion;
        this.f15975e.getClass();
        r(context.getResources().getBoolean(i.b.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f15971a.obtainStyledAttributes(null, i.j.ActionBar, i.a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(i.j.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f15973c;
            if (!actionBarOverlayLayout2.f16229g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f15991u = true;
            actionBarOverlayLayout2.n(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(i.j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f15974d;
            WeakHashMap weakHashMap2 = q5.v0.f102521a;
            q5.m0.l(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void r(boolean z13) {
        if (z13) {
            this.f15974d.getClass();
            ((h3) this.f15975e).getClass();
        } else {
            ((h3) this.f15975e).getClass();
            this.f15974d.getClass();
        }
        h3 h3Var = (h3) this.f15975e;
        h3Var.getClass();
        Toolbar toolbar = h3Var.f16581a;
        toolbar.P = false;
        toolbar.requestLayout();
        this.f15973c.f16230h = false;
    }

    public final void s(boolean z13) {
        boolean z14 = this.f15987q || !this.f15986p;
        gc.c cVar = this.f15994x;
        View view = this.f15977g;
        if (!z14) {
            if (this.f15988r) {
                this.f15988r = false;
                m.n nVar = this.f15989s;
                if (nVar != null) {
                    nVar.a();
                }
                int i13 = this.f15984n;
                b1 b1Var = this.f15992v;
                if (i13 != 0 || (!this.f15990t && !z13)) {
                    b1Var.d(null);
                    return;
                }
                this.f15974d.setAlpha(1.0f);
                ActionBarContainer actionBarContainer = this.f15974d;
                actionBarContainer.f16194a = true;
                actionBarContainer.setDescendantFocusability(393216);
                m.n nVar2 = new m.n();
                float f13 = -this.f15974d.getHeight();
                if (z13) {
                    this.f15974d.getLocationInWindow(new int[]{0, 0});
                    f13 -= r12[1];
                }
                q5.d1 b13 = q5.v0.b(this.f15974d);
                b13.h(f13);
                b13.f(cVar);
                nVar2.b(b13);
                if (this.f15985o && view != null) {
                    q5.d1 b14 = q5.v0.b(view);
                    b14.h(f13);
                    nVar2.b(b14);
                }
                AccelerateInterpolator accelerateInterpolator = f15969y;
                boolean z15 = nVar2.f85243b;
                if (!z15) {
                    nVar2.f85245d = accelerateInterpolator;
                }
                if (!z15) {
                    nVar2.f85242a = 250L;
                }
                if (!z15) {
                    nVar2.f85246e = b1Var;
                }
                this.f15989s = nVar2;
                nVar2.c();
                return;
            }
            return;
        }
        if (this.f15988r) {
            return;
        }
        this.f15988r = true;
        m.n nVar3 = this.f15989s;
        if (nVar3 != null) {
            nVar3.a();
        }
        this.f15974d.setVisibility(0);
        int i14 = this.f15984n;
        b1 b1Var2 = this.f15993w;
        if (i14 == 0 && (this.f15990t || z13)) {
            this.f15974d.setTranslationY(0.0f);
            float f14 = -this.f15974d.getHeight();
            if (z13) {
                this.f15974d.getLocationInWindow(new int[]{0, 0});
                f14 -= r12[1];
            }
            this.f15974d.setTranslationY(f14);
            m.n nVar4 = new m.n();
            q5.d1 b15 = q5.v0.b(this.f15974d);
            b15.h(0.0f);
            b15.f(cVar);
            nVar4.b(b15);
            if (this.f15985o && view != null) {
                view.setTranslationY(f14);
                q5.d1 b16 = q5.v0.b(view);
                b16.h(0.0f);
                nVar4.b(b16);
            }
            DecelerateInterpolator decelerateInterpolator = f15970z;
            boolean z16 = nVar4.f85243b;
            if (!z16) {
                nVar4.f85245d = decelerateInterpolator;
            }
            if (!z16) {
                nVar4.f85242a = 250L;
            }
            if (!z16) {
                nVar4.f85246e = b1Var2;
            }
            this.f15989s = nVar4;
            nVar4.c();
        } else {
            this.f15974d.setAlpha(1.0f);
            this.f15974d.setTranslationY(0.0f);
            if (this.f15985o && view != null) {
                view.setTranslationY(0.0f);
            }
            b1Var2.d(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f15973c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = q5.v0.f102521a;
            q5.k0.c(actionBarOverlayLayout);
        }
    }

    public d1(Dialog dialog) {
        new ArrayList();
        this.f15983m = new ArrayList();
        this.f15984n = 0;
        this.f15985o = true;
        this.f15988r = true;
        this.f15992v = new b1(this, 0);
        this.f15993w = new b1(this, 1);
        this.f15994x = new gc.c(this, 2);
        q(dialog.getWindow().getDecorView());
    }
}
