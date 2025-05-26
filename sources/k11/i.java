package k11;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class i extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78143i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ak2.e f78144j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(i11.c cVar, int i13) {
        super(1);
        this.f78143i = i13;
        this.f78144j = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f78143i;
        ak2.e eVar = this.f78144j;
        switch (i13) {
            case 0:
                eVar.accept((f30) obj);
                break;
            default:
                eVar.accept((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
