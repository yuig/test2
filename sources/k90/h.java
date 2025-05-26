package k90;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import h32.d4;
import h32.u0;
import kh2.r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class h implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f78760b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f30 f78761c;

    public /* synthetic */ h(k kVar, f30 f30Var, int i13) {
        this.f78759a = i13;
        this.f78760b = kVar;
        this.f78761c = f30Var;
    }

    @Override // gm1.a
    public final void h3(gm1.c event) {
        int i13 = this.f78759a;
        f30 pin = this.f78761c;
        k this$0 = this.f78760b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(pin, "$pin");
                Intrinsics.checkNotNullParameter(event, "event");
                if ((event instanceof om1.l) && event.j() == a90.c.cutout_details_overflow_button) {
                    String str = this$0.f78790x;
                    String o13 = b40.o(pin);
                    d4 d4Var = this$0.f78789w.f67081a;
                    Intrinsics.f(d4Var);
                    new l(pin, str, o13, this$0.f78768b, this$0.f78767a, d4Var, this$0.f78777k).b();
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(pin, "$pin");
                Intrinsics.checkNotNullParameter(event, "it");
                this$0.d0(pin);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(pin, "$pin");
                Intrinsics.checkNotNullParameter(event, "it");
                this$0.d0(pin);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(pin, "$pin");
                Intrinsics.checkNotNullParameter(event, "it");
                this$0.d0(pin);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(pin, "$pin");
                Intrinsics.checkNotNullParameter(event, "it");
                this$0.Z(pin);
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                f30 pin2 = this.f78761c;
                Intrinsics.checkNotNullParameter(pin2, "$pin");
                Intrinsics.checkNotNullParameter(event, "event");
                if (!r.Z0(event, this$0.f78784r)) {
                    if (r.a1(event, this$0.f78784r)) {
                        this$0.Z(pin2);
                        break;
                    }
                } else {
                    this$0.f78767a.j(this$0.f78789w, u0.SAVE_BUTTON, null, this$0.f78790x, this$0.f78771e);
                    np0.g.c(this$0.f78769c, pin2, this$0.f78767a, "pin", null, 56);
                    break;
                }
                break;
        }
    }
}
