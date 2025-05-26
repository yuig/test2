package ads_mobile_sdk;

import java.util.Iterator;
import java.util.Timer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class pq1 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l21 f9777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.t6 f9778b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq1(l21 l21Var, a.t6 t6Var) {
        super(0);
        this.f9777a = l21Var;
        this.f9778b = t6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        l21 l21Var = this.f9777a;
        a.t6 t6Var = this.f9778b;
        Iterator it = l21Var.f7624e.values().iterator();
        while (it.hasNext()) {
            ((a.e9) it.next()).a();
        }
        Timer timer = new Timer();
        timer.schedule(new i21(l21Var, t6Var, timer), 1000L);
        return Unit.f80348a;
    }
}
