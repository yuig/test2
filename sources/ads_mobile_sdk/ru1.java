package ads_mobile_sdk;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class ru1 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tu1 f10805a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru1(tu1 tu1Var) {
        super(0);
        this.f10805a = tu1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        vu1 vu1Var;
        Context context = this.f10805a.f11699b;
        vu1 vu1Var2 = vu1.f12660h;
        synchronized (vu1.class) {
            try {
                if (vu1.f12660h == null) {
                    vu1.f12660h = new vu1(context);
                }
                vu1Var = vu1.f12660h;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return vu1Var;
    }
}
