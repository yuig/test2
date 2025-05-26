package androidx.appcompat.widget;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes2.dex */
public final class k2 implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f16623a;

    public k2(SearchView searchView) {
        this.f16623a = searchView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        SearchView searchView = this.f16623a;
        View view2 = searchView.f16433x;
        if (view2.getWidth() > 1) {
            Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.f16427r.getPaddingLeft();
            Rect rect = new Rect();
            boolean z13 = l3.f16639a;
            boolean z14 = searchView.getLayoutDirection() == 1;
            int dimensionPixelSize = searchView.I ? resources.getDimensionPixelSize(i.d.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(i.d.abc_dropdownitem_icon_width) : 0;
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f16425p;
            searchAutoComplete.getDropDownBackground().getPadding(rect);
            searchAutoComplete.setDropDownHorizontalOffset(z14 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
