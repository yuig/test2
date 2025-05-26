package am2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final r f15573a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f15574b;

    /* renamed from: c, reason: collision with root package name */
    public static final r f15575c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f15576d;

    /* renamed from: e, reason: collision with root package name */
    public static final r f15577e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f15578f;

    /* renamed from: g, reason: collision with root package name */
    public static final r f15579g;

    /* renamed from: h, reason: collision with root package name */
    public static final r f15580h;

    /* renamed from: i, reason: collision with root package name */
    public static final r f15581i;

    /* renamed from: j, reason: collision with root package name */
    public static final Map f15582j;

    /* renamed from: k, reason: collision with root package name */
    public static final r f15583k;

    /* renamed from: l, reason: collision with root package name */
    public static final vb0.i f15584l;

    /* renamed from: m, reason: collision with root package name */
    public static final vb0.i f15585m;

    /* renamed from: n, reason: collision with root package name */
    public static final vb0.i f15586n;

    /* renamed from: o, reason: collision with root package name */
    public static final vn2.s f15587o;

    /* renamed from: p, reason: collision with root package name */
    public static final HashMap f15588p;

    static {
        r rVar = new r(o1.f15567c, 0);
        f15573a = rVar;
        r rVar2 = new r(p1.f15568c, 1);
        f15574b = rVar2;
        r rVar3 = new r(q1.f15570c, 2);
        f15575c = rVar3;
        r rVar4 = new r(l1.f15563c, 3);
        f15576d = rVar4;
        r rVar5 = new r(r1.f15572c, 4);
        f15577e = rVar5;
        r rVar6 = new r(n1.f15566c, 5);
        f15578f = rVar6;
        r rVar7 = new r(k1.f15560c, 6);
        f15579g = rVar7;
        r rVar8 = new r(m1.f15565c, 7);
        f15580h = rVar8;
        r rVar9 = new r(s1.f15589c, 8);
        f15581i = rVar9;
        Collections.unmodifiableSet(kotlin.collections.h1.f(rVar, rVar2, rVar4, rVar6));
        HashMap hashMap = new HashMap(6);
        hashMap.put(rVar2, 0);
        hashMap.put(rVar, 0);
        hashMap.put(rVar4, 1);
        hashMap.put(rVar3, 1);
        hashMap.put(rVar5, 2);
        f15582j = Collections.unmodifiableMap(hashMap);
        f15583k = rVar5;
        f15584l = new vb0.i(0);
        f15585m = new vb0.i(1);
        f15586n = new vb0.i(2);
        Iterator it = ServiceLoader.load(vn2.s.class, vn2.s.class.getClassLoader()).iterator();
        f15587o = it.hasNext() ? (vn2.s) it.next() : vn2.r.f126342a;
        f15588p = new HashMap();
        f(rVar);
        f(rVar2);
        f(rVar3);
        f(rVar4);
        f(rVar5);
        f(rVar6);
        f(rVar7);
        f(rVar8);
        f(rVar9);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3d
            if (r8 == r2) goto L3d
            r2 = 5
            if (r8 == r2) goto L3d
            r2 = 7
            if (r8 == r2) goto L3d
            switch(r8) {
                case 9: goto L3d;
                case 10: goto L38;
                case 11: goto L32;
                case 12: goto L38;
                case 13: goto L32;
                case 14: goto L2c;
                case 15: goto L2c;
                case 16: goto L29;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L41
        L29:
            r4[r7] = r5
            goto L41
        L2c:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L41
        L32:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L41
        L38:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L41
        L3d:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L41:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L49
            r4[r6] = r5
            goto L4b
        L49:
            r4[r6] = r2
        L4b:
            switch(r8) {
                case 2: goto L74;
                case 3: goto L74;
                case 4: goto L6f;
                case 5: goto L6f;
                case 6: goto L6a;
                case 7: goto L6a;
                case 8: goto L65;
                case 9: goto L65;
                case 10: goto L60;
                case 11: goto L60;
                case 12: goto L5b;
                case 13: goto L5b;
                case 14: goto L56;
                case 15: goto L53;
                case 16: goto L78;
                default: goto L4e;
            }
        L4e:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L78
        L53:
            r4[r3] = r2
            goto L78
        L56:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L78
        L5b:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L78
        L60:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L78
        L65:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L78
        L6a:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L78
        L6f:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L78
        L74:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L78:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L84
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L89
        L84:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L89:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: am2.s.a(int):void");
    }

    public static Integer b(q visibility, q visibility2) {
        if (visibility == null) {
            a(12);
            throw null;
        }
        if (visibility2 == null) {
            a(13);
            throw null;
        }
        Intrinsics.checkNotNullParameter(visibility2, "visibility");
        u1 u1Var = visibility.f15569a;
        u1 u1Var2 = visibility2.f15569a;
        Integer a13 = u1Var.a(u1Var2);
        if (a13 != null) {
            return a13;
        }
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Integer a14 = u1Var2.a(u1Var);
        if (a14 != null) {
            return Integer.valueOf(-a14.intValue());
        }
        return null;
    }

    public static p c(vb0.i iVar, p pVar, m mVar) {
        p c13;
        if (pVar == null) {
            a(8);
            throw null;
        }
        if (mVar == null) {
            a(9);
            throw null;
        }
        for (p pVar2 = (p) pVar.o0(); pVar2 != null && pVar2.getVisibility() != f15578f; pVar2 = (p) bn2.e.k(pVar2, p.class, true)) {
            if (!pVar2.getVisibility().a(iVar, pVar2, mVar)) {
                return pVar2;
            }
        }
        if (!(pVar instanceof dm2.w0) || (c13 = c(iVar, ((dm2.y0) ((dm2.w0) pVar)).G, mVar)) == null) {
            return null;
        }
        return c13;
    }

    public static boolean d(m mVar, m mVar2) {
        if (mVar2 == null) {
            a(7);
            throw null;
        }
        x0 g13 = bn2.e.g(mVar2);
        if (g13 != x0.Tm) {
            return g13.equals(bn2.e.g(mVar));
        }
        return false;
    }

    public static boolean e(q qVar) {
        if (qVar != null) {
            return qVar == f15573a || qVar == f15574b;
        }
        a(14);
        throw null;
    }

    public static void f(r rVar) {
        f15588p.put(rVar.f15569a, rVar);
    }

    public static q g(u1 u1Var) {
        if (u1Var == null) {
            a(15);
            throw null;
        }
        q qVar = (q) f15588p.get(u1Var);
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + u1Var);
    }
}
