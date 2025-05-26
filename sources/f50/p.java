package f50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final p f61165a = new p();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        e50.q value = (e50.q) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(value instanceof e50.z)) {
            if (!(value instanceof e50.v)) {
                if (value instanceof e50.r) {
                    List list = q.f61168a;
                    e50.r value2 = (e50.r) value;
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                    Intrinsics.checkNotNullParameter(value2, "value");
                    writer.M0("__typename");
                    pc.c.f99520a.d(writer, customScalarAdapters, value2.f57410b);
                    return;
                }
                return;
            }
            List list2 = u.f61183a;
            e50.v value3 = (e50.v) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f57431b);
            writer.M0("containerType");
            pc.c.f99528i.d(writer, customScalarAdapters, value3.f57432c);
            writer.M0("displayOptions");
            pc.c.b(pc.c.c(s.f61175a)).d(writer, customScalarAdapters, value3.f57433d);
            writer.M0("title");
            pc.c.b(pc.c.c(t.f61179a)).d(writer, customScalarAdapters, value3.f57434e);
            return;
        }
        List list3 = y.f61198a;
        e50.z value4 = (e50.z) value;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value4, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value4.f57461b);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value4.f57462c);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value4.f57463d);
        writer.M0("explicitlyFollowedByMe");
        pc.k0 k0Var = pc.c.f99527h;
        k0Var.d(writer, customScalarAdapters, value4.f57464e);
        writer.M0("followerCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value4.f57465f);
        writer.M0("fullName");
        pc.k0 k0Var2 = pc.c.f99524e;
        k0Var2.d(writer, customScalarAdapters, value4.f57466g);
        writer.M0("imageMediumUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value4.f57467h);
        writer.M0("username");
        k0Var2.d(writer, customScalarAdapters, value4.f57468i);
        writer.M0("isVerifiedMerchant");
        k0Var.d(writer, customScalarAdapters, value4.f57469j);
        writer.M0("blockedByMe");
        k0Var.d(writer, customScalarAdapters, value4.f57470k);
        writer.M0("isPrivateProfile");
        k0Var.d(writer, customScalarAdapters, value4.f57471l);
        writer.M0("verifiedIdentity");
        pc.c.b(pc.c.c(x.f61194a)).d(writer, customScalarAdapters, value4.f57472m);
        writer.M0("contextualPinImageUrls");
        pc.c.b(pc.c.a(pc.c.c(v.f61186a))).d(writer, customScalarAdapters, value4.f57473n);
        writer.M0("recentPinImages");
        pc.c.b(pc.c.a(pc.c.c(w.f61190a))).d(writer, customScalarAdapters, value4.f57474o);
        writer.M0("showCreatorProfile");
        k0Var.d(writer, customScalarAdapters, value4.f57475p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0042, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r9);
        kotlin.jvm.internal.Intrinsics.f(r10);
        kotlin.jvm.internal.Intrinsics.f(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        return new e50.z(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
     */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r25, pc.v r26) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f50.p.f(tc.f, pc.v):java.lang.Object");
    }
}
