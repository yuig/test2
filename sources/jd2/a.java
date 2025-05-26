package jd2;

import android.graphics.PointF;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements no2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f75540a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final oo2.g f75541b = d.Companion.serializer().a();

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f75541b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        PointF value = (PointF) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.k(d.Companion.serializer(), new d(value.x, value.y));
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        d dVar = (d) decoder.m(d.Companion.serializer());
        return new PointF(dVar.f75544a, dVar.f75545b);
    }
}
