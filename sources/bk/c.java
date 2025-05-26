package bk;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f23026a;

    public c(float f13) {
        this.f23026a = f13;
    }

    @Override // bk.d
    public final float a(RectF rectF) {
        return Math.min(this.f23026a, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f23026a == ((c) obj).f23026a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f23026a)});
    }
}
