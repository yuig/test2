package mf0;

import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class j implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f87117a;

    public j(k kVar) {
        this.f87117a = kVar;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull of0.a e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        k kVar = this.f87117a;
        kVar.f87119b.i(e13);
        kVar.a(e13.f94404a);
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull of0.b e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        k kVar = this.f87117a;
        kVar.f87119b.i(e13);
        e13.getClass();
        if (kVar.f87121d instanceof l) {
            kVar.a(null);
        }
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ux.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f87117a.getClass();
    }
}
