package bk;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f23019a;

    /* renamed from: b, reason: collision with root package name */
    public final float f23020b;

    public b(float f13, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f23019a;
            f13 += ((b) dVar).f23020b;
        }
        this.f23019a = dVar;
        this.f23020b = f13;
    }

    @Override // bk.d
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f23019a.a(rectF) + this.f23020b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f23019a.equals(bVar.f23019a) && this.f23020b == bVar.f23020b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23019a, Float.valueOf(this.f23020b)});
    }
}
