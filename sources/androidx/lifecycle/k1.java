package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f18656a = kotlin.collections.f0.j(Application.class, c1.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f18657b = kotlin.collections.e0.b(c1.class);

    public static final Constructor a(Class modelClass, List signature) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Constructor<?>[] constructors = modelClass.getConstructors();
        Intrinsics.checkNotNullExpressionValue(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "constructor.parameterTypes");
            List b03 = kotlin.collections.c0.b0(parameterTypes);
            if (Intrinsics.d(signature, b03)) {
                return constructor;
            }
            if (signature.size() == b03.size() && b03.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final l1 b(Class modelClass, Constructor constructor, Object... params) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            return (l1) constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e13) {
            throw new RuntimeException(a.a.h("Failed to access ", modelClass), e13);
        } catch (InstantiationException e14) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e14);
        } catch (InvocationTargetException e15) {
            throw new RuntimeException(a.a.h("An exception happened in constructor of ", modelClass), e15.getCause());
        }
    }
}
