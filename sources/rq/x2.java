package rq;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.api.model.qc0;
import com.pinterest.api.model.tc0;
import com.pinterest.api.model.uc0;
import com.pinterest.api.model.xc0;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x2 extends PinCloseupBaseModule implements yk1.d {

    /* renamed from: a, reason: collision with root package name */
    public final lh0.a0 f109645a;

    /* renamed from: b, reason: collision with root package name */
    public final p01.j f109646b;

    /* renamed from: c, reason: collision with root package name */
    public w01.z f109647c;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f109648d;

    /* renamed from: e, reason: collision with root package name */
    public h32.g0 f109649e;

    /* renamed from: f, reason: collision with root package name */
    public int f109650f;

    /* renamed from: g, reason: collision with root package name */
    public int f109651g;

    /* renamed from: h, reason: collision with root package name */
    public final int f109652h;

    /* renamed from: i, reason: collision with root package name */
    public final FrameLayout f109653i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(Context context, lh0.a0 a0Var, p01.j jVar, int i13) {
        super(context);
        AttributeSet attributeSet = null;
        a0Var = (i13 & 8) != 0 ? null : a0Var;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f109645a = a0Var;
        this.f109646b = jVar;
        this.f109650f = -1;
        this.f109651g = -1;
        this.f109652h = (int) (hf0.b.f69003c / 2);
        xk2.m.b(new db.m(this, 16));
        setVisibility(8);
        setGravity(8388611);
        int i14 = eo1.b.color_black_900;
        Object obj = d5.a.f53679a;
        setBackgroundColor(context.getColor(i14));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f109648d = frameLayout;
        maybeUpdateLayoutForTabletPortrait(frameLayout);
        if (this.f109653i == null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            frameLayout2.setVisibility(8);
            this.f109653i = frameLayout2;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            GestaltSpinner gestaltSpinner = new GestaltSpinner(6, context2, attributeSet);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            gestaltSpinner.setLayoutParams(layoutParams);
            kh2.s0.w(gestaltSpinner, f2.f109191s);
            FrameLayout frameLayout3 = this.f109653i;
            if (frameLayout3 != null) {
                frameLayout3.addView(gestaltSpinner);
            }
        }
    }

    public static final void b(x2 x2Var, String str) {
        tc0 filterTab;
        h32.g0 g0Var = x2Var.f109649e;
        int i13 = g0Var == null ? -1 : t2.f109553a[g0Var.ordinal()];
        xc0 xc0Var = null;
        m32.c relatedPinsTabType = i13 != 1 ? i13 != 2 ? null : m32.c.HAIR_PATTERN : m32.c.SKIN_TONE;
        if (relatedPinsTabType != null) {
            p01.j jVar = x2Var.f109646b;
            if (jVar != null) {
                p01.n nVar = (p01.n) jVar;
                Intrinsics.checkNotNullParameter(relatedPinsTabType, "relatedPinsTabType");
                qc0 qc0Var = new qc0(0);
                Integer valueOf = Integer.valueOf(relatedPinsTabType.getValue());
                qc0Var.f41269h = valueOf;
                boolean[] zArr = qc0Var.f41270i;
                if (zArr.length > 7) {
                    zArr[7] = true;
                }
                tc0 tc0Var = new tc0(qc0Var.f41262a, qc0Var.f41263b, qc0Var.f41264c, qc0Var.f41265d, qc0Var.f41266e, qc0Var.f41267f, qc0Var.f41268g, valueOf, zArr, 0);
                Intrinsics.checkNotNullExpressionValue(tc0Var, "build(...)");
                if (str != null) {
                    uc0 uc0Var = new uc0(0);
                    uc0Var.f42512d = str;
                    boolean[] zArr2 = uc0Var.f42513e;
                    if (zArr2.length > 3) {
                        zArr2[3] = true;
                    }
                    filterTab = tc0Var;
                    xc0Var = new xc0(uc0Var.f42509a, uc0Var.f42510b, uc0Var.f42511c, str, zArr2, 0);
                } else {
                    filterTab = tc0Var;
                }
                Intrinsics.checkNotNullParameter(filterTab, "filterTab");
                LinkedHashMap linkedHashMap = nVar.f98392h;
                if (xc0Var == null) {
                    linkedHashMap.remove(filterTab);
                } else {
                    linkedHashMap.put(filterTab, xc0Var);
                }
            }
            if (jVar != null) {
                ((p01.n) jVar).c();
            }
        }
    }

    public static void e(FrameLayout frameLayout) {
        ViewParent parent = frameLayout.getParent();
        if (parent != null) {
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(frameLayout);
            }
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return this.f109649e;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return false;
    }
}
