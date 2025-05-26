package a81;

import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;

/* loaded from: classes5.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f1505a;

    public c(g gVar) {
        this.f1505a = gVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull t71.a cutoutSelectedEvent) {
        Intrinsics.checkNotNullParameter(cutoutSelectedEvent, "cutoutSelectedEvent");
        g gVar = this.f1505a;
        if (gVar.isBound()) {
            throw null;
        }
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull t71.g cutoutSelectedEvent) {
        Intrinsics.checkNotNullParameter(cutoutSelectedEvent, "cutoutSelectedEvent");
        g gVar = this.f1505a;
        if (gVar.isBound()) {
            throw null;
        }
    }
}
