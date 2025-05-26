package oq;

import a.l2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.pinterest.activity.pin.view.PinCloseupChevronIconView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import k1.j1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q extends LinearLayout implements af2.c {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f97119k = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f97120a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f97121b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f97122c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f97123d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f97124e;

    /* renamed from: f, reason: collision with root package name */
    public final PinCloseupChevronIconView f97125f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f97126g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f97127h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f97128i;

    /* renamed from: j, reason: collision with root package name */
    public final b11.d f97129j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, ViewGroup view, boolean z13, rq.e logModuleExpand, rq.e logModuleCollapse) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(logModuleExpand, "logModuleExpand");
        Intrinsics.checkNotNullParameter(logModuleCollapse, "logModuleCollapse");
        if (!this.f97121b) {
            this.f97121b = true;
            ((r) generatedComponent()).getClass();
        }
        this.f97122c = logModuleExpand;
        this.f97123d = logModuleCollapse;
        this.f97124e = false;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        PinCloseupChevronIconView pinCloseupChevronIconView = new PinCloseupChevronIconView(context2);
        pinCloseupChevronIconView.setId(n80.c.closeup_collapsable_chevron);
        pinCloseupChevronIconView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        pinCloseupChevronIconView.Z(false);
        if (z13) {
            pinCloseupChevronIconView.T(0L, false);
        }
        this.f97125f = pinCloseupChevronIconView;
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(bs1.c.W(imageView, eo1.c.space_600), bs1.c.W(imageView, eo1.c.space_600));
        layoutParams.setMargins(0, 0, bs1.c.W(imageView, eo1.c.space_200), 0);
        imageView.setLayoutParams(layoutParams);
        if (z13) {
            imageView.setAlpha(0.0f);
        }
        bs1.c.X0(imageView);
        this.f97126g = imageView;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context3, (AttributeSet) null);
        n nVar = n.f97100s;
        gestaltText.i(nVar);
        gestaltText.setFocusable(true);
        gestaltText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
        this.f97127h = gestaltText;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        GestaltText gestaltText2 = new GestaltText(6, context4, (AttributeSet) null);
        gestaltText2.i(nVar);
        gestaltText2.setFocusable(true);
        this.f97128i = gestaltText2;
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        GestaltIconButton gestaltIconButton = new GestaltIconButton(6, context5, (AttributeSet) null);
        gestaltIconButton.t(n.f97099r);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
        linearLayout.addView(gestaltText2);
        linearLayout.addView(gestaltIconButton);
        int i13 = z13 ? 3 : 0;
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        b11.d dVar = new b11.d(i13, context6);
        dVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f97129j = dVar;
        setId(n80.c.closeup_collapsable_module);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setBackground(bs1.c.f0(this, r80.b.pin_closeup_redesign_module_background, null, null, 6));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setId(n80.c.closeup_collapsable_title);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout2.setGravity(16);
        int W = bs1.c.W(linearLayout2, eo1.c.space_400);
        linearLayout2.setPaddingRelative(W, W, 0, W);
        linearLayout2.addView(gestaltText);
        linearLayout2.addView(imageView);
        linearLayout2.addView(pinCloseupChevronIconView);
        addView(linearLayout2);
        addView(dVar);
        dVar.addView(view);
        setOnClickListener(new l2(this, 20));
    }

    public final void a(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (!this.f97124e) {
            this.f97127h.setText(text);
        } else {
            this.f97128i.i(new j1(text, 24));
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f97120a == null) {
            this.f97120a = new ye2.o(this);
        }
        return this.f97120a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f97120a == null) {
            this.f97120a = new ye2.o(this);
        }
        return this.f97120a.generatedComponent();
    }
}
