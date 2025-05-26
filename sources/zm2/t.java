package zm2;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;

/* loaded from: classes2.dex */
public abstract class t extends c implements Serializable {
    public static Object e(Method method, Object... objArr) {
        try {
            return method.invoke(null, objArr);
        } catch (IllegalAccessException e13) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e13);
        } catch (InvocationTargetException e14) {
            Throwable cause = e14.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static s f(q qVar, t tVar, int i13, q0 q0Var, Class cls) {
        return new s(qVar, Collections.emptyList(), tVar, new r(i13, q0Var, true), cls);
    }

    public static s g(q qVar, Serializable serializable, t tVar, int i13, q0 q0Var, Class cls) {
        return new s(qVar, serializable, tVar, new r(i13, q0Var, false), cls);
    }
}
