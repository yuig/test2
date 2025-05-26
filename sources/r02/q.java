package r02;

import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.reportFlow.feature.rvc.model.LinkedBA;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class q implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f105787a;

    public q(r rVar) {
        this.f105787a = rVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull v event) {
        Object obj;
        Intrinsics.checkNotNullParameter(event, "event");
        r rVar = this.f105787a;
        List list = rVar.f105796h0;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (Intrinsics.d(((LinkedBA) obj).f50427b, event.f105823a)) {
                        break;
                    }
                }
            }
            LinkedBA linkedBA = (LinkedBA) obj;
            if (linkedBA != null) {
                rVar.getClass();
                String str = linkedBA.f50426a;
                if (str != null) {
                    GestaltText gestaltText = rVar.f105795g0;
                    if (gestaltText == null) {
                        Intrinsics.r("spAccountSelector");
                        throw null;
                    }
                    pk.a0.p(gestaltText, str);
                }
                GestaltText gestaltText2 = rVar.f105795g0;
                if (gestaltText2 != null) {
                    gestaltText2.setText(str);
                } else {
                    Intrinsics.r("spAccountSelector");
                    throw null;
                }
            }
        }
    }
}
