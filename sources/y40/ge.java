package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ge implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ge f137101a = new ge();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137102b = kotlin.collections.f0.j("__typename", "id", "entityId", "verifiedIdentity", "blockedByMe", "isVerifiedMerchant", "isDefaultImage", "imageXlargeUrl", "imageLargeUrl", "imageMediumUrl", "imageSmallUrl", "firstName", "lastName", "fullName", "username", "followerCount", "followingCount", "explicitlyFollowedByMe", "isPrivateProfile", "avatarColorIndex");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.lf value = (x40.lf) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f132754a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f132755b);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f132756c);
        writer.M0("verifiedIdentity");
        pc.c.b(pc.c.c(fe.f137065a)).d(writer, customScalarAdapters, value.f132757d);
        writer.M0("blockedByMe");
        pc.k0 k0Var = pc.c.f99527h;
        k0Var.d(writer, customScalarAdapters, value.f132758e);
        writer.M0("isVerifiedMerchant");
        k0Var.d(writer, customScalarAdapters, value.f132759f);
        writer.M0("isDefaultImage");
        k0Var.d(writer, customScalarAdapters, value.f132760g);
        writer.M0("imageXlargeUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f132761h);
        writer.M0("imageLargeUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f132762i);
        writer.M0("imageMediumUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f132763j);
        writer.M0("imageSmallUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f132764k);
        writer.M0("firstName");
        pc.k0 k0Var2 = pc.c.f99524e;
        k0Var2.d(writer, customScalarAdapters, value.f132765l);
        writer.M0("lastName");
        k0Var2.d(writer, customScalarAdapters, value.f132766m);
        writer.M0("fullName");
        k0Var2.d(writer, customScalarAdapters, value.f132767n);
        writer.M0("username");
        k0Var2.d(writer, customScalarAdapters, value.f132768o);
        writer.M0("followerCount");
        pc.k0 k0Var3 = pc.c.f99526g;
        k0Var3.d(writer, customScalarAdapters, value.f132769p);
        writer.M0("followingCount");
        k0Var3.d(writer, customScalarAdapters, value.f132770q);
        writer.M0("explicitlyFollowedByMe");
        k0Var.d(writer, customScalarAdapters, value.f132771r);
        writer.M0("isPrivateProfile");
        k0Var.d(writer, customScalarAdapters, value.f132772s);
        writer.M0("avatarColorIndex");
        k0Var3.d(writer, customScalarAdapters, value.f132773t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0034, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r4);
        kotlin.jvm.internal.Intrinsics.f(r5);
        kotlin.jvm.internal.Intrinsics.f(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0043, code lost:
    
        return new x40.lf(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
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
        throw new UnsupportedOperationException("Method not decompiled: y40.ge.f(tc.f, pc.v):java.lang.Object");
    }
}
