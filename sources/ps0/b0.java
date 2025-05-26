package ps0;

import com.pinterest.api.model.vh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f101247a;

    public b0(r0 r0Var) {
        this.f101247a = r0Var;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull rp.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f109048b;
        if (str != null) {
            r0 r0Var = this.f101247a;
            Iterator it = r0Var.d().iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                }
                dl1.s sVar = (dl1.s) it.next();
                if ((sVar instanceof vh) && ((vh) sVar).f42868z == z32.m0.AUTO_ORG_ClUSTER_MODULE_CAROUSEL) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 != -1) {
                Object obj = r0Var.d().get(i13);
                Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.api.model.DynamicStory");
                vh vhVar = (vh) obj;
                List list = vhVar.f42865w;
                Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!Intrinsics.d(((dl1.s) obj2).getUid(), str)) {
                        arrayList.add(obj2);
                    }
                }
                vhVar.f42865w = arrayList;
                r0Var.U3(i13, vhVar);
            }
        }
    }
}
