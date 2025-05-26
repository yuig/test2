package androidx.appcompat.widget;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;
import com.pinterest.ui.grid.PinterestAdapterView;
import com.pinterest.ui.grid.PinterestGridView;
import java.util.LinkedList;

/* loaded from: classes2.dex */
public final class q1 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16671a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16672b;

    public /* synthetic */ q1(Object obj, int i13) {
        this.f16671a = i13;
        this.f16672b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        Object obj;
        boolean isEmpty;
        switch (this.f16671a) {
            case 0:
                ListPopupWindow listPopupWindow = (ListPopupWindow) this.f16672b;
                if (listPopupWindow.f16397z.isShowing()) {
                    listPopupWindow.k();
                    return;
                }
                return;
            case 1:
                ((TabLayout) this.f16672b).q();
                return;
            case 2:
                synchronized (((PinterestAdapterView) this.f16672b)) {
                    obj = this.f16672b;
                    ((PinterestAdapterView) obj).f52505h = true;
                }
                ((PinterestAdapterView) obj).requestLayout();
                return;
            default:
                PinterestGridView pinterestGridView = (PinterestGridView) this.f16672b;
                os.l lVar = pinterestGridView.T;
                if (lVar == null || pinterestGridView.f52525a0 == (isEmpty = lVar.isEmpty())) {
                    return;
                }
                pinterestGridView.t1();
                pinterestGridView.f52525a0 = isEmpty;
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i13 = this.f16671a;
        Object obj = this.f16672b;
        switch (i13) {
            case 0:
                ((ListPopupWindow) obj).dismiss();
                break;
            case 1:
                ((TabLayout) obj).q();
                break;
            case 2:
                PinterestAdapterView pinterestAdapterView = (PinterestAdapterView) obj;
                pinterestAdapterView.j();
                os.l lVar = pinterestAdapterView.f52504g;
                if (lVar != null) {
                    int viewTypeCount = lVar.getViewTypeCount();
                    com.pinterest.ui.grid.a aVar = pinterestAdapterView.f52516s;
                    aVar.getClass();
                    aVar.f52546a = new LinkedList[viewTypeCount];
                    for (int i14 = 0; i14 < viewTypeCount; i14++) {
                        aVar.f52546a[i14] = new LinkedList();
                    }
                }
                pinterestAdapterView.requestLayout();
                break;
            default:
                super.onInvalidated();
                break;
        }
    }
}
