package v40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final x0 f124104a = new x0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f124105b = kotlin.collections.f0.j("__typename", "id", "entityId", "explicitlyFollowedByMe", "followerCount", "fullName", "imageMediumUrl", "username", "isVerifiedMerchant", "blockedByMe", "isPrivateProfile", "verifiedIdentity", "contextualPinImageUrls", "recentPinImages", "showCreatorProfile");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        u40.b1 value = (u40.b1) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f120296b);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f120297c);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f120298d);
        writer.M0("explicitlyFollowedByMe");
        pc.k0 k0Var = pc.c.f99527h;
        k0Var.d(writer, customScalarAdapters, value.f120299e);
        writer.M0("followerCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f120300f);
        writer.M0("fullName");
        pc.k0 k0Var2 = pc.c.f99524e;
        k0Var2.d(writer, customScalarAdapters, value.f120301g);
        writer.M0("imageMediumUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f120302h);
        writer.M0("username");
        k0Var2.d(writer, customScalarAdapters, value.f120303i);
        writer.M0("isVerifiedMerchant");
        k0Var.d(writer, customScalarAdapters, value.f120304j);
        writer.M0("blockedByMe");
        k0Var.d(writer, customScalarAdapters, value.f120305k);
        writer.M0("isPrivateProfile");
        k0Var.d(writer, customScalarAdapters, value.f120306l);
        writer.M0("verifiedIdentity");
        pc.c.b(pc.c.c(w0.f124100a)).d(writer, customScalarAdapters, value.f120307m);
        writer.M0("contextualPinImageUrls");
        pc.c.b(pc.c.a(pc.c.c(u0.f124092a))).d(writer, customScalarAdapters, value.f120308n);
        writer.M0("recentPinImages");
        pc.c.b(pc.c.a(pc.c.c(v0.f124096a))).d(writer, customScalarAdapters, value.f120309o);
        writer.M0("showCreatorProfile");
        k0Var.d(writer, customScalarAdapters, value.f120310p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r4);
        kotlin.jvm.internal.Intrinsics.f(r5);
        kotlin.jvm.internal.Intrinsics.f(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
    
        return new u40.b1(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18);
     */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r20, pc.v r21) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v40.x0.f(tc.f, pc.v):java.lang.Object");
    }
}
