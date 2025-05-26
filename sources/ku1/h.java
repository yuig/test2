package ku1;

import android.app.Activity;
import com.pinterest.component.modal.ModalContainer;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.ScreenModel;
import com.pinterest.framework.screens.r;
import com.pinterest.framework.screens.s;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.w1;
import g4.u;
import h32.d4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import m60.w;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class h implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f80901a;

    public h(j jVar) {
        this.f80901a = jVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull Navigation navigation) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        j jVar = this.f80901a;
        Activity activity = jVar.f80903a;
        Unit unit = null;
        if (activity != null) {
            lu1.a aVar = lu1.a.MAIN_ACTIVITY;
            lu1.d dVar = jVar.f80910h;
            boolean c13 = dVar.c(activity, aVar);
            lu1.b bVar = jVar.f80909g;
            if (c13) {
                if (navigation == null) {
                    jVar.f80906d.o("Exception in handleNavigationForMainActivity", new IllegalStateException("Navigation cannot be null"));
                } else {
                    com.pinterest.framework.screens.g displayMode = navigation.getDisplayMode();
                    com.pinterest.framework.screens.g gVar = com.pinterest.framework.screens.g.MODAL;
                    w wVar = jVar.f80905c;
                    if (displayMode == gVar) {
                        wVar.d(new u());
                    }
                    ModalContainer modalContainer = jVar.f80913k;
                    if (modalContainer != null && modalContainer.i()) {
                        a.c.y(wVar);
                    }
                    if (c60.d.b() || Intrinsics.d(w1.a(), navigation.getF49939a()) || Intrinsics.d((ScreenLocation) w1.f51514z.getValue(), navigation.getF49939a())) {
                        jVar.m(navigation);
                    } else {
                        jVar.f80904b.n();
                        Activity activity2 = jVar.f80903a;
                        if (activity2 != null) {
                            ((lu1.c) bVar).q(activity2, null);
                            activity2.finish();
                        }
                    }
                }
            } else if (dVar.c(activity, lu1.a.PIN_IT_ACTIVITY)) {
                if (navigation.getF49944f() == d4.FLASHLIGHT_CAMERA_ROLL_CLOSEUP) {
                    return;
                } else {
                    ((lu1.c) bVar).r(activity, navigation);
                }
            } else if (dVar.c(activity, lu1.a.COMMENT_ACTIVITY)) {
                j.a(jVar, navigation);
            } else if (dVar.c(activity, lu1.a.CREATION_ACTIVITY)) {
                j.a(jVar, navigation);
            } else {
                if (!dVar.c(activity, lu1.a.WIDGET_CONFIGURATION_ACTIVITY)) {
                    throw new IllegalStateException("Navigation for this activity type not supported.");
                }
                j.a(jVar, navigation);
            }
            unit = Unit.f80348a;
        }
        if (unit == null) {
            throw new IllegalStateException("Activity is null");
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull c action) {
        s sVar;
        Intrinsics.checkNotNullParameter(action, "e");
        j jVar = this.f80901a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        za.c cVar = (za.c) action;
        List f13 = cVar.f();
        if (f13 == null || f13.isEmpty() || (sVar = jVar.f80914l) == null) {
            return;
        }
        ArrayList screenDescriptions = new ArrayList();
        List f14 = cVar.f();
        if (f14 != null) {
            Iterator it = f14.iterator();
            while (it.hasNext()) {
                ScreenModel b13 = ((Navigation) it.next()).b1();
                Intrinsics.checkNotNullExpressionValue(b13, "toScreenDescription(...)");
                screenDescriptions.add(b13);
            }
        }
        Intrinsics.checkNotNullParameter(screenDescriptions, "screenDescriptions");
        Iterator it2 = screenDescriptions.iterator();
        while (true) {
            boolean z13 = false;
            while (it2.hasNext()) {
                ScreenDescription screenDescription = (ScreenDescription) it2.next();
                r rVar = new r(sVar);
                Iterator it3 = sVar.i().iterator();
                int i13 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i13 = -1;
                        break;
                    }
                    Object next = it3.next();
                    int i14 = i13 + 1;
                    if (i13 >= 0) {
                        if (((Boolean) rVar.invoke(screenDescription, (ScreenDescription) next)).booleanValue()) {
                            break;
                        } else {
                            i13 = i14;
                        }
                    } else {
                        f0.p();
                        throw null;
                    }
                }
                ScreenDescription A = sVar.A(i13);
                if (z13 || A != null) {
                    z13 = true;
                }
            }
            return;
        }
    }
}
