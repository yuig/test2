package s2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110600i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f110601j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function1 f110602k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Function1 function1, Function1 function12, int i13) {
        super(1);
        this.f110600i = i13;
        this.f110601j = function1;
        this.f110602k = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13;
        switch (this.f110600i) {
            case 0:
                n nVar = (n) obj;
                synchronized (p.f110667b) {
                    i13 = p.f110669d;
                    p.f110669d = i13 + 1;
                }
                return new c(i13, nVar, this.f110601j, this.f110602k);
            default:
                this.f110601j.invoke(obj);
                this.f110602k.invoke(obj);
                return Unit.f80348a;
        }
    }
}
