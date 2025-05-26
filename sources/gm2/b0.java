package gm2;

import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b0 extends d0 implements pm2.n {

    /* renamed from: a, reason: collision with root package name */
    public final Class f65757a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f65758b;

    public b0(Class reflectType) {
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.f65757a = reflectType;
        this.f65758b = q0.f80391a;
    }

    @Override // gm2.d0
    public final Type b() {
        return this.f65757a;
    }

    @Override // pm2.d
    public final Collection getAnnotations() {
        return this.f65758b;
    }
}
