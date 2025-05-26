package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class rf implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final rf f137453a = new rf();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137454b = kotlin.collections.f0.j("__typename", "id", "entityId", "verifiedIdentity", "blockedByMe", "isVerifiedMerchant", "isDefaultImage", "imageXlargeUrl", "imageLargeUrl", "imageMediumUrl", "imageSmallUrl", "firstName", "lastName", "fullName", "username", "followerCount", "followingCount", "explicitlyFollowedByMe", "isPrivateProfile", "avatarColorIndex");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.xg value = (x40.xg) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f133691a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f133692b);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f133693c);
        writer.M0("verifiedIdentity");
        pc.c.b(pc.c.c(qf.f137423a)).d(writer, customScalarAdapters, value.f133694d);
        writer.M0("blockedByMe");
        pc.k0 k0Var = pc.c.f99527h;
        k0Var.d(writer, customScalarAdapters, value.f133695e);
        writer.M0("isVerifiedMerchant");
        k0Var.d(writer, customScalarAdapters, value.f133696f);
        writer.M0("isDefaultImage");
        k0Var.d(writer, customScalarAdapters, value.f133697g);
        writer.M0("imageXlargeUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f133698h);
        writer.M0("imageLargeUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f133699i);
        writer.M0("imageMediumUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f133700j);
        writer.M0("imageSmallUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f133701k);
        writer.M0("firstName");
        pc.k0 k0Var2 = pc.c.f99524e;
        k0Var2.d(writer, customScalarAdapters, value.f133702l);
        writer.M0("lastName");
        k0Var2.d(writer, customScalarAdapters, value.f133703m);
        writer.M0("fullName");
        k0Var2.d(writer, customScalarAdapters, value.f133704n);
        writer.M0("username");
        k0Var2.d(writer, customScalarAdapters, value.f133705o);
        writer.M0("followerCount");
        pc.k0 k0Var3 = pc.c.f99526g;
        k0Var3.d(writer, customScalarAdapters, value.f133706p);
        writer.M0("followingCount");
        k0Var3.d(writer, customScalarAdapters, value.f133707q);
        writer.M0("explicitlyFollowedByMe");
        k0Var.d(writer, customScalarAdapters, value.f133708r);
        writer.M0("isPrivateProfile");
        k0Var.d(writer, customScalarAdapters, value.f133709s);
        writer.M0("avatarColorIndex");
        k0Var3.d(writer, customScalarAdapters, value.f133710t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0034, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r4);
        kotlin.jvm.internal.Intrinsics.f(r5);
        kotlin.jvm.internal.Intrinsics.f(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0043, code lost:
    
        return new x40.xg(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
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
        throw new UnsupportedOperationException("Method not decompiled: y40.rf.f(tc.f, pc.v):java.lang.Object");
    }
}
