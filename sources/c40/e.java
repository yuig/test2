package c40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e f25712a = new e();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        b40.e value = (b40.e) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof b40.d) {
            List list = d.f25709a;
            b40.d value2 = (b40.d) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f21703d);
            return;
        }
        if (value instanceof b40.b) {
            List list2 = b.f25705a;
            b40.b value3 = (b40.b) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f21687d);
            writer.M0("error");
            pc.c.c(a.f25702a).d(writer, customScalarAdapters, value3.f21688e);
            return;
        }
        if (value instanceof b40.c) {
            List list3 = c.f25707a;
            b40.c value4 = (b40.c) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f21700d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r1 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        r0 = (b40.a) pc.c.c(c40.a.f25702a).f(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return new b40.b(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0021, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002a, code lost:
    
        if (r2.equals("ClientError") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        r3 = c40.b.f25705a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
    
        r1 = r6.V1(c40.b.f25705a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        if (r1 == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005d, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r6, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082 A[LOOP:2: B:35:0x007a->B:37:0x0082, LOOP_END] */
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
                case -943932084: goto L67;
                case 1470119133: goto L24;
                case 1733482047: goto L1b;
                case 1996696054: goto L12;
                default: goto L11;
            }
        L11:
            goto L6f
        L12:
            java.lang.String r3 = "AuthorizationFailed"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L2d
            goto L6f
        L1b:
            java.lang.String r3 = "AccessDenied"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L2d
            goto L6f
        L24:
            java.lang.String r3 = "ClientError"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L2d
            goto L6f
        L2d:
            java.util.List r3 = c40.b.f25705a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            r0 = 0
        L39:
            java.util.List r1 = c40.b.f25705a
            int r1 = r6.V1(r1)
            if (r1 == 0) goto L5d
            r3 = 1
            if (r1 == r3) goto L50
            b40.b r6 = new b40.b
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r0)
            r6.<init>(r2, r0)
            goto Lba
        L50:
            c40.a r0 = c40.a.f25702a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r6, r7)
            b40.a r0 = (b40.a) r0
            goto L39
        L5d:
            a10.e r1 = pc.c.f99520a
            java.lang.Object r1 = r1.f(r6, r7)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            goto L39
        L67:
            java.lang.String r3 = "UserResponse"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L95
        L6f:
            java.util.List r3 = c40.c.f25707a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
        L7a:
            java.util.List r0 = c40.c.f25707a
            int r0 = r6.V1(r0)
            if (r0 != 0) goto L8c
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r6, r7)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L7a
        L8c:
            b40.c r6 = new b40.c
            kotlin.jvm.internal.Intrinsics.f(r2)
            r6.<init>(r2)
            goto Lba
        L95:
            java.util.List r3 = c40.d.f25709a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
        La0:
            java.util.List r0 = c40.d.f25709a
            int r0 = r6.V1(r0)
            if (r0 != 0) goto Lb2
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r6, r7)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto La0
        Lb2:
            b40.d r6 = new b40.d
            kotlin.jvm.internal.Intrinsics.f(r2)
            r6.<init>(r2)
        Lba:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c40.e.f(tc.f, pc.v):java.lang.Object");
    }
}
