package com.pinterest.activity.nux;

import a.l2;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e1;
import androidx.fragment.app.w0;
import androidx.lifecycle.u;
import ao2.v0;
import com.appsflyer.AdRevenueScheme;
import com.pinterest.feature.nux.utils.PlainCarouselIndexView;
import cy0.h;
import dy0.o;
import ey.j3;
import g92.g;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.x3;
import hq.a;
import hq.b;
import hq.c;
import hq.e;
import i32.y0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kh2.k3;
import ko2.f;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import lh0.j2;
import lh0.z3;
import m60.f0;
import mo1.d;
import ny0.v;
import org.jetbrains.annotations.NotNull;
import rg0.d0;
import rg0.e0;
import rg0.n;
import rg0.s;
import xk2.k;
import xk2.m;

@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 ¨\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002©\u0001B\b¢\u0006\u0005\b§\u0001\u0010\fJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\fJ9\u0010\u0015\u001a\u00020\u00062\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0014¢\u0006\u0004\b \u0010\fJ\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010+\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010\fJ\u0019\u0010/\u001a\u00020\u00172\b\u0010.\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0006H\u0002¢\u0006\u0004\b1\u0010\fJ\u0011\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b3\u00104J\u0011\u00105\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b5\u00104J\u000f\u00106\u001a\u00020\u0006H\u0002¢\u0006\u0004\b6\u0010\fJK\u0010:\u001a\u00020\u00062\b\u00107\u001a\u0004\u0018\u0001022\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0006H\u0002¢\u0006\u0004\b<\u0010\fJ\u0017\u0010?\u001a\u00020\u00062\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00062\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\bA\u0010@J\u000f\u0010B\u001a\u00020\u0006H\u0002¢\u0006\u0004\bB\u0010\fJ\u001f\u0010E\u001a\n\u0012\u0006\b\u0001\u0012\u00020D0C2\u0006\u00107\u001a\u000202H\u0002¢\u0006\u0004\bE\u0010FJ\u001b\u0010G\u001a\u00020D*\n\u0012\u0006\b\u0001\u0012\u00020D0CH\u0002¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0017H\u0002¢\u0006\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\"\u0010N\u001a\u00020M8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010U\u001a\u00020T8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010\\\u001a\u00020[8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010c\u001a\u00020b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010j\u001a\u00020i8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010q\u001a\u00020p8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010x\u001a\u00020w8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R'\u0010\u007f\u001a\u00020~8\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001f\u0010\u0087\u0001\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010JR\u001a\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R \u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u0002020\u008b\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0019\u0010\u0094\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001b\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001b\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0097\u0001R\u001b\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R \u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R!\u0010¤\u0001\u001a\u00030 \u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b¡\u0001\u0010\u0086\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010¦\u0001\u001a\u0004\u0018\u00010$8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010&¨\u0006ª\u0001"}, d2 = {"Lcom/pinterest/activity/nux/NUXActivity;", "Lhq/a;", "Liy0/a;", "Lhq/e;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onBackPressed", "()V", "onStart", "dismissExperience", "", "", "followedCreators", "followedInterests", "", "numUseCasesSelected", "gotoNextStep", "([Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Integer;)V", "", "showIndicator", "updateIndicatorHeader", "(Z)V", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "setupActivityComponent", "Lso1/a;", "getBaseActivityComponent", "()Lso1/a;", "Landroidx/fragment/app/Fragment;", "getFragment", "()Landroidx/fragment/app/Fragment;", "Lyf0/d;", "getEdgeToEdgeConfiguration", "()Lyf0/d;", "currentStep", "restoreStepIndex", "(Ljava/lang/Integer;)V", "callViewNuxStepApi", "fragment", "shouldDecrementNUXStep", "(Landroidx/fragment/app/Fragment;)Z", "exitNUX", "Lrg0/e0;", "incrementAndGetNUXStep", "()Lrg0/e0;", "getNUXStep", "decrementNUXStep", "step", "Lmo1/a;", "animation", "goToStep", "(Lrg0/e0;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Integer;Lmo1/a;)V", "completeExperience", "Lrg0/n;", "experienceValue", "logNuxEnd", "(Lrg0/n;)V", "logNuxStart", "goHome", "Ljava/lang/Class;", "Lnl1/d;", "getFragmentClassForStep", "(Lrg0/e0;)Ljava/lang/Class;", "createInstance", "(Ljava/lang/Class;)Lnl1/d;", "isEdgeToEdgeEnabled", "()Z", "activityComponent", "Lso1/a;", "Lmo1/d;", "intentHelper", "Lmo1/d;", "getIntentHelper", "()Lmo1/d;", "setIntentHelper", "(Lmo1/d;)V", "Llu1/b;", "baseActivityHelper", "Llu1/b;", "getBaseActivityHelper", "()Llu1/b;", "setBaseActivityHelper", "(Llu1/b;)V", "Lrg0/s;", "experiences", "Lrg0/s;", "getExperiences", "()Lrg0/s;", "setExperiences", "(Lrg0/s;)V", "Ley/j3;", "perfLogUtils", "Ley/j3;", "getPerfLogUtils", "()Ley/j3;", "setPerfLogUtils", "(Ley/j3;)V", "Lg92/g;", "themeProvider", "Lg92/g;", "getThemeProvider", "()Lg92/g;", "setThemeProvider", "(Lg92/g;)V", "Llh0/j2;", "experiments", "Llh0/j2;", "getExperiments", "()Llh0/j2;", "setExperiments", "(Llh0/j2;)V", "Lkv1/a;", "nuxService", "Lkv1/a;", "getNuxService", "()Lkv1/a;", "setNuxService", "(Lkv1/a;)V", "Lqy0/b;", "nuxSharedStateRepository", "Lqy0/b;", "getNuxSharedStateRepository", "()Lqy0/b;", "setNuxSharedStateRepository", "(Lqy0/b;)V", "isWarmStart$delegate", "Lxk2/k;", "isWarmStart", "Lrg0/d0;", "nuxDisplayData", "Lrg0/d0;", "", "nuxSteps", "Ljava/util/List;", "Lcom/pinterest/feature/nux/utils/PlainCarouselIndexView;", "carousel", "Lcom/pinterest/feature/nux/utils/PlainCarouselIndexView;", "Landroid/widget/FrameLayout;", "backButton", "Landroid/widget/FrameLayout;", "signupStep", "I", "filledEmailFromPreviousScreen", "Ljava/lang/String;", "filledUserNameFromPreviousScreen", "filledAgeFromPreviousScreen", "Ljava/lang/Integer;", "Lh32/d4;", "viewType", "Lh32/d4;", "getViewType", "()Lh32/d4;", "Li32/y0;", "placement$delegate", "getPlacement", "()Li32/y0;", AdRevenueScheme.PLACEMENT, "getCurrentFragment", "currentFragment", "<init>", "Companion", "hq/b", "nux_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class NUXActivity extends a implements iy0.a, e {
    public static final int $stable = 8;

    @NotNull
    public static final String CURRENT_NUX_STEP = "CURRENT_NUX_STEP";

    @NotNull
    public static final b Companion = new b();

    @NotNull
    public static final String FOLLOWED_CREATORS = "FOLLOWED_CREATORS";

    @NotNull
    public static final String FOLLOWED_INTERESTS = "FOLLOWED_INTERESTS";

    @NotNull
    public static final String NUM_USE_CASES_SELECTED = "NUM_USE_CASES_SELECTED";
    private so1.a activityComponent;
    private FrameLayout backButton;
    public lu1.b baseActivityHelper;
    private PlainCarouselIndexView carousel;
    public s experiences;
    public j2 experiments;
    private Integer filledAgeFromPreviousScreen;
    private String filledEmailFromPreviousScreen;
    private String filledUserNameFromPreviousScreen;
    public d intentHelper;
    private d0 nuxDisplayData;
    public kv1.a nuxService;
    public qy0.b nuxSharedStateRepository;
    private List<e0> nuxSteps;
    public j3 perfLogUtils;
    private int signupStep;
    public g themeProvider;

    /* renamed from: isWarmStart$delegate, reason: from kotlin metadata */
    @NotNull
    private final k isWarmStart = m.b(hq.d.f69896i);

    @NotNull
    private final d4 viewType = d4.ORIENTATION;

    /* renamed from: placement$delegate, reason: from kotlin metadata */
    @NotNull
    private final k placement = m.b(new db.m(this, 10));

    private final void callViewNuxStepApi() {
        u S = bf.b.S(this);
        f fVar = v0.f20219a;
        j.z(S, ko2.e.f80326c, null, new c(this, null), 2);
    }

    private final void completeExperience() {
        n b13 = ((dh0.d) getExperiences()).b(getPlacement());
        if (b13 == null) {
            b13 = (n) az0.a.a().get(getPlacement());
        }
        LinkedHashMap linkedHashMap = null;
        if (b13 != null) {
            b13.a(null, null);
            logNuxEnd(b13);
        } else {
            ((dh0.d) getExperiences()).j(getPlacement());
        }
        Context context = kb0.a.f79058b;
        SharedPreferences sharedPreferences = f0.W().getSharedPreferences("PREF_MY_USER_USER_ACCOUNTS_4", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        if (sharedPreferences.getAll().size() > 1) {
            d.a(getIntentHelper(), false, null, null, null, 15);
            return;
        }
        j2 experiments = getExperiments();
        z3 z3Var = z3.DO_NOT_ACTIVATE_EXPERIMENT;
        Integer num = experiments.a("control_baseline", z3Var) ? null : getExperiments().a("enabled_pin_limit_2", z3Var) ? 25 : 15;
        if (num != null) {
            LinkedHashMap b14 = getNuxSharedStateRepository().a().b(num.intValue());
            if (true ^ b14.isEmpty()) {
                linkedHashMap = b14;
            }
        }
        getEventManager().f(new iq.a(linkedHashMap));
    }

    private final nl1.d createInstance(Class<? extends nl1.d> fragmentClass) {
        mu1.a aVar = (mu1.a) getFragmentFactory();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
        nl1.d dVar = (nl1.d) aVar.f(fragmentClass);
        dVar.setArguments(new Bundle());
        return dVar;
    }

    private final void decrementNUXStep() {
        d0 d0Var = this.nuxDisplayData;
        if (d0Var == null) {
            Intrinsics.r("nuxDisplayData");
            throw null;
        }
        d0Var.f(d0Var.c() - 1);
        PlainCarouselIndexView plainCarouselIndexView = this.carousel;
        if (plainCarouselIndexView != null) {
            plainCarouselIndexView.e();
        }
    }

    private final void exitNUX() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        startActivity(intent);
    }

    private final Fragment getCurrentFragment() {
        return getSupportFragmentManager().E(jv1.d.fragment_wrapper);
    }

    private final Class<? extends nl1.d> getFragmentClassForStep(e0 step) {
        int b13 = step.b();
        if (b13 == i32.f.NUX_GENDER_STEP.getValue()) {
            return hy0.d.class;
        }
        if (b13 == i32.f.NUX_COUNTRY_STEP.getValue()) {
            return h.class;
        }
        if (b13 == i32.f.NUX_INTEREST_SELECTOR.getValue()) {
            return xy0.e.class;
        }
        if (b13 == i32.f.NUX_USE_CASE_PICKER_STEP.getValue()) {
            return yy0.n.class;
        }
        if (b13 == i32.f.NUX_PIN_PICKER_STEP.getValue()) {
            return v.class;
        }
        if (b13 == i32.f.NUX_REVAMP_END_SCREEN.getValue()) {
            return o.class;
        }
        updateIndicatorHeader(false);
        return ly0.d.class;
    }

    private final e0 getNUXStep() {
        List<e0> list = this.nuxSteps;
        if (list == null) {
            Intrinsics.r("nuxSteps");
            throw null;
        }
        d0 d0Var = this.nuxDisplayData;
        if (d0Var != null) {
            return (e0) CollectionsKt.U(d0Var.c(), list);
        }
        Intrinsics.r("nuxDisplayData");
        throw null;
    }

    private final void goHome() {
        getIntent().putExtra("com.pinterest.EXTRA_REQUEST_LOCATION_PERMISSION", true);
        ((lu1.c) getBaseActivityHelper()).k(this, true);
        finish();
    }

    private final void goToStep(e0 step, String[] followedCreators, String[] followedInterests, Integer numUseCasesSelected, mo1.a animation) {
        if (step == null) {
            completeExperience();
            goHome();
            return;
        }
        FrameLayout frameLayout = this.backButton;
        if (frameLayout != null) {
            frameLayout.setVisibility(step.a() ? 0 : 8);
        }
        nl1.d createInstance = createInstance(getFragmentClassForStep(step));
        Bundle arguments = createInstance.getArguments();
        if (arguments != null) {
            arguments.putStringArray(FOLLOWED_CREATORS, followedCreators);
            arguments.putStringArray(FOLLOWED_INTERESTS, followedInterests);
            if (numUseCasesSelected != null) {
                arguments.putInt(NUM_USE_CASES_SELECTED, numUseCasesSelected.intValue());
            }
        }
        w0 supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        mo1.c.c(supportFragmentManager, jv1.d.fragment_wrapper, createInstance, step.a(), animation, 32);
        callViewNuxStepApi();
    }

    private final e0 incrementAndGetNUXStep() {
        d0 d0Var = this.nuxDisplayData;
        if (d0Var == null) {
            Intrinsics.r("nuxDisplayData");
            throw null;
        }
        d0Var.f(d0Var.c() + 1);
        PlainCarouselIndexView plainCarouselIndexView = this.carousel;
        if (plainCarouselIndexView != null) {
            plainCarouselIndexView.c();
        }
        return getNUXStep();
    }

    private final boolean isEdgeToEdgeEnabled() {
        return getExperiments().b();
    }

    private final boolean isWarmStart() {
        return ((Boolean) this.isWarmStart.getValue()).booleanValue();
    }

    private final void logNuxEnd(n experienceValue) {
        getPinalytics().g(f1.NUX_END, null, ep.b.o("placed_experience_id", String.valueOf(experienceValue.f108060b)), false);
    }

    private final void logNuxStart(n experienceValue) {
        getHandler().post(new dp.a(2, experienceValue, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logNuxStart$lambda$17(n experienceValue, NUXActivity this$0) {
        Intrinsics.checkNotNullParameter(experienceValue, "$experienceValue");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String valueOf = String.valueOf(experienceValue.f108060b);
        HashMap hashMap = new HashMap();
        hashMap.put("cold_start", String.valueOf(!this$0.isWarmStart()));
        hashMap.put("placed_experience_id", valueOf);
        this$0.getPinalytics().g(f1.NUX_START, null, hashMap, false);
        Fragment currentFragment = this$0.getCurrentFragment();
        if (currentFragment instanceof nl1.d) {
            ((nl1.d) currentFragment).s7().z(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$7$lambda$6$lambda$5(NUXActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    private final void restoreStepIndex(Integer currentStep) {
        if (currentStep != null) {
            d0 d0Var = this.nuxDisplayData;
            if (d0Var == null) {
                Intrinsics.r("nuxDisplayData");
                throw null;
            }
            if (d0Var.c() != currentStep.intValue()) {
                d0 d0Var2 = this.nuxDisplayData;
                if (d0Var2 != null) {
                    d0Var2.f(currentStep.intValue());
                } else {
                    Intrinsics.r("nuxDisplayData");
                    throw null;
                }
            }
        }
    }

    private final boolean shouldDecrementNUXStep(Fragment fragment) {
        return !(fragment instanceof cy0.c);
    }

    public void dismissExperience() {
        n b13 = ((dh0.d) getExperiences()).b(getPlacement());
        if (b13 == null) {
            b13 = (n) az0.a.a().get(getPlacement());
        }
        if (b13 != null) {
            b13.c(null, null);
        } else {
            ((dh0.d) getExperiences()).j(getPlacement());
        }
        goHome();
    }

    @Override // uk1.c
    /* renamed from: getAuxData */
    public /* bridge */ /* synthetic */ HashMap getO0() {
        return null;
    }

    @Override // cp1.p, uo1.a
    @NotNull
    public so1.a getBaseActivityComponent() {
        so1.a aVar = this.activityComponent;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @NotNull
    public final lu1.b getBaseActivityHelper() {
        lu1.b bVar = this.baseActivityHelper;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("baseActivityHelper");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getComponentType */
    public /* bridge */ /* synthetic */ g0 getF123811z0() {
        return null;
    }

    @Override // cp1.p, yf0.f
    @NotNull
    public yf0.d getEdgeToEdgeConfiguration() {
        return isEdgeToEdgeEnabled() ? new yf0.c(yf0.h.SYSTEM_BARS) : yf0.b.f138956a;
    }

    public /* bridge */ /* synthetic */ h32.w0 getEventData() {
        return null;
    }

    @NotNull
    public final s getExperiences() {
        s sVar = this.experiences;
        if (sVar != null) {
            return sVar;
        }
        Intrinsics.r("experiences");
        throw null;
    }

    @NotNull
    public final j2 getExperiments() {
        j2 j2Var = this.experiments;
        if (j2Var != null) {
            return j2Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    @Override // cp1.p
    public Fragment getFragment() {
        return getSupportFragmentManager().E(jv1.d.fragment_wrapper);
    }

    @NotNull
    public final d getIntentHelper() {
        d dVar = this.intentHelper;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("intentHelper");
        throw null;
    }

    @NotNull
    public final kv1.a getNuxService() {
        kv1.a aVar = this.nuxService;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("nuxService");
        throw null;
    }

    @NotNull
    public final qy0.b getNuxSharedStateRepository() {
        qy0.b bVar = this.nuxSharedStateRepository;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("nuxSharedStateRepository");
        throw null;
    }

    @NotNull
    public final j3 getPerfLogUtils() {
        j3 j3Var = this.perfLogUtils;
        if (j3Var != null) {
            return j3Var;
        }
        Intrinsics.r("perfLogUtils");
        throw null;
    }

    @Override // iy0.a
    @NotNull
    public y0 getPlacement() {
        return (y0) this.placement.getValue();
    }

    @NotNull
    public final g getThemeProvider() {
        g gVar = this.themeProvider;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.r("themeProvider");
        throw null;
    }

    @Override // nx.a
    public /* bridge */ /* synthetic */ String getUniqueScreenKey() {
        return null;
    }

    public /* bridge */ /* synthetic */ x3 getViewData() {
        return null;
    }

    @Override // uk1.c
    @NotNull
    /* renamed from: getViewType, reason: from getter */
    public d4 getF140467e0() {
        return this.viewType;
    }

    @Override // iy0.a
    public void gotoNextStep(String[] followedCreators, String[] followedInterests, Integer numUseCasesSelected) {
        goToStep(incrementAndGetNUXStep(), followedCreators, followedInterests, numUseCasesSelected, mo1.a.SLIDE);
    }

    @Override // cp1.p, androidx.activity.o, android.app.Activity
    public void onBackPressed() {
        e0 nUXStep;
        Fragment currentFragment = getCurrentFragment();
        nl1.d dVar = currentFragment instanceof nl1.d ? (nl1.d) currentFragment : null;
        if (dVar == null || !dVar.getF103154e0()) {
            ArrayList arrayList = getSupportFragmentManager().f18452d;
            if (arrayList == null || arrayList.size() <= 0 || ((nUXStep = getNUXStep()) != null && nUXStep.b() == i32.f.NUX_REVAMP_END_SCREEN.getValue())) {
                exitNUX();
                return;
            }
            w0 supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            supportFragmentManager.U();
            if (shouldDecrementNUXStep(currentFragment)) {
                decrementNUXStep();
            }
            ArrayList arrayList2 = supportFragmentManager.f18452d;
            int size = arrayList2 != null ? arrayList2.size() : 0;
            e1 e1Var = supportFragmentManager.f18451c;
            if (size >= e1Var.f().size()) {
                return;
            }
            Fragment fragment = (Fragment) e1Var.f().get(size);
            nl1.d dVar2 = fragment instanceof nl1.d ? (nl1.d) fragment : null;
            if (dVar2 != null) {
                dVar2.s7().z(null);
            }
            bs1.c.X0(this.backButton);
            callViewNuxStepApi();
        }
    }

    @Override // cp1.p, cp1.q, androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        inject();
        g.a(getThemeProvider(), this, isEdgeToEdgeEnabled(), false, 4);
        super.onCreate(savedInstanceState);
        setContentView(jv1.f.activity_nux);
        n b13 = ((dh0.d) getExperiences()).b(getPlacement());
        FrameLayout frameLayout = null;
        if (b13 != null) {
            ag2.e eVar = b13.f108068j;
            d0 d0Var = eVar instanceof d0 ? (d0) eVar : null;
            if (d0Var != null && !d0Var.d()) {
                az0.a.a().put(getPlacement(), b13);
            }
        } else {
            n nVar = (n) az0.a.a().get(getPlacement());
            ag2.e eVar2 = nVar != null ? nVar.f108068j : null;
            d0 d0Var2 = eVar2 instanceof d0 ? (d0) eVar2 : null;
            if (d0Var2 != null) {
                d0Var2.f(0);
            }
            b13 = (n) az0.a.a().get(getPlacement());
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.signupStep = extras.getInt("com.pinterest.EXTRA_SIGNUP_STEP_NUMBER");
        }
        Bundle extras2 = getIntent().getExtras();
        this.filledEmailFromPreviousScreen = extras2 != null ? extras2.getString("com.pinterest.EXTRA_EMAIL") : null;
        Bundle extras3 = getIntent().getExtras();
        this.filledAgeFromPreviousScreen = extras3 != null ? Integer.valueOf(extras3.getInt("com.pinterst.EXTRA_SETTINGS_AGE")) : 0;
        Bundle extras4 = getIntent().getExtras();
        this.filledUserNameFromPreviousScreen = extras4 != null ? extras4.getString("com.pinterest.EXTRA_USERNAME") : null;
        if (b13 == null) {
            getAnalyticsApi().a("android.nux.no_experience");
            ((lu1.c) getBaseActivityHelper()).k(this, false);
            finish();
        } else {
            ag2.e eVar3 = b13.f108068j;
            d0 d0Var3 = eVar3 instanceof d0 ? (d0) eVar3 : null;
            if (d0Var3 != null) {
                this.nuxDisplayData = d0Var3;
                this.nuxSteps = d0Var3.e(getActiveUserManager());
                Fragment E = getSupportFragmentManager().E(jv1.d.fragment_wrapper);
                Integer valueOf = savedInstanceState != null ? Integer.valueOf(savedInstanceState.getInt(CURRENT_NUX_STEP)) : null;
                if (E == null) {
                    if (valueOf == null || valueOf.intValue() == 0) {
                        updateIndicatorHeader(true);
                        List<e0> list = this.nuxSteps;
                        if (list == null) {
                            Intrinsics.r("nuxSteps");
                            throw null;
                        }
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        nl1.d createInstance = createInstance(getFragmentClassForStep((e0) CollectionsKt.S(list)));
                        d0 d0Var4 = this.nuxDisplayData;
                        if (d0Var4 == null) {
                            Intrinsics.r("nuxDisplayData");
                            throw null;
                        }
                        d0Var4.f(0);
                        b13.g();
                        logNuxStart(b13);
                        w0 supportFragmentManager = getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                        mo1.c.c(supportFragmentManager, jv1.d.fragment_wrapper, createInstance, false, mo1.a.NONE, 32);
                        dl2.b.a2(this);
                    } else {
                        restoreStepIndex(valueOf);
                        goToStep(getNUXStep(), null, null, null, mo1.a.NONE);
                    }
                } else if (E instanceof nl1.d) {
                    ((nl1.d) E).activate();
                    restoreStepIndex(valueOf);
                }
                PlainCarouselIndexView plainCarouselIndexView = (PlainCarouselIndexView) findViewById(jv1.d.activity_nux_carousel);
                this.carousel = plainCarouselIndexView;
                if (plainCarouselIndexView != null) {
                    plainCarouselIndexView.setVisibility(0);
                }
                PlainCarouselIndexView plainCarouselIndexView2 = this.carousel;
                if (plainCarouselIndexView2 != null) {
                    int i13 = this.signupStep;
                    List<e0> list2 = this.nuxSteps;
                    if (list2 == null) {
                        Intrinsics.r("nuxSteps");
                        throw null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list2) {
                        if (!((e0) obj).c()) {
                            arrayList.add(obj);
                        }
                    }
                    int size = arrayList.size() + i13;
                    int i14 = this.signupStep;
                    d0 d0Var5 = this.nuxDisplayData;
                    if (d0Var5 == null) {
                        Intrinsics.r("nuxDisplayData");
                        throw null;
                    }
                    plainCarouselIndexView2.b(size, d0Var5.c() + i14);
                }
                FrameLayout frameLayout2 = (FrameLayout) findViewById(jv1.d.activity_nux_back_button);
                if (frameLayout2 != null) {
                    frameLayout2.setOnClickListener(new l2(this, 19));
                    frameLayout = frameLayout2;
                }
                this.backButton = frameLayout;
            }
        }
        k3.R1(getToastContainer(), false);
    }

    @Override // cp1.p, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int keyCode, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment != null && (currentFragment instanceof nl1.d)) {
        }
        return super.onKeyUp(keyCode, event);
    }

    @Override // cp1.p, androidx.activity.o, c5.h, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        d0 d0Var = this.nuxDisplayData;
        if (d0Var == null) {
            Intrinsics.r("nuxDisplayData");
            throw null;
        }
        if (d0Var.c() > 0) {
            d0 d0Var2 = this.nuxDisplayData;
            if (d0Var2 != null) {
                outState.putInt(CURRENT_NUX_STEP, d0Var2.c());
            } else {
                Intrinsics.r("nuxDisplayData");
                throw null;
            }
        }
    }

    @Override // cp1.p, androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        callViewNuxStepApi();
    }

    public final void setBaseActivityHelper(@NotNull lu1.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.baseActivityHelper = bVar;
    }

    public final void setExperiences(@NotNull s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<set-?>");
        this.experiences = sVar;
    }

    public final void setExperiments(@NotNull j2 j2Var) {
        Intrinsics.checkNotNullParameter(j2Var, "<set-?>");
        this.experiments = j2Var;
    }

    public final void setIntentHelper(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.intentHelper = dVar;
    }

    public final void setNuxService(@NotNull kv1.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.nuxService = aVar;
    }

    public final void setNuxSharedStateRepository(@NotNull qy0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.nuxSharedStateRepository = bVar;
    }

    public final void setPerfLogUtils(@NotNull j3 j3Var) {
        Intrinsics.checkNotNullParameter(j3Var, "<set-?>");
        this.perfLogUtils = j3Var;
    }

    public final void setThemeProvider(@NotNull g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.themeProvider = gVar;
    }

    @Override // cp1.p
    public void setupActivityComponent() {
        if (this.activityComponent == null) {
            this.activityComponent = (so1.a) me.o.a(this, so1.a.class);
        }
    }

    @Override // iy0.a
    public void updateIndicatorHeader(boolean showIndicator) {
        k3.R1(this.carousel, showIndicator);
    }
}
