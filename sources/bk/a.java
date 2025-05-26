package bk;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f23018a;

    public a(float f13) {
        this.f23018a = f13;
    }

    @Override // bk.d
    public final float a(RectF rectF) {
        return this.f23018a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f23018a == ((a) obj).f23018a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f23018a)});
    }
}
