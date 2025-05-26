package ps0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class q0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f101293a;

    public q0(r0 r0Var) {
        this.f101293a = r0Var;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.g0 removeStoryEvent) {
        Intrinsics.checkNotNullParameter(removeStoryEvent, "removeStoryEvent");
        r0 r0Var = this.f101293a;
        r0Var.getClass();
        Intrinsics.checkNotNullParameter(removeStoryEvent, "removeStoryEvent");
        r0Var.Q3(removeStoryEvent);
        r0Var.removeItem(removeStoryEvent.f100065a);
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull qg0.a removeFeedItemEvent) {
        Intrinsics.checkNotNullParameter(removeFeedItemEvent, "removeFeedItemEvent");
        r0 r0Var = this.f101293a;
        r0Var.getClass();
        Intrinsics.checkNotNullParameter(removeFeedItemEvent, "removeFeedItemEvent");
        r0Var.Q3(removeFeedItemEvent);
        String uid = removeFeedItemEvent.f103824a.getUid();
        if (pk.a0.x0(uid)) {
            return;
        }
        ArrayList arrayList = r0Var.f109906r;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            dl1.s sVar = (dl1.s) arrayList.get(i13);
            if (sVar != null && uid.equals(sVar.getUid())) {
                r0Var.removeItem(i13);
                return;
            }
        }
    }
}
