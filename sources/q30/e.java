package q30;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes2.dex */
public final class e implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e f102283a = new e();

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        p30.e value = (p30.e) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof p30.a) {
            List list = a.f102278a;
            p30.a value2 = (p30.a) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f98727d);
            return;
        }
        if (value instanceof p30.c) {
            List list2 = c.f102281a;
            p30.c value3 = (p30.c) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f98730d);
            writer.M0("error");
            pc.c.c(b.f102279a).d(writer, customScalarAdapters, value3.f98731e);
            return;
        }
        if (value instanceof p30.d) {
            List list3 = d.f102282a;
            p30.d value4 = (p30.d) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f98732d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r1 == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        r0 = (p30.b) pc.c.c(q30.b.f102279a).f(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return new p30.c(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0024, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002e, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0038, code lost:
    
        if (r2.equals("ClientError") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003b, code lost:
    
        r3 = q30.c.f102281a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0047, code lost:
    
        r1 = r6.V1(q30.c.f102281a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004d, code lost:
    
        if (r1 == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006b, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r6, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6 A[LOOP:2: B:37:0x00ae->B:39:0x00b6, LOOP_END] */
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
                case 566524426: goto L75;
                case 1470119133: goto L32;
                case 1733482047: goto L28;
                case 1877804833: goto L1e;
                case 1996696054: goto L14;
                default: goto L12;
            }
        L12:
            goto La3
        L14:
            java.lang.String r3 = "AuthorizationFailed"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L3b
            goto La3
        L1e:
            java.lang.String r3 = "InvalidParameters"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L3b
            goto La3
        L28:
            java.lang.String r3 = "AccessDenied"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L3b
            goto La3
        L32:
            java.lang.String r3 = "ClientError"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L3b
            goto La3
        L3b:
            java.util.List r3 = q30.c.f102281a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            r0 = 0
        L47:
            java.util.List r1 = q30.c.f102281a
            int r1 = r6.V1(r1)
            if (r1 == 0) goto L6b
            r3 = 1
            if (r1 == r3) goto L5e
            p30.c r6 = new p30.c
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r0)
            r6.<init>(r2, r0)
            goto Lc8
        L5e:
            q30.b r0 = q30.b.f102279a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r6, r7)
            p30.b r0 = (p30.b) r0
            goto L47
        L6b:
            a10.e r1 = pc.c.f99520a
            java.lang.Object r1 = r1.f(r6, r7)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            goto L47
        L75:
            java.lang.String r3 = "EmailClickResultResponse"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto La3
            java.util.List r3 = q30.a.f102278a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
        L88:
            java.util.List r0 = q30.a.f102278a
            int r0 = r6.V1(r0)
            if (r0 != 0) goto L9a
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r6, r7)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L88
        L9a:
            p30.a r6 = new p30.a
            kotlin.jvm.internal.Intrinsics.f(r2)
            r6.<init>(r2)
            goto Lc8
        La3:
            java.util.List r3 = q30.d.f102282a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
        Lae:
            java.util.List r0 = q30.d.f102282a
            int r0 = r6.V1(r0)
            if (r0 != 0) goto Lc0
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r6, r7)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto Lae
        Lc0:
            p30.d r6 = new p30.d
            kotlin.jvm.internal.Intrinsics.f(r2)
            r6.<init>(r2)
        Lc8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q30.e.f(tc.f, pc.v):java.lang.Object");
    }
}
