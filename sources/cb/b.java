package cb;

import android.app.Activity;
import db.e;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.Intrinsics;
import rl2.d;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f27262a;

    public b(ClassLoader loader, int i13) {
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(loader, "loader");
            this.f27262a = loader;
        } else {
            Intrinsics.checkNotNullParameter(loader, "loader");
            this.f27262a = loader;
        }
    }

    public final e a(Object obj, d clazz, Activity activity, gb.b consumer) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter("addWindowLayoutInfoListener", "addMethodName");
        Intrinsics.checkNotNullParameter("removeWindowLayoutInfoListener", "removeMethodName");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        db.d dVar = new db.d(clazz, consumer);
        Object newProxyInstance = Proxy.newProxyInstance(this.f27262a, new Class[]{b()}, dVar);
        Intrinsics.checkNotNullExpressionValue(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, b()).invoke(obj, activity, newProxyInstance);
        return new e(obj.getClass().getMethod("removeWindowLayoutInfoListener", b()), obj, newProxyInstance);
    }

    public final Class b() {
        Class<?> loadClass = this.f27262a.loadClass("java.util.function.Consumer");
        Intrinsics.checkNotNullExpressionValue(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}
