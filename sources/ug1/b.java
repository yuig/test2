package ug1;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.zv0;
import com.pinterest.feature.style.spotlight.view.SearchTypeaheadTodayArticleCell;
import com.pinterest.feature.style.spotlight.view.SearchTypeaheadTodayArticleCellContainer;
import h32.n2;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import m60.w;
import qf1.z;
import so.wd;
import uj2.q;
import yk1.r;

/* loaded from: classes5.dex */
public final class b extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final nu1.a f122149a;

    /* renamed from: b, reason: collision with root package name */
    public final w f122150b;

    /* renamed from: c, reason: collision with root package name */
    public vh f122151c;

    /* renamed from: d, reason: collision with root package name */
    public n2 f122152d;

    /* renamed from: e, reason: collision with root package name */
    public int f122153e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(uk1.d presenterPinalytics, q networkStateStream, nu1.a inAppNavigator, w eventManager) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(inAppNavigator, "inAppNavigator");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f122149a = inAppNavigator;
        this.f122150b = eventManager;
        this.f122153e = -1;
    }

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(wd view) {
        String url;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        if (isBound()) {
            vh vhVar = this.f122151c;
            AttributeSet attributeSet = null;
            String q13 = vhVar != null ? vhVar.q() : null;
            SearchTypeaheadTodayArticleCellContainer searchTypeaheadTodayArticleCellContainer = (SearchTypeaheadTodayArticleCellContainer) view;
            int dimensionPixelSize = Intrinsics.d(q13, "slp_immersive_header") ? searchTypeaheadTodayArticleCellContainer.getResources().getDimensionPixelSize(eo1.c.space_400) + searchTypeaheadTodayArticleCellContainer.getResources().getDimensionPixelSize(ga2.b.lego_search_bar_height) : Intrinsics.d(q13, "autocomplete_curated_articles") ? searchTypeaheadTodayArticleCellContainer.getResources().getDimensionPixelSize(eo1.c.space_200) : 0;
            int dimensionPixelSize2 = searchTypeaheadTodayArticleCellContainer.getResources().getDimensionPixelSize(eo1.c.space_100);
            LinearLayout linearLayout = searchTypeaheadTodayArticleCellContainer.f48584a;
            linearLayout.setPaddingRelative(dimensionPixelSize2, dimensionPixelSize, 0, 0);
            Intrinsics.checkNotNullParameter(this, "listener");
            searchTypeaheadTodayArticleCellContainer.f48585b = this;
            linearLayout.removeAllViews();
            vh vhVar2 = this.f122151c;
            if (vhVar2 != null) {
                int min = Math.min(5, vhVar2.f42865w.size() - 1);
                for (int i13 = 1; i13 <= min; i13++) {
                    Object obj = vhVar2.f42865w.get(i13);
                    Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.api.model.TodayArticle");
                    zv0 zv0Var = (zv0) obj;
                    j0 j0Var = new j0();
                    SearchTypeaheadTodayArticleCellContainer searchTypeaheadTodayArticleCellContainer2 = (SearchTypeaheadTodayArticleCellContainer) ((wd) getView());
                    Context context = searchTypeaheadTodayArticleCellContainer2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    int i14 = 6;
                    SearchTypeaheadTodayArticleCell searchTypeaheadTodayArticleCell = new SearchTypeaheadTodayArticleCell(i14, context, attributeSet);
                    searchTypeaheadTodayArticleCellContainer2.f48584a.addView(searchTypeaheadTodayArticleCell);
                    List N = zv0Var.N();
                    if (N != null && (url = (String) CollectionsKt.firstOrNull(N)) != null) {
                        Intrinsics.checkNotNullParameter(url, "url");
                        searchTypeaheadTodayArticleCell.f48583d.V1(url, (r18 & 2) != 0, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : bs1.c.W(searchTypeaheadTodayArticleCell, i82.b.today_article_width), (r18 & 16) != 0 ? 0 : bs1.c.W(searchTypeaheadTodayArticleCell, i82.b.today_article_height), (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
                    }
                    String text = zv0Var.V();
                    if (text != null) {
                        Intrinsics.checkNotNullParameter(text, "text");
                        searchTypeaheadTodayArticleCell.f48582c.i(new z(text, 7));
                    }
                    String text2 = zv0Var.U();
                    if (text2 != null) {
                        Intrinsics.checkNotNullParameter(text2, "text");
                        searchTypeaheadTodayArticleCell.f48581b.i(new z(text2, i14));
                    }
                    a listener = new a(this, zv0Var, i13, j0Var);
                    Intrinsics.checkNotNullParameter(listener, "listener");
                    searchTypeaheadTodayArticleCell.f48580a = listener;
                }
            }
        }
    }
}
