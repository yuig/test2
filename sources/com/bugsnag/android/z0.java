package com.bugsnag.android;

import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z0 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public p2 f29716a;

    /* renamed from: b, reason: collision with root package name */
    public final u1 f29717b;

    /* renamed from: c, reason: collision with root package name */
    public final x1 f29718c;

    /* renamed from: d, reason: collision with root package name */
    public final k1 f29719d;

    /* renamed from: e, reason: collision with root package name */
    public Collection f29720e;

    /* renamed from: f, reason: collision with root package name */
    public final e2 f29721f;

    /* renamed from: g, reason: collision with root package name */
    public j2 f29722g;

    /* renamed from: h, reason: collision with root package name */
    public final String f29723h;

    /* renamed from: i, reason: collision with root package name */
    public h f29724i;

    /* renamed from: j, reason: collision with root package name */
    public s0 f29725j;

    /* renamed from: k, reason: collision with root package name */
    public List f29726k;

    /* renamed from: l, reason: collision with root package name */
    public final List f29727l;

    /* renamed from: m, reason: collision with root package name */
    public final List f29728m;

    /* renamed from: n, reason: collision with root package name */
    public String f29729n;

    /* renamed from: o, reason: collision with root package name */
    public String f29730o;

    /* renamed from: p, reason: collision with root package name */
    public hd.i f29731p;

    /* renamed from: q, reason: collision with root package name */
    public a4 f29732q;

    /* renamed from: r, reason: collision with root package name */
    public x3 f29733r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public z0(java.lang.Throwable r14, hd.h r15, com.bugsnag.android.p2 r16, com.bugsnag.android.x1 r17, com.bugsnag.android.k1 r18) {
        /*
            r13 = this;
            r0 = r14
            r1 = r15
            java.lang.String r2 = r1.f68809a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r4 = r1.f68814f
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            kotlin.collections.CollectionsKt.J0(r4)
            if (r0 != 0) goto L18
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            goto L62
        L18:
            java.util.List r4 = kh2.c3.n0(r14)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L27:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L61
            java.lang.Object r6 = r4.next()
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.lang.StackTraceElement[] r7 = r6.getStackTrace()
            if (r7 != 0) goto L3c
            r7 = 0
            java.lang.StackTraceElement[] r7 = new java.lang.StackTraceElement[r7]
        L3c:
            com.bugsnag.android.s2 r8 = new com.bugsnag.android.s2
            java.util.Collection r9 = r1.f68816h
            com.bugsnag.android.u1 r10 = r1.f68826r
            r8.<init>(r7, r9, r10)
            com.bugsnag.android.u0 r7 = new com.bugsnag.android.u0
            java.lang.Class r9 = r6.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r6 = r6.getLocalizedMessage()
            com.bugsnag.android.ErrorType r11 = com.bugsnag.android.ErrorType.ANDROID
            r7.<init>(r9, r6, r8, r11)
            com.bugsnag.android.t0 r6 = new com.bugsnag.android.t0
            r6.<init>(r7, r10)
            r5.add(r6)
            goto L27
        L61:
            r4 = r5
        L62:
            com.bugsnag.android.x1 r5 = r17.c()
            com.bugsnag.android.k1 r6 = new com.bugsnag.android.k1
            r7 = r18
            com.bugsnag.android.i1[] r7 = r7.f29317a
            r6.<init>(r7)
            com.bugsnag.android.w3 r7 = new com.bugsnag.android.w3
            r8 = r16
            boolean r9 = r8.f29418f
            r7.<init>(r14, r9, r15)
            java.util.ArrayList r9 = r7.f29679a
            com.bugsnag.android.a4 r10 = new com.bugsnag.android.a4
            r0 = 0
            r10.<init>(r0, r0, r0)
            java.util.Collection r0 = r1.D
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r11 = kotlin.collections.CollectionsKt.J0(r0)
            com.bugsnag.android.u1 r7 = r1.f68826r
            java.util.Collection r12 = r1.f68816h
            r0 = r13
            r1 = r2
            r2 = r7
            r7 = r12
            r8 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.z0.<init>(java.lang.Throwable, hd.h, com.bugsnag.android.p2, com.bugsnag.android.x1, com.bugsnag.android.k1):void");
    }

    public final LinkedHashSet a() {
        List list = this.f29727l;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ErrorType errorType = ((t0) it.next()).f29640a.f29657c;
            if (errorType != null) {
                arrayList.add(errorType);
            }
        }
        Set J0 = CollectionsKt.J0(arrayList);
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((t0) it2.next()).f29640a.f29658d);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            List list2 = (List) it3.next();
            ArrayList arrayList4 = new ArrayList();
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                ErrorType errorType2 = ((r2) it4.next()).f29477l;
                if (errorType2 != null) {
                    arrayList4.add(errorType2);
                }
            }
            kotlin.collections.k0.u(arrayList4, arrayList3);
        }
        return kotlin.collections.i1.i(J0, arrayList3);
    }

    @Override // com.bugsnag.android.n1
    public final void toStream(o1 o1Var) {
        o1 o1Var2 = new o1(o1Var, this.f29721f);
        o1Var2.d();
        o1Var2.K("context");
        o1Var2.z(this.f29730o);
        o1Var2.K("metaData");
        o1Var2.M(this.f29718c);
        o1Var2.K("severity");
        o1Var2.M(this.f29716a.f29417e);
        o1Var2.K("severityReason");
        o1Var2.M(this.f29716a);
        o1Var2.K("unhandled");
        o1Var2.A(this.f29716a.f29418f);
        o1Var2.K("exceptions");
        o1Var2.c();
        Iterator it = this.f29727l.iterator();
        while (it.hasNext()) {
            o1Var2.M((t0) it.next());
        }
        o1Var2.f();
        o1Var2.K("projectPackages");
        o1Var2.c();
        Iterator it2 = this.f29720e.iterator();
        while (it2.hasNext()) {
            o1Var2.z((String) it2.next());
        }
        o1Var2.f();
        o1Var2.K("user");
        o1Var2.M(this.f29732q);
        o1Var2.K("app");
        h hVar = this.f29724i;
        if (hVar == null) {
            Intrinsics.r("app");
            throw null;
        }
        o1Var2.M(hVar);
        o1Var2.K("device");
        s0 s0Var = this.f29725j;
        if (s0Var == null) {
            Intrinsics.r("device");
            throw null;
        }
        o1Var2.M(s0Var);
        o1Var2.K("breadcrumbs");
        o1Var2.M(this.f29726k);
        o1Var2.K("groupingHash");
        o1Var2.z(this.f29729n);
        Map C = this.f29731p.C();
        if (!C.isEmpty()) {
            o1Var2.K("usage");
            o1Var2.d();
            for (Map.Entry entry : C.entrySet()) {
                o1Var2.K((String) entry.getKey());
                o1Var2.M(entry.getValue());
            }
            o1Var2.g();
        }
        o1Var2.K("threads");
        o1Var2.c();
        Iterator it3 = this.f29728m.iterator();
        while (it3.hasNext()) {
            o1Var2.M((s3) it3.next());
        }
        o1Var2.f();
        o1Var2.K("featureFlags");
        o1Var2.M(this.f29719d);
        x3 x3Var = this.f29733r;
        if (x3Var != null) {
            o1Var2.K("correlation");
            o1Var2.M(x3Var);
        }
        j2 j2Var = this.f29722g;
        if (j2Var != null) {
            j2 b13 = j2.b(j2Var);
            o1Var2.K("session");
            o1Var2.d();
            o1Var2.K("id");
            o1Var2.z(b13.f29288c);
            o1Var2.K("startedAt");
            o1Var2.M(b13.f29289d);
            o1Var2.K("events");
            o1Var2.d();
            o1Var2.K("handled");
            long intValue = b13.f29296k.intValue();
            o1Var2.J();
            o1Var2.a();
            String l13 = Long.toString(intValue);
            Writer writer = o1Var2.f29407a;
            writer.write(l13);
            o1Var2.K("unhandled");
            long intValue2 = b13.f29295j.intValue();
            o1Var2.J();
            o1Var2.a();
            writer.write(Long.toString(intValue2));
            o1Var2.g();
            o1Var2.g();
        }
        o1Var2.g();
    }

    public z0(String str, u1 u1Var, List list, List list2, x1 x1Var, k1 k1Var, Collection collection, p2 p2Var, List list3, a4 a4Var, Set set) {
        e2 e2Var = new e2();
        e2Var.f29212a = CollectionsKt.J0(e2Var.f29212a);
        this.f29721f = e2Var;
        this.f29731p = new g4.u();
        this.f29717b = u1Var;
        this.f29723h = str;
        this.f29726k = list;
        this.f29727l = list2;
        this.f29718c = x1Var;
        this.f29719d = k1Var;
        this.f29720e = collection;
        this.f29716a = p2Var;
        this.f29728m = list3;
        this.f29732q = a4Var;
        if (set == null) {
            return;
        }
        Set set2 = set;
        e2Var.f29212a = CollectionsKt.J0(set2);
        x1Var.f29688b.f29212a = CollectionsKt.J0(set2);
    }
}
