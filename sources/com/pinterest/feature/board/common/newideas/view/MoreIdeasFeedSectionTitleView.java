package com.pinterest.feature.board.common.newideas.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import f70.a;
import f70.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yk1.n;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/board/common/newideas/view/MoreIdeasFeedSectionTitleView;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "boardMoreIdeasLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MoreIdeasFeedSectionTitleView extends LinearLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f45137a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MoreIdeasFeedSectionTitleView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MoreIdeasFeedSectionTitleView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreIdeasFeedSectionTitleView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(b.feed_section_title_view, (ViewGroup) this, true);
        View findViewById = findViewById(a.feed_section_title_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45137a = (GestaltText) findViewById;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }
}
