package do1;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;
import nm1.d1;

/* loaded from: classes5.dex */
public final class u extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f55698b;

    /* renamed from: c, reason: collision with root package name */
    public final MotionEvent f55699c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(MotionEvent motionEvent, int i13) {
        super(i13, 8);
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        this.f55698b = i13;
        this.f55699c = motionEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f55698b == uVar.f55698b && Intrinsics.d(this.f55699c, uVar.f55699c);
    }

    public final int hashCode() {
        return this.f55699c.hashCode() + (Integer.hashCode(this.f55698b) * 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f55698b;
    }

    public final String toString() {
        return "TouchDown(id=" + this.f55698b + ", motionEvent=" + this.f55699c + ")";
    }
}
