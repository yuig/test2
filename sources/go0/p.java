package go0;

import com.pinterest.api.model.ln0;
import df.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f65893i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f65894j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f65895k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(s sVar, String str, int i13) {
        super(1);
        this.f65893i = i13;
        this.f65894j = sVar;
        this.f65895k = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f65893i;
        s sVar = this.f65894j;
        switch (i13) {
            case 0:
                Throwable th3 = (Throwable) obj;
                if (sVar.isBound()) {
                    ((ho0.d) ((fo0.c) sVar.getView())).setLoadState(yk1.i.LOADED);
                }
                sVar.f65921z.m(((yk1.a) sVar.A).f139224a.getString(x0.generic_error));
                Object[] objArr = {this.f65895k};
                tb0.h hVar = sVar.f65914s;
                hVar.getClass();
                hVar.h(j1.T("Failed to load pin with uid=%s", objArr));
                String message = th3.getMessage();
                if (message != null) {
                    hVar.h(message);
                }
                break;
            default:
                ln0 ln0Var = (ln0) obj;
                Intrinsics.f(ln0Var);
                ((dl1.l) sVar.f65912q).W(ln0.a(ln0Var, null, null, null, null, sVar.f65904i, this.f65895k, false, null, null, null, null, 16287));
                break;
        }
        return Unit.f80348a;
    }
}
