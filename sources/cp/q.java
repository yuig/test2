package cp;

import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes3.dex */
public final class q implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f52966a;

    public q(u uVar) {
        this.f52966a = uVar;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(pg0.q qVar) {
        int i13 = u.f52973h1;
        u uVar = this.f52966a;
        uVar.j9();
        uVar.f7().i(qVar);
    }
}
