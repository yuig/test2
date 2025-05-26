package sl;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements cm.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f113135b;

    public /* synthetic */ d(Object obj, int i13) {
        this.f113134a = i13;
        this.f113135b = obj;
    }

    @Override // cm.a
    public final Object get() {
        int i13 = this.f113134a;
        Object obj = this.f113135b;
        switch (i13) {
            case 0:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    }
                    throw new InvalidRegistrarException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e13) {
                    throw new InvalidRegistrarException(a.a.k("Could not instantiate ", str, "."), e13);
                } catch (InstantiationException e14) {
                    throw new InvalidRegistrarException(a.a.k("Could not instantiate ", str, "."), e14);
                } catch (NoSuchMethodException e15) {
                    throw new InvalidRegistrarException(a.a.j("Could not instantiate ", str), e15);
                } catch (InvocationTargetException e16) {
                    throw new InvalidRegistrarException(a.a.j("Could not instantiate ", str), e16);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                Object obj2 = dm.e.f55311m;
                return new em.b((nl.g) obj);
        }
    }
}
