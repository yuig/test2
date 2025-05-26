package rk0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c0;
import ca0.y;
import com.pinterest.feature.board.detail.floatingtoolbar.FloatingToolbarView;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import i92.k;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import u50.r;
import uj2.q;
import x02.x0;
import x02.z0;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public x0 f108441a;

    /* renamed from: b, reason: collision with root package name */
    public z0 f108442b;

    /* renamed from: c, reason: collision with root package name */
    public w f108443c;

    /* renamed from: d, reason: collision with root package name */
    public k f108444d;

    /* renamed from: e, reason: collision with root package name */
    public String f108445e;

    /* renamed from: f, reason: collision with root package name */
    public d0 f108446f;

    /* renamed from: g, reason: collision with root package name */
    public FloatingToolbarView f108447g;

    /* renamed from: h, reason: collision with root package name */
    public r f108448h;

    /* renamed from: i, reason: collision with root package name */
    public FloatingToolbarView f108449i;

    /* renamed from: j, reason: collision with root package name */
    public View f108450j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f108451k;

    /* renamed from: l, reason: collision with root package name */
    public xj2.c f108452l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f108453m;

    /* renamed from: n, reason: collision with root package name */
    public View f108454n;

    public static void d(j jVar, sk0.d displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        FloatingToolbarView floatingToolbarView = jVar.f108447g;
        if (floatingToolbarView != null) {
            floatingToolbarView.x(displayState.f113049a, new a(jVar, 0), new a(jVar, 1));
            floatingToolbarView.setTranslationY(400.0f);
            jVar.c(true);
            Intrinsics.checkNotNullParameter(displayState, "displayState");
            if (displayState.f113052d) {
                jVar.u(jl0.d.ORGANIZE);
            }
        }
    }

    public final void b(RecyclerView recyclerView) {
        if (recyclerView != null) {
            recyclerView.o(new c0(this, 9));
        }
    }

    public final void c(boolean z13) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator listener;
        if (!this.f108453m || z13) {
            this.f108453m = !z13;
            FloatingToolbarView floatingToolbarView = this.f108449i;
            if (floatingToolbarView == null || (animate = floatingToolbarView.animate()) == null || (duration = animate.setDuration(300L)) == null) {
                return;
            }
            ViewPropertyAnimator translationY = duration.translationY(z13 ? 0.0f : 400.0f);
            if (translationY == null || (listener = translationY.setListener(new androidx.recyclerview.widget.d0(z13, this))) == null) {
                return;
            }
            listener.start();
        }
    }

    public final String e() {
        String str = this.f108445e;
        if (str != null) {
            return str;
        }
        Intrinsics.r("boardId");
        throw null;
    }

    public final void f() {
        if (this.f108451k) {
            xj2.c cVar = this.f108452l;
            if (cVar != null) {
                cVar.dispose();
            }
            c(false);
            this.f108452l = q.M(1000L, TimeUnit.MILLISECONDS, tk2.e.f118016b).H(tk2.e.f118017c).A(wj2.c.a()).F(new pj0.f(17, new a(this, 2)), new pj0.f(18, b.f108440i), ck2.i.f27923c, ck2.i.f27924d);
        }
    }

    public final void g(sk0.i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        r rVar = this.f108448h;
        if (rVar != null) {
            rVar.a(event);
        }
    }

    public final void h(FloatingToolbarView floatingToolbarView, y eventIntake, GestaltToolbarImpl gestaltToolbarImpl, String boardId, d0 pinalytics) {
        Intrinsics.checkNotNullParameter(floatingToolbarView, "floatingToolbarView");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f108447g = floatingToolbarView;
        this.f108449i = floatingToolbarView;
        this.f108448h = eventIntake;
        this.f108450j = gestaltToolbarImpl;
        Intrinsics.checkNotNullParameter(pinalytics, "<set-?>");
        this.f108446f = pinalytics;
        Intrinsics.checkNotNullParameter(boardId, "<set-?>");
        this.f108445e = boardId;
    }

    public final void i(boolean z13) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator duration;
        View view = this.f108454n;
        if (view != null && (animate = view.animate()) != null && (duration = animate.setDuration(300L)) != null) {
            ViewPropertyAnimator translationY = duration.translationY(z13 ? 0.0f : -400.0f);
            if (translationY != null) {
                translationY.start();
            }
        }
        c(z13);
        this.f108451k = z13;
    }
}
