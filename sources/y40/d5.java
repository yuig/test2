package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d5 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final d5 f136983a = new d5();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.p5 value = (x40.p5) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof x40.l5) {
            List list = z4.f137680a;
            x40.l5 value2 = (x40.l5) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f132701d);
            writer.M0("data");
            pc.c.b(pc.c.c(y4.f137649a)).d(writer, customScalarAdapters, value2.f132702e);
            return;
        }
        if (value instanceof x40.n5) {
            List list2 = b5.f136922a;
            x40.n5 value3 = (x40.n5) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f132876d);
            writer.M0("error");
            pc.c.c(a5.f136890a).d(writer, customScalarAdapters, value3.f132877e);
            return;
        }
        if (value instanceof x40.o5) {
            List list3 = c5.f136952a;
            x40.o5 value4 = (x40.o5) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value4, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value4.f132940d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0100, code lost:
    
        if (r0 == 1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x010e, code lost:
    
        r5 = (x40.m5) pc.c.c(y40.a5.f136890a).f(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0102, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x010d, code lost:
    
        return new x40.n5(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0025, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0074, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007d, code lost:
    
        if (r2.equals("ClientError") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0086, code lost:
    
        if (r2.equals("BoardNotFound") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008f, code lost:
    
        if (r2.equals("TodayArticleNotFound") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0098, code lost:
    
        if (r2.equals("UserNotFound") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a1, code lost:
    
        if (r2.equals("UserDidItDataNotFound") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00aa, code lost:
    
        if (r2.equals("PinNotFound") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b3, code lost:
    
        if (r2.equals("QuizNotFound") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bc, code lost:
    
        if (r2.equals("ExploreArticleNotFound") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c5, code lost:
    
        if (r2.equals("PearInsightNotFound") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00ed, code lost:
    
        r3 = y40.b5.f136922a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00f8, code lost:
    
        r0 = r8.V1(y40.b5.f136922a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00fe, code lost:
    
        if (r0 == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x011c, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r8, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00da A[LOOP:2: B:59:0x00d2->B:61:0x00da, LOOP_END] */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r8, pc.v r9) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.d5.f(tc.f, pc.v):java.lang.Object");
    }
}
