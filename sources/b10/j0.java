package b10;

import com.pinterest.api.model.qz0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import x40.bj;

/* loaded from: classes3.dex */
public final class j0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20905i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ qz0 f20906j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ bj f20907k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(qz0 qz0Var, bj bjVar, int i13) {
        super(0);
        this.f20905i = i13;
        this.f20906j = qz0Var;
        this.f20907k = bjVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        bj bjVar = this.f20907k;
        qz0 qz0Var = this.f20906j;
        int i13 = this.f20905i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        qz0Var.c(bjVar.f132062b);
                        break;
                    default:
                        qz0Var.b(bjVar.f132063c);
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        qz0Var.c(bjVar.f132062b);
                        break;
                    default:
                        qz0Var.b(bjVar.f132063c);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
