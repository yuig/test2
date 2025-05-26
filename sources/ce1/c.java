package ce1;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import c0.d;
import ca1.h;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.radioGroup.GestaltRadio;
import com.pinterest.gestalt.text.GestaltText;
import de1.b0;
import de1.o0;
import kc1.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import zd1.g;

/* loaded from: classes5.dex */
public final class c extends LinearLayout implements be1.b {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f27608h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final yd1.c f27609a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltRadio f27610b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltCheckBox f27611c;

    /* renamed from: d, reason: collision with root package name */
    public g f27612d;

    /* renamed from: e, reason: collision with root package name */
    public be1.a f27613e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27614f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27615g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        yd1.c cVar = new yd1.c(context2, vn1.g.UI_400);
        cVar.setGravity(8388611);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2, 1.0f);
        layoutParams.gravity = 16;
        int dimensionPixelOffset = cVar.getResources().getDimensionPixelOffset(eo1.c.space_200);
        final int i13 = 0;
        cVar.setPaddingRelative(0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        cVar.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.gravity = 16;
        GestaltText gestaltText = cVar.f138797f;
        gestaltText.setLayoutParams(layoutParams2);
        gestaltText.i(yd1.b.f138790m);
        this.f27609a = cVar;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        GestaltRadio gestaltRadio = new GestaltRadio(context3);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2, 0.0f);
        layoutParams3.gravity = 16;
        layoutParams3.setMarginStart(gestaltRadio.getResources().getDimensionPixelOffset(eo1.c.space_200));
        gestaltRadio.setLayoutParams(layoutParams3);
        gestaltRadio.b(new h(this, 19));
        this.f27610b = gestaltRadio;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        GestaltCheckBox gestaltCheckBox = new GestaltCheckBox(context4);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2, 0.0f);
        layoutParams4.gravity = 16;
        layoutParams4.setMarginStart(gestaltCheckBox.getResources().getDimensionPixelOffset(eo1.c.space_200));
        gestaltCheckBox.setLayoutParams(layoutParams4);
        d.l(gestaltCheckBox, new w(this, 21));
        this.f27611c = gestaltCheckBox;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(0);
        addView(cVar);
        addView(gestaltRadio);
        addView(gestaltCheckBox);
        setOnClickListener(new View.OnClickListener(this) { // from class: ce1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f27600b;

            {
                this.f27600b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b0 b0Var;
                int i14 = i13;
                c this$0 = this.f27600b;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        be1.a aVar = this$0.f27613e;
                        if (aVar == null) {
                            Intrinsics.r("multiSelectFilterUpdateListener");
                            throw null;
                        }
                        b0Var = aVar instanceof b0 ? (b0) aVar : null;
                        if (b0Var != null) {
                            ((o0) b0Var).f54617u = false;
                        }
                        this$0.f27610b.performClick();
                        this$0.f27611c.L(b.f27601j);
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        be1.a aVar2 = this$0.f27613e;
                        if (aVar2 == null) {
                            Intrinsics.r("multiSelectFilterUpdateListener");
                            throw null;
                        }
                        b0Var = aVar2 instanceof b0 ? (b0) aVar2 : null;
                        if (b0Var != null) {
                            ((o0) b0Var).f54617u = false;
                        }
                        this$0.f27610b.performClick();
                        this$0.f27611c.L(b.f27602k);
                        return;
                }
            }
        });
        final int i14 = 1;
        cVar.setClickable(true);
        cVar.setOnClickListener(new View.OnClickListener(this) { // from class: ce1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f27600b;

            {
                this.f27600b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b0 b0Var;
                int i142 = i14;
                c this$0 = this.f27600b;
                switch (i142) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        be1.a aVar = this$0.f27613e;
                        if (aVar == null) {
                            Intrinsics.r("multiSelectFilterUpdateListener");
                            throw null;
                        }
                        b0Var = aVar instanceof b0 ? (b0) aVar : null;
                        if (b0Var != null) {
                            ((o0) b0Var).f54617u = false;
                        }
                        this$0.f27610b.performClick();
                        this$0.f27611c.L(b.f27601j);
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        be1.a aVar2 = this$0.f27613e;
                        if (aVar2 == null) {
                            Intrinsics.r("multiSelectFilterUpdateListener");
                            throw null;
                        }
                        b0Var = aVar2 instanceof b0 ? (b0) aVar2 : null;
                        if (b0Var != null) {
                            ((o0) b0Var).f54617u = false;
                        }
                        this$0.f27610b.performClick();
                        this$0.f27611c.L(b.f27602k);
                        return;
                }
            }
        });
    }

    public static String a(g gVar) {
        String str = gVar.f141716g;
        return z.j(str) ^ true ? str : gVar.f141715f;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z13) {
        float f13;
        super.setEnabled(z13);
        this.f27610b.setClickable(z13);
        this.f27611c.L(new fd1.h(z13, 2));
        setClickable(z13);
        yd1.c cVar = this.f27609a;
        if (z13) {
            f13 = 1.0f;
            cVar.setAlpha(1.0f);
        } else {
            f13 = 0.5f;
            cVar.setAlpha(0.5f);
        }
        setAlpha(f13);
    }

    @Override // android.view.View
    public final void setSelected(boolean z13) {
        this.f27614f = z13;
        fd1.h hVar = new fd1.h(z13, 3);
        GestaltRadio gestaltRadio = this.f27610b;
        gestaltRadio.a(hVar);
        if (z13) {
            gestaltRadio.performClick();
        }
        this.f27611c.L(new fd1.h(z13, 4));
        this.f27614f = false;
    }
}
