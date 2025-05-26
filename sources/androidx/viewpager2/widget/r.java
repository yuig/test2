package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;

/* loaded from: classes3.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19980a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f19981b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19982c;

    public r(RecyclerView recyclerView, int i13) {
        this.f19981b = recyclerView;
        this.f19982c = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f19980a;
        int i14 = this.f19982c;
        RecyclerView recyclerView = this.f19981b;
        switch (i13) {
            case 0:
                recyclerView.d3(i14);
                break;
            default:
                l2 l2Var = recyclerView.f19242n;
                View z13 = l2Var != null ? l2Var.z(i14) : null;
                if (z13 != null) {
                    recyclerView.scrollBy(0, ((z13.getBottom() + z13.getTop()) / 2) - (recyclerView.getHeight() / 2));
                    break;
                } else {
                    recyclerView.G2(i14);
                    recyclerView.post(this);
                    break;
                }
        }
    }

    public r(int i13, RecyclerView recyclerView) {
        this.f19982c = i13;
        this.f19981b = recyclerView;
    }
}
