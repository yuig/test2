package em1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.h0;
import u50.i0;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f59609i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f59610j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ GestaltCheckBox f59611k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(GestaltCheckBox gestaltCheckBox, d dVar) {
        super(1);
        this.f59611k = gestaltCheckBox;
        this.f59610j = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f59609i;
        GestaltCheckBox gestaltCheckBox = this.f59611k;
        d dVar = this.f59610j;
        switch (i13) {
            case 0:
                d newState = (d) obj;
                Intrinsics.checkNotNullParameter(newState, "newState");
                b bVar = GestaltCheckBox.f49354f;
                gestaltCheckBox.X(dVar, newState);
                break;
            default:
                i0 it = (i0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                i0 i0Var = dVar.f59601d;
                h0 h0Var = h0.f120562a;
                if (!Intrinsics.d(i0Var, h0Var)) {
                    e eVar = gestaltCheckBox.a0().f59599b;
                    if (gestaltCheckBox.f49364e == null && !Intrinsics.d(it, h0Var)) {
                        Context context = gestaltCheckBox.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
                        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
                        layoutParams.W = true;
                        layoutParams.X = true;
                        gestaltText.setLayoutParams(layoutParams);
                        pp2.a.k(gestaltText, i.f59622o);
                        gestaltCheckBox.addView(gestaltText);
                        androidx.constraintlayout.widget.p pVar = new androidx.constraintlayout.widget.p();
                        pVar.j(gestaltCheckBox);
                        int id3 = gestaltText.getId();
                        View view = gestaltCheckBox.f49363d;
                        if (view == null) {
                            view = gestaltCheckBox.Z();
                        }
                        pVar.l(id3, 6, view.getId(), 6);
                        pVar.m(gestaltText.getId(), 7, 0, 7, ml2.c.c(dl2.b.E0(gestaltCheckBox, eo1.a.comp_checkbox_horizontal_gap)));
                        int id4 = gestaltText.getId();
                        View view2 = gestaltCheckBox.f49363d;
                        if (view2 == null) {
                            view2 = gestaltCheckBox.Z();
                        }
                        pVar.m(id4, 3, view2.getId(), 4, ml2.c.c(dl2.b.E0(gestaltCheckBox, eo1.a.space_100)));
                        pVar.H(gestaltText.getId(), 0.0f);
                        pVar.b(gestaltCheckBox);
                        gestaltCheckBox.f49364e = gestaltText;
                    }
                    GestaltText gestaltText2 = gestaltCheckBox.f49364e;
                    if (gestaltText2 != null) {
                        pp2.a.k(gestaltText2, new ed1.m(it, gestaltCheckBox, eVar, 27));
                    }
                }
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, GestaltCheckBox gestaltCheckBox) {
        super(1);
        this.f59610j = dVar;
        this.f59611k = gestaltCheckBox;
    }
}
