package a41;

import com.pinterest.api.model.b90;
import com.pinterest.api.model.wy0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.i3;
import ey.z3;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class a0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f547a;

    public a0(d0 d0Var) {
        this.f547a = d0Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull dg0.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f547a.J3();
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull dg0.e event) {
        Intrinsics.checkNotNullParameter(event, "event");
        p0 p0Var = (p0) this.f547a.getViewIfBound();
        if (p0Var != null) {
            ScreenLocation d2 = i3.d();
            i iVar = i.f611q;
            NavigationImpl w13 = Navigation.w1(d2);
            iVar.invoke(w13);
            Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
            ((r) p0Var).M1(w13);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull dg0.g event) {
        b90 f43;
        Intrinsics.checkNotNullParameter(event, "event");
        d0 d0Var = this.f547a;
        p0 p0Var = (p0) d0Var.getViewIfBound();
        if (p0Var != null) {
            wy0 wy0Var = d0Var.C;
            ((r) p0Var).u8((wy0Var == null || (f43 = wy0Var.f4()) == null) ? null : f43.f());
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull dg0.h event) {
        b90 f43;
        Intrinsics.checkNotNullParameter(event, "event");
        d0 d0Var = this.f547a;
        p0 p0Var = (p0) d0Var.getViewIfBound();
        if (p0Var != null) {
            wy0 wy0Var = d0Var.C;
            ((r) p0Var).u8((wy0Var == null || (f43 = wy0Var.f4()) == null) ? null : f43.f());
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull dg0.l event) {
        Intrinsics.checkNotNullParameter(event, "event");
        p0 p0Var = (p0) this.f547a.getViewIfBound();
        if (p0Var != null) {
            ScreenLocation d2 = i3.d();
            i iVar = i.f611q;
            NavigationImpl w13 = Navigation.w1(d2);
            iVar.invoke(w13);
            Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
            ((r) p0Var).M1(w13);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull dg0.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        p0 p0Var = (p0) this.f547a.getViewIfBound();
        if (p0Var != null) {
            ScreenLocation d2 = i3.d();
            i iVar = i.f611q;
            NavigationImpl w13 = Navigation.w1(d2);
            iVar.invoke(w13);
            Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
            ((r) p0Var).M1(w13);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull dg0.n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f547a.J3();
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull e82.x event) {
        Intrinsics.checkNotNullParameter(event, "event");
        d0 d0Var = this.f547a;
        d0Var.f566k.i(event);
        b60.b bVar = d0Var.f579x;
        String str = d0Var.f556a;
        if (bVar.b(str)) {
            xj2.c o13 = d0Var.f565j.g0().Q(str).s().r(tk2.e.f118017c).o(new u(9, i.f618x), new u(10, i.f619y));
            Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
            d0Var.addDisposable(o13);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull z3 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        p0 p0Var = (p0) this.f547a.getViewIfBound();
        if (p0Var != null) {
            r rVar = (r) p0Var;
            if (rVar.x8()) {
                ((t) rVar.a8()).M();
            }
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull jc1.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        d0 d0Var = this.f547a;
        wy0 wy0Var = d0Var.C;
        if (wy0Var != null) {
            d0Var.a4(wy0Var);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull zp.z event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f547a.V3(Boolean.valueOf(event.f142584a));
    }
}
