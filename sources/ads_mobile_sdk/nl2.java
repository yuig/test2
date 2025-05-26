package ads_mobile_sdk;

import a.f2;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes2.dex */
public final class nl2 implements com.google.common.util.concurrent.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ol2 f8862a;

    public nl2(ol2 ol2Var) {
        this.f8862a = ol2Var;
    }

    @Override // com.google.common.util.concurrent.w
    public final void onFailure(Throwable th3) {
    }

    @Override // com.google.common.util.concurrent.w
    public final void onSuccess(Object obj) {
        int i13;
        f2 f2Var = (f2) obj;
        x71 x71Var = (x71) this.f8862a.f9361c;
        synchronized (x71Var.f13529l) {
            a.u6 u6Var = x71Var.f13532o;
            String b13 = f2Var.b();
            u6Var.b();
            l4 l4Var = (l4) u6Var.f10110b;
            l4Var.getClass();
            b13.getClass();
            i13 = l4Var.bitField0_;
            l4Var.bitField0_ = i13 | RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
            l4Var.adshieldVersion_ = b13;
        }
    }
}
