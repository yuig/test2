package ads_mobile_sdk;

import a.j0;
import a.pd;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class xk2 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13709a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13710b;

    /* renamed from: c, reason: collision with root package name */
    public final a.m f13711c;

    /* renamed from: d, reason: collision with root package name */
    public final pd f13712d;

    /* renamed from: e, reason: collision with root package name */
    public final bs2 f13713e;

    public xk2(String str, String str2, pd pdVar, a.m mVar, bs2 bs2Var) {
        this.f13709a = str;
        this.f13710b = str2;
        this.f13712d = pdVar;
        this.f13711c = mVar;
        this.f13713e = bs2Var;
    }

    public abstract void a(Method method, pd pdVar);

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            this.f13713e.b();
            Method a13 = ((bb1) this.f13711c).a(this.f13709a, this.f13710b);
            if (a13 != null) {
                a(a13, this.f13712d);
            }
            this.f13713e.a();
            return null;
        } catch (Throwable th3) {
            try {
                this.f13713e.a(th3);
                throw th3;
            } catch (Throwable th4) {
                this.f13713e.a();
                throw th4;
            }
        }
    }
}
