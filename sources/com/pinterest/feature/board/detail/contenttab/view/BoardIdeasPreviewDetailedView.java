package com.pinterest.feature.board.detail.contenttab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ar0.b;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import d70.d;
import d70.e;
import eo1.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yk1.n;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/board/detail/contenttab/view/BoardIdeasPreviewDetailedView;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Lar0/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "boardLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardIdeasPreviewDetailedView extends LinearLayout implements n, b {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f45192a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f45193b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltButton f45194c;

    /* renamed from: d, reason: collision with root package name */
    public final List f45195d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoardIdeasPreviewDetailedView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ar0.b
    public final boolean b() {
        return false;
    }

    public /* synthetic */ BoardIdeasPreviewDetailedView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BoardIdeasPreviewDetailedView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View inflate = LayoutInflater.from(context).inflate(e.board_ideas_preview_detailed_view_lego, (ViewGroup) this, true);
        View findViewById = inflate.findViewById(d.preview_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45193b = (GestaltText) findViewById;
        setOrientation(1);
        List j13 = f0.j(inflate.findViewById(d.image_preview_1), inflate.findViewById(d.image_preview_2), inflate.findViewById(d.image_preview_3), inflate.findViewById(d.image_preview_4));
        this.f45195d = j13;
        View findViewById2 = inflate.findViewById(d.see_more_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45194c = (GestaltButton) findViewById2;
        View findViewById3 = inflate.findViewById(d.container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45192a = (LinearLayout) findViewById3;
        RoundedCornersLayout roundedCornersLayout = (RoundedCornersLayout) inflate.findViewById(d.rounded_corners_layout);
        int dimensionPixelSize = roundedCornersLayout.getResources().getDimensionPixelSize(c.lego_corner_radius_medium);
        roundedCornersLayout.g(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        int size = j13.size();
        for (int i14 = 0; i14 < size; i14++) {
            ((WebImageView) this.f45195d.get(i14)).g2(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }
}
