package r81;

import com.pinterest.framework.multisection.datasource.pagedlist.d0;
import com.pinterest.framework.multisection.datasource.pagedlist.y;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import sw0.x;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f106760i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f106761j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(k kVar, int i13) {
        super(1);
        this.f106760i = i13;
        this.f106761j = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f106760i;
        k kVar = this.f106761j;
        switch (i13) {
            case 0:
                kVar.f106781f.removeFirst();
                kVar.f106784i.onError((Throwable) obj);
                kVar.k();
                break;
            default:
                x xVar = (x) obj;
                kVar.f106784i.c(new wt1.p(xVar.f115588b));
                int size = kVar.d().size();
                List list = xVar.f115588b;
                int i14 = xVar.f115587a;
                if (i14 > size) {
                    kVar.r(new y(list, false));
                } else {
                    kVar.r(new d0(list, false));
                }
                kVar.f106782g = new d(i14 > kVar.d().size());
                break;
        }
        return Unit.f80348a;
    }
}
