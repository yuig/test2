package sp2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.EventBusException;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f114949a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final n[] f114950b = new n[4];

    public static ArrayList b(n nVar) {
        ArrayList arrayList = new ArrayList(nVar.f114943a);
        nVar.f114943a.clear();
        nVar.f114944b.clear();
        nVar.f114945c.clear();
        int i13 = 0;
        nVar.f114946d.setLength(0);
        nVar.f114947e = null;
        nVar.f114948f = false;
        synchronized (f114950b) {
            while (true) {
                if (i13 >= 4) {
                    break;
                }
                try {
                    n[] nVarArr = f114950b;
                    if (nVarArr[i13] == null) {
                        nVarArr[i13] = nVar;
                        break;
                    }
                    i13++;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return arrayList;
    }

    public static n c() {
        synchronized (f114950b) {
            for (int i13 = 0; i13 < 4; i13++) {
                try {
                    n[] nVarArr = f114950b;
                    n nVar = nVarArr[i13];
                    if (nVar != null) {
                        nVarArr[i13] = null;
                        return nVar;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return new n();
        }
    }

    public final void a(n nVar) {
        Method[] methods;
        k kVar;
        try {
            try {
                methods = nVar.f114947e.getDeclaredMethods();
            } catch (LinkageError e13) {
                throw new EventBusException(a.a.C("Could not inspect methods of ".concat(nVar.f114947e.getName()), ". Please make this class visible to EventBus annotation processor to avoid reflection."), e13);
            }
        } catch (Throwable unused) {
            methods = nVar.f114947e.getMethods();
            nVar.f114948f = true;
        }
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && (kVar = (k) method.getAnnotation(k.class)) != null) {
                    Class<?> cls = parameterTypes[0];
                    HashMap hashMap = nVar.f114944b;
                    Object put = hashMap.put(cls, method);
                    if (put != null) {
                        if (put instanceof Method) {
                            if (!nVar.a(cls, (Method) put)) {
                                throw new IllegalStateException();
                            }
                            hashMap.put(cls, nVar);
                        }
                        if (!nVar.a(cls, method)) {
                        }
                    }
                    nVar.f114943a.add(new m(method, cls, kVar.threadMode(), kVar.priority(), kVar.sticky()));
                }
            }
        }
    }
}
