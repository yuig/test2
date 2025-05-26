package xn1;

import android.view.KeyEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends j {

    /* renamed from: b, reason: collision with root package name */
    public final int f135449b;

    /* renamed from: c, reason: collision with root package name */
    public final int f135450c;

    /* renamed from: d, reason: collision with root package name */
    public final KeyEvent f135451d;

    public g(int i13, KeyEvent keyEvent, int i14) {
        super(i13);
        this.f135449b = i13;
        this.f135450c = i14;
        this.f135451d = keyEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f135449b == gVar.f135449b && this.f135450c == gVar.f135450c && Intrinsics.d(this.f135451d, gVar.f135451d);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f135450c, Integer.hashCode(this.f135449b) * 31, 31);
        KeyEvent keyEvent = this.f135451d;
        return b13 + (keyEvent == null ? 0 : keyEvent.hashCode());
    }

    @Override // gm1.c
    public final int j() {
        return this.f135449b;
    }

    public final String toString() {
        return "OnKey(id=" + this.f135449b + ", keyCode=" + this.f135450c + ", keyEvent=" + this.f135451d + ")";
    }
}
