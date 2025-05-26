package com.pinterest.feature.search.results.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.gridlayout.widget.GridLayout;
import com.pinterest.feature.core.view.EmptyView;
import com.pinterest.feature.mediagallery.view.MediaDirectoryView;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadAutoCompleteUpsellCell;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadBoardCell;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadFilterCell;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadHeader;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadHeaderCell;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadNuxTopicsContainer;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadPeopleCell;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadPinCarousel;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadRecentSearchesCarouselView;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadTextCell;
import com.pinterest.feature.search.typeahead.view.SearchYourPinsHeaderView;
import com.pinterest.feature.settings.shared.view.SettingsHeaderView;
import com.pinterest.feature.style.spotlight.view.SearchTypeaheadTodayArticleCellContainer;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import q71.x0;

/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f47765i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f47766j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Context context, int i13) {
        super(0);
        this.f47765i = i13;
        this.f47766j = context;
    }

    public final SearchTypeaheadHeader b() {
        int i13 = this.f47765i;
        Context context = this.f47766j;
        switch (i13) {
            case 3:
                return new SearchTypeaheadHeader(context, n42.e.trending, false, 12);
            case 16:
                return new SearchTypeaheadHeader(context, n42.e.recent_searches, false, 12);
            case 20:
                return new SearchTypeaheadHeader(context, k42.f.your_pins, true, 4);
            default:
                return new SearchTypeaheadHeader(context, n42.e.recent_saves, false, 12);
        }
    }

    public final SearchTypeaheadTextCell e() {
        int i13 = this.f47765i;
        Context context = this.f47766j;
        switch (i13) {
            case 1:
                break;
            case 4:
                break;
            case 6:
                break;
        }
        return new SearchTypeaheadTextCell(context);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = 6;
        int i14 = this.f47765i;
        AttributeSet attributeSet = null;
        Context context = this.f47766j;
        switch (i14) {
            case 0:
                return new xi0.i(context);
            case 1:
                return e();
            case 2:
                switch (i14) {
                    case 2:
                        return new SearchTypeaheadAutoCompleteUpsellCell(i13, context, attributeSet);
                    default:
                        return new SearchTypeaheadAutoCompleteUpsellCell(i13, context, attributeSet);
                }
            case 3:
                return b();
            case 4:
                return e();
            case 5:
                return new SearchTypeaheadBoardCell(i13, context, attributeSet);
            case 6:
                return e();
            case 7:
                switch (i14) {
                    case 2:
                        return new SearchTypeaheadAutoCompleteUpsellCell(i13, context, attributeSet);
                    default:
                        return new SearchTypeaheadAutoCompleteUpsellCell(i13, context, attributeSet);
                }
            case 8:
                return new SearchTypeaheadNuxTopicsContainer(6, context, (AttributeSet) null);
            case 9:
                return new SearchTypeaheadTodayArticleCellContainer(i13, context, attributeSet);
            case 10:
                return new x0(context);
            case 11:
                return new SearchTypeaheadHeaderCell(i13, context, attributeSet);
            case 12:
                xo0.g gVar = new xo0.g(context);
                o6.b alignment = GridLayout.f18528v;
                Intrinsics.checkNotNullExpressionValue(alignment, "LEFT");
                Intrinsics.checkNotNullParameter(alignment, "alignment");
                gVar.A = alignment;
                return gVar;
            case 13:
                return new SearchTypeaheadFilterCell(6, context, (AttributeSet) null);
            case 14:
                return new SearchTypeaheadPeopleCell(this.f47766j, null, 0, null, 14);
            case 15:
                return new SearchYourPinsHeaderView(6, context, (AttributeSet) null);
            case 16:
                return b();
            case 17:
                return e();
            case 18:
                Intrinsics.checkNotNullParameter(context, "context");
                return new SearchTypeaheadPinCarousel(context, null);
            case 19:
                Intrinsics.checkNotNullParameter(context, "context");
                return new SearchTypeaheadRecentSearchesCarouselView(context, null);
            case 20:
                return b();
            case 21:
                return new q71.i0(context);
            case 22:
                return b();
            case 23:
                return new u81.t(context);
            case 24:
                return new MediaDirectoryView(6, context, (AttributeSet) null);
            case 25:
                return new EmptyView(context);
            case 26:
                Intrinsics.checkNotNullParameter(context, "context");
                lc1.n nVar = new lc1.n(context);
                nVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
                int W = bs1.c.W(gestaltText, eo1.c.space_500);
                int W2 = bs1.c.W(gestaltText, eo1.c.space_400);
                gestaltText.i(lc1.g.f82872r);
                gestaltText.setPaddingRelative(W, 0, W, W2);
                nVar.addView(gestaltText);
                return nVar;
            case 27:
                return new SettingsHeaderView(context);
            case 28:
                lc1.k kVar = new lc1.k(context);
                int W3 = bs1.c.W(kVar, eo1.c.space_400);
                kVar.setPaddingRelative(W3, kVar.getPaddingTop(), W3, W3);
                return kVar;
            default:
                return bs1.c.c0(context, dl2.b.a1(context, eo1.a.comp_checkbox_disabled_selected_icon));
        }
    }
}
