package n;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.u1;
import androidx.appcompat.widget.x1;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class i extends w implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int B = i.g.abc_cascading_menu_item_layout;
    public boolean A;

    /* renamed from: b, reason: collision with root package name */
    public final Context f88607b;

    /* renamed from: c, reason: collision with root package name */
    public final int f88608c;

    /* renamed from: d, reason: collision with root package name */
    public final int f88609d;

    /* renamed from: e, reason: collision with root package name */
    public final int f88610e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f88611f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f88612g;

    /* renamed from: j, reason: collision with root package name */
    public final e f88615j;

    /* renamed from: k, reason: collision with root package name */
    public final f f88616k;

    /* renamed from: o, reason: collision with root package name */
    public View f88620o;

    /* renamed from: p, reason: collision with root package name */
    public View f88621p;

    /* renamed from: q, reason: collision with root package name */
    public int f88622q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f88623r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f88624s;

    /* renamed from: t, reason: collision with root package name */
    public int f88625t;

    /* renamed from: u, reason: collision with root package name */
    public int f88626u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f88628w;

    /* renamed from: x, reason: collision with root package name */
    public z f88629x;

    /* renamed from: y, reason: collision with root package name */
    public ViewTreeObserver f88630y;

    /* renamed from: z, reason: collision with root package name */
    public PopupWindow.OnDismissListener f88631z;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f88613h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f88614i = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final gc.c f88617l = new gc.c(this, 3);

    /* renamed from: m, reason: collision with root package name */
    public int f88618m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f88619n = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f88627v = false;

    public i(Context context, View view, int i13, int i14, boolean z13) {
        this.f88615j = new e(this, r1);
        this.f88616k = new f(this, r1);
        this.f88607b = context;
        this.f88620o = view;
        this.f88609d = i13;
        this.f88610e = i14;
        this.f88611f = z13;
        this.f88622q = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f88608c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(i.d.abc_config_prefDialogWidth));
        this.f88612g = new Handler();
    }

    @Override // n.e0
    public final boolean a() {
        ArrayList arrayList = this.f88614i;
        return arrayList.size() > 0 && ((h) arrayList.get(0)).f88604a.f16397z.isShowing();
    }

    @Override // n.a0
    public final void b(o oVar, boolean z13) {
        ArrayList arrayList = this.f88614i;
        int size = arrayList.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                i13 = -1;
                break;
            } else if (oVar == ((h) arrayList.get(i13)).f88605b) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 < 0) {
            return;
        }
        int i14 = i13 + 1;
        if (i14 < arrayList.size()) {
            ((h) arrayList.get(i14)).f88605b.d(false);
        }
        h hVar = (h) arrayList.remove(i13);
        hVar.f88605b.s(this);
        boolean z14 = this.A;
        x1 x1Var = hVar.f88604a;
        if (z14) {
            u1.b(x1Var.f16397z, null);
            x1Var.f16397z.setAnimationStyle(0);
        }
        x1Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f88622q = ((h) arrayList.get(size2 - 1)).f88606c;
        } else {
            this.f88622q = this.f88620o.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z13) {
                ((h) arrayList.get(0)).f88605b.d(false);
                return;
            }
            return;
        }
        dismiss();
        z zVar = this.f88629x;
        if (zVar != null) {
            zVar.b(oVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f88630y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f88630y.removeGlobalOnLayoutListener(this.f88615j);
            }
            this.f88630y = null;
        }
        this.f88621p.removeOnAttachStateChangeListener(this.f88616k);
        this.f88631z.onDismiss();
    }

    @Override // n.a0
    public final boolean c(g0 g0Var) {
        Iterator it = this.f88614i.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (g0Var == hVar.f88605b) {
                hVar.f88604a.f16374c.requestFocus();
                return true;
            }
        }
        if (!g0Var.hasVisibleItems()) {
            return false;
        }
        n(g0Var);
        z zVar = this.f88629x;
        if (zVar != null) {
            zVar.c(g0Var);
        }
        return true;
    }

    @Override // n.a0
    public final void d(Parcelable parcelable) {
    }

    @Override // n.e0
    public final void dismiss() {
        ArrayList arrayList = this.f88614i;
        int size = arrayList.size();
        if (size > 0) {
            h[] hVarArr = (h[]) arrayList.toArray(new h[size]);
            for (int i13 = size - 1; i13 >= 0; i13--) {
                h hVar = hVarArr[i13];
                if (hVar.f88604a.f16397z.isShowing()) {
                    hVar.f88604a.dismiss();
                }
            }
        }
    }

    @Override // n.a0
    public final Parcelable f() {
        return null;
    }

    @Override // n.a0
    public final void h(boolean z13) {
        Iterator it = this.f88614i.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((h) it.next()).f88604a.f16374c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((l) adapter).notifyDataSetChanged();
        }
    }

    @Override // n.a0
    public final boolean j() {
        return false;
    }

    @Override // n.e0
    public final void k() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f88613h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x((o) it.next());
        }
        arrayList.clear();
        View view = this.f88620o;
        this.f88621p = view;
        if (view != null) {
            boolean z13 = this.f88630y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f88630y = viewTreeObserver;
            if (z13) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f88615j);
            }
            this.f88621p.addOnAttachStateChangeListener(this.f88616k);
        }
    }

    @Override // n.e0
    public final ListView l() {
        ArrayList arrayList = this.f88614i;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((h) ep.b.h(arrayList, 1)).f88604a.f16374c;
    }

    @Override // n.a0
    public final void m(z zVar) {
        this.f88629x = zVar;
    }

    @Override // n.w
    public final void n(o oVar) {
        oVar.c(this, this.f88607b);
        if (a()) {
            x(oVar);
        } else {
            this.f88613h.add(oVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        h hVar;
        ArrayList arrayList = this.f88614i;
        int size = arrayList.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                hVar = null;
                break;
            }
            hVar = (h) arrayList.get(i13);
            if (!hVar.f88604a.f16397z.isShowing()) {
                break;
            } else {
                i13++;
            }
        }
        if (hVar != null) {
            hVar.f88605b.d(false);
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
        if (this.f88620o != view) {
            this.f88620o = view;
            this.f88619n = Gravity.getAbsoluteGravity(this.f88618m, view.getLayoutDirection());
        }
    }

    @Override // n.w
    public final void q(boolean z13) {
        this.f88627v = z13;
    }

    @Override // n.w
    public final void r(int i13) {
        if (this.f88618m != i13) {
            this.f88618m = i13;
            this.f88619n = Gravity.getAbsoluteGravity(i13, this.f88620o.getLayoutDirection());
        }
    }

    @Override // n.w
    public final void s(int i13) {
        this.f88623r = true;
        this.f88625t = i13;
    }

    @Override // n.w
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f88631z = onDismissListener;
    }

    @Override // n.w
    public final void u(boolean z13) {
        this.f88628w = z13;
    }

    @Override // n.w
    public final void v(int i13) {
        this.f88624s = true;
        this.f88626u = i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(n.o r18) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n.i.x(n.o):void");
    }
}
