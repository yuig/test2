package x02;

import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class w2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f131519i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x2 f131520j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ wy0 f131521k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w2(x2 x2Var, wy0 wy0Var, int i13) {
        super(1);
        this.f131519i = i13;
        this.f131520j = x2Var;
        this.f131521k = wy0Var;
    }

    public final void b(Throwable th3) {
        int i13 = this.f131519i;
        int i14 = 1;
        x2 x2Var = this.f131520j;
        wy0 wy0Var = this.f131521k;
        switch (i13) {
            case 0:
                x2Var.W(wy0Var);
                x2Var.k0(-1);
                break;
            case 1:
                x2Var.W(wy0Var);
                wy0 f13 = ((b60.d) x2Var.K).f();
                String uid = f13 != null ? f13.getUid() : null;
                if (uid != null) {
                    x2Var.Y(uid, new pn1.g(i14, 11));
                    break;
                }
                break;
            default:
                x2Var.W(wy0Var);
                x2Var.k0(1);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f131519i) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
