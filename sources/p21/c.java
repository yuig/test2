package p21;

import com.pinterest.api.model.f30;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;

/* loaded from: classes5.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f98686a;

    public c(f fVar) {
        this.f98686a = fVar;
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.e pinChipEvent) {
        Intrinsics.checkNotNullParameter(pinChipEvent, "pinChipEvent");
        List list = pinChipEvent.f84688b;
        if (list != null) {
            f fVar = this.f98686a;
            if (fVar.isBound()) {
                List list2 = list;
                ArrayList arrayList = new ArrayList(g0.q(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((f30) it.next()).s5());
                }
                f30 f30Var = fVar.f98692a;
                if (arrayList.contains(f30Var != null ? f30Var.s5() : null)) {
                    fVar.f98717z = pinChipEvent.f84687a;
                }
            }
        }
    }
}
