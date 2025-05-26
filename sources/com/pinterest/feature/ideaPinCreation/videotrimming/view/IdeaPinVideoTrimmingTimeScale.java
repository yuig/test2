package com.pinterest.feature.ideaPinCreation.videotrimming.view;

import android.content.Context;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import aq1.b;
import aq1.d;
import aq1.f;
import com.pinterest.gestalt.text.GestaltText;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.u0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ml2.c;
import org.jetbrains.annotations.NotNull;
import pk.a0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/videotrimming/view/IdeaPinVideoTrimmingTimeScale;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinVideoTrimmingTimeScale extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f46600a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46601b;

    /* renamed from: c, reason: collision with root package name */
    public final int f46602c;

    /* renamed from: d, reason: collision with root package name */
    public final int f46603d;

    /* renamed from: e, reason: collision with root package name */
    public final int f46604e;

    /* renamed from: f, reason: collision with root package name */
    public final int f46605f;

    /* renamed from: g, reason: collision with root package name */
    public final int f46606g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f46607h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f46608i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f46609j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IdeaPinVideoTrimmingTimeScale(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void L(GestaltText gestaltText, String str) {
        a0.p(gestaltText, str);
        gestaltText.measure(0, 0);
        int max = Math.max(this.f46604e - (gestaltText.getMeasuredWidth() / 2), 0);
        ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(Intrinsics.d(gestaltText, this.f46608i) ? max : 0);
        marginLayoutParams.setMarginEnd(Intrinsics.d(gestaltText, this.f46609j) ? max : 0);
        gestaltText.setLayoutParams(marginLayoutParams);
    }

    public final void T(long j13) {
        long d2 = c.d((j13 * 1.0f) / 1000);
        String formatElapsedTime = DateUtils.formatElapsedTime(d2);
        if (d2 < 600) {
            Intrinsics.f(formatElapsedTime);
            formatElapsedTime = formatElapsedTime.substring(1);
            Intrinsics.checkNotNullExpressionValue(formatElapsedTime, "substring(...)");
        } else {
            Intrinsics.f(formatElapsedTime);
        }
        L(this.f46609j, formatElapsedTime);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinVideoTrimmingTimeScale(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int W = bs1.c.W(this, b.story_pin_video_trimmer_preview_width);
        this.f46600a = W;
        this.f46601b = bs1.c.W(this, b.story_pin_video_trimmer_time_scale_long_length);
        this.f46602c = bs1.c.W(this, b.story_pin_video_trimmer_time_scale_short_length);
        this.f46603d = bs1.c.W(this, b.story_pin_video_trimmer_time_scale_width);
        this.f46604e = (c.c(hf0.b.f69002b) - W) / 2;
        this.f46605f = c.c(((W - (r10 * 21)) * 1.0f) / 20);
        this.f46606g = bs1.c.B(this, eo1.b.color_gray_500);
        View.inflate(context, f.view_idea_pin_time_scale, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View findViewById = findViewById(d.scale_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f46607h = (LinearLayout) findViewById;
        View findViewById2 = findViewById(d.start_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f46608i = (GestaltText) findViewById2;
        View findViewById3 = findViewById(d.end_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f46609j = (GestaltText) findViewById3;
        Iterator it = new IntRange(0, 20, 1).iterator();
        while (it.hasNext()) {
            int b13 = ((u0) it).b();
            if (b13 % 5 == 0) {
                boolean z13 = b13 == 20;
                View view = new View(getContext());
                view.setBackgroundColor(this.f46606g);
                int i14 = this.f46601b;
                int i15 = this.f46603d;
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(i15, i14);
                int i16 = this.f46605f;
                layoutParams.setMargins(z13 ? (this.f46600a - (i15 * 21)) - (i16 * 20) : 0, 0, z13 ? 0 : i16, 0);
                view.setLayoutParams(layoutParams);
                this.f46607h.addView(view);
            } else {
                View view2 = new View(getContext());
                view2.setBackgroundColor(this.f46606g);
                ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(this.f46603d, this.f46602c);
                layoutParams2.setMargins(0, 0, this.f46605f, 0);
                view2.setLayoutParams(layoutParams2);
                this.f46607h.addView(view2);
            }
        }
        L(this.f46608i, "0");
    }
}
