package np;

import com.pinterest.activity.create.PinItActivity;
import com.pinterest.component.modal.ModalContainer;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes3.dex */
public final class o implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PinItActivity f91701a;

    public o(PinItActivity pinItActivity) {
        this.f91701a = pinItActivity;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(jc0.s sVar) {
        ModalContainer modalContainer = this.f91701a.f34926k;
        if (modalContainer != null) {
            Intrinsics.f(sVar);
            modalContainer.e(sVar);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(hf0.a aVar) {
        mo1.c.d(this.f91701a, Integer.valueOf(yy1.c.fragment_wrapper));
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(jc0.v vVar) {
        PinItActivity pinItActivity = this.f91701a;
        pinItActivity.getEventManager().i(vVar);
        ModalContainer modalContainer = pinItActivity.f34926k;
        if (modalContainer != null) {
            Intrinsics.f(modalContainer);
            Intrinsics.f(vVar);
            modalContainer.k(vVar);
        }
    }
}
