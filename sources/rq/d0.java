package rq;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes3.dex */
public final class d0 extends PinCloseupBaseModule {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f109129f = 0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f109130a;

    /* renamed from: b, reason: collision with root package name */
    public String f109131b;

    /* renamed from: c, reason: collision with root package name */
    public GestaltText f109132c;

    /* renamed from: d, reason: collision with root package name */
    public a.l2 f109133d;

    /* renamed from: e, reason: collision with root package name */
    public String f109134e;

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        setOrientation(1);
        this.f109133d = new a.l2(this, 23);
        getPaddingRect().top = getResources().getDimensionPixelSize(eo1.c.margin_half);
        getPaddingRect().bottom = 0;
        updateHorizontalPadding();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(o.f109411r);
        this.f109132c = gestaltText;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setOnLongClickListener(new n(2));
        linearLayout.setOnClickListener(this.f109133d);
        linearLayout.addView(this.f109132c, layoutParams);
        addView(linearLayout, -1, -2);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_TITLE;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        f30 pin = getPin();
        String b13 = pin != null ? sq.i.b(pin) : null;
        this.f109131b = b13;
        return df.j1.d1(b13);
    }

    @Override // rq.k
    public final void inject() {
        if (this.f109130a) {
            return;
        }
        this.f109130a = true;
        jb jbVar = (jb) ((e0) generatedComponent());
        oa oaVar = jbVar.f113483a;
        this.clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
        this.presenterPinalyticsFactory = (uk1.e) oaVar.f113702ga.get();
        s8 s8Var = jbVar.f113485c;
        this.closeupActionController = s8Var.h5();
        this.bidiFormatter = a02.e.I1();
        this.baseCloseupLibraryExperiments = s8Var.k5();
        this.pinAuxHelper = (nx.b0) oaVar.R8.get();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return hasContent();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateView() {
        super.updateView();
        if (getPin() == null) {
            return;
        }
        if (hasContent()) {
            GestaltText gestaltText = this.f109132c;
            if (gestaltText != null) {
                gestaltText.i(new z3.m(this, 22));
                return;
            }
            return;
        }
        GestaltText gestaltText2 = this.f109132c;
        if (gestaltText2 != null) {
            gestaltText2.i(o.f109412s);
        }
    }
}
