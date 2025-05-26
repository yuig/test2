package yq1;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class m implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f139919a;

    public m(q qVar) {
        this.f139919a = qVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull lh0.b1 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        ao2.o1 o1Var = this.f139919a.f139954k0;
        if (o1Var != null) {
            o1Var.cancel((CancellationException) null);
        }
    }
}
