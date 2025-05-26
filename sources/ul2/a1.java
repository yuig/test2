package ul2;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;

/* loaded from: classes4.dex */
public final class a1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122485i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b1 f122486j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(b1 b1Var, int i13) {
        super(0);
        this.f122485i = i13;
        this.f122486j = b1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f122485i;
        b1 b1Var = this.f122486j;
        switch (i13) {
            case 0:
                return new z0(b1Var);
            default:
                Object u13 = b1Var.u();
                try {
                    Object obj = o1.f122566m;
                    Object r13 = b1Var.t() ? com.bumptech.glide.c.r(b1Var.f122570j, b1Var.n()) : null;
                    if (r13 == obj) {
                        r13 = null;
                    }
                    b1Var.t();
                    AccessibleObject accessibleObject = u13 instanceof AccessibleObject ? (AccessibleObject) u13 : null;
                    if (accessibleObject != null) {
                        accessibleObject.setAccessible(kh2.r.V0(b1Var));
                    }
                    if (u13 == null) {
                        return null;
                    }
                    if (u13 instanceof Field) {
                        return ((Field) u13).get(r13);
                    }
                    if (!(u13 instanceof Method)) {
                        throw new AssertionError("delegate field/method " + u13 + " neither field nor method");
                    }
                    int length = ((Method) u13).getParameterTypes().length;
                    if (length == 0) {
                        return ((Method) u13).invoke(null, new Object[0]);
                    }
                    if (length == 1) {
                        Method method = (Method) u13;
                        Object[] objArr = new Object[1];
                        if (r13 == null) {
                            Class<?> cls = ((Method) u13).getParameterTypes()[0];
                            Intrinsics.checkNotNullExpressionValue(cls, "get(...)");
                            r13 = c2.e(cls);
                        }
                        objArr[0] = r13;
                        return method.invoke(null, objArr);
                    }
                    if (length == 2) {
                        Method method2 = (Method) u13;
                        Class<?> cls2 = ((Method) u13).getParameterTypes()[1];
                        Intrinsics.checkNotNullExpressionValue(cls2, "get(...)");
                        return method2.invoke(null, r13, c2.e(cls2));
                    }
                    throw new AssertionError("delegate method " + u13 + " should take 0, 1, or 2 parameters");
                } catch (IllegalAccessException e13) {
                    throw new IllegalPropertyDelegateAccessException(e13);
                }
        }
    }
}
