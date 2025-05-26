package ll0;

import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;

/* loaded from: classes5.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f83794a;

    public b(f fVar) {
        this.f83794a = fVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull kn0.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f80223b;
        f fVar = this.f83794a;
        if (Intrinsics.d(str, fVar.f83802a) && fVar.isBound()) {
            fVar.f83817p = true;
            fVar.q3();
        }
    }
}
