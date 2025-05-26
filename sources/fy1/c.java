package fy1;

import f0.h;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class c extends h {
    @Override // f0.h
    public final String E(float f13) {
        return G(f13);
    }

    @Override // f0.h
    public final String G(float f13) {
        float f14 = f13 / 60000;
        long minutes = TimeUnit.MILLISECONDS.toMinutes((long) f13);
        return (f14 <= 0.0f || minutes != 0) ? String.valueOf(minutes) : "<1";
    }
}
