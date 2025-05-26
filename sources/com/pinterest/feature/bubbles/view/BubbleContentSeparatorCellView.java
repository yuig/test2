package com.pinterest.feature.bubbles.view;

import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import b80.b;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import jk.v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ku1.l;
import org.jetbrains.annotations.NotNull;
import so.jb;
import xo0.m;
import ye2.o;
import yk1.d;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/bubbles/view/BubbleContentSeparatorCellView;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bubbles_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BubbleContentSeparatorCellView extends LinearLayout implements d, c {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f45411f = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f45412a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f45413b;

    /* renamed from: c, reason: collision with root package name */
    public GestaltText f45414c;

    /* renamed from: d, reason: collision with root package name */
    public GestaltButton f45415d;

    /* renamed from: e, reason: collision with root package name */
    public l f45416e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BubbleContentSeparatorCellView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        b();
        a();
    }

    public final void a() {
        View.inflate(getContext(), b80.c.bubble_content_text_separator_cell, this);
        View findViewById = findViewById(b.bubble_text_separator_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById;
        Intrinsics.checkNotNullParameter(gestaltText, "<set-?>");
        this.f45414c = gestaltText;
        View findViewById2 = findViewById(b.action_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById2;
        Intrinsics.checkNotNullParameter(gestaltButton, "<set-?>");
        this.f45415d = gestaltButton;
        setOrientation(1);
        setGravity(1);
    }

    public final void b() {
        if (this.f45413b) {
            return;
        }
        this.f45413b = true;
        v.X(this, (l) ((jb) ((m) generatedComponent())).f113485c.f114476s.get());
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f45412a == null) {
            this.f45412a = new o(this);
        }
        return this.f45412a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f45412a == null) {
            this.f45412a = new o(this);
        }
        return this.f45412a.generatedComponent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BubbleContentSeparatorCellView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        b();
        a();
    }
}
