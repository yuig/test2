package ue;

import android.util.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;

/* loaded from: classes3.dex */
public final class j implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f121957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f121958b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReentrantLock f121959c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Condition f121960d;

    public j(Object obj, j0 j0Var, ReentrantLock reentrantLock, Condition condition) {
        this.f121957a = obj;
        this.f121958b = j0Var;
        this.f121959c = reentrantLock;
        this.f121960d = condition;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objects) {
        ReentrantLock reentrantLock = this.f121959c;
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(objects, "objects");
        try {
            if (Intrinsics.d(method.getName(), "onChecksumsReady") && objects.length == 1) {
                Object obj2 = objects[0];
                if (obj2 instanceof List) {
                    for (Object obj3 : (List) obj2) {
                        if (obj3 != null) {
                            Method method2 = obj3.getClass().getMethod("getSplitName", new Class[0]);
                            Intrinsics.checkNotNullExpressionValue(method2, "c.javaClass.getMethod(\"getSplitName\")");
                            Method method3 = obj3.getClass().getMethod("getType", new Class[0]);
                            Intrinsics.checkNotNullExpressionValue(method3, "c.javaClass.getMethod(\"getType\")");
                            if (method2.invoke(obj3, new Object[0]) == null && Intrinsics.d(method3.invoke(obj3, new Object[0]), this.f121957a)) {
                                Method method4 = obj3.getClass().getMethod("getValue", new Class[0]);
                                Intrinsics.checkNotNullExpressionValue(method4, "c.javaClass.getMethod(\"getValue\")");
                                Object invoke = method4.invoke(obj3, new Object[0]);
                                if (invoke == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                                }
                                this.f121958b.f80434a = new BigInteger(1, (byte[]) invoke).toString(16);
                                reentrantLock.lock();
                                try {
                                    this.f121960d.signalAll();
                                    return null;
                                } finally {
                                    reentrantLock.unlock();
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            Log.d(k.f121961a, "Can't fetch checksum.", th3);
        }
        return null;
    }
}
