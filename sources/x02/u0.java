package x02;

import com.pinterest.api.model.v7;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class u0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f131496i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0 f131497j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v7 f131498k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(int i13, v7 v7Var, x0 x0Var) {
        super(1);
        this.f131496i = i13;
        this.f131497j = x0Var;
        this.f131498k = v7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        x0 x0Var = this.f131497j;
        v7 v7Var = this.f131498k;
        int i13 = this.f131496i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        x0Var.o0(-1, v7Var);
                        break;
                    default:
                        x0Var.o0(1, v7Var);
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        x0Var.o0(-1, v7Var);
                        break;
                    default:
                        x0Var.o0(1, v7Var);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
