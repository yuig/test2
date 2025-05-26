package rf1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class h implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f107751a;

    public h(p pVar) {
        this.f107751a = pVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.o0 fontLoadedEvent) {
        Intrinsics.checkNotNullParameter(fontLoadedEvent, "fontLoadedEvent");
        p pVar = this.f107751a;
        if (pVar.isBound()) {
            sf1.t tVar = (sf1.t) pVar.getView();
            String fontId = fontLoadedEvent.f100083a;
            sf1.s sVar = (sf1.s) tVar;
            sVar.getClass();
            Intrinsics.checkNotNullParameter(fontId, "fontId");
            List list = (List) sVar.A.get(fontId);
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            uj2.b0.j(fontId).k(new ic1.a(15, new sf1.m(sVar, 4))).r(tk2.e.f118017c).l(wj2.c.a()).o(new v(7, new sf1.q(list, sVar, fontId)), new v(8, sf1.c.f112521n));
        }
    }
}
