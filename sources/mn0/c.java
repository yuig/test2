package mn0;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87756i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f87757j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f30 f87758k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, f30 f30Var, int i13) {
        super(1);
        this.f87756i = i13;
        this.f87757j = dVar;
        this.f87758k = f30Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f87756i;
        f30 f30Var = this.f87758k;
        d dVar = this.f87757j;
        switch (i13) {
            case 0:
                dVar.c(f30Var);
                break;
            default:
                dVar.c(f30Var);
                break;
        }
        return Unit.f80348a;
    }
}
