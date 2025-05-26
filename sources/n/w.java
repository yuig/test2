package n;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* loaded from: classes2.dex */
public abstract class w implements e0, a0, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Rect f88711a;

    public static int o(l lVar, Context context, int i13) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = lVar.getCount();
        int i14 = 0;
        int i15 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i16 = 0; i16 < count; i16++) {
            int itemViewType = lVar.getItemViewType(i16);
            if (itemViewType != i15) {
                view = null;
                i15 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = lVar.getView(i16, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i13) {
                return i13;
            }
            if (measuredWidth > i14) {
                i14 = measuredWidth;
            }
        }
        return i14;
    }

    public static boolean w(o oVar) {
        int size = oVar.f88653f.size();
        for (int i13 = 0; i13 < size; i13++) {
            MenuItem item = oVar.getItem(i13);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // n.a0
    public final boolean e(q qVar) {
        return false;
    }

    @Override // n.a0
    public final boolean g(q qVar) {
        return false;
    }

    @Override // n.a0
    public final int getId() {
        return 0;
    }

    @Override // n.a0
    public final void i(Context context, o oVar) {
    }

    public abstract void n(o oVar);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i13, long j13) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (l) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (l) listAdapter).f88641a.r((MenuItem) listAdapter.getItem(i13), this, (this instanceof i) ^ true ? 0 : 4);
    }

    public abstract void p(View view);

    public abstract void q(boolean z13);

    public abstract void r(int i13);

    public abstract void s(int i13);

    public abstract void t(PopupWindow.OnDismissListener onDismissListener);

    public abstract void u(boolean z13);

    public abstract void v(int i13);
}
