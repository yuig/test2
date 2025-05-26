package xl0;

import com.pinterest.api.model.v7;
import df.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135250i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f135251j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i13) {
        super(1);
        this.f135250i = i13;
        this.f135251j = dVar;
    }

    public final void b(v7 v7Var) {
        int i13 = this.f135250i;
        d dVar = this.f135251j;
        switch (i13) {
            case 0:
                Intrinsics.f(v7Var);
                dVar.p3(v7Var);
                break;
            default:
                Intrinsics.f(v7Var);
                v7 v7Var2 = dVar.f135259g;
                if (v7Var2 != null && j1.d1(v7Var2.getUid()) && j1.d1(v7Var.getUid()) && Intrinsics.d(v7Var2.getUid(), v7Var.getUid())) {
                    dVar.p3(v7Var);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f135250i) {
            case 0:
                b((v7) obj);
                break;
            default:
                b((v7) obj);
                break;
        }
        return Unit.f80348a;
    }
}
