package r31;

import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;
import y42.d;

/* loaded from: classes5.dex */
public final class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f106090a;

    public a(b bVar) {
        this.f106090a = bVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull hv0.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        b bVar = this.f106090a;
        if (bVar.isBound()) {
            hv0.b bVar2 = event.f70443a;
            if (bVar2 == hv0.b.DELETED || bVar2 == hv0.b.CREATED) {
                bVar.f106093c.i2();
            }
        }
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull w51.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        b bVar = this.f106090a;
        if (bVar.isBound()) {
            bVar.f106093c.i2();
        }
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        b bVar = this.f106090a;
        if (bVar.isBound()) {
            bVar.onRecyclerRefresh();
        }
    }
}
