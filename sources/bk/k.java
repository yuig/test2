package bk;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f23077a;

    public k(float f13) {
        this.f23077a = f13;
    }

    @Override // bk.d
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f23077a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f23077a == ((k) obj).f23077a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f23077a)});
    }
}
