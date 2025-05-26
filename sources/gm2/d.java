package gm2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.q0;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final List f65761a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f65762b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f65763c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f65764d;

    static {
        int i13 = 0;
        Class cls = Boolean.TYPE;
        l0 l0Var = k0.f80436a;
        List j13 = kotlin.collections.f0.j(l0Var.b(cls), l0Var.b(Byte.TYPE), l0Var.b(Character.TYPE), l0Var.b(Double.TYPE), l0Var.b(Float.TYPE), l0Var.b(Integer.TYPE), l0Var.b(Long.TYPE), l0Var.b(Short.TYPE));
        f65761a = j13;
        List<rl2.d> list = j13;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        for (rl2.d dVar : list) {
            arrayList.add(new Pair(lb.l0.u0(dVar), lb.l0.v0(dVar)));
        }
        f65762b = z0.m(arrayList);
        List<rl2.d> list2 = f65761a;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list2, 10));
        for (rl2.d dVar2 : list2) {
            arrayList2.add(new Pair(lb.l0.v0(dVar2), lb.l0.u0(dVar2)));
        }
        f65763c = z0.m(arrayList2);
        List j14 = kotlin.collections.f0.j(Function0.class, Function1.class, Function2.class, kl2.l.class, kl2.m.class, kl2.n.class, kl2.o.class, kl2.p.class, kl2.q.class, kl2.r.class, kl2.a.class, kl2.b.class, ul2.g.class, kl2.c.class, kl2.d.class, kl2.e.class, kl2.f.class, kl2.g.class, kl2.h.class, kl2.i.class, kl2.j.class, kl2.k.class, ul2.g.class);
        ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(j14, 10));
        for (Object obj : j14) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            arrayList3.add(new Pair((Class) obj, Integer.valueOf(i13)));
            i13 = i14;
        }
        f65764d = z0.m(arrayList3);
    }

    public static final ym2.b a(Class cls) {
        ym2.b a13;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException(a.a.h("Can't compute ClassId for primitive type: ", cls));
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException(a.a.h("Can't compute ClassId for array type: ", cls));
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            if (simpleName.length() != 0) {
                Class<?> declaringClass = cls.getDeclaringClass();
                return (declaringClass == null || (a13 = a(declaringClass)) == null) ? ym2.b.j(new ym2.c(cls.getName())) : a13.d(ym2.g.e(cls.getSimpleName()));
            }
        }
        ym2.c cVar = new ym2.c(cls.getName());
        return new ym2.b(cVar.e(), ym2.c.j(cVar.f()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final String b(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return kotlin.text.z.m(name, '.', '/');
            }
            StringBuilder sb3 = new StringBuilder("L");
            String name2 = cls.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            sb3.append(kotlin.text.z.m(name2, '.', '/'));
            sb3.append(';');
            return sb3.toString();
        }
        String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name3.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name3.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name3.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name3.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name3.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name3.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name3.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name3.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException(a.a.h("Unsupported primitive type: ", cls));
    }

    public static final List c(Type type) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return q0.f80391a;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return yn2.c0.t(yn2.c0.m(yn2.x.e(type, b.f65756i), c.f65759i));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
        return kotlin.collections.c0.b0(actualTypeArguments);
    }

    public static final ClassLoader d(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Intrinsics.checkNotNullExpressionValue(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }
}
