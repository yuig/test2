package rq;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.api.model.ah;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.h80;
import com.pinterest.api.model.oe0;
import com.pinterest.api.model.t80;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes3.dex */
public final class j1 extends PinCloseupBaseModule {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f109279h = 0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f109280a;

    /* renamed from: b, reason: collision with root package name */
    public es.a f109281b;

    /* renamed from: c, reason: collision with root package name */
    public String f109282c;

    /* renamed from: d, reason: collision with root package name */
    public String f109283d;

    /* renamed from: e, reason: collision with root package name */
    public final RelativeLayout f109284e;

    /* renamed from: f, reason: collision with root package name */
    public final xk2.v f109285f;

    /* renamed from: g, reason: collision with root package name */
    public final xk2.v f109286g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltIcon gestaltIcon = new GestaltIcon(context2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15, -1);
        layoutParams.addRule(21);
        gestaltIcon.setLayoutParams(layoutParams);
        View g23 = gestaltIcon.g2(o.A);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int dimensionPixelSize = relativeLayout.getResources().getDimensionPixelSize(eo1.c.space_400);
        int dimensionPixelSize2 = relativeLayout.getResources().getDimensionPixelSize(eo1.c.space_200);
        relativeLayout.setPaddingRelative(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context3, (AttributeSet) null);
        String string = gestaltText.getResources().getString(m60.x0.product_details_header);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        pk.a0.p(gestaltText, string);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(20, -1);
        gestaltText.setLayoutParams(layoutParams2);
        dl2.b.y2(gestaltText);
        relativeLayout.addView(gestaltText);
        relativeLayout.addView(g23);
        relativeLayout.setOnClickListener(new co.a(13, this, relativeLayout));
        this.f109284e = relativeLayout;
        this.f109285f = xk2.m.b(new e(this, 2));
        this.f109286g = xk2.m.b(new e(this, 1));
    }

    public static final GestaltDivider b(j1 j1Var) {
        j1Var.getClass();
        Context context = j1Var.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltDivider gestaltDivider = new GestaltDivider(6, context, (AttributeSet) null);
        int dimensionPixelOffset = gestaltDivider.getResources().getDimensionPixelOffset(eo1.c.space_400);
        int dimensionPixelOffset2 = gestaltDivider.getResources().getDimensionPixelOffset(eo1.c.space_200);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2);
        gestaltDivider.setLayoutParams(layoutParams);
        return gestaltDivider;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        setOrientation(1);
        addView((GestaltDivider) this.f109285f.getValue());
        addView(this.f109284e);
        addView((GestaltDivider) this.f109286g.getValue());
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_PRODUCT_DETAILS;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return true;
    }

    @Override // rq.k
    public final void inject() {
        if (this.f109280a) {
            return;
        }
        this.f109280a = true;
        jb jbVar = (jb) ((k1) generatedComponent());
        oa oaVar = jbVar.f113483a;
        this.clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
        this.presenterPinalyticsFactory = (uk1.e) oaVar.f113702ga.get();
        s8 s8Var = jbVar.f113485c;
        this.closeupActionController = s8Var.h5();
        this.bidiFormatter = a02.e.I1();
        this.baseCloseupLibraryExperiments = s8Var.k5();
        this.pinAuxHelper = (nx.b0) oaVar.R8.get();
        this.f109281b = (es.a) oaVar.P6.get();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldSendPinCardView() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateView() {
        String h43;
        f30 pin;
        List i13;
        List r13;
        h80 h80Var;
        super.updateView();
        f30 pin2 = getPin();
        if (pin2 != null) {
            oe0 f63 = pin2.f6();
            t80 t13 = (f63 == null || (r13 = f63.r()) == null || (h80Var = (h80) r13.get(0)) == null) ? null : h80Var.t();
            if (t13 != null && (i13 = t13.i()) != null) {
                List list = i13;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        List g13 = ((ah) it.next()).g();
                        if (g13 != null && g13.size() > 1) {
                            es.a aVar = this.f109281b;
                            if (aVar == null) {
                                Intrinsics.r("adFormats");
                                throw null;
                            }
                            if (((es.c) aVar).R(pin2)) {
                                kh2.k3.J1((GestaltDivider) this.f109285f.getValue());
                                break;
                            }
                        }
                    }
                }
            }
        }
        es.a aVar2 = this.f109281b;
        if (aVar2 == null) {
            Intrinsics.r("adFormats");
            throw null;
        }
        if (((es.c) aVar2).R(getPin()) && (pin = getPin()) != null) {
            boolean[] zArr = pin.f37485h3;
            if (zArr.length > 175 && zArr[175]) {
                kh2.k3.J1((GestaltDivider) this.f109286g.getValue());
                setPaddingRelative(getPaddingStart(), getPaddingTop(), getPaddingEnd(), bs1.c.Z(this, eo1.c.space_400));
            }
        }
        f30 pin3 = getPin();
        String N3 = pin3 != null ? pin3.N3() : null;
        if (N3 != null && N3.length() != 0) {
            f30 pin4 = getPin();
            this.f109283d = pin4 != null ? pin4.N3() : null;
        }
        f30 pin5 = getPin();
        if (pin5 == null || (h43 = pin5.h4()) == null) {
            return;
        }
        this.f109282c = h43;
    }
}
