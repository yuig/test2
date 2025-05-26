package rq;

import com.pinterest.activity.pin.view.modules.PinCloseupLegoActionButtonModule;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ts0;
import com.pinterest.api.model.wy0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PinCloseupLegoActionButtonModule f109362b;

    public /* synthetic */ l1(PinCloseupLegoActionButtonModule pinCloseupLegoActionButtonModule, int i13) {
        this.f109361a = i13;
        this.f109362b = pinCloseupLegoActionButtonModule;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        f30 pin;
        int i13 = this.f109361a;
        PinCloseupLegoActionButtonModule this$0 = this.f109362b;
        switch (i13) {
            case 0:
                int i14 = PinCloseupLegoActionButtonModule.G;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof om1.l) || (pin = this$0.getPin()) == null) {
                    return;
                }
                np0.g closeupActionController = this$0.getCloseupActionController();
                jo1.a baseFragmentType = jo1.a.RELATED_PINS;
                ArrayList additionalOverflow = this$0.f35035z;
                Object obj = null;
                if (additionalOverflow == null) {
                    Intrinsics.r("additionalOverflow");
                    throw null;
                }
                String str = this$0.f35030u;
                String str2 = this$0.B;
                np0.d dVar = (np0.d) closeupActionController;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(pin, "pin");
                Intrinsics.checkNotNullParameter(baseFragmentType, "baseFragmentType");
                Intrinsics.checkNotNullParameter(additionalOverflow, "additionalOverflow");
                wy0 f13 = ((b60.d) dVar.f91730e).f();
                List H6 = pin.H6();
                if (H6 != null) {
                    Iterator it2 = H6.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            ts0 ts0Var = (ts0) next;
                            if (f13 != null) {
                                String k13 = ts0Var.k();
                                if (k13 == null) {
                                    k13 = "";
                                }
                                if (dl2.b.S1(f13, k13)) {
                                    obj = next;
                                }
                            }
                        }
                    }
                    obj = (ts0) obj;
                }
                gs0.k.a(dVar.f91734i, pin, baseFragmentType, true, obj != null, additionalOverflow, null, false, null, null, false, str, str2, false, null, null, null, false, false, false, false, null, null, false, 8385504).showFeedBack();
                return;
            case 1:
                int i15 = PinCloseupLegoActionButtonModule.G;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.j();
                return;
            case 2:
                int i16 = PinCloseupLegoActionButtonModule.G;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.j();
                return;
            default:
                int i17 = PinCloseupLegoActionButtonModule.G;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                this$0.getClass();
                if (it.j() == r80.c.save_pinit_bt && (it instanceof xl1.a)) {
                    f30 pin2 = this$0.getPin();
                    nx.d0 viewPinalytics = this$0.getViewPinalytics();
                    if (pin2 == null || viewPinalytics == null) {
                        return;
                    }
                    np0.g.c(this$0.getCloseupActionController(), pin2, viewPinalytics, this$0.f35030u, this$0.getProductTagParentPinId(), 48);
                    return;
                }
                return;
        }
    }
}
