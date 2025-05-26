package im2;

import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class u {

    /* renamed from: a */
    public static final am2.r f72780a;

    /* renamed from: b */
    public static final am2.r f72781b;

    /* renamed from: c */
    public static final am2.r f72782c;

    /* renamed from: d */
    public static final HashMap f72783d;

    static {
        em2.a aVar = em2.a.f59638c;
        am2.r rVar = new am2.r(aVar, 9);
        f72780a = rVar;
        em2.c cVar = em2.c.f59640c;
        am2.r rVar2 = new am2.r(cVar, 10);
        f72781b = rVar2;
        em2.b bVar = em2.b.f59639c;
        am2.r rVar3 = new am2.r(bVar, 11);
        f72782c = rVar3;
        HashMap hashMap = new HashMap();
        f72783d = hashMap;
        hashMap.put(aVar, rVar);
        hashMap.put(cVar, rVar2);
        hashMap.put(bVar, rVar3);
    }

    public static /* synthetic */ void a(int i13) {
        String str = (i13 == 5 || i13 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 5 || i13 == 6) ? 2 : 3];
        switch (i13) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i13 == 5 || i13 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i13 == 2 || i13 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i13 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i13 != 5 && i13 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String format = String.format(str, objArr);
        if (i13 != 5 && i13 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static boolean b(vb0.i iVar, am2.p pVar, am2.m mVar) {
        if (mVar == null) {
            a(1);
            throw null;
        }
        int i13 = bn2.e.f23579a;
        if (c(pVar instanceof am2.d ? bn2.e.v((am2.d) pVar) : pVar, mVar)) {
            return true;
        }
        return am2.s.f15575c.a(iVar, pVar, mVar);
    }

    public static boolean c(am2.m mVar, am2.m mVar2) {
        if (mVar == null) {
            a(2);
            throw null;
        }
        if (mVar2 == null) {
            a(3);
            throw null;
        }
        am2.i0 i0Var = (am2.i0) bn2.e.k(mVar, am2.i0.class, false);
        am2.i0 i0Var2 = (am2.i0) bn2.e.k(mVar2, am2.i0.class, false);
        return (i0Var2 == null || i0Var == null || !((dm2.k0) i0Var).f55454e.equals(((dm2.k0) i0Var2).f55454e)) ? false : true;
    }
}
