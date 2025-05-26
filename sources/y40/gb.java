package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gb implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final gb f137096a = new gb();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137097b = kotlin.collections.f0.j("__typename", "id", "entityId", "status", "type", "isAcceptable", "message", "createdAt", "invitedByUser", "board");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.bc value = (x40.bc) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f132041a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f132042b);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f132043c);
        writer.M0("status");
        pc.c.f99528i.d(writer, customScalarAdapters, value.f132044d);
        writer.M0("type");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f132045e);
        writer.M0("isAcceptable");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f132046f);
        writer.M0("message");
        k0Var.d(writer, customScalarAdapters, value.f132047g);
        writer.M0("createdAt");
        pc.c.b(v00.c.f123768a).d(writer, customScalarAdapters, value.f132048h);
        writer.M0("invitedByUser");
        pc.c.b(pc.c.c(fb.f137059a)).d(writer, customScalarAdapters, value.f132049i);
        writer.M0("board");
        pc.c.b(pc.c.c(eb.f137024a)).d(writer, customScalarAdapters, value.f132050j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r3);
        kotlin.jvm.internal.Intrinsics.f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        return new x40.bc(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
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
            java.util.List r0 = y40.gb.f137097b
            int r0 = r13.V1(r0)
            switch(r0) {
                case 0: goto L9a;
                case 1: goto L8f;
                case 2: goto L85;
                case 3: goto L7e;
                case 4: goto L74;
                case 5: goto L6a;
                case 6: goto L60;
                case 7: goto L52;
                case 8: goto L40;
                case 9: goto L2e;
                default: goto L1e;
            }
        L1e:
            x40.bc r13 = new x40.bc
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r3)
            kotlin.jvm.internal.Intrinsics.f(r4)
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
        L2e:
            y40.eb r0 = y40.eb.f137024a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r13, r14)
            r11 = r0
            x40.zb r11 = (x40.zb) r11
            goto L15
        L40:
            y40.fb r0 = y40.fb.f137059a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r13, r14)
            r10 = r0
            x40.ac r10 = (x40.ac) r10
            goto L15
        L52:
            pc.s0 r0 = v00.c.f123768a
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r13, r14)
            r9 = r0
            java.util.Date r9 = (java.util.Date) r9
            goto L15
        L60:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r13, r14)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            goto L15
        L6a:
            pc.k0 r0 = pc.c.f99527h
            java.lang.Object r0 = r0.f(r13, r14)
            r7 = r0
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            goto L15
        L74:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r13, r14)
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            goto L15
        L7e:
            pc.k0 r0 = pc.c.f99528i
            java.lang.Object r5 = r0.f(r13, r14)
            goto L15
        L85:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r13, r14)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            goto L15
        L8f:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r13, r14)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            goto L15
        L9a:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r13, r14)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.gb.f(tc.f, pc.v):java.lang.Object");
    }
}
