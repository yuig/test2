package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f137038a = new f0();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.j0 value = (x40.j0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof x40.f0) {
            List list = b0.f136913a;
            x40.f0 value2 = (x40.f0) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f132367d);
            writer.M0("data");
            pc.c.b(pc.c.c(a0.f136881a)).d(writer, customScalarAdapters, value2.f132368e);
            return;
        }
        if (value instanceof x40.h0) {
            List list2 = d0.f136974a;
            x40.h0 value3 = (x40.h0) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f132460d);
            writer.M0("error");
            pc.c.c(c0.f136942a).d(writer, customScalarAdapters, value3.f132461e);
            return;
        }
        if (value instanceof x40.i0) {
            List list3 = e0.f137005a;
            x40.i0 value4 = (x40.i0) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f132516d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f0, code lost:
    
        if (r0 == 1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00fe, code lost:
    
        r5 = (x40.g0) pc.c.c(y40.c0.f136942a).f(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00f2, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00fd, code lost:
    
        return new x40.h0(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0025, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
    
        if (r2.equals("ClientError") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r2.equals("BoardNotFound") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        if (r2.equals("UserNotFound") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r2.equals("UserDidItDataNotFound") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a3, code lost:
    
        if (r2.equals("ConversationNotFound") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ac, code lost:
    
        if (r2.equals("PinNotFound") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b5, code lost:
    
        if (r2.equals("ConversationThreadNotFound") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00dd, code lost:
    
        r3 = y40.d0.f136974a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00e8, code lost:
    
        r0 = r8.V1(y40.d0.f136974a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00ee, code lost:
    
        if (r0 == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x010c, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r8, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ca A[LOOP:2: B:55:0x00c2->B:57:0x00ca, LOOP_END] */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r8, pc.v r9) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.f0.f(tc.f, pc.v):java.lang.Object");
    }
}
