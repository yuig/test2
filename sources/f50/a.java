package f50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f61106a = new a();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        e50.a value = (e50.a) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(value instanceof e50.f)) {
            if (value instanceof e50.b) {
                List list = b.f61111a;
                e50.b value2 = (e50.b) value;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                Intrinsics.checkNotNullParameter(value2, "value");
                writer.M0("__typename");
                pc.c.f99520a.d(writer, customScalarAdapters, value2.f57263b);
                return;
            }
            return;
        }
        List list2 = f.f61132a;
        e50.f value3 = (e50.f) value;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value3, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value3.f57321b);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value3.f57322c);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value3.f57323d);
        writer.M0("explicitlyFollowedByMe");
        pc.k0 k0Var = pc.c.f99527h;
        k0Var.d(writer, customScalarAdapters, value3.f57324e);
        writer.M0("followerCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value3.f57325f);
        writer.M0("fullName");
        pc.k0 k0Var2 = pc.c.f99524e;
        k0Var2.d(writer, customScalarAdapters, value3.f57326g);
        writer.M0("imageMediumUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value3.f57327h);
        writer.M0("username");
        k0Var2.d(writer, customScalarAdapters, value3.f57328i);
        writer.M0("isVerifiedMerchant");
        k0Var.d(writer, customScalarAdapters, value3.f57329j);
        writer.M0("blockedByMe");
        k0Var.d(writer, customScalarAdapters, value3.f57330k);
        writer.M0("isPrivateProfile");
        k0Var.d(writer, customScalarAdapters, value3.f57331l);
        writer.M0("verifiedIdentity");
        pc.c.b(pc.c.c(e.f61126a)).d(writer, customScalarAdapters, value3.f57332m);
        writer.M0("contextualPinImageUrls");
        pc.c.b(pc.c.a(pc.c.c(c.f61116a))).d(writer, customScalarAdapters, value3.f57333n);
        writer.M0("recentPinImages");
        pc.c.b(pc.c.a(pc.c.c(d.f61121a))).d(writer, customScalarAdapters, value3.f57334o);
        writer.M0("showCreatorProfile");
        k0Var.d(writer, customScalarAdapters, value3.f57335p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r6);
        kotlin.jvm.internal.Intrinsics.f(r7);
        kotlin.jvm.internal.Intrinsics.f(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        return new e50.f(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
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
        throw new UnsupportedOperationException("Method not decompiled: f50.a.f(tc.f, pc.v):java.lang.Object");
    }
}
