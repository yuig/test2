package x91;

import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134353i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f134354j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ wy0 f134355k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(s sVar, wy0 wy0Var, int i13) {
        super(0);
        this.f134353i = i13;
        this.f134354j = sVar;
        this.f134355k = wy0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f134353i) {
            case 0:
                m285invoke();
                break;
            default:
                m285invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m285invoke() {
        int i13 = this.f134353i;
        wy0 wy0Var = this.f134355k;
        s sVar = this.f134354j;
        switch (i13) {
            case 0:
                String g13 = dl2.b.g1(wy0Var);
                int i14 = s.L0;
                sVar.b9().f134341i.e().a(new h(g13));
                break;
            default:
                int i15 = s.L0;
                hf0.b.k(sVar.getView());
                sVar.b9().f134341i.e().a(new e(wy0Var));
                break;
        }
    }
}
