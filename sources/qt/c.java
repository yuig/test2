package qt;

import com.pinterest.api.model.f30;
import cu.m;
import gb2.i;
import i32.y0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ps0.y;
import wa2.o;
import wa2.p;

/* loaded from: classes3.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f105101i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f105102j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(g gVar, int i13) {
        super(1);
        this.f105101i = i13;
        this.f105102j = gVar;
    }

    public final void b(f30 pin) {
        int i13 = this.f105101i;
        g gVar = this.f105102j;
        switch (i13) {
            case 0:
                Intrinsics.f(pin);
                gVar.v3(pin);
                break;
            default:
                Intrinsics.checkNotNullParameter(pin, "pin");
                ro1.b d2 = y.d(ro1.c.f108967f, pin, gVar.f105119i, gVar.f105122l);
                if (d2 == null || f.f105110a[d2.ordinal()] != 1) {
                    String uid = pin.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    Boolean d53 = pin.d5();
                    Intrinsics.checkNotNullExpressionValue(d53, "getIsPromoted(...)");
                    gVar.f105133w.a(gVar.f105118h.a(uid, d53.booleanValue(), y0.ANDROID_AD_CLOSEUP_AFTER_NO_ACTION, new e(1, (at.b) gVar.getView(), at.b.class, "loadExperience", "loadExperience(Lcom/pinterest/schemas/experiences/Placement;)V", 0)));
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z13;
        int i13 = this.f105101i;
        g gVar = this.f105102j;
        switch (i13) {
            case 0:
                b((f30) obj);
                return Unit.f80348a;
            case 1:
                b((f30) obj);
                return Unit.f80348a;
            case 2:
                i it = (i) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.f64755c.compareTo(o.UI_ONLY) > 0) {
                    if (Intrinsics.d(it.f64753a, gVar.f105111a)) {
                        if (it.f64754b == p.STATE_HIDDEN_WEIGHT_LOSS_AD) {
                            z13 = true;
                            return Boolean.valueOf(z13);
                        }
                    }
                }
                z13 = false;
                return Boolean.valueOf(z13);
            default:
                ((m) ((at.b) gVar.getView())).Y0();
                return Unit.f80348a;
        }
    }
}
