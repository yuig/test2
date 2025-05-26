package cp;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import pg0.h0;

/* loaded from: classes3.dex */
public final class p implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f52965a;

    public p(u uVar) {
        this.f52965a = uVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull kp.g event) {
        rb2.q qVar;
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f80539c;
        if (str == null || (qVar = this.f52965a.S0) == null) {
            return;
        }
        qVar.c2(str);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull kp.h event) {
        rb2.q qVar;
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f80540a;
        if (str == null || (qVar = this.f52965a.S0) == null) {
            return;
        }
        qVar.b1(str);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull kp.i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        rb2.q qVar = this.f52965a.S0;
        if (qVar != null) {
            qVar.U1();
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.a event) {
        rb2.q qVar;
        rb2.q qVar2;
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f100048a;
        u uVar = this.f52965a;
        if (str != null && (qVar2 = uVar.S0) != null) {
            qVar2.N2(str);
        }
        if (!event.f100049b || (qVar = uVar.S0) == null) {
            return;
        }
        qVar.W();
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.r event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z13 = event.f100088b;
        u uVar = this.f52965a;
        if (z13) {
            rb2.q qVar = uVar.S0;
            if (qVar != null) {
                qVar.W();
                return;
            }
            return;
        }
        rb2.q qVar2 = uVar.S0;
        if (qVar2 != null) {
            qVar2.c2(event.f100087a);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(h0 h0Var) {
        rb2.q qVar = this.f52965a.S0;
        if (qVar != null) {
            qVar.f1();
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(kp.j jVar) {
        u uVar = this.f52965a;
        uVar.f7().j(uVar.f52979f1);
        uVar.f7().j(this);
    }
}
