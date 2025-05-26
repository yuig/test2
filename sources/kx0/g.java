package kx0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl;
import com.pinterest.activity.newshub.view.content.NewsHubLibrofileView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f81065i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar) {
        super(0);
        this.f81065i = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        o oVar = this.f81065i;
        Context requireContext = oVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        NewsHubLibrofileView newsHubLibrofileView = new NewsHubLibrofileView(6, requireContext, (AttributeSet) null);
        oVar.j9();
        PinterestStaggeredGridLayoutManagerImpl.LayoutParams layoutParams = new PinterestStaggeredGridLayoutManagerImpl.LayoutParams(-1, newsHubLibrofileView.getResources().getDimensionPixelSize(zu1.a.news_hub_librofile_view_height));
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = newsHubLibrofileView.getResources().getDimensionPixelSize(eo1.c.margin);
        newsHubLibrofileView.setLayoutParams(layoutParams);
        return newsHubLibrofileView;
    }
}
