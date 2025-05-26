package a6;

import ao2.o1;
import do2.t2;
import do2.u2;
import i1.a1;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import k1.s2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j0 implements h {

    /* renamed from: j, reason: collision with root package name */
    public static final LinkedHashSet f853j = new LinkedHashSet();

    /* renamed from: k, reason: collision with root package name */
    public static final Object f854k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f855a;

    /* renamed from: b, reason: collision with root package name */
    public final l f856b;

    /* renamed from: c, reason: collision with root package name */
    public final a f857c;

    /* renamed from: d, reason: collision with root package name */
    public final pb.k f858d;

    /* renamed from: e, reason: collision with root package name */
    public final String f859e;

    /* renamed from: f, reason: collision with root package name */
    public final xk2.v f860f;

    /* renamed from: g, reason: collision with root package name */
    public final t2 f861g;

    /* renamed from: h, reason: collision with root package name */
    public List f862h;

    /* renamed from: i, reason: collision with root package name */
    public final com.google.firebase.messaging.q f863i;

    public j0(Function0 produceFile, l serializer, List initTasksList, a corruptionHandler, ao2.j0 scope) {
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f855a = produceFile;
        this.f856b = serializer;
        this.f857c = corruptionHandler;
        this.f858d = new pb.k(new x(this, null));
        this.f859e = ".tmp";
        this.f860f = xk2.m.b(new androidx.activity.a0(this, 21));
        this.f861g = u2.a(l0.f865a);
        this.f862h = CollectionsKt.F0(initTasksList);
        s2 onComplete = new s2(this, 22);
        r onUndeliveredElement = r.f875i;
        s consumeMessage = new s(this, null);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        com.google.firebase.messaging.q qVar = new com.google.firebase.messaging.q();
        qVar.f33803a = scope;
        qVar.f33804b = consumeMessage;
        qVar.f33805c = lb.l0.b(Integer.MAX_VALUE, null, 6);
        qVar.f33806d = new AtomicInteger(0);
        o1 o1Var = (o1) ((ao2.j0) qVar.f33803a).getCoroutineContext().get(ao2.g0.f20154b);
        if (o1Var != null) {
            o1Var.invokeOnCompletion(new a1(onComplete, qVar, onUndeliveredElement, 5));
        }
        this.f863i = qVar;
    }

    public static final Object b(j0 j0Var, n nVar, bl2.c cVar) {
        k0 k0Var = (k0) j0Var.f861g.getValue();
        if (!(k0Var instanceof b)) {
            if (k0Var instanceof k) {
                if (k0Var == nVar.f869a) {
                    Object g13 = j0Var.g(cVar);
                    return g13 == cl2.a.COROUTINE_SUSPENDED ? g13 : Unit.f80348a;
                }
            } else {
                if (Intrinsics.d(k0Var, l0.f865a)) {
                    Object g14 = j0Var.g(cVar);
                    return g14 == cl2.a.COROUTINE_SUSPENDED ? g14 : Unit.f80348a;
                }
                if (k0Var instanceof j) {
                    throw new IllegalStateException("Can't read in final state.".toString());
                }
            }
        }
        return Unit.f80348a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(12:5|6|7|(7:(1:(1:(1:12)(2:23|24))(3:25|26|27))(1:32)|13|14|15|(1:17)(1:21)|18|19)(4:33|34|35|(8:37|(2:39|40)|30|14|15|(0)(0)|18|19)(4:41|(2:54|(2:56|57)(2:58|59))|44|(2:46|(2:48|49))(2:50|51)))|28|(1:31)|30|14|15|(0)(0)|18|19))|64|6|7|(0)(0)|28|(0)|30|14|15|(0)(0)|18|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0035, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r8v0, types: [a6.j0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(a6.j0 r8, a6.o r9, bl2.c r10) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.j0.c(a6.j0, a6.o, bl2.c):java.lang.Object");
    }

    @Override // a6.h
    public final Object a(Function2 function2, bl2.c cVar) {
        ao2.w a13 = ue.c.a();
        this.f863i.r(new o(function2, a13, (k0) this.f861g.getValue(), cVar.getContext()));
        Object v13 = a13.v(cVar);
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        return v13;
    }

    public final File d() {
        return (File) this.f860f.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(bl2.c r13) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.j0.e(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(bl2.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof a6.c0
            if (r0 == 0) goto L13
            r0 = r5
            a6.c0 r0 = (a6.c0) r0
            int r1 = r0.f806u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f806u = r1
            goto L18
        L13:
            a6.c0 r0 = new a6.c0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f804s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f806u
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            a6.j0 r0 = r0.f803r
            ue.c.H(r5)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r5 = move-exception
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            ue.c.H(r5)
            r0.f803r = r4     // Catch: java.lang.Throwable -> L44
            r0.f806u = r3     // Catch: java.lang.Throwable -> L44
            java.lang.Object r5 = r4.e(r0)     // Catch: java.lang.Throwable -> L44
            if (r5 != r1) goto L41
            return r1
        L41:
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        L44:
            r5 = move-exception
            r0 = r4
        L46:
            do2.t2 r0 = r0.f861g
            a6.k r1 = new a6.k
            r1.<init>(r5)
            r0.i(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.j0.f(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(bl2.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof a6.d0
            if (r0 == 0) goto L13
            r0 = r5
            a6.d0 r0 = (a6.d0) r0
            int r1 = r0.f815u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f815u = r1
            goto L18
        L13:
            a6.d0 r0 = new a6.d0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f813s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f815u
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            a6.j0 r0 = r0.f812r
            ue.c.H(r5)     // Catch: java.lang.Throwable -> L29
            goto L4d
        L29:
            r5 = move-exception
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            ue.c.H(r5)
            r0.f812r = r4     // Catch: java.lang.Throwable -> L41
            r0.f815u = r3     // Catch: java.lang.Throwable -> L41
            java.lang.Object r5 = r4.e(r0)     // Catch: java.lang.Throwable -> L41
            if (r5 != r1) goto L4d
            return r1
        L41:
            r5 = move-exception
            r0 = r4
        L43:
            do2.t2 r0 = r0.f861g
            a6.k r1 = new a6.k
            r1.<init>(r5)
            r0.i(r1)
        L4d:
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.j0.g(bl2.c):java.lang.Object");
    }

    @Override // a6.h
    public final do2.i getData() {
        return this.f858d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12, types: [a6.j0] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [a6.e0, bl2.c] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [a6.j0] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v2, types: [a6.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(bl2.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof a6.e0
            if (r0 == 0) goto L13
            r0 = r5
            a6.e0 r0 = (a6.e0) r0
            int r1 = r0.f822v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f822v = r1
            goto L18
        L13:
            a6.e0 r0 = new a6.e0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f820t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f822v
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.io.FileInputStream r1 = r0.f819s
            a6.j0 r0 = r0.f818r
            ue.c.H(r5)     // Catch: java.lang.Throwable -> L2b
            goto L53
        L2b:
            r5 = move-exception
            goto L5e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            ue.c.H(r5)
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L64
            java.io.File r2 = r4.d()     // Catch: java.io.FileNotFoundException -> L64
            r5.<init>(r2)     // Catch: java.io.FileNotFoundException -> L64
            a6.l r2 = r4.f856b     // Catch: java.lang.Throwable -> L5a
            r0.f818r = r4     // Catch: java.lang.Throwable -> L5a
            r0.f819s = r5     // Catch: java.lang.Throwable -> L5a
            r0.f822v = r3     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r0 = r2.readFrom(r5, r0)     // Catch: java.lang.Throwable -> L5a
            if (r0 != r1) goto L50
            return r1
        L50:
            r1 = r5
            r5 = r0
            r0 = r4
        L53:
            r2 = 0
            dl2.b.J(r1, r2)     // Catch: java.io.FileNotFoundException -> L58
            return r5
        L58:
            r5 = move-exception
            goto L66
        L5a:
            r0 = move-exception
            r1 = r5
            r5 = r0
            r0 = r4
        L5e:
            throw r5     // Catch: java.lang.Throwable -> L5f
        L5f:
            r2 = move-exception
            dl2.b.J(r1, r5)     // Catch: java.io.FileNotFoundException -> L58
            throw r2     // Catch: java.io.FileNotFoundException -> L58
        L64:
            r5 = move-exception
            r0 = r4
        L66:
            java.io.File r1 = r0.d()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L77
            a6.l r5 = r0.f856b
            java.lang.Object r5 = r5.getDefaultValue()
            return r5
        L77:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.j0.h(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(bl2.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a6.f0
            if (r0 == 0) goto L13
            r0 = r8
            a6.f0 r0 = (a6.f0) r0
            int r1 = r0.f834v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f834v = r1
            goto L18
        L13:
            a6.f0 r0 = new a6.f0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f832t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f834v
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r0.f831s
            java.lang.Object r0 = r0.f830r
            androidx.datastore.core.CorruptionException r0 = (androidx.datastore.core.CorruptionException) r0
            ue.c.H(r8)     // Catch: java.io.IOException -> L33
            goto L85
        L33:
            r8 = move-exception
            goto L88
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3d:
            java.lang.Object r2 = r0.f831s
            androidx.datastore.core.CorruptionException r2 = (androidx.datastore.core.CorruptionException) r2
            java.lang.Object r4 = r0.f830r
            a6.j0 r4 = (a6.j0) r4
            ue.c.H(r8)
            goto L77
        L49:
            java.lang.Object r2 = r0.f830r
            a6.j0 r2 = (a6.j0) r2
            ue.c.H(r8)     // Catch: androidx.datastore.core.CorruptionException -> L51
            goto L61
        L51:
            r8 = move-exception
            goto L64
        L53:
            ue.c.H(r8)
            r0.f830r = r7     // Catch: androidx.datastore.core.CorruptionException -> L62
            r0.f834v = r5     // Catch: androidx.datastore.core.CorruptionException -> L62
            java.lang.Object r8 = r7.h(r0)     // Catch: androidx.datastore.core.CorruptionException -> L62
            if (r8 != r1) goto L61
            return r1
        L61:
            return r8
        L62:
            r8 = move-exception
            r2 = r7
        L64:
            a6.a r5 = r2.f857c
            r0.f830r = r2
            r0.f831s = r8
            r0.f834v = r4
            java.lang.Object r4 = r5.l(r8)
            if (r4 != r1) goto L73
            return r1
        L73:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L77:
            r0.f830r = r2     // Catch: java.io.IOException -> L86
            r0.f831s = r8     // Catch: java.io.IOException -> L86
            r0.f834v = r3     // Catch: java.io.IOException -> L86
            java.lang.Object r0 = r4.k(r8, r0)     // Catch: java.io.IOException -> L86
            if (r0 != r1) goto L84
            return r1
        L84:
            r1 = r8
        L85:
            return r1
        L86:
            r8 = move-exception
            r0 = r2
        L88:
            xk2.f.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.j0.i(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(bl2.c r8, kotlin.coroutines.CoroutineContext r9, kotlin.jvm.functions.Function2 r10) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a6.g0
            if (r0 == 0) goto L13
            r0 = r8
            a6.g0 r0 = (a6.g0) r0
            int r1 = r0.f841w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f841w = r1
            goto L18
        L13:
            a6.g0 r0 = new a6.g0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f839u
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f841w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r9 = r0.f837s
            a6.j0 r10 = r0.f836r
            ue.c.H(r8)
            goto L86
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r9 = r0.f838t
            java.lang.Object r10 = r0.f837s
            a6.b r10 = (a6.b) r10
            a6.j0 r2 = r0.f836r
            ue.c.H(r8)
            goto L6b
        L43:
            ue.c.H(r8)
            do2.t2 r8 = r7.f861g
            java.lang.Object r8 = r8.getValue()
            a6.b r8 = (a6.b) r8
            r8.a()
            a6.h0 r2 = new a6.h0
            java.lang.Object r6 = r8.f794a
            r2.<init>(r10, r6, r3)
            r0.f836r = r7
            r0.f837s = r8
            r0.f838t = r6
            r0.f841w = r5
            java.lang.Object r9 = kotlin.jvm.internal.j.M(r0, r9, r2)
            if (r9 != r1) goto L67
            return r1
        L67:
            r2 = r7
            r10 = r8
            r8 = r9
            r9 = r6
        L6b:
            r10.a()
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r9, r8)
            if (r10 == 0) goto L75
            goto L98
        L75:
            r0.f836r = r2
            r0.f837s = r8
            r0.f838t = r3
            r0.f841w = r4
            java.lang.Object r9 = r2.k(r8, r0)
            if (r9 != r1) goto L84
            return r1
        L84:
            r9 = r8
            r10 = r2
        L86:
            do2.t2 r8 = r10.f861g
            a6.b r10 = new a6.b
            if (r9 == 0) goto L91
            int r0 = r9.hashCode()
            goto L92
        L91:
            r0 = 0
        L92:
            r10.<init>(r9, r0)
            r8.i(r10)
        L98:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.j0.j(bl2.c, kotlin.coroutines.CoroutineContext, kotlin.jvm.functions.Function2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4 A[Catch: IOException -> 0x00bb, TRY_ENTER, TryCatch #3 {IOException -> 0x00bb, blocks: (B:14:0x0094, B:19:0x00a4, B:20:0x00ba, B:27:0x00c1, B:28:0x00c4, B:44:0x006a, B:24:0x00bf), top: B:43:0x006a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(java.lang.Object r8, bl2.c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "Unable to rename "
            boolean r1 = r9 instanceof a6.i0
            if (r1 == 0) goto L15
            r1 = r9
            a6.i0 r1 = (a6.i0) r1
            int r2 = r1.f851x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f851x = r2
            goto L1a
        L15:
            a6.i0 r1 = new a6.i0
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.f849v
            cl2.a r2 = cl2.a.COROUTINE_SUSPENDED
            int r3 = r1.f851x
            r4 = 1
            if (r3 == 0) goto L3c
            if (r3 != r4) goto L34
            java.io.FileOutputStream r8 = r1.f848u
            java.io.FileOutputStream r2 = r1.f847t
            java.io.File r3 = r1.f846s
            a6.j0 r1 = r1.f845r
            ue.c.H(r9)     // Catch: java.lang.Throwable -> L31
            goto L8a
        L31:
            r8 = move-exception
            goto Lbf
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            ue.c.H(r9)
            java.io.File r9 = r7.d()
            java.io.File r3 = r9.getCanonicalFile()
            java.io.File r3 = r3.getParentFile()
            if (r3 != 0) goto L4e
            goto L57
        L4e:
            r3.mkdirs()
            boolean r3 = r3.isDirectory()
            if (r3 == 0) goto Lcf
        L57:
            java.io.File r3 = new java.io.File
            java.io.File r9 = r7.d()
            java.lang.String r9 = r9.getAbsolutePath()
            java.lang.String r5 = r7.f859e
            java.lang.String r9 = kotlin.jvm.internal.Intrinsics.n(r5, r9)
            r3.<init>(r9)
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lbb
            r9.<init>(r3)     // Catch: java.io.IOException -> Lbb
            a6.l r5 = r7.f856b     // Catch: java.lang.Throwable -> Lbd
            a6.q r6 = new a6.q     // Catch: java.lang.Throwable -> Lbd
            r6.<init>(r9)     // Catch: java.lang.Throwable -> Lbd
            r1.f845r = r7     // Catch: java.lang.Throwable -> Lbd
            r1.f846s = r3     // Catch: java.lang.Throwable -> Lbd
            r1.f847t = r9     // Catch: java.lang.Throwable -> Lbd
            r1.f848u = r9     // Catch: java.lang.Throwable -> Lbd
            r1.f851x = r4     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r8 = r5.writeTo(r8, r6, r1)     // Catch: java.lang.Throwable -> Lbd
            if (r8 != r2) goto L87
            return r2
        L87:
            r1 = r7
            r8 = r9
            r2 = r8
        L8a:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch: java.lang.Throwable -> L31
            r8.sync()     // Catch: java.lang.Throwable -> L31
            kotlin.Unit r8 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L31
            r8 = 0
            dl2.b.J(r2, r8)     // Catch: java.io.IOException -> Lbb
            java.io.File r8 = r1.d()     // Catch: java.io.IOException -> Lbb
            boolean r8 = r3.renameTo(r8)     // Catch: java.io.IOException -> Lbb
            if (r8 == 0) goto La4
            kotlin.Unit r8 = kotlin.Unit.f80348a
            return r8
        La4:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.io.IOException -> Lbb
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lbb
            r9.<init>(r0)     // Catch: java.io.IOException -> Lbb
            r9.append(r3)     // Catch: java.io.IOException -> Lbb
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch: java.io.IOException -> Lbb
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> Lbb
            r8.<init>(r9)     // Catch: java.io.IOException -> Lbb
            throw r8     // Catch: java.io.IOException -> Lbb
        Lbb:
            r8 = move-exception
            goto Lc5
        Lbd:
            r8 = move-exception
            r2 = r9
        Lbf:
            throw r8     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            r9 = move-exception
            dl2.b.J(r2, r8)     // Catch: java.io.IOException -> Lbb
            throw r9     // Catch: java.io.IOException -> Lbb
        Lc5:
            boolean r9 = r3.exists()
            if (r9 == 0) goto Lce
            r3.delete()
        Lce:
            throw r8
        Lcf:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "Unable to create parent directories of "
            java.lang.String r9 = kotlin.jvm.internal.Intrinsics.n(r9, r0)
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.j0.k(java.lang.Object, bl2.c):java.lang.Object");
    }
}
