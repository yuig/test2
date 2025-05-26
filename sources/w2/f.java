package w2;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.autofill.AutofillId;
import androidx.lifecycle.z;
import b4.g;
import b4.m0;
import co2.m;
import g1.h;
import g1.u;
import g1.v;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kh2.g0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import s3.k0;
import s3.q1;
import t3.c0;
import t3.p3;
import t3.r;
import t3.r3;
import ua.j1;
import w3.j;
import z3.i;
import z3.q;
import z3.t;
import z3.x;

/* loaded from: classes.dex */
public final class f implements androidx.lifecycle.f, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f127612a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f127613b;

    /* renamed from: c, reason: collision with root package name */
    public w3.e f127614c;

    /* renamed from: d, reason: collision with root package name */
    public final u f127615d = new u();

    /* renamed from: e, reason: collision with root package name */
    public final v f127616e = new v();

    /* renamed from: f, reason: collision with root package name */
    public final long f127617f = 100;

    /* renamed from: g, reason: collision with root package name */
    public a f127618g = a.SHOW_ORIGINAL;

    /* renamed from: h, reason: collision with root package name */
    public boolean f127619h = true;

    /* renamed from: i, reason: collision with root package name */
    public final h f127620i = new h(0);

    /* renamed from: j, reason: collision with root package name */
    public final m f127621j = l0.b(1, null, 6);

    /* renamed from: k, reason: collision with root package name */
    public final Handler f127622k = new Handler(Looper.getMainLooper());

    /* renamed from: l, reason: collision with root package name */
    public u f127623l;

    /* renamed from: m, reason: collision with root package name */
    public long f127624m;

    /* renamed from: n, reason: collision with root package name */
    public final u f127625n;

    /* renamed from: o, reason: collision with root package name */
    public p3 f127626o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f127627p;

    /* renamed from: q, reason: collision with root package name */
    public final androidx.activity.d f127628q;

    public f(c0 c0Var, r rVar) {
        this.f127612a = c0Var;
        this.f127613b = rVar;
        u uVar = g1.m.f63284a;
        Intrinsics.g(uVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f127623l = uVar;
        this.f127625n = new u();
        q a13 = c0Var.f115889k.a();
        Intrinsics.g(uVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f127626o = new p3(a13, uVar);
        this.f127628q = new androidx.activity.d(this, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:12:0x002a, B:13:0x004e, B:17:0x005b, B:19:0x0063, B:21:0x006c, B:22:0x006f, B:24:0x0073, B:25:0x007c, B:34:0x003c), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008d -> B:13:0x004e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(bl2.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof w2.e
            if (r0 == 0) goto L13
            r0 = r9
            w2.e r0 = (w2.e) r0
            int r1 = r0.f127611v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127611v = r1
            goto L18
        L13:
            w2.e r0 = new w2.e
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f127609t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f127611v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            co2.e r2 = r0.f127608s
            w2.f r5 = r0.f127607r
            ue.c.H(r9)     // Catch: java.lang.Throwable -> L2e
            goto L4e
        L2e:
            r9 = move-exception
            goto L9c
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            co2.e r2 = r0.f127608s
            w2.f r5 = r0.f127607r
            ue.c.H(r9)     // Catch: java.lang.Throwable -> L2e
            goto L5b
        L40:
            ue.c.H(r9)
            co2.m r9 = r8.f127621j     // Catch: java.lang.Throwable -> L9a
            r9.getClass()     // Catch: java.lang.Throwable -> L9a
            co2.e r2 = new co2.e     // Catch: java.lang.Throwable -> L9a
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L9a
            r5 = r8
        L4e:
            r0.f127607r = r5     // Catch: java.lang.Throwable -> L2e
            r0.f127608s = r2     // Catch: java.lang.Throwable -> L2e
            r0.f127611v = r4     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r9 = r2.d(r0)     // Catch: java.lang.Throwable -> L2e
            if (r9 != r1) goto L5b
            return r1
        L5b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L2e
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L2e
            if (r9 == 0) goto L90
            r2.e()     // Catch: java.lang.Throwable -> L2e
            boolean r9 = r5.f()     // Catch: java.lang.Throwable -> L2e
            if (r9 == 0) goto L6f
            r5.g()     // Catch: java.lang.Throwable -> L2e
        L6f:
            boolean r9 = r5.f127627p     // Catch: java.lang.Throwable -> L2e
            if (r9 != 0) goto L7c
            r5.f127627p = r4     // Catch: java.lang.Throwable -> L2e
            android.os.Handler r9 = r5.f127622k     // Catch: java.lang.Throwable -> L2e
            androidx.activity.d r6 = r5.f127628q     // Catch: java.lang.Throwable -> L2e
            r9.post(r6)     // Catch: java.lang.Throwable -> L2e
        L7c:
            g1.h r9 = r5.f127620i     // Catch: java.lang.Throwable -> L2e
            r9.clear()     // Catch: java.lang.Throwable -> L2e
            long r6 = r5.f127617f     // Catch: java.lang.Throwable -> L2e
            r0.f127607r = r5     // Catch: java.lang.Throwable -> L2e
            r0.f127608s = r2     // Catch: java.lang.Throwable -> L2e
            r0.f127611v = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r9 = lb.l0.S(r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r9 != r1) goto L4e
            return r1
        L90:
            g1.h r9 = r5.f127620i
            r9.clear()
            kotlin.Unit r9 = kotlin.Unit.f80348a
            return r9
        L98:
            r5 = r8
            goto L9c
        L9a:
            r9 = move-exception
            goto L98
        L9c:
            g1.h r0 = r5.f127620i
            r0.clear()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.f.a(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r14, w3.j r15) {
        /*
            r13 = this;
            if (r15 != 0) goto L3
            return
        L3:
            g1.v r0 = r13.f127616e
            boolean r1 = r0.c(r14)
            if (r1 == 0) goto L7d
            r0.getClass()
            int r15 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r15 = r15 * r1
            int r1 = r15 << 16
            r15 = r15 ^ r1
            r1 = r15 & 127(0x7f, float:1.78E-43)
            int r2 = r0.f63333c
            int r15 = r15 >>> 7
            r15 = r15 & r2
            r3 = 0
        L21:
            long[] r4 = r0.f63331a
            int r5 = r15 >> 3
            r6 = r15 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L4d:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L68
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r15
            r10 = r10 & r2
            int[] r11 = r0.f63332b
            r11 = r11[r10]
            if (r11 != r14) goto L62
            goto L72
        L62:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L4d
        L68:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L78
            r10 = -1
        L72:
            if (r10 < 0) goto L82
            r0.h(r10)
            goto L82
        L78:
            int r3 = r3 + 8
            int r15 = r15 + r3
            r15 = r15 & r2
            goto L21
        L7d:
            g1.u r0 = r13.f127615d
            r0.l(r14, r15)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.f.b(int, w3.j):void");
    }

    public final void d(int i13) {
        u uVar = this.f127615d;
        if (uVar.c(i13)) {
            uVar.k(i13);
        } else {
            this.f127616e.a(i13);
        }
    }

    public final u e() {
        if (this.f127619h) {
            this.f127619h = false;
            this.f127623l = r3.a(this.f127612a.f115889k);
            this.f127624m = System.currentTimeMillis();
        }
        return this.f127623l;
    }

    public final boolean f() {
        return this.f127614c != null;
    }

    public final void g() {
        w3.e eVar = this.f127614c;
        if (eVar != null && Build.VERSION.SDK_INT >= 29) {
            u uVar = this.f127615d;
            char c13 = 7;
            long j13 = -9187201950435737472L;
            if (uVar.f63329e != 0) {
                ArrayList arrayList = new ArrayList();
                Object[] objArr = uVar.f63327c;
                long[] jArr = uVar.f63325a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j14 = jArr[i13];
                        if ((((~j14) << 7) & j14 & j13) != j13) {
                            int i14 = 8 - ((~(i13 - length)) >>> 31);
                            for (int i15 = 0; i15 < i14; i15++) {
                                if ((j14 & 255) < 128) {
                                    arrayList.add((j) objArr[(i13 << 3) + i15]);
                                }
                                j14 >>= 8;
                            }
                            if (i14 != 8) {
                                break;
                            }
                        }
                        if (i13 == length) {
                            break;
                        }
                        i13++;
                        j13 = -9187201950435737472L;
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    arrayList2.add(((j) arrayList.get(i16)).h());
                }
                eVar.a(arrayList2);
                uVar.a();
            }
            v vVar = this.f127616e;
            if (vVar.f63334d != 0) {
                ArrayList arrayList3 = new ArrayList();
                int[] iArr = vVar.f63332b;
                long[] jArr2 = vVar.f63331a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j15 = jArr2[i17];
                        if ((((~j15) << c13) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i18 = 8 - ((~(i17 - length2)) >>> 31);
                            for (int i19 = 0; i19 < i18; i19++) {
                                if ((j15 & 255) < 128) {
                                    arrayList3.add(Integer.valueOf(iArr[(i17 << 3) + i19]));
                                }
                                j15 >>= 8;
                            }
                            if (i18 != 8) {
                                break;
                            }
                        }
                        if (i17 == length2) {
                            break;
                        }
                        i17++;
                        c13 = 7;
                    }
                }
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i23 = 0; i23 < size2; i23++) {
                    arrayList4.add(Long.valueOf(((Number) arrayList3.get(i23)).intValue()));
                }
                eVar.b(CollectionsKt.G0(arrayList4));
                vVar.b();
            }
        }
    }

    public final void h(k0 k0Var) {
        if (this.f127620i.add(k0Var)) {
            this.f127621j.g(Unit.f80348a);
        }
    }

    public final void i(q qVar, p3 p3Var) {
        List i13 = q.i(qVar, true, 4);
        int size = i13.size();
        for (int i14 = 0; i14 < size; i14++) {
            q qVar2 = (q) i13.get(i14);
            if (e().b(qVar2.f140717g) && !p3Var.f116160b.c(qVar2.f140717g)) {
                m(qVar2);
            }
        }
        u uVar = this.f127625n;
        int[] iArr = uVar.f63326b;
        long[] jArr = uVar.f63325a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j13 = jArr[i15];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((255 & j13) < 128) {
                            int i18 = iArr[(i15 << 3) + i17];
                            if (!e().b(i18)) {
                                d(i18);
                            }
                        }
                        j13 >>= 8;
                    }
                    if (i16 != 8) {
                        break;
                    }
                }
                if (i15 == length) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        List i19 = q.i(qVar, true, 4);
        int size2 = i19.size();
        for (int i23 = 0; i23 < size2; i23++) {
            q qVar3 = (q) i19.get(i23);
            if (e().b(qVar3.f140717g)) {
                int i24 = qVar3.f140717g;
                if (uVar.b(i24)) {
                    Object h10 = uVar.h(i24);
                    if (h10 == null) {
                        jk.r.z("node not present in pruned tree before this change");
                        throw null;
                    }
                    i(qVar3, (p3) h10);
                } else {
                    continue;
                }
            }
        }
    }

    public final void j(int i13, String str) {
        w3.e eVar;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 29 && (eVar = this.f127614c) != null) {
            long j13 = i13;
            Object obj = eVar.f127892a;
            AutofillId a13 = i14 >= 29 ? w3.c.a(j1.b(obj), new w3.a(w3.f.a(eVar.f127893b)).a(), j13) : null;
            if (a13 == null) {
                jk.r.z("Invalid content capture ID");
                throw null;
            }
            if (i14 >= 29) {
                w3.c.e(j1.b(obj), a13, str);
            }
        }
    }

    public final void k(q qVar, p3 p3Var) {
        v vVar = new v();
        List i13 = q.i(qVar, true, 4);
        int size = i13.size();
        int i14 = 0;
        while (true) {
            k0 k0Var = qVar.f140713c;
            if (i14 >= size) {
                v vVar2 = p3Var.f116160b;
                int[] iArr = vVar2.f63332b;
                long[] jArr = vVar2.f63331a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j13 = jArr[i15];
                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i16 = 8 - ((~(i15 - length)) >>> 31);
                            for (int i17 = 0; i17 < i16; i17++) {
                                if ((j13 & 255) < 128 && !vVar.c(iArr[(i15 << 3) + i17])) {
                                    h(k0Var);
                                    return;
                                }
                                j13 >>= 8;
                            }
                            if (i16 != 8) {
                                break;
                            }
                        }
                        if (i15 == length) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
                List i18 = q.i(qVar, true, 4);
                int size2 = i18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    q qVar2 = (q) i18.get(i19);
                    if (e().b(qVar2.f140717g)) {
                        Object h10 = this.f127625n.h(qVar2.f140717g);
                        if (h10 == null) {
                            jk.r.z("node not present in pruned tree before this change");
                            throw null;
                        }
                        k(qVar2, (p3) h10);
                    }
                }
                return;
            }
            q qVar3 = (q) i13.get(i14);
            if (e().b(qVar3.f140717g)) {
                v vVar3 = p3Var.f116160b;
                int i23 = qVar3.f140717g;
                if (!vVar3.c(i23)) {
                    h(k0Var);
                    return;
                }
                vVar.a(i23);
            }
            i14++;
        }
    }

    public final j l(q qVar) {
        int i13;
        AutofillId a13;
        q1 c13;
        String f13;
        w3.e eVar = this.f127614c;
        if (eVar == null || (i13 = Build.VERSION.SDK_INT) < 29) {
            return null;
        }
        w3.a aVar = new w3.a(w3.f.a(this.f127612a));
        q k13 = qVar.k();
        Object obj = eVar.f127892a;
        if (k13 != null) {
            a13 = i13 >= 29 ? w3.c.a(j1.b(obj), new w3.a(w3.f.a(eVar.f127893b)).a(), k13.f140717g) : null;
            if (a13 == null) {
                return null;
            }
        } else {
            a13 = aVar.a();
        }
        int i14 = qVar.f140717g;
        j i15 = i13 >= 29 ? j.i(w3.c.c(j1.b(obj), a13, i14)) : null;
        if (i15 == null) {
            return null;
        }
        x xVar = t.D;
        z3.j jVar = qVar.f140714d;
        if (jVar.f140700a.containsKey(xVar)) {
            return null;
        }
        Bundle a14 = i15.a();
        if (a14 != null) {
            a14.putLong("android.view.contentcapture.EventTimestamp", this.f127624m);
        }
        x xVar2 = t.f140752u;
        LinkedHashMap linkedHashMap = jVar.f140700a;
        Object obj2 = linkedHashMap.get(xVar2);
        if (obj2 == null) {
            obj2 = null;
        }
        String str = (String) obj2;
        if (str != null) {
            i15.e(i14, str);
        }
        Object obj3 = linkedHashMap.get(t.f140753v);
        if (obj3 == null) {
            obj3 = null;
        }
        List list = (List) obj3;
        if (list != null) {
            i15.b("android.widget.TextView");
            i15.f(g0.o(list, "\n"));
        }
        Object obj4 = linkedHashMap.get(t.f140756y);
        if (obj4 == null) {
            obj4 = null;
        }
        g gVar = (g) obj4;
        if (gVar != null) {
            i15.b("android.widget.EditText");
            i15.f(gVar);
        }
        Object obj5 = linkedHashMap.get(t.f140733b);
        if (obj5 == null) {
            obj5 = null;
        }
        List list2 = (List) obj5;
        if (list2 != null) {
            i15.c(g0.o(list2, "\n"));
        }
        Object obj6 = linkedHashMap.get(t.f140751t);
        if (obj6 == null) {
            obj6 = null;
        }
        z3.g gVar2 = (z3.g) obj6;
        if (gVar2 != null && (f13 = r3.f(gVar2.f140670a)) != null) {
            i15.b(f13);
        }
        m0 c14 = r3.c(jVar);
        if (c14 != null) {
            b4.l0 d2 = c14.d();
            i15.g(d2.a().j0() * d2.a().b() * n4.m.c(d2.b().c()));
        }
        q k14 = qVar.k();
        a3.d dVar = a3.d.f483e;
        if (k14 != null && (c13 = qVar.c()) != null) {
            q1 q1Var = c13.X0().f120054m ? c13 : null;
            if (q1Var != null) {
                dVar = com.bumptech.glide.c.S0(k14.f140711a, 8).J(q1Var, true);
            }
        }
        i15.d((int) dVar.f484a, (int) dVar.f485b, (int) dVar.d(), (int) dVar.c());
        return i15;
    }

    public final void m(q qVar) {
        if (f()) {
            o(qVar);
            b(qVar.f140717g, l(qVar));
            List l13 = qVar.l();
            int size = l13.size();
            for (int i13 = 0; i13 < size; i13++) {
                m((q) l13.get(i13));
            }
        }
    }

    public final void n(q qVar) {
        if (f()) {
            d(qVar.f140717g);
            List l13 = qVar.l();
            int size = l13.size();
            for (int i13 = 0; i13 < size; i13++) {
                n((q) l13.get(i13));
            }
        }
    }

    public final void o(q qVar) {
        Function1 function1;
        Function1 function12;
        z3.j jVar = qVar.f140714d;
        t tVar = t.f140732a;
        Boolean bool = (Boolean) bs1.c.M0(jVar, t.f140755x);
        if (this.f127618g == a.SHOW_ORIGINAL && Intrinsics.d(bool, Boolean.TRUE)) {
            x xVar = i.f140674a;
            z3.a aVar = (z3.a) bs1.c.M0(jVar, i.f140684k);
            if (aVar == null || (function12 = (Function1) aVar.f140659b) == null) {
                return;
            }
            return;
        }
        if (this.f127618g == a.SHOW_TRANSLATED && Intrinsics.d(bool, Boolean.FALSE)) {
            x xVar2 = i.f140674a;
            z3.a aVar2 = (z3.a) bs1.c.M0(jVar, i.f140684k);
            if (aVar2 == null || (function1 = (Function1) aVar2.f140659b) == null) {
                return;
            }
        }
    }

    @Override // androidx.lifecycle.f
    public final void onStart(z zVar) {
        this.f127614c = (w3.e) this.f127613b.invoke();
        m(this.f127612a.f115889k.a());
        g();
    }

    @Override // androidx.lifecycle.f
    public final void onStop(z zVar) {
        n(this.f127612a.f115889k.a());
        g();
        this.f127614c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f127622k.removeCallbacks(this.f127628q);
        this.f127614c = null;
    }
}
