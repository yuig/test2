package da1;

import com.pinterest.api.model.ba;
import com.pinterest.api.model.v7;
import ea1.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import u50.r;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f54225i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f54226j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v7 f54227k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(r rVar, v7 v7Var, int i13) {
        super(1);
        this.f54225i = i13;
        this.f54226j = rVar;
        this.f54227k = v7Var;
    }

    public final void b(ba baVar) {
        int i13 = this.f54225i;
        r rVar = this.f54226j;
        v7 v7Var = this.f54227k;
        switch (i13) {
            case 0:
                rVar.a(new ca1.b(baVar.A(), v7Var.b1(), null));
                break;
            default:
                rVar.a(new j(v7Var, baVar));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f54225i) {
            case 0:
                b((ba) obj);
                break;
            case 1:
                v7 v7Var = this.f54227k;
                this.f54226j.a(new ca1.b(v7Var.j1(), v7Var.b1(), null));
                break;
            default:
                b((ba) obj);
                break;
        }
        return Unit.f80348a;
    }
}
