package gr1;

import a.g0;
import kk2.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f65995i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f65996j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i13) {
        super(1);
        this.f65995i = i13;
        this.f65996j = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f65995i;
        d dVar = this.f65996j;
        switch (i13) {
            case 0:
                Throwable throwable = (Throwable) obj;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                dVar.getClass();
                k kVar = new k(new g0(16, throwable, dVar), 0);
                Intrinsics.checkNotNullExpressionValue(kVar, "error(...)");
                break;
            case 1:
                dVar.d(or1.e.ATTEMPT, null);
                break;
            case 2:
                dVar.d(or1.e.SUCCESS, null);
                break;
            default:
                dVar.d(or1.e.FAILURE, (Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
