package dg;

import com.github.mustachejava.MustacheException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class h extends e {

    /* renamed from: d, reason: collision with root package name */
    public final int f54918d;

    /* renamed from: e, reason: collision with root package name */
    public final gg.d[] f54919e;

    /* renamed from: f, reason: collision with root package name */
    public final ve.h f54920f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f54921g;

    /* renamed from: h, reason: collision with root package name */
    public final Field f54922h;

    /* renamed from: i, reason: collision with root package name */
    public final Object[] f54923i;

    public h(int i13, gg.d[] dVarArr, a[] aVarArr, AccessibleObject accessibleObject, Object[] objArr, ve.h hVar) {
        super(aVarArr);
        this.f54919e = dVarArr;
        this.f54920f = hVar;
        if (accessibleObject instanceof Field) {
            this.f54921g = null;
            this.f54922h = (Field) accessibleObject;
        } else {
            this.f54921g = (Method) accessibleObject;
            this.f54922h = null;
        }
        this.f54923i = objArr;
        this.f54918d = i13;
    }

    public static String c(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.getClass().getCanonicalName() + '@' + obj.hashCode();
    }

    public static String d(int i13, List list) {
        if (list == null || list.size() == 0 || i13 < 0) {
            return "";
        }
        StringBuilder sb3 = new StringBuilder();
        for (int i14 = 0; i14 <= i13 && i14 < list.size(); i14++) {
            if (sb3.length() > 0) {
                sb3.append(",");
            }
            sb3.append(c(list.get(i14)));
        }
        return sb3.toString();
    }

    @Override // dg.e, gg.d
    public final Object a(List list) {
        b(list);
        int i13 = this.f54918d;
        ve.h hVar = this.f54920f;
        gg.d[] dVarArr = this.f54919e;
        Object n03 = (dVarArr == null || dVarArr.length == 0) ? list.get(i13) : g.n0(hVar, i13, dVarArr, list);
        hVar.getClass();
        Object c13 = ve.h.c(n03);
        if (c13 == null) {
            return null;
        }
        try {
            Method method = this.f54921g;
            return method == null ? this.f54922h.get(c13) : method.invoke(c13, this.f54923i);
        } catch (IllegalAccessException e13) {
            e = e13;
            throw new MustacheException("Error accessing " + e() + " on " + c(c13) + ", scope: [" + d(i13, list) + "], guards: " + Arrays.toString(this.f54912a), e);
        } catch (IllegalArgumentException e14) {
            e = e14;
            throw new MustacheException("Error accessing " + e() + " on " + c(c13) + ", scope: [" + d(i13, list) + "], guards: " + Arrays.toString(this.f54912a), e);
        } catch (InvocationTargetException e15) {
            throw new MustacheException("Error invoking " + e() + " on " + c(c13), e15.getTargetException());
        } catch (Exception e16) {
            throw new MustacheException("Error invoking " + e() + " on " + c(c13), e16);
        }
    }

    public final String e() {
        Object[] objArr = this.f54923i;
        List emptyList = objArr == null ? Collections.emptyList() : Arrays.asList(objArr);
        Method method = this.f54921g;
        if (method == null) {
            StringBuilder sb3 = new StringBuilder("field ");
            Field field = this.f54922h;
            sb3.append(field.getDeclaringClass());
            sb3.append(".");
            sb3.append(field.getName());
            return sb3.toString();
        }
        return "method " + method.getDeclaringClass().getCanonicalName() + "." + method.getName() + "(" + d(method.getParameterTypes().length - 1, emptyList) + ")";
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        Field field = this.f54922h;
        if (field == null) {
            sb3.append(this.f54921g.toString());
            Object[] objArr = this.f54923i;
            if (objArr != null) {
                for (Object obj : objArr) {
                    sb3.append(",");
                    sb3.append(obj);
                }
            }
        } else {
            sb3.append(field);
        }
        return sb3.toString();
    }
}
