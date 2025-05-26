package ha0;

import com.pinterest.api.model.b60;
import com.pinterest.api.model.f30;
import ea0.p0;
import fa0.v0;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lm0.a1;
import lm0.c1;
import u50.r;

/* loaded from: classes5.dex */
public final class i extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68384i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f68385j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f68386k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(List list, r rVar) {
        super(1);
        this.f68384i = 2;
        this.f68386k = list;
        this.f68385j = rVar;
    }

    public final void b(f30 pin) {
        int i13 = this.f68384i;
        r rVar = this.f68385j;
        List list = this.f68386k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(pin, "pin");
                rVar.a(new v0(pin, list));
                break;
            default:
                Intrinsics.checkNotNullParameter(pin, "pin");
                rVar.a(new p0(pin, list));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        switch (this.f68384i) {
            case 0:
                b((f30) obj);
                break;
            case 1:
                b((f30) obj);
                break;
            default:
                b60 b60Var = (b60) this.f68386k.get(((Number) obj).intValue());
                a1 a1Var = c1.Companion;
                Integer e13 = b60Var.e();
                Intrinsics.checkNotNullExpressionValue(e13, "getPinType(...)");
                int intValue = e13.intValue();
                a1Var.getClass();
                Iterator<E> it = c1.getEntries().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((c1) obj2).getValue() == intValue) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                c1 c1Var = (c1) obj2;
                if (c1Var == null) {
                    c1Var = c1.AllPins;
                }
                this.f68385j.a(new lm0.s(c1Var));
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(r rVar, List list, int i13) {
        super(1);
        this.f68384i = i13;
        this.f68385j = rVar;
        this.f68386k = list;
    }
}
