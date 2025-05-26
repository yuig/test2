package com.pinterest.feature.conversation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lq0.w;
import org.jetbrains.annotations.NotNull;
import xc0.f;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/feature/conversation/view/ConversationMessageReactionCountItemDisplay;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ConversationMessageReactionCountItemDisplay extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final v f45595a;

    /* renamed from: b, reason: collision with root package name */
    public final v f45596b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationMessageReactionCountItemDisplay(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45595a = m.b(new w(this, 1));
        this.f45596b = m.b(new w(this, 0));
        LayoutInflater.from(context).inflate(f.conversation_message_reaction_count, (ViewGroup) this, true);
    }
}
