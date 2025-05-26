package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import so.jb;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/closeup/view/IdeaPinFontPicker;", "Landroid/widget/LinearLayout;", "Lcom/pinterest/feature/ideaPinCreation/closeup/view/h0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinFontPicker extends LinearLayout implements h0, af2.c {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f45997j = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f45998a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f45999b;

    /* renamed from: c, reason: collision with root package name */
    public final int f46000c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f46001d;

    /* renamed from: e, reason: collision with root package name */
    public final int f46002e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f46003f;

    /* renamed from: g, reason: collision with root package name */
    public final wk2.a f46004g;

    /* renamed from: h, reason: collision with root package name */
    public final au0.g f46005h;

    /* renamed from: i, reason: collision with root package name */
    public String f46006i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinFontPicker(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f45999b) {
            this.f45999b = true;
            this.f46004g = ((jb) ((i0) generatedComponent())).f113502t;
        }
        this.f46000c = dl2.b.y0(this, eo1.a.base_color_grayscale_0);
        this.f46001d = bs1.c.f0(this, sm1.b.ic_check_gestalt, null, null, 6);
        this.f46002e = bs1.c.W(this, eo1.c.space_200);
        this.f46006i = "6";
        View findViewById = View.inflate(getContext(), aq1.f.layout_idea_pin_font_picker, this).findViewById(aq1.d.story_pin_font_list);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f46003f = (LinearLayout) findViewById;
        wk2.a aVar = this.f46004g;
        if (aVar == null) {
            Intrinsics.r("ideaPinFontPickerPresenter");
            throw null;
        }
        Object obj = aVar.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        au0.g gVar = (au0.g) obj;
        this.f46005h = gVar;
        gVar.bind(this);
    }

    public final void a(String str) {
        LinearLayout linearLayout = this.f46003f;
        int childCount = linearLayout.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = linearLayout.getChildAt(i13);
            Object tag = childAt.getTag(aq1.d.idea_pin_font_id);
            String str2 = tag instanceof String ? (String) tag : null;
            if (childAt instanceof CheckedTextView) {
                boolean d2 = Intrinsics.d(str, str2);
                CheckedTextView checkedTextView = (CheckedTextView) childAt;
                checkedTextView.setCheckMarkDrawable(d2 ? this.f46001d : null);
                checkedTextView.setChecked(d2);
            }
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f45998a == null) {
            this.f45998a = new ye2.o(this);
        }
        return this.f45998a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f45998a == null) {
            this.f45998a = new ye2.o(this);
        }
        return this.f45998a.generatedComponent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinFontPicker(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f45999b) {
            this.f45999b = true;
            this.f46004g = ((jb) ((i0) generatedComponent())).f113502t;
        }
        this.f46000c = dl2.b.y0(this, eo1.a.base_color_grayscale_0);
        this.f46001d = bs1.c.f0(this, sm1.b.ic_check_gestalt, null, null, 6);
        this.f46002e = bs1.c.W(this, eo1.c.space_200);
        this.f46006i = "6";
        View findViewById = View.inflate(getContext(), aq1.f.layout_idea_pin_font_picker, this).findViewById(aq1.d.story_pin_font_list);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f46003f = (LinearLayout) findViewById;
        wk2.a aVar = this.f46004g;
        if (aVar != null) {
            Object obj = aVar.get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            au0.g gVar = (au0.g) obj;
            this.f46005h = gVar;
            gVar.bind(this);
            return;
        }
        Intrinsics.r("ideaPinFontPickerPresenter");
        throw null;
    }
}
