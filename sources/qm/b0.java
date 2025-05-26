package qm;

import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b0 implements nm.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final ae.s f104127a;

    /* renamed from: b, reason: collision with root package name */
    public final nm.i f104128b;

    /* renamed from: c, reason: collision with root package name */
    public final pm.h f104129c;

    /* renamed from: d, reason: collision with root package name */
    public final j f104130d;

    /* renamed from: e, reason: collision with root package name */
    public final List f104131e;

    public b0(ae.s sVar, nm.i iVar, pm.h hVar, j jVar, List list) {
        this.f104127a = sVar;
        this.f104128b = iVar;
        this.f104129c = hVar;
        this.f104130d = jVar;
        this.f104131e = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!pm.s.f100625a.a(obj, accessibleObject)) {
            throw new JsonIOException(a.a.C(sm.c.e(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    public static void c(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + sm.c.d(field) + " and " + sm.c.d(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // nm.j0
    public final nm.i0 a(nm.o oVar, TypeToken typeToken) {
        Class cls = typeToken.f33846a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        so.a aVar = sm.c.f113229a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new v();
        }
        nm.a0 J0 = dl2.b.J0(this.f104131e);
        if (J0 != nm.a0.BLOCK_ALL) {
            boolean z13 = J0 == nm.a0.BLOCK_INACCESSIBLE;
            return sm.c.f113229a.g(cls) ? new a0(cls, d(oVar, typeToken, cls, z13, true), z13) : new y(this.f104127a.f(typeToken), d(oVar, typeToken, cls, z13, false));
        }
        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + cls + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01da A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ee  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r33v0, types: [qm.b0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final qm.z d(nm.o r34, com.google.gson.reflect.TypeToken r35, java.lang.Class r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qm.b0.d(nm.o, com.google.gson.reflect.TypeToken, java.lang.Class, boolean, boolean):qm.z");
    }

    public final boolean e(Field field, boolean z13) {
        boolean z14;
        pm.h hVar = this.f104129c;
        if ((hVar.f100593b & field.getModifiers()) == 0 && ((hVar.f100592a == -1.0d || hVar.h((om.c) field.getAnnotation(om.c.class), (om.d) field.getAnnotation(om.d.class))) && !field.isSynthetic() && !hVar.c(field.getType(), z13))) {
            List list = z13 ? hVar.f100595d : hVar.f100596e;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((jb0.b) it.next()).getClass();
                    if (!field.getName().equals("_bits") && ((om.b) field.getAnnotation(om.b.class)) == null) {
                    }
                }
            }
            z14 = false;
            return !z14;
        }
        z14 = true;
        return !z14;
    }
}
