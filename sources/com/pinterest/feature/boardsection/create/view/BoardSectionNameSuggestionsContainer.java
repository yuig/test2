package com.pinterest.feature.boardsection.create.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RowsWithVariableColumnsLayoutManager;
import dk0.b;
import eb2.k;
import java.util.List;
import k70.a;
import kl0.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ln0.c;
import ln0.d;
import org.jetbrains.annotations.NotNull;
import rn0.f;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/boardsection/create/view/BoardSectionNameSuggestionsContainer;", "Landroid/widget/FrameLayout;", "Lln0/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dk0/b", "boardSection_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardSectionNameSuggestionsContainer extends FrameLayout implements d {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f45374d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final v f45375a;

    /* renamed from: b, reason: collision with root package name */
    public final b f45376b;

    /* renamed from: c, reason: collision with root package name */
    public c f45377c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoardSectionNameSuggestionsContainer(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(List value) {
        Intrinsics.checkNotNullParameter(value, "boardSectionNameSuggestions");
        if (!(!value.isEmpty())) {
            bs1.c.X0(this);
            return;
        }
        bs1.c.U1(this);
        b bVar = this.f45376b;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        bVar.f55158e = value;
        bVar.h();
    }

    public final void b(c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f45377c = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardSectionNameSuggestionsContainer(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45375a = m.b(f.f108848i);
        b bVar = new b(new t(this, 20));
        this.f45376b = bVar;
        View.inflate(context, k70.c.board_section_name_suggestions_container, this);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(a.board_section_inter_item_margin);
        View findViewById = findViewById(k70.b.board_section_name_suggestions_recycler_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        recyclerView.H2(bVar);
        recyclerView.R2(new RowsWithVariableColumnsLayoutManager(new cp.b(this, 10)));
        recyclerView.m(new k(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
    }
}
