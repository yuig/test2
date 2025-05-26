package com.pinterest.ui.components.sections;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import ar0.b;
import com.pinterest.gestalt.text.GestaltText;
import d70.d;
import d70.e;
import dc0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import le0.g;
import m60.r0;
import m60.x0;
import na2.a;
import na2.c;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import y92.i;
import yk1.n;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/pinterest/ui/components/sections/LegoSectionRep;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Lar0/b;", "Ly92/i;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "boardLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LegoSectionRep extends LinearLayout implements n, b, i {

    /* renamed from: a, reason: collision with root package name */
    public final LegoSectionRepPinPreview f52325a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f52326b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f52327c;

    /* renamed from: d, reason: collision with root package name */
    public q f52328d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoSectionRep(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52328d = q.Default;
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View.inflate(getContext(), e.lego_section_rep_default, this);
        View findViewById = findViewById(d.lego_section_rep_pin_preview);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f52325a = (LegoSectionRepPinPreview) findViewById;
        View findViewById2 = findViewById(d.lego_section_rep_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f52326b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(d.lego_section_rep_metadata);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f52327c = (GestaltText) findViewById3;
    }

    public final void a(na2.e viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        LegoSectionRepPinPreview legoSectionRepPinPreview = this.f52325a;
        legoSectionRepPinPreview.getClass();
        q size = viewModel.f90104a;
        Intrinsics.checkNotNullParameter(size, "size");
        if (legoSectionRepPinPreview.f52337h != size) {
            legoSectionRepPinPreview.f52337h = size;
            legoSectionRepPinPreview.invalidate();
        }
        q qVar = q.List;
        if (size == qVar && this.f52328d != qVar) {
            setOrientation(0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(legoSectionRepPinPreview.getLayoutParams());
            layoutParams.bottomMargin = 0;
            layoutParams.setMarginEnd(getResources().getDimensionPixelOffset(r0.lego_section_rep_text_inset_list));
            legoSectionRepPinPreview.setLayoutParams(layoutParams);
        } else if (size != qVar && this.f52328d == qVar) {
            setOrientation(1);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(legoSectionRepPinPreview.getLayoutParams());
            layoutParams2.bottomMargin = getResources().getDimensionPixelOffset(r0.lego_section_rep_text_inset_default);
            layoutParams2.setMarginEnd(0);
            legoSectionRepPinPreview.setLayoutParams(layoutParams2);
        }
        q qVar2 = this.f52328d;
        q qVar3 = q.Compact;
        GestaltText gestaltText = this.f52326b;
        if (qVar2 != qVar3 && size == qVar3) {
            gestaltText.i(a.f90096j);
        } else if (qVar2 == qVar3 && size != qVar3) {
            gestaltText.i(a.f90097k);
        }
        this.f52328d = size;
        List list = viewModel.f90105b;
        String str = (String) CollectionsKt.U(0, list);
        String str2 = (String) CollectionsKt.U(1, list);
        String str3 = (String) CollectionsKt.U(2, list);
        int i13 = na2.d.f90103a[legoSectionRepPinPreview.f52337h.ordinal()];
        if (i13 == 1) {
            legoSectionRepPinPreview.d(str, c.Left);
            legoSectionRepPinPreview.d(str2, c.Center);
            legoSectionRepPinPreview.d(str3, c.Right);
        } else if (i13 == 2) {
            legoSectionRepPinPreview.d(str, c.Left);
            legoSectionRepPinPreview.d(str2, c.Center);
        } else if (i13 == 3) {
            legoSectionRepPinPreview.d(str, c.Left);
        }
        Resources resources = getResources();
        int i14 = g.plural_pins;
        int i15 = viewModel.f90107d;
        String quantityString = resources.getQuantityString(i14, i15, Integer.valueOf(i15));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        a0.p(this.f52327c, quantityString);
        String str4 = viewModel.f90106c;
        a0.p(gestaltText, str4);
        setContentDescription(getResources().getString(x0.accessibility_board_section_cover_view, str4));
    }

    @Override // ar0.b
    public final boolean b() {
        return false;
    }

    @Override // y92.i
    public final void onViewRecycled() {
        this.f52325a.f52340k.d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoSectionRep(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f52328d = q.Default;
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View.inflate(getContext(), e.lego_section_rep_default, this);
        View findViewById = findViewById(d.lego_section_rep_pin_preview);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f52325a = (LegoSectionRepPinPreview) findViewById;
        View findViewById2 = findViewById(d.lego_section_rep_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f52326b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(d.lego_section_rep_metadata);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f52327c = (GestaltText) findViewById3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoSectionRep(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f52328d = q.Default;
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View.inflate(getContext(), e.lego_section_rep_default, this);
        View findViewById = findViewById(d.lego_section_rep_pin_preview);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f52325a = (LegoSectionRepPinPreview) findViewById;
        View findViewById2 = findViewById(d.lego_section_rep_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f52326b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(d.lego_section_rep_metadata);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f52327c = (GestaltText) findViewById3;
    }
}
