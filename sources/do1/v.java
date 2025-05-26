package do1;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;
import nm1.d1;

/* loaded from: classes5.dex */
public final class v extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f55700b;

    /* renamed from: c, reason: collision with root package name */
    public final MotionEvent f55701c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(MotionEvent motionEvent, int i13) {
        super(i13, 8);
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        this.f55700b = i13;
        this.f55701c = motionEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f55700b == vVar.f55700b && Intrinsics.d(this.f55701c, vVar.f55701c);
    }

    public final int hashCode() {
        return this.f55701c.hashCode() + (Integer.hashCode(this.f55700b) * 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f55700b;
    }

    public final String toString() {
        return "TouchMove(id=" + this.f55700b + ", motionEvent=" + this.f55701c + ")";
    }
}
