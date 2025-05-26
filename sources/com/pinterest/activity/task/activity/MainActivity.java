package com.pinterest.activity.task.activity;

import ac2.m;
import ac2.o1;
import android.animation.Animator;
import android.content.Intent;
import android.content.pm.ShortcutManager;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.LinearLayout;
import android.window.SplashScreen;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import ao2.k2;
import bk.f;
import ck2.i;
import com.google.android.gms.common.api.internal.p0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.pinterest.api.model.eh0;
import com.pinterest.api.model.wy0;
import com.pinterest.component.alert.AlertContainer;
import com.pinterest.component.modal.ModalContainer;
import com.pinterest.education.view.EducationNewContainerView;
import com.pinterest.feature.comment.reactions.view.CommentReactionsContextMenuView;
import com.pinterest.feature.conversationmessage.reactions.view.ConversationMessageReactionsContextMenuView;
import com.pinterest.feature.notificationtab.view.NotificationsTabBadgeFlyoutView;
import com.pinterest.feature.pin.reactions.view.ReactionsContextMenuView;
import com.pinterest.framework.screens.NoneLocation;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.s;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.navigation.view.lego.LegoFloatingBottomNavBar;
import com.pinterest.pushnotification.l;
import com.pinterest.recoveryv2p.RecoveryScreenLocation;
import com.pinterest.typeahead.TypeaheadCacheWorkerSchedulerImpl;
import com.pinterest.ui.menu.ContextMenuView;
import e3.a;
import ey.b0;
import ey.c0;
import ey.d0;
import ey.j3;
import ey.t4;
import ey.x4;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.u0;
import hb2.t;
import i32.y0;
import ir.d;
import ir.e;
import ir.h;
import ir.k;
import ir.n;
import ir.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import kh2.k3;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;
import lb0.q;
import lh0.a4;
import lh0.g1;
import lh0.o;
import lh0.z3;
import m60.r;
import m60.x0;
import nx.j1;
import ny1.w;
import org.chromium.net.y;
import p000do.c;
import q8.m0;
import r70.g;
import so.f4;
import so.g4;
import so.j4;
import so.k4;
import tb0.p;
import tq.a0;
import vo.x;
import x02.a2;
import x02.i2;
import x92.b;
import xk2.v;
import yb0.j;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0003\t\n\u000bB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/pinterest/activity/task/activity/MainActivity;", "Lir/e;", "Lnx/j1;", "Ldo/c;", "Lr70/g;", "Luo1/a;", "Lir/d;", "<init>", "()V", "com/facebook/login/z", "ir/k", "ir/l", "activityLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MainActivity extends e implements j1, c, g, d {
    public static final f N0 = new f();
    public a A;
    public s A0;
    public o B;
    public k4 B0;
    public wk2.a C;
    public q C0;
    public se2.a D;
    public x D0;
    public se2.a E;
    public se2.a E0;
    public se2.a F;
    public l F0;
    public b G0;
    public se2.a H;
    public se2.a K;
    public se2.a L;
    public final j L0;
    public se2.a M;
    public se2.a N;
    public se2.a O;
    public lu1.b P;
    public rg0.s Q;
    public r70.f R;
    public wk2.a S;
    public wk2.a T;
    public m U;
    public se2.a V;
    public wk2.a W;
    public r X;
    public gp1.l Y;
    public se2.a Z;

    /* renamed from: a0, reason: collision with root package name */
    public wk2.a f35170a0;

    /* renamed from: b0, reason: collision with root package name */
    public se2.a f35171b0;

    /* renamed from: c0, reason: collision with root package name */
    public se2.a f35172c0;

    /* renamed from: d0, reason: collision with root package name */
    public w f35173d0;

    /* renamed from: e0, reason: collision with root package name */
    public TypeaheadCacheWorkerSchedulerImpl f35174e0;

    /* renamed from: f0, reason: collision with root package name */
    public ew.m f35175f0;

    /* renamed from: g0, reason: collision with root package name */
    public se2.a f35176g0;

    /* renamed from: h0, reason: collision with root package name */
    public ik1.g f35178h0;

    /* renamed from: i, reason: collision with root package name */
    public ModalContainer f35179i;

    /* renamed from: i0, reason: collision with root package name */
    public se2.a f35180i0;

    /* renamed from: j, reason: collision with root package name */
    public AlertContainer f35181j;

    /* renamed from: j0, reason: collision with root package name */
    public f4 f35182j0;

    /* renamed from: k, reason: collision with root package name */
    public ContextMenuView f35183k;

    /* renamed from: k0, reason: collision with root package name */
    public se2.a f35184k0;

    /* renamed from: l, reason: collision with root package name */
    public ViewStub f35185l;

    /* renamed from: l0, reason: collision with root package name */
    public se2.a f35186l0;

    /* renamed from: m, reason: collision with root package name */
    public ViewStub f35187m;

    /* renamed from: m0, reason: collision with root package name */
    public se2.a f35188m0;

    /* renamed from: n, reason: collision with root package name */
    public ViewStub f35189n;

    /* renamed from: n0, reason: collision with root package name */
    public g4 f35190n0;

    /* renamed from: o, reason: collision with root package name */
    public ViewStub f35191o;

    /* renamed from: o0, reason: collision with root package name */
    public g92.g f35192o0;

    /* renamed from: p, reason: collision with root package name */
    public EducationNewContainerView f35193p;

    /* renamed from: p0, reason: collision with root package name */
    public se2.a f35194p0;

    /* renamed from: q, reason: collision with root package name */
    public ViewStub f35195q;

    /* renamed from: q0, reason: collision with root package name */
    public j4 f35196q0;

    /* renamed from: r, reason: collision with root package name */
    public ViewStub f35197r;

    /* renamed from: r0, reason: collision with root package name */
    public se2.a f35198r0;

    /* renamed from: s, reason: collision with root package name */
    public ReactionsContextMenuView f35199s;

    /* renamed from: s0, reason: collision with root package name */
    public com.pinterest.feature.pin.o f35200s0;

    /* renamed from: t, reason: collision with root package name */
    public CommentReactionsContextMenuView f35201t;

    /* renamed from: t0, reason: collision with root package name */
    public View f35202t0;

    /* renamed from: u, reason: collision with root package name */
    public ConversationMessageReactionsContextMenuView f35203u;

    /* renamed from: u0, reason: collision with root package name */
    public final ir.g f35204u0;

    /* renamed from: v, reason: collision with root package name */
    public Navigation f35205v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f35206v0;

    /* renamed from: w, reason: collision with root package name */
    public Bundle f35207w;

    /* renamed from: w0, reason: collision with root package name */
    public t f35208w0;

    /* renamed from: x, reason: collision with root package name */
    public ir.c f35209x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f35210x0;

    /* renamed from: y, reason: collision with root package name */
    public so1.a f35211y;

    /* renamed from: z, reason: collision with root package name */
    public eh0 f35213z;

    /* renamed from: h, reason: collision with root package name */
    public long f35177h = -1;
    public final v G = xk2.m.b(new n(this, 2));
    public final v I = xk2.m.b(new n(this, 3));

    /* renamed from: J, reason: collision with root package name */
    public final AtomicBoolean f35169J = new AtomicBoolean(true);

    /* renamed from: y0, reason: collision with root package name */
    public final int f35212y0 = tr.c.activity_main_bottom_nav_hide_lego_delayed;

    /* renamed from: z0, reason: collision with root package name */
    public final String f35214z0 = MainActivity.class.getName() + ":" + hashCode();
    public final ir.l H0 = new ir.l(this);
    public final ir.s I0 = new ir.s(this);
    public final v J0 = xk2.m.b(new n(this, 1));
    public final k K0 = new k(this);
    public final u M0 = new u(this);

    public MainActivity() {
        int i13 = 0;
        this.f35204u0 = new ir.g(this, i13);
        this.L0 = new j(new n(this, i13), new ir.m(this, i13));
    }

    public static final void A(MainActivity mainActivity) {
        mainActivity.getClass();
        if (r70.b.f106349i.k0().f106352b) {
            r70.a aVar = mainActivity.f130611b;
            k3.R1(aVar != null ? aVar.getView() : null, false);
        }
    }

    public static final void B(MainActivity mainActivity, String str, boolean z13, boolean z14) {
        nl1.d b13 = mainActivity.getNavigationManager().b();
        d4 f140067r0 = b13 != null ? b13.getF140067r0() : null;
        if (f140067r0 == d4.LIL_ADS_MANAGER_CREATE || f140067r0 == d4.BROWSER) {
            return;
        }
        AlertContainer alertContainer = mainActivity.f35181j;
        if (alertContainer == null) {
            Intrinsics.r("alertContainer");
            throw null;
        }
        if (alertContainer.isShown() || !z13) {
            return;
        }
        if (yb2.a.b(((b60.d) mainActivity.getActiveUserManager()).f()) || z14) {
            se2.a aVar = mainActivity.L;
            if (aVar == null) {
                Intrinsics.r("pinRepository");
                throw null;
            }
            int i13 = 3;
            xj2.c F = ((i2) ((bf2.b) aVar).get()).P(str).H(tk2.e.f118017c).A(wj2.c.a()).F(new h(2, new a0(mainActivity, i13)), new h(i13, ir.r.f73477l), i.f27923c, i.f27924d);
            Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
            mainActivity.addDisposable(F);
        }
    }

    public static void C(MainActivity mainActivity, Navigation navigation) {
        mainActivity.getClass();
        if (!c60.d.b()) {
            wk2.a aVar = mainActivity.S;
            if (aVar == null) {
                Intrinsics.r("unauthLocationsProvider");
                throw null;
            }
            yo1.a aVar2 = (yo1.a) aVar.get();
            ScreenLocation f49939a = navigation.getF49939a();
            Intrinsics.checkNotNullExpressionValue(f49939a, "getLocation(...)");
            if (!aVar2.a(f49939a)) {
                lu1.b bVar = mainActivity.P;
                if (bVar == null) {
                    Intrinsics.r("baseActivityHelper");
                    throw null;
                }
                ((lu1.c) bVar).q(mainActivity, null);
                mainActivity.finish();
                return;
            }
        }
        mainActivity.getNavigationManager().m(navigation);
    }

    public static ScreenLocation G() {
        return (ScreenLocation) com.pinterest.screens.b.f50536a.getValue();
    }

    public static final void l0(MainActivity mainActivity, int i13, ir.i iVar) {
        se2.a aVar = mainActivity.f35172c0;
        if (aVar == null) {
            Intrinsics.r("sendShareServiceWrapper");
            throw null;
        }
        Object obj = ((bf2.b) aVar).get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        uj2.q d2 = u20.d.d((u20.d) obj, i13);
        a2 a2Var = i.f27924d;
        ck2.c cVar = i.f27923c;
        new jk2.a0(d2, iVar, a2Var, cVar).H(tk2.e.f118017c).F(new mc.h(4, ir.t.f73482l), new mc.h(5, ir.t.f73483m), cVar, a2Var);
    }

    public static final boolean y(MainActivity mainActivity) {
        return ((z70.f) ((bf2.b) mainActivity.getChromeSettings()).get()).f140994c || ((a80.a) ((bf2.b) mainActivity.getInAppBrowserSettings()).get()).f1501a;
    }

    public static final void z(MainActivity mainActivity) {
        mainActivity.getClass();
        if (r70.b.f106349i.k0().f106352b) {
            r70.a aVar = mainActivity.f130611b;
            k3.R1(aVar != null ? aVar.getView() : null, true);
        }
    }

    public final void D() {
        String string;
        Bundle bundle = this.f35207w;
        if (bundle == null || (string = bundle.getString("PREF_LANGUAGE_LOCALE")) == null || z.i(string, Locale.getDefault().toString(), true)) {
            return;
        }
        recreate();
    }

    public final ew.m E() {
        ew.m mVar = this.f35175f0;
        if (mVar != null) {
            return mVar;
        }
        Intrinsics.r("adsGmaManager");
        throw null;
    }

    public final se2.a F() {
        se2.a aVar = this.f35176g0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("adsOpenMeasurementManager");
        throw null;
    }

    public final a I() {
        a aVar = this.A;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("blockingAlertHelper");
        throw null;
    }

    public final se2.a K() {
        se2.a aVar = this.f35171b0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("crashReporting");
        throw null;
    }

    public final se2.a L() {
        se2.a aVar = this.K;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("lazyBaseApiCallAdapterFactory");
        throw null;
    }

    public final se2.a O() {
        se2.a aVar = this.f35188m0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("lazyImageCache");
        throw null;
    }

    public final Navigation Q(Intent intent) {
        String str;
        NavigationImpl c13;
        ShortcutManager shortcutManager;
        if (intent == null) {
            return null;
        }
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.pinterest.EXTRA_PENDING_TASK");
            if (parcelableExtra instanceof Navigation) {
                intent.removeExtra("com.pinterest.EXTRA_PENDING_TASK");
                ScreenLocation f49939a = ((Navigation) parcelableExtra).getF49939a();
                if (f49939a == null) {
                    return null;
                }
                if (f49939a == NoneLocation.NONE) {
                    e0("Location parsed to NONE", (Navigation) parcelableExtra, f49939a);
                    return null;
                }
                if (!Intrinsics.d(f49939a, G()) || ((Navigation) parcelableExtra).v0("com.pinterest.EXTRA_PIN_ID") != null) {
                    return (Navigation) parcelableExtra;
                }
                e0("ExtraPinIdMissing", (Navigation) parcelableExtra, f49939a);
                return null;
            }
            if (Intrinsics.d("com.google.android.gms.actions.SEARCH_ACTION", intent.getAction())) {
                String stringExtra = intent.getStringExtra("query");
                String str2 = stringExtra != null ? stringExtra : "";
                g0(str2);
                return Navigation.z0(com.pinterest.screens.b.d(), str2);
            }
            String shortcut = intent.getStringExtra("com.pinterest.EXTRA_SHORTCUT");
            if (shortcut == null) {
                shortcut = "";
            }
            if (this.D0 == null) {
                Intrinsics.r("shortcutsHelper");
                throw null;
            }
            wy0 f13 = ((b60.d) getActiveUserManager()).f();
            String uid = f13 != null ? f13.getUid() : null;
            String userId = uid == null ? "" : uid;
            Intrinsics.checkNotNullParameter(this, "context");
            Intrinsics.checkNotNullParameter(shortcut, "shortcut");
            Intrinsics.checkNotNullParameter(userId, "userId");
            if (shortcut.length() == 0) {
                c13 = null;
            } else {
                c13 = Intrinsics.d(shortcut, getString(x0.saved)) ? r41.k.c(r41.k.f106176a, userId, r41.b.ShortcutsHelper, null, null, 28) : Intrinsics.d(shortcut, getString(x0.search)) ? Navigation.w1(com.pinterest.screens.b.e()) : Intrinsics.d(shortcut, getString(x0.lens_feature)) ? Navigation.w1(com.pinterest.screens.b.b()) : null;
                if (c13 != null && (shortcutManager = (ShortcutManager) getSystemService(ShortcutManager.class)) != null) {
                    shortcutManager.reportShortcutUsed(shortcut);
                }
            }
            if (c13 != null) {
                d0(shortcut);
                return c13;
            }
            Bundle extras = intent.getExtras();
            String string = extras != null ? extras.getString("com.pinterest.EXTRA_PIN_ID") : null;
            Bundle extras2 = intent.getExtras();
            String string2 = extras2 != null ? extras2.getString("com.pinterest.EXTRA_BOARD_ID") : null;
            Bundle extras3 = intent.getExtras();
            String string3 = extras3 != null ? extras3.getString("com.pinterest.EXTRA_USER_ID") : null;
            if (string != null && string.length() != 0) {
                return Navigation.z0(com.pinterest.screens.b.c(), string);
            }
            if (string2 != null && string2.length() != 0) {
                return Navigation.z0(com.pinterest.screens.b.a(), string2);
            }
            if (string3 == null || string3.length() == 0) {
                return null;
            }
            NavigationImpl z03 = Navigation.z0(com.pinterest.screens.b.h(), string3);
            z03.z(r41.b.MainActivity.ordinal(), "ADS_ONLY_PROFILE_ORIGIN");
            return z03;
        } catch (RuntimeException e13) {
            Uri data = intent.getData();
            if (data == null || (str = data.toString()) == null) {
                str = "none";
            }
            ((tb0.h) ((bf2.b) K()).get()).q(e13, intent + " PendingTaskSerializationData: " + str, p.NAVIGATION);
            return null;
        }
    }

    public final w R() {
        w wVar = this.f35173d0;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.r("permissionsManager");
        throw null;
    }

    public final se2.a S() {
        se2.a aVar = this.f35180i0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("powerscoreExperimentManager");
        throw null;
    }

    public final q T() {
        q qVar = this.C0;
        if (qVar != null) {
            return qVar;
        }
        Intrinsics.r("prefsManagerPersisted");
        throw null;
    }

    public final gp1.l V() {
        gp1.l lVar = this.Y;
        if (lVar != null) {
            return lVar;
        }
        Intrinsics.r("searchTypeaheadDownloadUtils");
        throw null;
    }

    public final se2.a X() {
        se2.a aVar = this.O;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("toastUtils");
        throw null;
    }

    public final k22.m Y() {
        Object value = this.I.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k22.m) value;
    }

    public final void Z() {
        LinearLayout view;
        ViewTreeObserver viewTreeObserver;
        r70.a aVar = this.f130611b;
        if (aVar != null) {
            aVar.g(r70.b.f106349i.k0().f106352b, false);
        }
        r70.a aVar2 = this.f130611b;
        if (aVar2 == null || (view = aVar2.getView()) == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(this.M0);
    }

    @Override // p000do.c
    public final void a(Bundle state, Object target) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(state, "state");
        s sVar = this.A0;
        if (sVar == null) {
            Intrinsics.r("mainScreenManager");
            throw null;
        }
        sVar.D(state);
        boolean b13 = zh0.c.b();
        float c13 = b13 ? zh0.c.c(state) : 0.0f;
        super.onSaveInstanceState(state);
        if (b13) {
            zh0.c.a(state, "viewHierarchy", Float.valueOf(zh0.c.c(state) - c13), 100.0f);
        }
    }

    public final void a0() {
        View findViewById = findViewById(tr.b.main_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f35208w0 = new t(this, findViewById);
        androidx.coordinatorlayout.widget.c cVar = new androidx.coordinatorlayout.widget.c(-1, -2);
        cVar.f17902c = 48;
        ((CoordinatorLayout) findViewById(tr.b.coordinator)).addView(this.f35208w0, cVar);
    }

    @Override // cp1.p, nx.j1
    public final d4 d() {
        nl1.d f52740f = getF52740f();
        if (f52740f != null) {
            return f52740f.E7();
        }
        return null;
    }

    public final void d0(String str) {
        getPinalytics().U(new ir.v(0).generateLoggingContext(), f1.TAP, str, null, null, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent event) {
        String str = "Empty";
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z13 = false;
        try {
            ContextMenuView contextMenuView = this.f35183k;
            if (contextMenuView == null) {
                Intrinsics.r("contextMenu");
                throw null;
            }
            if (contextMenuView.isShown()) {
                int action = event.getAction();
                event.setAction(3);
                super.dispatchTouchEvent(event);
                event.setAction(action);
                ContextMenuView contextMenuView2 = this.f35183k;
                if (contextMenuView2 != null) {
                    return contextMenuView2.dispatchTouchEvent(event);
                }
                Intrinsics.r("contextMenu");
                throw null;
            }
            ReactionsContextMenuView reactionsContextMenuView = this.f35199s;
            if (reactionsContextMenuView != null && reactionsContextMenuView.getF47314t()) {
                int action2 = event.getAction();
                event.setAction(3);
                super.dispatchTouchEvent(event);
                event.setAction(action2);
                ReactionsContextMenuView reactionsContextMenuView2 = this.f35199s;
                if (reactionsContextMenuView2 != null) {
                    return reactionsContextMenuView2.dispatchTouchEvent(event);
                }
                return false;
            }
            CommentReactionsContextMenuView commentReactionsContextMenuView = this.f35201t;
            if (commentReactionsContextMenuView != null && commentReactionsContextMenuView.getF45499r()) {
                int action3 = event.getAction();
                event.setAction(3);
                super.dispatchTouchEvent(event);
                event.setAction(action3);
                CommentReactionsContextMenuView commentReactionsContextMenuView2 = this.f35201t;
                if (commentReactionsContextMenuView2 != null) {
                    return commentReactionsContextMenuView2.dispatchTouchEvent(event);
                }
                return false;
            }
            ConversationMessageReactionsContextMenuView conversationMessageReactionsContextMenuView = this.f35203u;
            if (conversationMessageReactionsContextMenuView != null && conversationMessageReactionsContextMenuView.getF45635d()) {
                int action4 = event.getAction();
                event.setAction(3);
                super.dispatchTouchEvent(event);
                event.setAction(action4);
                ConversationMessageReactionsContextMenuView conversationMessageReactionsContextMenuView2 = this.f35203u;
                if (conversationMessageReactionsContextMenuView2 != null) {
                    return conversationMessageReactionsContextMenuView2.dispatchTouchEvent(event);
                }
                return false;
            }
            r70.a aVar = this.f130611b;
            LegoFloatingBottomNavBar legoFloatingBottomNavBar = aVar instanceof LegoFloatingBottomNavBar ? (LegoFloatingBottomNavBar) aVar : null;
            if (legoFloatingBottomNavBar != null) {
                View findViewById = legoFloatingBottomNavBar.findViewById(ks1.c.notifs_badge_flyout_container);
                NotificationsTabBadgeFlyoutView notificationsTabBadgeFlyoutView = findViewById instanceof NotificationsTabBadgeFlyoutView ? (NotificationsTabBadgeFlyoutView) findViewById : null;
                if (notificationsTabBadgeFlyoutView != null) {
                    int action5 = event.getAction();
                    event.setAction(3);
                    super.dispatchTouchEvent(event);
                    event.setAction(action5);
                    notificationsTabBadgeFlyoutView.dispatchTouchEvent(event);
                    legoFloatingBottomNavBar.removeView(notificationsTabBadgeFlyoutView);
                }
            }
            return super.dispatchTouchEvent(event);
        } catch (IllegalArgumentException e13) {
            View decorView = getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
            ((tb0.h) ((bf2.b) K()).get()).h(c0.d.k0(decorView, ir.r.f73476k));
            ((tb0.h) ((bf2.b) K()).get()).q(e13, "MainActivity:dispatchTouchEvent", p.TOUCH_HANDLING);
            return true;
        } catch (IllegalStateException e14) {
            tb0.k kVar = new tb0.k();
            if (Intrinsics.d(e14.getMessage(), "already recycled once")) {
                kVar.c("Exception", "Already recycled once");
            } else {
                String message = e14.getMessage();
                if (message != null && message.length() != 0) {
                    str = message;
                }
                kVar.c("ISE-Other", str);
            }
            ((tb0.h) ((bf2.b) K()).get()).k("DispatchTouchEvent", kVar.f117102a);
            return true;
        } catch (IndexOutOfBoundsException e15) {
            tb0.k kVar2 = new tb0.k();
            if (Intrinsics.d(e15.getMessage(), "Inconsistency detected")) {
                kVar2.c("Exception", "RecycleView Inconsistency");
            } else {
                String message2 = e15.getMessage();
                if (message2 != null && message2.length() != 0) {
                    str = message2;
                }
                kVar2.c("IOOBE-Other", str);
            }
            ((tb0.h) ((bf2.b) K()).get()).k("DispatchTouchEvent", kVar2.f117102a);
            throw e15;
        } catch (NullPointerException e16) {
            tb0.k kVar3 = new tb0.k();
            String message3 = e16.getMessage();
            if (message3 == null || !StringsKt.E(message3, "mPrivateFlags", false)) {
                kVar3.c("Exception", "NPE - Other");
                String message4 = e16.getMessage();
                if (message4 != null && message4.length() != 0) {
                    str = message4;
                }
                kVar3.c("NPE-Other", str);
            } else {
                kVar3.c("Exception", "NPE - mPrivateFlags");
                z13 = true;
            }
            ((tb0.h) ((bf2.b) K()).get()).k("DispatchTouchEvent", kVar3.f117102a);
            if (z13) {
                return true;
            }
            throw e16;
        } catch (StackOverflowError e17) {
            View decorView2 = getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView2, "getDecorView(...)");
            String k03 = c0.d.k0(decorView2, ir.r.f73475j);
            tb0.h hVar = (tb0.h) ((bf2.b) K()).get();
            tb0.k kVar4 = new tb0.k();
            kVar4.c("Exception", "StackOverflowError");
            hVar.k("DispatchTouchEvent", kVar4.f117102a);
            ((tb0.h) ((bf2.b) K()).get()).h(k03);
            throw e17;
        }
    }

    public final void e0(String str, Navigation navigation, ScreenLocation screenLocation) {
        tb0.h hVar = (tb0.h) ((bf2.b) K()).get();
        tb0.k kVar = new tb0.k();
        kVar.c("Reason", str);
        kVar.c("Navigation", navigation.toString());
        kVar.c("Location", screenLocation.getName());
        hVar.k("PendingNavigation", kVar.f117102a);
    }

    @Override // p000do.c
    public final void f(Bundle bundle, Object target) {
        Intrinsics.checkNotNullParameter(target, "target");
        s sVar = this.A0;
        if (sVar != null) {
            sVar.C(this, bundle);
        } else {
            Intrinsics.r("mainScreenManager");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        SplashScreen splashScreen;
        if (Build.VERSION.SDK_INT >= 31) {
            splashScreen = getSplashScreen();
            splashScreen.clearOnExitAnimationListener();
        }
        super.finish();
    }

    public final void g0(String str) {
        ir.v vVar = new ir.v(1);
        getPinalytics().U(vVar.generateLoggingContext(), f1.SERVICE_ENTRY, null, null, ep.b.o("query", str), false);
    }

    @Override // cp1.p, nx.a
    public final i0 generateLoggingContext() {
        nl1.d f52740f = getF52740f();
        return f52740f != null ? f52740f.generateLoggingContext() : super.generateLoggingContext();
    }

    @Override // cp1.p, uo1.a
    public final so1.a getBaseActivityComponent() {
        so1.a aVar = this.f35211y;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("baseActivityComponent");
        throw null;
    }

    @Override // cp1.p, yf0.f
    public final yf0.d getEdgeToEdgeConfiguration() {
        return isEdgeToEdgeEnabled() ? new yf0.c(yf0.h.SYSTEM_BARS) : yf0.b.f138956a;
    }

    @Override // cp1.p
    public final Fragment getFragment() {
        return getSupportFragmentManager().E(tr.b.main_container);
    }

    @Override // uk1.c
    /* renamed from: getViewType */
    public final d4 getF55071t0() {
        return d4.UNKNOWN_VIEW;
    }

    public final void i0(Intent intent) {
        if (intent == null || !c60.d.b() || (this.f130611b instanceof ru1.k)) {
            return;
        }
        if (x().a()) {
            o0(intent);
            return;
        }
        try {
            o0(intent);
        } catch (RuntimeException e13) {
            ((tb0.h) ((bf2.b) K()).get()).q(e13, "maybeHandlePendingTab invalid intent", p.NAVBAR);
        }
    }

    @Override // cp1.p, ms1.b
    public final void inflateConfettiContainer() {
        ViewStub viewStub = this.f35197r;
        if (viewStub != null) {
            viewStub.inflate();
        } else {
            Intrinsics.r("confettiContainerStub");
            throw null;
        }
    }

    @Override // cp1.p, ms1.b
    public final void inflateEducationContainer() {
        if (this.f35193p == null) {
            ViewStub viewStub = this.f35195q;
            if (viewStub == null) {
                Intrinsics.r("educationContainerStub");
                throw null;
            }
            View inflate = viewStub.inflate();
            Intrinsics.g(inflate, "null cannot be cast to non-null type com.pinterest.education.view.EducationNewContainerView");
            this.f35193p = (EducationNewContainerView) inflate;
        }
    }

    public final boolean isEdgeToEdgeEnabled() {
        lh0.b x13 = x();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) x13.f83299a;
        return g1Var.o("android_main_activity_edge_to_edge", "enabled", z3Var) || g1Var.l("android_main_activity_edge_to_edge");
    }

    public final void k0() {
        int i13 = 32;
        new t4(i13, b0.TAG_ADS_GMA_MANAGER_INIT, new com.airbnb.lottie.k(this, 28), true, true).c();
    }

    public final void m0(int i13, String str, String str2) {
        String stringExtra = getIntent().getStringExtra(str);
        if (stringExtra == null) {
            stringExtra = "";
        }
        String stringExtra2 = getIntent().getStringExtra(str2);
        String str3 = stringExtra2 == null ? "" : stringExtra2;
        String string = getString(i13, stringExtra);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        lr.a0 a0Var = new lr.a0(string, str3, ((b60.d) getActiveUserManager()).f(), 3, 2);
        a0Var.f129242b = true;
        getEventManager().d(new i92.i(a0Var));
    }

    public final void o0(Intent intent) {
        String stringExtra = intent.getStringExtra("com.pinterest.EXTRA_PENDING_TAB");
        if (stringExtra == null || stringExtra.length() == 0) {
            return;
        }
        intent.removeExtra("com.pinterest.EXTRA_PENDING_TAB");
        u70.a valueOf = u70.a.valueOf(stringExtra);
        boolean booleanExtra = intent.getBooleanExtra("com.pinterest.EXTRA_IS_DEEPLINK", false);
        Bundle bundleExtra = intent.getBundleExtra("com.pinterest.EXTRA_PENDING_TAB_EXTRAS");
        r70.a aVar = this.f130611b;
        if (aVar != null) {
            aVar.l(valueOf, valueOf.ordinal(), bundleExtra, !booleanExtra);
        }
        if (bundleExtra != null) {
            getEventManager().f(new r70.m(valueOf, bundleExtra));
        }
        intent.removeExtra("com.pinterest.EXTRA_PENDING_TAB_EXTRAS");
    }

    @Override // cp1.p, androidx.fragment.app.FragmentActivity, androidx.activity.o, android.app.Activity
    public final void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        if (i13 == 300) {
            se2.a aVar = this.F;
            if (aVar == null) {
                Intrinsics.r("chromeTabHelper");
                throw null;
            }
            if (((z70.m) ((bf2.b) aVar).get()).e()) {
                wk2.a aVar2 = this.T;
                if (aVar2 == null) {
                    Intrinsics.r("customTabManagerProvider");
                    throw null;
                }
                y70.g gVar = (y70.g) aVar2.get();
                z70.a chromeSessionEvent = new z70.a();
                gVar.getClass();
                Intrinsics.checkNotNullParameter(chromeSessionEvent, "chromeSessionEvent");
                gVar.f138002m.c(chromeSessionEvent);
                se2.a aVar3 = this.F;
                if (aVar3 == null) {
                    Intrinsics.r("chromeTabHelper");
                    throw null;
                }
                ((z70.m) ((bf2.b) aVar3).get()).b();
            }
        }
        ModalContainer modalContainer = this.f35179i;
        if (modalContainer == null) {
            Intrinsics.r("modalContainer");
            throw null;
        }
        if (modalContainer.h()) {
            jc0.a0 a0Var = (jc0.a0) modalContainer.f44760e.peek();
            Intrinsics.f(a0Var);
            a0Var.onActivityResult(i13, i14, intent);
        }
    }

    @Override // androidx.appcompat.app.n, androidx.activity.o, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Window window = getWindow();
        if (window != null) {
            pk.a0.j1(window, newConfig);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x020b, code lost:
    
        if (getIntent().getBooleanExtra("com.pinterest.EXTRA_NO_BOTTOM_NAV_INFLATION", false) != false) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x029f  */
    @Override // cp1.p, cp1.q, androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 1445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.activity.task.activity.MainActivity.onCreate(android.os.Bundle):void");
    }

    @Override // cp1.p, cp1.q, androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        String str;
        s sVar = this.A0;
        if (sVar == null) {
            Intrinsics.r("mainScreenManager");
            throw null;
        }
        sVar.h(this, isChangingConfigurations());
        ku1.j navigationManager = getNavigationManager();
        navigationManager.f80913k = null;
        navigationManager.f80903a = null;
        navigationManager.f80915m = false;
        d0.f60468a.clear();
        pd.s sVar2 = this.f130612c;
        if (sVar2 != null) {
            List F0 = CollectionsKt.F0((HashSet) sVar2.f99753g);
            ArrayList arrayList = new ArrayList();
            for (Object obj : F0) {
                if (((Animator) obj).isRunning()) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Animator) it.next()).cancel();
            }
            ((HashSet) sVar2.f99753g).clear();
            if (((ViewGroup) sVar2.f99749c).isAttachedToWindow()) {
                ((ViewGroup) sVar2.f99749c).removeAllViews();
            }
        }
        m mVar = this.U;
        if (mVar == null) {
            Intrinsics.r("videoManager");
            throw null;
        }
        LinkedHashMap linkedHashMap = ((o1) mVar).f2020w;
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            ((xj2.c) it2.next()).dispose();
        }
        linkedHashMap.clear();
        r70.b.f106349i.k0().f106351a = null;
        wk2.a aVar = this.W;
        if (aVar == null) {
            Intrinsics.r("onDemandLibrariesInstallManagerProvider");
            throw null;
        }
        c91.d dVar = (c91.d) aVar.get();
        c91.b bVar = dVar.f26988f;
        if (bVar != null) {
            ((jk.b) ((at1.d) dVar.f26983a.get()).f20447l.getValue()).b(bVar);
        }
        if (isFinishing() && !x().a()) {
            try {
                p000do.a.a();
                p000do.b bVar2 = p000do.a.f55640b;
                if (bVar2.f55649h && (str = (String) bVar2.f55646e.remove(this)) != null) {
                    bVar2.a(str);
                }
            } catch (IllegalStateException unused) {
            }
        }
        super.onDestroy();
    }

    @Override // androidx.activity.o, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Navigation Q = Q(intent);
        this.f35205v = Q;
        if (Q != null) {
            C(this, Q);
        }
        i0(intent);
        if (isVisible()) {
            return;
        }
        setIntent(intent);
    }

    @Override // wo.b, cp1.p, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        is1.i iVar;
        LinearLayout view;
        ViewTreeObserver viewTreeObserver;
        getNavigationManager().h();
        getEventManager().j((m60.t) this.J0.getValue());
        getEventManager().j(this.K0);
        getEventManager().j(this.L0);
        getEventManager().j(this.H0);
        LinkedHashSet linkedHashSet = d0.f60468a;
        b0 tag = b0.TAG_LOG_REPORT_FULLY_DRAWN;
        Intrinsics.checkNotNullParameter(tag, "tag");
        c0 c0Var = (c0) d0.f60469b.get(tag);
        m60.u.f85943a.j(c0Var != null ? c0Var.a() : null);
        ik1.g gVar = this.f35178h0;
        if (gVar == null) {
            Intrinsics.r("userActionSequenceTracker");
            throw null;
        }
        if (gVar.f72414d) {
            gVar.a();
            kotlin.jvm.internal.j.z(gVar.f72412b, gVar.f72415e, null, new ik1.d(gVar, null), 2);
        }
        new ny.h().i();
        dl2.b.f55293b = false;
        j3 j3Var = j3.f60510a;
        j3.j();
        r70.a aVar = this.f130611b;
        if (aVar != null && (view = aVar.getView()) != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.M0);
        }
        this.f35177h = SystemClock.uptimeMillis();
        se2.a aVar2 = this.V;
        if (aVar2 == null) {
            Intrinsics.r("locationUtils");
            throw null;
        }
        is1.l lVar = (is1.l) ((bf2.b) aVar2).get();
        lVar.getClass();
        Intrinsics.checkNotNullParameter(this, "activity");
        if (((Boolean) lVar.f73629j.getValue()).booleanValue() && (iVar = lVar.f73625f) != null) {
            li.b a13 = li.c.a(this);
            String simpleName = is1.i.class.getSimpleName();
            com.bumptech.glide.d.p("Listener type must not be empty", simpleName);
            com.google.android.gms.common.api.internal.j jVar = new com.google.android.gms.common.api.internal.j(iVar, simpleName);
            com.google.android.gms.common.api.internal.f fVar = a13.f30770j;
            fVar.getClass();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            fVar.j(taskCompletionSource, 0, a13);
            com.google.android.gms.common.api.internal.i0 i0Var = new com.google.android.gms.common.api.internal.i0(new p0(jVar, taskCompletionSource), fVar.f30814i.get(), a13);
            bi.f fVar2 = fVar.f30819n;
            fVar2.sendMessage(fVar2.obtainMessage(13, i0Var));
            taskCompletionSource.getTask().continueWith(new kp.n(10));
        }
        ew.j jVar2 = (ew.j) E();
        jVar2.f60328n.j(jVar2.f60337w);
        lw.c cVar = (lw.c) jVar2.f60326l;
        k2 k2Var = cVar.f85055j;
        if (k2Var != null) {
            k2Var.cancel((CancellationException) null);
        }
        Iterator it = cVar.f85056k.entrySet().iterator();
        while (it.hasNext()) {
            ((ao2.o1) ((Map.Entry) it.next()).getValue()).cancel((CancellationException) null);
        }
        ((ow.a) ((bf2.b) F()).get()).getClass();
        super.onPause();
    }

    @Override // androidx.activity.o, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z13) {
        super.onPictureInPictureModeChanged(z13);
        getEventManager().d(new m0(z13));
    }

    @Override // cp1.p, at1.h
    public final void onResourcesReady(int i13) {
        Bundle bundle;
        int i14 = 1;
        boolean z13 = false;
        if (isDestroyed()) {
            return;
        }
        if (this.f35207w == null && this.A0 == null) {
            Intrinsics.r("mainScreenManager");
            throw null;
        }
        if (x().a()) {
            s sVar = this.A0;
            if (sVar == null) {
                Intrinsics.r("mainScreenManager");
                throw null;
            }
            sVar.C(this, this.f35207w);
        } else {
            Bundle bundle2 = this.f35207w;
            p000do.a.a();
            p000do.b bVar = p000do.a.f55640b;
            if (bundle2 == null) {
                bVar.getClass();
            } else {
                WeakHashMap weakHashMap = bVar.f55646e;
                String string = weakHashMap.containsKey(this) ? (String) weakHashMap.get(this) : bundle2.getString("uuid_".concat(MainActivity.class.getName()), null);
                if (string != null) {
                    weakHashMap.put(this, string);
                }
                if (string != null) {
                    if (bVar.f55645d.containsKey(string)) {
                        bundle = (Bundle) bVar.f55645d.get(string);
                    } else {
                        w6.b bVar2 = bVar.f55642a;
                        if (!bVar2.f128108b) {
                            try {
                                ((Future) bVar2.f128110d).get(1000L, TimeUnit.SECONDS);
                            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException unused) {
                            }
                            bVar2.f128108b = true;
                        }
                        byte[] c13 = bVar2.c(string);
                        if (c13 == null) {
                            bundle = null;
                        } else {
                            Parcel obtain = Parcel.obtain();
                            obtain.unmarshall(c13, 0, c13.length);
                            obtain.setDataPosition(0);
                            try {
                                bundle = obtain.readBundle(pk.a0.class.getClassLoader());
                            } catch (IllegalArgumentException | IllegalStateException unused2) {
                                bundle = null;
                            }
                            obtain.recycle();
                            if (bundle == null) {
                                Log.e("Bridge", "Unable to properly convert disk-persisted data to a Bundle. Some state loss may occur.");
                            }
                        }
                    }
                    if (bundle != null) {
                        com.livefront.bridge.wrapper.b.a(bundle);
                    }
                    bVar.a(string);
                    if (bundle != null) {
                        bVar.f55647f.f(bundle, this);
                    }
                }
            }
        }
        s sVar2 = this.A0;
        if (sVar2 == null) {
            Intrinsics.r("mainScreenManager");
            throw null;
        }
        boolean z14 = sVar2.G() > 0;
        boolean z15 = (z14 || getIntent().getBooleanExtra("com.pinterest.EXTRA_SKIP_HOME_SCREEN", false)) ? false : true;
        this.f35205v = Q(getIntent());
        if (z14) {
            m60.d dVar = (m60.d) getApplicationInfoProvider();
            Timer timer = dVar.f85892b;
            if (timer != null) {
                timer.cancel();
                dVar.f85892b = null;
            }
            dVar.f85891a = m60.b.FOREGROUND;
            s sVar3 = this.A0;
            if (sVar3 == null) {
                Intrinsics.r("mainScreenManager");
                throw null;
            }
            sVar3.b();
        }
        if (z15 && c60.d.b()) {
            m60.d dVar2 = (m60.d) getApplicationInfoProvider();
            Timer timer2 = dVar2.f85892b;
            if (timer2 != null) {
                timer2.cancel();
                dVar2.f85892b = null;
            }
            dVar2.f85891a = m60.b.FOREGROUND;
            NavigationImpl z03 = Navigation.z0((ScreenLocation) com.pinterest.screens.b.f50539d.getValue(), com.bumptech.glide.d.Q(getActiveUserManager()).getUid());
            Navigation navigation = this.f35205v;
            if (navigation == null) {
                getNavigationManager().m(z03);
            } else {
                getNavigationManager().m(z03, navigation);
            }
        } else {
            Navigation navigation2 = this.f35205v;
            if (navigation2 != null) {
                C(this, navigation2);
            }
        }
        new x4(new ir.f(this, i14), b0.TAG_MAIN_ACTIVITY_START_SERVICES, z13).c();
        if (qb0.d.f103396a.c()) {
            t tVar = this.f35208w0;
            if (tVar != null) {
                tVar.b();
            }
        } else {
            if (this.f35208w0 == null) {
                a0();
            }
            t tVar2 = this.f35208w0;
            if (tVar2 != null) {
                tVar2.c();
            }
        }
        this.f35207w = null;
        ((m60.d) m60.d.a()).f85896f.getClass();
        if (Intrinsics.d("release", "benchmark")) {
            getIntent();
            View viewContainer = findViewById(tr.b.main_container);
            Intrinsics.checkNotNullExpressionValue(viewContainer, "findViewById(...)");
            Intrinsics.checkNotNullParameter(viewContainer, "viewContainer");
            String stringExtra = getIntent().getStringExtra("scenarioName");
            if (Intrinsics.d(stringExtra, "bottomSpinner") || Intrinsics.d(stringExtra, "imagePlaceHolder")) {
                hs1.m mVar = (hs1.m) ((hs1.q) ((bf2.b) O()).get());
                mVar.i();
                mVar.j();
            }
        }
    }

    @Override // wo.b, cp1.p, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        MainActivity mainActivity;
        ScreenLocation f49939a;
        r70.a aVar;
        s sVar;
        super.onResume();
        ModalContainer modalContainer = this.f35179i;
        if (modalContainer == null) {
            Intrinsics.r("modalContainer");
            throw null;
        }
        if (!modalContainer.h()) {
            ku1.j navigationManager = getNavigationManager();
            if (navigationManager.f80915m && (sVar = navigationManager.f80914l) != null) {
                sVar.b();
            }
            navigationManager.f80915m = false;
        }
        getEventManager().h((m60.t) this.J0.getValue());
        getEventManager().h(this.K0);
        getEventManager().h(this.L0);
        getEventManager().h(this.H0);
        s sVar2 = this.A0;
        if (sVar2 == null) {
            Intrinsics.r("mainScreenManager");
            throw null;
        }
        com.pinterest.framework.screens.m j13 = sVar2.j();
        long uptimeMillis = this.f35177h > 0 ? SystemClock.uptimeMillis() - this.f35177h : 0L;
        this.f35177h = -1L;
        yq0.w wVar = j13 instanceof yq0.w ? (yq0.w) j13 : null;
        if (wVar != null) {
            wVar.T0(uptimeMillis);
        }
        if (uptimeMillis > 0) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("warm_start_bg_time", String.valueOf(uptimeMillis));
            getPinalytics().g(f1.BACKGROUND_REFRESH_WARM_START, null, hashMap, false);
        }
        s sVar3 = this.A0;
        if (sVar3 == null) {
            Intrinsics.r("mainScreenManager");
            throw null;
        }
        Object obj = sVar3.k().getF49207c().get("NAVIGATION_MODEL_BUNDLE_KEY");
        Navigation navigation = obj instanceof Navigation ? (Navigation) obj : null;
        if (navigation != null && (f49939a = navigation.getF49939a()) != null && h1.f(kl1.a.UserProfileKey, kl1.a.NotificationsKey).contains(f49939a.getEarlyAccessKey())) {
            s sVar4 = this.A0;
            if (sVar4 == null) {
                Intrinsics.r("mainScreenManager");
                throw null;
            }
            if (sVar4.G() == 1 && uptimeMillis >= 180000 && (aVar = this.f130611b) != null) {
                aVar.k(com.pinterest.framework.screens.u.WARM_START_AUTO_SWITCH_TO_HOME_TAB);
            }
        }
        l lVar = this.F0;
        if (lVar == null) {
            Intrinsics.r("pushTokenRegistrationScheduler");
            throw null;
        }
        lVar.b(null);
        ew.j jVar = (ew.j) E();
        if (jVar.d() && ((kw.a) jVar.f60321g).a()) {
            jVar.f60328n.h(jVar.f60337w);
            ((lw.c) jVar.f60326l).a();
        }
        ((ow.a) ((bf2.b) F()).get()).getClass();
        Z();
        if (this.f35210x0) {
            se2.a aVar2 = this.V;
            if (aVar2 == null) {
                Intrinsics.r("locationUtils");
                throw null;
            }
            ((is1.l) ((bf2.b) aVar2).get()).b(this, Y());
        }
        if (I().j()) {
            a I = I();
            s sVar5 = this.A0;
            if (sVar5 == null) {
                Intrinsics.r("mainScreenManager");
                throw null;
            }
            I.l(this, sVar5.k());
        }
        if (getIntent().getBooleanExtra("com.pinterest.EXTRA_UNLINK_ACCOUNT_EMAIL_PASSWORD_PAGE", false)) {
            NavigationImpl w13 = Navigation.w1(com.pinterest.screens.b.f());
            String stringExtra = getIntent().getStringExtra("com.pinterest.EXTRA_UNLINK_ACCOUNT_USERNAME");
            String stringExtra2 = getIntent().getStringExtra("com.pinterest.EXTRA_UNLINK_ACCOUNT_EXPIRATION");
            String stringExtra3 = getIntent().getStringExtra("com.pinterest.EXTRA_UNLINK_ACCOUNT_TOKEN");
            String stringExtra4 = getIntent().getStringExtra("com.pinterest.EXTRA_UNLINK_ACCOUNT_LBA_FULL_NAME");
            String stringExtra5 = getIntent().getStringExtra("com.pinterest.EXTRA_UNLINK_ACCOUNT_BUSINESS_AVATAR_URL");
            String stringExtra6 = getIntent().getStringExtra("com.pinterest.EXTRA_UNLINK_ACCOUNT_BUSINESS_AVATAR_ID");
            String stringExtra7 = getIntent().getStringExtra("com.pinterest.EXTRA_UNLINK_ACCOUNT_OWNER_AVATAR_URL");
            String stringExtra8 = getIntent().getStringExtra("com.pinterest.EXTRA_UNLINK_ACCOUNT_OWNER_AVATAR_ID");
            w13.m0("com.pinterest.EXTRA_UNLINK_ACCOUNT_USERNAME", stringExtra);
            w13.m0("com.pinterest.EXTRA_UNLINK_ACCOUNT_EXPIRATION", stringExtra2);
            w13.m0("com.pinterest.EXTRA_UNLINK_ACCOUNT_TOKEN", stringExtra3);
            w13.m0("com.pinterest.EXTRA_UNLINK_ACCOUNT_LBA_FULL_NAME", stringExtra4);
            w13.m0("com.pinterest.EXTRA_UNLINK_ACCOUNT_BUSINESS_AVATAR_URL", stringExtra5);
            w13.m0("com.pinterest.EXTRA_UNLINK_ACCOUNT_BUSINESS_AVATAR_ID", stringExtra6);
            w13.m0("com.pinterest.EXTRA_UNLINK_ACCOUNT_OWNER_AVATAR_URL", stringExtra7);
            w13.m0("com.pinterest.EXTRA_UNLINK_ACCOUNT_OWNER_AVATAR_ID", stringExtra8);
            getEventManager().d(w13);
            getIntent().removeExtra("com.pinterest.EXTRA_UNLINK_ACCOUNT_EMAIL_PASSWORD_PAGE");
        }
        if (getIntent().getBooleanExtra("com.pinterest.EXTRA_UNLINK_ACCOUNT_SHOW_EXPIRED_LINK_MODAL", false)) {
            getEventManager().d(Navigation.w1(com.pinterest.screens.b.g()));
            getIntent().removeExtra("com.pinterest.EXTRA_UNLINK_ACCOUNT_SHOW_EXPIRED_LINK_MODAL");
        }
        if (getIntent().getBooleanExtra("com.pinterest.EXTRA_UNLINK_ACCOUNT_CONFIRMATION_TOAST", false)) {
            mainActivity = this;
            mainActivity.m0(x0.unlink_ba_toast_success_message, "com.pinterest.EXTRA_UNLINK_ACCOUNT_LBA_FULL_NAME", "com.pinterest.EXTRA_UNLINK_ACCOUNT_BUSINESS_AVATAR_URL");
            getIntent().removeExtra("com.pinterest.EXTRA_UNLINK_ACCOUNT_CONFIRMATION_TOAST");
        } else {
            mainActivity = this;
        }
        if (getIntent().getBooleanExtra("com.pinterest.EXTRA_SWITCH_ACCOUNT_CONFIRMATION_TOAST", false)) {
            mainActivity.m0(x0.account_switcher_toast_message, "com.pinterest.EXTRA_SWITCH_ACCOUNT_FULL_NAME", "com.pinterest.EXTRA_SWITCH_ACCOUNT_AVATAR_URL");
            getIntent().removeExtra("com.pinterest.EXTRA_SWITCH_ACCOUNT_CONFIRMATION_TOAST");
        }
        if (getIntent().getBooleanExtra("com.pinterest.EXTRA_SHOW_CREATOR_ONBOARDING_LANDING", false)) {
            getEventManager().d(new jc0.v(new zp.b0(getPinalytics(), getIntent().getStringExtra("com.pinterest.utm_campaign")), false, 0L, 30));
            getIntent().removeExtra("com.pinterest.EXTRA_SHOW_CREATOR_ONBOARDING_LANDING");
        }
        Bundle bundleExtra = getIntent().getBundleExtra("EXTRA_EMAIL_USER_FEEDBACK");
        if (bundleExtra != null) {
            i92.k kVar = (i92.k) ((bf2.b) X()).get();
            j4 j4Var = mainActivity.f35196q0;
            if (j4Var == null) {
                Intrinsics.r("emailFeedbackLandingToastFactory");
                throw null;
            }
            kVar.c(new up.c(bundleExtra, new no1.d((oc.c) j4Var.f113476a.f114091b.f114255d.f113907s5.get(), 2)));
        }
        String stringExtra9 = getIntent().getStringExtra("com.pinterest.EXTRA_PENDING_TAB");
        boolean booleanExtra = getIntent().getBooleanExtra("com.pinterest.EXTRA_IS_DEEPLINK", false);
        if (df.j1.U0(stringExtra9) && booleanExtra) {
            mainActivity.i0(getIntent());
        }
    }

    @Override // cp1.p, androidx.activity.o, c5.h, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        Locale locale = Locale.getDefault();
        outState.putString("PREF_LANGUAGE_LOCALE", locale != null ? locale.toString() : null);
        outState.putLong("PREF_LAST_SAVED_INSTANCE_TIME", SystemClock.elapsedRealtime());
        if (!x().a()) {
            try {
                p000do.a.b(outState, this);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        s sVar = this.A0;
        if (sVar == null) {
            Intrinsics.r("mainScreenManager");
            throw null;
        }
        sVar.D(outState);
        super.onSaveInstanceState(outState);
    }

    @Override // cp1.p, androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        getNavigationManager().i();
        getEventManager().h(this.I0);
        rg0.s sVar = this.Q;
        if (sVar == null) {
            Intrinsics.r("experiences");
            throw null;
        }
        rg0.n b13 = ((dh0.d) sVar).b(y0.ANDROID_APP_TAKEOVER);
        if (b13 != null) {
            if (b13.f108060b == i32.l.ANDROID_MOBILE_FB_RECOVERY_ACCOUNT.value()) {
                getEventManager().d(Navigation.w1(RecoveryScreenLocation.RECOVERY_FB_ACCOUNT));
            }
        }
        super.onStart();
    }

    @Override // androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        getNavigationManager().j();
        getEventManager().j(this.I0);
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        getEventManager().d(new com.google.android.gms.common.api.d(20));
    }

    @Override // cp1.p
    public final void postActivityBackPress() {
        s sVar = this.A0;
        if (sVar == null) {
            Intrinsics.r("mainScreenManager");
            throw null;
        }
        if (sVar.G() == 1) {
            sVar.x();
        }
        super.postActivityBackPress();
    }

    @Override // cp1.p
    public final boolean preActivityBackPress() {
        if (!isVisible()) {
            return true;
        }
        getPinalytics().F(g0.NAVIGATION, u0.BACK_BUTTON);
        if (I().j()) {
            y.Y();
            return false;
        }
        if (!c60.d.b()) {
            lu1.b bVar = this.P;
            if (bVar == null) {
                Intrinsics.r("baseActivityHelper");
                throw null;
            }
            ((lu1.c) bVar).q(this, null);
            finish();
            return true;
        }
        AlertContainer alertContainer = this.f35181j;
        if (alertContainer == null) {
            Intrinsics.r("alertContainer");
            throw null;
        }
        if (alertContainer.isShown()) {
            AlertContainer alertContainer2 = this.f35181j;
            if (alertContainer2 == null) {
                Intrinsics.r("alertContainer");
                throw null;
            }
            if (alertContainer2.a()) {
                getEventManager().d(new yb0.c(yb0.d.BACK_BUTTON_CLICK));
            }
            return true;
        }
        ModalContainer modalContainer = this.f35179i;
        if (modalContainer == null) {
            Intrinsics.r("modalContainer");
            throw null;
        }
        if (modalContainer.i()) {
            a.c.y(getEventManager());
            return true;
        }
        ModalContainer modalContainer2 = this.f35179i;
        if (modalContainer2 == null) {
            Intrinsics.r("modalContainer");
            throw null;
        }
        if (modalContainer2.j()) {
            return true;
        }
        ModalContainer modalContainer3 = this.f130610a;
        if (modalContainer3 == null) {
            Intrinsics.r("adminModalContainer");
            throw null;
        }
        if (modalContainer3.i()) {
            getEventManager().d(new ff0.d());
            return true;
        }
        ModalContainer modalContainer4 = this.f130610a;
        if (modalContainer4 == null) {
            Intrinsics.r("adminModalContainer");
            throw null;
        }
        if (modalContainer4.j()) {
            return true;
        }
        EducationNewContainerView educationNewContainerView = this.f35193p;
        if (educationNewContainerView != null && educationNewContainerView.getF44993i()) {
            EducationNewContainerView educationNewContainerView2 = this.f35193p;
            if (educationNewContainerView2 != null) {
                educationNewContainerView2.x();
                return true;
            }
            Intrinsics.r("educationContainer");
            throw null;
        }
        if (dismissInlineAlertOrError()) {
            return true;
        }
        ReactionsContextMenuView reactionsContextMenuView = this.f35199s;
        if (reactionsContextMenuView != null && reactionsContextMenuView.getF47314t()) {
            reactionsContextMenuView.b();
            return true;
        }
        CommentReactionsContextMenuView commentReactionsContextMenuView = this.f35201t;
        if (commentReactionsContextMenuView != null && commentReactionsContextMenuView.getF45499r()) {
            commentReactionsContextMenuView.a();
            return true;
        }
        ConversationMessageReactionsContextMenuView conversationMessageReactionsContextMenuView = this.f35203u;
        if (conversationMessageReactionsContextMenuView == null || !conversationMessageReactionsContextMenuView.getF45635d()) {
            return getNavigationManager().f() || super.preActivityBackPress();
        }
        conversationMessageReactionsContextMenuView.a();
        return true;
    }

    @Override // cp1.p
    public final void setupActivityComponent() {
        if (this.f35211y == null) {
            setContentView(this.f35212y0);
            ViewGroup viewGroup = (ViewGroup) findViewById(tr.b.main_container);
            ir.q qVar = new ir.q(this);
            o oVar = this.B;
            if (oVar == null) {
                Intrinsics.r("baseExperimentsHelper");
                throw null;
            }
            int i13 = oVar.i("android_screen_manager_max_warm_screens", 3, a4.f83298b);
            b bVar = this.G0;
            if (bVar == null) {
                Intrinsics.r("screenManagerFactory");
                throw null;
            }
            Intrinsics.f(viewGroup);
            s q13 = bVar.q(viewGroup, N0, qVar, i13, zh0.c.b());
            setScreenManager(q13);
            this.A0 = q13;
            this.f35211y = (so1.a) me.o.a(this, so1.a.class);
        }
    }
}
