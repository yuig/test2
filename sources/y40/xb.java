package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xb implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final xb f137630a = new xb();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137631b = kotlin.collections.f0.j("__typename", "entityId", "id", "type", "read", "createdAt", "board", "conversation", "sender");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.uc value = (x40.uc) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f133464a);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f133465b);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f133466c);
        writer.M0("type");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f133467d);
        writer.M0("read");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f133468e);
        writer.M0("createdAt");
        pc.c.b(v00.c.f123768a).d(writer, customScalarAdapters, value.f133469f);
        writer.M0("board");
        pc.c.b(pc.c.c(sb.f137475a)).d(writer, customScalarAdapters, value.f133470g);
        writer.M0("conversation");
        pc.c.b(pc.c.c(ub.f137541a)).d(writer, customScalarAdapters, value.f133471h);
        writer.M0("sender");
        pc.c.b(pc.c.c(wb.f137601a)).d(writer, customScalarAdapters, value.f133472i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r3);
        kotlin.jvm.internal.Intrinsics.f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        return new x40.uc(r2, r3, r4, r5, r6, r7, r8, r9, r10);
     */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r12, pc.v r13) {
        /*
            r11 = this;
            java.lang.String r0 = "reader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "customScalarAdapters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
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
        L14:
            java.util.List r0 = y40.xb.f137631b
            int r0 = r12.V1(r0)
            switch(r0) {
                case 0: goto L9a;
                case 1: goto L8f;
                case 2: goto L85;
                case 3: goto L7b;
                case 4: goto L71;
                case 5: goto L63;
                case 6: goto L51;
                case 7: goto L3f;
                case 8: goto L2d;
                default: goto L1d;
            }
        L1d:
            x40.uc r12 = new x40.uc
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r3)
            kotlin.jvm.internal.Intrinsics.f(r4)
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        L2d:
            y40.wb r0 = y40.wb.f137601a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r12, r13)
            r10 = r0
            x40.tc r10 = (x40.tc) r10
            goto L14
        L3f:
            y40.ub r0 = y40.ub.f137541a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r12, r13)
            r9 = r0
            x40.rc r9 = (x40.rc) r9
            goto L14
        L51:
            y40.sb r0 = y40.sb.f137475a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r12, r13)
            r8 = r0
            x40.oc r8 = (x40.oc) r8
            goto L14
        L63:
            pc.s0 r0 = v00.c.f123768a
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r12, r13)
            r7 = r0
            java.util.Date r7 = (java.util.Date) r7
            goto L14
        L71:
            pc.k0 r0 = pc.c.f99527h
            java.lang.Object r0 = r0.f(r12, r13)
            r6 = r0
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            goto L14
        L7b:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r12, r13)
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            goto L14
        L85:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r12, r13)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            goto L14
        L8f:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r12, r13)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            goto L14
        L9a:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r12, r13)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.xb.f(tc.f, pc.v):java.lang.Object");
    }
}
