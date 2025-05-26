package gm2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v extends f implements pm2.k {

    /* renamed from: b, reason: collision with root package name */
    public final Enum f65791b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ym2.g gVar, Enum value) {
        super(gVar);
        Intrinsics.checkNotNullParameter(value, "value");
        this.f65791b = value;
    }

    public final ym2.g a() {
        return ym2.g.e(this.f65791b.name());
    }

    public final ym2.b b() {
        Class<?> cls = this.f65791b.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        Intrinsics.f(cls);
        return d.a(cls);
    }
}
