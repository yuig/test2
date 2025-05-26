package com.pinterest.feature.style.spotlight.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.zv0;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import ep.b;
import h32.g0;
import h32.v2;
import i82.c;
import i82.e;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import nx.v;
import nx.y0;
import org.jetbrains.annotations.NotNull;
import ug1.a;
import we1.a2;
import yk1.d;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/style/spotlight/view/SearchTypeaheadTodayArticleCell;", "Landroid/widget/FrameLayout;", "", "Lnx/v;", "Lnx/y0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "spotlightLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SearchTypeaheadTodayArticleCell extends FrameLayout implements d, v {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f48579e = 0;

    /* renamed from: a, reason: collision with root package name */
    public a f48580a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f48581b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f48582c;

    /* renamed from: d, reason: collision with root package name */
    public final WebImageView f48583d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadTodayArticleCell(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        String q13;
        a aVar = this.f48580a;
        if (aVar == null) {
            return null;
        }
        j0 j0Var = aVar.f122148d;
        v2 source = (v2) j0Var.f80434a;
        zv0 zv0Var = aVar.f122146b;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            zv0Var.getClass();
            System.currentTimeMillis();
        }
        v2 v2Var = (v2) j0Var.f80434a;
        if (v2Var == null) {
            return null;
        }
        g0 g0Var = g0.DYNAMIC_GRID_STORY;
        HashMap hashMap = new HashMap();
        String uid = zv0Var.getUid();
        if (uid != null) {
        }
        hashMap.put("grid_index", String.valueOf(aVar.f122147c));
        vh vhVar = aVar.f122145a.f122151c;
        if (vhVar != null && (q13 = vhVar.q()) != null) {
            hashMap.put("story_type", q13);
        }
        return new y0(v2Var, hashMap, null, g0Var, 4);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        a aVar = this.f48580a;
        if (aVar == null) {
            return null;
        }
        j0 j0Var = aVar.f122148d;
        v2 v2Var = (v2) j0Var.f80434a;
        if (v2Var != null) {
            return new y0(v2Var, null, null, g0.DYNAMIC_GRID_STORY, 6);
        }
        v2 v2Var2 = new v2(null, b.f(1000000L), null, null, Short.valueOf((short) aVar.f122147c), null, null, null, null, null);
        j0Var.f80434a = v2Var2;
        return new y0(v2Var2, null, null, g0.DYNAMIC_GRID_STORY, 6);
    }

    public /* synthetic */ SearchTypeaheadTodayArticleCell(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadTodayArticleCell(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        setOnClickListener(new a2(this, 7));
        View.inflate(context, e.search_typehead_today_article_cell_view, this);
        View findViewById = findViewById(c.text_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = findViewById(c.subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48581b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(c.title);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48582c = (GestaltText) findViewById3;
        View findViewById4 = findViewById(c.today_article_image);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        WebImageView webImageView = (WebImageView) findViewById4;
        this.f48583d = webImageView;
        float dimensionPixelOffset = webImageView.getResources().getDimensionPixelOffset(eo1.c.lego_corner_radius_medium);
        webImageView.g2(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        webImageView.setColorFilter(dl2.b.y0(webImageView, eo1.a.color_background_dark_opacity_300));
    }
}
