package com.pinterest.feature.style.spotlight.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import h32.g0;
import h32.n2;
import i82.c;
import i82.e;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.u0;
import nx.v;
import org.jetbrains.annotations.NotNull;
import so.wd;
import ug1.b;
import wg1.d;
import yn2.c0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/style/spotlight/view/SearchTypeaheadTodayArticleCellContainer;", "Landroid/widget/HorizontalScrollView;", "Lso/wd;", "Lnx/v;", "Lnx/u0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "spotlightLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SearchTypeaheadTodayArticleCellContainer extends HorizontalScrollView implements wd, v {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f48584a;

    /* renamed from: b, reason: collision with root package name */
    public b f48585b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadTodayArticleCellContainer(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        return c0.t(c0.j(d7.b.O(this.f48584a), d.f129735j));
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        n2 n2Var;
        String uid;
        kj kjVar;
        String q13;
        b bVar = this.f48585b;
        if (bVar == null) {
            return null;
        }
        n2 source = bVar.f122152d;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            n2Var = new n2(source.f67157a, source.f67158b, source.f67159c, source.f67160d, jq.b.c(TimeUnit.MILLISECONDS), source.f67162f, source.f67163g, source.f67164h, source.f67165i, source.f67166j);
        } else {
            n2Var = null;
        }
        bVar.f122152d = null;
        if (n2Var == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        vh vhVar = bVar.f122151c;
        if (vhVar != null && (q13 = vhVar.q()) != null) {
        }
        vh vhVar2 = bVar.f122151c;
        if (vhVar2 != null && (kjVar = vhVar2.f42855m) != null) {
        }
        vh vhVar3 = bVar.f122151c;
        if (vhVar3 != null && (uid = vhVar3.getUid()) != null) {
        }
        hashMap.put("result_index", String.valueOf(bVar.f122153e));
        return new u0(n2Var, hashMap, g0.DYNAMIC_GRID_STORY);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        kj kjVar;
        b bVar = this.f48585b;
        if (bVar == null) {
            return null;
        }
        if (bVar.f122152d == null) {
            vh vhVar = bVar.f122151c;
            bVar.f122152d = new n2((vhVar == null || (kjVar = vhVar.f42855m) == null) ? null : kjVar.b(), null, null, jq.b.c(TimeUnit.MILLISECONDS), null, null, Short.valueOf((short) bVar.f122153e), null, null, null);
        }
        n2 n2Var = bVar.f122152d;
        if (n2Var != null) {
            return new u0(n2Var, null, null);
        }
        return null;
    }

    public /* synthetic */ SearchTypeaheadTodayArticleCellContainer(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadTodayArticleCellContainer(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, e.search_typeahead_today_article_cell_container, this);
        View findViewById = findViewById(c.today_article_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48584a = (LinearLayout) findViewById;
    }
}
