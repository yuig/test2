package rk0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108438i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f108439j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, int i13) {
        super(1);
        this.f108438i = i13;
        this.f108439j = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        c cVar = this.f108439j;
        int i13 = this.f108438i;
        switch (i13) {
            case 0:
                int intValue = ((Number) obj).intValue();
                switch (i13) {
                    case 0:
                        cVar.g(new sk0.g(intValue));
                        break;
                    default:
                        cVar.g(new sk0.h(intValue));
                        break;
                }
                break;
            case 1:
                int intValue2 = ((Number) obj).intValue();
                switch (i13) {
                    case 0:
                        cVar.g(new sk0.g(intValue2));
                        break;
                    default:
                        cVar.g(new sk0.h(intValue2));
                        break;
                }
                break;
            default:
                cVar.c(true);
                break;
        }
        return Unit.f80348a;
    }
}
