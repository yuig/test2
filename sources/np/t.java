package np;

import com.pinterest.activity.create.RepinActivity;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes3.dex */
public final class t implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RepinActivity f91714a;

    public t(RepinActivity repinActivity) {
        this.f91714a = repinActivity;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(hf0.a aVar) {
        mo1.c.d(this.f91714a, Integer.valueOf(e02.b.fragment_wrapper));
    }
}
