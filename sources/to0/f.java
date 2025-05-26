package to0;

import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes5.dex */
public final class f implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f118650a;

    public f(g gVar) {
        this.f118650a = gVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(b0 b0Var) {
        this.f118650a.f118652f0.stopLoading();
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(a0 a0Var) {
        this.f118650a.f118652f0.reload();
    }
}
