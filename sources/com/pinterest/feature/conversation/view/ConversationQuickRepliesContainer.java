package com.pinterest.feature.conversation.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import aq0.j;
import b60.d;
import com.pinterest.api.model.wy0;
import d5.a;
import eo1.b;
import eo1.c;
import java.util.Iterator;
import java.util.List;
import kh2.j1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kp.p;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import xc0.e;
import xc0.i;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/conversation/view/ConversationQuickRepliesContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lp2/b", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ConversationQuickRepliesContainer extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f45615e = 0;

    /* renamed from: a, reason: collision with root package name */
    public String f45616a;

    /* renamed from: b, reason: collision with root package name */
    public j f45617b;

    /* renamed from: c, reason: collision with root package name */
    public String f45618c;

    /* renamed from: d, reason: collision with root package name */
    public final String f45619d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationQuickRepliesContainer(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a() {
        List list;
        String str = this.f45618c;
        switch (str.hashCode()) {
            case -1492923298:
                if (str.equals("diy_crafts")) {
                    list = p.f80566e;
                    break;
                }
                list = p.f80562a;
                break;
            case -948399753:
                if (str.equals("quotes")) {
                    list = p.f80564c;
                    break;
                }
                list = p.f80562a;
                break;
            case -856935945:
                if (str.equals("animals")) {
                    list = p.f80568g;
                    break;
                }
                list = p.f80562a;
                break;
            case -78395017:
                if (str.equals("food_drink")) {
                    list = p.f80565d;
                    break;
                }
                list = p.f80562a;
                break;
            case 99640035:
                if (str.equals("humor")) {
                    list = p.f80563b;
                    break;
                }
                list = p.f80562a;
                break;
            case 1225035269:
                if (str.equals("home_decor")) {
                    list = p.f80567f;
                    break;
                }
                list = p.f80562a;
                break;
            default:
                list = p.f80562a;
                break;
        }
        setGravity(16);
        setPaddingRelative(getResources().getDimensionPixelSize(c.space_300), getPaddingTop(), getPaddingEnd(), getPaddingBottom());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            Button button = new Button(getContext());
            String string = getResources().getString(intValue);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            boolean e13 = j1.e1(string);
            if (e13) {
                button.setText(string);
                button.setContentDescription(getContext().getString(i.quick_reply_emoji_content_desc, string));
                Context context = getContext();
                int i13 = b.color_themed_background_default;
                Object obj = a.f53679a;
                button.setBackgroundColor(context.getColor(i13));
                button.setTextSize(30.0f);
                int dimensionPixelSize = getResources().getDimensionPixelSize(r0.neg_margin_quarter);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMarginStart(dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = dimensionPixelSize;
                layoutParams.setMarginEnd(dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = dimensionPixelSize;
                button.setLayoutParams(layoutParams);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                Context context2 = getContext();
                int i14 = b.color_themed_light_gray;
                Object obj2 = a.f53679a;
                gradientDrawable.setColor(context2.getColor(i14));
                gradientDrawable.setCornerRadius(200.0f);
                button.setBackground(gradientDrawable);
                button.setText(string);
                button.setContentDescription(getContext().getString(i.quick_reply_text_content_desc, string));
                button.setTextColor(getContext().getColor(b.color_themed_text_default));
                button.setTextSize(16.0f);
                int dimensionPixelSize2 = getResources().getDimensionPixelSize(r0.margin);
                int dimensionPixelSize3 = getResources().getDimensionPixelSize(r0.margin_half);
                button.setPaddingRelative(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize3);
                int dimensionPixelSize4 = getResources().getDimensionPixelSize(r0.margin_quarter);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.setMarginStart(dimensionPixelSize4);
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = dimensionPixelSize3;
                layoutParams2.setMarginEnd(dimensionPixelSize4);
                ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = dimensionPixelSize3;
                button.setLayoutParams(layoutParams2);
            }
            button.setOnClickListener(new qk1.a(this, e13, string, 2));
            addView(button);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationQuickRepliesContainer(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45618c = "";
        setOrientation(0);
        setId(e.quick_replies_container);
        int i14 = b.color_themed_background_default;
        Object obj = a.f53679a;
        setBackgroundColor(context.getColor(i14));
        wy0 f13 = ((d) com.bumptech.glide.d.E()).f();
        this.f45619d = f13 != null ? f13.getUid() : null;
        a();
    }
}
