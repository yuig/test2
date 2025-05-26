package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x40.wi;

/* loaded from: classes5.dex */
public final class nh implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final nh f137331a = new nh();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137332b = kotlin.collections.f0.j("__typename", "id", "entityId", "explicitlyFollowedByMe", "followerCount", "fullName", "imageMediumUrl", "username", "isVerifiedMerchant", "blockedByMe", "isPrivateProfile", "verifiedIdentity", "contextualPinImageUrls", "recentPinImages", "showCreatorProfile");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        wi value = (wi) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f133632b);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f133633c);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f133634d);
        writer.M0("explicitlyFollowedByMe");
        pc.k0 k0Var = pc.c.f99527h;
        k0Var.d(writer, customScalarAdapters, value.f133635e);
        writer.M0("followerCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f133636f);
        writer.M0("fullName");
        pc.k0 k0Var2 = pc.c.f99524e;
        k0Var2.d(writer, customScalarAdapters, value.f133637g);
        writer.M0("imageMediumUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f133638h);
        writer.M0("username");
        k0Var2.d(writer, customScalarAdapters, value.f133639i);
        writer.M0("isVerifiedMerchant");
        k0Var.d(writer, customScalarAdapters, value.f133640j);
        writer.M0("blockedByMe");
        k0Var.d(writer, customScalarAdapters, value.f133641k);
        writer.M0("isPrivateProfile");
        k0Var.d(writer, customScalarAdapters, value.f133642l);
        writer.M0("verifiedIdentity");
        pc.c.b(pc.c.c(mh.f137297a)).d(writer, customScalarAdapters, value.f133643m);
        writer.M0("contextualPinImageUrls");
        pc.c.b(pc.c.a(pc.c.c(kh.f137232a))).d(writer, customScalarAdapters, value.f133644n);
        writer.M0("recentPinImages");
        pc.c.b(pc.c.a(pc.c.c(lh.f137263a))).d(writer, customScalarAdapters, value.f133645o);
        writer.M0("showCreatorProfile");
        k0Var.d(writer, customScalarAdapters, value.f133646p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r4);
        kotlin.jvm.internal.Intrinsics.f(r5);
        kotlin.jvm.internal.Intrinsics.f(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
    
        return new x40.wi(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18);
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
        throw new UnsupportedOperationException("Method not decompiled: y40.nh.f(tc.f, pc.v):java.lang.Object");
    }
}
