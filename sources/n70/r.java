package n70;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f89670i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f89671j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(w wVar, int i13) {
        super(1);
        this.f89670i = i13;
        this.f89671j = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f89670i;
        w wVar = this.f89671j;
        switch (i13) {
            case 0:
                int i14 = w.f89690k1;
                wVar.k9().f89683i.e().a(new j(((gb2.i) obj).f64753a));
                break;
            default:
                List list = (List) obj;
                int i15 = w.f89690k1;
                wVar.k9().f89683i.e().a(new g(((gb2.j) ep.b.i(list, 1)).f64756a, ((gb2.j) ep.b.i(list, 1)).f64757b));
                break;
        }
        return Unit.f80348a;
    }
}
