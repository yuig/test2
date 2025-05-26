package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x40.aj;
import x40.qi;
import x40.ri;

/* loaded from: classes.dex */
public final class hh implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final hh f137138a = new hh();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        qi value = (qi) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof aj) {
            List list = rh.f137456a;
            rh.b(writer, customScalarAdapters, (aj) value);
        } else if (value instanceof ri) {
            List list2 = ih.f137171a;
            ih.b(writer, customScalarAdapters, (ri) value);
        }
    }

    @Override // pc.a
    public final Object f(tc.f fVar, pc.v vVar) {
        String m13 = ep.b.m(fVar, "reader", vVar, "customScalarAdapters", fVar);
        return Intrinsics.d(m13, "UserFollowersConnectionContainer") ? rh.a(fVar, vVar, m13) : ih.a(fVar, vVar, m13);
    }
}
