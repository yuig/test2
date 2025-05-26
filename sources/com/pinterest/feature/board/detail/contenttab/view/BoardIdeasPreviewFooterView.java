package com.pinterest.feature.board.detail.contenttab.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ar0.b;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import d70.d;
import d70.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import yk1.n;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\fB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/board/detail/contenttab/view/BoardIdeasPreviewFooterView;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Lar0/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gi2/b", "boardLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardIdeasPreviewFooterView extends LinearLayout implements n, b {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f45196a;

    /* renamed from: b, reason: collision with root package name */
    public final List f45197b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoardIdeasPreviewFooterView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ar0.b
    public final boolean b() {
        return false;
    }

    public /* synthetic */ BoardIdeasPreviewFooterView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BoardIdeasPreviewFooterView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int K = a0.K(16, resources);
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        setPaddingRelative(0, K, 0, a0.K(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL, resources2));
        View inflate = LayoutInflater.from(context).inflate(e.board_ideas_preview_footer_view, (ViewGroup) this, true);
        View findViewById = inflate.findViewById(d.preview_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45196a = (GestaltText) findViewById;
        this.f45197b = f0.j(inflate.findViewById(d.image_preview_1), inflate.findViewById(d.image_preview_2), inflate.findViewById(d.image_preview_3), inflate.findViewById(d.image_preview_4));
    }
}
