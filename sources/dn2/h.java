package dn2;

import am2.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pn2.h0;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f55624a = new h();

    public final b a(List list, d0 d0Var, xl2.o oVar) {
        List F0 = CollectionsKt.F0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = F0.iterator();
        while (it.hasNext()) {
            g b13 = b(it.next(), null);
            if (b13 != null) {
                arrayList.add(b13);
            }
        }
        if (d0Var == null) {
            return new b(arrayList, new cd2.n(oVar, 14));
        }
        h0 r13 = d0Var.f().r(oVar);
        Intrinsics.checkNotNullExpressionValue(r13, "getPrimitiveArrayKotlinType(...)");
        return new y(arrayList, r13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v25, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [dn2.h] */
    public final g b(Object obj, d0 d0Var) {
        ?? r03;
        ?? r04;
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new w(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new k(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new u(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new c(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new c(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new x((String) obj);
        }
        if (obj instanceof byte[]) {
            return a(c0.W((byte[]) obj), d0Var, xl2.o.BYTE);
        }
        if (obj instanceof short[]) {
            return a(c0.c0((short[]) obj), d0Var, xl2.o.SHORT);
        }
        if (obj instanceof int[]) {
            return a(c0.Z((int[]) obj), d0Var, xl2.o.INT);
        }
        if (obj instanceof long[]) {
            return a(c0.a0((long[]) obj), d0Var, xl2.o.LONG);
        }
        int i13 = 0;
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            Intrinsics.checkNotNullParameter(cArr, "<this>");
            int length = cArr.length;
            if (length == 0) {
                r04 = q0.f80391a;
            } else if (length != 1) {
                Intrinsics.checkNotNullParameter(cArr, "<this>");
                r04 = new ArrayList(cArr.length);
                int length2 = cArr.length;
                while (i13 < length2) {
                    r04.add(Character.valueOf(cArr[i13]));
                    i13++;
                }
            } else {
                r04 = e0.b(Character.valueOf(cArr[0]));
            }
            return a(r04, d0Var, xl2.o.CHAR);
        }
        if (obj instanceof float[]) {
            return a(c0.Y((float[]) obj), d0Var, xl2.o.FLOAT);
        }
        if (obj instanceof double[]) {
            return a(c0.X((double[]) obj), d0Var, xl2.o.DOUBLE);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new v();
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length3 = zArr.length;
        if (length3 == 0) {
            r03 = q0.f80391a;
        } else if (length3 != 1) {
            Intrinsics.checkNotNullParameter(zArr, "<this>");
            r03 = new ArrayList(zArr.length);
            int length4 = zArr.length;
            while (i13 < length4) {
                r03.add(Boolean.valueOf(zArr[i13]));
                i13++;
            }
        } else {
            r03 = e0.b(Boolean.valueOf(zArr[0]));
        }
        return a(r03, d0Var, xl2.o.BOOLEAN);
    }
}
