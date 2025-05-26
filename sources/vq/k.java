package vq;

import android.widget.BaseAdapter;
import java.util.List;

/* loaded from: classes3.dex */
public final class k extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public List f126432a;

    /* renamed from: b, reason: collision with root package name */
    public List f126433b;

    /* renamed from: c, reason: collision with root package name */
    public int f126434c;

    @Override // android.widget.Adapter
    public final int getCount() {
        List list = this.f126432a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i13) {
        return this.f126432a.get(i13);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i13) {
        return i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0045  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r4, android.view.View r5, android.view.ViewGroup r6) {
        /*
            r3 = this;
            if (r5 == 0) goto Lc
            int r0 = com.pinterest.ui.listview.ListCellBasic.f52579g
            boolean r0 = r5 instanceof com.pinterest.ui.listview.ListCellBasic
            if (r0 != 0) goto L9
            goto Lc
        L9:
            com.pinterest.ui.listview.ListCellBasic r5 = (com.pinterest.ui.listview.ListCellBasic) r5
            goto L16
        Lc:
            com.pinterest.ui.listview.ListCellBasic r5 = new com.pinterest.ui.listview.ListCellBasic
            android.content.Context r6 = r6.getContext()
            r0 = 0
            r5.<init>(r6, r0)
        L16:
            java.util.List r6 = r3.f126432a
            java.lang.Object r6 = r6.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            com.pinterest.gestalt.text.GestaltText r0 = r5.f52583d
            lp.l r1 = new lp.l
            r2 = 9
            r1.<init>(r6, r2)
            r0.i(r1)
            r6 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.pinterest.gestalt.text.GestaltText r0 = r5.f52583d
            cp.i r1 = new cp.i
            r2 = 14
            r1.<init>(r6, r2)
            r0.i(r1)
            java.util.List r6 = r3.f126432a
            int r6 = r6.size()
            int r6 = r6 + (-1)
            if (r4 != r6) goto L48
            fm1.c r4 = fm1.c.INVISIBLE
            goto L4a
        L48:
            fm1.c r4 = fm1.c.VISIBLE
        L4a:
            com.pinterest.gestalt.divider.GestaltDivider r6 = r5.f52584e
            cp.i r0 = new cp.i
            r1 = 13
            r0.<init>(r4, r1)
            r6.a(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vq.k.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
