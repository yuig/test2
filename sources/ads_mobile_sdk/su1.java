package ads_mobile_sdk;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class su1 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tu1 f11243a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su1(tu1 tu1Var) {
        super(0);
        this.f11243a = tu1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        wu1 wu1Var;
        Context context = this.f11243a.f11699b;
        wu1 wu1Var2 = wu1.f13267h;
        synchronized (wu1.class) {
            try {
                if (wu1.f13267h == null) {
                    wu1.f13267h = new wu1(context);
                }
                wu1Var = wu1.f13267h;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return wu1Var;
    }
}
