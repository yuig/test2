package c2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class e2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24662i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f24663j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f24664k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2(int i13, Object obj, Object obj2) {
        super(1);
        this.f24662i = i13;
        this.f24663j = obj;
        this.f24664k = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f24662i;
        int i14 = 0;
        Object obj2 = this.f24664k;
        Object obj3 = this.f24663j;
        switch (i13) {
            case 0:
                z3.y yVar = (z3.y) obj;
                z3.w.f(yVar, (String) obj3);
                ((z3.j) yVar).e(z3.i.f140675b, new z3.a(null, new d2((Function0) obj2, i14)));
                break;
            case 1:
                d3.h hVar = (d3.h) obj;
                float l03 = hVar.l0(n3.f25008f);
                i2.v3 v3Var = (i2.v3) obj3;
                float f13 = l03 / 2;
                d3.h.O(hVar, ((b3.w) v3Var.getValue()).f21392a, hVar.l0(n3.f25006d) - f13, 0L, 0.0f, new d3.l(l03, 0.0f, 0, 0, null, 30), RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE);
                i2.v3 v3Var2 = (i2.v3) obj2;
                if (Float.compare(((n4.e) v3Var2.getValue()).f89175a, 0) > 0) {
                    d3.h.O(hVar, ((b3.w) v3Var.getValue()).f21392a, hVar.l0(((n4.e) v3Var2.getValue()).f89175a) - f13, 0L, 0.0f, d3.k.f53660a, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE);
                }
                break;
            default:
                ((d3) obj3).f24632a.setValue(new p1.e0((p1.m1) obj2, (p1.m1) obj));
                break;
        }
        return Unit.f80348a;
    }
}
