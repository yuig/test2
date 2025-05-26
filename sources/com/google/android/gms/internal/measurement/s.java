package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class s extends u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31633b;

    public s(int i13) {
        this.f31633b = i13;
        switch (i13) {
            case 1:
                ArrayList arrayList = this.f31656a;
                arrayList.add(g0.EQUALS);
                arrayList.add(g0.GREATER_THAN);
                arrayList.add(g0.GREATER_THAN_EQUALS);
                arrayList.add(g0.IDENTITY_EQUALS);
                arrayList.add(g0.IDENTITY_NOT_EQUALS);
                arrayList.add(g0.LESS_THAN);
                arrayList.add(g0.LESS_THAN_EQUALS);
                arrayList.add(g0.NOT_EQUALS);
                break;
            case 2:
                ArrayList arrayList2 = this.f31656a;
                arrayList2.add(g0.APPLY);
                arrayList2.add(g0.BLOCK);
                arrayList2.add(g0.BREAK);
                arrayList2.add(g0.CASE);
                arrayList2.add(g0.DEFAULT);
                arrayList2.add(g0.CONTINUE);
                arrayList2.add(g0.DEFINE_FUNCTION);
                arrayList2.add(g0.FN);
                arrayList2.add(g0.IF);
                arrayList2.add(g0.QUOTE);
                arrayList2.add(g0.RETURN);
                arrayList2.add(g0.SWITCH);
                arrayList2.add(g0.TERNARY);
                break;
            case 3:
                ArrayList arrayList3 = this.f31656a;
                arrayList3.add(g0.AND);
                arrayList3.add(g0.NOT);
                arrayList3.add(g0.OR);
                break;
            case 4:
                ArrayList arrayList4 = this.f31656a;
                arrayList4.add(g0.FOR_IN);
                arrayList4.add(g0.FOR_IN_CONST);
                arrayList4.add(g0.FOR_IN_LET);
                arrayList4.add(g0.FOR_LET);
                arrayList4.add(g0.FOR_OF);
                arrayList4.add(g0.FOR_OF_CONST);
                arrayList4.add(g0.FOR_OF_LET);
                arrayList4.add(g0.WHILE);
                break;
            case 5:
                ArrayList arrayList5 = this.f31656a;
                arrayList5.add(g0.ADD);
                arrayList5.add(g0.DIVIDE);
                arrayList5.add(g0.MODULUS);
                arrayList5.add(g0.MULTIPLY);
                arrayList5.add(g0.NEGATE);
                arrayList5.add(g0.POST_DECREMENT);
                arrayList5.add(g0.POST_INCREMENT);
                arrayList5.add(g0.PRE_DECREMENT);
                arrayList5.add(g0.PRE_INCREMENT);
                arrayList5.add(g0.SUBTRACT);
                break;
            case 6:
                break;
            case 7:
                ArrayList arrayList6 = this.f31656a;
                arrayList6.add(g0.ASSIGN);
                arrayList6.add(g0.CONST);
                arrayList6.add(g0.CREATE_ARRAY);
                arrayList6.add(g0.CREATE_OBJECT);
                arrayList6.add(g0.EXPRESSION_LIST);
                arrayList6.add(g0.GET);
                arrayList6.add(g0.GET_INDEX);
                arrayList6.add(g0.GET_PROPERTY);
                arrayList6.add(g0.NULL);
                arrayList6.add(g0.SET_PROPERTY);
                arrayList6.add(g0.TYPEOF);
                arrayList6.add(g0.UNDEFINED);
                arrayList6.add(g0.VAR);
                break;
            default:
                ArrayList arrayList7 = this.f31656a;
                arrayList7.add(g0.BITWISE_AND);
                arrayList7.add(g0.BITWISE_LEFT_SHIFT);
                arrayList7.add(g0.BITWISE_NOT);
                arrayList7.add(g0.BITWISE_OR);
                arrayList7.add(g0.BITWISE_RIGHT_SHIFT);
                arrayList7.add(g0.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList7.add(g0.BITWISE_XOR);
                break;
        }
    }

    public static n b(d0 d0Var, Iterator it, n nVar) {
        if (it != null) {
            while (it.hasNext()) {
                n O = d0Var.b((n) it.next()).O((e) nVar);
                if (O instanceof h) {
                    h hVar = (h) O;
                    if ("break".equals(hVar.f31412b)) {
                        return n.Fn;
                    }
                    if ("return".equals(hVar.f31412b)) {
                        return hVar;
                    }
                }
            }
        }
        return n.Fn;
    }

    public static o c(m.h hVar, ArrayList arrayList) {
        o0.D(g0.FN, 2, arrayList);
        n P = hVar.P((n) arrayList.get(0));
        n P2 = hVar.P((n) arrayList.get(1));
        if (!(P2 instanceof e)) {
            throw new IllegalArgumentException(a.a.j("FN requires an ArrayValue of parameter names found ", P2.getClass().getCanonicalName()));
        }
        ArrayList s13 = ((e) P2).s();
        List arrayList2 = new ArrayList();
        if (arrayList.size() > 2) {
            arrayList2 = arrayList.subList(2, arrayList.size());
        }
        return new o(P.zzf(), s13, arrayList2, hVar);
    }

    public static boolean d(n nVar, n nVar2) {
        n gVar;
        n gVar2;
        while (!nVar.getClass().equals(nVar2.getClass())) {
            if (((nVar instanceof t) || (nVar instanceof l)) && ((nVar2 instanceof t) || (nVar2 instanceof l))) {
                return true;
            }
            boolean z13 = nVar instanceof g;
            if (z13 && (nVar2 instanceof p)) {
                gVar2 = new g(nVar2.zze());
            } else {
                boolean z14 = nVar instanceof p;
                if (z14 && (nVar2 instanceof g)) {
                    gVar = new g(nVar.zze());
                } else if (nVar instanceof f) {
                    gVar = new g(nVar.zze());
                } else if (nVar2 instanceof f) {
                    gVar2 = new g(nVar2.zze());
                } else if ((z14 || z13) && (nVar2 instanceof i)) {
                    gVar2 = new p(nVar2.zzf());
                } else {
                    if (!(nVar instanceof i) || (!(nVar2 instanceof p) && !(nVar2 instanceof g))) {
                        return false;
                    }
                    gVar = new p(nVar.zzf());
                }
                nVar = gVar;
            }
            nVar2 = gVar2;
        }
        if ((nVar instanceof t) || (nVar instanceof l)) {
            return true;
        }
        return nVar instanceof g ? (Double.isNaN(nVar.zze().doubleValue()) || Double.isNaN(nVar2.zze().doubleValue()) || nVar.zze().doubleValue() != nVar2.zze().doubleValue()) ? false : true : nVar instanceof p ? nVar.zzf().equals(nVar2.zzf()) : nVar instanceof f ? nVar.zzd().equals(nVar2.zzd()) : nVar == nVar2;
    }

    public static n e(d0 d0Var, n nVar, n nVar2) {
        if (nVar instanceof Iterable) {
            return b(d0Var, ((Iterable) nVar).iterator(), nVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public static boolean f(n nVar, n nVar2) {
        if (nVar instanceof i) {
            nVar = new p(nVar.zzf());
        }
        if (nVar2 instanceof i) {
            nVar2 = new p(nVar2.zzf());
        }
        if ((nVar instanceof p) && (nVar2 instanceof p)) {
            return nVar.zzf().compareTo(nVar2.zzf()) < 0;
        }
        double doubleValue = nVar.zze().doubleValue();
        double doubleValue2 = nVar2.zze().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == -0.0d) || ((doubleValue == -0.0d && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    public static boolean g(n nVar, n nVar2) {
        if (nVar instanceof i) {
            nVar = new p(nVar.zzf());
        }
        if (nVar2 instanceof i) {
            nVar2 = new p(nVar2.zzf());
        }
        return (((nVar instanceof p) && (nVar2 instanceof p)) || !(Double.isNaN(nVar.zze().doubleValue()) || Double.isNaN(nVar2.zze().doubleValue()))) && !f(nVar2, nVar);
    }
}
