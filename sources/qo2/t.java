package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t implements no2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final t f104623a = new t();

    /* renamed from: b, reason: collision with root package name */
    public static final c1 f104624b = new c1("kotlin.time.Duration", oo2.e.f96882i);

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f104624b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        long j13 = ((zn2.b) obj).f142314a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        zn2.a aVar = zn2.b.f142311b;
        StringBuilder sb3 = new StringBuilder();
        if (j13 < 0) {
            sb3.append('-');
        }
        sb3.append("PT");
        long p13 = j13 < 0 ? zn2.b.p(j13) : j13;
        long n13 = zn2.b.n(p13, zn2.d.HOURS);
        boolean z13 = false;
        int n14 = zn2.b.i(p13) ? 0 : (int) (zn2.b.n(p13, zn2.d.MINUTES) % 60);
        int n15 = zn2.b.i(p13) ? 0 : (int) (zn2.b.n(p13, zn2.d.SECONDS) % 60);
        int g13 = zn2.b.g(p13);
        if (zn2.b.i(j13)) {
            n13 = 9999999999999L;
        }
        boolean z14 = n13 != 0;
        boolean z15 = (n15 == 0 && g13 == 0) ? false : true;
        if (n14 != 0 || (z15 && z14)) {
            z13 = true;
        }
        if (z14) {
            sb3.append(n13);
            sb3.append('H');
        }
        if (z13) {
            sb3.append(n14);
            sb3.append('M');
        }
        if (z15 || (!z14 && !z13)) {
            zn2.b.b(sb3, n15, g13, 9, "S", true);
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        encoder.F(sb4);
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        zn2.a aVar = zn2.b.f142311b;
        String value = decoder.z();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return new zn2.b(dl2.b.j(value, true));
        } catch (IllegalArgumentException e13) {
            throw new IllegalArgumentException(a.a.k("Invalid ISO duration string format: '", value, "'."), e13);
        }
    }
}
