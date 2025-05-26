package bc1;

import androidx.recyclerview.widget.b2;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import m91.p;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p91.l;
import sp2.k;

/* loaded from: classes5.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f22635a;

    public b(d dVar) {
        this.f22635a = dVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull p event) {
        Intrinsics.checkNotNullParameter(event, "event");
        bd1.b bVar = bd1.b.COUNTRY_FIELD;
        String str = event.f86744a;
        d dVar = this.f22635a;
        dVar.u3(bVar, str);
        Object adapter = dVar.getAdapter();
        if (adapter != null) {
            ((b2) adapter).h();
        }
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull p91.k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        bd1.b bVar = event.f99295a;
        d dVar = this.f22635a;
        dVar.u3(bVar, event.f99296b);
        Object adapter = dVar.getAdapter();
        if (adapter != null) {
            ((b2) adapter).h();
        }
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull l event) {
        Intrinsics.checkNotNullParameter(event, "event");
        throw null;
    }
}
