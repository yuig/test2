package ul2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class c2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ym2.c f122505a = new ym2.c("kotlin.jvm.JvmStatic");

    public static final t a(Object obj) {
        t tVar = obj instanceof t ? (t) obj : null;
        if (tVar != null) {
            return tVar;
        }
        k0 b13 = b(obj);
        return b13 != null ? b13 : c(obj);
    }

    public static final k0 b(Object obj) {
        k0 k0Var = obj instanceof k0 ? (k0) obj : null;
        if (k0Var != null) {
            return k0Var;
        }
        kotlin.jvm.internal.o oVar = obj instanceof kotlin.jvm.internal.o ? (kotlin.jvm.internal.o) obj : null;
        rl2.c compute = oVar != null ? oVar.compute() : null;
        if (compute instanceof k0) {
            return (k0) compute;
        }
        return null;
    }

    public static final o1 c(Object obj) {
        o1 o1Var = obj instanceof o1 ? (o1) obj : null;
        if (o1Var != null) {
            return o1Var;
        }
        kotlin.jvm.internal.e0 e0Var = obj instanceof kotlin.jvm.internal.e0 ? (kotlin.jvm.internal.e0) obj : null;
        rl2.c compute = e0Var != null ? e0Var.compute() : null;
        if (compute instanceof o1) {
            return (o1) compute;
        }
        return null;
    }

    public static final ArrayList d(bm2.a aVar) {
        List b13;
        Annotation j13;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        bm2.i<bm2.c> annotations = aVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (bm2.c cVar : annotations) {
            am2.w0 b14 = cVar.b();
            if (b14 instanceof fm2.a) {
                j13 = ((fm2.a) b14).f62574b;
            } else if (b14 instanceof fm2.h) {
                gm2.u uVar = ((fm2.h) b14).f62585b;
                gm2.e eVar = uVar instanceof gm2.e ? (gm2.e) uVar : null;
                j13 = eVar != null ? eVar.f65765a : null;
            } else {
                j13 = j(cVar);
            }
            if (j13 != null) {
                arrayList.add(j13);
            }
        }
        if (arrayList.isEmpty()) {
            return arrayList;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d(lb.l0.t0(lb.l0.m0((Annotation) it.next())).getSimpleName(), "Container")) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Annotation annotation = (Annotation) it2.next();
                    Class t03 = lb.l0.t0(lb.l0.m0(annotation));
                    if (!Intrinsics.d(t03.getSimpleName(), "Container") || t03.getAnnotation(kotlin.jvm.internal.m0.class) == null) {
                        b13 = kotlin.collections.e0.b(annotation);
                    } else {
                        Object invoke = t03.getDeclaredMethod("value", new Class[0]).invoke(annotation, new Object[0]);
                        Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                        b13 = kotlin.collections.z.d((Annotation[]) invoke);
                    }
                    kotlin.collections.k0.u(b13, arrayList2);
                }
                return arrayList2;
            }
        }
        return arrayList;
    }

    public static final Object e(Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (Intrinsics.d(type, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (Intrinsics.d(type, Character.TYPE)) {
            return (char) 0;
        }
        if (Intrinsics.d(type, Byte.TYPE)) {
            return (byte) 0;
        }
        if (Intrinsics.d(type, Short.TYPE)) {
            return (short) 0;
        }
        if (Intrinsics.d(type, Integer.TYPE)) {
            return 0;
        }
        if (Intrinsics.d(type, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (Intrinsics.d(type, Long.TYPE)) {
            return 0L;
        }
        if (Intrinsics.d(type, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (Intrinsics.d(type, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final am2.b f(Class moduleAnchor, zm2.q proto, vm2.f nameResolver, vm2.i typeTable, vm2.a metadataVersion, Function2 createDescriptor) {
        List list;
        Intrinsics.checkNotNullParameter(moduleAnchor, "moduleAnchor");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(createDescriptor, "createDescriptor");
        fm2.g a13 = v1.a(moduleAnchor);
        if (proto instanceof tm2.a0) {
            list = ((tm2.a0) proto).f118151i;
        } else {
            if (!(proto instanceof tm2.i0)) {
                throw new IllegalStateException(("Unsupported message: " + proto).toString());
            }
            list = ((tm2.i0) proto).f118331i;
        }
        List list2 = list;
        ln2.o oVar = a13.f62583a;
        am2.d0 d0Var = oVar.f84109b;
        vm2.j jVar = vm2.j.f126249b;
        Intrinsics.f(list2);
        return (am2.b) createDescriptor.invoke(new ln2.a0(new lb.p0(oVar, nameResolver, d0Var, typeTable, jVar, metadataVersion, null, null, list2)), proto);
    }

    public static final dm2.d g(am2.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (bVar.A() == null) {
            return null;
        }
        am2.m g13 = bVar.g();
        Intrinsics.g(g13, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((am2.g) g13).t0();
    }

    public static final boolean h(q1 q1Var) {
        Intrinsics.checkNotNullParameter(q1Var, "<this>");
        pn2.b0 b0Var = q1Var.f122585a;
        return b0Var != null && bn2.i.g(b0Var);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class i(ClassLoader classLoader, ym2.b bVar, int i13) {
        String str = zl2.d.f142106a;
        ym2.e i14 = bVar.b().i();
        Intrinsics.checkNotNullExpressionValue(i14, "toUnsafe(...)");
        ym2.b g13 = zl2.d.g(i14);
        if (g13 != null) {
            bVar = g13;
        }
        String b13 = bVar.g().b();
        Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
        String b14 = bVar.h().b();
        Intrinsics.checkNotNullExpressionValue(b14, "asString(...)");
        if (Intrinsics.d(b13, "kotlin")) {
            switch (b14.hashCode()) {
                case -901856463:
                    if (b14.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (b14.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (b14.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (b14.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (b14.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (b14.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (b14.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (b14.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (b14.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb3 = new StringBuilder();
        if (i13 > 0) {
            for (int i15 = 0; i15 < i13; i15++) {
                sb3.append("[");
            }
            sb3.append("L");
        }
        if (b13.length() > 0) {
            sb3.append(b13.concat("."));
        }
        sb3.append(kotlin.text.z.m(b14, '.', '$'));
        if (i13 > 0) {
            sb3.append(";");
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return lb.l0.z1(classLoader, sb4);
    }

    public static final Annotation j(bm2.c cVar) {
        am2.g d2 = fn2.d.d(cVar);
        Class k13 = d2 != null ? k(d2) : null;
        if (!(k13 instanceof Class)) {
            k13 = null;
        }
        if (k13 == null) {
            return null;
        }
        Set<Map.Entry> entrySet = cVar.a().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : entrySet) {
            ym2.g gVar = (ym2.g) entry.getKey();
            dn2.g gVar2 = (dn2.g) entry.getValue();
            ClassLoader classLoader = k13.getClassLoader();
            Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
            Object l13 = l(gVar2, classLoader);
            Pair pair = l13 != null ? new Pair(gVar.b(), l13) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return (Annotation) ui2.m.b(k13, kotlin.collections.z0.m(arrayList));
    }

    public static final Class k(am2.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        am2.w0 b13 = gVar.b();
        Intrinsics.checkNotNullExpressionValue(b13, "getSource(...)");
        if (b13 instanceof rm2.h0) {
            rm2.f0 f0Var = ((rm2.h0) b13).f108734b;
            Intrinsics.g(f0Var, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((fm2.c) f0Var).f62576a;
        }
        if (b13 instanceof fm2.h) {
            gm2.u uVar = ((fm2.h) b13).f62585b;
            Intrinsics.g(uVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((gm2.q) uVar).f65786a;
        }
        ym2.b f13 = fn2.d.f(gVar);
        if (f13 == null) {
            return null;
        }
        return i(gm2.d.d(gVar.getClass()), f13, 0);
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=boolean[], code=short[], for r7v17, types: [boolean[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=byte[], code=short[], for r7v19, types: [byte[]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v21, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v22, types: [float[]] */
    /* JADX WARN: Type inference failed for: r7v23, types: [long[]] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object l(dn2.g r6, java.lang.ClassLoader r7) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ul2.c2.l(dn2.g, java.lang.ClassLoader):java.lang.Object");
    }
}
