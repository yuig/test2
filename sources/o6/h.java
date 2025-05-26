package o6;

import a.cb;
import android.util.LogPrinter;
import android.view.View;
import androidx.gridlayout.widget.GridLayout;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a */
    public int f92929a;

    /* renamed from: b */
    public int f92930b;

    /* renamed from: c */
    public int f92931c;

    public h() {
        c();
    }

    public int a(GridLayout gridLayout, View view, d dVar, int i13, boolean z13) {
        return this.f92929a - dVar.e(view, i13, gridLayout.getLayoutMode());
    }

    public void b(int i13, int i14) {
        this.f92929a = Math.max(this.f92929a, i13);
        this.f92930b = Math.max(this.f92930b, i14);
    }

    public void c() {
        this.f92929a = Integer.MIN_VALUE;
        this.f92930b = Integer.MIN_VALUE;
        this.f92931c = 2;
    }

    public int d(boolean z13) {
        if (!z13) {
            int i13 = this.f92931c;
            LogPrinter logPrinter = GridLayout.f18515i;
            if ((i13 & 2) != 0) {
                return 100000;
            }
        }
        return this.f92929a + this.f92930b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Bounds{before=");
        sb3.append(this.f92929a);
        sb3.append(", after=");
        return cb.l(sb3, this.f92930b, '}');
    }
}
