package xn1;

import android.view.KeyEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends j {

    /* renamed from: b, reason: collision with root package name */
    public final int f135443b;

    /* renamed from: c, reason: collision with root package name */
    public final int f135444c;

    /* renamed from: d, reason: collision with root package name */
    public final KeyEvent f135445d;

    public d(int i13, KeyEvent keyEvent, int i14) {
        super(i13);
        this.f135443b = i13;
        this.f135444c = i14;
        this.f135445d = keyEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f135443b == dVar.f135443b && this.f135444c == dVar.f135444c && Intrinsics.d(this.f135445d, dVar.f135445d);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f135444c, Integer.hashCode(this.f135443b) * 31, 31);
        KeyEvent keyEvent = this.f135445d;
        return b13 + (keyEvent == null ? 0 : keyEvent.hashCode());
    }

    @Override // gm1.c
    public final int j() {
        return this.f135443b;
    }

    public final String toString() {
        return "EditorAction(id=" + this.f135443b + ", actionId=" + this.f135444c + ", keyEvent=" + this.f135445d + ")";
    }
}
