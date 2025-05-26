package lr;

import com.pinterest.api.model.fw;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.v7;
import com.pinterest.feature.search.results.view.g0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f84485b;

    public /* synthetic */ d(Object obj, int i13) {
        this.f84484a = i13;
        this.f84485b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f84484a;
        Object obj = this.f84485b;
        switch (i13) {
            case 0:
                y yVar = (y) obj;
                yVar.getClass();
                gw gwVar = fw.f37821a;
                String id3 = ((v7) yVar.f84569f).getId();
                gwVar.getClass();
                gw.a(id3);
                return Unit.f80348a;
            case 1:
                ((ek0.h) obj).f59201z.f68312a.clear();
                return Unit.f80348a;
            case 2:
                g0 g0Var = (g0) obj;
                int i14 = g0.f47786l;
                return ph.a.w(g0Var.getContext(), g0Var.f47789c);
            case 3:
                return (String) obj;
            default:
                xj2.c cVar = (xj2.c) ((AtomicReference) obj).getAndSet(bk2.d.INSTANCE);
                if (cVar != null) {
                    cVar.dispose();
                }
                return Unit.f80348a;
        }
    }
}
