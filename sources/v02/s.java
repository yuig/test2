package v02;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class s implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f123818a;

    public s(t tVar) {
        this.f123818a = tVar;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull l02.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f123818a.D5();
    }
}
