package nu0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f92322i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ku0.a f92323j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f92324k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(ku0.a aVar, int i13, int i14) {
        super(0);
        this.f92322i = i14;
        this.f92323j = aVar;
        this.f92324k = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ku0.a aVar = this.f92323j;
        int i13 = this.f92324k;
        int i14 = this.f92322i;
        switch (i14) {
            case 0:
                switch (i14) {
                    case 0:
                        aVar.f80895h.invoke(Integer.valueOf(i13));
                        break;
                    default:
                        aVar.f80896i.invoke(Integer.valueOf(i13));
                        break;
                }
                break;
            default:
                switch (i14) {
                    case 0:
                        aVar.f80895h.invoke(Integer.valueOf(i13));
                        break;
                    default:
                        aVar.f80896i.invoke(Integer.valueOf(i13));
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
