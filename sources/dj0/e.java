package dj0;

import do2.c0;
import kotlin.jvm.internal.Intrinsics;
import o82.m2;
import x02.i2;

/* loaded from: classes5.dex */
public final class e extends m2 {

    /* renamed from: b, reason: collision with root package name */
    public final i2 f55132b;

    public e(i2 pinRepository) {
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        this.f55132b = pinRepository;
    }

    @Override // o82.m2
    public final do2.i l(Object obj) {
        return new c(c0.a(kotlin.jvm.internal.j.a(this.f55132b.B()), d.f55131i), obj, 0);
    }
}
