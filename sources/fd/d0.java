package fd;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f61761a;

    /* renamed from: b, reason: collision with root package name */
    public final u f61762b;

    public d0(b webSocketConnection, u listener) {
        Intrinsics.checkNotNullParameter(webSocketConnection, "webSocketConnection");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f61761a = webSocketConnection;
        this.f61762b = listener;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0047 -> B:12:0x0048). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object c(fd.d0 r4, bl2.c r5) {
        /*
            boolean r0 = r5 instanceof fd.c0
            if (r0 == 0) goto L13
            r0 = r5
            fd.c0 r0 = (fd.c0) r0
            int r1 = r0.f61759v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61759v = r1
            goto L18
        L13:
            fd.c0 r0 = new fd.c0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f61757t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f61759v
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            fd.d0 r4 = r0.f61756s
            fd.d0 r2 = r0.f61755r
            ue.c.H(r5)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            goto L48
        L2b:
            r4 = move-exception
            goto L52
        L2d:
            r4 = move-exception
            goto L6b
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            ue.c.H(r5)
        L3a:
            r0.f61755r = r4     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L4f
            r0.f61756s = r4     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L4f
            r0.f61759v = r3     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L4f
            java.lang.Object r5 = r4.b(r0)     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L4f
            if (r5 != r1) goto L47
            return r1
        L47:
            r2 = r4
        L48:
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r4.a(r5)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r4 = r2
            goto L3a
        L4f:
            r5 = move-exception
            r2 = r4
            r4 = r5
        L52:
            fd.u r5 = r2.f61762b
            r5.getClass()
            java.lang.String r0 = "cause"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            fd.y r5 = r5.f61811a
            co2.m r5 = r5.f61834g
            gd.g r0 = new gd.g
            r0.<init>(r4)
            r5.g(r0)
            kotlin.Unit r4 = kotlin.Unit.f80348a
            return r4
        L6b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.d0.c(fd.d0, bl2.c):java.lang.Object");
    }

    public abstract void a(Map map);

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f A[Catch: Exception -> 0x0072, TRY_LEAVE, TryCatch #0 {Exception -> 0x0072, blocks: (B:12:0x0056, B:14:0x006f), top: B:11:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x004a -> B:10:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(bl2.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof fd.b0
            if (r0 == 0) goto L13
            r0 = r9
            fd.b0 r0 = (fd.b0) r0
            int r1 = r0.f61752v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61752v = r1
            goto L18
        L13:
            fd.b0 r0 = new fd.b0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f61750t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f61752v
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            fd.d0 r2 = r0.f61749s
            fd.d0 r4 = r0.f61748r
            ue.c.H(r9)
            goto L4b
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            ue.c.H(r9)
            r2 = r8
        L37:
            fd.b r9 = r2.f61761a
            r0.f61748r = r2
            r0.f61749s = r2
            r0.f61752v = r3
            bd.b r9 = r9.f61746a
            co2.q r9 = r9.f22682a
            java.lang.Object r9 = r9.p(r0)
            if (r9 != r1) goto L4a
            return r1
        L4a:
            r4 = r2
        L4b:
            java.lang.String r9 = (java.lang.String) r9
            r2.getClass()
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            r2 = 0
            a10.e r5 = pc.c.f99523d     // Catch: java.lang.Exception -> L72
            tc.c r6 = new tc.c     // Catch: java.lang.Exception -> L72
            wo2.j r7 = new wo2.j     // Catch: java.lang.Exception -> L72
            r7.<init>()     // Catch: java.lang.Exception -> L72
            r7.r0(r9)     // Catch: java.lang.Exception -> L72
            r6.<init>(r7)     // Catch: java.lang.Exception -> L72
            pc.v r9 = pc.v.f99607e     // Catch: java.lang.Exception -> L72
            java.lang.Object r9 = r5.f(r6, r9)     // Catch: java.lang.Exception -> L72
            boolean r5 = r9 instanceof java.util.Map     // Catch: java.lang.Exception -> L72
            if (r5 == 0) goto L72
            java.util.Map r9 = (java.util.Map) r9     // Catch: java.lang.Exception -> L72
            r2 = r9
        L72:
            if (r2 == 0) goto L75
            return r2
        L75:
            r2 = r4
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.d0.b(bl2.c):java.lang.Object");
    }

    public final void d(Map messageMap, z frameType) {
        Intrinsics.checkNotNullParameter(messageMap, "messageMap");
        Intrinsics.checkNotNullParameter(frameType, "frameType");
        int i13 = a0.f61745a[frameType.ordinal()];
        b bVar = this.f61761a;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(messageMap, "messageMap");
            Intrinsics.checkNotNullParameter(messageMap, "<this>");
            wo2.j jVar = new wo2.j();
            bs1.c.z2(new tc.b(jVar, null), messageMap);
            String string = jVar.M();
            bVar.getClass();
            Intrinsics.checkNotNullParameter(string, "string");
            if (bVar.f61747b.a(string)) {
                return;
            }
            bVar.f61746a.r(null);
            return;
        }
        if (i13 != 2) {
            return;
        }
        Intrinsics.checkNotNullParameter(messageMap, "messageMap");
        Intrinsics.checkNotNullParameter(messageMap, "<this>");
        wo2.j jVar2 = new wo2.j();
        bs1.c.z2(new tc.b(jVar2, null), messageMap);
        wo2.m data = jVar2.a1(jVar2.f130711b);
        bVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        if (bVar.f61747b.g(data)) {
            return;
        }
        bVar.f61746a.r(null);
    }
}
