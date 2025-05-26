package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j2 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final j2 f137176a = new j2();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137177b = kotlin.collections.f0.j("__typename", "id", "entityId", "verifiedIdentity", "blockedByMe", "isVerifiedMerchant", "isDefaultImage", "imageXlargeUrl", "imageLargeUrl", "imageMediumUrl", "imageSmallUrl", "firstName", "lastName", "fullName", "username", "followerCount", "followingCount", "explicitlyFollowedByMe", "isPrivateProfile", "avatarColorIndex");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.t2 value = (x40.t2) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f133307a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f133308b);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f133309c);
        writer.M0("verifiedIdentity");
        pc.c.b(pc.c.c(i2.f137145a)).d(writer, customScalarAdapters, value.f133310d);
        writer.M0("blockedByMe");
        pc.k0 k0Var = pc.c.f99527h;
        k0Var.d(writer, customScalarAdapters, value.f133311e);
        writer.M0("isVerifiedMerchant");
        k0Var.d(writer, customScalarAdapters, value.f133312f);
        writer.M0("isDefaultImage");
        k0Var.d(writer, customScalarAdapters, value.f133313g);
        writer.M0("imageXlargeUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f133314h);
        writer.M0("imageLargeUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f133315i);
        writer.M0("imageMediumUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f133316j);
        writer.M0("imageSmallUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f133317k);
        writer.M0("firstName");
        pc.k0 k0Var2 = pc.c.f99524e;
        k0Var2.d(writer, customScalarAdapters, value.f133318l);
        writer.M0("lastName");
        k0Var2.d(writer, customScalarAdapters, value.f133319m);
        writer.M0("fullName");
        k0Var2.d(writer, customScalarAdapters, value.f133320n);
        writer.M0("username");
        k0Var2.d(writer, customScalarAdapters, value.f133321o);
        writer.M0("followerCount");
        pc.k0 k0Var3 = pc.c.f99526g;
        k0Var3.d(writer, customScalarAdapters, value.f133322p);
        writer.M0("followingCount");
        k0Var3.d(writer, customScalarAdapters, value.f133323q);
        writer.M0("explicitlyFollowedByMe");
        k0Var.d(writer, customScalarAdapters, value.f133324r);
        writer.M0("isPrivateProfile");
        k0Var.d(writer, customScalarAdapters, value.f133325s);
        writer.M0("avatarColorIndex");
        k0Var3.d(writer, customScalarAdapters, value.f133326t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0034, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r4);
        kotlin.jvm.internal.Intrinsics.f(r5);
        kotlin.jvm.internal.Intrinsics.f(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0043, code lost:
    
        return new x40.t2(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
     */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r25, pc.v r26) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.j2.f(tc.f, pc.v):java.lang.Object");
    }
}
