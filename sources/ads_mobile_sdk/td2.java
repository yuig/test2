package ads_mobile_sdk;

import a.h4;
import a.ih;
import a.ud;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class td2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f11509a;

    /* renamed from: b, reason: collision with root package name */
    public static final a.tf f11510b;

    /* renamed from: c, reason: collision with root package name */
    public static final ih f11511c;

    static {
        Class<?> cls;
        Class<?> cls2;
        k22 k22Var = k22.f7066c;
        a.tf tfVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f11509a = cls;
        try {
            k22 k22Var2 = k22.f7066c;
            try {
                cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                tfVar = (a.tf) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            }
        } catch (Throwable unused3) {
        }
        f11510b = tfVar;
        f11511c = new ih();
    }

    public static Object a(Object obj, int i13, int i14, Object obj2, a.tf tfVar) {
        if (obj2 == null) {
            obj2 = tfVar.a(obj);
        }
        ((ih) tfVar).getClass();
        ((yv2) obj2).a(i13 << 3, Long.valueOf(i14));
        return obj2;
    }

    public static void b(int i13, List list, po poVar, a.tb tbVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        poVar.getClass();
        for (int i14 = 0; i14 < list.size(); i14++) {
            poVar.f9758a.b(i13, (a.xe) list.get(i14), tbVar);
        }
    }

    public static int c(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (oo.h(i13) * size) + b(list);
    }

    public static int d(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (oo.h(i13) + 4) * size;
    }

    public static int e(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (oo.h(i13) + 8) * size;
    }

    public static int f(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (oo.h(i13) * size) + e(list);
    }

    public static int g(int i13, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (oo.h(i13) * list.size()) + f(list);
    }

    public static int h(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (oo.h(i13) * size) + g(list);
    }

    public static int i(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (oo.h(i13) * size) + h(list);
    }

    public static int j(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h10 = oo.h(i13) * size;
        for (int i14 = 0; i14 < size; i14++) {
            Object obj = list.get(i14);
            h10 = (obj instanceof il ? oo.a((il) obj) : oo.a((String) obj)) + h10;
        }
        return h10;
    }

    public static int k(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (oo.h(i13) * size) + i(list);
    }

    public static int l(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (oo.h(i13) * size) + j(list);
    }

    public static void m(int i13, List list, po poVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        poVar.getClass();
        int i14 = 0;
        if (!(list instanceof zv0)) {
            if (!z13) {
                while (i14 < list.size()) {
                    poVar.f9758a.h(i13, ((Integer) list.get(i14)).intValue());
                    i14++;
                }
                return;
            }
            poVar.f9758a.g(i13, 2);
            int i15 = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                i15 += oo.i(((Integer) list.get(i16)).intValue());
            }
            poVar.f9758a.m(i15);
            while (i14 < list.size()) {
                poVar.f9758a.m(((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        zv0 zv0Var = (zv0) list;
        if (!z13) {
            while (i14 < zv0Var.f14948c) {
                oo ooVar = poVar.f9758a;
                zv0Var.d(i14);
                ooVar.h(i13, zv0Var.f14947b[i14]);
                i14++;
            }
            return;
        }
        poVar.f9758a.g(i13, 2);
        int i17 = 0;
        for (int i18 = 0; i18 < zv0Var.f14948c; i18++) {
            zv0Var.d(i18);
            i17 += oo.i(zv0Var.f14947b[i18]);
        }
        poVar.f9758a.m(i17);
        while (i14 < zv0Var.f14948c) {
            oo ooVar2 = poVar.f9758a;
            zv0Var.d(i14);
            ooVar2.m(zv0Var.f14947b[i14]);
            i14++;
        }
    }

    public static void n(int i13, List list, po poVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        poVar.getClass();
        int i14 = 0;
        if (!(list instanceof d81)) {
            if (!z13) {
                while (i14 < list.size()) {
                    poVar.f9758a.e(i13, ((Long) list.get(i14)).longValue());
                    i14++;
                }
                return;
            }
            poVar.f9758a.g(i13, 2);
            int i15 = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                i15 += oo.a(((Long) list.get(i16)).longValue());
            }
            poVar.f9758a.m(i15);
            while (i14 < list.size()) {
                poVar.f9758a.d(((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        d81 d81Var = (d81) list;
        if (!z13) {
            while (i14 < d81Var.f4201c) {
                oo ooVar = poVar.f9758a;
                d81Var.c(i14);
                ooVar.e(i13, d81Var.f4200b[i14]);
                i14++;
            }
            return;
        }
        poVar.f9758a.g(i13, 2);
        int i17 = 0;
        for (int i18 = 0; i18 < d81Var.f4201c; i18++) {
            d81Var.c(i18);
            i17 += oo.a(d81Var.f4200b[i18]);
        }
        poVar.f9758a.m(i17);
        while (i14 < d81Var.f4201c) {
            oo ooVar2 = poVar.f9758a;
            d81Var.c(i14);
            ooVar2.d(d81Var.f4200b[i14]);
            i14++;
        }
    }

    public static int d(List list) {
        return list.size() * 8;
    }

    public static int e(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zv0) {
            zv0 zv0Var = (zv0) list;
            i13 = 0;
            while (i14 < size) {
                zv0Var.d(i14);
                i13 += oo.a(zv0Var.f14947b[i14]);
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                i13 += oo.a(((Integer) list.get(i14)).intValue());
                i14++;
            }
        }
        return i13;
    }

    public static int c(List list) {
        return list.size() * 4;
    }

    public static void d(int i13, List list, po poVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        poVar.getClass();
        int i14 = 0;
        if (!(list instanceof zv0)) {
            if (z13) {
                poVar.f9758a.g(i13, 2);
                int i15 = 0;
                for (int i16 = 0; i16 < list.size(); i16++) {
                    ((Integer) list.get(i16)).getClass();
                    Logger logger = oo.f9379b;
                    i15 += 4;
                }
                poVar.f9758a.m(i15);
                while (i14 < list.size()) {
                    poVar.f9758a.k(((Integer) list.get(i14)).intValue());
                    i14++;
                }
                return;
            }
            while (i14 < list.size()) {
                poVar.f9758a.e(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        zv0 zv0Var = (zv0) list;
        if (z13) {
            poVar.f9758a.g(i13, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < zv0Var.f14948c; i18++) {
                zv0Var.d(i18);
                int i19 = zv0Var.f14947b[i18];
                Logger logger2 = oo.f9379b;
                i17 += 4;
            }
            poVar.f9758a.m(i17);
            while (i14 < zv0Var.f14948c) {
                oo ooVar = poVar.f9758a;
                zv0Var.d(i14);
                ooVar.k(zv0Var.f14947b[i14]);
                i14++;
            }
            return;
        }
        while (i14 < zv0Var.f14948c) {
            oo ooVar2 = poVar.f9758a;
            zv0Var.d(i14);
            ooVar2.e(i13, zv0Var.f14947b[i14]);
            i14++;
        }
    }

    public static int f(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d81) {
            d81 d81Var = (d81) list;
            i13 = 0;
            while (i14 < size) {
                d81Var.c(i14);
                i13 += oo.a(d81Var.f4200b[i14]);
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                i13 += oo.a(((Long) list.get(i14)).longValue());
                i14++;
            }
        }
        return i13;
    }

    public static int g(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zv0) {
            zv0 zv0Var = (zv0) list;
            i13 = 0;
            while (i14 < size) {
                zv0Var.d(i14);
                i13 += oo.i(oo.j(zv0Var.f14947b[i14]));
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                i13 += oo.i(oo.j(((Integer) list.get(i14)).intValue()));
                i14++;
            }
        }
        return i13;
    }

    public static int h(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d81) {
            d81 d81Var = (d81) list;
            i13 = 0;
            while (i14 < size) {
                d81Var.c(i14);
                i13 += oo.a(oo.b(d81Var.f4200b[i14]));
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                i13 += oo.a(oo.b(((Long) list.get(i14)).longValue()));
                i14++;
            }
        }
        return i13;
    }

    public static int i(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zv0) {
            zv0 zv0Var = (zv0) list;
            i13 = 0;
            while (i14 < size) {
                zv0Var.d(i14);
                i13 += oo.i(zv0Var.f14947b[i14]);
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                i13 += oo.i(((Integer) list.get(i14)).intValue());
                i14++;
            }
        }
        return i13;
    }

    public static void k(int i13, List list, po poVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        poVar.getClass();
        int i14 = 0;
        if (!(list instanceof zv0)) {
            if (z13) {
                poVar.f9758a.g(i13, 2);
                int i15 = 0;
                for (int i16 = 0; i16 < list.size(); i16++) {
                    i15 += oo.i(oo.j(((Integer) list.get(i16)).intValue()));
                }
                poVar.f9758a.m(i15);
                while (i14 < list.size()) {
                    poVar.f9758a.m(oo.j(((Integer) list.get(i14)).intValue()));
                    i14++;
                }
                return;
            }
            while (i14 < list.size()) {
                poVar.f9758a.h(i13, oo.j(((Integer) list.get(i14)).intValue()));
                i14++;
            }
            return;
        }
        zv0 zv0Var = (zv0) list;
        if (z13) {
            poVar.f9758a.g(i13, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < zv0Var.f14948c; i18++) {
                zv0Var.d(i18);
                i17 += oo.i(oo.j(zv0Var.f14947b[i18]));
            }
            poVar.f9758a.m(i17);
            while (i14 < zv0Var.f14948c) {
                oo ooVar = poVar.f9758a;
                zv0Var.d(i14);
                ooVar.m(oo.j(zv0Var.f14947b[i14]));
                i14++;
            }
            return;
        }
        while (i14 < zv0Var.f14948c) {
            oo ooVar2 = poVar.f9758a;
            zv0Var.d(i14);
            ooVar2.h(i13, oo.j(zv0Var.f14947b[i14]));
            i14++;
        }
    }

    public static void l(int i13, List list, po poVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        poVar.getClass();
        int i14 = 0;
        if (!(list instanceof d81)) {
            if (z13) {
                poVar.f9758a.g(i13, 2);
                int i15 = 0;
                for (int i16 = 0; i16 < list.size(); i16++) {
                    i15 += oo.a(oo.b(((Long) list.get(i16)).longValue()));
                }
                poVar.f9758a.m(i15);
                while (i14 < list.size()) {
                    poVar.f9758a.d(oo.b(((Long) list.get(i14)).longValue()));
                    i14++;
                }
                return;
            }
            while (i14 < list.size()) {
                poVar.f9758a.e(i13, oo.b(((Long) list.get(i14)).longValue()));
                i14++;
            }
            return;
        }
        d81 d81Var = (d81) list;
        if (z13) {
            poVar.f9758a.g(i13, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < d81Var.f4201c; i18++) {
                d81Var.c(i18);
                i17 += oo.a(oo.b(d81Var.f4200b[i18]));
            }
            poVar.f9758a.m(i17);
            while (i14 < d81Var.f4201c) {
                oo ooVar = poVar.f9758a;
                d81Var.c(i14);
                ooVar.d(oo.b(d81Var.f4200b[i14]));
                i14++;
            }
            return;
        }
        while (i14 < d81Var.f4201c) {
            oo ooVar2 = poVar.f9758a;
            d81Var.c(i14);
            ooVar2.e(i13, oo.b(d81Var.f4200b[i14]));
            i14++;
        }
    }

    public static void c(int i13, List list, po poVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        poVar.getClass();
        int i14 = 0;
        if (!(list instanceof zv0)) {
            if (z13) {
                poVar.f9758a.g(i13, 2);
                int i15 = 0;
                for (int i16 = 0; i16 < list.size(); i16++) {
                    i15 += oo.a(((Integer) list.get(i16)).intValue());
                }
                poVar.f9758a.m(i15);
                while (i14 < list.size()) {
                    poVar.f9758a.l(((Integer) list.get(i14)).intValue());
                    i14++;
                }
                return;
            }
            while (i14 < list.size()) {
                poVar.f9758a.f(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        zv0 zv0Var = (zv0) list;
        if (z13) {
            poVar.f9758a.g(i13, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < zv0Var.f14948c; i18++) {
                zv0Var.d(i18);
                i17 += oo.a(zv0Var.f14947b[i18]);
            }
            poVar.f9758a.m(i17);
            while (i14 < zv0Var.f14948c) {
                oo ooVar = poVar.f9758a;
                zv0Var.d(i14);
                ooVar.l(zv0Var.f14947b[i14]);
                i14++;
            }
            return;
        }
        while (i14 < zv0Var.f14948c) {
            oo ooVar2 = poVar.f9758a;
            zv0Var.d(i14);
            ooVar2.f(i13, zv0Var.f14947b[i14]);
            i14++;
        }
    }

    public static Object a(Object obj, int i13, h4 h4Var, a.r0 r0Var, Object obj2, a.tf tfVar) {
        if (r0Var == null) {
            return obj2;
        }
        if (h4Var instanceof RandomAccess) {
            int size = h4Var.size();
            int i14 = 0;
            for (int i15 = 0; i15 < size; i15++) {
                Integer num = (Integer) h4Var.get(i15);
                int intValue = num.intValue();
                if (r0Var.a(intValue)) {
                    if (i15 != i14) {
                        h4Var.set(i14, num);
                    }
                    i14++;
                } else {
                    obj2 = a(obj, i13, intValue, obj2, tfVar);
                }
            }
            if (i14 != size) {
                h4Var.subList(i14, size).clear();
            }
        } else {
            Iterator it = h4Var.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!r0Var.a(intValue2)) {
                    obj2 = a(obj, i13, intValue2, obj2, tfVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static int b(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h10 = oo.h(i13) * size;
        for (int i14 = 0; i14 < list.size(); i14++) {
            h10 += oo.a((il) list.get(i14));
        }
        return h10;
    }

    public static int j(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d81) {
            d81 d81Var = (d81) list;
            i13 = 0;
            while (i14 < size) {
                d81Var.c(i14);
                i13 += oo.a(d81Var.f4200b[i14]);
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                i13 += oo.a(((Long) list.get(i14)).longValue());
                i14++;
            }
        }
        return i13;
    }

    public static int b(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zv0) {
            zv0 zv0Var = (zv0) list;
            i13 = 0;
            while (i14 < size) {
                zv0Var.d(i14);
                i13 += oo.a(zv0Var.f14947b[i14]);
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                i13 += oo.a(((Integer) list.get(i14)).intValue());
                i14++;
            }
        }
        return i13;
    }

    public static void e(int i13, List list, po poVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        poVar.getClass();
        int i14 = 0;
        if (!(list instanceof d81)) {
            if (z13) {
                poVar.f9758a.g(i13, 2);
                int i15 = 0;
                for (int i16 = 0; i16 < list.size(); i16++) {
                    ((Long) list.get(i16)).getClass();
                    Logger logger = oo.f9379b;
                    i15 += 8;
                }
                poVar.f9758a.m(i15);
                while (i14 < list.size()) {
                    poVar.f9758a.c(((Long) list.get(i14)).longValue());
                    i14++;
                }
                return;
            }
            while (i14 < list.size()) {
                poVar.f9758a.d(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        d81 d81Var = (d81) list;
        if (z13) {
            poVar.f9758a.g(i13, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < d81Var.f4201c; i18++) {
                d81Var.c(i18);
                long j13 = d81Var.f4200b[i18];
                Logger logger2 = oo.f9379b;
                i17 += 8;
            }
            poVar.f9758a.m(i17);
            while (i14 < d81Var.f4201c) {
                oo ooVar = poVar.f9758a;
                d81Var.c(i14);
                ooVar.c(d81Var.f4200b[i14]);
                i14++;
            }
            return;
        }
        while (i14 < d81Var.f4201c) {
            oo ooVar2 = poVar.f9758a;
            d81Var.c(i14);
            ooVar2.d(i13, d81Var.f4200b[i14]);
            i14++;
        }
    }

    public static void i(int i13, List list, po poVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        poVar.getClass();
        int i14 = 0;
        if (!(list instanceof zv0)) {
            if (z13) {
                poVar.f9758a.g(i13, 2);
                int i15 = 0;
                for (int i16 = 0; i16 < list.size(); i16++) {
                    ((Integer) list.get(i16)).getClass();
                    Logger logger = oo.f9379b;
                    i15 += 4;
                }
                poVar.f9758a.m(i15);
                while (i14 < list.size()) {
                    poVar.f9758a.k(((Integer) list.get(i14)).intValue());
                    i14++;
                }
                return;
            }
            while (i14 < list.size()) {
                poVar.f9758a.e(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        zv0 zv0Var = (zv0) list;
        if (z13) {
            poVar.f9758a.g(i13, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < zv0Var.f14948c; i18++) {
                zv0Var.d(i18);
                int i19 = zv0Var.f14947b[i18];
                Logger logger2 = oo.f9379b;
                i17 += 4;
            }
            poVar.f9758a.m(i17);
            while (i14 < zv0Var.f14948c) {
                oo ooVar = poVar.f9758a;
                zv0Var.d(i14);
                ooVar.k(zv0Var.f14947b[i14]);
                i14++;
            }
            return;
        }
        while (i14 < zv0Var.f14948c) {
            oo ooVar2 = poVar.f9758a;
            zv0Var.d(i14);
            ooVar2.e(i13, zv0Var.f14947b[i14]);
            i14++;
        }
    }

    public static void f(int i13, List list, po poVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        poVar.getClass();
        int i14 = 0;
        if (list instanceof ud) {
            if (z13) {
                poVar.f9758a.g(i13, 2);
                poVar.f9758a.m(0);
                return;
            }
            return;
        }
        if (z13) {
            poVar.f9758a.g(i13, 2);
            int i15 = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                ((Float) list.get(i16)).getClass();
                Logger logger = oo.f9379b;
                i15 += 4;
            }
            poVar.f9758a.m(i15);
            while (i14 < list.size()) {
                oo ooVar = poVar.f9758a;
                float floatValue = ((Float) list.get(i14)).floatValue();
                ooVar.getClass();
                ooVar.k(Float.floatToRawIntBits(floatValue));
                i14++;
            }
            return;
        }
        while (i14 < list.size()) {
            oo ooVar2 = poVar.f9758a;
            float floatValue2 = ((Float) list.get(i14)).floatValue();
            ooVar2.getClass();
            ooVar2.e(i13, Float.floatToRawIntBits(floatValue2));
            i14++;
        }
    }

    public static void g(int i13, List list, po poVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        poVar.getClass();
        int i14 = 0;
        if (!(list instanceof zv0)) {
            if (z13) {
                poVar.f9758a.g(i13, 2);
                int i15 = 0;
                for (int i16 = 0; i16 < list.size(); i16++) {
                    i15 += oo.a(((Integer) list.get(i16)).intValue());
                }
                poVar.f9758a.m(i15);
                while (i14 < list.size()) {
                    poVar.f9758a.l(((Integer) list.get(i14)).intValue());
                    i14++;
                }
                return;
            }
            while (i14 < list.size()) {
                poVar.f9758a.f(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        zv0 zv0Var = (zv0) list;
        if (z13) {
            poVar.f9758a.g(i13, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < zv0Var.f14948c; i18++) {
                zv0Var.d(i18);
                i17 += oo.a(zv0Var.f14947b[i18]);
            }
            poVar.f9758a.m(i17);
            while (i14 < zv0Var.f14948c) {
                oo ooVar = poVar.f9758a;
                zv0Var.d(i14);
                ooVar.l(zv0Var.f14947b[i14]);
                i14++;
            }
            return;
        }
        while (i14 < zv0Var.f14948c) {
            oo ooVar2 = poVar.f9758a;
            zv0Var.d(i14);
            ooVar2.f(i13, zv0Var.f14947b[i14]);
            i14++;
        }
    }

    public static void h(int i13, List list, po poVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        poVar.getClass();
        int i14 = 0;
        if (!(list instanceof d81)) {
            if (z13) {
                poVar.f9758a.g(i13, 2);
                int i15 = 0;
                for (int i16 = 0; i16 < list.size(); i16++) {
                    i15 += oo.a(((Long) list.get(i16)).longValue());
                }
                poVar.f9758a.m(i15);
                while (i14 < list.size()) {
                    poVar.f9758a.d(((Long) list.get(i14)).longValue());
                    i14++;
                }
                return;
            }
            while (i14 < list.size()) {
                poVar.f9758a.e(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        d81 d81Var = (d81) list;
        if (z13) {
            poVar.f9758a.g(i13, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < d81Var.f4201c; i18++) {
                d81Var.c(i18);
                i17 += oo.a(d81Var.f4200b[i18]);
            }
            poVar.f9758a.m(i17);
            while (i14 < d81Var.f4201c) {
                oo ooVar = poVar.f9758a;
                d81Var.c(i14);
                ooVar.d(d81Var.f4200b[i14]);
                i14++;
            }
            return;
        }
        while (i14 < d81Var.f4201c) {
            oo ooVar2 = poVar.f9758a;
            d81Var.c(i14);
            ooVar2.e(i13, d81Var.f4200b[i14]);
            i14++;
        }
    }

    public static void j(int i13, List list, po poVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        poVar.getClass();
        int i14 = 0;
        if (!(list instanceof d81)) {
            if (z13) {
                poVar.f9758a.g(i13, 2);
                int i15 = 0;
                for (int i16 = 0; i16 < list.size(); i16++) {
                    ((Long) list.get(i16)).getClass();
                    Logger logger = oo.f9379b;
                    i15 += 8;
                }
                poVar.f9758a.m(i15);
                while (i14 < list.size()) {
                    poVar.f9758a.c(((Long) list.get(i14)).longValue());
                    i14++;
                }
                return;
            }
            while (i14 < list.size()) {
                poVar.f9758a.d(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        d81 d81Var = (d81) list;
        if (z13) {
            poVar.f9758a.g(i13, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < d81Var.f4201c; i18++) {
                d81Var.c(i18);
                long j13 = d81Var.f4200b[i18];
                Logger logger2 = oo.f9379b;
                i17 += 8;
            }
            poVar.f9758a.m(i17);
            while (i14 < d81Var.f4201c) {
                oo ooVar = poVar.f9758a;
                d81Var.c(i14);
                ooVar.c(d81Var.f4200b[i14]);
                i14++;
            }
            return;
        }
        while (i14 < d81Var.f4201c) {
            oo ooVar2 = poVar.f9758a;
            d81Var.c(i14);
            ooVar2.d(i13, d81Var.f4200b[i14]);
            i14++;
        }
    }

    public static int b(int i13, List list, a.tb tbVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h10 = oo.h(i13) * size;
        for (int i14 = 0; i14 < size; i14++) {
            int a13 = ((g) ((a.xe) list.get(i14))).a(tbVar);
            h10 += oo.i(a13) + a13;
        }
        return h10;
    }

    public static void a(int i13, List list, po poVar, a.tb tbVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        poVar.getClass();
        for (int i14 = 0; i14 < list.size(); i14++) {
            poVar.a(i13, tbVar, list.get(i14));
        }
    }

    public static int a(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (oo.h(i13) + 1) * size;
    }

    public static void b(int i13, List list, po poVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        poVar.getClass();
        int i14 = 0;
        if (list instanceof a.tc) {
            if (z13) {
                poVar.f9758a.g(i13, 2);
                poVar.f9758a.m(0);
                return;
            }
            return;
        }
        if (z13) {
            poVar.f9758a.g(i13, 2);
            int i15 = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                ((Double) list.get(i16)).getClass();
                Logger logger = oo.f9379b;
                i15 += 8;
            }
            poVar.f9758a.m(i15);
            while (i14 < list.size()) {
                oo ooVar = poVar.f9758a;
                double doubleValue = ((Double) list.get(i14)).doubleValue();
                ooVar.getClass();
                ooVar.c(Double.doubleToRawLongBits(doubleValue));
                i14++;
            }
            return;
        }
        while (i14 < list.size()) {
            oo ooVar2 = poVar.f9758a;
            double doubleValue2 = ((Double) list.get(i14)).doubleValue();
            ooVar2.getClass();
            ooVar2.d(i13, Double.doubleToRawLongBits(doubleValue2));
            i14++;
        }
    }

    public static int a(List list) {
        return list.size();
    }

    public static int a(int i13, List list, a.tb tbVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            i14 += oo.a(i13, (a.xe) list.get(i15), tbVar);
        }
        return i14;
    }

    public static int a(int i13, a.tb tbVar, Object obj) {
        int h10 = oo.h(i13);
        int a13 = ((g) ((a.xe) obj)).a(tbVar);
        return oo.i(a13) + a13 + h10;
    }

    public static void a(a.tf tfVar, Object obj, Object obj2) {
        ((ih) tfVar).getClass();
        sj0 sj0Var = (sj0) obj;
        yv2 yv2Var = sj0Var.f11118b;
        yv2 yv2Var2 = ((sj0) obj2).f11118b;
        yv2 yv2Var3 = yv2.f14423f;
        if (!yv2Var3.equals(yv2Var2)) {
            if (yv2Var3.equals(yv2Var)) {
                yv2Var = yv2.a(yv2Var, yv2Var2);
            } else {
                yv2Var.getClass();
                if (!yv2Var2.equals(yv2Var3)) {
                    if (yv2Var.f14428e) {
                        int i13 = yv2Var.f14424a + yv2Var2.f14424a;
                        yv2Var.a(i13);
                        System.arraycopy(yv2Var2.f14425b, 0, yv2Var.f14425b, yv2Var.f14424a, yv2Var2.f14424a);
                        System.arraycopy(yv2Var2.f14426c, 0, yv2Var.f14426c, yv2Var.f14424a, yv2Var2.f14424a);
                        yv2Var.f14424a = i13;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        sj0Var.f11118b = yv2Var;
    }

    public static void b(int i13, List list, po poVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        poVar.getClass();
        for (int i14 = 0; i14 < list.size(); i14++) {
            poVar.f9758a.b((String) list.get(i14), i13);
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void a(int i13, List list, po poVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        poVar.getClass();
        int i14 = 0;
        if (list instanceof a.p) {
            if (z13) {
                poVar.f9758a.g(i13, 2);
                poVar.f9758a.m(0);
                return;
            }
            return;
        }
        if (z13) {
            poVar.f9758a.g(i13, 2);
            int i15 = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                ((Boolean) list.get(i16)).getClass();
                Logger logger = oo.f9379b;
                i15++;
            }
            poVar.f9758a.m(i15);
            while (i14 < list.size()) {
                poVar.f9758a.a(((Boolean) list.get(i14)).booleanValue() ? (byte) 1 : (byte) 0);
                i14++;
            }
            return;
        }
        while (i14 < list.size()) {
            poVar.f9758a.a(i13, ((Boolean) list.get(i14)).booleanValue());
            i14++;
        }
    }

    public static void a(int i13, List list, po poVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        poVar.getClass();
        for (int i14 = 0; i14 < list.size(); i14++) {
            poVar.f9758a.b(i13, (il) list.get(i14));
        }
    }
}
