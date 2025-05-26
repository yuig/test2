package v40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f124050a = new f0();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        u40.i0 value = (u40.i0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(value instanceof u40.n0)) {
            if (value instanceof u40.j0) {
                List list = g0.f124052a;
                u40.j0 value2 = (u40.j0) value;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                Intrinsics.checkNotNullParameter(value2, "value");
                writer.M0("__typename");
                pc.c.f99520a.d(writer, customScalarAdapters, value2.f120348b);
                return;
            }
            return;
        }
        List list2 = k0.f124066a;
        u40.n0 value3 = (u40.n0) value;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value3, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value3.f120394b);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value3.f120395c);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value3.f120396d);
        writer.M0("explicitlyFollowedByMe");
        pc.k0 k0Var = pc.c.f99527h;
        k0Var.d(writer, customScalarAdapters, value3.f120397e);
        writer.M0("followerCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value3.f120398f);
        writer.M0("fullName");
        pc.k0 k0Var2 = pc.c.f99524e;
        k0Var2.d(writer, customScalarAdapters, value3.f120399g);
        writer.M0("imageMediumUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value3.f120400h);
        writer.M0("username");
        k0Var2.d(writer, customScalarAdapters, value3.f120401i);
        writer.M0("isVerifiedMerchant");
        k0Var.d(writer, customScalarAdapters, value3.f120402j);
        writer.M0("blockedByMe");
        k0Var.d(writer, customScalarAdapters, value3.f120403k);
        writer.M0("isPrivateProfile");
        k0Var.d(writer, customScalarAdapters, value3.f120404l);
        writer.M0("verifiedIdentity");
        pc.c.b(pc.c.c(j0.f124062a)).d(writer, customScalarAdapters, value3.f120405m);
        writer.M0("contextualPinImageUrls");
        pc.c.b(pc.c.a(pc.c.c(h0.f124054a))).d(writer, customScalarAdapters, value3.f120406n);
        writer.M0("recentPinImages");
        pc.c.b(pc.c.a(pc.c.c(i0.f124058a))).d(writer, customScalarAdapters, value3.f120407o);
        writer.M0("showCreatorProfile");
        k0Var.d(writer, customScalarAdapters, value3.f120408p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r6);
        kotlin.jvm.internal.Intrinsics.f(r7);
        kotlin.jvm.internal.Intrinsics.f(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        return new u40.n0(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
     */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r22, pc.v r23) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v40.f0.f(tc.f, pc.v):java.lang.Object");
    }
}
