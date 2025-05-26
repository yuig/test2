package hq0;

import eq0.h;
import h32.f1;
import h32.g0;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;

/* loaded from: classes5.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f69901a;

    public b(c cVar) {
        this.f69901a = cVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        c cVar = this.f69901a;
        cVar.f69911j = true;
        cVar.getPinalytics().N(f1.VIEW, null, g0.CONVERSATION_SEND_A_PIN_RELATED_PINS_EMPTY_STATE, cVar.f69902a, false);
    }
}
