package n62;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f1;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.q2;
import ao2.j0;
import com.google.android.material.tabs.TabLayout;
import com.pinterest.shuffles.composer.ui.effects.PointPicker;
import do2.b0;
import do2.q0;
import do2.t2;
import do2.u2;
import java.util.List;
import kh2.m2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import lb.l0;
import m62.c0;
import m62.d0;
import m62.e0;
import m62.f0;
import m62.p;
import m62.q;
import m62.r;
import m62.t;
import m62.v;
import m62.y0;
import m62.z0;
import r72.n0;
import r72.p0;
import r72.r0;
import r72.s0;
import r72.t0;
import r72.u0;
import r72.v0;
import r72.w0;
import tq.s;
import va0.o;
import y90.a0;
import y90.c2;
import y90.d1;
import y90.k1;
import y90.p1;
import y90.q1;
import y90.u1;
import y90.y;
import y90.z;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: n, reason: collision with root package name */
    public static final long f89350n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f89351o = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f89352a;

    /* renamed from: b, reason: collision with root package name */
    public final q1 f89353b;

    /* renamed from: c, reason: collision with root package name */
    public final PointPicker f89354c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f89355d;

    /* renamed from: e, reason: collision with root package name */
    public final f1 f89356e;

    /* renamed from: f, reason: collision with root package name */
    public final f1 f89357f;

    /* renamed from: g, reason: collision with root package name */
    public final f1 f89358g;

    /* renamed from: h, reason: collision with root package name */
    public final f1 f89359h;

    /* renamed from: i, reason: collision with root package name */
    public final f1 f89360i;

    /* renamed from: j, reason: collision with root package name */
    public final Function2 f89361j;

    /* renamed from: k, reason: collision with root package name */
    public final Function1 f89362k;

    /* renamed from: l, reason: collision with root package name */
    public final Function1 f89363l;

    /* renamed from: m, reason: collision with root package name */
    public final Function1 f89364m;

    static {
        zn2.a aVar = zn2.b.f142311b;
        f89350n = zn2.b.e(dl2.b.P2(1, zn2.d.SECONDS)) / 30;
    }

    public g(Context context, q1 effectsPanel, PointPicker pointPicker, u coroutineScope, p1 effectsAdapter, k1 effectSettingsAdapter, c2 toolsAdapter, u1 fontAdapter, d1 colorPickerAdapter, z tabViewBinder, y onEffectsViewEvent, a0 onEffectsAdapterUpdated, a0 onPanelChanged) {
        y90.u onUpdateContainerItemVisibility = y90.u.f138247k;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(effectsPanel, "effectsPanel");
        Intrinsics.checkNotNullParameter(pointPicker, "pointPicker");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(effectsAdapter, "effectsAdapter");
        Intrinsics.checkNotNullParameter(effectSettingsAdapter, "effectSettingsAdapter");
        Intrinsics.checkNotNullParameter(toolsAdapter, "toolsAdapter");
        Intrinsics.checkNotNullParameter(fontAdapter, "fontAdapter");
        Intrinsics.checkNotNullParameter(colorPickerAdapter, "colorPickerAdapter");
        Intrinsics.checkNotNullParameter(tabViewBinder, "tabViewBinder");
        Intrinsics.checkNotNullParameter(onEffectsViewEvent, "onEffectsViewEvent");
        Intrinsics.checkNotNullParameter(onEffectsAdapterUpdated, "onEffectsAdapterUpdated");
        Intrinsics.checkNotNullParameter(onUpdateContainerItemVisibility, "onUpdateContainerItemVisibility");
        Intrinsics.checkNotNullParameter(onPanelChanged, "onPanelChanged");
        this.f89352a = context;
        this.f89353b = effectsPanel;
        this.f89354c = pointPicker;
        this.f89355d = coroutineScope;
        this.f89356e = effectsAdapter;
        this.f89357f = effectSettingsAdapter;
        this.f89358g = toolsAdapter;
        this.f89359h = fontAdapter;
        this.f89360i = colorPickerAdapter;
        this.f89361j = tabViewBinder;
        this.f89362k = onEffectsViewEvent;
        this.f89363l = onEffectsAdapterUpdated;
        this.f89364m = onPanelChanged;
        q2 q2Var = effectsPanel.f138222b.f19220c;
        final int i13 = 0;
        q2Var.f19606e = 0;
        q2Var.q();
        effectsPanel.f138223c.setOnClickListener(new View.OnClickListener(this) { // from class: n62.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f89342b;

            {
                this.f89342b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                g this$0 = this.f89342b;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f89362k.invoke(y0.f86065a);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f89362k.invoke(z0.f86068a);
                        break;
                }
            }
        });
        final int i14 = 1;
        effectsPanel.f138225e.setOnClickListener(new View.OnClickListener(this) { // from class: n62.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f89342b;

            {
                this.f89342b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                g this$0 = this.f89342b;
                switch (i142) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f89362k.invoke(y0.f86065a);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f89362k.invoke(z0.f86068a);
                        break;
                }
            }
        });
        RecyclerView recyclerView = effectsPanel.f138226f;
        recyclerView.H2(effectSettingsAdapter);
        recyclerView.O2(null);
        t2 a13 = u2.a(Float.valueOf(0.0f));
        q0 Y = l0.Y(a13);
        long j13 = f89350n;
        if (j13 <= 0) {
            throw new IllegalArgumentException("Sample period should be positive".toString());
        }
        l0.J0(l0.Q0(new d(this, null), new do2.l(new b0(j13, Y, null), 2)), coroutineScope);
        c onStartTrackingTouch = new c(this, i13);
        c onStopTrackingTouch = new c(this, i14);
        mm1.g onValueChange = new mm1.g(a13, 5);
        o oVar = effectsPanel.f138228h;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(onStartTrackingTouch, "onStartTrackingTouch");
        Intrinsics.checkNotNullParameter(onStopTrackingTouch, "onStopTrackingTouch");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        oVar.f125140c = onStartTrackingTouch;
        oVar.f125141d = onStopTrackingTouch;
        oVar.f125142e = onValueChange;
        f fVar = new f(this);
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        pointPicker.f51868a = fVar;
    }

    public final void a(f0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        boolean z13 = action instanceof d0;
        q1 q1Var = this.f89353b;
        if (z13) {
            d0 d0Var = (d0) action;
            final RecyclerView recyclerView = q1Var.f138222b;
            final boolean z14 = d0Var.f85968b;
            final int i13 = d0Var.f85967a;
            recyclerView.post(new Runnable() { // from class: n62.a
                @Override // java.lang.Runnable
                public final void run() {
                    RecyclerView this_run = RecyclerView.this;
                    Intrinsics.checkNotNullParameter(this_run, "$this_run");
                    try {
                        l2 l2Var = this_run.f19242n;
                        Intrinsics.g(l2Var, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) l2Var;
                        boolean z15 = z14;
                        int i14 = i13;
                        if (z15) {
                            s sVar = new s(this_run.getContext(), 5);
                            sVar.f19651a = i14;
                            linearLayoutManager.X0(sVar);
                        } else {
                            linearLayoutManager.B1(i14, this_run.getWidth() / 2);
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
            });
            return;
        }
        boolean z15 = action instanceof e0;
        PointPicker pointPicker = this.f89354c;
        if (!z15) {
            if (Intrinsics.d(action, c0.f85964a)) {
                b();
                pointPicker.setVisibility(8);
                return;
            }
            return;
        }
        w0 w0Var = ((e0) action).f85972a;
        boolean z16 = w0Var instanceof p0;
        int i14 = 2;
        if (z16) {
            o oVar = q1Var.f138228h;
            p0 p0Var = (p0) w0Var;
            oVar.b(((Number) p0Var.f106612d.c()).floatValue());
            oVar.c(((Number) p0Var.f106612d.d()).floatValue());
            oVar.a(p0Var.f106610b);
        } else if (w0Var instanceof r0) {
            o oVar2 = q1Var.f138228h;
            r0 r0Var = (r0) w0Var;
            oVar2.b(r0Var.f106634d.f80453a);
            oVar2.c(r0Var.f106634d.f80454b);
            oVar2.a(r0Var.f106632b);
        } else if (w0Var instanceof v0) {
            pointPicker.getClass();
            pointPicker.f51879l = ql2.s.h(1, new IntRange(0, 2, 1));
            pointPicker.invalidate();
            v0 v0Var = (v0) w0Var;
            u0 u0Var = v0Var.f106697d;
            PointF point = new PointF(u0Var.f106666a, u0Var.f106667b);
            Intrinsics.checkNotNullParameter(point, "point");
            RectF rectF = pointPicker.f51870c;
            rectF.left = point.x;
            rectF.top = point.y;
            pointPicker.postInvalidate();
            u0 u0Var2 = v0Var.f106698e;
            PointF point2 = new PointF(u0Var2.f106666a, u0Var2.f106667b);
            Intrinsics.checkNotNullParameter(point2, "point");
            rectF.right = point2.x;
            rectF.bottom = point2.y;
            pointPicker.postInvalidate();
            u0 u0Var3 = v0Var.f106695b;
            PointF point3 = new PointF(u0Var3.f106666a, u0Var3.f106667b);
            Intrinsics.checkNotNullParameter(point3, "point");
            pointPicker.b(0, point3);
            pointPicker.setVisibility(0);
        } else if (w0Var instanceof t0) {
            pointPicker.getClass();
            pointPicker.f51879l = ql2.s.h(2, new IntRange(0, 2, 1));
            pointPicker.invalidate();
            t0 t0Var = (t0) w0Var;
            s0 s0Var = t0Var.f106661d;
            PointF point4 = new PointF(s0Var.f106645a, s0Var.f106646b);
            Intrinsics.checkNotNullParameter(point4, "point");
            RectF rectF2 = pointPicker.f51870c;
            rectF2.left = point4.x;
            rectF2.top = point4.y;
            pointPicker.postInvalidate();
            s0 s0Var2 = t0Var.f106662e;
            PointF point5 = new PointF(s0Var2.f106645a, s0Var2.f106646b);
            Intrinsics.checkNotNullParameter(point5, "point");
            rectF2.right = point5.x;
            rectF2.bottom = point5.y;
            pointPicker.postInvalidate();
            s0 s0Var3 = t0Var.f106659b;
            pointPicker.b(0, new PointF(s0Var3.f106645a, s0Var3.f106646b));
            pointPicker.b(1, new PointF(s0Var3.f106647c, s0Var3.f106648d));
            pointPicker.setVisibility(0);
        } else if (w0Var instanceof n0) {
            RecyclerView recyclerView2 = q1Var.f138229i;
            recyclerView2.H2(this.f89360i);
            recyclerView2.setVisibility(0);
        }
        if (!z16 && !(w0Var instanceof r0) && !(w0Var instanceof n0)) {
            b();
            return;
        }
        ViewGroup viewGroup = q1Var.f138227g;
        if (viewGroup.getVisibility() == 0) {
            d(w0Var);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(-viewGroup.getHeight(), 0);
        Intrinsics.f(ofInt);
        ofInt.addListener(new ir.a(this, w0Var, viewGroup, i14));
        ofInt.setDuration(200L);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new tq.e(viewGroup, 2));
        ofInt.start();
    }

    public final void b() {
        ViewGroup viewGroup = this.f89353b.f138227g;
        if (viewGroup.getVisibility() == 0) {
            ValueAnimator ofInt = ValueAnimator.ofInt(-viewGroup.getHeight());
            Intrinsics.f(ofInt);
            ofInt.addListener(new ir.b(viewGroup, 8));
            ofInt.setDuration(200L);
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt.addUpdateListener(new tq.e(viewGroup, 3));
            ofInt.start();
        }
    }

    public final void c(m62.s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        v vVar = model.f86048d;
        boolean d2 = Intrinsics.d(vVar, m62.u.f86059a);
        f1 f1Var = this.f89360i;
        q1 q1Var = this.f89353b;
        if (d2) {
            m2 m2Var = model.f86050f;
            if (m2Var instanceof p) {
                List list = ((p) m2Var).f86039d;
                f1Var = this.f89356e;
                f1Var.D(list);
            } else if (m2Var instanceof r) {
                List list2 = ((r) m2Var).f86043d;
                f1Var = this.f89358g;
                f1Var.D(list2);
            } else if (m2Var instanceof m62.o) {
                f1Var.D(((m62.o) m2Var).f86036d);
            } else {
                if (!(m2Var instanceof q)) {
                    throw new NoWhenBranchMatchedException();
                }
                List list3 = ((q) m2Var).f86041d;
                f1Var = this.f89359h;
                f1Var.D(list3);
            }
            if (!Intrinsics.d(q1Var.f138222b.f19240m, f1Var)) {
                q1Var.f138222b.H2(f1Var);
                this.f89363l.invoke(model);
            }
            TabLayout tabLayout = q1Var.f138221a;
            if (tabLayout.f33126b.size() == 0) {
                List<m62.h> list4 = model.f86049e;
                if (!list4.isEmpty()) {
                    for (m62.h hVar : list4) {
                        ek.e p13 = tabLayout.p();
                        this.f89361j.invoke(p13, hVar);
                        p13.f59124a = hVar;
                        Intrinsics.checkNotNullExpressionValue(p13, "apply(...)");
                        tabLayout.e(p13, hVar.f86006b);
                    }
                    tabLayout.b(new nm1.j0(tabLayout, this));
                }
            }
        } else if (vVar instanceof t) {
            q1Var.f138224d.setText(((t) vVar).f86057a.a(this.f89352a));
            this.f89357f.D(model.f86051g);
            f1Var.D(model.f86052h);
        }
        this.f89364m.invoke(model.f86048d);
    }

    public final void d(w0 w0Var) {
        q1 q1Var = this.f89353b;
        q1Var.f138229i.setVisibility(8);
        o oVar = q1Var.f138228h;
        oVar.d(false);
        if ((w0Var instanceof p0) || (w0Var instanceof r0)) {
            oVar.d(true);
        } else if (w0Var instanceof n0) {
            q1Var.f138229i.setVisibility(0);
        }
        y90.u.f138247k.invoke(w0Var);
    }
}
