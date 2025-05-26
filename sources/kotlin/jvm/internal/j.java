package kotlin.jvm.internal;

import am2.c1;
import ao2.a2;
import ao2.b2;
import ao2.c2;
import ao2.d2;
import ao2.f1;
import ao2.k2;
import ao2.o2;
import ao2.s0;
import ao2.t2;
import ao2.v0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.z0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import pn2.b1;
import pn2.g1;
import pn2.i1;
import pn2.t1;
import pn2.v1;
import pn2.w1;
import q5.x0;

/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a */
    public static final Object[] f80433a = new Object[0];

    public static final v1 A(pn2.b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        v1 j13 = t1.j(b0Var);
        Intrinsics.checkNotNullExpressionValue(j13, "makeNullable(...)");
        return j13;
    }

    public static ym2.g B(ym2.g gVar, String str, String str2, int i13) {
        char charAt;
        char charAt2;
        Object obj;
        boolean z13 = (i13 & 4) != 0;
        if ((i13 & 8) != 0) {
            str2 = null;
        }
        if (!gVar.f139479b) {
            String c13 = gVar.c();
            Intrinsics.checkNotNullExpressionValue(c13, "getIdentifier(...)");
            if (kotlin.text.z.p(c13, str, false) && c13.length() != str.length() && ('a' > (charAt = c13.charAt(str.length())) || charAt >= '{')) {
                if (str2 != null) {
                    StringBuilder i14 = n60.o.i(str2);
                    i14.append(StringsKt.R(str, c13));
                    return ym2.g.e(i14.toString());
                }
                if (!z13) {
                    return gVar;
                }
                String R = StringsKt.R(str, c13);
                Intrinsics.checkNotNullParameter(R, "<this>");
                if (R.length() != 0 && lb.l0.I0(R, 0)) {
                    if (R.length() == 1 || !lb.l0.I0(R, 1)) {
                        Intrinsics.checkNotNullParameter(R, "<this>");
                        if (R.length() != 0 && 'A' <= (charAt2 = R.charAt(0)) && charAt2 < '[') {
                            char lowerCase = Character.toLowerCase(charAt2);
                            String substring = R.substring(1);
                            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                            R = lowerCase + substring;
                        }
                    } else {
                        Intrinsics.checkNotNullParameter(R, "<this>");
                        ql2.k it = new IntRange(0, R.length() - 1, 1).iterator();
                        while (true) {
                            if (!it.f104109c) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (!lb.l0.I0(R, ((Number) obj).intValue())) {
                                break;
                            }
                        }
                        Integer num = (Integer) obj;
                        if (num != null) {
                            int intValue = num.intValue() - 1;
                            StringBuilder sb3 = new StringBuilder();
                            String substring2 = R.substring(0, intValue);
                            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                            sb3.append(lb.l0.x1(substring2));
                            String substring3 = R.substring(intValue);
                            Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                            sb3.append(substring3);
                            R = sb3.toString();
                        } else {
                            R = lb.l0.x1(R);
                        }
                    }
                }
                if (ym2.g.f(R)) {
                    return ym2.g.e(R);
                }
            }
        }
        return null;
    }

    public static final String C(ym2.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        String b13 = gVar.b();
        Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
        if (!an2.h0.f15800a.contains(b13)) {
            int i13 = 0;
            while (true) {
                if (i13 < b13.length()) {
                    char charAt = b13.charAt(i13);
                    if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                        break;
                    }
                    i13++;
                } else if (b13.length() != 0 && Character.isJavaIdentifierStart(b13.codePointAt(0))) {
                    String b14 = gVar.b();
                    Intrinsics.checkNotNullExpressionValue(b14, "asString(...)");
                    return b14;
                }
            }
        }
        StringBuilder sb3 = new StringBuilder();
        String b15 = gVar.b();
        Intrinsics.checkNotNullExpressionValue(b15, "asString(...)");
        sb3.append("`" + b15);
        sb3.append('`');
        return sb3.toString();
    }

    public static final String D(List pathSegments) {
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        StringBuilder sb3 = new StringBuilder();
        Iterator it = pathSegments.iterator();
        while (it.hasNext()) {
            ym2.g gVar = (ym2.g) it.next();
            if (sb3.length() > 0) {
                sb3.append(".");
            }
            sb3.append(C(gVar));
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    public static final pn2.b0 E(pn2.b0 b0Var, bm2.i newAnnotations) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        return (b0Var.getAnnotations().isEmpty() && newAnnotations.isEmpty()) ? b0Var : b0Var.z0().C0(bs1.c.L1(b0Var.v0(), newAnnotations));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [pn2.v1] */
    public static final v1 F(pn2.b0 b0Var) {
        pn2.h0 h0Var;
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        v1 z03 = b0Var.z0();
        if (z03 instanceof pn2.v) {
            pn2.v vVar = (pn2.v) z03;
            pn2.h0 h0Var2 = vVar.f100850b;
            if (!h0Var2.w0().getParameters().isEmpty() && h0Var2.w0().b() != null) {
                List parameters = h0Var2.w0().getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                List list = parameters;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new pn2.m0((c1) it.next()));
                }
                h0Var2 = lb.l0.Z0(h0Var2, arrayList, null, 2);
            }
            pn2.h0 h0Var3 = vVar.f100851c;
            if (!h0Var3.w0().getParameters().isEmpty() && h0Var3.w0().b() != null) {
                List parameters2 = h0Var3.w0().getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
                List list2 = parameters2;
                ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new pn2.m0((c1) it2.next()));
                }
                h0Var3 = lb.l0.Z0(h0Var3, arrayList2, null, 2);
            }
            h0Var = pn2.g.i(h0Var2, h0Var3);
        } else {
            if (!(z03 instanceof pn2.h0)) {
                throw new NoWhenBranchMatchedException();
            }
            pn2.h0 h0Var4 = (pn2.h0) z03;
            boolean isEmpty = h0Var4.w0().getParameters().isEmpty();
            h0Var = h0Var4;
            if (!isEmpty) {
                am2.j b13 = h0Var4.w0().b();
                h0Var = h0Var4;
                if (b13 != null) {
                    List parameters3 = h0Var4.w0().getParameters();
                    Intrinsics.checkNotNullExpressionValue(parameters3, "getParameters(...)");
                    List list3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new pn2.m0((c1) it3.next()));
                    }
                    h0Var = lb.l0.Z0(h0Var4, arrayList3, null, 2);
                }
            }
        }
        return com.bumptech.glide.c.h0(h0Var, z03);
    }

    public static final String G(String lowerRendered, String lowerPrefix, String upperRendered, String upperPrefix, String foldedPrefix) {
        Intrinsics.checkNotNullParameter(lowerRendered, "lowerRendered");
        Intrinsics.checkNotNullParameter(lowerPrefix, "lowerPrefix");
        Intrinsics.checkNotNullParameter(upperRendered, "upperRendered");
        Intrinsics.checkNotNullParameter(upperPrefix, "upperPrefix");
        Intrinsics.checkNotNullParameter(foldedPrefix, "foldedPrefix");
        if (!kotlin.text.z.p(lowerRendered, lowerPrefix, false) || !kotlin.text.z.p(upperRendered, upperPrefix, false)) {
            return null;
        }
        String substring = lowerRendered.substring(lowerPrefix.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        String substring2 = upperRendered.substring(upperPrefix.length());
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        String C = a.a.C(foldedPrefix, substring);
        if (Intrinsics.d(substring, substring2)) {
            return C;
        }
        if (!L(substring, substring2)) {
            return null;
        }
        return C + '!';
    }

    public static final Object H(CoroutineContext coroutineContext, Function2 function2) {
        f1 f1Var;
        CoroutineContext a13;
        Thread currentThread = Thread.currentThread();
        kotlin.coroutines.h hVar = kotlin.coroutines.f.Ho;
        kotlin.coroutines.f fVar = (kotlin.coroutines.f) coroutineContext.get(hVar);
        if (fVar == null) {
            f1Var = o2.a();
            a13 = ao2.d0.a(kotlin.coroutines.j.f80412a, coroutineContext.plus(f1Var), true);
            ko2.f fVar2 = v0.f20219a;
            if (a13 != fVar2 && a13.get(hVar) == null) {
                a13 = a13.plus(fVar2);
            }
        } else {
            if (fVar instanceof f1) {
            }
            f1Var = (f1) o2.f20188a.get();
            a13 = ao2.d0.a(kotlin.coroutines.j.f80412a, coroutineContext, true);
            ko2.f fVar3 = v0.f20219a;
            if (a13 != fVar3 && a13.get(hVar) == null) {
                a13 = a13.plus(fVar3);
            }
        }
        ao2.h hVar2 = new ao2.h(a13, currentThread, f1Var);
        ao2.l0.DEFAULT.invoke(function2, hVar2, hVar2);
        f1 f1Var2 = hVar2.f20159e;
        if (f1Var2 != null) {
            int i13 = f1.f20146f;
            f1Var2.A(false);
        }
        while (!Thread.interrupted()) {
            try {
                long K = f1Var2 != null ? f1Var2.K() : Long.MAX_VALUE;
                if (hVar2.isCompleted()) {
                    if (f1Var2 != null) {
                        int i14 = f1.f20146f;
                        f1Var2.o(false);
                    }
                    Object b13 = b2.b(a2.f20111a.get(hVar2));
                    ao2.z zVar = b13 instanceof ao2.z ? (ao2.z) b13 : null;
                    if (zVar == null) {
                        return b13;
                    }
                    throw zVar.f20242a;
                }
                LockSupport.parkNanos(hVar2, K);
            } catch (Throwable th3) {
                if (f1Var2 != null) {
                    int i15 = f1.f20146f;
                    f1Var2.o(false);
                }
                throw th3;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        hVar2.w(interruptedException);
        throw interruptedException;
    }

    public static final Object[] J(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        int size = collection.size();
        Object[] objArr = f80433a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i13 = 0;
        while (true) {
            int i14 = i13 + 1;
            objArr2[i13] = it.next();
            if (i14 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i15 = ((i14 * 3) + 1) >>> 1;
                if (i15 <= i14) {
                    i15 = 2147483645;
                    if (i14 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i15);
                Intrinsics.checkNotNullExpressionValue(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr2, i14);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                return copyOf;
            }
            i13 = i14;
        }
    }

    public static final Object[] K(Collection collection, Object[] objArr) {
        Object[] objArr2;
        Intrinsics.checkNotNullParameter(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i13 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            Intrinsics.g(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i14 = i13 + 1;
            objArr2[i13] = it.next();
            if (i14 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i15 = ((i14 * 3) + 1) >>> 1;
                if (i15 <= i14) {
                    i15 = 2147483645;
                    if (i14 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i15);
                Intrinsics.checkNotNullExpressionValue(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i14] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i14);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                return copyOf;
            }
            i13 = i14;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r3 + '?', r4) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean L(java.lang.String r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "lower"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "upper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = ""
            java.lang.String r1 = "?"
            java.lang.String r0 = kotlin.text.z.n(r4, r1, r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r3, r0)
            if (r0 != 0) goto L50
            r0 = 0
            boolean r1 = kotlin.text.z.h(r4, r1, r0)
            if (r1 == 0) goto L37
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r2 = 63
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r4)
            if (r1 != 0) goto L50
        L37:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "("
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = ")?"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r4)
            if (r3 == 0) goto L51
        L50:
            r0 = 1
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.j.L(java.lang.String, java.lang.String):boolean");
    }

    public static final Object M(bl2.c frame, CoroutineContext coroutineContext, Function2 function2) {
        Object b13;
        CoroutineContext context = frame.getContext();
        CoroutineContext plus = !ao2.d0.b(coroutineContext) ? context.plus(coroutineContext) : ao2.d0.a(context, coroutineContext, false);
        ao2.m0.t(plus);
        if (plus == context) {
            ho2.u uVar = new ho2.u(frame, plus);
            b13 = com.bumptech.glide.c.i1(uVar, uVar, function2);
        } else {
            bl2.d dVar = kotlin.coroutines.f.Ho;
            if (Intrinsics.d(plus.get(dVar), context.get(dVar))) {
                t2 t2Var = new t2(frame, plus);
                CoroutineContext coroutineContext2 = t2Var.f20108c;
                Object c13 = ho2.y.c(coroutineContext2, null);
                try {
                    Object i13 = com.bumptech.glide.c.i1(t2Var, t2Var, function2);
                    ho2.y.a(coroutineContext2, c13);
                    b13 = i13;
                } catch (Throwable th3) {
                    ho2.y.a(coroutineContext2, c13);
                    throw th3;
                }
            } else {
                s0 s0Var = new s0(frame, plus);
                lb.l0.s1(function2, s0Var, s0Var);
                while (true) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = s0.f20203e;
                    int i14 = atomicIntegerFieldUpdater.get(s0Var);
                    if (i14 != 0) {
                        if (i14 != 2) {
                            throw new IllegalStateException("Already suspended".toString());
                        }
                        b13 = b2.b(a2.f20111a.get(s0Var));
                        if (b13 instanceof ao2.z) {
                            throw ((ao2.z) b13).f20242a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(s0Var, 0, 1)) {
                        b13 = cl2.a.COROUTINE_SUSPENDED;
                        break;
                    }
                }
            }
        }
        if (b13 == cl2.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return b13;
    }

    public static final do2.c a(uj2.q qVar) {
        return lb.l0.D(new jo2.f(qVar, null));
    }

    public static ol1.d b(pb.k kVar) {
        return new ol1.d(new uv0.a(18, kotlin.coroutines.j.f80412a, kVar), 2);
    }

    public static final i1 c(pn2.b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        return new i1(b0Var);
    }

    public static ao2.q0 d(ao2.j0 j0Var, CoroutineContext coroutineContext, Function2 function2, int i13) {
        if ((i13 & 1) != 0) {
            coroutineContext = kotlin.coroutines.j.f80412a;
        }
        ao2.l0 l0Var = ao2.l0.DEFAULT;
        CoroutineContext c13 = ao2.d0.c(j0Var, coroutineContext);
        ao2.q0 c2Var = l0Var.isLazy() ? new c2(c13, function2) : new ao2.q0(c13, true, true);
        l0Var.invoke(function2, c2Var, c2Var);
        return c2Var;
    }

    public static final Object e(Object possiblyPrimitiveType, boolean z13) {
        gn2.c cVar;
        Intrinsics.checkNotNullParameter(rm2.t.f108789c, "<this>");
        Intrinsics.checkNotNullParameter(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (!z13) {
            return possiblyPrimitiveType;
        }
        rm2.y possiblyPrimitiveType2 = (rm2.y) possiblyPrimitiveType;
        Intrinsics.checkNotNullParameter(possiblyPrimitiveType2, "possiblyPrimitiveType");
        if (!(possiblyPrimitiveType2 instanceof rm2.x) || (cVar = ((rm2.x) possiblyPrimitiveType2).f108798i) == null) {
            return possiblyPrimitiveType2;
        }
        String f13 = gn2.b.c(cVar.getWrapperFqName()).f();
        Intrinsics.checkNotNullExpressionValue(f13, "getInternalName(...)");
        return rm2.t.d(f13);
    }

    public static final boolean f(pn2.b0 b0Var, b1 b1Var, Set set) {
        if (Intrinsics.d(b0Var.w0(), b1Var)) {
            return true;
        }
        am2.j b13 = b0Var.w0().b();
        am2.k kVar = b13 instanceof am2.k ? (am2.k) b13 : null;
        List k13 = kVar != null ? kVar.k() : null;
        Iterable M0 = CollectionsKt.M0(b0Var.u0());
        if (!(M0 instanceof Collection) || !((Collection) M0).isEmpty()) {
            Iterator it = M0.iterator();
            while (true) {
                x0 x0Var = (x0) it;
                if (!x0Var.hasNext()) {
                    break;
                }
                IndexedValue indexedValue = (IndexedValue) x0Var.next();
                int i13 = indexedValue.f80349a;
                g1 g1Var = (g1) indexedValue.f80350b;
                c1 c1Var = k13 != null ? (c1) CollectionsKt.U(i13, k13) : null;
                if (c1Var == null || set == null || !set.contains(c1Var)) {
                    if (g1Var.b()) {
                        continue;
                    } else {
                        pn2.b0 type = g1Var.getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        if (f(type, b1Var, set)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final int g(pn2.b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        bm2.c a13 = b0Var.getAnnotations().a(xl2.q.f135311q);
        if (a13 == null) {
            return 0;
        }
        dn2.g gVar = (dn2.g) z0.e(xl2.r.f135325e, a13.a());
        Intrinsics.g(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((dn2.k) gVar).f55623a).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final pn2.h0 h(xl2.l r15, bm2.i r16, pn2.b0 r17, java.util.List r18, java.util.ArrayList r19, pn2.b0 r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.j.h(xl2.l, bm2.i, pn2.b0, java.util.List, java.util.ArrayList, pn2.b0, boolean):pn2.h0");
    }

    public static final i1 i(pn2.b0 type, w1 projectionKind, c1 c1Var) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(projectionKind, "projectionKind");
        if ((c1Var != null ? c1Var.r() : null) == projectionKind) {
            projectionKind = w1.INVARIANT;
        }
        return new i1(type, projectionKind);
    }

    public static final ym2.g j(pn2.b0 b0Var) {
        String str;
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        bm2.c a13 = b0Var.getAnnotations().a(xl2.q.f135312r);
        if (a13 == null) {
            return null;
        }
        Object t03 = CollectionsKt.t0(a13.a().values());
        dn2.x xVar = t03 instanceof dn2.x ? (dn2.x) t03 : null;
        if (xVar != null && (str = (String) xVar.f55623a) != null) {
            if (!ym2.g.f(str)) {
                str = null;
            }
            if (str != null) {
                return ym2.g.e(str);
            }
        }
        return null;
    }

    public static final void k(pn2.b0 b0Var, pn2.h0 h0Var, LinkedHashSet linkedHashSet, Set set) {
        am2.j b13 = b0Var.w0().b();
        if (b13 instanceof c1) {
            if (!Intrinsics.d(b0Var.w0(), h0Var.w0())) {
                linkedHashSet.add(b13);
                return;
            }
            for (pn2.b0 b0Var2 : ((c1) b13).getUpperBounds()) {
                Intrinsics.f(b0Var2);
                k(b0Var2, h0Var, linkedHashSet, set);
            }
            return;
        }
        am2.j b14 = b0Var.w0().b();
        am2.k kVar = b14 instanceof am2.k ? (am2.k) b14 : null;
        List k13 = kVar != null ? kVar.k() : null;
        int i13 = 0;
        for (g1 g1Var : b0Var.u0()) {
            int i14 = i13 + 1;
            c1 c1Var = k13 != null ? (c1) CollectionsKt.U(i13, k13) : null;
            if ((c1Var == null || set == null || !set.contains(c1Var)) && !g1Var.b() && !CollectionsKt.L(linkedHashSet, g1Var.getType().w0().b()) && !Intrinsics.d(g1Var.getType().w0(), h0Var.w0())) {
                pn2.b0 type = g1Var.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                k(type, h0Var, linkedHashSet, set);
            }
            i13 = i14;
        }
    }

    public static bm2.c l(bm2.i iVar, ym2.c fqName) {
        Object obj;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Iterator it = iVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((bm2.c) obj).c(), fqName)) {
                break;
            }
        }
        return (bm2.c) obj;
    }

    public static final xl2.l m(pn2.b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        xl2.l f13 = b0Var.w0().f();
        Intrinsics.checkNotNullExpressionValue(f13, "getBuiltIns(...)");
        return f13;
    }

    public static final List n(pn2.b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        v(b0Var);
        int g13 = g(b0Var);
        if (g13 == 0) {
            return kotlin.collections.q0.f80391a;
        }
        List subList = b0Var.u0().subList(0, g13);
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(subList, 10));
        Iterator it = subList.iterator();
        while (it.hasNext()) {
            pn2.b0 type = ((g1) it.next()).getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            arrayList.add(type);
        }
        return arrayList;
    }

    public static final yl2.l o(am2.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (!(jVar instanceof am2.g) || !xl2.l.K(jVar)) {
            return null;
        }
        ym2.e h10 = fn2.d.h(jVar);
        if (!h10.d() || h10.f139473a.isEmpty()) {
            return null;
        }
        yl2.n nVar = yl2.n.f139380c;
        ym2.c packageFqName = h10.g().e();
        Intrinsics.checkNotNullExpressionValue(packageFqName, "parent(...)");
        String className = h10.f().b();
        Intrinsics.checkNotNullExpressionValue(className, "asString(...)");
        nVar.getClass();
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(className, "className");
        yl2.m a13 = nVar.a(className, packageFqName);
        if (a13 != null) {
            return a13.f139378a;
        }
        return null;
    }

    public static final pn2.b0 p(pn2.b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        v(b0Var);
        if (b0Var.getAnnotations().a(xl2.q.f135310p) == null) {
            return null;
        }
        return ((g1) b0Var.u0().get(g(b0Var))).getType();
    }

    public static final pn2.b0 q(c1 c1Var) {
        Object obj;
        Intrinsics.checkNotNullParameter(c1Var, "<this>");
        List upperBounds = c1Var.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        upperBounds.isEmpty();
        List upperBounds2 = c1Var.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds2, "getUpperBounds(...)");
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            am2.j b13 = ((pn2.b0) next).w0().b();
            am2.g gVar = b13 instanceof am2.g ? (am2.g) b13 : null;
            if (gVar != null && gVar.c() != am2.h.INTERFACE && gVar.c() != am2.h.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        pn2.b0 b0Var = (pn2.b0) obj;
        if (b0Var != null) {
            return b0Var;
        }
        List upperBounds3 = c1Var.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds3, "getUpperBounds(...)");
        Object S = CollectionsKt.S(upperBounds3);
        Intrinsics.checkNotNullExpressionValue(S, "first(...)");
        return (pn2.b0) S;
    }

    public static final List r(pn2.b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        v(b0Var);
        List u03 = b0Var.u0();
        int g13 = g(b0Var);
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        return u03.subList(((!v(b0Var) || b0Var.getAnnotations().a(xl2.q.f135310p) == null) ? 0 : 1) + g13, u03.size() - 1);
    }

    public static boolean s(bm2.i iVar, ym2.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return iVar.a(fqName) != null;
    }

    public static final boolean t(c1 typeParameter, b1 b1Var, Set set) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        List upperBounds = typeParameter.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        List<pn2.b0> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (pn2.b0 b0Var : list) {
            Intrinsics.f(b0Var);
            if (f(b0Var, typeParameter.j().w0(), set) && (b1Var == null || Intrinsics.d(b0Var.w0(), b1Var))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean u(c1 c1Var, b1 b1Var, int i13) {
        if ((i13 & 2) != 0) {
            b1Var = null;
        }
        return t(c1Var, b1Var, null);
    }

    public static final boolean v(pn2.b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        am2.j b13 = b0Var.w0().b();
        if (b13 == null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(b13, "<this>");
        yl2.l o13 = o(b13);
        return Intrinsics.d(o13, yl2.h.f139372c) || Intrinsics.d(o13, yl2.k.f139375c);
    }

    public static final boolean w(pn2.b0 b0Var, pn2.b0 superType) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return qn2.d.f104496a.b(b0Var, superType);
    }

    public static final boolean x(pn2.b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        am2.j b13 = b0Var.w0().b();
        return Intrinsics.d(b13 != null ? o(b13) : null, yl2.k.f139375c);
    }

    public static final k2 y(ao2.j0 j0Var, CoroutineContext coroutineContext, ao2.l0 l0Var, Function2 function2) {
        CoroutineContext c13 = ao2.d0.c(j0Var, coroutineContext);
        k2 d2Var = l0Var.isLazy() ? new d2(c13, function2) : new k2(c13, true, true);
        l0Var.invoke(function2, d2Var, d2Var);
        return d2Var;
    }

    public static /* synthetic */ k2 z(ao2.j0 j0Var, CoroutineContext coroutineContext, ao2.l0 l0Var, Function2 function2, int i13) {
        if ((i13 & 1) != 0) {
            coroutineContext = kotlin.coroutines.j.f80412a;
        }
        if ((i13 & 2) != 0) {
            l0Var = ao2.l0.DEFAULT;
        }
        return y(j0Var, coroutineContext, l0Var, function2);
    }
}
