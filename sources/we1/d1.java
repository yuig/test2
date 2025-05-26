package we1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.pinterest.api.model.bj;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d1 extends gg0.n0 implements re1.k {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f129322f = 0;

    /* renamed from: d, reason: collision with root package name */
    public GestaltButton.SmallSecondaryButton f129323d;

    /* renamed from: e, reason: collision with root package name */
    public String f129324e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(Context context) {
        super(context, 3);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        setGravity(17);
        setLayoutParams(layoutParams);
        if ((31 & 1) != 0) {
            lm1.b bVar = xe1.v.f134782a;
        }
        if ((31 & 2) != 0) {
            lm1.b bVar2 = xe1.v.f134782a;
        }
        int i13 = (31 & 4) != 0 ? xe1.v.D : 0;
        int i14 = (31 & 8) != 0 ? xe1.v.E : 0;
        int i15 = (31 & 16) != 0 ? xe1.v.H : 0;
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(i14);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(i13);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(i15);
        setPaddingRelative(dimensionPixelOffset3, dimensionPixelOffset2, dimensionPixelOffset3, dimensionPixelOffset);
    }

    @Override // re1.k
    public final void e(re1.j footerModel) {
        GestaltButton.SmallSecondaryButton smallSecondaryButton;
        bj bjVar;
        Intrinsics.checkNotNullParameter(footerModel, "footerModel");
        if (Intrinsics.d(this.f129324e, footerModel.f107608a)) {
            return;
        }
        removeAllViews();
        this.f129324e = footerModel.f107608a;
        re1.d dVar = footerModel.f107612e;
        re1.i iVar = footerModel.f107611d;
        if (dVar == null || (bjVar = footerModel.f107609b) == null || !bjVar.getShowUser()) {
            re1.e eVar = footerModel.f107610c;
            if (eVar != null) {
                i();
                String str = eVar.f107573a;
                if (str == null) {
                    str = getResources().getString(m60.x0.see_more);
                    Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
                }
                if (str.length() > 0 && (smallSecondaryButton = this.f129323d) != null) {
                    smallSecondaryButton.d(new d91.l(str, 25));
                }
                setOnClickListener(new z0(eVar, 1));
                eVar.f107577e.invoke();
                addView(this.f129323d);
            } else {
                GestaltButton.SmallSecondaryButton smallSecondaryButton2 = this.f129323d;
                if (smallSecondaryButton2 != null) {
                    pk.a0.l0(smallSecondaryButton2);
                }
                pk.a0.k1(this, getResources().getDimensionPixelOffset(iVar.f107603a));
            }
        } else {
            i();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            addView(pe.i.p(context, dVar));
            GestaltButton.SmallSecondaryButton smallSecondaryButton3 = this.f129323d;
            if (smallSecondaryButton3 != null) {
                pk.a0.l0(smallSecondaryButton3);
            }
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(iVar.f107606d);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(iVar.f107605c);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(iVar.f107607e);
        setPaddingRelative(dimensionPixelOffset3, dimensionPixelOffset2, dimensionPixelOffset3, dimensionPixelOffset);
        requestLayout();
    }

    public final void i() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltButton.SmallSecondaryButton smallSecondaryButton = new GestaltButton.SmallSecondaryButton(6, context, (AttributeSet) null);
        smallSecondaryButton.getLayoutParams();
        smallSecondaryButton.setGravity(17);
        this.f129323d = smallSecondaryButton;
    }
}
