package mm0;

import com.pinterest.feature.board.organize.d;
import kotlin.jvm.internal.Intrinsics;
import lm0.l;
import ls1.n;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sk0.g;
import sp2.k;
import u50.r;

/* loaded from: classes5.dex */
public final class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f87571a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f87572b;

    public a(c cVar, r rVar) {
        this.f87571a = cVar;
        this.f87572b = rVar;
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f87571a.f87579c.i(event);
        this.f87572b.a(new l(new g(sk0.c.ORGANIZE.getPosition())));
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f87571a.f87579c.i(event);
        this.f87572b.a(new lm0.r(event));
    }
}
