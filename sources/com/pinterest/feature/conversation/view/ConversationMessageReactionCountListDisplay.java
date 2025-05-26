package com.pinterest.feature.conversation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bs1.c;
import com.pinterest.gestalt.text.GestaltText;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import oq0.a;
import oq0.b;
import org.jetbrains.annotations.NotNull;
import xc0.e;
import xc0.f;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/feature/conversation/view/ConversationMessageReactionCountListDisplay;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ConversationMessageReactionCountListDisplay extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ConversationMessageReactionCountItemDisplay f45597a;

    /* renamed from: b, reason: collision with root package name */
    public final ConversationMessageReactionCountItemDisplay f45598b;

    /* renamed from: c, reason: collision with root package name */
    public final ConversationMessageReactionCountItemDisplay f45599c;

    /* renamed from: d, reason: collision with root package name */
    public final ConversationMessageReactionCountItemDisplay f45600d;

    /* renamed from: e, reason: collision with root package name */
    public final ConversationMessageReactionCountItemDisplay f45601e;

    /* renamed from: f, reason: collision with root package name */
    public final ConversationMessageReactionCountItemDisplay f45602f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationMessageReactionCountListDisplay(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(f.conversation_message_reactions_count_display, (ViewGroup) this, true);
        View findViewById = findViewById(e.heart_reaction);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45597a = (ConversationMessageReactionCountItemDisplay) findViewById;
        View findViewById2 = findViewById(e.joy_reaction);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45598b = (ConversationMessageReactionCountItemDisplay) findViewById2;
        View findViewById3 = findViewById(e.heart_eyes_reaction);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45599c = (ConversationMessageReactionCountItemDisplay) findViewById3;
        View findViewById4 = findViewById(e.open_mouth_reaction);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45600d = (ConversationMessageReactionCountItemDisplay) findViewById4;
        View findViewById5 = findViewById(e.thumbs_up_reaction);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f45601e = (ConversationMessageReactionCountItemDisplay) findViewById5;
        View findViewById6 = findViewById(e.thumbs_down_reaction);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f45602f = (ConversationMessageReactionCountItemDisplay) findViewById6;
    }

    public final void a(Map map) {
        Collection<String> values;
        HashMap f13 = z0.f(new Pair("❤️", this.f45597a), new Pair("😂", this.f45598b), new Pair("😍", this.f45599c), new Pair("😮", this.f45600d), new Pair("👍", this.f45601e), new Pair("👎", this.f45602f));
        Collection values2 = f13.values();
        Intrinsics.checkNotNullExpressionValue(values2, "<get-values>(...)");
        Iterator it = values2.iterator();
        while (it.hasNext()) {
            c.R1((ConversationMessageReactionCountItemDisplay) it.next(), false);
        }
        HashMap hashMap = new HashMap();
        if (map != null && (values = map.values()) != null) {
            for (String str : values) {
                Integer num = (Integer) hashMap.get(str);
                hashMap.put(str, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            a reactionModel = (a) b.f97216b.get(entry.getKey());
            if (reactionModel != null) {
                c.R1((View) f13.get(entry.getKey()), true);
                ConversationMessageReactionCountItemDisplay conversationMessageReactionCountItemDisplay = (ConversationMessageReactionCountItemDisplay) f13.get(entry.getKey());
                if (conversationMessageReactionCountItemDisplay != null) {
                    int intValue = ((Number) entry.getValue()).intValue();
                    Intrinsics.checkNotNullParameter(reactionModel, "reactionModel");
                    Object value = conversationMessageReactionCountItemDisplay.f45595a.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    ((ImageView) value).setImageResource(reactionModel.f97213a);
                    Object value2 = conversationMessageReactionCountItemDisplay.f45596b.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                    GestaltText gestaltText = (GestaltText) value2;
                    c.R1(gestaltText, intValue > 1);
                    gestaltText.setText(String.valueOf(intValue));
                    gestaltText.setTextSize(gestaltText.getContext().getResources().getDimension(xc0.c.reaction_multiple_display_count_text_size));
                }
            }
        }
    }
}
