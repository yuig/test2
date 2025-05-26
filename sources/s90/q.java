package s90;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f112005i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v f112006j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(v vVar, int i13) {
        super(0);
        this.f112005i = i13;
        this.f112006j = vVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        k kVar = k.f111982a;
        l lVar = l.f111990a;
        v vVar = this.f112006j;
        int i13 = this.f112005i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        int i14 = v.f112028l0;
                        vVar.b8(kVar);
                        break;
                    default:
                        int i15 = v.f112028l0;
                        vVar.b8(lVar);
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        int i16 = v.f112028l0;
                        vVar.b8(kVar);
                        break;
                    default:
                        int i17 = v.f112028l0;
                        vVar.b8(lVar);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
