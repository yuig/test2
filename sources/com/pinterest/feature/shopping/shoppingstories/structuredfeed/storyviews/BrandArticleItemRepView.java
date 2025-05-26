package com.pinterest.feature.shopping.shoppingstories.structuredfeed.storyviews;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.ui.components.users.LegoUserRep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ky.g;
import ky.h;
import nx.v;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/pinterest/feature/shopping/shoppingstories/structuredfeed/storyviews/BrandArticleItemRepView;", "Lcom/pinterest/ui/components/users/LegoUserRep;", "Lnx/v;", "Lh32/r;", "Lky/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "structuredFeedLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BrandArticleItemRepView extends LegoUserRep implements v, h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandArticleItemRepView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    @Override // nx.v
    public final /* bridge */ /* synthetic */ Object markImpressionEnd() {
        return null;
    }

    @Override // nx.v
    public final /* bridge */ /* synthetic */ Object markImpressionStart() {
        return null;
    }

    @Override // ky.h
    public final g z() {
        return g.OTHER;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandArticleItemRepView(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
