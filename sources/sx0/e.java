package sx0;

import kotlin.jvm.internal.Intrinsics;
import kp.i;
import kp.j;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import pg0.h0;
import pg0.r;
import rb2.q;
import sp2.k;

/* loaded from: classes5.dex */
public final class e implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f115622a;

    public e(g gVar) {
        this.f115622a = gVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull kp.g event) {
        q qVar;
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f80539c;
        if (str == null || (qVar = this.f115622a.M0) == null) {
            return;
        }
        qVar.c2(str);
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull kp.h event) {
        q qVar;
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f80540a;
        if (str == null || (qVar = this.f115622a.M0) == null) {
            return;
        }
        qVar.b1(str);
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        q qVar = this.f115622a.M0;
        if (qVar != null) {
            qVar.U1();
        }
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.a event) {
        q qVar;
        q qVar2;
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f100048a;
        g gVar = this.f115622a;
        if (str != null && (qVar2 = gVar.M0) != null) {
            qVar2.N2(str);
        }
        if (!event.f100049b || (qVar = gVar.M0) == null) {
            return;
        }
        qVar.W();
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull r event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z13 = event.f100088b;
        g gVar = this.f115622a;
        if (z13) {
            q qVar = gVar.M0;
            if (qVar != null) {
                qVar.W();
                return;
            }
            return;
        }
        q qVar2 = gVar.M0;
        if (qVar2 != null) {
            qVar2.c2(event.f100087a);
        }
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(h0 h0Var) {
        q qVar = this.f115622a.M0;
        if (qVar != null) {
            qVar.f1();
        }
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(j jVar) {
        int i13 = g.T0;
        g gVar = this.f115622a;
        t tVar = (t) gVar.S0.getValue();
        if (tVar != null) {
            gVar.f7().j(tVar);
        }
        gVar.f7().j(this);
    }
}
