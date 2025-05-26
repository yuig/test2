package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r8 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final r8 f137442a = new r8();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.k9 value = (x40.k9) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof x40.g9) {
            List list = n8.f137317a;
            x40.g9 value2 = (x40.g9) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f132440d);
            writer.M0("data");
            pc.c.b(pc.c.c(m8.f137282a)).d(writer, customScalarAdapters, value2.f132441e);
            return;
        }
        if (value instanceof x40.i9) {
            List list2 = p8.f137381a;
            x40.i9 value3 = (x40.i9) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f132547d);
            writer.M0("error");
            pc.c.c(o8.f137347a).d(writer, customScalarAdapters, value3.f132548e);
            return;
        }
        if (value instanceof x40.j9) {
            List list3 = q8.f137412a;
            x40.j9 value4 = (x40.j9) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f132596d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00be, code lost:
    
        if (r0 == 1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00cc, code lost:
    
        r5 = (x40.h9) pc.c.c(y40.o8.f137347a).f(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c0, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cb, code lost:
    
        return new x40.i9(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0024, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0071, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007a, code lost:
    
        if (r2.equals("ClientError") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
    
        if (r2.equals("ConversationNotFound") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00ab, code lost:
    
        r3 = y40.p8.f137381a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00b6, code lost:
    
        r0 = r8.V1(y40.p8.f137381a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00bc, code lost:
    
        if (r0 == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00da, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r8, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098 A[LOOP:2: B:45:0x0090->B:47:0x0098, LOOP_END] */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r8, pc.v r9) {
        /*
            r7 = this;
            java.lang.String r0 = "reader"
            java.lang.String r1 = "customScalarAdapters"
            java.lang.String r2 = ep.b.m(r8, r0, r9, r1, r8)
            int r3 = r2.hashCode()
            r4 = 1
            r5 = 0
            java.lang.String r6 = "typename"
            switch(r3) {
                case -641988046: goto L7d;
                case 1470119133: goto L74;
                case 1733482047: goto L6b;
                case 1759335940: goto L27;
                case 1877804833: goto L1e;
                case 1996696054: goto L15;
                default: goto L13;
            }
        L13:
            goto L85
        L15:
            java.lang.String r3 = "AuthorizationFailed"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lab
            goto L85
        L1e:
            java.lang.String r3 = "InvalidParameters"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lab
            goto L85
        L27:
            java.lang.String r3 = "ConversationResponse"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L30
            goto L85
        L30:
            java.util.List r3 = y40.n8.f137317a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L3b:
            java.util.List r0 = y40.n8.f137317a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto L61
            if (r0 == r4) goto L4f
            x40.g9 r8 = new x40.g9
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2, r5)
            goto Lcb
        L4f:
            y40.m8 r0 = y40.m8.f137282a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            x40.f9 r5 = (x40.f9) r5
            goto L3b
        L61:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L3b
        L6b:
            java.lang.String r3 = "AccessDenied"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lab
            goto L85
        L74:
            java.lang.String r3 = "ClientError"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lab
            goto L85
        L7d:
            java.lang.String r3 = "ConversationNotFound"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lab
        L85:
            java.util.List r3 = y40.q8.f137412a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        L90:
            java.util.List r0 = y40.q8.f137412a
            int r0 = r8.V1(r0)
            if (r0 != 0) goto La2
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L90
        La2:
            x40.j9 r8 = new x40.j9
            kotlin.jvm.internal.Intrinsics.f(r2)
            r8.<init>(r2)
            goto Lcb
        Lab:
            java.util.List r3 = y40.p8.f137381a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
        Lb6:
            java.util.List r0 = y40.p8.f137381a
            int r0 = r8.V1(r0)
            if (r0 == 0) goto Lda
            if (r0 == r4) goto Lcc
            x40.i9 r8 = new x40.i9
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r5)
            r8.<init>(r2, r5)
        Lcb:
            return r8
        Lcc:
            y40.o8 r0 = y40.o8.f137347a
            pc.l0 r0 = pc.c.c(r0)
            java.lang.Object r0 = r0.f(r8, r9)
            r5 = r0
            x40.h9 r5 = (x40.h9) r5
            goto Lb6
        Lda:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto Lb6
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.r8.f(tc.f, pc.v):java.lang.Object");
    }
}
