package or1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class n extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f97272i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f97273j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d f97274k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f97275l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(i iVar, d dVar, p pVar, int i13) {
        super(1);
        this.f97272i = i13;
        this.f97273j = iVar;
        this.f97274k = dVar;
        this.f97275l = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f97272i;
        p pVar = this.f97275l;
        d dVar = this.f97274k;
        i iVar = this.f97273j;
        switch (i13) {
            case 0:
                iVar.h(e.ATTEMPT, dVar, pVar, null);
                break;
            case 1:
                iVar.h(e.SUCCESS, dVar, pVar, null);
                break;
            default:
                iVar.h(e.FAILURE, dVar, pVar, (Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
