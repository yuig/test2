package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o1 extends q1 {

    /* renamed from: c, reason: collision with root package name */
    public static o1 f18668c;

    /* renamed from: d, reason: collision with root package name */
    public static final bk.f f18669d = new bk.f();

    /* renamed from: b, reason: collision with root package name */
    public final Application f18670b;

    public o1(Application application) {
        this.f18670b = application;
    }

    @Override // androidx.lifecycle.q1, androidx.lifecycle.p1
    public final l1 b(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Application application = this.f18670b;
        if (application != null) {
            return d(modelClass, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.q1, androidx.lifecycle.p1
    public final l1 c(Class modelClass, u6.e extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (this.f18670b != null) {
            return b(modelClass);
        }
        Application application = (Application) extras.a(f18669d);
        if (application != null) {
            return d(modelClass, application);
        }
        if (a.class.isAssignableFrom(modelClass)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return kh2.r.A(modelClass);
    }

    public final l1 d(Class modelClass, Application application) {
        if (!a.class.isAssignableFrom(modelClass)) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return kh2.r.A(modelClass);
        }
        try {
            l1 l1Var = (l1) modelClass.getConstructor(Application.class).newInstance(application);
            Intrinsics.checkNotNullExpressionValue(l1Var, "{\n                try {\n…          }\n            }");
            return l1Var;
        } catch (IllegalAccessException e13) {
            throw new RuntimeException(a.a.h("Cannot create an instance of ", modelClass), e13);
        } catch (InstantiationException e14) {
            throw new RuntimeException(a.a.h("Cannot create an instance of ", modelClass), e14);
        } catch (NoSuchMethodException e15) {
            throw new RuntimeException(a.a.h("Cannot create an instance of ", modelClass), e15);
        } catch (InvocationTargetException e16) {
            throw new RuntimeException(a.a.h("Cannot create an instance of ", modelClass), e16);
        }
    }
}
