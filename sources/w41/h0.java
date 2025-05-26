package w41;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128010i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n0 f128011j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(n0 n0Var, int i13) {
        super(1);
        this.f128010i = i13;
        this.f128011j = n0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f128010i;
        n0 n0Var = this.f128011j;
        switch (i13) {
            case 0:
                cn1.d0 bind = (cn1.d0) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                int i14 = m60.x0.search_your_pins;
                bind.getClass();
                bind.f28172b = new u50.k0(i14);
                int i15 = n0.f128044e1;
                if (n0Var.m9()) {
                    rm1.q qVar = rm1.q.MICROPHONE;
                    int i16 = k42.f.content_description_button_voice_search;
                    String[] formatArgs = new String[0];
                    Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                    bind.f28174d = new cn1.f(new u50.k0(i16, new ArrayList(0)), qVar);
                }
                break;
            default:
                ((Number) obj).intValue();
                w wVar = new w(k51.q.f78332a);
                int i17 = n0.f128044e1;
                n0Var.n9(wVar);
                break;
        }
        return Unit.f80348a;
    }
}
