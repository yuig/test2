package ads_mobile_sdk;

import android.os.Build;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class d4 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f4114a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f4115b;

    public d4(a.o8 o8Var, xv0 xv0Var) {
        this.f4114a = o8Var;
        this.f4115b = xv0Var;
    }

    @Override // a.v7
    public final Object get() {
        ExecutorService executorService = (ExecutorService) this.f4114a.get();
        i4 i4Var = (i4) this.f4115b.get();
        StringBuilder sb3 = new StringBuilder("Mozilla/5.0 (Linux; Android ");
        sb3.append(Build.VERSION.RELEASE);
        sb3.append("; ");
        return new xp0(i4Var.B(), a.a.p(sb3, Build.MODEL, ")"), executorService);
    }
}
