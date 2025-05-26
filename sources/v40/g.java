package v40;

import com.appsflyer.AdRevenueScheme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final g f124051a = new g();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        u40.g value = (u40.g) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(value instanceof u40.l)) {
            if (value instanceof u40.h) {
                List list = h.f124053a;
                u40.h value2 = (u40.h) value;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                Intrinsics.checkNotNullParameter(value2, "value");
                writer.M0("__typename");
                pc.c.f99520a.d(writer, customScalarAdapters, value2.f120330a);
                return;
            }
            return;
        }
        List list2 = l.f124067a;
        u40.l value3 = (u40.l) value;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value3, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value3.f120361a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value3.f120362b);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value3.f120363c);
        writer.M0("firstName");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value3.f120364d);
        writer.M0("lastName");
        k0Var.d(writer, customScalarAdapters, value3.f120365e);
        writer.M0("fullName");
        k0Var.d(writer, customScalarAdapters, value3.f120366f);
        writer.M0("username");
        k0Var.d(writer, customScalarAdapters, value3.f120367g);
        writer.M0("ageInYears");
        pc.c.f99526g.d(writer, customScalarAdapters, value3.f120368h);
        writer.M0("email");
        k0Var.d(writer, customScalarAdapters, value3.f120369i);
        writer.M0("imageLargeUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value3.f120370j);
        writer.M0("isPartner");
        pc.k0 k0Var2 = pc.c.f99527h;
        k0Var2.d(writer, customScalarAdapters, value3.f120371k);
        writer.M0("isVerifiedMerchant");
        k0Var2.d(writer, customScalarAdapters, value3.f120372l);
        writer.M0("websiteUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value3.f120373m);
        writer.M0("about");
        k0Var.d(writer, customScalarAdapters, value3.f120374n);
        writer.M0("pronouns");
        pc.c.b(pc.c.a(eVar)).d(writer, customScalarAdapters, value3.f120375o);
        writer.M0("verifiedIdentity");
        pc.c.b(pc.c.c(k.f124064a)).d(writer, customScalarAdapters, value3.f120376p);
        writer.M0(AdRevenueScheme.COUNTRY);
        k0Var.d(writer, customScalarAdapters, value3.f120377q);
        writer.M0("bizPartner");
        pc.c.b(pc.c.c(j.f124060a)).d(writer, customScalarAdapters, value3.f120378r);
        writer.M0("showAllPins");
        k0Var2.d(writer, customScalarAdapters, value3.f120379s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0047, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r6);
        kotlin.jvm.internal.Intrinsics.f(r7);
        kotlin.jvm.internal.Intrinsics.f(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        return new u40.l(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);
     */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r26, pc.v r27) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v40.g.f(tc.f, pc.v):java.lang.Object");
    }
}
