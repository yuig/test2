package com.pinterest.design.brio.widget.voice;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Space;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import eo1.a;
import eo1.c;
import eo1.e;
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import le0.d;
import le0.i;
import org.jetbrains.annotations.NotNull;
import ve0.b;
import ve0.f;
import ve0.l;
import ve0.q;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/design/brio/widget/voice/PinterestToolTip;", "Lcom/pinterest/design/brio/widget/voice/PinterestVoiceLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class PinterestToolTip extends PinterestVoiceLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f44898p = 0;

    /* renamed from: f, reason: collision with root package name */
    public final q f44899f;

    /* renamed from: g, reason: collision with root package name */
    public GestaltText f44900g;

    /* renamed from: h, reason: collision with root package name */
    public Button f44901h;

    /* renamed from: i, reason: collision with root package name */
    public GestaltButton f44902i;

    /* renamed from: j, reason: collision with root package name */
    public Space f44903j;

    /* renamed from: k, reason: collision with root package name */
    public Space f44904k;

    /* renamed from: l, reason: collision with root package name */
    public final int f44905l;

    /* renamed from: m, reason: collision with root package name */
    public final int f44906m;

    /* renamed from: n, reason: collision with root package name */
    public b f44907n;

    /* renamed from: o, reason: collision with root package name */
    public int f44908o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinterestToolTip(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void m(Button button, int i13) {
        ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.weight = i13;
        button.setLayoutParams(layoutParams2);
    }

    @Override // com.pinterest.design.brio.widget.voice.PinterestVoiceLayout
    public final f d() {
        q qVar = this.f44899f;
        Intrinsics.f(qVar);
        return qVar;
    }

    @Override // com.pinterest.design.brio.widget.voice.PinterestVoiceLayout
    public void e(Context context, b anchorPos) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(anchorPos, "anchorPos");
        super.e(context, anchorPos);
        LayoutInflater.from(context).inflate(k(), (ViewGroup) this, true);
        this.f44900g = (GestaltText) findViewById(d.message_txt);
        this.f44901h = (Button) findViewById(d.negative_btn);
        this.f44902i = (GestaltButton) findViewById(d.positive_btn);
        this.f44903j = (Space) findViewById(d.button_spacer);
        this.f44904k = (Space) findViewById(d.message_buttons_spacer);
        this.f44907n = anchorPos;
        j();
    }

    @Override // com.pinterest.design.brio.widget.voice.PinterestVoiceLayout
    public final void f(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.f(context, attrs);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, i.PinterestToolTip);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f44908o = obtainStyledAttributes.getColor(i.PinterestToolTip_bubbleBackgroundColor, dl2.b.x0(context, a.sema_color_background_education));
        obtainStyledAttributes.recycle();
    }

    public final void i() {
        boolean v13 = k3.v1(this.f44901h);
        boolean v14 = k3.v1(this.f44902i);
        if (v13 && v14) {
            Button button = this.f44901h;
            Intrinsics.f(button);
            m(button, this.f44906m);
            GestaltButton gestaltButton = this.f44902i;
            Intrinsics.f(gestaltButton);
            m(gestaltButton, this.f44906m);
            k3.R1(this.f44903j, true);
            k3.R1(this.f44904k, true);
            return;
        }
        if (v13) {
            k3.R1(this.f44903j, false);
            k3.R1(this.f44904k, true);
            Button button2 = this.f44901h;
            Intrinsics.f(button2);
            m(button2, this.f44905l);
            return;
        }
        if (v14) {
            k3.R1(this.f44903j, false);
            k3.R1(this.f44904k, true);
            GestaltButton gestaltButton2 = this.f44902i;
            Intrinsics.f(gestaltButton2);
            m(gestaltButton2, this.f44905l);
        }
    }

    public final void j() {
        n("");
        Button button = this.f44901h;
        if (button != null) {
            button.setVisibility(8);
        }
        GestaltButton gestaltButton = this.f44902i;
        if (gestaltButton != null) {
            gestaltButton.d(l.f125714i);
        }
        Space space = this.f44903j;
        if (space != null) {
            space.setVisibility(8);
        }
        k3.R1(this.f44904k, false);
    }

    public int k() {
        return le0.f.brio_tool_tips;
    }

    /* renamed from: l, reason: from getter */
    public int getF44908o() {
        return this.f44908o;
    }

    public final void n(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        GestaltText gestaltText = this.f44900g;
        if (gestaltText != null) {
            gestaltText.i(new jc0.l(message, 6));
        }
    }

    public /* synthetic */ PinterestToolTip(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinterestToolTip(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f44908o == 0) {
            this.f44908o = dl2.b.x0(context, a.sema_color_background_education);
        }
        b bVar = this.f44907n;
        Resources resources = getResources();
        int f44908o = getF44908o();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        this.f44899f = new q(resources, f44908o, j1.f0(resources2));
        Resources resources3 = getResources();
        int dimensionPixelOffset = resources3.getDimensionPixelOffset(c.space_400);
        int dimensionPixelOffset2 = resources3.getDimensionPixelOffset(c.space_400);
        q qVar = this.f44899f;
        if (qVar != null) {
            qVar.e(context, dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset);
        }
        q qVar2 = this.f44899f;
        if (qVar2 != null) {
            qVar2.c(bVar);
        }
        this.f44905l = resources3.getInteger(e.tool_tips_button_container_weight);
        this.f44906m = resources3.getInteger(e.tool_tips_button_weight);
    }
}
