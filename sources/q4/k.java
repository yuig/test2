package q4;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102342i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f102343j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(w wVar, int i13) {
        super(1);
        this.f102342i = i13;
        this.f102343j = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f102342i;
        w wVar = this.f102343j;
        switch (i13) {
            case 0:
                q3.x V = ((q3.x) obj).V();
                Intrinsics.f(V);
                wVar.f102377q.setValue(V);
                wVar.q();
                break;
            case 1:
                wVar.f102376p.setValue(new n4.j(((n4.j) obj).f89186a));
                wVar.s();
                break;
            default:
                Function0 function0 = (Function0) obj;
                Handler handler = wVar.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = wVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new p4.a(1, function0));
                    }
                }
                break;
        }
        return Unit.f80348a;
    }
}
