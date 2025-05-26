package u51;

import com.pinterest.api.model.f3;
import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f120627i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f120628j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, int i13) {
        super(1);
        this.f120627i = i13;
        this.f120628j = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f120627i;
        i iVar = this.f120628j;
        switch (i13) {
            case 0:
                f3 z33 = ((f30) obj).z3();
                iVar.G0 = z33 != null ? z33.getId() : null;
                return Unit.f80348a;
            default:
                Throwable th3 = (Throwable) obj;
                i92.k kVar = iVar.D0;
                if (kVar != null) {
                    kVar.i(th3.getMessage());
                    return Unit.f80348a;
                }
                Intrinsics.r("toastUtils");
                throw null;
        }
    }
}
