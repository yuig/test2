package nf2;

import io.embrace.android.embracesdk.internal.api.delegate.NoopEmbraceInternalInterface;
import kotlin.jvm.functions.Function0;
import xk2.q;
import xk2.r;
import xk2.s;
import xk2.v;

/* loaded from: classes4.dex */
public final class f implements k {

    /* renamed from: b, reason: collision with root package name */
    public static l f90496b;

    /* renamed from: c, reason: collision with root package name */
    public static k f90497c;

    /* renamed from: d, reason: collision with root package name */
    public static Function0 f90498d = d.f90491j;

    /* renamed from: e, reason: collision with root package name */
    public static final f f90499e = new f();

    /* renamed from: a, reason: collision with root package name */
    public final v f90500a = xk2.m.b(d.f90492k);

    public f() {
        xk2.m.b(new e(this, 0));
        xk2.m.b(new e(this, 1));
        xk2.m.b(new e(this, 2));
    }

    @Override // nf2.k
    public final g a() {
        Object m13;
        Object obj = (NoopEmbraceInternalInterface) this.f90500a.getValue();
        try {
            q qVar = s.f135225b;
            k kVar = f90497c;
            m13 = kVar != null ? kVar.a() : null;
        } catch (Throwable th3) {
            q qVar2 = s.f135225b;
            m13 = ue.c.m(th3);
        }
        Object obj2 = m13 instanceof r ? null : m13;
        if (((Boolean) f90498d.invoke()).booleanValue() && obj2 != null) {
            obj = obj2;
        }
        return (g) obj;
    }
}
