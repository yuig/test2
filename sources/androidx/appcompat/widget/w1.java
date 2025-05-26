package androidx.appcompat.widget;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: classes2.dex */
public final class w1 extends j1 {

    /* renamed from: m, reason: collision with root package name */
    public final int f16703m;

    /* renamed from: n, reason: collision with root package name */
    public final int f16704n;

    /* renamed from: o, reason: collision with root package name */
    public t1 f16705o;

    /* renamed from: p, reason: collision with root package name */
    public n.q f16706p;

    public w1(Context context, boolean z13) {
        super(context, z13);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f16703m = 21;
            this.f16704n = 22;
        } else {
            this.f16703m = 22;
            this.f16704n = 21;
        }
    }

    @Override // androidx.appcompat.widget.j1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        n.l lVar;
        int i13;
        int pointToPosition;
        int i14;
        if (this.f16705o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i13 = headerViewListAdapter.getHeadersCount();
                lVar = (n.l) headerViewListAdapter.getWrappedAdapter();
            } else {
                lVar = (n.l) adapter;
                i13 = 0;
            }
            n.q item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i14 = pointToPosition - i13) < 0 || i14 >= lVar.getCount()) ? null : lVar.getItem(i14);
            n.q qVar = this.f16706p;
            if (qVar != item) {
                n.o oVar = lVar.f88641a;
                if (qVar != null) {
                    this.f16705o.v(oVar, qVar);
                }
                this.f16706p = item;
                if (item != null) {
                    this.f16705o.E(oVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i13, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i13 == this.f16703m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.f16177a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i13 != this.f16704n) {
            return super.onKeyDown(i13, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (n.l) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (n.l) adapter).f88641a.d(false);
        return true;
    }
}
