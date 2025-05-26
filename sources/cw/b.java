package cw;

import jc0.s;
import jc0.v;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;

/* loaded from: classes3.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f53314a;

    public b(e eVar) {
        this.f53314a = eVar;
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull s e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        e eVar = this.f53314a;
        bj.b bVar = eVar.t().f32095b;
        if (bVar == null || !bVar.getHasVideoContent()) {
            return;
        }
        eVar.getClass();
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull v e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        e eVar = this.f53314a;
        bj.b bVar = eVar.t().f32095b;
        if (bVar == null || !bVar.getHasVideoContent()) {
            return;
        }
        eVar.getClass();
    }
}
