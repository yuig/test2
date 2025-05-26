package t3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f1 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c0 f115975i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t1 f115976j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function2 f115977k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(c0 c0Var, t1 t1Var, Function2 function2) {
        super(2);
        this.f115975i = c0Var;
        this.f115976j = t1Var;
        this.f115977k = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        i2.o oVar = (i2.o) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            i2.s sVar = (i2.s) oVar;
            if (sVar.z()) {
                sVar.Q();
                return Unit.f80348a;
            }
        }
        f2.a(this.f115975i, this.f115976j, this.f115977k, oVar, 0);
        return Unit.f80348a;
    }
}
