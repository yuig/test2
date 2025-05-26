package wn1;

import android.view.KeyEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u extends z {

    /* renamed from: b, reason: collision with root package name */
    public final int f130583b;

    /* renamed from: c, reason: collision with root package name */
    public final int f130584c;

    /* renamed from: d, reason: collision with root package name */
    public final KeyEvent f130585d;

    public u(int i13, KeyEvent keyEvent, int i14) {
        super(i13);
        this.f130583b = i13;
        this.f130584c = i14;
        this.f130585d = keyEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f130583b == uVar.f130583b && this.f130584c == uVar.f130584c && Intrinsics.d(this.f130585d, uVar.f130585d);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f130584c, Integer.hashCode(this.f130583b) * 31, 31);
        KeyEvent keyEvent = this.f130585d;
        return b13 + (keyEvent == null ? 0 : keyEvent.hashCode());
    }

    @Override // gm1.c
    public final int j() {
        return this.f130583b;
    }

    public final String toString() {
        return "OnKey(id=" + this.f130583b + ", keyCode=" + this.f130584c + ", keyEvent=" + this.f130585d + ")";
    }
}
