package yq1;

import com.pinterest.gestalt.textfield.view.GestaltTextField;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139869i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f139870j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, int i13) {
        super(1);
        this.f139869i = i13;
        this.f139870j = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f139869i;
        k kVar = this.f139870j;
        switch (i13) {
            case 0:
                String domain = (String) obj;
                Intrinsics.checkNotNullParameter(domain, "domain");
                GestaltTextField gestaltTextField = kVar.D0;
                if (gestaltTextField == null) {
                    Intrinsics.r("userInputEt");
                    throw null;
                }
                String B0 = gestaltTextField.B0();
                String replace = StringsKt.E(B0, "@", false) ? new Regex("@(.*)").replace(B0, domain) : a.a.C(B0, domain);
                GestaltTextField gestaltTextField2 = kVar.D0;
                if (gestaltTextField2 != null) {
                    gestaltTextField2.X(new dl1.i0(replace, 10));
                    return Unit.f80348a;
                }
                Intrinsics.r("userInputEt");
                throw null;
            case 1:
                yl1.l bind = (yl1.l) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.c(vq1.d.continue_line);
                bind.f139350c = kVar.b8().c() ? fm1.c.VISIBLE : fm1.c.GONE;
                return Unit.f80348a;
            default:
                br1.l event = (br1.l) obj;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof br1.j) {
                    m60.e eVar = kVar.f139878l0;
                    if (eVar == null) {
                        Intrinsics.r("applicationInfoProvider");
                        throw null;
                    }
                    ((m60.d) eVar).g();
                } else if (event instanceof br1.k) {
                    int i14 = k.R0;
                    if (kVar.c8().f23780a == br1.f.PhaseOne) {
                        kVar.k8(br1.f0.a(kVar.c8(), br1.f.PhaseTwo, false, false, false, false, false, null, null, null, 1022));
                    }
                }
                return Unit.f80348a;
        }
    }
}
