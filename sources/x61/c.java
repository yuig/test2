package x61;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import bm1.l;
import com.pinterest.gestalt.buttonToggle.GestaltButtonToggle;
import kotlin.jvm.internal.Intrinsics;
import ye2.o;

/* loaded from: classes5.dex */
public final class c extends LinearLayout implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public o f133933a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f133934b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f133935c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f133936d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltButtonToggle f133937e;

    /* renamed from: f, reason: collision with root package name */
    public a f133938f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.appcompat.widget.d f133939g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, v61.a hairPatternFilter, boolean z13, int i13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(hairPatternFilter, "hairPatternFilter");
        if (!this.f133934b) {
            this.f133934b = true;
            ((d) generatedComponent()).getClass();
        }
        this.f133935c = z13;
        this.f133939g = new androidx.appcompat.widget.d(this, 20);
        l lVar = hairPatternFilter.f124210c;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltButtonToggle gestaltButtonToggle = new GestaltButtonToggle(6, context2, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(i13);
        layoutParams.gravity = 17;
        gestaltButtonToggle.setLayoutParams(layoutParams);
        kh2.j.r(gestaltButtonToggle.s(new j41.i(lVar, 14)), new y11.c(21, this, gestaltButtonToggle));
        this.f133937e = gestaltButtonToggle;
        addView(gestaltButtonToggle);
    }

    public final void a() {
        this.f133936d = true;
        GestaltButtonToggle gestaltButtonToggle = this.f133937e;
        if (gestaltButtonToggle != null) {
            gestaltButtonToggle.s(b.f133928j);
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f133933a == null) {
            this.f133933a = new o(this);
        }
        return this.f133933a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f133933a == null) {
            this.f133933a = new o(this);
        }
        return this.f133933a.generatedComponent();
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            this.f133938f = new a(1, onClickListener, View.OnClickListener.class, "onClick", "onClick(Landroid/view/View;)V", 0);
        }
    }
}
