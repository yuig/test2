package v40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final j f124060a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static final List f124061b = kotlin.collections.f0.j("__typename", "id", "enableProfileMessage", "entityId", "businessName", "contactPhone", "contactEmail", "contactPhoneCountry");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        u40.j value = (u40.j) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f120340a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f120341b);
        writer.M0("enableProfileMessage");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f120342c);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f120343d);
        writer.M0("businessName");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f120344e);
        writer.M0("contactPhone");
        k0Var.d(writer, customScalarAdapters, value.f120345f);
        writer.M0("contactEmail");
        k0Var.d(writer, customScalarAdapters, value.f120346g);
        writer.M0("contactPhoneCountry");
        pc.c.b(pc.c.c(i.f124056a)).d(writer, customScalarAdapters, value.f120347h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r3);
        kotlin.jvm.internal.Intrinsics.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        return new u40.j(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r11, pc.v r12) {
        /*
            r10 = this;
            java.lang.String r0 = "reader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "customScalarAdapters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            r2 = r0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L13:
            java.util.List r0 = v40.j.f124061b
            int r0 = r11.V1(r0)
            switch(r0) {
                case 0: goto L7a;
                case 1: goto L70;
                case 2: goto L66;
                case 3: goto L5c;
                case 4: goto L52;
                case 5: goto L48;
                case 6: goto L3e;
                case 7: goto L2c;
                default: goto L1c;
            }
        L1c:
            u40.j r11 = new u40.j
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r3)
            kotlin.jvm.internal.Intrinsics.f(r5)
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
        L2c:
            v40.i r0 = v40.i.f124056a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r11, r12)
            r9 = r0
            u40.i r9 = (u40.i) r9
            goto L13
        L3e:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r11, r12)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            goto L13
        L48:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r11, r12)
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            goto L13
        L52:
            pc.k0 r0 = pc.c.f99524e
            java.lang.Object r0 = r0.f(r11, r12)
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            goto L13
        L5c:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r11, r12)
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            goto L13
        L66:
            pc.k0 r0 = pc.c.f99527h
            java.lang.Object r0 = r0.f(r11, r12)
            r4 = r0
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            goto L13
        L70:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r11, r12)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            goto L13
        L7a:
            a10.e r0 = pc.c.f99520a
            java.lang.Object r0 = r0.f(r11, r12)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: v40.j.f(tc.f, pc.v):java.lang.Object");
    }
}
