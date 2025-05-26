package com.pinterest.feature.conversation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lq0.y;
import org.jetbrains.annotations.NotNull;
import xc0.f;
import xk2.m;
import xk2.v;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/conversation/view/ConversationMessageReactionDisplayReactionItem;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ConversationMessageReactionDisplayReactionItem extends LinearLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    public final v f45603a;

    /* renamed from: b, reason: collision with root package name */
    public final v f45604b;

    /* renamed from: c, reason: collision with root package name */
    public final v f45605c;

    /* renamed from: d, reason: collision with root package name */
    public final v f45606d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationMessageReactionDisplayReactionItem(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45603a = m.b(new y(this, 1));
        this.f45604b = m.b(new y(this, 3));
        this.f45605c = m.b(new y(this, 2));
        this.f45606d = m.b(new y(this, 0));
        LayoutInflater.from(getContext()).inflate(f.conversation_message_reaction_display_reactions_item, (ViewGroup) this, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationMessageReactionDisplayReactionItem(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f45603a = m.b(new y(this, 1));
        this.f45604b = m.b(new y(this, 3));
        this.f45605c = m.b(new y(this, 2));
        this.f45606d = m.b(new y(this, 0));
        LayoutInflater.from(getContext()).inflate(f.conversation_message_reaction_display_reactions_item, (ViewGroup) this, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationMessageReactionDisplayReactionItem(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f45603a = m.b(new y(this, 1));
        this.f45604b = m.b(new y(this, 3));
        this.f45605c = m.b(new y(this, 2));
        this.f45606d = m.b(new y(this, 0));
        LayoutInflater.from(getContext()).inflate(f.conversation_message_reaction_display_reactions_item, (ViewGroup) this, true);
    }
}
