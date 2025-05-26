package q30;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes2.dex */
public final class k implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final k f102291a = new k();

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        p30.l value = (p30.l) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof p30.k) {
            List list = j.f102290a;
            p30.k value2 = (p30.k) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f98743d);
            return;
        }
        if (value instanceof p30.i) {
            List list2 = h.f102288a;
            p30.i value3 = (p30.i) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f98740d);
            writer.M0("error");
            pc.c.c(g.f102286a).d(writer, customScalarAdapters, value3.f98741e);
            return;
        }
        if (value instanceof p30.j) {
            List list3 = i.f102289a;
            p30.j value4 = (p30.j) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f98742d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r1 == 1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        r0 = (p30.h) pc.c.c(q30.g.f102286a).f(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return new p30.i(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0024, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002d, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0036, code lost:
    
        if (r2.equals("ClientError") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        if (r2.equals("UserFollowFailure") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
    
        if (r2.equals("UserNotFound") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004b, code lost:
    
        r3 = q30.h.f102288a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0057, code lost:
    
        r1 = r6.V1(q30.h.f102288a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
    
        if (r1 == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007b, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r6, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0 A[LOOP:2: B:41:0x0098->B:43:0x00a0, LOOP_END] */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r6, pc.v r7) {
        /*
            r5 = this;
            java.lang.String r0 = "reader"
            java.lang.String r1 = "customScalarAdapters"
            java.lang.String r2 = ep.b.m(r6, r0, r7, r1, r6)
            int r3 = r2.hashCode()
            java.lang.String r4 = "typename"
            switch(r3) {
                case -943932084: goto L85;
                case 949711226: goto L42;
                case 1214282350: goto L39;
                case 1470119133: goto L30;
                case 1733482047: goto L27;
                case 1877804833: goto L1e;
                case 1996696054: goto L14;
                default: goto L12;
            }
        L12:
            goto L8d
        L14:
            java.lang.String r3 = "AuthorizationFailed"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L4b
            goto L8d
        L1e:
            java.lang.String r3 = "InvalidParameters"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L4b
            goto L8d
        L27:
            java.lang.String r3 = "AccessDenied"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L4b
            goto L8d
        L30:
            java.lang.String r3 = "ClientError"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L4b
            goto L8d
        L39:
            java.lang.String r3 = "UserFollowFailure"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L4b
            goto L8d
        L42:
            java.lang.String r3 = "UserNotFound"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L4b
            goto L8d
        L4b:
            java.util.List r3 = q30.h.f102288a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            r0 = 0
        L57:
            java.util.List r1 = q30.h.f102288a
            int r1 = r6.V1(r1)
            if (r1 == 0) goto L7b
            r3 = 1
            if (r1 == r3) goto L6e
            p30.i r6 = new p30.i
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r0)
            r6.<init>(r2, r0)
            goto Ld8
        L6e:
            q30.g r0 = q30.g.f102286a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r6, r7)
            p30.h r0 = (p30.h) r0
            goto L57
        L7b:
            a10.e r1 = pc.c.f99520a
            java.lang.Object r1 = r1.f(r6, r7)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            goto L57
        L85:
            java.lang.String r3 = "UserResponse"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lb3
        L8d:
            java.util.List r3 = q30.i.f102289a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
        L98:
            java.util.List r0 = q30.i.f102289a
            int r0 = r6.V1(r0)
            if (r0 != 0) goto Laa
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r6, r7)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L98
        Laa:
            p30.j r6 = new p30.j
            kotlin.jvm.internal.Intrinsics.f(r2)
            r6.<init>(r2)
            goto Ld8
        Lb3:
            java.util.List r3 = q30.j.f102290a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
        Lbe:
            java.util.List r0 = q30.j.f102290a
            int r0 = r6.V1(r0)
            if (r0 != 0) goto Ld0
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r6, r7)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto Lbe
        Ld0:
            p30.k r6 = new p30.k
            kotlin.jvm.internal.Intrinsics.f(r2)
            r6.<init>(r2)
        Ld8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q30.k.f(tc.f, pc.v):java.lang.Object");
    }
}
