package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class t2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f25241i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f25242j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t2(String str, int i13) {
        super(1);
        this.f25241i = i13;
        this.f25242j = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = this.f25242j;
        int i13 = this.f25241i;
        switch (i13) {
            case 0:
                z3.y yVar = (z3.y) obj;
                switch (i13) {
                    case 0:
                        z3.w.f(yVar, str);
                        z3.w.h(yVar, 5);
                        break;
                    default:
                        rl2.u[] uVarArr = z3.w.f140760a;
                        ((z3.j) yVar).e(z3.t.E, str);
                        break;
                }
                break;
            default:
                z3.y yVar2 = (z3.y) obj;
                switch (i13) {
                    case 0:
                        z3.w.f(yVar2, str);
                        z3.w.h(yVar2, 5);
                        break;
                    default:
                        rl2.u[] uVarArr2 = z3.w.f140760a;
                        ((z3.j) yVar2).e(z3.t.E, str);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
