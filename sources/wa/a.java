package wa;

import android.os.Parcel;
import android.os.Parcelable;
import g1.g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final g f128607a;

    /* renamed from: b, reason: collision with root package name */
    public final g f128608b;

    /* renamed from: c, reason: collision with root package name */
    public final g f128609c;

    public a(g gVar, g gVar2, g gVar3) {
        this.f128607a = gVar;
        this.f128608b = gVar2;
        this.f128609c = gVar3;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        g gVar = this.f128609c;
        Class cls2 = (Class) gVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(a.a.l(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        gVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        g gVar = this.f128607a;
        Method method = (Method) gVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        gVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        g gVar = this.f128608b;
        Method method = (Method) gVar.get(name);
        if (method != null) {
            return method;
        }
        Class b13 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b13.getDeclaredMethod("write", cls, a.class);
        gVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i13);

    public final int f(int i13, int i14) {
        return !e(i14) ? i13 : ((b) this).f128611e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i13) {
        if (!e(i13)) {
            return parcelable;
        }
        return ((b) this).f128611e.readParcelable(b.class.getClassLoader());
    }

    public final c h() {
        String readString = ((b) this).f128611e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e13);
        } catch (IllegalAccessException e14) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e14);
        } catch (NoSuchMethodException e15) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e15);
        } catch (InvocationTargetException e16) {
            if (e16.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e16.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e16);
        }
    }

    public abstract void i(int i13);

    public final void j(int i13, int i14) {
        i(i14);
        ((b) this).f128611e.writeInt(i13);
    }

    public final void k(c cVar) {
        if (cVar == null) {
            ((b) this).f128611e.writeString(null);
            return;
        }
        try {
            ((b) this).f128611e.writeString(b(cVar.getClass()).getName());
            b a13 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a13);
                int i13 = a13.f128615i;
                if (i13 >= 0) {
                    int i14 = a13.f128610d.get(i13);
                    Parcel parcel = a13.f128611e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i14);
                    parcel.writeInt(dataPosition - i14);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e13) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e13);
            } catch (IllegalAccessException e14) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e14);
            } catch (NoSuchMethodException e15) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e15);
            } catch (InvocationTargetException e16) {
                if (!(e16.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e16);
                }
                throw ((RuntimeException) e16.getCause());
            }
        } catch (ClassNotFoundException e17) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e17);
        }
    }
}
