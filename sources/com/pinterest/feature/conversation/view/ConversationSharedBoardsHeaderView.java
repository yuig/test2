package com.pinterest.feature.conversation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.pinterest.ui.grid.PinterestRecyclerView;
import g70.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vs.b;
import xc0.e;
import xc0.f;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/feature/conversation/view/ConversationSharedBoardsHeaderView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ConversationSharedBoardsHeaderView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final PinterestRecyclerView f45620a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationSharedBoardsHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(f.conversation_shared_boards_header_view, (ViewGroup) this, true);
        View findViewById = findViewById(e.conversation_shared_boards_header_recycler);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45620a = (PinterestRecyclerView) findViewById;
    }

    public final void a(List boards, h boardNavigator) {
        Intrinsics.checkNotNullParameter(boards, "boards");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        b bVar = new b(boards, boardNavigator);
        PinterestRecyclerView pinterestRecyclerView = this.f45620a;
        pinterestRecyclerView.j(bVar);
        getContext();
        pinterestRecyclerView.l(new LinearLayoutManager(0, false));
    }
}
