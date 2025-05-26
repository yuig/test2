package cp;

import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes3.dex */
public final class d implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f52925a;

    public d(f fVar) {
        this.f52925a = fVar;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(pg0.q qVar) {
        f fVar = this.f52925a;
        fVar.V1();
        fVar.f7().i(qVar);
    }
}
