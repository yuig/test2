package hc1;

import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class g implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f68715b;

    public /* synthetic */ g(i iVar, int i13) {
        this.f68714a = i13;
        this.f68715b = iVar;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f68714a;
        i this$0 = this.f68715b;
        switch (i13) {
            case 0:
                int i14 = i.f68719q0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                jc1.a aVar = this$0.f68722l0;
                if (aVar != null) {
                    aVar.p3();
                    return;
                }
                return;
            default:
                int i15 = i.f68719q0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof xn1.a) {
                    String valueOf = String.valueOf(((xn1.a) it).f135436c);
                    GestaltButton gestaltButton = this$0.f68724n0;
                    if (gestaltButton != null) {
                        gestaltButton.d(new y71.b(29, valueOf, this$0));
                        return;
                    } else {
                        Intrinsics.r("doneButton");
                        throw null;
                    }
                }
                return;
        }
    }
}
