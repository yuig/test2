package qo2;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z1 implements no2.b {

    /* renamed from: b, reason: collision with root package name */
    public static final z1 f104671b = new z1();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f104672a = new w(Unit.f80348a, "kotlin.Unit");

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return this.f104672a.a();
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        Unit value = (Unit) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f104672a.c(encoder, value);
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        this.f104672a.e(decoder);
        return Unit.f80348a;
    }
}
