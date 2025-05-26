package g61;

import com.pinterest.api.model.f30;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.t3;
import kotlin.jvm.internal.Intrinsics;
import l81.l;
import m60.u;
import yk1.r;

/* loaded from: classes5.dex */
public final /* synthetic */ class c implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63724a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f63725b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f63726c;

    public /* synthetic */ c(e eVar) {
        this.f63724a = 0;
        this.f63726c = eVar;
        this.f63725b = true;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        f61.a aVar;
        int i13 = this.f63724a;
        boolean z13 = this.f63725b;
        r rVar = this.f63726c;
        switch (i13) {
            case 0:
                e this$0 = (e) rVar;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                f30 pin = this$0.f63737g;
                if (pin != null && (aVar = this$0.f63731a) != null) {
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    if (!z13) {
                        u.f85943a.d(Navigation.z0((ScreenLocation) t3.f51397c.getValue(), pin.getUid()));
                        break;
                    } else {
                        aVar.p3(pin);
                        break;
                    }
                }
                break;
            default:
                l this$02 = (l) rVar;
                int i14 = l.Q2;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    if (!z13) {
                        this$02.P7();
                        break;
                    } else {
                        i81.c cVar = this$02.f82177p1;
                        if (cVar != null) {
                            ((k81.l) cVar).R3();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ c(boolean z13, l lVar) {
        this.f63724a = 1;
        this.f63725b = z13;
        this.f63726c = lVar;
    }
}
