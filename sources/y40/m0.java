package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f137267a = new m0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137268b = kotlin.collections.e0.b("v3ApproveBoardCollaboratorInviteMutationv2");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.s0 value = (x40.s0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3ApproveBoardCollaboratorInviteMutationv2");
        pc.c.b(pc.c.c(l0.f137235a)).d(writer, customScalarAdapters, value.f133221a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.r0 r0Var = null;
        while (reader.V1(f137268b) == 0) {
            r0Var = (x40.r0) pc.c.b(pc.c.c(l0.f137235a)).f(reader, customScalarAdapters);
        }
        return new x40.s0(r0Var);
    }
}
