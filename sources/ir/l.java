package ir;

import android.view.View;
import android.view.ViewStub;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.component.modal.ModalContainer;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import so.g4;
import so.h4;
import so.i4;
import so.oa;
import so.r8;
import so.s8;

/* loaded from: classes.dex */
public final class l implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f73466a;

    public l(MainActivity mainActivity) {
        this.f73466a = mainActivity;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull com.pinterest.feature.pin.t showRepinAnimationEvent) {
        Intrinsics.checkNotNullParameter(showRepinAnimationEvent, "showRepinAnimationEvent");
        MainActivity mainActivity = this.f73466a;
        if (mainActivity.f35200s0 == null) {
            if (mainActivity.f35202t0 == null) {
                ViewStub viewStub = mainActivity.f35191o;
                if (viewStub == null) {
                    Intrinsics.r("repinAnimationContainerViewStub");
                    throw null;
                }
                mainActivity.f35202t0 = viewStub.inflate();
            }
            View view = mainActivity.f35202t0;
            if (view != null) {
                g4 g4Var = mainActivity.f35190n0;
                if (g4Var == null) {
                    Intrinsics.r("repinAnimationControllerFactory");
                    throw null;
                }
                r8 r8Var = g4Var.f113429a;
                ku1.j jVar = (ku1.j) r8Var.f114091b.f114402n.get();
                oa oaVar = r8Var.f114090a;
                rg0.s sVar = (rg0.s) oaVar.Q5.get();
                jo1.c cVar = (jo1.c) oaVar.f113810md.get();
                s8 s8Var = r8Var.f114091b;
                mainActivity.f35200s0 = new com.pinterest.feature.pin.o(mainActivity, view, jVar, sVar, cVar, s8Var.k6(), (m60.w) oaVar.f113885r0.get(), (com.pinterest.feature.pin.p) s8Var.Mc.get(), (h4) s8Var.Nc.get(), (i4) s8Var.Oc.get());
            }
        }
        com.pinterest.feature.pin.o oVar = mainActivity.f35200s0;
        if (oVar != null) {
            oVar.d(showRepinAnimationEvent.f47319a, showRepinAnimationEvent.f47320b, showRepinAnimationEvent.f47321c);
        }
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull i92.h e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        MainActivity mainActivity = this.f73466a;
        mainActivity.getEventManager().i(e13);
        mainActivity.showToast(e13.f71930a);
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull jc0.v e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        kg.a.p();
        MainActivity mainActivity = this.f73466a;
        mainActivity.getEventManager().i(e13);
        ModalContainer modalContainer = mainActivity.f35179i;
        if (modalContainer != null) {
            modalContainer.k(e13);
        } else {
            Intrinsics.r("modalContainer");
            throw null;
        }
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull r70.h e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        MainActivity mainActivity = this.f73466a;
        mainActivity.getEventManager().i(e13);
        r70.a aVar = mainActivity.f130611b;
        if (aVar != null) {
            aVar.g(e13.f106378a, e13.f106379b);
        }
    }
}
