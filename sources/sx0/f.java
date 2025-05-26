package sx0;

import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import pg0.q;
import sp2.k;

/* loaded from: classes5.dex */
public final class f implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f115623a;

    public f(g gVar) {
        this.f115623a = gVar;
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(q qVar) {
        int i13 = g.T0;
        g gVar = this.f115623a;
        gVar.V8();
        gVar.f7().i(qVar);
    }
}
