package k90;

import com.pinterest.api.model.f30;
import dl1.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class j extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78764i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f78765j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, int i13) {
        super(1);
        this.f78764i = i13;
        this.f78765j = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f78764i;
        k kVar = this.f78765j;
        switch (i13) {
            case 0:
                s0 s0Var = (s0) obj;
                kVar.f78788v = Integer.valueOf(s0Var.f55287c);
                boolean z13 = kVar.f78774h;
                dl1.s sVar = s0Var.f55286b;
                if (z13) {
                    kVar.T((f30) sVar);
                } else {
                    kVar.L((f30) sVar);
                }
                break;
            default:
                f30 f30Var = (f30) obj;
                Intrinsics.f(f30Var);
                kVar.g0(f30Var);
                break;
        }
        return Unit.f80348a;
    }
}
