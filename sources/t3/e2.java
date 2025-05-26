package t3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class e2 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s3.a2 f115968i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x3 f115969j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function2 f115970k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f115971l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(s3.a2 a2Var, x3 x3Var, Function2 function2, int i13) {
        super(2);
        this.f115968i = a2Var;
        this.f115969j = x3Var;
        this.f115970k = function2;
        this.f115971l = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f115971l | 1);
        x3 x3Var = this.f115969j;
        Function2 function2 = this.f115970k;
        f2.a(this.f115968i, x3Var, function2, (i2.o) obj, p13);
        return Unit.f80348a;
    }
}
