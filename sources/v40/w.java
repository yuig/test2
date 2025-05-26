package v40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final w f124098a = new w();

    /* renamed from: b, reason: collision with root package name */
    public static final List f124099b = kotlin.collections.f0.j("__typename", "id", "enableProfileMessage", "entityId", "businessName", "contactPhone", "contactEmail", "contactPhoneCountry");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        u40.x value = (u40.x) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f120433a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f120434b);
        writer.M0("enableProfileMessage");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f120435c);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f120436d);
        writer.M0("businessName");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f120437e);
        writer.M0("contactPhone");
        k0Var.d(writer, customScalarAdapters, value.f120438f);
        writer.M0("contactEmail");
        k0Var.d(writer, customScalarAdapters, value.f120439g);
        writer.M0("contactPhoneCountry");
        pc.c.b(pc.c.c(v.f124094a)).d(writer, customScalarAdapters, value.f120440h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r3);
        kotlin.jvm.internal.Intrinsics.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        return new u40.x(r2, r3, r4, r5, r6, r7, r8, r9);
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
            java.util.List r0 = v40.w.f124099b
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
            u40.x r11 = new u40.x
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r3)
            kotlin.jvm.internal.Intrinsics.f(r5)
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
        L2c:
            v40.v r0 = v40.v.f124094a
            pc.l0 r0 = pc.c.c(r0)
            pc.k0 r0 = pc.c.b(r0)
            java.lang.Object r0 = r0.f(r11, r12)
            r9 = r0
            u40.w r9 = (u40.w) r9
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
        throw new UnsupportedOperationException("Method not decompiled: v40.w.f(tc.f, pc.v):java.lang.Object");
    }
}
