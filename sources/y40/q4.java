package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q4 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final q4 f137405a = new q4();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137406b = kotlin.collections.f0.j("__typename", "id", "entityId", "emails", "unread", "isEligibleForThreads", "pinsubTopicId", "readTimesMs", "users", "lastMessage");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.b5 value = (x40.b5) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f132005a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f132006b);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f132007c);
        writer.M0("emails");
        pc.c.b(pc.c.a(eVar)).d(writer, customScalarAdapters, value.f132008d);
        writer.M0("unread");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f132009e);
        writer.M0("isEligibleForThreads");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f132010f);
        writer.M0("pinsubTopicId");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f132011g);
        writer.M0("readTimesMs");
        pc.c.b(pc.c.a(pc.c.c(j4.f137180a))).d(writer, customScalarAdapters, value.f132012h);
        writer.M0("users");
        pc.c.b(pc.c.c(p4.f137374a)).d(writer, customScalarAdapters, value.f132013i);
        writer.M0("lastMessage");
        pc.c.b(pc.c.c(h4.f137116a)).d(writer, customScalarAdapters, value.f132014j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r3);
        kotlin.jvm.internal.Intrinsics.f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        return new x40.b5(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
     */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r13, pc.v r14) {
        /*
            r12 = this;
            java.lang.String r0 = "reader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "customScalarAdapters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = 0
            r2 = r0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
        L15:
            java.util.List r0 = y40.q4.f137406b
            int r0 = r13.V1(r0)
            switch(r0) {
                case 0: goto Laf;
                case 1: goto La4;
                case 2: goto L99;
                case 3: goto L86;
                case 4: goto L7c;
                case 5: goto L72;
                case 6: goto L68;
                case 7: goto L52;
                case 8: goto L40;
                case 9: goto L2e;
                default: goto L1e;
            }
        L1e:
            x40.b5 r13 = new x40.b5
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r3)
            kotlin.jvm.internal.Intrinsics.f(r4)
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
        L2e:
            y40.h4 r0 = y40.h4.f137116a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r13, r14)
            r11 = r0
            x40.s4 r11 = (x40.s4) r11
            goto L15
        L40:
            y40.p4 r0 = y40.p4.f137374a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r13, r14)
            r10 = r0
            x40.a5 r10 = (x40.a5) r10
            goto L15
        L52:
            y40.j4 r0 = y40.j4.f137180a
            pc.l0 r0 = pc.c.c(r0)
            pc.d r0 = pc.c.a(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r13, r14)
            r9 = r0
            java.util.List r9 = (java.util.List) r9
            goto L15
        L68:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r13, r14)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            goto L15
        L72:
            pc.k0 r0 = pc.c.f99527h
            java.lang.Object r0 = r0.f(r13, r14)
            r7 = r0
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            goto L15
        L7c:
            pc.k0 r0 = pc.c.f99526g
            java.lang.Object r0 = r0.f(r13, r14)
            r6 = r0
            java.lang.Integer r6 = (java.lang.Integer) r6
            goto L15
        L86:
            a10.e r0 = pc.c.f99520a
            pc.d r0 = pc.c.a(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r13, r14)
            r5 = r0
            java.util.List r5 = (java.util.List) r5
            goto L15
        L99:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r13, r14)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            goto L15
        La4:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r13, r14)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            goto L15
        Laf:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r13, r14)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.q4.f(tc.f, pc.v):java.lang.Object");
    }
}
