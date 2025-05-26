package fs0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62857i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f62858j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, int i13) {
        super(1);
        this.f62857i = i13;
        this.f62858j = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k kVar = this.f62858j;
        int i13 = this.f62857i;
        switch (i13) {
            case 0:
                kVar.getClass();
                kVar.f62863g.d(new jc0.s(true, 0));
                gb2.f fVar = gb2.f.f64747a;
                gb2.f.c(new gb2.i(kVar.f62859c, wa2.p.STATE_HIDDEN_CREATOR, wa2.o.BOTH));
                break;
            case 1:
                switch (i13) {
                    case 1:
                        kVar.F3();
                        break;
                    default:
                        kVar.F3();
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 1:
                        kVar.F3();
                        break;
                    default:
                        kVar.F3();
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
