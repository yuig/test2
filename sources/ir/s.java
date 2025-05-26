package ir;

import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.kg0;
import com.pinterest.api.model.wy0;
import com.pinterest.component.alert.AlertContainer;
import com.pinterest.feature.pin.creation.view.UploadProgressBarLayout;
import i32.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m60.x0;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import pg0.i0;
import pg0.q0;
import x02.i2;

/* loaded from: classes.dex */
public final class s implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f73479a;

    public s(MainActivity mainActivity) {
        this.f73479a = mainActivity;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull i0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        List list = event.f100070a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wy0 e13 = ew.e((String) it.next());
            if (e13 != null) {
                arrayList.add(e13);
            }
        }
        MainActivity mainActivity = this.f73479a;
        com.bumptech.glide.c.K0(mainActivity.R(), mainActivity, new sz1.e(arrayList), sz1.a.f115648i, mainActivity.T(), mainActivity.getActiveUserManager());
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull q0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        wy0 e13 = ew.e(event.f100086a);
        if (e13 != null) {
            MainActivity mainActivity = this.f73479a;
            com.bumptech.glide.c.K0(mainActivity.R(), mainActivity, new sz1.f(e13), sz1.a.f115648i, mainActivity.T(), mainActivity.getActiveUserManager());
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull qg0.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        MainActivity mainActivity = this.f73479a;
        ny1.w R = mainActivity.R();
        sz1.h hVar = new sz1.h(event.f103825a);
        lb0.q T = mainActivity.T();
        b60.b activeUserManager = mainActivity.getActiveUserManager();
        com.bumptech.glide.c.K0(R, this.f73479a, hVar, sz1.a.f115648i, T, activeUserManager);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull rg0.p e13) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(e13, "e");
        y0 y0Var = y0.ANDROID_MAIN_USER_ED;
        y0 y0Var2 = e13.f108078a;
        MainActivity mainActivity = this.f73479a;
        if (y0Var == y0Var2) {
            rg0.s sVar = mainActivity.Q;
            if (sVar != null) {
                rg0.n c13 = ((dh0.d) sVar).c(y0Var2);
                if ((c13 != null ? c13.f108068j : null) != null) {
                    wy0 f13 = ((b60.d) mainActivity.getActiveUserManager()).f();
                    if (f13 == null || (bool = f13.G3()) == null) {
                        bool = Boolean.FALSE;
                    }
                    if (!bool.booleanValue()) {
                        lu1.b bVar = mainActivity.P;
                        if (bVar != null) {
                            ((lu1.c) bVar).n(mainActivity, String.valueOf(y0Var2.getValue()), mainActivity.getIntent().getExtras());
                            return;
                        } else {
                            Intrinsics.r("baseActivityHelper");
                            throw null;
                        }
                    }
                    return;
                }
                return;
            }
            Intrinsics.r("experiences");
            throw null;
        }
        if (y0.ANDROID_APP_TAKEOVER != y0Var2 || mainActivity.I().f56995a) {
            return;
        }
        e3.a I = mainActivity.I();
        com.pinterest.framework.screens.s sVar2 = mainActivity.A0;
        if (sVar2 != null) {
            I.l(mainActivity, sVar2.k());
        } else {
            Intrinsics.r("mainScreenManager");
            throw null;
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull rg0.i0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        f30 c13 = ew.c(event.f108030a);
        if (c13 != null) {
            MainActivity mainActivity = this.f73479a;
            com.bumptech.glide.c.K0(mainActivity.R(), mainActivity, new sz1.d(c13, ((b60.d) mainActivity.getActiveUserManager()).f()), sz1.a.f115648i, mainActivity.T(), mainActivity.getActiveUserManager());
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull w51.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        kg0 kg0Var = event.f128104a;
        bk.f fVar = MainActivity.N0;
        MainActivity mainActivity = this.f73479a;
        mainActivity.getClass();
        mainActivity.showToast(new lr.z(kg0Var));
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull y42.d event) {
        String E4;
        Intrinsics.checkNotNullParameter(event, "event");
        MainActivity mainActivity = this.f73479a;
        mainActivity.setupToastContainer();
        wy0 f13 = ((b60.d) mainActivity.getActiveUserManager()).f();
        if (f13 != null && (E4 = f13.E4()) != null) {
            int i13 = 0;
            int i14 = 1;
            if (StringsKt.E(E4, "instagram.com", false)) {
                se2.a aVar = mainActivity.f35194p0;
                if (aVar != null) {
                    if (!((lb0.b) ((lb0.o) ((bf2.b) aVar).get())).e("SEEN_POST_CREATE_DIALOG", false)) {
                        se2.a aVar2 = mainActivity.L;
                        if (aVar2 != null) {
                            i2 i2Var = (i2) ((bf2.b) aVar2).get();
                            String uid = event.f137710a.getUid();
                            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                            xj2.c F = uj2.q.h(i2Var.P(uid), mainActivity.Y().D("").u(), new ep.g(2, x.f73488i)).H(tk2.e.f118017c).A(wj2.c.a()).F(new h(0, new y(mainActivity, event, i13)), new h(1, new y(mainActivity, event, i14)), ck2.i.f27923c, ck2.i.f27924d);
                            Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
                            mainActivity.addDisposable(F);
                            return;
                        }
                        Intrinsics.r("pinRepository");
                        throw null;
                    }
                } else {
                    Intrinsics.r("persistedPreferencesManager");
                    throw null;
                }
            }
        }
        String uid2 = event.f137710a.getUid();
        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
        MainActivity.B(mainActivity, uid2, event.f137711b, event.f137712c);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull y42.e event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Function0 action = event.f137713a;
        MainActivity mainActivity = this.f73479a;
        mainActivity.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        if (UploadProgressBarLayout.f47125n) {
            yb0.n nVar = new yb0.n(mainActivity);
            String string = nVar.getResources().getString(x0.pin_publish_warning_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            nVar.w(string);
            nVar.u(nVar.getResources().getString(x0.pin_publish_warning_logout_subtitle));
            String string2 = nVar.getResources().getString(x0.pin_publish_warning_publish);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            nVar.q(string2);
            String string3 = nVar.getResources().getString(x0.pin_publish_warning_logout);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            nVar.m(string3);
            nVar.l(new co.a(19, mainActivity, action));
            AlertContainer alertContainer = mainActivity.f35181j;
            if (alertContainer != null) {
                alertContainer.c(nVar);
                return;
            } else {
                Intrinsics.r("alertContainer");
                throw null;
            }
        }
        action.invoke();
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull y42.j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f137732a;
        bk.f fVar = MainActivity.N0;
        MainActivity mainActivity = this.f73479a;
        mainActivity.getClass();
        xf1.a aVar = new xf1.a(mainActivity);
        aVar.k(false);
        String string = mainActivity.getString(x0.story_pin_creation_error_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        aVar.w(string);
        aVar.u(str);
        String string2 = aVar.getResources().getString(x0.story_pin_user_feedback_on_publish_share);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        aVar.x("", string2);
        String string3 = mainActivity.getString(x0.story_pin_creation_error_try_again);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        aVar.q(string3);
        String string4 = mainActivity.getString(x0.story_pin_store_draft);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        aVar.m(string4);
        aVar.p(new co.a(18, mainActivity, aVar));
        AlertContainer alertContainer = mainActivity.f35181j;
        if (alertContainer != null) {
            alertContainer.c(aVar);
        } else {
            Intrinsics.r("alertContainer");
            throw null;
        }
    }
}
