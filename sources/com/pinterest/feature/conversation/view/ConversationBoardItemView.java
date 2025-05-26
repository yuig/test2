package com.pinterest.feature.conversation.view;

import af2.b;
import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.feature.board.grid.view.BoardGridCellLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lq0.g;
import org.jetbrains.annotations.NotNull;
import so.jb;
import ye2.o;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/feature/conversation/view/ConversationBoardItemView;", "Lcom/pinterest/feature/board/grid/view/BoardGridCellLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ConversationBoardItemView extends BoardGridCellLayout implements c {

    /* renamed from: i, reason: collision with root package name */
    public o f45526i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f45527j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationBoardItemView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f45527j) {
            return;
        }
        this.f45527j = true;
        jb jbVar = (jb) ((g) generatedComponent());
        jbVar.f113485c.e5();
    }

    @Override // af2.c
    public final b componentManager() {
        if (this.f45526i == null) {
            this.f45526i = new o(this);
        }
        return this.f45526i;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f45526i == null) {
            this.f45526i = new o(this);
        }
        return this.f45526i.generatedComponent();
    }
}
