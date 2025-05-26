package com.pinterest.feature.conversation.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.PinterestGridLayoutManager;
import androidx.recyclerview.widget.b1;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import cp.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lq0.j1;
import org.jetbrains.annotations.NotNull;
import tq.a;
import xc0.e;
import xc0.f;
import xk2.m;
import xk2.v;
import yq0.z;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\fB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/conversation/view/GifReactionTrayView;", "Lcom/pinterest/ui/view/BaseRecyclerContainerView;", "Lyq0/a0;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lp2/b", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GifReactionTrayView extends a {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f45624e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final v f45625d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GifReactionTrayView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final b1 createLayoutManagerContract(int i13, boolean z13) {
        b bVar = new b(this, 13);
        getContext();
        PinterestGridLayoutManager layoutManager = new PinterestGridLayoutManager(bVar, 3);
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        return new b1(layoutManager);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final String getDebugTag() {
        return (String) this.f45625d.getValue();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getLayoutResourceId() {
        return f.view_gif_reaction_tray;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getPinterestRecyclerViewId() {
        return e.gif_reaction_tray;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void registerViewHolderCreators(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(RecyclerViewTypes.VIEW_TYPE_CONVERSATION_GIF_REACTION, new zp0.a(this, 4));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GifReactionTrayView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 4);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45625d = m.b(j1.f84341j);
    }
}
