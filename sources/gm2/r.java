package gm2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r extends f implements pm2.h {

    /* renamed from: b, reason: collision with root package name */
    public final Class f65787b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ym2.g gVar, Class klass) {
        super(gVar);
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.f65787b = klass;
    }

    public final d0 a() {
        return re2.f.c(this.f65787b);
    }
}
