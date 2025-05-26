package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x40.oi;

/* loaded from: classes.dex */
public final class fh implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final fh f137071a = new fh();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137072b = kotlin.collections.f0.j("__typename", "id", "enableProfileMessage", "entityId", "businessName", "contactPhone", "contactEmail", "contactPhoneCountry", "enableProfileAddress", "profilePlace", "contactDetails");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        oi value = (oi) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f133000a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f133001b);
        writer.M0("enableProfileMessage");
        pc.k0 k0Var = pc.c.f99527h;
        k0Var.d(writer, customScalarAdapters, value.f133002c);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f133003d);
        writer.M0("businessName");
        pc.k0 k0Var2 = pc.c.f99524e;
        k0Var2.d(writer, customScalarAdapters, value.f133004e);
        writer.M0("contactPhone");
        k0Var2.d(writer, customScalarAdapters, value.f133005f);
        writer.M0("contactEmail");
        k0Var2.d(writer, customScalarAdapters, value.f133006g);
        writer.M0("contactPhoneCountry");
        pc.c.b(pc.c.c(dh.f137002a)).d(writer, customScalarAdapters, value.f133007h);
        writer.M0("enableProfileAddress");
        k0Var.d(writer, customScalarAdapters, value.f133008i);
        writer.M0("profilePlace");
        pc.c.b(pc.c.c(eh.f137034a)).d(writer, customScalarAdapters, value.f133009j);
        writer.M0("contactDetails");
        pc.c.b(pc.c.c(ch.f136971a)).d(writer, customScalarAdapters, value.f133010k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r3);
        kotlin.jvm.internal.Intrinsics.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        return new x40.oi(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
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
            java.util.List r0 = y40.fh.f137072b
            int r0 = r14.V1(r0)
            switch(r0) {
                case 0: goto Lae;
                case 1: goto La3;
                case 2: goto L98;
                case 3: goto L8d;
                case 4: goto L83;
                case 5: goto L79;
                case 6: goto L6f;
                case 7: goto L5d;
                case 8: goto L53;
                case 9: goto L41;
                case 10: goto L2f;
                default: goto L1f;
            }
        L1f:
            x40.oi r14 = new x40.oi
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r3)
            kotlin.jvm.internal.Intrinsics.f(r5)
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r14
        L2f:
            y40.ch r0 = y40.ch.f136971a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r14, r15)
            r12 = r0
            x40.li r12 = (x40.li) r12
            goto L16
        L41:
            y40.eh r0 = y40.eh.f137034a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r14, r15)
            r11 = r0
            x40.ni r11 = (x40.ni) r11
            goto L16
        L53:
            pc.k0 r0 = pc.c.f99527h
            java.lang.Object r0 = r0.f(r14, r15)
            r10 = r0
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            goto L16
        L5d:
            y40.dh r0 = y40.dh.f137002a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r14, r15)
            r9 = r0
            x40.mi r9 = (x40.mi) r9
            goto L16
        L6f:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r14, r15)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            goto L16
        L79:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r14, r15)
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            goto L16
        L83:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r14, r15)
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            goto L16
        L8d:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r14, r15)
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            goto L16
        L98:
            pc.k0 r0 = pc.c.f99527h
            java.lang.Object r0 = r0.f(r14, r15)
            r4 = r0
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            goto L16
        La3:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r14, r15)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            goto L16
        Lae:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r14, r15)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.fh.f(tc.f, pc.v):java.lang.Object");
    }
}
