package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19741a;

    /* renamed from: b, reason: collision with root package name */
    public int f19742b;

    /* renamed from: c, reason: collision with root package name */
    public int f19743c;

    /* renamed from: d, reason: collision with root package name */
    public int f19744d;

    /* renamed from: e, reason: collision with root package name */
    public int f19745e;

    /* renamed from: f, reason: collision with root package name */
    public int f19746f;

    /* renamed from: g, reason: collision with root package name */
    public int f19747g;

    /* renamed from: h, reason: collision with root package name */
    public int f19748h;

    /* renamed from: i, reason: collision with root package name */
    public int f19749i;

    /* renamed from: j, reason: collision with root package name */
    public int f19750j;

    /* renamed from: k, reason: collision with root package name */
    public List f19751k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19752l;

    public final void a() {
        b(null);
    }

    public final void b(View view) {
        int m13;
        int size = this.f19751k.size();
        View view2 = null;
        int i13 = Integer.MAX_VALUE;
        for (int i14 = 0; i14 < size; i14++) {
            View view3 = ((y2) this.f19751k.get(i14)).f19717a;
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
            if (view3 != view && !layoutParams.f19268a.z() && (m13 = (layoutParams.f19268a.m() - this.f19744d) * this.f19745e) >= 0 && m13 < i13) {
                view2 = view3;
                if (m13 == 0) {
                    break;
                } else {
                    i13 = m13;
                }
            }
        }
        if (view2 == null) {
            this.f19744d = -1;
        } else {
            this.f19744d = ((RecyclerView.LayoutParams) view2.getLayoutParams()).f19268a.m();
        }
    }

    public final View c() {
        int size = this.f19751k.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view = ((y2) this.f19751k.get(i13)).f19717a;
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (!layoutParams.f19268a.z() && this.f19744d == layoutParams.f19268a.m()) {
                b(view);
                return view;
            }
        }
        return null;
    }
}
