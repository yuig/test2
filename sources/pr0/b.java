package pr0;

import ey.x;
import ey.z;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import ny.s;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;
import uy.d0;
import uy.e0;
import uy.h;
import uy.i;

/* loaded from: classes.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f101156a;

    public b(g gVar) {
        this.f101156a = gVar;
    }

    public final void a(Object obj) {
        Class<?> cls = obj.getClass();
        g gVar = this.f101156a;
        if (Intrinsics.d(cls, gVar.f101171f)) {
            gVar.f101178m = false;
        }
    }

    public final void b(Object obj) {
        Class<?> cls = obj.getClass();
        g gVar = this.f101156a;
        if (Intrinsics.d(cls, gVar.f101171f)) {
            gVar.f101169d.j(this);
            gVar.f101178m = false;
        }
    }

    public final void c(Object obj) {
        Class<?> cls = obj.getClass();
        g gVar = this.f101156a;
        if (Intrinsics.d(cls, gVar.f101170e)) {
            gVar.f101178m = true;
        }
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull x event) {
        Intrinsics.checkNotNullParameter(event, "event");
        b(event);
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull z event) {
        Intrinsics.checkNotNullParameter(event, "event");
        b(event);
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull my.e event) {
        Intrinsics.checkNotNullParameter(event, "event");
        a(event);
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull my.k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        c(event);
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull s event) {
        Intrinsics.checkNotNullParameter(event, "event");
        b(event);
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        a(event);
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        c(event);
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull uy.s event) {
        Intrinsics.checkNotNullParameter(event, "event");
        a(event);
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull uy.t event) {
        Intrinsics.checkNotNullParameter(event, "event");
        c(event);
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull d0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        a(event);
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull e0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        c(event);
    }
}
