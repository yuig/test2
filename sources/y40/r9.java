package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r9 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final r9 f137443a = new r9();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137444b = kotlin.collections.f0.j("__typename", "id", "entityId", "verifiedIdentity", "blockedByMe", "isVerifiedMerchant", "isDefaultImage", "imageXlargeUrl", "imageLargeUrl", "imageMediumUrl", "imageSmallUrl", "firstName", "lastName", "fullName", "username", "followerCount", "followingCount", "explicitlyFollowedByMe", "isPrivateProfile", "avatarColorIndex");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.la value = (x40.la) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f132727a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f132728b);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f132729c);
        writer.M0("verifiedIdentity");
        pc.c.b(pc.c.c(q9.f137413a)).d(writer, customScalarAdapters, value.f132730d);
        writer.M0("blockedByMe");
        pc.k0 k0Var = pc.c.f99527h;
        k0Var.d(writer, customScalarAdapters, value.f132731e);
        writer.M0("isVerifiedMerchant");
        k0Var.d(writer, customScalarAdapters, value.f132732f);
        writer.M0("isDefaultImage");
        k0Var.d(writer, customScalarAdapters, value.f132733g);
        writer.M0("imageXlargeUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f132734h);
        writer.M0("imageLargeUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f132735i);
        writer.M0("imageMediumUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f132736j);
        writer.M0("imageSmallUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f132737k);
        writer.M0("firstName");
        pc.k0 k0Var2 = pc.c.f99524e;
        k0Var2.d(writer, customScalarAdapters, value.f132738l);
        writer.M0("lastName");
        k0Var2.d(writer, customScalarAdapters, value.f132739m);
        writer.M0("fullName");
        k0Var2.d(writer, customScalarAdapters, value.f132740n);
        writer.M0("username");
        k0Var2.d(writer, customScalarAdapters, value.f132741o);
        writer.M0("followerCount");
        pc.k0 k0Var3 = pc.c.f99526g;
        k0Var3.d(writer, customScalarAdapters, value.f132742p);
        writer.M0("followingCount");
        k0Var3.d(writer, customScalarAdapters, value.f132743q);
        writer.M0("explicitlyFollowedByMe");
        k0Var.d(writer, customScalarAdapters, value.f132744r);
        writer.M0("isPrivateProfile");
        k0Var.d(writer, customScalarAdapters, value.f132745s);
        writer.M0("avatarColorIndex");
        k0Var3.d(writer, customScalarAdapters, value.f132746t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0034, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r4);
        kotlin.jvm.internal.Intrinsics.f(r5);
        kotlin.jvm.internal.Intrinsics.f(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0043, code lost:
    
        return new x40.la(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
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
        throw new UnsupportedOperationException("Method not decompiled: y40.r9.f(tc.f, pc.v):java.lang.Object");
    }
}
