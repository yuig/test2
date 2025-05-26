package p90;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f99211i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f99212j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f99213k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(w wVar, int i13, int i14) {
        super(2);
        this.f99211i = i14;
        this.f99212j = wVar;
        this.f99213k = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f99213k;
        w wVar = this.f99212j;
        int i14 = this.f99211i;
        switch (i14) {
            case 0:
                i2.o oVar = (i2.o) obj;
                ((Number) obj2).intValue();
                switch (i14) {
                    case 0:
                        w.k9(wVar, oVar, i2.u.p(i13 | 1));
                        break;
                    default:
                        w.l9(wVar, oVar, i2.u.p(i13 | 1));
                        break;
                }
                break;
            default:
                i2.o oVar2 = (i2.o) obj;
                ((Number) obj2).intValue();
                switch (i14) {
                    case 0:
                        w.k9(wVar, oVar2, i2.u.p(i13 | 1));
                        break;
                    default:
                        w.l9(wVar, oVar2, i2.u.p(i13 | 1));
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
