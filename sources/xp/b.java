package xp;

import a.c;
import android.view.View;
import android.widget.AdapterView;
import m60.u;

/* loaded from: classes3.dex */
public final class b extends os.a implements AdapterView.OnItemClickListener {
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = 0
            if (r7 == 0) goto Ld
            int r1 = com.pinterest.activity.library.view.LibraryBoardSortOptionCell.f34952c
            boolean r1 = r7 instanceof com.pinterest.activity.library.view.LibraryBoardSortOptionCell
            if (r1 != 0) goto La
            goto Ld
        La:
            com.pinterest.activity.library.view.LibraryBoardSortOptionCell r7 = (com.pinterest.activity.library.view.LibraryBoardSortOptionCell) r7
            goto L16
        Ld:
            com.pinterest.activity.library.view.LibraryBoardSortOptionCell r7 = new com.pinterest.activity.library.view.LibraryBoardSortOptionCell
            android.content.Context r8 = r8.getContext()
            r7.<init>(r8, r0)
        L16:
            java.util.List r8 = r5.f97477a
            java.lang.Object r6 = r8.get(r6)
            xp.a r6 = (xp.a) r6
            if (r6 == 0) goto L77
            bq.b r8 = r6.f135636a
            int r1 = r8.getTitleId()
            com.pinterest.gestalt.text.GestaltText r2 = r7.f34954a
            cq.a r3 = new cq.a
            boolean r6 = r6.f135637b
            r3.<init>()
            r2.i(r3)
            int r8 = r8.getIconId()
            com.pinterest.ui.imageview.GrayWebImageView r1 = r7.f34955b
            android.content.Context r2 = r7.getContext()
            if (r6 == 0) goto L41
            int r6 = com.pinterest.activity.library.view.LibraryBoardSortOptionCell.f34952c
            goto L43
        L41:
            int r6 = com.pinterest.activity.library.view.LibraryBoardSortOptionCell.f34953d
        L43:
            java.lang.String r3 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.lang.Object r4 = d5.a.f53679a
            android.graphics.drawable.Drawable r8 = r2.getDrawable(r8)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            if (r8 == 0) goto L74
            if (r6 != 0) goto L5c
            int r6 = df0.a.f54892a
            int r6 = r2.getColor(r6)
            goto L60
        L5c:
            int r6 = r2.getColor(r6)
        L60:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            if (r6 != 0) goto L6d
            int r6 = df0.a.f54892a
            java.lang.Object r0 = d5.a.f53679a
            int r6 = r2.getColor(r6)
        L6d:
            android.graphics.drawable.Drawable r0 = r8.mutate()
            r0.setTint(r6)
        L74:
            r1.setImageDrawable(r0)
        L77:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xp.b.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i13, long j13) {
        c.y(u.f85943a);
        a aVar = (a) this.f97477a.get(i13);
        if (aVar == null || aVar.f135637b) {
            return;
        }
        bq.b bVar = bq.c.f23676d;
        bq.a.f23675a.c(aVar.f135636a);
    }
}
