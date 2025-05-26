package ho2;

import java.lang.reflect.Modifier;
import lb.l0;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f69760a = 0;

    static {
        b0 b0Var = b0.f69750d;
        a(-1, Throwable.class);
        try {
            int i13 = h.f69761a;
        } catch (Throwable unused) {
            b0 b0Var2 = b0.f69750d;
        }
    }

    public static final int a(int i13, Class cls) {
        Object m13;
        l0.w0(cls);
        try {
            xk2.q qVar = xk2.s.f135225b;
            int i14 = 0;
            do {
                int length = cls.getDeclaredFields().length;
                int i15 = 0;
                for (int i16 = 0; i16 < length; i16++) {
                    if (!Modifier.isStatic(r2[i16].getModifiers())) {
                        i15++;
                    }
                }
                i14 += i15;
                cls = cls.getSuperclass();
            } while (cls != null);
            m13 = Integer.valueOf(i14);
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            m13 = ue.c.m(th3);
        }
        Object valueOf = Integer.valueOf(i13);
        xk2.q qVar3 = xk2.s.f135225b;
        if (m13 instanceof xk2.r) {
            m13 = valueOf;
        }
        return ((Number) m13).intValue();
    }
}
