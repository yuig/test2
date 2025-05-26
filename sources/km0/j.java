package km0;

import kotlin.jvm.internal.Intrinsics;
import o82.m2;
import x02.i2;

/* loaded from: classes5.dex */
public final class j extends m2 {

    /* renamed from: b, reason: collision with root package name */
    public final i2 f80194b;

    public j(i2 pinRepository) {
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        this.f80194b = pinRepository;
    }

    @Override // o82.m2
    public final do2.i j(Object obj) {
        return new dj0.c(new dj0.c(kotlin.jvm.internal.j.a(this.f80194b.y()), obj, 1), obj, 2);
    }

    @Override // o82.m2
    public final do2.i k(Object obj) {
        return new dj0.c(new dj0.c(kotlin.jvm.internal.j.a(this.f80194b.z()), obj, 1), obj, 2);
    }

    @Override // o82.m2
    public final do2.i l(Object obj) {
        return new dj0.c(new dj0.c(kotlin.jvm.internal.j.a(this.f80194b.B()), obj, 1), obj, 2);
    }
}
