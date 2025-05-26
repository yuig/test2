package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e6 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e6 f137016a = new e6();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.v6 value = (x40.v6) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof x40.r6) {
            List list = a6.f136892a;
            x40.r6 value2 = (x40.r6) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f133170d);
            writer.M0("data");
            pc.c.b(pc.c.c(z5.f137681a)).d(writer, customScalarAdapters, value2.f133171e);
            return;
        }
        if (value instanceof x40.t6) {
            List list2 = c6.f136953a;
            x40.t6 value3 = (x40.t6) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f133331d);
            writer.M0("error");
            pc.c.c(b6.f136923a).d(writer, customScalarAdapters, value3.f133332e);
            return;
        }
        if (value instanceof x40.u6) {
            List list3 = d6.f136984a;
            x40.u6 value4 = (x40.u6) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f133416d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0069, code lost:
    
        if (r0 == 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        r5 = (x40.s6) pc.c.c(y40.b6.f136923a).f(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return new x40.t6(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0025, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0038, code lost:
    
        if (r2.equals("ClientError") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        if (r2.equals("BoardNotFound") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        if (r2.equals("UserNotFound") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0053, code lost:
    
        if (r2.equals("CollaboratorInviteNotFound") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0056, code lost:
    
        r3 = y40.c6.f136953a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0061, code lost:
    
        r0 = r8.V1(y40.c6.f136953a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0067, code lost:
    
        if (r0 == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0085, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r8, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00aa A[LOOP:2: B:49:0x00a2->B:51:0x00aa, LOOP_END] */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r8, pc.v r9) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.e6.f(tc.f, pc.v):java.lang.Object");
    }
}
