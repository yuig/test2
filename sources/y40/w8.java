package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w8 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final w8 f137596a = new w8();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.q9 value = (x40.q9) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(value instanceof x40.sb)) {
            if (value instanceof x40.o9) {
                List list = u8.f137536a;
                u8.b(writer, customScalarAdapters, (x40.o9) value);
                return;
            } else {
                if (value instanceof x40.p9) {
                    List list2 = v8.f137566a;
                    v8.b(writer, customScalarAdapters, (x40.p9) value);
                    return;
                }
                return;
            }
        }
        List list3 = ya.f137661a;
        x40.sb value2 = (x40.sb) value;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value2, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value2.f133263d);
        writer.M0("data");
        pc.c.b(pc.c.c(x8.f137626a)).d(writer, customScalarAdapters, value2.f133264e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r2.equals("ClientError") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r2.equals("BoardNotFound") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r2.equals("TodayArticleNotFound") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r2.equals("UserNotFound") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r2.equals("UserDidItDataNotFound") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ad, code lost:
    
        if (r2.equals("PinNotFound") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
    
        if (r2.equals("QuizNotFound") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bf, code lost:
    
        if (r2.equals("ExploreArticleNotFound") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c8, code lost:
    
        if (r2.equals("PearInsightNotFound") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00d3, code lost:
    
        return y40.u8.a(r5, r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L51;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r5, pc.v r6) {
        /*
            r4 = this;
            java.lang.String r0 = "reader"
            java.lang.String r1 = "customScalarAdapters"
            java.lang.String r2 = ep.b.m(r5, r0, r6, r1, r5)
            int r3 = r2.hashCode()
            switch(r3) {
                case -2063485375: goto Lc2;
                case -1921895278: goto Lb9;
                case -1226342908: goto Lb0;
                case -814800636: goto La7;
                case -40180393: goto L61;
                case 644818104: goto L57;
                case 949711226: goto L4d;
                case 1222141476: goto L43;
                case 1381369173: goto L39;
                case 1470119133: goto L2f;
                case 1733482047: goto L25;
                case 1877804833: goto L1b;
                case 1996696054: goto L11;
                default: goto Lf;
            }
        Lf:
            goto Lca
        L11:
            java.lang.String r0 = "AuthorizationFailed"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lcf
            goto Lca
        L1b:
            java.lang.String r0 = "InvalidParameters"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lcf
            goto Lca
        L25:
            java.lang.String r0 = "AccessDenied"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lcf
            goto Lca
        L2f:
            java.lang.String r0 = "ClientError"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lcf
            goto Lca
        L39:
            java.lang.String r0 = "BoardNotFound"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lcf
            goto Lca
        L43:
            java.lang.String r0 = "TodayArticleNotFound"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lcf
            goto Lca
        L4d:
            java.lang.String r0 = "UserNotFound"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lcf
            goto Lca
        L57:
            java.lang.String r0 = "UserDidItDataNotFound"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lcf
            goto Lca
        L61:
            java.lang.String r3 = "V3GetConversations"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L6a
            goto Lca
        L6a:
            java.util.List r3 = y40.ya.f137661a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            java.lang.String r0 = "typename"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
        L78:
            java.util.List r1 = y40.ya.f137661a
            int r1 = r5.V1(r1)
            if (r1 == 0) goto L9d
            r3 = 1
            if (r1 == r3) goto L8c
            x40.sb r5 = new x40.sb
            kotlin.jvm.internal.Intrinsics.f(r2)
            r5.<init>(r2, r0)
            goto Ld3
        L8c:
            y40.x8 r0 = y40.x8.f137626a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r5, r6)
            x40.r9 r0 = (x40.r9) r0
            goto L78
        L9d:
            a10.e r1 = pc.c.f99520a
            java.lang.Object r1 = r1.f(r5, r6)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            goto L78
        La7:
            java.lang.String r0 = "PinNotFound"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lcf
            goto Lca
        Lb0:
            java.lang.String r0 = "QuizNotFound"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lcf
            goto Lca
        Lb9:
            java.lang.String r0 = "ExploreArticleNotFound"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lcf
            goto Lca
        Lc2:
            java.lang.String r0 = "PearInsightNotFound"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lcf
        Lca:
            x40.p9 r5 = y40.v8.a(r5, r6, r2)
            goto Ld3
        Lcf:
            x40.o9 r5 = y40.u8.a(r5, r6, r2)
        Ld3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.w8.f(tc.f, pc.v):java.lang.Object");
    }
}
