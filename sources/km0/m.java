package km0;

import kotlin.jvm.internal.Intrinsics;
import o82.m2;
import x02.z0;

/* loaded from: classes5.dex */
public final class m extends m2 {

    /* renamed from: b, reason: collision with root package name */
    public final z0 f80201b;

    public m(z0 sectionRepository) {
        Intrinsics.checkNotNullParameter(sectionRepository, "sectionRepository");
        this.f80201b = sectionRepository;
    }

    @Override // o82.m2
    public final do2.i j(Object obj) {
        return new dj0.c(new dj0.c(kotlin.jvm.internal.j.a(this.f80201b.y()), obj, 3), obj, 4);
    }

    @Override // o82.m2
    public final do2.i k(Object obj) {
        return new dj0.c(new dj0.c(kotlin.jvm.internal.j.a(this.f80201b.z()), obj, 3), obj, 4);
    }

    @Override // o82.m2
    public final do2.i l(Object obj) {
        return new dj0.c(new dj0.c(kotlin.jvm.internal.j.a(this.f80201b.B()), obj, 3), obj, 4);
    }
}
