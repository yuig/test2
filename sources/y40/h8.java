package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h8 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final h8 f137123a = new h8();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137124b = kotlin.collections.f0.j("__typename", "id", "entityId", "verifiedIdentity", "blockedByMe", "isVerifiedMerchant", "isDefaultImage", "imageXlargeUrl", "imageLargeUrl", "imageMediumUrl", "imageSmallUrl", "firstName", "lastName", "fullName", "username", "followerCount", "followingCount", "explicitlyFollowedByMe", "isPrivateProfile", "avatarColorIndex");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.a9 value = (x40.a9) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f131921a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f131922b);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f131923c);
        writer.M0("verifiedIdentity");
        pc.c.b(pc.c.c(g8.f137090a)).d(writer, customScalarAdapters, value.f131924d);
        writer.M0("blockedByMe");
        pc.k0 k0Var = pc.c.f99527h;
        k0Var.d(writer, customScalarAdapters, value.f131925e);
        writer.M0("isVerifiedMerchant");
        k0Var.d(writer, customScalarAdapters, value.f131926f);
        writer.M0("isDefaultImage");
        k0Var.d(writer, customScalarAdapters, value.f131927g);
        writer.M0("imageXlargeUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f131928h);
        writer.M0("imageLargeUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f131929i);
        writer.M0("imageMediumUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f131930j);
        writer.M0("imageSmallUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f131931k);
        writer.M0("firstName");
        pc.k0 k0Var2 = pc.c.f99524e;
        k0Var2.d(writer, customScalarAdapters, value.f131932l);
        writer.M0("lastName");
        k0Var2.d(writer, customScalarAdapters, value.f131933m);
        writer.M0("fullName");
        k0Var2.d(writer, customScalarAdapters, value.f131934n);
        writer.M0("username");
        k0Var2.d(writer, customScalarAdapters, value.f131935o);
        writer.M0("followerCount");
        pc.k0 k0Var3 = pc.c.f99526g;
        k0Var3.d(writer, customScalarAdapters, value.f131936p);
        writer.M0("followingCount");
        k0Var3.d(writer, customScalarAdapters, value.f131937q);
        writer.M0("explicitlyFollowedByMe");
        k0Var.d(writer, customScalarAdapters, value.f131938r);
        writer.M0("isPrivateProfile");
        k0Var.d(writer, customScalarAdapters, value.f131939s);
        writer.M0("avatarColorIndex");
        k0Var3.d(writer, customScalarAdapters, value.f131940t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0034, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r4);
        kotlin.jvm.internal.Intrinsics.f(r5);
        kotlin.jvm.internal.Intrinsics.f(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0043, code lost:
    
        return new x40.a9(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
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
        throw new UnsupportedOperationException("Method not decompiled: y40.h8.f(tc.f, pc.v):java.lang.Object");
    }
}
