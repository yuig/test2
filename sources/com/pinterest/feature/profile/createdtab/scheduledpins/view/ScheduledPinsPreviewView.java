package com.pinterest.feature.profile.createdtab.scheduledpins.view;

import a.cb;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import bs1.c;
import com.pinterest.gestalt.text.GestaltText;
import hf0.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import nz1.d;
import org.jetbrains.annotations.NotNull;
import uk2.f;
import yk1.n;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/profile/createdtab/scheduledpins/view/ScheduledPinsPreviewView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bp1/h", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ScheduledPinsPreviewView extends ConstraintLayout implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f47505f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f47506a;

    /* renamed from: b, reason: collision with root package name */
    public final List f47507b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f47508c;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f47509d;

    /* renamed from: e, reason: collision with root package name */
    public final f f47510e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScheduledPinsPreviewView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ScheduledPinsPreviewView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScheduledPinsPreviewView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47510e = cb.r("create(...)");
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        View.inflate(context, d.view_scheduled_pins_preview, this);
        int W = c.W(this, eo1.c.space_200);
        int W2 = c.W(this, eo1.c.space_400);
        setPaddingRelative(W, W2, W, W2);
        View findViewById = findViewById(nz1.c.scheduled_pins_preview_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47506a = (GestaltText) findViewById;
        if (b.q()) {
            this.f47507b = f0.j(findViewById(nz1.c.scheduled_pins_preview_image_one), findViewById(nz1.c.scheduled_pins_preview_image_two), findViewById(nz1.c.scheduled_pins_preview_image_three), findViewById(nz1.c.scheduled_pins_preview_image_four), findViewById(nz1.c.scheduled_pins_preview_image_five));
        } else {
            this.f47507b = f0.j(findViewById(nz1.c.scheduled_pins_preview_image_one), findViewById(nz1.c.scheduled_pins_preview_image_two), findViewById(nz1.c.scheduled_pins_preview_image_three), findViewById(nz1.c.scheduled_pins_preview_image_five));
            c.X0(findViewById(nz1.c.scheduled_pins_preview_image_four));
        }
        View findViewById2 = findViewById(nz1.c.scheduled_pins_preview_overflow_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47508c = (GestaltText) findViewById2;
        View findViewById3 = findViewById(nz1.c.scheduled_pins_preview_overflow_text_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47509d = (FrameLayout) findViewById3;
        setOnClickListener(new com.pinterest.feature.home.view.c(this, 26));
    }
}
