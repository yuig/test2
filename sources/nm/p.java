package nm;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import qm.c1;
import qm.n1;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public pm.h f91344a;

    /* renamed from: b, reason: collision with root package name */
    public final z f91345b;

    /* renamed from: c, reason: collision with root package name */
    public final i f91346c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f91347d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f91348e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f91349f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f91350g;

    /* renamed from: h, reason: collision with root package name */
    public String f91351h;

    /* renamed from: i, reason: collision with root package name */
    public final int f91352i;

    /* renamed from: j, reason: collision with root package name */
    public final int f91353j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f91354k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f91355l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f91356m;

    /* renamed from: n, reason: collision with root package name */
    public final j f91357n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f91358o;

    /* renamed from: p, reason: collision with root package name */
    public final b0 f91359p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f91360q;

    /* renamed from: r, reason: collision with root package name */
    public final h0 f91361r;

    /* renamed from: s, reason: collision with root package name */
    public final h0 f91362s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayDeque f91363t;

    public p() {
        this.f91344a = pm.h.f100591f;
        this.f91345b = z.DEFAULT;
        this.f91346c = h.IDENTITY;
        this.f91347d = new HashMap();
        this.f91348e = new ArrayList();
        this.f91349f = new ArrayList();
        this.f91350g = false;
        j jVar = o.f91318z;
        this.f91351h = null;
        this.f91352i = 2;
        this.f91353j = 2;
        this.f91354k = false;
        this.f91355l = false;
        this.f91356m = true;
        this.f91357n = o.f91318z;
        this.f91358o = false;
        this.f91359p = null;
        this.f91360q = true;
        this.f91361r = o.B;
        this.f91362s = o.C;
        this.f91363t = new ArrayDeque();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final nm.o a() {
        /*
            r25 = this;
            r0 = r25
            java.util.ArrayList r15 = new java.util.ArrayList
            java.util.ArrayList r3 = r0.f91348e
            int r1 = r3.size()
            java.util.ArrayList r5 = r0.f91349f
            int r2 = r5.size()
            int r2 = r2 + r1
            int r2 = r2 + 3
            r15.<init>(r2)
            r15.addAll(r3)
            java.util.Collections.reverse(r15)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r5)
            java.util.Collections.reverse(r1)
            r15.addAll(r1)
            java.lang.String r1 = r0.f91351h
            boolean r2 = tm.h.f118120a
            qm.f r4 = qm.g.f104162b
            r6 = 0
            if (r1 == 0) goto L4f
            java.lang.String r7 = r1.trim()
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L4f
            qm.c1 r4 = r4.b(r1)
            if (r2 == 0) goto L4d
            tm.g r6 = tm.h.f118122c
            qm.c1 r6 = r6.b(r1)
            tm.g r7 = tm.h.f118121b
            qm.c1 r1 = r7.b(r1)
            goto L6a
        L4d:
            r1 = r6
            goto L6a
        L4f:
            int r1 = r0.f91352i
            int r7 = r0.f91353j
            r8 = 2
            if (r1 != r8) goto L58
            if (r7 == r8) goto L75
        L58:
            qm.c1 r4 = r4.a(r1, r7)
            if (r2 == 0) goto L4d
            tm.g r6 = tm.h.f118122c
            qm.c1 r6 = r6.a(r1, r7)
            tm.g r8 = tm.h.f118121b
            qm.c1 r1 = r8.a(r1, r7)
        L6a:
            r15.add(r4)
            if (r2 == 0) goto L75
            r15.add(r6)
            r15.add(r1)
        L75:
            nm.o r23 = new nm.o
            r1 = r23
            pm.h r2 = r0.f91344a
            java.util.HashMap r6 = new java.util.HashMap
            r4 = r6
            java.util.HashMap r7 = r0.f91347d
            r6.<init>(r7)
            boolean r8 = r0.f91356m
            java.lang.String r14 = r0.f91351h
            java.util.ArrayList r6 = new java.util.ArrayList
            r17 = r6
            r6.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r18 = r3
            r3.<init>(r5)
            java.util.ArrayList r3 = new java.util.ArrayList
            r22 = r3
            java.util.ArrayDeque r5 = r0.f91363t
            r3.<init>(r5)
            nm.i r3 = r0.f91346c
            boolean r5 = r0.f91350g
            boolean r6 = r0.f91354k
            boolean r7 = r0.f91358o
            nm.j r9 = r0.f91357n
            nm.b0 r10 = r0.f91359p
            boolean r11 = r0.f91355l
            boolean r12 = r0.f91360q
            nm.z r13 = r0.f91345b
            r16 = r15
            int r15 = r0.f91352i
            r19 = r16
            r24 = r1
            int r1 = r0.f91353j
            r16 = r1
            nm.h0 r1 = r0.f91361r
            r20 = r1
            nm.h0 r1 = r0.f91362s
            r21 = r1
            r1 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: nm.p.a():nm.o");
    }

    public final void b(Object obj, Type type) {
        Objects.requireNonNull(type);
        boolean z13 = obj instanceof w;
        pk.a0.A(z13 || (obj instanceof r) || (obj instanceof i0));
        if ((type instanceof Class) && (type == Object.class || s.class.isAssignableFrom((Class) type))) {
            throw new IllegalArgumentException("Cannot override built-in adapter for " + type);
        }
        ArrayList arrayList = this.f91348e;
        if (z13 || (obj instanceof r)) {
            TypeToken typeToken = new TypeToken(type);
            arrayList.add(new qm.d0(obj, typeToken, typeToken.f33847b == typeToken.f33846a));
        }
        if (obj instanceof i0) {
            c1 c1Var = n1.f104179a;
            arrayList.add(new c1(new TypeToken(type), (i0) obj, 2));
        }
    }

    public p(o oVar) {
        this.f91344a = pm.h.f100591f;
        this.f91345b = z.DEFAULT;
        this.f91346c = h.IDENTITY;
        HashMap hashMap = new HashMap();
        this.f91347d = hashMap;
        ArrayList arrayList = new ArrayList();
        this.f91348e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f91349f = arrayList2;
        this.f91350g = false;
        j jVar = o.f91318z;
        this.f91351h = null;
        this.f91352i = 2;
        this.f91353j = 2;
        this.f91354k = false;
        this.f91355l = false;
        this.f91356m = true;
        this.f91357n = o.f91318z;
        this.f91358o = false;
        this.f91359p = null;
        this.f91360q = true;
        this.f91361r = o.B;
        this.f91362s = o.C;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f91363t = arrayDeque;
        this.f91344a = oVar.f91324f;
        this.f91346c = oVar.f91325g;
        hashMap.putAll(oVar.f91326h);
        this.f91350g = oVar.f91327i;
        this.f91354k = oVar.f91328j;
        this.f91358o = oVar.f91329k;
        this.f91356m = oVar.f91330l;
        this.f91357n = oVar.f91331m;
        this.f91359p = oVar.f91332n;
        this.f91355l = oVar.f91333o;
        this.f91345b = oVar.f91338t;
        this.f91351h = oVar.f91335q;
        this.f91352i = oVar.f91336r;
        this.f91353j = oVar.f91337s;
        arrayList.addAll(oVar.f91339u);
        arrayList2.addAll(oVar.f91340v);
        this.f91360q = oVar.f91334p;
        this.f91361r = oVar.f91341w;
        this.f91362s = oVar.f91342x;
        arrayDeque.addAll(oVar.f91343y);
    }
}
