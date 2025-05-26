package ln2;

import java.util.Set;
import kotlin.collections.g1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static final Set f84096c = g1.b(ym2.b.j(xl2.q.f135296c.g()));

    /* renamed from: a, reason: collision with root package name */
    public final o f84097a;

    /* renamed from: b, reason: collision with root package name */
    public final on2.m f84098b;

    public l(o components) {
        Intrinsics.checkNotNullParameter(components, "components");
        this.f84097a = components;
        this.f84098b = ((on2.q) components.f84108a).e(new e82.l(this, 25));
    }

    public final am2.g a(ym2.b classId, h hVar) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        return (am2.g) this.f84098b.invoke(new j(classId, hVar));
    }
}
