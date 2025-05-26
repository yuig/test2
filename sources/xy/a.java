package xy;

import ey.w;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import ny.s;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;

/* loaded from: classes.dex */
public final class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f136138a;

    public a(b bVar) {
        this.f136138a = bVar;
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull w event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z13 = event.f60606a;
        b bVar = this.f136138a;
        bVar.f136139a = z13;
        bVar.f136140b = z13;
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull s event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f136138a.f136140b = event.f92538a;
    }
}
