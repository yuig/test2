package ey;

import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final pb0.a f60547a;

    /* renamed from: b, reason: collision with root package name */
    public String f60548b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f60549c;

    /* renamed from: d, reason: collision with root package name */
    public String f60550d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f60551e;

    /* renamed from: f, reason: collision with root package name */
    public ly1.f f60552f;

    /* renamed from: g, reason: collision with root package name */
    public re2.j f60553g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f60554h;

    /* renamed from: i, reason: collision with root package name */
    public List f60555i;

    /* renamed from: j, reason: collision with root package name */
    public long f60556j;

    public o1(String id3, String metricName, boolean z13, pb0.a clock, long j13, boolean z14) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(metricName, "metricName");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f60547a = clock;
        this.f60550d = "";
        this.f60554h = new ArrayList(10);
        c(j13, id3, metricName, z13);
    }

    public final ly1.f a() {
        ly1.f fVar = this.f60552f;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.r("simpleStopWatch");
        throw null;
    }

    public final re2.j b() {
        re2.j jVar = this.f60553g;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.r("span");
        throw null;
    }

    public final void c(long j13, String id3, String metricName, boolean z13) {
        long j14;
        long a13;
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(metricName, "metricName");
        this.f60548b = id3;
        this.f60549c = z13;
        if (this.f60552f == null) {
            ly1.f fVar = new ly1.f(id3, this.f60547a);
            Intrinsics.checkNotNullParameter(fVar, "<set-?>");
            this.f60552f = fVar;
        } else {
            ly1.f a14 = a();
            a14.f85162a = id3;
            a14.f85169h = 0L;
            a14.f85167f = 0L;
            a14.f85166e = new ArrayList(10);
            a14.f85164c = 0L;
            a14.f85165d = 0L;
            a14.f85170i = false;
            a14.f85171j = false;
        }
        Boolean bool = Boolean.FALSE;
        if (z13) {
            j3 j3Var = j3.f60510a;
            j14 = Long.valueOf(j3.a());
            ArrayList arrayList = new ArrayList(20);
            this.f60555i = arrayList;
            arrayList.add(this);
            this.f60550d = metricName;
        } else {
            j14 = 0L;
        }
        Long l13 = j14;
        if (j13 != Long.MIN_VALUE) {
            a13 = j13;
        } else {
            j3 j3Var2 = j3.f60510a;
            a13 = j3.a();
        }
        re2.j jVar = new re2.j(l13, metricName, Long.valueOf(a13), null, null, null, bool, null, null, null);
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f60553g = jVar;
    }

    public final void d() {
        this.f60548b = null;
        this.f60549c = false;
        this.f60550d = "";
        this.f60551e = false;
        this.f60556j = 0L;
        ly1.f a13 = a();
        a13.f85170i = false;
        a13.f85171j = false;
        a13.f85167f = 0L;
        a13.f85169h = 0L;
        a13.f85166e.clear();
        a13.f85164c = 0L;
        a13.f85165d = 0L;
        re2.j jVar = new re2.j(null, null, null, null, null, null, Boolean.FALSE, null, null, null);
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f60553g = jVar;
        this.f60554h.clear();
        if (this.f60555i != null) {
            this.f60555i = null;
        }
    }

    public final void e(long j13, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        List list = b().f107713e;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.d(((re2.a) it.next()).f107691b, value)) {
                    return;
                }
            }
        }
        qb0.e eVar = qb0.d.f103396a;
        wo2.m mVar = eVar.f103398b;
        Integer num = null;
        if (mVar == null) {
            Integer num2 = eVar.f103397a;
            if (num2 != null) {
                mVar = null;
                num = num2;
            } else {
                mVar = null;
            }
        }
        re2.i iVar = new re2.i(num, (short) 0, "android", mVar);
        ArrayList arrayList = new ArrayList();
        List list2 = b().f107713e;
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        ((pb0.g) this.f60547a).getClass();
        arrayList.add(new re2.a(Long.valueOf((System.currentTimeMillis() - j13) * 1000), value, iVar));
        re2.j source = b();
        Intrinsics.checkNotNullParameter(source, "source");
        re2.j jVar = new re2.j(source.f107709a, source.f107710b, source.f107711c, source.f107712d, arrayList, source.f107714f, source.f107715g, source.f107716h, source.f107717i, source.f107718j);
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f60553g = jVar;
    }

    public final void f() {
        List list;
        String W = df.j1.W("logSpanHierarchyOnError: current stop watch id [%s] TopLevel [%b] # child [%d]", this.f60548b, Boolean.valueOf(this.f60549c), Integer.valueOf(this.f60554h.size()));
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.h(W);
        if (!(!r0.isEmpty()) || (list = this.f60555i) == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((o1) it.next()).f();
        }
    }

    public final void g() {
        Intrinsics.checkNotNullParameter("error", "value");
        ArrayList arrayList = new ArrayList();
        List list = b().f107713e;
        if (list != null) {
            arrayList.addAll(list);
        }
        ((pb0.g) this.f60547a).getClass();
        arrayList.add(new re2.a(Long.valueOf(System.currentTimeMillis() * 1000), "error", null));
        re2.j source = b();
        Intrinsics.checkNotNullParameter(source, "source");
        re2.j jVar = new re2.j(source.f107709a, source.f107710b, source.f107711c, source.f107712d, arrayList, source.f107714f, source.f107715g, source.f107716h, source.f107717i, source.f107718j);
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f60553g = jVar;
    }

    public final void h(int i13, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        wo2.j jVar = new wo2.j();
        try {
            new fo.b(new go.a(jVar)).g(i13);
        } catch (IOException e13) {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.p(e13);
        }
        l(new re2.g(key, jVar.a1(jVar.f130711b), re2.d.I32));
    }

    public final void i(long j13, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        wo2.j jVar = new wo2.j();
        try {
            new fo.b(new go.a(jVar)).h(j13);
        } catch (IOException e13) {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.p(e13);
        }
        l(new re2.g(key, jVar.a1(jVar.f130711b), re2.d.I64));
    }

    public final void j(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.length() == 0) {
            return;
        }
        wo2.m mVar = wo2.m.f130712d;
        l(new re2.g(key, m60.f0.h0(value), re2.d.STRING));
    }

    public final void k(String key, short s13) {
        Intrinsics.checkNotNullParameter(key, "key");
        wo2.j jVar = new wo2.j();
        try {
            new fo.b(new go.a(jVar)).f(s13);
        } catch (IOException e13) {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.p(e13);
        }
        l(new re2.g(key, jVar.a1(jVar.f130711b), re2.d.I16));
    }

    public final void l(re2.g annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        ArrayList arrayList = new ArrayList();
        List list = b().f107714f;
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(annotation);
        re2.j source = b();
        Intrinsics.checkNotNullParameter(source, "source");
        re2.j jVar = new re2.j(source.f107709a, source.f107710b, source.f107711c, source.f107712d, source.f107713e, arrayList, source.f107715g, source.f107716h, source.f107717i, source.f107718j);
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f60553g = jVar;
    }

    public final void m() {
        ly1.f a13 = a();
        a13.f85170i = false;
        a13.f85171j = false;
        a13.f85167f = 0L;
        a13.f85169h = 0L;
        a13.f85166e.clear();
        a13.f85164c = 0L;
        a13.f85165d = 0L;
    }

    public final void n(long j13) {
        if (this.f60556j != 0) {
            o(SystemClock.elapsedRealtime() - this.f60556j);
        } else {
            o(j13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r13 < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(long r13) {
        /*
            r12 = this;
            ly1.f r0 = r12.a()
            boolean r0 = r0.f85170i
            r1 = 1
            if (r0 == 0) goto L10
            java.lang.String r0 = "cr"
            r12.e(r13, r0)
            r12.f60551e = r1
        L10:
            ly1.f r0 = r12.a()
            java.lang.String r2 = r0.f85162a
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L28
            java.lang.String r6 = "prefetch_image"
            boolean r2 = kotlin.text.StringsKt.E(r2, r6, r3)
            if (r2 != r1) goto L28
            int r1 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r1 >= 0) goto L3d
            goto L3e
        L28:
            int r2 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r2 < 0) goto L2d
            goto L2e
        L2d:
            r1 = r3
        L2e:
            java.lang.String r2 = r0.f85162a
            tb0.p r4 = tb0.p.ANALYTICS_OVERVIEW
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r4}
            java.lang.String r4 = "stop watch key [%s] tries to stop with a diff which is < 0!!!"
            m60.f0 r5 = vb0.j.f125466a
            r5.S(r1, r4, r2)
        L3d:
            r4 = r13
        L3e:
            boolean r1 = r0.f85170i
            if (r1 == 0) goto L63
            pb0.a r1 = r0.f85163b
            pb0.g r1 = (pb0.g) r1
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            boolean r6 = r0.f85171j
            if (r6 == 0) goto L5b
            long r6 = r0.f85164c
            long r8 = r1 - r4
            long r10 = r0.f85165d
            long r8 = r8 - r10
            long r8 = r8 + r6
            r0.f85164c = r8
        L5b:
            long r1 = r1 - r4
            long r4 = r0.f85167f
            long r1 = r1 - r4
            r0.f85169h = r1
            r0.f85170i = r3
        L63:
            java.util.ArrayList r0 = r12.f60554h
            java.util.Iterator r0 = r0.iterator()
        L69:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L79
            java.lang.Object r1 = r0.next()
            ey.o1 r1 = (ey.o1) r1
            r1.n(r13)
            goto L69
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ey.o1.o(long):void");
    }

    public final void p(long j13) {
        if (a().f85170i) {
            e(j13, "cr");
        }
        ly1.f a13 = a();
        if (a13.f85170i) {
            a13.f85164c = 0L;
            a13.f85169h = 0L;
            a13.f85170i = false;
        }
        Iterator it = this.f60554h.iterator();
        while (it.hasNext()) {
            ((o1) it.next()).n(j13);
        }
    }
}
