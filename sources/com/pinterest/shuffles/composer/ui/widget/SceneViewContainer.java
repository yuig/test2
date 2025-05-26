package com.pinterest.shuffles.composer.ui.widget;

import a.a;
import android.R;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.transition.Slide;
import androidx.transition.TransitionSet;
import h62.n;
import h62.o;
import kg.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.x;
import o62.k;
import org.chromium.net.y;
import org.jetbrains.annotations.NotNull;
import p62.c;
import p62.d;
import p62.e;
import p62.f;
import p62.g;
import rl2.u;
import ua.t0;
import v.z1;
import x72.b;
import x72.j;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/pinterest/shuffles/composer/ui/widget/SceneViewContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "p62/c", "org/chromium/net/y", "p62/d", "v/z1", "shuffles-composer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SceneViewContainer extends FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ u[] f51893n;

    /* renamed from: a, reason: collision with root package name */
    public d f51894a;

    /* renamed from: b, reason: collision with root package name */
    public c f51895b;

    /* renamed from: c, reason: collision with root package name */
    public final g f51896c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f51897d;

    /* renamed from: e, reason: collision with root package name */
    public final j f51898e;

    /* renamed from: f, reason: collision with root package name */
    public final ActionMenu f51899f;

    /* renamed from: g, reason: collision with root package name */
    public final ZOrderIndicator f51900g;

    /* renamed from: h, reason: collision with root package name */
    public final View f51901h;

    /* renamed from: i, reason: collision with root package name */
    public final View f51902i;

    /* renamed from: j, reason: collision with root package name */
    public final k f51903j;

    /* renamed from: k, reason: collision with root package name */
    public final z1 f51904k;

    /* renamed from: l, reason: collision with root package name */
    public final g f51905l;

    /* renamed from: m, reason: collision with root package name */
    public final e f51906m;

    static {
        x xVar = new x(SceneViewContainer.class, "zOrderingEnabled", "getZOrderingEnabled()Z", 0);
        l0 l0Var = k0.f80436a;
        f51893n = new u[]{l0Var.e(xVar), a.y(SceneViewContainer.class, "dispatchTouchTarget", "getDispatchTouchTarget()Landroid/view/View;", 0, l0Var)};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SceneViewContainer(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51894a = new f();
        this.f51895b = new y();
        this.f51896c = new g(Boolean.TRUE, this, 0);
        this.f51897d = true;
        z1 z1Var = new z1();
        z1Var.f123758c = this;
        this.f51904k = z1Var;
        this.f51905l = new g(null, this, 1);
        e eVar = new e(this);
        this.f51906m = eVar;
        e eVar2 = new e(this);
        View.inflate(getContext(), o.composer_view_scene_view_container, this);
        ViewStub viewStub = (ViewStub) findViewById(n.composer_view_stub);
        b bVar = b.f134124d;
        if (bVar == null) {
            Intrinsics.r("current");
            throw null;
        }
        Intrinsics.f(viewStub);
        j p13 = bVar.p(viewStub);
        p13.k().setOpaque(false);
        this.f51898e = p13;
        View findViewById = findViewById(n.side_menu);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ActionMenu actionMenu = (ActionMenu) findViewById;
        Intrinsics.checkNotNullParameter(actionMenu, "<set-?>");
        this.f51899f = actionMenu;
        View findViewById2 = findViewById(n.z_order_indicator);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        ZOrderIndicator zOrderIndicator = (ZOrderIndicator) findViewById2;
        Intrinsics.checkNotNullParameter(zOrderIndicator, "<set-?>");
        this.f51900g = zOrderIndicator;
        View findViewById3 = findViewById(n.long_press_scene_overlay);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        Intrinsics.checkNotNullParameter(findViewById3, "<set-?>");
        this.f51901h = findViewById3;
        View findViewById4 = findViewById(n.composer_background);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        Intrinsics.checkNotNullParameter(findViewById4, "<set-?>");
        this.f51902i = findViewById4;
        k kVar = new k(e());
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        kVar.f92995b = eVar;
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f51903j = kVar;
        e().k().setOnTouchListener(f());
        ActionMenu c13 = c();
        Intrinsics.checkNotNullParameter(eVar2, "<set-?>");
        c13.f51882a = eVar2;
    }

    public static final void a(SceneViewContainer sceneViewContainer) {
        long integer = sceneViewContainer.getContext().getResources().getInteger(R.integer.config_shortAnimTime);
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.X(0);
        Slide slide = new Slide(8388613);
        slide.f19835c = integer;
        slide.f19836d = accelerateDecelerateInterpolator;
        slide.c(sceneViewContainer.c());
        transitionSet.U(slide);
        Slide slide2 = new Slide(8388611);
        slide2.f19835c = integer;
        slide2.f19836d = accelerateDecelerateInterpolator;
        slide2.c(sceneViewContainer.g());
        transitionSet.U(slide2);
        ViewParent parent = sceneViewContainer.getParent();
        Intrinsics.g(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        t0.a((ViewGroup) parent, transitionSet);
    }

    public static View b(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3 || view == null) {
            return null;
        }
        PointF K = t.K(motionEvent);
        Point point = new Point((int) K.x, (int) K.y);
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(point, "point");
        Rect rect = new Rect();
        view.getHitRect(rect);
        if (!rect.contains(point.x, point.y) || view.getVisibility() != 0) {
            view = null;
        }
        return view;
    }

    public final ActionMenu c() {
        ActionMenu actionMenu = this.f51899f;
        if (actionMenu != null) {
            return actionMenu;
        }
        Intrinsics.r("actionMenu");
        throw null;
    }

    public final View d() {
        return (View) this.f51905l.c(this, f51893n[1]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent event) {
        boolean dispatchTouchEvent;
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            View d2 = d();
            if (d2 != null) {
                d2.dispatchTouchEvent(h(event));
            }
            dispatchTouchEvent = super.dispatchTouchEvent(event);
        } else {
            View d13 = d();
            dispatchTouchEvent = d13 != null ? d13.dispatchTouchEvent(h(event)) : super.dispatchTouchEvent(event);
        }
        this.f51905l.d(this, f51893n[1], b(d(), event));
        return dispatchTouchEvent;
    }

    public final j e() {
        j jVar = this.f51898e;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.r("sceneView");
        throw null;
    }

    public final k f() {
        k kVar = this.f51903j;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.r("touchHandler");
        throw null;
    }

    public final ZOrderIndicator g() {
        ZOrderIndicator zOrderIndicator = this.f51900g;
        if (zOrderIndicator != null) {
            return zOrderIndicator;
        }
        Intrinsics.r("zOrderIndicator");
        throw null;
    }

    public final MotionEvent h(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        View d2 = d();
        if (d2 != null) {
            motionEvent2 = MotionEvent.obtain(motionEvent);
            motionEvent2.setLocation(motionEvent.getX() - d2.getX(), motionEvent.getY() - d2.getY());
        } else {
            motionEvent2 = null;
        }
        return motionEvent2 == null ? motionEvent : motionEvent2;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        View b13 = b(c(), event);
        this.f51905l.d(this, f51893n[1], b13);
        return false;
    }
}
