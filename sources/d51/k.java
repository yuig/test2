package d51;

import com.pinterest.api.model.wy0;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f53702i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f53703j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, int i13) {
        super(0);
        this.f53702i = i13;
        this.f53703j = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        wy0 wy0Var;
        int i13 = this.f53702i;
        l lVar = this.f53703j;
        switch (i13) {
            case 0:
                c51.e eVar = lVar.M;
                int i14 = 0;
                if (eVar != null) {
                    wy0 wy0Var2 = ((g51.n) eVar).K;
                    Integer b43 = wy0Var2 != null ? wy0Var2.b4() : null;
                    if (b43 != null) {
                        i14 = b43.intValue();
                    }
                }
                return Integer.valueOf(i14);
            default:
                c51.e eVar2 = lVar.M;
                if (eVar2 == null || (wy0Var = ((g51.n) eVar2).K) == null) {
                    return null;
                }
                return wy0Var.Q3();
        }
    }
}
