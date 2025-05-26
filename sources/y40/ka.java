package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ka implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ka f137221a = new ka();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137222b = kotlin.collections.f0.j("__typename", "type", "id", "entityId", "text", "createdAt", "userDidItData", "sender", "user", "board", "pin");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.eb value = (x40.eb) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f132323a);
        writer.M0("type");
        pc.c.f99528i.d(writer, customScalarAdapters, value.f132324b);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f132325c);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f132326d);
        writer.M0("text");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f132327e);
        writer.M0("createdAt");
        pc.c.b(v00.c.f123768a).d(writer, customScalarAdapters, value.f132328f);
        writer.M0("userDidItData");
        pc.c.b(pc.c.c(ja.f137190a)).d(writer, customScalarAdapters, value.f132329g);
        writer.M0("sender");
        pc.c.b(pc.c.c(r9.f137443a)).d(writer, customScalarAdapters, value.f132330h);
        writer.M0("user");
        pc.c.b(pc.c.c(s9.f137472a)).d(writer, customScalarAdapters, value.f132331i);
        writer.M0("board");
        pc.c.b(pc.c.c(c9.f136958a)).d(writer, customScalarAdapters, value.f132332j);
        writer.M0("pin");
        pc.c.b(pc.c.c(p9.f137382a)).d(writer, customScalarAdapters, value.f132333k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r4);
        kotlin.jvm.internal.Intrinsics.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        return new x40.eb(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
     */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r14, pc.v r15) {
        /*
            r13 = this;
            java.lang.String r0 = "reader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "customScalarAdapters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
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
            r12 = r11
        L16:
            java.util.List r0 = y40.ka.f137222b
            int r0 = r14.V1(r0)
            switch(r0) {
                case 0: goto Lc1;
                case 1: goto Lb9;
                case 2: goto Lae;
                case 3: goto La3;
                case 4: goto L98;
                case 5: goto L89;
                case 6: goto L77;
                case 7: goto L65;
                case 8: goto L53;
                case 9: goto L41;
                case 10: goto L2f;
                default: goto L1f;
            }
        L1f:
            x40.eb r14 = new x40.eb
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r4)
            kotlin.jvm.internal.Intrinsics.f(r5)
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r14
        L2f:
            y40.p9 r0 = y40.p9.f137382a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r14, r15)
            r12 = r0
            x40.ja r12 = (x40.ja) r12
            goto L16
        L41:
            y40.c9 r0 = y40.c9.f136958a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r14, r15)
            r11 = r0
            x40.w9 r11 = (x40.w9) r11
            goto L16
        L53:
            y40.s9 r0 = y40.s9.f137472a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r14, r15)
            r10 = r0
            x40.ma r10 = (x40.ma) r10
            goto L16
        L65:
            y40.r9 r0 = y40.r9.f137443a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r14, r15)
            r9 = r0
            x40.la r9 = (x40.la) r9
            goto L16
        L77:
            y40.ja r0 = y40.ja.f137190a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r14, r15)
            r8 = r0
            x40.db r8 = (x40.db) r8
            goto L16
        L89:
            pc.s0 r0 = v00.c.f123768a
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r14, r15)
            r7 = r0
            java.util.Date r7 = (java.util.Date) r7
            goto L16
        L98:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r14, r15)
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            goto L16
        La3:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r14, r15)
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            goto L16
        Lae:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r14, r15)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            goto L16
        Lb9:
            pc.k0 r0 = pc.c.f99528i
            java.lang.Object r3 = r0.f(r14, r15)
            goto L16
        Lc1:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r14, r15)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.ka.f(tc.f, pc.v):java.lang.Object");
    }
}
