package u60;

import com.pinterest.api.model.b40;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class r implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f120801a;

    public r(s sVar) {
        this.f120801a = sVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull y42.d pinCreatedEvent) {
        Intrinsics.checkNotNullParameter(pinCreatedEvent, "pinCreatedEvent");
        s sVar = this.f120801a;
        sVar.getClass();
        if (b40.e(pinCreatedEvent.f137710a, sVar.L)) {
            sVar.k0(pinCreatedEvent.f137710a, true);
        }
    }
}
