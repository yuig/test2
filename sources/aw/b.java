package aw;

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
    public final /* synthetic */ f f20527a;

    public b(f fVar) {
        this.f20527a = fVar;
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull s e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        f fVar = this.f20527a;
        bj.b bVar = fVar.t().f32095b;
        if (bVar == null || !bVar.getHasVideoContent()) {
            return;
        }
        fVar.getClass();
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull v e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        f fVar = this.f20527a;
        bj.b bVar = fVar.t().f32095b;
        if (bVar == null || !bVar.getHasVideoContent()) {
            return;
        }
        fVar.getClass();
    }
}
