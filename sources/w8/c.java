package w8;

import c0.s0;
import d7.d0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c extends s0 {

    /* renamed from: b, reason: collision with root package name */
    public long f128235b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f128236c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f128237d;

    public static Serializable r(int i13, d0 d0Var) {
        if (i13 == 0) {
            return Double.valueOf(Double.longBitsToDouble(d0Var.s()));
        }
        if (i13 == 1) {
            return Boolean.valueOf(d0Var.y() == 1);
        }
        if (i13 == 2) {
            return t(d0Var);
        }
        if (i13 != 3) {
            if (i13 == 8) {
                return s(d0Var);
            }
            if (i13 != 10) {
                if (i13 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(d0Var.s()));
                d0Var.L(2);
                return date;
            }
            int C = d0Var.C();
            ArrayList arrayList = new ArrayList(C);
            for (int i14 = 0; i14 < C; i14++) {
                Serializable r13 = r(d0Var.y(), d0Var);
                if (r13 != null) {
                    arrayList.add(r13);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String t13 = t(d0Var);
            int y13 = d0Var.y();
            if (y13 == 9) {
                return hashMap;
            }
            Serializable r14 = r(y13, d0Var);
            if (r14 != null) {
                hashMap.put(t13, r14);
            }
        }
    }

    public static HashMap s(d0 d0Var) {
        int C = d0Var.C();
        HashMap hashMap = new HashMap(C);
        for (int i13 = 0; i13 < C; i13++) {
            String t13 = t(d0Var);
            Serializable r13 = r(d0Var.y(), d0Var);
            if (r13 != null) {
                hashMap.put(t13, r13);
            }
        }
        return hashMap;
    }

    public static String t(d0 d0Var) {
        int E = d0Var.E();
        int i13 = d0Var.f53807b;
        d0Var.L(E);
        return new String(d0Var.f53806a, i13, E);
    }

    public final boolean q(long j13, d0 d0Var) {
        if (d0Var.y() != 2 || !"onMetaData".equals(t(d0Var)) || d0Var.a() == 0 || d0Var.y() != 8) {
            return false;
        }
        HashMap s13 = s(d0Var);
        Object obj = s13.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f128235b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = s13.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f128236c = new long[size];
                this.f128237d = new long[size];
                for (int i13 = 0; i13 < size; i13++) {
                    Object obj5 = list.get(i13);
                    Object obj6 = list2.get(i13);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f128236c = new long[0];
                        this.f128237d = new long[0];
                        break;
                    }
                    this.f128236c[i13] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f128237d[i13] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }
}
