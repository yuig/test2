package do1;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;
import nm1.d1;

/* loaded from: classes5.dex */
public final class w extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f55702b;

    /* renamed from: c, reason: collision with root package name */
    public final MotionEvent f55703c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(MotionEvent motionEvent, int i13) {
        super(i13, 8);
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        this.f55702b = i13;
        this.f55703c = motionEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f55702b == wVar.f55702b && Intrinsics.d(this.f55703c, wVar.f55703c);
    }

    public final int hashCode() {
        return this.f55703c.hashCode() + (Integer.hashCode(this.f55702b) * 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f55702b;
    }

    public final String toString() {
        return "TouchUp(id=" + this.f55702b + ", motionEvent=" + this.f55703c + ")";
    }
}
