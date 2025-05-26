package rm2;

import java.util.Set;
import kotlin.collections.g1;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f108781b = g1.b(sm2.b.CLASS);

    /* renamed from: c, reason: collision with root package name */
    public static final Set f108782c = h1.f(sm2.b.FILE_FACADE, sm2.b.MULTIFILE_CLASS_PART);

    /* renamed from: d, reason: collision with root package name */
    public static final xm2.g f108783d;

    /* renamed from: e, reason: collision with root package name */
    public static final xm2.g f108784e;

    /* renamed from: a, reason: collision with root package name */
    public ln2.o f108785a;

    static {
        new xm2.g(1, 1, 2);
        f108783d = new xm2.g(1, 1, 11);
        f108784e = new xm2.g(1, 1, 13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (rm2.r.f108782c.contains(r2.f113274a) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final nn2.r a(dm2.k0 r12, rm2.f0 r13) {
        /*
            r11 = this;
            java.lang.String r0 = "Could not read data from "
            java.lang.String r1 = "descriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            java.lang.String r1 = "kotlinClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            r1 = r13
            fm2.c r1 = (fm2.c) r1
            sm2.c r2 = r1.f62577b
            java.lang.String[] r3 = r2.f113276c
            if (r3 != 0) goto L17
            java.lang.String[] r3 = r2.f113277d
        L17:
            r4 = 0
            if (r3 == 0) goto L25
            sm2.b r2 = r2.f113274a
            java.util.Set r5 = rm2.r.f108782c
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L25
            goto L26
        L25:
            r3 = r4
        L26:
            if (r3 != 0) goto L29
            return r4
        L29:
            sm2.c r2 = r1.f62577b
            java.lang.String[] r2 = r2.f113278e
            if (r2 != 0) goto L30
            return r4
        L30:
            kotlin.Pair r0 = xm2.j.h(r3, r2)     // Catch: java.lang.Throwable -> L35 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L37
            goto L6f
        L35:
            r0 = move-exception
            goto L51
        L37:
            r2 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L35
            r0 = r13
            fm2.c r0 = (fm2.c) r0     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r0.a()     // Catch: java.lang.Throwable -> L35
            r5.append(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L35
            r3.<init>(r0, r2)     // Catch: java.lang.Throwable -> L35
            throw r3     // Catch: java.lang.Throwable -> L35
        L51:
            ln2.o r2 = r11.c()
            ln2.q r2 = r2.f84110c
            r2.getClass()
            sm2.c r1 = r1.f62577b
            xm2.g r1 = r1.f113275b
            ln2.o r2 = r11.c()
            ln2.q r2 = r2.f84110c
            xm2.g r2 = wn2.k.i(r2)
            boolean r1 = r1.c(r2)
            if (r1 != 0) goto Lb6
            r0 = r4
        L6f:
            if (r0 != 0) goto L72
            return r4
        L72:
            java.lang.Object r1 = r0.f80346a
            r5 = r1
            xm2.h r5 = (xm2.h) r5
            java.lang.Object r0 = r0.f80347b
            r4 = r0
            tm2.e0 r4 = (tm2.e0) r4
            rm2.u r7 = new rm2.u
            r11.d(r13)
            r11.e(r13)
            nn2.k r0 = r11.b(r13)
            r7.<init>(r13, r4, r5, r0)
            nn2.r r0 = new nn2.r
            fm2.c r13 = (fm2.c) r13
            sm2.c r13 = r13.f62577b
            xm2.g r6 = r13.f113275b
            ln2.o r8 = r11.c()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "scope for "
            r13.<init>(r1)
            r13.append(r7)
            java.lang.String r1 = " in "
            r13.append(r1)
            r13.append(r12)
            java.lang.String r9 = r13.toString()
            rm2.q r10 = rm2.q.f108780i
            r2 = r0
            r3 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        Lb6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rm2.r.a(dm2.k0, rm2.f0):nn2.r");
    }

    public final nn2.k b(f0 f0Var) {
        c().f84110c.getClass();
        int i13 = ((fm2.c) f0Var).f62577b.f113280g;
        return (((i13 & 64) != 0) && (i13 & 32) == 0) ? nn2.k.FIR_UNSTABLE : ((i13 & 16) == 0 || (i13 & 32) != 0) ? nn2.k.STABLE : nn2.k.IR_UNSTABLE;
    }

    public final ln2.o c() {
        ln2.o oVar = this.f108785a;
        if (oVar != null) {
            return oVar;
        }
        Intrinsics.r("components");
        throw null;
    }

    public final ln2.w d(f0 f0Var) {
        c().f84110c.getClass();
        fm2.c cVar = (fm2.c) f0Var;
        if (cVar.f62577b.f113275b.c(wn2.k.i(c().f84110c))) {
            return null;
        }
        sm2.c cVar2 = cVar.f62577b;
        xm2.g gVar = cVar2.f113275b;
        xm2.g gVar2 = xm2.g.f135403g;
        xm2.g i13 = wn2.k.i(c().f84110c);
        xm2.g i14 = wn2.k.i(c().f84110c);
        boolean d2 = cVar2.f113275b.d();
        i14.getClass();
        xm2.g gVar3 = d2 ? gVar2 : xm2.g.f135404h;
        gVar3.getClass();
        int i15 = i14.f126211b;
        int i16 = gVar3.f126211b;
        if (i16 > i15 || (i16 >= i15 && gVar3.f126212c > i14.f126212c)) {
            i14 = gVar3;
        }
        return new ln2.w(gVar, gVar2, i13, i14, cVar.a(), gm2.d.a(cVar.f62576a));
    }

    public final boolean e(f0 f0Var) {
        c().f84110c.getClass();
        c().f84110c.getClass();
        sm2.c cVar = ((fm2.c) f0Var).f62577b;
        return (cVar.f113280g & 2) != 0 && Intrinsics.d(cVar.f113275b, f108783d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (rm2.r.f108781b.contains(r1.f113274a) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ln2.h f(rm2.f0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Could not read data from "
            java.lang.String r1 = "kotlinClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            r1 = r7
            fm2.c r1 = (fm2.c) r1
            sm2.c r1 = r1.f62577b
            java.lang.String[] r2 = r1.f113276c
            if (r2 != 0) goto L12
            java.lang.String[] r2 = r1.f113277d
        L12:
            r3 = 0
            if (r2 == 0) goto L20
            sm2.b r4 = r1.f113274a
            java.util.Set r5 = rm2.r.f108781b
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L20
            goto L21
        L20:
            r2 = r3
        L21:
            if (r2 != 0) goto L24
            return r3
        L24:
            java.lang.String[] r4 = r1.f113278e
            if (r4 != 0) goto L29
            return r3
        L29:
            kotlin.Pair r0 = xm2.j.f(r2, r4)     // Catch: java.lang.Throwable -> L2e kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L30
            goto L66
        L2e:
            r0 = move-exception
            goto L4a
        L30:
            r2 = move-exception
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            r0 = r7
            fm2.c r0 = (fm2.c) r0     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = r0.a()     // Catch: java.lang.Throwable -> L2e
            r5.append(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L2e
            r4.<init>(r0, r2)     // Catch: java.lang.Throwable -> L2e
            throw r4     // Catch: java.lang.Throwable -> L2e
        L4a:
            ln2.o r2 = r6.c()
            ln2.q r2 = r2.f84110c
            r2.getClass()
            xm2.g r2 = r1.f113275b
            ln2.o r4 = r6.c()
            ln2.q r4 = r4.f84110c
            xm2.g r4 = wn2.k.i(r4)
            boolean r2 = r2.c(r4)
            if (r2 != 0) goto L88
            r0 = r3
        L66:
            if (r0 != 0) goto L69
            return r3
        L69:
            java.lang.Object r2 = r0.f80346a
            xm2.h r2 = (xm2.h) r2
            java.lang.Object r0 = r0.f80347b
            tm2.k r0 = (tm2.k) r0
            rm2.h0 r3 = new rm2.h0
            r6.d(r7)
            r6.e(r7)
            nn2.k r4 = r6.b(r7)
            r3.<init>(r7, r4)
            ln2.h r7 = new ln2.h
            xm2.g r1 = r1.f113275b
            r7.<init>(r2, r0, r1, r3)
            return r7
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rm2.r.f(rm2.f0):ln2.h");
    }
}
