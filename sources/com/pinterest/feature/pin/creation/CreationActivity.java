package com.pinterest.feature.pin.creation;

import ag1.b;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.component.alert.AlertContainer;
import com.pinterest.component.modal.ModalContainer;
import com.pinterest.education.view.EducationNewContainerView;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.ScreenModel;
import com.pinterest.framework.screens.m;
import com.pinterest.framework.screens.s;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.f3;
import dl1.t;
import g92.g;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kp.n;
import lu1.d;
import m11.c;
import me.o;
import nx.j1;
import pw0.x;
import so1.a;
import tb0.h;
import tb0.p;
import w01.e0;
import y01.p1;
import z9.v;
import zp.j;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/pinterest/feature/pin/creation/CreationActivity;", "Lm11/c;", "Lnx/j1;", "<init>", "()V", "bp1/h", "pin_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class CreationActivity extends c implements j1 {
    public static final /* synthetic */ int A = 0;

    /* renamed from: b, reason: collision with root package name */
    public FrameLayout f47078b;

    /* renamed from: c, reason: collision with root package name */
    public BottomSheetBehavior f47079c;

    /* renamed from: d, reason: collision with root package name */
    public ModalContainer f47080d;

    /* renamed from: e, reason: collision with root package name */
    public ModalContainer f47081e;

    /* renamed from: f, reason: collision with root package name */
    public EducationNewContainerView f47082f;

    /* renamed from: g, reason: collision with root package name */
    public ViewStub f47083g;

    /* renamed from: h, reason: collision with root package name */
    public AlertContainer f47084h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f47085i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f47086j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f47087k;

    /* renamed from: l, reason: collision with root package name */
    public String f47088l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f47089m;

    /* renamed from: o, reason: collision with root package name */
    public a f47091o;

    /* renamed from: p, reason: collision with root package name */
    public d f47092p;

    /* renamed from: q, reason: collision with root package name */
    public h f47093q;

    /* renamed from: r, reason: collision with root package name */
    public t f47094r;

    /* renamed from: s, reason: collision with root package name */
    public b f47095s;

    /* renamed from: t, reason: collision with root package name */
    public ag1.h f47096t;

    /* renamed from: u, reason: collision with root package name */
    public j f47097u;

    /* renamed from: v, reason: collision with root package name */
    public kf1.b f47098v;

    /* renamed from: w, reason: collision with root package name */
    public g f47099w;

    /* renamed from: x, reason: collision with root package name */
    public x92.b f47100x;

    /* renamed from: n, reason: collision with root package name */
    public final n f47090n = new n(0);

    /* renamed from: y, reason: collision with root package name */
    public final d4 f47101y = d4.PIN_CREATE;

    /* renamed from: z, reason: collision with root package name */
    public final m11.a f47102z = new m11.a(this);

    public final h b6() {
        h hVar = this.f47093q;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.r("crashReporting");
        throw null;
    }

    @Override // cp1.p, nx.j1
    public final d4 d() {
        nl1.d f34938d = getF34938d();
        if (f34938d != null) {
            return f34938d.E7();
        }
        return null;
    }

    @Override // cp1.p, cp1.a
    /* renamed from: getActiveFragment */
    public final nl1.d getF34938d() {
        s screenManager = getScreenManager();
        m j13 = screenManager != null ? screenManager.j() : null;
        if (j13 instanceof nl1.d) {
            return (nl1.d) j13;
        }
        return null;
    }

    @Override // cp1.p, uo1.a
    public final a getBaseActivityComponent() {
        a aVar = this.f47091o;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // cp1.p
    public final Fragment getFragment() {
        return getSupportFragmentManager().E(ry1.c.fragment_wrapper);
    }

    @Override // uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF80082h0() {
        return this.f47101y;
    }

    @Override // cp1.p, ms1.b
    public final void inflateEducationContainer() {
        if (this.f47082f == null) {
            ViewStub viewStub = this.f47083g;
            if (viewStub == null) {
                Intrinsics.r("educationContainerStub");
                throw null;
            }
            View inflate = viewStub.inflate();
            Intrinsics.g(inflate, "null cannot be cast to non-null type com.pinterest.education.view.EducationNewContainerView");
            this.f47082f = (EducationNewContainerView) inflate;
        }
    }

    @Override // cp1.p, androidx.fragment.app.FragmentActivity, androidx.activity.o, android.app.Activity
    public final void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        if (i14 == 0) {
            return;
        }
        if (i13 == 201) {
            setResult(i14, intent);
            finish();
        }
        s screenManager = getScreenManager();
        if (screenManager != null) {
            if (intent == null) {
                intent = new Intent();
            }
            screenManager.o(i13, i14, intent);
        }
    }

    @Override // cp1.p, cp1.q, androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        ScreenLocation c13;
        inject();
        g gVar = this.f47099w;
        if (gVar == null) {
            Intrinsics.r("themeProvider");
            throw null;
        }
        gVar.b(this);
        Window window = getWindow();
        window.requestFeature(13);
        window.setBackgroundDrawable(new ColorDrawable(-16777216));
        super.onCreate(bundle);
        View findViewById = findViewById(ry1.c.bottom_sheet_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        this.f47078b = frameLayout;
        if (frameLayout == null) {
            Intrinsics.r("bottomSheetContainer");
            throw null;
        }
        BottomSheetBehavior J2 = BottomSheetBehavior.J(frameLayout);
        Intrinsics.checkNotNullExpressionValue(J2, "from(...)");
        this.f47079c = J2;
        if (J2 == null) {
            Intrinsics.r("bottomSheetBehavior");
            throw null;
        }
        J2.X(5);
        View findViewById2 = findViewById(ry1.c.brio_modal_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47080d = (ModalContainer) findViewById2;
        View findViewById3 = findViewById(ry1.c.brio_admin_modal_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47081e = (ModalContainer) findViewById3;
        this.f47084h = (AlertContainer) findViewById(dq1.c.alert_container);
        View findViewById4 = findViewById(ry1.c.education_container_stub);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f47083g = (ViewStub) findViewById4;
        Intent intent = getIntent();
        if (intent == null || (bundle2 = intent.getExtras()) == null) {
            bundle2 = new Bundle();
        }
        ag1.h hVar = this.f47096t;
        if (hVar == null) {
            Intrinsics.r("ideaPinSessionDataManager");
            throw null;
        }
        hVar.d(new v(3, bundle2), true);
        if (bundle == null) {
            Intent intent2 = getIntent();
            if (intent2 == null || (bundle3 = intent2.getExtras()) == null) {
                bundle3 = new Bundle();
            }
            Bundle bundle4 = new Bundle();
            bundle4.putString("com.pinterest.EXTRA_IDEA_PIN_CREATION_SESSION_ID", bundle3.getString("com.pinterest.EXTRA_IDEA_PIN_CREATION_SESSION_ID"));
            bundle4.putString("com.pinterest.EXTRA_CREATE_MEDIA_URI", bundle3.getString("com.pinterest.EXTRA_CREATE_MEDIA_URI"));
            this.f47087k = bundle3.getBoolean("com.pinterest.EXTRA_IS_COLLAGE");
            String string = bundle3.getString("com.pinterest.EXTRA_PIN_CREATE_TYPE");
            bundle4.putString("com.pinterest.EXTRA_PIN_CREATE_TYPE", string);
            this.f47088l = string;
            boolean z13 = bundle3.getBoolean("com.pinterest.EXTRA_IS_DEEPLINK");
            bundle4.putBoolean("com.pinterest.EXTRA_IS_DEEPLINK", z13);
            this.f47085i = z13;
            String string2 = bundle3.getString("com.pintrest.EXTRA_DEEPLINK_SOURCE");
            if (string2 != null) {
                y().f15130c = string2;
            }
            bundle4.putBoolean("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", bundle3.getBoolean("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT"));
            bundle4.putBoolean("com.pinterest.EXTRA_STORY_PIN_TRIM_REQUIRED", bundle3.getBoolean("com.pinterest.EXTRA_STORY_PIN_TRIM_REQUIRED"));
            String string3 = bundle3.getString("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE");
            if (string3 != null) {
                bundle4.putString("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE", string3);
            }
            String string4 = bundle3.getString("com.pinterest.EXTRA_BOARD_ID");
            if (string4 != null) {
                bundle4.putString("com.pinterest.EXTRA_BOARD_ID", string4);
            }
            String string5 = bundle3.getString("com.pinterest.EXTRA_BOARD_SECTION_ID");
            if (string5 != null) {
                bundle4.putString("com.pinterest.EXTRA_BOARD_SECTION_ID", string5);
            }
            String string6 = bundle3.getString("com.pinterest.EXTRA_COMMENT_ID");
            if (string6 != null) {
                bundle4.putString("com.pinterest.EXTRA_COMMENT_ID", string6);
            }
            String string7 = bundle3.getString("com.pinterest.EXTRA_COMMENT_AUTHOR_NAME");
            if (string7 != null) {
                bundle4.putString("com.pinterest.EXTRA_COMMENT_AUTHOR_NAME", string7);
            }
            String string8 = bundle3.getString("com.pinterest.EXTRA_COMMENT_TEXT");
            if (string8 != null) {
                bundle4.putString("com.pinterest.EXTRA_COMMENT_TEXT", string8);
            }
            String string9 = bundle3.getString("com.pinterest.EXTRA_COMMENT_PIN_ID");
            if (string9 != null) {
                bundle4.putString("com.pinterest.EXTRA_COMMENT_PIN_ID", string9);
            }
            String string10 = bundle3.getString("com.pinterest.EXTRA_COMMENT_PIN_THUMBNAIL_PATH");
            if (string10 != null) {
                bundle4.putString("com.pinterest.EXTRA_COMMENT_PIN_THUMBNAIL_PATH", string10);
            }
            bundle4.putBoolean("com.pinterest.EXTRA_COMMENT_PIN_IS_ACCESSIBLE", bundle3.getBoolean("com.pinterest.EXTRA_COMMENT_PIN_IS_ACCESSIBLE"));
            bundle4.putString("com.pinterest.EXTRA_MEDIA_GALLERY_TYPE", bundle3.getString("com.pinterest.EXTRA_MEDIA_GALLERY_TYPE"));
            bundle4.putInt("com.pinterest.EXTRA_PIN_SCHEDULED_TIME_SECONDS", bundle3.getInt("com.pinterest.EXTRA_PIN_SCHEDULED_TIME_SECONDS"));
            if (Intrinsics.d(this.f47088l, "story_pin")) {
                c13 = f3.c();
            } else if (Intrinsics.d(this.f47088l, "story_pin_from_draft")) {
                c13 = f3.b();
            } else if (Intrinsics.d(this.f47088l, "story_pin_from_deep_link")) {
                if (bundle4.getBoolean("com.pinterest.EXTRA_STORY_PIN_TRIM_REQUIRED")) {
                    getEventManager().f(new gi2.b());
                }
                c13 = f3.d();
            } else if (this.f47087k) {
                c13 = f3.a();
            } else {
                vb0.j.f125466a.F("Unexpected Creation Activity Init State", p.IDEA_PINS_CREATION, new Object[0]);
                c13 = f3.c();
            }
            if (Intrinsics.d(c13, f3.c())) {
                String string11 = bundle4.getString("com.pinterest.EXTRA_MEDIA_GALLERY_TYPE");
                if (string11 == null) {
                    string11 = "IdeaPinPageAdd";
                }
                bundle4.putString("com.pinterest.EXTRA_MEDIA_GALLERY_TYPE", string11);
                if (this.f47097u == null) {
                    Intrinsics.r("galleryRouter");
                    throw null;
                }
                bundle4.putBoolean("com.pinterest.EXTRA_ENABLE_VIDEO_UPLOAD", j.a(x.valueOf(string11)));
                bundle4.putInt("com.pinterest.EXTRA_LOCAL_STORY_PIN_CLIP_COUNT", bundle4.getInt("com.pinterest.EXTRA_LOCAL_STORY_PIN_CLIP_COUNT"));
                bundle4.putInt("com.pinterest.EXTRA_MEDIA_GALLERY_MAX_SELECTED_ITEMS", 20);
            }
            NavigationImpl navigationImpl = new NavigationImpl(c13, "", ml1.b.UNSPECIFIED_TRANSITION.getValue(), bundle4);
            s screenManager = getScreenManager();
            if (screenManager != null) {
                ScreenDescription k13 = screenManager.k();
                ScreenModel b13 = navigationImpl.b1();
                Intrinsics.checkNotNullExpressionValue(b13, "toScreenDescription(...)");
                zk1.a.a(screenManager, b13, false, 30);
                screenManager.z(k13);
            }
        }
        if (Intrinsics.d(this.f47088l, "story_pin")) {
            kf1.b bVar = this.f47098v;
            if (bVar == null) {
                Intrinsics.r("ideaPinCleanupManager");
                throw null;
            }
            bVar.a();
        }
        ModalContainer modalContainer = this.f47080d;
        if (modalContainer == null) {
            Intrinsics.r("modalContainer");
            throw null;
        }
        s screenManager2 = getScreenManager();
        if (screenManager2 != null) {
            getNavigationManager().g(modalContainer, screenManager2);
        }
    }

    @Override // cp1.p, cp1.q, androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        ku1.j navigationManager = getNavigationManager();
        navigationManager.f80913k = null;
        navigationManager.f80903a = null;
        navigationManager.f80915m = false;
        s screenManager = getScreenManager();
        if (screenManager != null) {
            screenManager.h(this, isChangingConfigurations());
        }
        this.f47089m = false;
        if (!this.f47086j) {
            if (this.f47085i && isTaskRoot()) {
                d dVar = this.f47092p;
                if (dVar == null) {
                    Intrinsics.r("activityIntentFactory");
                    throw null;
                }
                startActivity(dVar.b(this, lu1.a.MAIN_ACTIVITY));
            }
            x(false);
        }
        if (Intrinsics.d(this.f47088l, "story_pin")) {
            kf1.b bVar = this.f47098v;
            if (bVar == null) {
                Intrinsics.r("ideaPinCleanupManager");
                throw null;
            }
            bVar.b();
        }
        super.onDestroy();
    }

    @Override // androidx.activity.o, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Bundle extras = intent.getExtras();
        boolean z13 = extras != null ? extras.getBoolean("com.pinterest.EXTRA_IS_DEEPLINK") : false;
        this.f47086j = z13;
        if (z13) {
            finish();
            startActivity(intent);
        }
    }

    @Override // cp1.p, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        getEventManager().j(this.f47102z);
        s screenManager = getScreenManager();
        if (screenManager != null) {
            screenManager.g();
        }
        this.f47089m = true;
        h b63 = b6();
        if (b63.f117078b.get() && b63.f117079c.get()) {
            b63.f117097u.i();
        }
        super.onPause();
        getNavigationManager().h();
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        b y13 = y();
        Intrinsics.checkNotNullParameter(savedInstanceState, "savedInstanceState");
        String value = savedInstanceState.getString("com.pinterest.EXTRA_IDEA_PIN_DRAFT_ID");
        if (value == null) {
            value = "";
        }
        Intrinsics.checkNotNullParameter(value, "value");
        y13.f15136i = value;
        s screenManager = getScreenManager();
        if (screenManager != null) {
            screenManager.C(this, savedInstanceState);
        }
    }

    @Override // cp1.p, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        s sVar;
        s screenManager;
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
        }
        super.onResume();
        getEventManager().h(this.f47102z);
        if (this.f47089m && (screenManager = getScreenManager()) != null) {
            screenManager.b();
        }
        this.f47089m = false;
        if (Intrinsics.d(this.f47088l, "story_pin") || Intrinsics.d(this.f47088l, "story_pin_from_draft")) {
            b6().x("FeatureFlow", "IdeaPinCreationFlow");
        } else if (this.f47087k) {
            b6().x("FeatureFlow", "CollageCreationFlow");
        } else {
            b6().x("FeatureFlow", "PinCreationFlow");
        }
        ku1.j navigationManager = getNavigationManager();
        if (navigationManager.f80915m && (sVar = navigationManager.f80914l) != null) {
            sVar.b();
        }
        navigationManager.f80915m = false;
    }

    @Override // cp1.p, androidx.activity.o, c5.h, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        b y13 = y();
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putString("com.pinterest.EXTRA_IDEA_PIN_DRAFT_ID", y13.d());
        s screenManager = getScreenManager();
        if (screenManager != null) {
            screenManager.D(outState);
        }
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
        AlertContainer alertContainer = this.f47084h;
        if (alertContainer != null && alertContainer.isShown()) {
            AlertContainer alertContainer2 = this.f47084h;
            if (alertContainer2 != null && alertContainer2.a()) {
                getEventManager().d(new yb0.c(yb0.d.BACK_BUTTON_CLICK));
            }
            return true;
        }
        ModalContainer modalContainer = this.f47080d;
        if (modalContainer == null) {
            Intrinsics.r("modalContainer");
            throw null;
        }
        if (modalContainer.i()) {
            a.c.y(getEventManager());
            return true;
        }
        ModalContainer modalContainer2 = this.f47080d;
        if (modalContainer2 == null) {
            Intrinsics.r("modalContainer");
            throw null;
        }
        if (modalContainer2.j()) {
            return true;
        }
        ModalContainer modalContainer3 = this.f47081e;
        if (modalContainer3 == null) {
            Intrinsics.r("adminModalContainer");
            throw null;
        }
        if (modalContainer3.i()) {
            getEventManager().d(new ff0.d());
            return true;
        }
        ModalContainer modalContainer4 = this.f47081e;
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
    public final void setupActivityComponent() {
        if (this.f47091o == null) {
            setContentView(ry1.d.activity_creation);
            FrameLayout frameLayout = (FrameLayout) findViewById(ry1.c.fragment_wrapper);
            x92.b bVar = this.f47100x;
            if (bVar == null) {
                Intrinsics.r("screenManagerFactory");
                throw null;
            }
            Intrinsics.f(frameLayout);
            s r13 = x92.b.r(bVar, frameLayout, this.f47090n, 0, zh0.c.b(), 12);
            r13.f49234i = null;
            setScreenManager(r13);
            this.f47091o = (a) o.a(this, a.class);
        }
    }

    public final void x(boolean z13) {
        String d2 = y().d();
        b y13 = y();
        y13.f15136i = "";
        y13.f15132e = null;
        ag1.h hVar = this.f47096t;
        if (hVar == null) {
            Intrinsics.r("ideaPinSessionDataManager");
            throw null;
        }
        if (z13) {
            hVar.c();
        } else {
            hVar.b();
        }
        if (Intrinsics.d(this.f47088l, "story_pin")) {
            t tVar = this.f47094r;
            if (tVar != null) {
                addDisposable(kh2.d.m(tVar, d2, new e0(this, 5), new p1(this, 8)));
            } else {
                Intrinsics.r("ideaPinLocalDataRepository");
                throw null;
            }
        }
    }

    public final b y() {
        b bVar = this.f47095s;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("ideaPinComposeDataManager");
        throw null;
    }
}
