package fd;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i extends d0 {

    /* renamed from: c, reason: collision with root package name */
    public final long f61773c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f61774d;

    /* renamed from: e, reason: collision with root package name */
    public final z f61775e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b webSocketConnection, u listener, long j13, Function1 connectionPayload, z frameType) {
        super(webSocketConnection, listener);
        Intrinsics.checkNotNullParameter(webSocketConnection, "webSocketConnection");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(connectionPayload, "connectionPayload");
        Intrinsics.checkNotNullParameter(frameType, "frameType");
        this.f61773c = j13;
        this.f61774d = connectionPayload;
        this.f61775e = frameType;
    }

    @Override // fd.d0
    public final void a(Map messageMap) {
        Intrinsics.checkNotNullParameter(messageMap, "messageMap");
        Object obj = messageMap.get("type");
        boolean d2 = Intrinsics.d(obj, "data");
        u uVar = this.f61762b;
        if (d2) {
            Object obj2 = messageMap.get("id");
            Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.String");
            String id3 = (String) obj2;
            Object obj3 = messageMap.get("payload");
            Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            Map payload = (Map) obj3;
            uVar.getClass();
            Intrinsics.checkNotNullParameter(id3, "id");
            Intrinsics.checkNotNullParameter(payload, "payload");
            uVar.f61811a.f61834g.g(new gd.j(id3, payload));
            return;
        }
        if (!Intrinsics.d(obj, "error")) {
            if (Intrinsics.d(obj, "complete")) {
                Object obj4 = messageMap.get("id");
                Intrinsics.g(obj4, "null cannot be cast to non-null type kotlin.String");
                String id4 = (String) obj4;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(id4, "id");
                uVar.f61811a.f61834g.g(new gd.h(id4));
                return;
            }
            return;
        }
        Object obj5 = messageMap.get("id");
        if (!(obj5 instanceof String)) {
            uVar.f61811a.f61834g.g(new gd.e((Map) messageMap.get("payload")));
            return;
        }
        String id5 = (String) obj5;
        Map map = (Map) messageMap.get("payload");
        uVar.getClass();
        Intrinsics.checkNotNullParameter(id5, "id");
        uVar.f61811a.f61834g.g(new gd.i(id5, map));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(bl2.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof fd.g
            if (r0 == 0) goto L13
            r0 = r7
            fd.g r0 = (fd.g) r0
            int r1 = r0.f61770v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61770v = r1
            goto L18
        L13:
            fd.g r0 = new fd.g
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f61768t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f61770v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r7)
            goto L81
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            java.util.LinkedHashMap r2 = r0.f61767s
            fd.i r4 = r0.f61766r
            ue.c.H(r7)
            goto L5e
        L3a:
            ue.c.H(r7)
            kotlin.Pair r7 = new kotlin.Pair
            java.lang.String r2 = "type"
            java.lang.String r5 = "connection_init"
            r7.<init>(r2, r5)
            kotlin.Pair[] r7 = new kotlin.Pair[]{r7}
            java.util.LinkedHashMap r2 = kotlin.collections.z0.h(r7)
            r0.f61766r = r6
            r0.f61767s = r2
            r0.f61770v = r4
            kotlin.jvm.functions.Function1 r7 = r6.f61774d
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r4 = r6
        L5e:
            java.util.Map r7 = (java.util.Map) r7
            if (r7 == 0) goto L67
            java.lang.String r5 = "payload"
            r2.put(r5, r7)
        L67:
            fd.z r7 = r4.f61775e
            r4.d(r2, r7)
            fd.h r7 = new fd.h
            r2 = 0
            r7.<init>(r4, r2)
            r0.f61766r = r2
            r0.f61767s = r2
            r0.f61770v = r3
            long r2 = r4.f61773c
            java.lang.Object r7 = bs1.c.w2(r2, r7, r0)
            if (r7 != r1) goto L81
            return r1
        L81:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.i.e(bl2.c):java.lang.Object");
    }
}
