package i11;

import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes5.dex */
public final class o implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f71031a;

    public o(q qVar) {
        this.f71031a = qVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread() {
        q qVar = this.f71031a;
        if (qVar.isBound()) {
            ((l11.j) ((f11.d) qVar.getView())).dismiss();
        }
    }
}
