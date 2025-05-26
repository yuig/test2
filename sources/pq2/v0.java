package pq2;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* loaded from: classes4.dex */
public final class v0 extends m60.f0 {
    @Override // m60.f0
    public final String g0(int i13, Method method) {
        Parameter parameter = method.getParameters()[i13];
        if (!parameter.isNamePresent()) {
            return super.g0(i13, method);
        }
        return "parameter '" + parameter.getName() + '\'';
    }

    @Override // m60.f0
    public final Object l0(Class cls, Object obj, Method method, Object[] objArr) {
        return kg.n.e(cls, obj, method, objArr);
    }

    @Override // m60.f0
    public final boolean m0(Method method) {
        return method.isDefault();
    }
}
