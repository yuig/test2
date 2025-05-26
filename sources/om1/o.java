package om1;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o extends p {

    /* renamed from: b, reason: collision with root package name */
    public final int f96674b;

    /* renamed from: c, reason: collision with root package name */
    public final MotionEvent f96675c;

    public o(MotionEvent motionEvent, int i13) {
        super(i13);
        this.f96674b = i13;
        this.f96675c = motionEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f96674b == oVar.f96674b && Intrinsics.d(this.f96675c, oVar.f96675c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f96674b) * 31;
        MotionEvent motionEvent = this.f96675c;
        return hashCode + (motionEvent == null ? 0 : motionEvent.hashCode());
    }

    @Override // gm1.c
    public final int j() {
        return this.f96674b;
    }

    public final String toString() {
        return "TouchUp(id=" + this.f96674b + ", motionEvent=" + this.f96675c + ")";
    }
}
