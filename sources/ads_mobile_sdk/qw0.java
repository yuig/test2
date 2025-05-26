package ads_mobile_sdk;

import a.ja;
import ao2.j0;
import java.util.Map;

/* loaded from: classes2.dex */
public final class qw0 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f10295a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f10296b;

    public qw0(a.o8 o8Var, v81 v81Var) {
        this.f10295a = o8Var;
        this.f10296b = v81Var;
    }

    @Override // a.v7
    public final Object get() {
        return new ja((j0) this.f10295a.get(), (Map) this.f10296b.get());
    }
}
