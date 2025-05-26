package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final s f137457a = new s();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.u value = (x40.u) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof x40.q) {
            List list = o.f137333a;
            x40.q value2 = (x40.q) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f133057d);
            writer.M0("data");
            pc.c.b(pc.c.c(n.f137299a)).d(writer, customScalarAdapters, value2.f133058e);
            return;
        }
        if (value instanceof x40.s) {
            List list2 = q.f137397a;
            x40.s value3 = (x40.s) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f133219d);
            writer.M0("error");
            pc.c.c(p.f137365a).d(writer, customScalarAdapters, value3.f133220e);
            return;
        }
        if (value instanceof x40.t) {
            List list3 = r.f137428a;
            x40.t value4 = (x40.t) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f133283d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e6, code lost:
    
        if (r0 == 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f4, code lost:
    
        r5 = (x40.r) pc.c.c(y40.p.f137365a).f(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e8, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f3, code lost:
    
        return new x40.s(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0025, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
    
        if (r2.equals("ClientError") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r2.equals("BoardNotFound") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if (r2.equals("UserNotFound") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        if (r2.equals("UserDidItDataNotFound") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a2, code lost:
    
        if (r2.equals("ConversationNotFound") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ab, code lost:
    
        if (r2.equals("PinNotFound") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00d3, code lost:
    
        r3 = y40.q.f137397a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00de, code lost:
    
        r0 = r8.V1(y40.q.f137397a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00e4, code lost:
    
        if (r0 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0102, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r8, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c0 A[LOOP:2: B:53:0x00b8->B:55:0x00c0, LOOP_END] */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r8, pc.v r9) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.s.f(tc.f, pc.v):java.lang.Object");
    }
}
