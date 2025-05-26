package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class i implements rl2.d, g {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final h f80427b = new h(null);

    /* renamed from: c, reason: collision with root package name */
    public static final Map f80428c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f80429d;

    /* renamed from: e, reason: collision with root package name */
    public static final LinkedHashMap f80430e;

    /* renamed from: a, reason: collision with root package name */
    public final Class f80431a;

    static {
        List j13 = kotlin.collections.f0.j(Function0.class, Function1.class, Function2.class, kl2.l.class, kl2.m.class, kl2.n.class, kl2.o.class, kl2.p.class, kl2.q.class, kl2.r.class, kl2.a.class, kl2.b.class, ul2.g.class, kl2.c.class, kl2.d.class, kl2.e.class, kl2.f.class, kl2.g.class, kl2.h.class, kl2.i.class, kl2.j.class, kl2.k.class, ul2.g.class);
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(j13, 10));
        int i13 = 0;
        for (Object obj : j13) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i13)));
            i13 = i14;
        }
        f80428c = z0.m(arrayList);
        HashMap x13 = a.a.x("boolean", "kotlin.Boolean", "char", "kotlin.Char");
        x13.put("byte", "kotlin.Byte");
        x13.put("short", "kotlin.Short");
        x13.put("int", "kotlin.Int");
        x13.put("float", "kotlin.Float");
        x13.put("long", "kotlin.Long");
        x13.put("double", "kotlin.Double");
        HashMap hashMap = new HashMap();
        hashMap.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap.put("java.lang.Character", "kotlin.Char");
        hashMap.put("java.lang.Byte", "kotlin.Byte");
        hashMap.put("java.lang.Short", "kotlin.Short");
        hashMap.put("java.lang.Integer", "kotlin.Int");
        hashMap.put("java.lang.Float", "kotlin.Float");
        hashMap.put("java.lang.Long", "kotlin.Long");
        hashMap.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Object", "kotlin.Any");
        hashMap2.put("java.lang.String", "kotlin.String");
        hashMap2.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap2.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap2.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap2.put("java.lang.Number", "kotlin.Number");
        hashMap2.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap2.put("java.lang.Enum", "kotlin.Enum");
        hashMap2.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap2.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap2.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap2.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap2.put("java.util.List", "kotlin.collections.List");
        hashMap2.put("java.util.Set", "kotlin.collections.Set");
        hashMap2.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap2.put("java.util.Map", "kotlin.collections.Map");
        hashMap2.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap2.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap2.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap2.putAll(x13);
        hashMap2.putAll(hashMap);
        Collection<String> values = x13.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb3 = new StringBuilder("kotlin.jvm.internal.");
            Intrinsics.f(str);
            sb3.append(StringsKt.b0('.', str, str));
            sb3.append("CompanionObject");
            hashMap2.put(sb3.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f80428c.entrySet()) {
            hashMap2.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f80429d = hashMap2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(y0.a(hashMap2.size()));
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, StringsKt.b0('.', str2, str2));
        }
        f80430e = linkedHashMap;
    }

    public i(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f80431a = jClass;
    }

    @Override // rl2.d
    public final boolean b(Object obj) {
        f80427b.getClass();
        Class jClass = this.f80431a;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Map map = f80428c;
        Intrinsics.g(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            return dl2.b.K1(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = lb.l0.u0(lb.l0.w0(jClass));
        }
        return jClass.isInstance(obj);
    }

    @Override // kotlin.jvm.internal.g
    public final Class c() {
        return this.f80431a;
    }

    @Override // rl2.d
    public final String e() {
        String str;
        f80427b.getClass();
        Class jClass = this.f80431a;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        String str2 = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        boolean isArray = jClass.isArray();
        HashMap hashMap = f80429d;
        if (!isArray) {
            String str3 = (String) hashMap.get(jClass.getName());
            return str3 == null ? jClass.getCanonicalName() : str3;
        }
        Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive() && (str = (String) hashMap.get(componentType.getName())) != null) {
            str2 = str.concat("Array");
        }
        return str2 == null ? "kotlin.Array" : str2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i) && Intrinsics.d(lb.l0.u0(this), lb.l0.u0((rl2.d) obj));
    }

    @Override // rl2.d
    public final String f() {
        String str;
        f80427b.getClass();
        Class jClass = this.f80431a;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        String str2 = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            boolean isArray = jClass.isArray();
            LinkedHashMap linkedHashMap = f80430e;
            if (!isArray) {
                String str3 = (String) linkedHashMap.get(jClass.getName());
                return str3 == null ? jClass.getSimpleName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            return str2 == null ? "Array" : str2;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            String a03 = StringsKt.a0(simpleName, enclosingMethod.getName() + '$', simpleName);
            if (a03 != null) {
                return a03;
            }
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return StringsKt.Z('$', simpleName, simpleName);
        }
        return StringsKt.a0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final int hashCode() {
        return lb.l0.u0(this).hashCode();
    }

    public final String toString() {
        return this.f80431a.toString() + " (Kotlin reflection is not available)";
    }
}
