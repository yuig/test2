package wn1;

import android.view.KeyEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends z {

    /* renamed from: b, reason: collision with root package name */
    public final int f130576b;

    /* renamed from: c, reason: collision with root package name */
    public final int f130577c;

    /* renamed from: d, reason: collision with root package name */
    public final KeyEvent f130578d;

    public q(int i13, KeyEvent keyEvent, int i14) {
        super(i13);
        this.f130576b = i13;
        this.f130577c = i14;
        this.f130578d = keyEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f130576b == qVar.f130576b && this.f130577c == qVar.f130577c && Intrinsics.d(this.f130578d, qVar.f130578d);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f130577c, Integer.hashCode(this.f130576b) * 31, 31);
        KeyEvent keyEvent = this.f130578d;
        return b13 + (keyEvent == null ? 0 : keyEvent.hashCode());
    }

    @Override // gm1.c
    public final int j() {
        return this.f130576b;
    }

    public final String toString() {
        return "EditorAction(id=" + this.f130576b + ", actionId=" + this.f130577c + ", keyEvent=" + this.f130578d + ")";
    }
}
