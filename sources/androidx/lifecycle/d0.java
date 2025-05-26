package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f18609a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f18610b = new HashMap();

    public static void a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            Intrinsics.checkNotNullExpressionValue(newInstance, "{\n            constructo…tance(`object`)\n        }");
            ep.b.A(newInstance);
        } catch (IllegalAccessException e13) {
            throw new RuntimeException(e13);
        } catch (InstantiationException e14) {
            throw new RuntimeException(e14);
        } catch (InvocationTargetException e15) {
            throw new RuntimeException(e15);
        }
    }

    public static final String b(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return kotlin.text.z.n(className, ".", "_") + "_LifecycleAdapter";
    }

    public static int c(Class cls) {
        Constructor<?> constructor;
        HashMap hashMap = f18609a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i13 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r33 = cls.getPackage();
                String name = cls.getCanonicalName();
                String fullPackage = r33 != null ? r33.getName() : "";
                Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
                if (fullPackage.length() != 0) {
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    name = name.substring(fullPackage.length() + 1);
                    Intrinsics.checkNotNullExpressionValue(name, "this as java.lang.String).substring(startIndex)");
                }
                Intrinsics.checkNotNullExpressionValue(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String b13 = b(name);
                if (fullPackage.length() != 0) {
                    b13 = fullPackage + '.' + b13;
                }
                constructor = Class.forName(b13).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e13) {
                throw new RuntimeException(e13);
            }
            HashMap hashMap2 = f18610b;
            if (constructor != null) {
                hashMap2.put(cls, kotlin.collections.e0.b(constructor));
            } else if (!d.f18606c.c(cls)) {
                Class superclass = cls.getSuperclass();
                if (superclass != null && y.class.isAssignableFrom(superclass)) {
                    Intrinsics.checkNotNullExpressionValue(superclass, "superclass");
                    if (c(superclass) != 1) {
                        Object obj = hashMap2.get(superclass);
                        Intrinsics.f(obj);
                        arrayList = new ArrayList((Collection) obj);
                    }
                }
                Class<?>[] interfaces = cls.getInterfaces();
                Intrinsics.checkNotNullExpressionValue(interfaces, "klass.interfaces");
                int length = interfaces.length;
                int i14 = 0;
                while (true) {
                    if (i14 < length) {
                        Class<?> intrface = interfaces[i14];
                        if (intrface != null && y.class.isAssignableFrom(intrface)) {
                            Intrinsics.checkNotNullExpressionValue(intrface, "intrface");
                            if (c(intrface) == 1) {
                                break;
                            }
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            Object obj2 = hashMap2.get(intrface);
                            Intrinsics.f(obj2);
                            arrayList.addAll((Collection) obj2);
                        }
                        i14++;
                    } else if (arrayList != null) {
                        hashMap2.put(cls, arrayList);
                    }
                }
            }
            i13 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i13));
        return i13;
    }
}
