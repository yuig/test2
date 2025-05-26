package jd2;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements no2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final e f75546a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final oo2.g f75547b = h.Companion.serializer().a();

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f75547b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        RectF value = (RectF) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.k(h.Companion.serializer(), new h(value.left, value.top, value.right, value.bottom));
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        h hVar = (h) decoder.m(h.Companion.serializer());
        return new RectF(hVar.f75550a, hVar.f75551b, hVar.f75552c, hVar.f75553d);
    }
}
