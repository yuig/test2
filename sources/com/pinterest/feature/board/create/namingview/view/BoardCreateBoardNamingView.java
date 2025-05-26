package com.pinterest.feature.board.create.namingview.view;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import bk0.a;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import dk0.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.u0;
import org.jetbrains.annotations.NotNull;
import x60.c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/board/create/namingview/view/BoardCreateBoardNamingView;", "Landroid/widget/LinearLayout;", "Lbk0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gi2/b", "create_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardCreateBoardNamingView extends LinearLayout implements a {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltTextField f45159a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f45160b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f45161c;

    /* renamed from: d, reason: collision with root package name */
    public final b f45162d;

    /* renamed from: e, reason: collision with root package name */
    public final AnimatorSet f45163e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoardCreateBoardNamingView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(bk0.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        b bVar = this.f45162d;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        bVar.f55159f = listener;
    }

    public final void b(List boardNames) {
        Intrinsics.checkNotNullParameter(boardNames, "boardNames");
        if (boardNames.isEmpty()) {
            return;
        }
        b bVar = this.f45162d;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(boardNames, "boardNames");
        bVar.f55158e = boardNames;
        bVar.h();
        pp2.a.k(this.f45160b, ck0.b.f27905i);
        s5.a aVar = new s5.a(0.9f, 0.4f);
        AnimatorSet animatorSet = this.f45163e;
        animatorSet.setInterpolator(aVar);
        animatorSet.setStartDelay(getResources().getInteger(u0.anim_speed_superfast));
        animatorSet.addListener(new d(this, 14));
        animatorSet.setTarget(this.f45161c);
        animatorSet.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AnimatorSet animatorSet = this.f45163e;
        animatorSet.removeAllListeners();
        animatorSet.cancel();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardCreateBoardNamingView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, x60.d.view_board_naming, this);
        View findViewById = findViewById(c.board_name_et);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45159a = (GestaltTextField) findViewById;
        View findViewById2 = findViewById(c.suggested_board_names_desc);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45160b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(c.suggested_board_names_list);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) findViewById3;
        this.f45161c = recyclerView;
        Animator loadAnimator = AnimatorInflater.loadAnimator(context, x60.a.animator_slide_and_fade_in);
        Intrinsics.g(loadAnimator, "null cannot be cast to non-null type android.animation.AnimatorSet");
        this.f45163e = (AnimatorSet) loadAnimator;
        b bVar = new b(0);
        this.f45162d = bVar;
        recyclerView.H2(bVar);
    }
}
