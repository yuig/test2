package com.pinterest.feature.unifiedcomments.view;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.pinterest.component.alert.AlertContainer;
import com.pinterest.component.modal.ModalContainer;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.ScreenModel;
import com.pinterest.framework.screens.s;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.v0;
import db0.c;
import g92.g;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kp.n;
import me.o;
import nl1.d;
import rh1.m;
import rh1.x0;
import so1.a;
import x92.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/feature/unifiedcomments/view/CommentActivity;", "Lrh1/x0;", "<init>", "()V", "comments_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class CommentActivity extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public a f48911b;

    /* renamed from: c, reason: collision with root package name */
    public AlertContainer f48912c;

    /* renamed from: d, reason: collision with root package name */
    public g f48913d;

    /* renamed from: e, reason: collision with root package name */
    public b f48914e;

    /* renamed from: g, reason: collision with root package name */
    public ModalContainer f48916g;

    /* renamed from: f, reason: collision with root package name */
    public final n f48915f = new n(1);

    /* renamed from: h, reason: collision with root package name */
    public final d4 f48917h = d4.SEND_SHARE;

    /* renamed from: i, reason: collision with root package name */
    public final m f48918i = new m(this);

    @Override // cp1.p, cp1.a
    /* renamed from: getActiveFragment */
    public final d getF52740f() {
        return getNavigationManager().b();
    }

    @Override // cp1.p, uo1.a
    public final a getBaseActivityComponent() {
        a aVar = this.f48911b;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // cp1.p
    public final Fragment getFragment() {
        return null;
    }

    @Override // uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF48917h() {
        return this.f48917h;
    }

    @Override // cp1.p, androidx.activity.o, android.app.Activity
    public final void onBackPressed() {
        if (preActivityBackPress()) {
            return;
        }
        super.onBackPressed();
        postActivityBackPress();
    }

    @Override // cp1.p, cp1.q, androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        inject();
        g gVar = this.f48913d;
        if (gVar == null) {
            Intrinsics.r("themeProvider");
            throw null;
        }
        gVar.b(this);
        super.onCreate(bundle);
        View findViewById = findViewById(c.brio_modal_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48916g = (ModalContainer) findViewById;
        View findViewById2 = findViewById(c.alert_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48912c = (AlertContainer) findViewById2;
        ModalContainer modalContainer = this.f48916g;
        if (modalContainer == null) {
            Intrinsics.r("modalContainer");
            throw null;
        }
        s screenManager = getScreenManager();
        if (screenManager != null) {
            getNavigationManager().g(modalContainer, screenManager);
        }
    }

    @Override // cp1.p, cp1.q, androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        getEventManager().j(this.f48918i);
    }

    @Override // cp1.p, androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        Bundle extras = getIntent().getExtras();
        String string = extras != null ? extras.getString("com.pinterest.EXTRA_PIN_ID") : null;
        Bundle extras2 = getIntent().getExtras();
        String string2 = extras2 != null ? extras2.getString("IDEA_STREAM_EXTRAS_KEY_FEATURED_AGGREGATED_PIN_DATA_ID") : null;
        getEventManager().h(this.f48918i);
        getNavigationManager().i();
        if (string == null || string2 == null) {
            return;
        }
        NavigationImpl L = Navigation.L(v0.b(), string2, ml1.b.NO_TRANSITION.getValue());
        L.m0("com.pinterest.EXTRA_PIN_ID", string);
        L.Y1("com.pinterest.EXTRA_OPEN_FROM_IN_APP_BROWSER", true);
        s screenManager = getScreenManager();
        if (screenManager != null) {
            ScreenDescription k13 = screenManager.k();
            ScreenModel b13 = L.b1();
            Intrinsics.checkNotNullExpressionValue(b13, "toScreenDescription(...)");
            zk1.a.a(screenManager, b13, false, 30);
            screenManager.z(k13);
        }
    }

    @Override // androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        getNavigationManager().j();
    }

    @Override // cp1.p
    public final boolean preActivityBackPress() {
        AlertContainer alertContainer = this.f48912c;
        if (alertContainer == null) {
            Intrinsics.r("alertContainer");
            throw null;
        }
        if (alertContainer.isShown()) {
            AlertContainer alertContainer2 = this.f48912c;
            if (alertContainer2 == null) {
                Intrinsics.r("alertContainer");
                throw null;
            }
            if (alertContainer2.a()) {
                getEventManager().d(new yb0.c(yb0.d.BACK_BUTTON_CLICK));
            }
            return true;
        }
        ModalContainer modalContainer = this.f48916g;
        if (modalContainer == null) {
            Intrinsics.r("modalContainer");
            throw null;
        }
        if (modalContainer.i()) {
            a.c.y(getEventManager());
            return true;
        }
        ModalContainer modalContainer2 = this.f48916g;
        if (modalContainer2 != null) {
            return modalContainer2.j() || getNavigationManager().f() || super.preActivityBackPress();
        }
        Intrinsics.r("modalContainer");
        throw null;
    }

    @Override // cp1.p
    public final void setupActivityComponent() {
        if (this.f48911b == null) {
            setContentView(db0.d.activity_comment);
            FrameLayout frameLayout = (FrameLayout) findViewById(c.fragment_container);
            b bVar = this.f48914e;
            if (bVar == null) {
                Intrinsics.r("screenManagerFactory");
                throw null;
            }
            Intrinsics.f(frameLayout);
            s r13 = b.r(bVar, frameLayout, this.f48915f, 0, zh0.c.b(), 12);
            r13.f49234i = null;
            setScreenManager(r13);
            this.f48911b = (a) o.a(this, a.class);
        }
    }
}
