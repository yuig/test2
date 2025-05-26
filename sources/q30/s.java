package q30;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import p30.t;
import p30.u;
import pc.v;

/* loaded from: classes2.dex */
public final class s implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final s f102302a = new s();

    /* renamed from: b, reason: collision with root package name */
    public static final List f102303b = e0.b("v3RedeemInviteMutation");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        u value = (u) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3RedeemInviteMutation");
        pc.c.b(pc.c.c(r.f102301a)).d(writer, customScalarAdapters, value.f98758a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        t tVar = null;
        while (reader.V1(f102303b) == 0) {
            tVar = (t) pc.c.b(pc.c.c(r.f102301a)).f(reader, customScalarAdapters);
        }
        return new u(tVar);
    }
}
