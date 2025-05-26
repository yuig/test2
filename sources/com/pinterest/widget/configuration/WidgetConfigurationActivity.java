package com.pinterest.widget.configuration;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.pinterest.component.modal.ModalContainer;
import com.pinterest.framework.screens.ScreenModel;
import com.pinterest.framework.screens.s;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.f5;
import com.pinterest.widget.GalleryWallWidget;
import com.pinterest.widget.SingleImageWidget;
import h32.d4;
import kg.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import lh0.n1;
import m60.w;
import nx.f0;
import nx.z;
import org.chromium.net.y;
import so.oa;
import so.s8;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000B\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/widget/configuration/WidgetConfigurationActivity;", "<init>", "()V", "widget_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class WidgetConfigurationActivity extends cp1.p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f52813a = false;

    /* renamed from: b, reason: collision with root package name */
    public x92.b f52814b;

    /* renamed from: c, reason: collision with root package name */
    public so1.a f52815c;

    /* renamed from: d, reason: collision with root package name */
    public ModalContainer f52816d;

    /* renamed from: e, reason: collision with root package name */
    public final kp.n f52817e;

    public WidgetConfigurationActivity() {
        addOnContextAvailableListener(new vo.f(this, 16));
        this.f52817e = new kp.n(2);
    }

    @Override // cp1.p, uo1.a
    public final so1.a getBaseActivityComponent() {
        so1.a aVar = this.f52815c;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // cp1.p
    public final Fragment getFragment() {
        s screenManager = getScreenManager();
        com.pinterest.framework.screens.m j13 = screenManager != null ? screenManager.j() : null;
        if (j13 instanceof nl1.d) {
            return (nl1.d) j13;
        }
        return null;
    }

    @Override // uk1.c
    /* renamed from: getViewType */
    public final d4 getF27566e0() {
        return d4.ANDROID_WIDGET;
    }

    @Override // cp1.q
    public final void inject() {
        if (this.f52813a) {
            return;
        }
        this.f52813a = true;
        s8 s8Var = (s8) ((g) generatedComponent());
        oa oaVar = s8Var.f114255d;
        this.dauManager = (tx.d) oaVar.Vc.get();
        this.dauWindowCallbackFactory = (tx.f) s8Var.f114344j.get();
        this.baseActivityHelperInternal = bf2.b.a(oaVar.f113961v5);
        this.chromeSettings = bf2.b.a(oaVar.f113764k2);
        this.inAppBrowserSettings = bf2.b.a(oaVar.Wc);
        this.fragmentFactory = (il1.a) s8Var.f114581z.get();
        this.analyticsApi = (vy.m) oaVar.M1.get();
        this.eventManager = (w) oaVar.f113885r0.get();
        this.navigationManager = (ku1.j) s8Var.f114402n.get();
        this.shakeModalNavigation = bf2.b.a(s8Var.f114417o);
        this.activeUserManager = (b60.b) oaVar.f113850p0.get();
        this.hairballExperiments = (n1) oaVar.E0.get();
        this.contextLogViewHelper = bf2.b.a(oaVar.f113636cf);
        this.applicationInfoProvider = (m60.e) oaVar.f113920t0.get();
        this.lazyUnauthAnalyticsApi = bf2.b.a(oaVar.M1);
        this.baseCrashReporting = (tb0.h) oaVar.f113797m0.get();
        this.pinalyticsFactory = (f0) oaVar.f113747j2.get();
        this.dialogContainerFactory = oa.I0(oaVar);
        this.timeSpentLoggingManager = (bz.i) oaVar.C9.get();
        this.pinAuxHelper = bf2.b.a(oaVar.R8);
        this.offPinterestTimeSpentManager = bf2.b.a(oaVar.Xc);
        this.imageCache = bf2.b.a(oaVar.f113875q7);
        this.networkPinalytics = (z) oaVar.f114043zf.get();
        this.adFormats = bf2.b.a(oaVar.P6);
        s8Var.W5(new cd2.l());
        s8Var.V5(new zc2.p());
        this.f52814b = s8Var.v6();
    }

    @Override // cp1.p, cp1.q, androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Class cls;
        Bundle extras;
        inject();
        super.onCreate(bundle);
        t.P();
        androidx.activity.q.a(this);
        Intent intent = getIntent();
        int i13 = (intent == null || (extras = intent.getExtras()) == null) ? 0 : extras.getInt("appWidgetId", 0);
        Intent putExtra = new Intent().putExtra("appWidgetId", i13);
        Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
        setResult(0, putExtra);
        if (i13 == 0) {
            finish();
            return;
        }
        if (!((b60.d) getActiveUserManager()).i()) {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this);
            AppWidgetProviderInfo appWidgetInfo = appWidgetManager.getAppWidgetInfo(i13);
            if (appWidgetInfo != null) {
                cls = SingleImageWidget.class;
                cls = Intrinsics.d(appWidgetInfo.provider.getClassName(), k0.f80436a.b(cls).e()) ? SingleImageWidget.class : GalleryWallWidget.class;
                int i14 = xc2.c.f134550d;
                Context applicationContext = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                y.a0(applicationContext, cls, appWidgetManager, i13);
            }
            setResult(-1, new Intent().putExtra("appWidgetId", i13));
            finish();
        }
        NavigationImpl w13 = Navigation.w1(f5.a());
        Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
        s screenManager = getScreenManager();
        if (screenManager != null) {
            ScreenModel screenDescription = w13.b1();
            Intrinsics.checkNotNullExpressionValue(screenDescription, "toScreenDescription(...)");
            Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
            screenManager.c(screenDescription, true, true, true, false);
        }
    }

    @Override // cp1.p, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        getNavigationManager().h();
    }

    @Override // cp1.p, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        s sVar;
        super.onResume();
        ku1.j navigationManager = getNavigationManager();
        if (navigationManager.f80915m && (sVar = navigationManager.f80914l) != null) {
            sVar.b();
        }
        navigationManager.f80915m = false;
    }

    @Override // cp1.p, androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        getNavigationManager().i();
    }

    @Override // androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        getNavigationManager().j();
    }

    @Override // cp1.p
    public final boolean preActivityBackPress() {
        s screenManager = getScreenManager();
        return (screenManager != null && screenManager.p()) || super.preActivityBackPress();
    }

    @Override // cp1.p
    public final void setupActivityComponent() {
        setContentView(xc2.f.activity_widget_configuration);
        if (this.f52815c == null) {
            x92.b bVar = this.f52814b;
            if (bVar == null) {
                Intrinsics.r("screenManagerFactory");
                throw null;
            }
            View findViewById = findViewById(xc2.e.fragment_wrapper);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            s r13 = x92.b.r(bVar, (ViewGroup) findViewById, this.f52817e, 0, zh0.c.b(), 12);
            View findViewById2 = findViewById(xc2.e.modal_container);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
            this.f52816d = (ModalContainer) findViewById2;
            ku1.j navigationManager = getNavigationManager();
            ModalContainer modalContainer = this.f52816d;
            if (modalContainer == null) {
                Intrinsics.r("modalContainer");
                throw null;
            }
            navigationManager.g(modalContainer, r13);
            setScreenManager(r13);
            this.f52815c = (so1.a) me.o.a(this, so1.a.class);
        }
    }
}
