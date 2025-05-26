package com.pinterest.feature.board.create.namingview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import en1.c0;
import eo1.b;
import jh0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u50.g;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/board/create/namingview/view/BoardCreateBoardNameSuggestionCell;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "create_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardCreateBoardNameSuggestionCell extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final v f45157a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f45158b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoardCreateBoardNameSuggestionCell(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BoardCreateBoardNameSuggestionCell(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardCreateBoardNameSuggestionCell(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45157a = m.b(new d(this, 10));
        this.f45158b = new c0(new g(b.color_background_secondary_base), new g(b.color_text_default));
        View.inflate(context, x60.d.board_name_suggestion_cell_view, this);
    }
}
