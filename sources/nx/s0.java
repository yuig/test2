package nx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import k1.s2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a */
    public final o0 f92456a;

    /* renamed from: b */
    public final pb0.a f92457b;

    /* renamed from: c */
    public final Object f92458c;

    /* renamed from: d */
    public byte[] f92459d;

    /* renamed from: e */
    public final xk2.v f92460e;

    /* renamed from: f */
    public final xk2.v f92461f;

    /* renamed from: g */
    public final kotlin.collections.v f92462g;

    /* renamed from: h */
    public final ArrayList f92463h;

    /* renamed from: i */
    public boolean f92464i;

    /* renamed from: j */
    public final q0 f92465j;

    public s0(o0 pinalyticsManager) {
        pb0.g clock = pb0.g.f99432a;
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f92456a = pinalyticsManager;
        this.f92457b = clock;
        this.f92458c = new Object();
        this.f92460e = xk2.m.b(p0.f92447k);
        this.f92461f = xk2.m.b(p0.f92446j);
        this.f92462g = new kotlin.collections.v();
        this.f92463h = new ArrayList();
        this.f92465j = new q0(this);
    }

    public static List b(int i13, String str, ArrayList arrayList) {
        String str2;
        String str3 = str;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h32.w0 source = (h32.w0) it.next();
            Map map = source.f67327e;
            LinkedHashMap r13 = map != null ? kotlin.collections.z0.r(map) : null;
            int i14 = 0;
            if (r13 != null && r13.containsKey("event_retry_count") && (str2 = (String) r13.get("event_retry_count")) != null) {
                i14 = Integer.parseInt(str2);
            }
            int i15 = i14 + 1;
            if (r13 != null) {
            }
            if (r13 != null) {
            }
            if (str3 != null && r13 != null) {
            }
            Intrinsics.checkNotNullParameter(source, "source");
            kotlin.collections.z0.d();
            arrayList2.add(new h32.w0(source.f67323a, source.f67324b, source.f67325c, source.f67326d, r13, source.f67328f, source.f67329g, source.f67330h, source.f67331i, source.f67332j, source.f67333k, source.f67334l, source.f67335m, source.f67336n, source.f67337o, source.f67338p, source.f67339q, source.f67340r, source.f67341s, source.f67342t, source.f67343u, source.f67344v, source.f67345w, source.f67346x, source.f67347y, source.f67348z, source.A, source.B, source.C, source.D, source.E, source.F, source.G, source.H, source.I, source.f67322J, source.K));
            str3 = str;
        }
        return CollectionsKt.F0(arrayList2);
    }

    public final void a(ArrayList arrayList) {
        synchronized (this.f92458c) {
            try {
                if (this.f92462g.f80402c + arrayList.size() <= 1000) {
                    this.f92462g.addAll(arrayList);
                } else {
                    int size = (this.f92462g.f80402c + arrayList.size()) - 1000;
                    for (int i13 = 0; (!this.f92462g.isEmpty()) && i13 < size; i13++) {
                        kotlin.collections.v vVar = this.f92462g;
                        if (!vVar.isEmpty()) {
                            vVar.removeFirst();
                        }
                    }
                    this.f92462g.addAll(arrayList);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final h32.a1 c() {
        synchronized (this.f92458c) {
            while (true) {
                try {
                    Object obj = null;
                    if (this.f92463h.size() >= 200 || !(!this.f92462g.isEmpty())) {
                        break;
                    }
                    kotlin.collections.v vVar = this.f92462g;
                    if (!vVar.isEmpty()) {
                        obj = vVar.removeLast();
                    }
                    h32.w0 w0Var = (h32.w0) obj;
                    if (w0Var != null) {
                        this.f92463h.add(w0Var);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (this.f92463h.isEmpty()) {
                return null;
            }
            return new h32.a1(CollectionsKt.q0(this.f92463h), Long.valueOf(((pb0.g) this.f92457b).a()));
        }
    }

    public final h32.a1 d() {
        synchronized (this.f92458c) {
            this.f92463h.addAll(this.f92462g);
            this.f92462g.clear();
            if (this.f92463h.isEmpty()) {
                return null;
            }
            return new h32.a1(this.f92463h, Long.valueOf(((pb0.g) this.f92457b).a()));
        }
    }

    public final void e() {
        this.f92464i = true;
        hb0.g gVar = hb0.f.f68518a;
        Timer timer = gVar.f68521c;
        if (timer != null) {
            timer.schedule(new hb0.e(gVar, (Object) null), 0L);
        } else {
            gVar.getClass();
            new Timer().schedule(new hb0.e(gVar, (Object) null), 0L);
        }
    }

    public final void f() {
        ArrayList arrayList;
        synchronized (this.f92458c) {
            try {
                o0 o0Var = this.f92456a;
                synchronized (o0Var) {
                    arrayList = new ArrayList(o0Var.f92439b);
                    o0Var.f92439b.clear();
                }
                if (!arrayList.isEmpty()) {
                    a(arrayList);
                }
                h32.a1 d2 = this.f92464i ? d() : c();
                if (d2 != null) {
                    try {
                        wo2.j jVar = new wo2.j();
                        fo.b protocol = new fo.b(new go.a(jVar));
                        Intrinsics.checkNotNullParameter(protocol, "protocol");
                        h32.a1.f66828c.h(protocol, d2);
                        this.f92459d = jVar.A(jVar.f130711b);
                        HashSet hashSet = tb0.h.f117076w;
                        tb0.h hVar = tb0.g.f117075a;
                        hVar.y("pinalytics_last_payload_online", true);
                        hVar.x("pinalytics_last_payload_event_count", String.valueOf(arrayList.size()));
                    } catch (Exception e13) {
                        this.f92459d = null;
                        vb0.j.f125466a.S(false, "context log serialization exception, msg: [" + e13.getMessage() + "]", new Object[0]);
                        e13.toString();
                    }
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void g() {
        synchronized (this.f92458c) {
            synchronized (this.f92458c) {
                this.f92463h.clear();
                this.f92459d = null;
                this.f92464i = false;
                Unit unit = Unit.f80348a;
            }
            hb0.g gVar = hb0.f.f68518a;
            q0 q0Var = this.f92465j;
            gVar.getClass();
            gVar.f68519a.put(String.valueOf(q0Var.hashCode()), q0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:9:0x000e, B:11:0x0024, B:13:0x0034, B:18:0x0045, B:20:0x004b, B:22:0x0062, B:23:0x0067, B:25:0x0071, B:26:0x0076, B:28:0x0080, B:29:0x0085, B:31:0x008f, B:32:0x0094, B:39:0x0099), top: B:8:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:9:0x000e, B:11:0x0024, B:13:0x0034, B:18:0x0045, B:20:0x004b, B:22:0x0062, B:23:0x0067, B:25:0x0071, B:26:0x0076, B:28:0x0080, B:29:0x0085, B:31:0x008f, B:32:0x0094, B:39:0x0099), top: B:8:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:9:0x000e, B:11:0x0024, B:13:0x0034, B:18:0x0045, B:20:0x004b, B:22:0x0062, B:23:0x0067, B:25:0x0071, B:26:0x0076, B:28:0x0080, B:29:0x0085, B:31:0x008f, B:32:0x0094, B:39:0x0099), top: B:8:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:9:0x000e, B:11:0x0024, B:13:0x0034, B:18:0x0045, B:20:0x004b, B:22:0x0062, B:23:0x0067, B:25:0x0071, B:26:0x0076, B:28:0x0080, B:29:0x0085, B:31:0x008f, B:32:0x0094, B:39:0x0099), top: B:8:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:9:0x000e, B:11:0x0024, B:13:0x0034, B:18:0x0045, B:20:0x004b, B:22:0x0062, B:23:0x0067, B:25:0x0071, B:26:0x0076, B:28:0x0080, B:29:0x0085, B:31:0x008f, B:32:0x0094, B:39:0x0099), top: B:8:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(v.f1 r12, int r13, ox.b r14, java.lang.String r15) {
        /*
            r11 = this;
            java.lang.String r0 = "analyticsApi"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.Object r0 = r11.f92458c
            monitor-enter(r0)
            r1 = 15
            if (r13 != r1) goto Le
            monitor-exit(r0)
            return
        Le:
            java.util.ArrayList r1 = r11.f92463h     // Catch: java.lang.Throwable -> L3d
            r1.size()     // Catch: java.lang.Throwable -> L3d
            kotlin.collections.v r1 = r11.f92462g     // Catch: java.lang.Throwable -> L3d
            java.util.ArrayList r2 = r11.f92463h     // Catch: java.lang.Throwable -> L3d
            java.util.List r15 = b(r13, r15, r2)     // Catch: java.lang.Throwable -> L3d
            java.util.Collection r15 = (java.util.Collection) r15     // Catch: java.lang.Throwable -> L3d
            r1.addAll(r15)     // Catch: java.lang.Throwable -> L3d
            boolean r15 = ff0.j.f62103a     // Catch: java.lang.Throwable -> L3d
            if (r15 != 0) goto L99
            xk2.v r15 = r11.f92461f     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r15 = r15.getValue()     // Catch: java.lang.Throwable -> L3d
            b60.b r15 = (b60.b) r15     // Catch: java.lang.Throwable -> L3d
            b60.d r15 = (b60.d) r15     // Catch: java.lang.Throwable -> L3d
            com.pinterest.api.model.wy0 r15 = r15.f()     // Catch: java.lang.Throwable -> L3d
            if (r15 == 0) goto L40
            java.lang.String r15 = r15.getUid()     // Catch: java.lang.Throwable -> L3d
            if (r15 != 0) goto L3b
            goto L40
        L3b:
            r2 = r15
            goto L43
        L3d:
            r12 = move-exception
            goto L9d
        L40:
            java.lang.String r15 = ""
            goto L3b
        L43:
            if (r12 == 0) goto L49
            int r12 = r12.f123449b     // Catch: java.lang.Throwable -> L3d
        L47:
            r3 = r12
            goto L4b
        L49:
            r12 = 0
            goto L47
        L4b:
            boolean r12 = r11.f92464i     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L3d
            java.util.ArrayList r12 = r11.f92463h     // Catch: java.lang.Throwable -> L3d
            int r6 = r12.size()     // Catch: java.lang.Throwable -> L3d
            java.util.ArrayList r12 = r11.f92463h     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r12 = kotlin.collections.CollectionsKt.firstOrNull(r12)     // Catch: java.lang.Throwable -> L3d
            h32.w0 r12 = (h32.w0) r12     // Catch: java.lang.Throwable -> L3d
            r15 = 0
            if (r12 == 0) goto L66
            java.lang.Long r12 = r12.f67323a     // Catch: java.lang.Throwable -> L3d
            r7 = r12
            goto L67
        L66:
            r7 = r15
        L67:
            java.util.ArrayList r12 = r11.f92463h     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r12 = kotlin.collections.CollectionsKt.firstOrNull(r12)     // Catch: java.lang.Throwable -> L3d
            h32.w0 r12 = (h32.w0) r12     // Catch: java.lang.Throwable -> L3d
            if (r12 == 0) goto L75
            h32.f1 r12 = r12.f67324b     // Catch: java.lang.Throwable -> L3d
            r8 = r12
            goto L76
        L75:
            r8 = r15
        L76:
            java.util.ArrayList r12 = r11.f92463h     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r12 = kotlin.collections.CollectionsKt.d0(r12)     // Catch: java.lang.Throwable -> L3d
            h32.w0 r12 = (h32.w0) r12     // Catch: java.lang.Throwable -> L3d
            if (r12 == 0) goto L84
            java.lang.Long r12 = r12.f67323a     // Catch: java.lang.Throwable -> L3d
            r9 = r12
            goto L85
        L84:
            r9 = r15
        L85:
            java.util.ArrayList r12 = r11.f92463h     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r12 = kotlin.collections.CollectionsKt.d0(r12)     // Catch: java.lang.Throwable -> L3d
            h32.w0 r12 = (h32.w0) r12     // Catch: java.lang.Throwable -> L3d
            if (r12 == 0) goto L93
            h32.f1 r12 = r12.f67324b     // Catch: java.lang.Throwable -> L3d
            r10 = r12
            goto L94
        L93:
            r10 = r15
        L94:
            r1 = r14
            r4 = r13
            kh2.g3.h2(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L3d
        L99:
            kotlin.Unit r12 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r0)
            return
        L9d:
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: nx.s0.h(v.f1, int, ox.b, java.lang.String):void");
    }

    public final void i() {
        synchronized (this.f92458c) {
            synchronized (this.f92458c) {
                hb0.g gVar = hb0.f.f68518a;
                q0 q0Var = this.f92465j;
                gVar.getClass();
                gVar.f68519a.remove(String.valueOf(q0Var.hashCode()));
                Unit unit = Unit.f80348a;
            }
            byte[] thrift = this.f92459d;
            if (thrift == null) {
                g();
                return;
            }
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.w("pinalytics_last_payload_size_kb", thrift.length / 1024.0f);
            vy.m mVar = (vy.m) ((ox.b) this.f92460e.getValue());
            mVar.getClass();
            Intrinsics.checkNotNullParameter(thrift, "thrift");
            fk2.c cVar = new fk2.c(4, new kk2.k(new vy.a(thrift, 0), 1), new ir.j(3, new vy.j(mVar)));
            Intrinsics.checkNotNullExpressionValue(cVar, "flatMapCompletable(...)");
            fk2.c l13 = cVar.l(tk2.e.f118017c);
            Intrinsics.checkNotNullExpressionValue(l13, "subscribeOn(...)");
            nl.b.n(l13, new r0(this, 0), new s2(this, 26));
        }
    }
}
