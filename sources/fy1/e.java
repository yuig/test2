package fy1;

import f0.h;
import java.math.RoundingMode;
import java.text.NumberFormat;
import kotlin.jvm.internal.Intrinsics;
import qb0.j;

/* loaded from: classes4.dex */
public final class e extends h {

    /* renamed from: b, reason: collision with root package name */
    public final d f63109b;

    /* renamed from: c, reason: collision with root package name */
    public final int f63110c;

    public /* synthetic */ e(d dVar) {
        this(dVar, 2);
    }

    @Override // f0.h
    public final String G(float f13) {
        if (this.f63109b == d.BIG_NUMBERS) {
            return j.b((int) f13);
        }
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setRoundingMode(RoundingMode.DOWN);
        percentInstance.setMaximumFractionDigits(this.f63110c);
        String format = percentInstance.format(Float.valueOf(f13 / 100));
        Intrinsics.f(format);
        return format;
    }

    public final String t0(double d2) {
        if (this.f63109b == d.BIG_NUMBERS) {
            return j.b((int) d2);
        }
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setRoundingMode(RoundingMode.DOWN);
        double abs = Math.abs(d2);
        int i13 = (abs >= 0.1d || abs < 0.001d) ? 0 : 1;
        percentInstance.setMinimumFractionDigits(i13);
        percentInstance.setMaximumFractionDigits(i13);
        String format = percentInstance.format(Math.min(d2, 9.99d));
        Intrinsics.f(format);
        return format;
    }

    public e(d format, int i13) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.f63109b = format;
        this.f63110c = i13;
    }
}
