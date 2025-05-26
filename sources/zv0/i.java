package zv0;

import android.widget.ImageView;
import com.pinterest.api.model.tp;
import com.pinterest.feature.ideaPinCreation.common.view.IdeaPinEditablePageLite;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import p1.v0;

/* loaded from: classes5.dex */
public final class i extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142876i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f142877j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, int i13) {
        super(1);
        this.f142876i = i13;
        this.f142877j = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yv0.c cVar;
        tp tpVar;
        int i13 = this.f142876i;
        j jVar = this.f142877j;
        switch (i13) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                vv0.e eVar = jVar.f142884f1;
                if (eVar != null && (tpVar = (cVar = (yv0.c) eVar).f140213n) != null) {
                    cVar.f140213n = tpVar.b0(cVar.f140215p, new v0(8, floatValue));
                    cVar.G3();
                }
                IdeaPinEditablePageLite ideaPinEditablePageLite = jVar.G0;
                if (ideaPinEditablePageLite == null) {
                    Intrinsics.r("pageView");
                    throw null;
                }
                ideaPinEditablePageLite.z0();
                ImageView imageView = jVar.H0;
                if (imageView != null) {
                    imageView.setSelected(false);
                    return Unit.f80348a;
                }
                Intrinsics.r("speedButton");
                throw null;
            default:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                CharSequence text = jVar.getResources().getText(aq1.h.idea_pin_trimming_helper_text);
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                return rn1.a.y(it, bs1.c.h2(text), vn1.c.SUBTLE, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
        }
    }
}
