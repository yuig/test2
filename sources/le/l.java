package le;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f83069a;

    /* renamed from: b, reason: collision with root package name */
    public final int f83070b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f83071c;

    public l(int i13, int i14, Intent intent) {
        this.f83069a = i13;
        this.f83070b = i14;
        this.f83071c = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f83069a == lVar.f83069a && this.f83070b == lVar.f83070b && Intrinsics.d(this.f83071c, lVar.f83071c);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f83070b, Integer.hashCode(this.f83069a) * 31, 31);
        Intent intent = this.f83071c;
        return b13 + (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        return "ActivityResultParameters(requestCode=" + this.f83069a + ", resultCode=" + this.f83070b + ", data=" + this.f83071c + ')';
    }
}
