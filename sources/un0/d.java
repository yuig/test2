package un0;

import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import pg0.s;
import sp2.k;

/* loaded from: classes5.dex */
public final class d implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f122828a;

    public d(h hVar) {
        this.f122828a = hVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull s e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        h hVar = this.f122828a;
        jl0.b bVar = hVar.f122846n;
        v7 D3 = e13.f100089a.D3();
        bVar.getClass();
        if (jl0.b.b(hVar.f122833a, D3)) {
            hVar.onRecyclerRefresh();
        }
    }
}
