package o6;

import android.view.View;
import androidx.gridlayout.widget.GridLayout;

/* loaded from: classes3.dex */
public final class c extends h {

    /* renamed from: d, reason: collision with root package name */
    public int f92917d;

    @Override // o6.h
    public final int a(GridLayout gridLayout, View view, d dVar, int i13, boolean z13) {
        return Math.max(0, super.a(gridLayout, view, dVar, i13, z13));
    }

    @Override // o6.h
    public final void b(int i13, int i14) {
        super.b(i13, i14);
        this.f92917d = Math.max(this.f92917d, i13 + i14);
    }

    @Override // o6.h
    public final void c() {
        super.c();
        this.f92917d = Integer.MIN_VALUE;
    }

    @Override // o6.h
    public final int d(boolean z13) {
        return Math.max(super.d(z13), this.f92917d);
    }
}
