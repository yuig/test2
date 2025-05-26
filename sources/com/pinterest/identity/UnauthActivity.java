package com.pinterest.identity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w0;
import com.pinterest.component.alert.AlertContainer;
import com.pinterest.component.modal.ModalContainer;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.m;
import com.pinterest.framework.screens.s;
import com.pinterest.screens.j2;
import ey.j3;
import g92.g;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.y1;
import lh0.z0;
import lh0.z3;
import lu1.b;
import me.o;
import nl1.d;
import nx.j1;
import nx.r0;
import vq1.a;
import vq1.i;
import yb0.j;
import yf0.c;
import yf0.h;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/pinterest/identity/UnauthActivity;", "Lvq1/a;", "Lnx/j1;", "<init>", "()V", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class UnauthActivity extends a implements j1 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f49755o = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f49756b;

    /* renamed from: c, reason: collision with root package name */
    public g1 f49757c;

    /* renamed from: d, reason: collision with root package name */
    public b f49758d;

    /* renamed from: e, reason: collision with root package name */
    public y1 f49759e;

    /* renamed from: f, reason: collision with root package name */
    public z0 f49760f;

    /* renamed from: g, reason: collision with root package name */
    public g f49761g;

    /* renamed from: h, reason: collision with root package name */
    public ModalContainer f49762h;

    /* renamed from: i, reason: collision with root package name */
    public AlertContainer f49763i;

    /* renamed from: j, reason: collision with root package name */
    public ModalContainer f49764j;

    /* renamed from: k, reason: collision with root package name */
    public so1.a f49765k;

    /* renamed from: l, reason: collision with root package name */
    public final d4 f49766l = d4.SPLASH;

    /* renamed from: m, reason: collision with root package name */
    public final i f49767m = new i(this);

    /* renamed from: n, reason: collision with root package name */
    public final j f49768n = new j(new r0(this, 24), yb0.i.f138488i);

    @Override // cp1.p, nx.j1
    public final d4 d() {
        d f52740f = getF52740f();
        if (f52740f != null) {
            return f52740f.getF49766l();
        }
        return null;
    }

    @Override // cp1.p, cp1.a
    /* renamed from: getActiveFragment */
    public final d getF52740f() {
        s screenManager = getScreenManager();
        if (screenManager != null) {
            m j13 = screenManager.j();
            d dVar = j13 instanceof d ? (d) j13 : null;
            if (dVar != null) {
                return dVar;
            }
        }
        return super.getF52740f();
    }

    @Override // cp1.p, uo1.a
    public final so1.a getBaseActivityComponent() {
        so1.a aVar = this.f49765k;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    public final b getBaseActivityHelper() {
        b bVar = this.f49758d;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("baseActivityHelper");
        throw null;
    }

    @Override // cp1.p
    /* renamed from: getCorrectFragmentFactory, reason: from getter */
    public final boolean getF49756b() {
        return this.f49756b;
    }

    @Override // cp1.p, yf0.f
    public final yf0.d getEdgeToEdgeConfiguration() {
        y1 y1Var = this.f49759e;
        if (y1Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) y1Var.f83514a;
        return (g1Var.o("android_unauth_activity_edge_to_edge", "enabled", z3Var) || g1Var.l("android_unauth_activity_edge_to_edge")) ? new c(h.SYSTEM_BARS) : yf0.b.f138956a;
    }

    @Override // cp1.p
    public final Fragment getFragment() {
        return getSupportFragmentManager().E(vq1.b.fragment_wrapper);
    }

    @Override // uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF49766l() {
        return this.f49766l;
    }

    @Override // cp1.p, androidx.fragment.app.FragmentActivity, androidx.activity.o, android.app.Activity
    public final void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        s screenManager = getScreenManager();
        if (screenManager != null) {
            if (intent == null) {
                intent = new Intent();
            }
            screenManager.o(i13, i14, intent);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity
    public final void onAttachFragment(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        super.onAttachFragment(fragment);
        if (hf0.b.q()) {
            dl2.b.w2(this, 4);
        } else {
            dl2.b.Z1(this);
        }
    }

    @Override // cp1.p, cp1.q, androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        inject();
        g gVar = this.f49761g;
        if (gVar == null) {
            Intrinsics.r("themeProvider");
            throw null;
        }
        gVar.b(this);
        super.onCreate(bundle);
        if (bundle == null) {
            g1 g1Var = this.f49757c;
            if (g1Var == null) {
                Intrinsics.r("experimentsManager");
                throw null;
            }
            g1Var.f83366r.clear();
        } else {
            g1 g1Var2 = this.f49757c;
            if (g1Var2 == null) {
                Intrinsics.r("experimentsManager");
                throw null;
            }
            g1Var2.n();
        }
        if (hf0.b.q()) {
            dl2.b.w2(this, 4);
        } else {
            dl2.b.Z1(this);
        }
        View findViewById = findViewById(vq1.b.alert_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f49763i = (AlertContainer) findViewById;
        View findViewById2 = findViewById(vq1.b.brio_modal_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f49762h = (ModalContainer) findViewById2;
        View findViewById3 = findViewById(vq1.b.brio_admin_modal_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f49764j = (ModalContainer) findViewById3;
        z0 z0Var = this.f49760f;
        if (z0Var == null) {
            Intrinsics.r("experimentsActivator");
            throw null;
        }
        ((g1) z0Var).d("android_unauth_account_recovery_flow_phase3");
        x();
        new ny.h().i();
        dl2.b.f55293b = false;
        j3 j3Var = j3.f60510a;
        j3.j();
    }

    @Override // cp1.p, cp1.q, androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        s screenManager = getScreenManager();
        if (screenManager != null) {
            screenManager.h(this, isChangingConfigurations());
        }
        super.onDestroy();
    }

    @Override // androidx.activity.o, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(getIntent().putExtras(intent));
        x();
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        s screenManager = getScreenManager();
        if (screenManager != null) {
            screenManager.C(this, savedInstanceState);
        }
    }

    @Override // cp1.p, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        Intrinsics.checkNotNullExpressionValue(a60.a.a(null).getAll(), "getAll(...)");
        if ((!r0.isEmpty()) || !((b60.d) getActiveUserManager()).i()) {
            return;
        }
        ((lu1.c) getBaseActivityHelper()).p(this);
        finish();
    }

    @Override // cp1.p, androidx.activity.o, c5.h, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        s screenManager = getScreenManager();
        if (screenManager != null) {
            screenManager.D(outState);
        }
    }

    @Override // cp1.p, androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        getEventManager().h(this.f49767m);
        getEventManager().h(this.f49768n);
    }

    @Override // androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        getEventManager().j(this.f49767m);
        getEventManager().j(this.f49768n);
        super.onStop();
    }

    @Override // cp1.p
    public final void postActivityBackPress() {
        s screenManager = getScreenManager();
        if (screenManager != null) {
            screenManager.h(this, isChangingConfigurations());
        }
        super.postActivityBackPress();
    }

    @Override // cp1.p
    public final boolean preActivityBackPress() {
        AlertContainer alertContainer = this.f49763i;
        if (alertContainer == null) {
            Intrinsics.r("alertContainer");
            throw null;
        }
        if (alertContainer.isShown()) {
            AlertContainer alertContainer2 = this.f49763i;
            if (alertContainer2 == null) {
                Intrinsics.r("alertContainer");
                throw null;
            }
            if (alertContainer2.a()) {
                getEventManager().d(new yb0.c(yb0.d.BACK_BUTTON_CLICK));
                return true;
            }
        }
        ModalContainer modalContainer = this.f49762h;
        if (modalContainer == null) {
            Intrinsics.r("modalContainer");
            throw null;
        }
        if (modalContainer.i()) {
            a.c.y(getEventManager());
            return true;
        }
        ModalContainer modalContainer2 = this.f49762h;
        if (modalContainer2 == null) {
            Intrinsics.r("modalContainer");
            throw null;
        }
        if (modalContainer2.j()) {
            return true;
        }
        ModalContainer modalContainer3 = this.f49764j;
        if (modalContainer3 == null) {
            Intrinsics.r("adminModalContainer");
            throw null;
        }
        if (modalContainer3.i()) {
            getEventManager().d(new ff0.d());
            return true;
        }
        ModalContainer modalContainer4 = this.f49764j;
        if (modalContainer4 == null) {
            Intrinsics.r("adminModalContainer");
            throw null;
        }
        if (modalContainer4.j()) {
            return true;
        }
        s screenManager = getScreenManager();
        return (screenManager != null && screenManager.p()) || super.preActivityBackPress();
    }

    @Override // cp1.p
    public final void setCorrectFragmentFactory(boolean z13) {
        this.f49756b = z13;
    }

    @Override // cp1.p
    public final void setupActivityComponent() {
        if (this.f49765k == null) {
            setContentView(vq1.c.activity_unauth);
            this.f49765k = (so1.a) o.a(this, so1.a.class);
        }
    }

    public final void x() {
        Bundle bundle;
        w0 supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        int i13 = vq1.b.fragment_wrapper;
        Intent intent = getIntent();
        if (intent != null) {
            bundle = new Bundle();
            if (intent.getBooleanExtra("com.pinterest.EXTRA_CREATE_PASSWORD", false)) {
                bundle.putBoolean("com.pinterest.EXTRA_CREATE_PASSWORD", intent.getBooleanExtra("com.pinterest.EXTRA_CREATE_PASSWORD", false));
                bundle.putString("com.pinterest.EXTRA_USERNAME", intent.getStringExtra("com.pinterest.EXTRA_USERNAME"));
                bundle.putString("com.pinterest.EXTRA_PASSWORD_EXPIRATION", intent.getStringExtra("com.pinterest.EXTRA_PASSWORD_EXPIRATION"));
                bundle.putString("com.pinterest.EXTRA_PASSWORD_TOKEN", intent.getStringExtra("com.pinterest.EXTRA_PASSWORD_TOKEN"));
            }
            if (intent.hasExtra("com.pinterest.EXTRA_BOARD_ID")) {
                bundle.putString("com.pinterest.EXTRA_BOARD_ID", intent.getStringExtra("com.pinterest.EXTRA_BOARD_ID"));
                intent.removeExtra("com.pinterest.EXTRA_BOARD_ID");
            } else if (intent.hasExtra("com.pinterest.EXTRA_KLP_ID")) {
                bundle.putString("com.pinterest.EXTRA_KLP_ID", intent.getStringExtra("com.pinterest.EXTRA_KLP_ID"));
                intent.removeExtra("com.pinterest.EXTRA_KLP_ID");
            } else if (intent.hasExtra("com.pinterest.EXTRA_PIN_ID")) {
                bundle.putString("com.pinterest.EXTRA_PIN_ID", intent.getStringExtra("com.pinterest.EXTRA_PIN_ID"));
                intent.removeExtra("com.pinterest.EXTRA_PIN_ID");
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                bundle.putAll(extras);
            }
        } else {
            bundle = new Bundle();
        }
        d dVar = (d) d7.b.R(this).e((ScreenLocation) j2.f51011d.getValue());
        dVar.setArguments(bundle);
        mo1.c.c(supportFragmentManager, i13, dVar, false, mo1.a.NONE, 32);
    }
}
