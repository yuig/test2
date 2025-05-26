package y40;

import com.appsflyer.AdRevenueScheme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x40.cj;
import x40.ji;
import x40.ki;

/* loaded from: classes.dex */
public final class ah implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ah f136910a = new ah();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        ji value = (ji) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(value instanceof cj)) {
            if (value instanceof ki) {
                List list = bh.f136940a;
                bh.b(writer, customScalarAdapters, (ki) value);
                return;
            }
            return;
        }
        List list2 = th.f137520a;
        cj value2 = (cj) value;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value2, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value2.f132175a);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value2.f132176b);
        writer.M0("followerCount");
        pc.k0 k0Var = pc.c.f99526g;
        k0Var.d(writer, customScalarAdapters, value2.f132177c);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value2.f132178d);
        writer.M0("isVerifiedMerchant");
        pc.k0 k0Var2 = pc.c.f99527h;
        k0Var2.d(writer, customScalarAdapters, value2.f132179e);
        writer.M0("contextualPinImageUrls");
        pc.c.b(pc.c.a(pc.c.c(gh.f137106a))).d(writer, customScalarAdapters, value2.f132180f);
        writer.M0("recentPinImages");
        pc.c.b(pc.c.a(pc.c.c(jh.f137202a))).d(writer, customScalarAdapters, value2.f132181g);
        writer.M0("username");
        pc.k0 k0Var3 = pc.c.f99524e;
        k0Var3.d(writer, customScalarAdapters, value2.f132182h);
        writer.M0("verifiedIdentity");
        pc.c.b(pc.c.c(sh.f137486a)).d(writer, customScalarAdapters, value2.f132183i);
        writer.M0("blockedByMe");
        k0Var2.d(writer, customScalarAdapters, value2.f132184j);
        writer.M0("explicitlyFollowedByMe");
        k0Var2.d(writer, customScalarAdapters, value2.f132185k);
        writer.M0("isDefaultImage");
        k0Var2.d(writer, customScalarAdapters, value2.f132186l);
        writer.M0("imageXlargeUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value2.f132187m);
        writer.M0("imageLargeUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value2.f132188n);
        writer.M0("imageMediumUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value2.f132189o);
        writer.M0("imageSmallUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value2.f132190p);
        writer.M0("fullName");
        k0Var3.d(writer, customScalarAdapters, value2.f132191q);
        writer.M0("firstName");
        k0Var3.d(writer, customScalarAdapters, value2.f132192r);
        writer.M0("lastName");
        k0Var3.d(writer, customScalarAdapters, value2.f132193s);
        writer.M0("ageInYears");
        k0Var.d(writer, customScalarAdapters, value2.f132194t);
        writer.M0("email");
        k0Var3.d(writer, customScalarAdapters, value2.f132195u);
        writer.M0("isPartner");
        k0Var2.d(writer, customScalarAdapters, value2.f132196v);
        writer.M0("websiteUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value2.f132197w);
        writer.M0("about");
        k0Var3.d(writer, customScalarAdapters, value2.f132198x);
        writer.M0("pronouns");
        pc.c.b(pc.c.a(eVar)).d(writer, customScalarAdapters, value2.f132199y);
        writer.M0(AdRevenueScheme.COUNTRY);
        k0Var3.d(writer, customScalarAdapters, value2.f132200z);
        writer.M0("bizPartner");
        pc.c.b(pc.c.c(fh.f137071a)).d(writer, customScalarAdapters, value2.A);
        writer.M0("showCreatorProfile");
        k0Var2.d(writer, customScalarAdapters, value2.B);
        writer.M0("hasConfirmedEmail");
        k0Var2.d(writer, customScalarAdapters, value2.C);
        writer.M0("isAnyWebsiteVerified");
        k0Var2.d(writer, customScalarAdapters, value2.D);
        writer.M0("profileUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value2.E);
        writer.M0("gender");
        k0Var3.d(writer, customScalarAdapters, value2.F);
        writer.M0("isPrivateProfile");
        k0Var2.d(writer, customScalarAdapters, value2.G);
        writer.M0("listedWebsiteUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value2.H);
        writer.M0("location");
        k0Var3.d(writer, customScalarAdapters, value2.I);
        writer.M0("additionalWebsiteUrls");
        pc.c.b(pc.c.a(eVar)).d(writer, customScalarAdapters, value2.f132174J);
        writer.M0("verifiedUserWebsites");
        pc.c.b(pc.c.a(eVar)).d(writer, customScalarAdapters, value2.K);
        writer.M0("impressumUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value2.L);
        writer.M0("followers");
        pc.c.b(pc.c.c(hh.f137138a)).d(writer, customScalarAdapters, value2.M);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x006f, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r6);
        kotlin.jvm.internal.Intrinsics.f(r7);
        kotlin.jvm.internal.Intrinsics.f(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        return new x40.cj(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44);
     */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r46, pc.v r47) {
        /*
            Method dump skipped, instructions count: 772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.ah.f(tc.f, pc.v):java.lang.Object");
    }
}
