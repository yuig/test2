package pm0;

import ao2.j0;
import ao2.v0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import x02.u2;
import x02.x0;
import x40.f7;

/* loaded from: classes5.dex */
public final class j implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final oc.c f100676a;

    /* renamed from: b, reason: collision with root package name */
    public final b60.b f100677b;

    /* renamed from: c, reason: collision with root package name */
    public final x0 f100678c;

    /* renamed from: d, reason: collision with root package name */
    public final u2 f100679d;

    /* renamed from: e, reason: collision with root package name */
    public final u f100680e;

    /* renamed from: f, reason: collision with root package name */
    public final s f100681f;

    public j(oc.c apolloClient, b60.b activeUserManager, x0 boardRepository, u2 userFeedRepository, u modalEnvironment, s groupMessageSender) {
        mk0.f ordering = mk0.f.f87346a;
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(userFeedRepository, "userFeedRepository");
        Intrinsics.checkNotNullParameter(ordering, "ordering");
        Intrinsics.checkNotNullParameter(modalEnvironment, "modalEnvironment");
        Intrinsics.checkNotNullParameter(groupMessageSender, "groupMessageSender");
        this.f100676a = apolloClient;
        this.f100677b = activeUserManager;
        this.f100678c = boardRepository;
        this.f100679d = userFeedRepository;
        this.f100680e = modalEnvironment;
        this.f100681f = groupMessageSender;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(pm0.j r5, pm0.r r6, u50.r r7, bl2.c r8) {
        /*
            r5.getClass()
            boolean r0 = r8 instanceof pm0.e
            if (r0 == 0) goto L16
            r0 = r8
            pm0.e r0 = (pm0.e) r0
            int r1 = r0.f100652v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f100652v = r1
            goto L1b
        L16:
            pm0.e r0 = new pm0.e
            r0.<init>(r5, r8)
        L1b:
            java.lang.Object r8 = r0.f100650t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f100652v
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            pm0.r r6 = r0.f100649s
            pm0.j r5 = r0.f100648r
            ue.c.H(r8)
            goto L62
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            ue.c.H(r8)
            java.lang.String r8 = r6.f100692c
            java.lang.String[] r8 = new java.lang.String[]{r8}
            x02.u2 r2 = r5.f100679d
            r4 = 3
            uj2.q r8 = r2.f(r8, r4)
            do2.c r8 = kotlin.jvm.internal.j.a(r8)
            pm0.d r2 = new pm0.d
            r4 = 0
            r2.<init>(r5, r7, r4, r3)
            do2.j0 r7 = new do2.j0
            r7.<init>(r8, r2)
            r0.f100648r = r5
            r0.f100649s = r6
            r0.f100652v = r3
            java.lang.Object r8 = lb.l0.h0(r7, r0)
            if (r8 != r1) goto L62
            goto L8b
        L62:
            com.pinterest.api.model.UserFeed r8 = (com.pinterest.api.model.UserFeed) r8
            pm0.g0 r1 = pm0.g0.f100665a
            if (r8 != 0) goto L69
            goto L8b
        L69:
            lk0.d r7 = lk0.d.f83648a
            java.util.List r7 = r8.q()
            java.lang.String r8 = "getItems(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            java.util.ArrayList r7 = lk0.d.a(r7)
            boolean r8 = r7.isEmpty()
            r8 = r8 ^ r3
            if (r8 == 0) goto L8b
            pm0.a0 r8 = new pm0.a0
            java.util.List r5 = r5.o(r6, r7)
            kotlin.collections.q0 r7 = kotlin.collections.q0.f80391a
            r8.<init>(r6, r5, r7)
            r1 = r8
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pm0.j.j(pm0.j, pm0.r, u50.r, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(pm0.j r5, pm0.r r6, u50.r r7, bl2.c r8) {
        /*
            r5.getClass()
            boolean r0 = r8 instanceof pm0.f
            if (r0 == 0) goto L16
            r0 = r8
            pm0.f r0 = (pm0.f) r0
            int r1 = r0.f100657v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f100657v = r1
            goto L1b
        L16:
            pm0.f r0 = new pm0.f
            r0.<init>(r5, r8)
        L1b:
            java.lang.Object r8 = r0.f100655t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f100657v
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            pm0.r r6 = r0.f100654s
            pm0.j r5 = r0.f100653r
            ue.c.H(r8)
            goto L47
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            ue.c.H(r8)
            r0.f100653r = r5
            r0.f100654s = r6
            r0.f100657v = r3
            java.io.Serializable r8 = r5.m(r6, r7, r0)
            if (r8 != r1) goto L47
            goto Lcd
        L47:
            r7 = r8
            java.util.List r7 = (java.util.List) r7
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r3
            r0 = 0
            if (r7 == 0) goto L55
            goto L56
        L55:
            r8 = r0
        L56:
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L5e
            pm0.g0 r1 = pm0.g0.f100665a
            goto Lcd
        L5e:
            r5.getClass()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L71:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lc2
            java.lang.Object r2 = r8.next()
            x40.g7 r2 = (x40.g7) r2
            x40.f7 r3 = r2.f132436e
            if (r3 == 0) goto L84
            java.lang.String r3 = r3.f132378c
            goto L85
        L84:
            r3 = r0
        L85:
            java.lang.String r4 = r6.f100694e
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r4)
            x40.f7 r4 = r2.f132436e
            if (r3 != 0) goto Lb3
            java.lang.String r3 = "accepted"
            java.lang.Object r2 = r2.f132435d
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r3)
            if (r2 != 0) goto Lb3
            if (r4 == 0) goto L9e
            java.lang.String r2 = r4.f132378c
            goto L9f
        L9e:
            r2 = r0
        L9f:
            java.lang.String r3 = r6.f100694e
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r3)
            if (r2 == 0) goto La8
            goto Lb3
        La8:
            if (r4 == 0) goto Lad
            java.lang.String r2 = r4.f132378c
            goto Lae
        Lad:
            r2 = r0
        Lae:
            if (r2 == 0) goto Lb3
            r7.add(r2)
        Lb3:
            if (r4 == 0) goto Lbb
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            goto Lbc
        Lbb:
            r4 = r0
        Lbc:
            if (r4 == 0) goto L71
            r1.add(r4)
            goto L71
        Lc2:
            java.util.List r5 = r5.o(r6, r1)
            java.util.List r5 = (java.util.List) r5
            pm0.a0 r1 = new pm0.a0
            r1.<init>(r6, r5, r7)
        Lcd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pm0.j.k(pm0.j, pm0.r, u50.r, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|7|(1:(2:10|11)(2:29|30))(2:31|(4:33|(2:35|(2:37|38))|20|21)(2:39|40))|12|13|(1:15)(1:27)|16|(1:18)(3:23|(1:25)|26)|19|20|21))|43|6|7|(0)(0)|12|13|(0)(0)|16|(0)(0)|19|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0030, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
    
        r8 = xk2.s.f135225b;
        r8 = ue.c.m(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object l(pm0.j r4, pm0.r r5, java.util.ArrayList r6, u50.r r7, bl2.c r8) {
        /*
            r4.getClass()
            boolean r0 = r8 instanceof pm0.g
            if (r0 == 0) goto L16
            r0 = r8
            pm0.g r0 = (pm0.g) r0
            int r1 = r0.f100664w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f100664w = r1
            goto L1b
        L16:
            pm0.g r0 = new pm0.g
            r0.<init>(r4, r8)
        L1b:
            java.lang.Object r8 = r0.f100662u
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f100664w
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            u50.r r7 = r0.f100661t
            pm0.r r5 = r0.f100660s
            pm0.j r4 = r0.f100659r
            ue.c.H(r8)     // Catch: java.lang.Throwable -> L30
            goto L7f
        L30:
            r6 = move-exception
            goto L84
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            ue.c.H(r8)
            com.pinterest.api.model.wy0 r8 = r5.f100693d
            if (r8 == 0) goto Lcb
            lk0.d r2 = lk0.d.f83648a
            x40.f7 r8 = lk0.d.b(r8)
            java.util.List r8 = kotlin.collections.e0.b(r8)
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.ArrayList r6 = kotlin.collections.CollectionsKt.l0(r6, r8)
            boolean r8 = r6.isEmpty()
            r8 = r8 ^ r3
            if (r8 == 0) goto Lc8
            xk2.q r8 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L30
            pm0.s r8 = r4.f100681f     // Catch: java.lang.Throwable -> L30
            r0.f100659r = r4     // Catch: java.lang.Throwable -> L30
            r0.f100660s = r5     // Catch: java.lang.Throwable -> L30
            r0.f100661t = r7     // Catch: java.lang.Throwable -> L30
            r0.f100664w = r3     // Catch: java.lang.Throwable -> L30
            r8.getClass()     // Catch: java.lang.Throwable -> L30
            oo1.j r2 = oo1.j.f96854a     // Catch: java.lang.Throwable -> L30
            no1.e r8 = r8.f100695a     // Catch: java.lang.Throwable -> L30
            kk2.m r6 = oo1.j.t(r6, r8)     // Catch: java.lang.Throwable -> L30
            uj2.q r6 = r6.u()     // Catch: java.lang.Throwable -> L30
            java.lang.String r8 = "toObservable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r8)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = kh2.j.q(r6, r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r1) goto L7f
            goto Lcd
        L7f:
            z40.n r8 = (z40.n) r8     // Catch: java.lang.Throwable -> L30
            xk2.q r6 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L30
            goto L8a
        L84:
            xk2.q r8 = xk2.s.f135225b
            xk2.r r8 = ue.c.m(r6)
        L8a:
            boolean r6 = r8 instanceof xk2.r
            r0 = 0
            if (r6 == 0) goto L91
            r6 = r0
            goto L92
        L91:
            r6 = r8
        L92:
            z40.n r6 = (z40.n) r6
            if (r6 == 0) goto La6
            pm0.s r4 = r4.f100681f
            r4.getClass()
            java.lang.String r8 = "conversation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r8)
            m60.w r4 = r4.f100696b
            oo1.j.s(r4, r0, r6)
            goto Lbe
        La6:
            java.lang.Throwable r6 = xk2.s.a(r8)
            if (r6 != 0) goto Lb3
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r8 = "Failed to create group message"
            r6.<init>(r8)
        Lb3:
            r4.getClass()
            pm0.v r4 = new pm0.v
            r4.<init>(r6)
            r7.a(r4)
        Lbe:
            pm0.y r4 = new pm0.y
            java.lang.String r5 = r5.f100692c
            r4.<init>(r5)
            r7.a(r4)
        Lc8:
            kotlin.Unit r1 = kotlin.Unit.f80348a
            goto Lcd
        Lcb:
            kotlin.Unit r1 = kotlin.Unit.f80348a
        Lcd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pm0.j.l(pm0.j, pm0.r, java.util.ArrayList, u50.r, bl2.c):java.lang.Object");
    }

    public static void p(u50.r rVar, Throwable th3) {
        rVar.a(new v(th3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ba, code lost:
    
        if (r7 == 0) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable m(pm0.r r6, u50.r r7, bl2.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof pm0.c
            if (r0 == 0) goto L13
            r0 = r8
            pm0.c r0 = (pm0.c) r0
            int r1 = r0.f100640t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f100640t = r1
            goto L18
        L13:
            pm0.c r0 = new pm0.c
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f100638r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f100640t
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            ue.c.H(r8)
            goto L5d
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            ue.c.H(r8)
            x40.m7 r8 = new x40.m7
            java.lang.String r6 = r6.f100692c
            r8.<init>(r6)
            oc.c r6 = r5.f100676a
            oc.a r6 = r6.c(r8)
            vc.f r8 = vc.f.NetworkOnly
            d7.b.E(r6, r8)
            do2.i r6 = r6.d()
            pm0.d r8 = new pm0.d
            r2 = 0
            r8.<init>(r5, r7, r3, r2)
            do2.j0 r7 = new do2.j0
            r7.<init>(r6, r8)
            r0.f100640t = r4
            java.lang.Object r8 = lb.l0.h0(r7, r0)
            if (r8 != r1) goto L5d
            return r1
        L5d:
            pc.h r8 = (pc.h) r8
            if (r8 == 0) goto Lbd
            java.lang.String r6 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r6)
            pc.n0 r7 = r8.f99563c
            x40.l7 r7 = (x40.l7) r7
            if (r7 == 0) goto Lb8
            x40.b7 r7 = r7.f132705a
            if (r7 == 0) goto Lb8
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r6)
            boolean r8 = r7 instanceof x40.k7
            if (r8 == 0) goto L7a
            x40.k7 r7 = (x40.k7) r7
            goto L7b
        L7a:
            r7 = r3
        L7b:
            if (r7 == 0) goto Lb8
            x40.c7 r7 = r7.f132668e
            if (r7 == 0) goto Lb8
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r6)
            boolean r6 = r7 instanceof x40.j7
            if (r6 == 0) goto L8b
            r3 = r7
            x40.j7 r3 = (x40.j7) r3
        L8b:
            if (r3 == 0) goto Lb8
            x40.i7 r6 = r3.f132594b
            if (r6 == 0) goto Lb8
            java.util.List r6 = r6.f132543a
            if (r6 == 0) goto Lb8
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r6 = kotlin.collections.CollectionsKt.Q(r6)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        La4:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lba
            java.lang.Object r8 = r6.next()
            x40.h7 r8 = (x40.h7) r8
            x40.g7 r8 = r8.f132491a
            if (r8 == 0) goto La4
            r7.add(r8)
            goto La4
        Lb8:
            kotlin.collections.q0 r7 = kotlin.collections.q0.f80391a
        Lba:
            if (r7 == 0) goto Lbd
            goto Lbf
        Lbd:
            kotlin.collections.q0 r7 = kotlin.collections.q0.f80391a
        Lbf:
            java.io.Serializable r7 = (java.io.Serializable) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pm0.j.m(pm0.r, u50.r, bl2.c):java.io.Serializable");
    }

    @Override // l82.g
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void e(j0 scope, k request, u50.r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof f0) {
            String str = ((f0) request).f100658a;
            ko2.f fVar = v0.f20219a;
            kotlin.jvm.internal.j.z(scope, ko2.e.f80326c, null, new i(this, str, eventIntake, null), 2);
            return;
        }
        if (request instanceof c0) {
            v7 v7Var = ((c0) request).f100641a;
            String uid = v7Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            eventIntake.a(new z(uid));
            ko2.f fVar2 = v0.f20219a;
            kotlin.jvm.internal.j.z(scope, ko2.e.f80326c, null, new h(this, v7Var, eventIntake, null), 2);
            return;
        }
        if (request instanceof b0) {
            b0 b0Var = (b0) request;
            v7 v7Var2 = b0Var.f100636a;
            boolean h03 = kh2.w.h0(v7Var2);
            Integer J0 = v7Var2.J0();
            Intrinsics.checkNotNullExpressionValue(J0, "getCollaboratorCount(...)");
            boolean z13 = J0.intValue() > 0;
            t tVar = b0Var.f100637b;
            boolean z14 = tVar instanceof a;
            u uVar = this.f100680e;
            if (!z14) {
                if (!(tVar instanceof x)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!h03 || z13 || ((x) tVar).f100706a) {
                    if (h03) {
                        m60.w wVar = uVar.f100703g;
                        wVar.d(new jc0.v(new xo.i(v7Var2, uVar.f100698b, uVar.f100699c, uVar.f100702f, wVar, uVar.f100701e, uVar.f100697a, uVar.f100700d, 1), false, 0L, 30));
                        return;
                    } else {
                        m60.w wVar2 = uVar.f100703g;
                        wVar2.d(new jc0.v(new xo.i(v7Var2, uVar.f100698b, uVar.f100699c, uVar.f100702f, wVar2, uVar.f100701e, uVar.f100697a, uVar.f100700d, 0), false, 0L, 30));
                        return;
                    }
                }
            }
            uVar.f100700d.n(v7Var2, 5, uVar.f100703g, true, 8);
        }
    }

    public final List o(r rVar, ArrayList arrayList) {
        f7 f7Var;
        wy0 k13 = rVar.f100690a.k1();
        f7 f7Var2 = null;
        if (k13 != null) {
            lk0.d dVar = lk0.d.f83648a;
            f7Var = lk0.d.b(k13);
        } else {
            f7Var = null;
        }
        wy0 f13 = ((b60.d) this.f100677b).f();
        if (f13 != null) {
            lk0.d dVar2 = lk0.d.f83648a;
            f7Var2 = lk0.d.b(f13);
        }
        return mk0.f.f87346a.b(f7Var, f7Var2, arrayList);
    }
}
