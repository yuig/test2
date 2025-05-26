package ni1;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class i implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f90704a;

    public i(j jVar) {
        this.f90704a = jVar;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.e pinChipEvent) {
        Intrinsics.checkNotNullParameter(pinChipEvent, "pinChipEvent");
        u50.r rVar = this.f90704a.f90712d;
        if (rVar == null) {
            Intrinsics.r("eventIntake");
            throw null;
        }
        rVar.a(new u1(new bk1.a0(pinChipEvent.f84688b, pinChipEvent.f84687a)));
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f84689i;
        j jVar = this.f90704a;
        if (Intrinsics.d(str, jVar.f90711c)) {
            u50.r rVar = jVar.f90712d;
            if (rVar != null) {
                rVar.a(new u1(new bk1.x(System.currentTimeMillis() * 1000000, event.f84689i)));
                jVar.f90709a.i(event);
            } else {
                Intrinsics.r("eventIntake");
                throw null;
            }
        }
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f84693i;
        j jVar = this.f90704a;
        if (Intrinsics.d(str, jVar.f90711c)) {
            jVar.f90709a.i(event);
            u50.r rVar = jVar.f90712d;
            if (rVar != null) {
                rVar.a(new u1(new bk1.b0(event.f84694j)));
            } else {
                Intrinsics.r("eventIntake");
                throw null;
            }
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.m e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        String str = e13.f84699a;
        j jVar = this.f90704a;
        if (Intrinsics.d(str, jVar.f90711c)) {
            u50.r rVar = jVar.f90712d;
            if (rVar != null) {
                rVar.a(new u1(bk1.c0.f23196a));
            } else {
                Intrinsics.r("eventIntake");
                throw null;
            }
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.o event) {
        Intrinsics.checkNotNullParameter(event, "event");
        j jVar = this.f90704a;
        if (Intrinsics.d(jVar.f90711c, event.f84702a)) {
            u50.r rVar = jVar.f90712d;
            if (rVar != null) {
                rVar.a(new w1(new fk1.h(event.f84703b, event.f84705d)));
            } else {
                Intrinsics.r("eventIntake");
                throw null;
            }
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull m10.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        u50.r rVar = this.f90704a.f90712d;
        if (rVar == null) {
            Intrinsics.r("eventIntake");
            throw null;
        }
        String str = event.f85656a;
        Intrinsics.checkNotNullExpressionValue(str, "getContentId(...)");
        rVar.a(new i1(str));
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ps.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f101245b;
        if (str != null) {
            j jVar = this.f90704a;
            if (Intrinsics.d(str, jVar.f90711c)) {
                jVar.f90709a.i(event);
                u50.r rVar = jVar.f90712d;
                if (rVar != null) {
                    rVar.a(new m1(event.f101244a));
                } else {
                    Intrinsics.r("eventIntake");
                    throw null;
                }
            }
        }
    }
}
