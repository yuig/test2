package om1;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends p {

    /* renamed from: b, reason: collision with root package name */
    public final int f96672b;

    /* renamed from: c, reason: collision with root package name */
    public final MotionEvent f96673c;

    public n(MotionEvent motionEvent, int i13) {
        super(i13);
        this.f96672b = i13;
        this.f96673c = motionEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f96672b == nVar.f96672b && Intrinsics.d(this.f96673c, nVar.f96673c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f96672b) * 31;
        MotionEvent motionEvent = this.f96673c;
        return hashCode + (motionEvent == null ? 0 : motionEvent.hashCode());
    }

    @Override // gm1.c
    public final int j() {
        return this.f96672b;
    }

    public final String toString() {
        return "TouchDown(id=" + this.f96672b + ", motionEvent=" + this.f96673c + ")";
    }
}
