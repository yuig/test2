package jq1;

import com.pinterest.navigation.Navigation;
import kotlin.jvm.internal.Intrinsics;
import m60.w;

/* loaded from: classes5.dex */
public final /* synthetic */ class g implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f77483b;

    public /* synthetic */ g(n nVar, int i13) {
        this.f77482a = i13;
        this.f77483b = nVar;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f77482a;
        n this$0 = this.f77483b;
        switch (i13) {
            case 0:
                int i14 = n.H1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                iq1.e eVar = this$0.f77518y1;
                if (eVar != null) {
                    eVar.v3();
                    return;
                } else {
                    Intrinsics.r("presenter");
                    throw null;
                }
            case 1:
                int i15 = n.H1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                w f73 = this$0.f7();
                Navigation navigation = this$0.I;
                String f49940b = navigation != null ? navigation.getF49940b() : null;
                if (f49940b == null) {
                    f49940b = "";
                }
                f73.d(new lf1.c(f49940b));
                return;
            default:
                int i16 = n.H1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    if (this$0.f77501h1 != null) {
                        ca2.e.i(this$0.D9(), "navigation", hf0.b.f69003c - this$0.D9().g(), null, 4);
                        return;
                    } else {
                        Intrinsics.r("deviceInfoProvider");
                        throw null;
                    }
                }
                return;
        }
    }
}
