package k11;

import androidx.appcompat.widget.c2;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f78111a;

    public a(b bVar) {
        this.f78111a = bVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull h11.b event) {
        f30 f30Var;
        Intrinsics.checkNotNullParameter(event, "event");
        b bVar = this.f78111a;
        f30 f30Var2 = bVar.f78117f;
        if (f30Var2 == null || (f30Var = bVar.f78118g) == null) {
            return;
        }
        Intrinsics.f(f30Var);
        c2.j(bVar.f78116e, f30Var2, f30Var, bVar.f78113b);
        bVar.f78117f = null;
        bVar.f78118g = null;
    }
}
