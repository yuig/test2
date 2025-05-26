package an1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.pinterest.gestalt.radioGroup.GestaltRadioButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pk.a0;
import u50.g0;
import u50.i0;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15720i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltRadioButton f15721j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(GestaltRadioButton gestaltRadioButton, int i13) {
        super(1);
        this.f15720i = i13;
        this.f15721j = gestaltRadioButton;
    }

    public final void b(i0 imageUrl) {
        int i13 = this.f15720i;
        GestaltRadioButton gestaltRadioButton = this.f15721j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                Context context = gestaltRadioButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (bs1.c.i1(imageUrl, context) && gestaltRadioButton.f49483b == null) {
                    WebImageView webImageView = new WebImageView(gestaltRadioButton.getContext());
                    webImageView.setId(bn1.b.radio_button_image);
                    webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    webImageView.setContentDescription(webImageView.getContext().getString(sm1.c.content_description_image_pds));
                    gestaltRadioButton.f49486e.m(webImageView.getId(), 6, gestaltRadioButton.T().getId(), 7, dl2.b.G0(webImageView, eo1.a.comp_radiogroup_button_horizontal_gap));
                    int id3 = webImageView.getId();
                    androidx.constraintlayout.widget.p pVar = gestaltRadioButton.f49486e;
                    pVar.l(id3, 3, 0, 3);
                    gestaltRadioButton.f49486e.m(gestaltRadioButton.L().getId(), 6, webImageView.getId(), 7, dl2.b.G0(webImageView, eo1.a.comp_radiogroup_button_horizontal_gap));
                    pVar.o(webImageView.getId(), dl2.b.G0(webImageView, eo1.a.comp_radiogroup_button_image_width));
                    pVar.n(webImageView.getId(), dl2.b.G0(webImageView, eo1.a.comp_radiogroup_button_image_height));
                    pVar.o(gestaltRadioButton.L().getId(), 0);
                    pVar.n(gestaltRadioButton.L().getId(), -2);
                    gestaltRadioButton.addView(webImageView);
                    pVar.b(gestaltRadioButton);
                    gestaltRadioButton.f49483b = webImageView;
                }
                Context context2 = gestaltRadioButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                if (!bs1.c.e1(imageUrl, context2)) {
                    WebImageView webImageView2 = gestaltRadioButton.f49483b;
                    if (webImageView2 != null) {
                        Context context3 = gestaltRadioButton.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        float D0 = dl2.b.D0(context3, eo1.a.comp_radiogroup_button_image_rounding);
                        webImageView2.g2(D0, D0, D0, D0);
                    }
                    WebImageView webImageView3 = gestaltRadioButton.f49483b;
                    if (webImageView3 != null) {
                        Context context4 = gestaltRadioButton.getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                        webImageView3.loadUrl(imageUrl.a(context4).toString());
                    }
                    WebImageView webImageView4 = gestaltRadioButton.f49483b;
                    if (webImageView4 != null) {
                        bs1.c.U1(webImageView4);
                        break;
                    }
                } else {
                    WebImageView webImageView5 = gestaltRadioButton.f49483b;
                    if (webImageView5 != null) {
                        bs1.c.X0(webImageView5);
                        break;
                    }
                }
                break;
            case 6:
                Intrinsics.checkNotNullParameter(imageUrl, "labelText");
                int i14 = GestaltRadioButton.f49481g;
                a0.q(gestaltRadioButton.L(), imageUrl);
                break;
            default:
                Intrinsics.checkNotNullParameter(imageUrl, "subTextValue");
                Context context5 = gestaltRadioButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                if (bs1.c.i1(imageUrl, context5) && gestaltRadioButton.f49485d == null) {
                    Context context6 = gestaltRadioButton.getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                    GestaltText gestaltText = new GestaltText(6, context6, (AttributeSet) null);
                    pp2.a.k(gestaltText, c.f15706n);
                    int id4 = gestaltText.getId();
                    int id5 = gestaltRadioButton.L().getId();
                    androidx.constraintlayout.widget.p pVar2 = gestaltRadioButton.f49486e;
                    pVar2.l(id4, 6, id5, 6);
                    gestaltRadioButton.f49486e.m(gestaltText.getId(), 3, gestaltRadioButton.L().getId(), 4, dl2.b.G0(gestaltText, eo1.a.comp_radiogroup_button_vertical_gap));
                    pVar2.o(gestaltText.getId(), 0);
                    pVar2.n(gestaltText.getId(), -2);
                    gestaltRadioButton.addView(gestaltText);
                    pVar2.b(gestaltRadioButton);
                    gestaltRadioButton.f49485d = gestaltText;
                }
                GestaltText gestaltText2 = gestaltRadioButton.f49485d;
                if (gestaltText2 != null) {
                    gestaltText2.i(new xm1.k(3, imageUrl, gestaltRadioButton));
                    break;
                }
                break;
        }
    }

    public final void e(boolean z13) {
        int i13 = this.f15720i;
        GestaltRadioButton gestaltRadioButton = this.f15721j;
        switch (i13) {
            case 3:
                int i14 = GestaltRadioButton.f49481g;
                kh2.d.l(gestaltRadioButton.T(), new mm1.i(z13, 1));
                break;
            default:
                int i15 = GestaltRadioButton.f49481g;
                kh2.d.l(gestaltRadioButton.T(), new mm1.i(z13, 2));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f15720i;
        GestaltRadioButton gestaltRadioButton = this.f15721j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                int i14 = GestaltRadioButton.f49481g;
                gestaltRadioButton.getClass();
                return new e(g0.c($receiver, bn1.d.GestaltRadioButton_gestalt_label), g0.c($receiver, bn1.d.GestaltRadioButton_gestalt_subText), g0.c($receiver, bn1.d.GestaltRadioButton_gestalt_imageUrl), $receiver.getBoolean(bn1.d.GestaltRadioButton_android_enabled, true), $receiver.getBoolean(bn1.d.GestaltRadioButton_android_checked, false), gestaltRadioButton.getId());
            case 1:
                gm1.a it = (gm1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i15 = GestaltRadioButton.f49481g;
                gestaltRadioButton.getClass();
                d dVar = new d(gestaltRadioButton, 8);
                gestaltRadioButton.f49487f.a(im1.l.f72657j, dVar);
                gestaltRadioButton.T().b(new gh1.e(gestaltRadioButton, 6));
                return Unit.f80348a;
            case 2:
                b((i0) obj);
                return Unit.f80348a;
            case 3:
                e(((Boolean) obj).booleanValue());
                return Unit.f80348a;
            case 4:
                gestaltRadioButton.setId(((Number) obj).intValue());
                return Unit.f80348a;
            case 5:
                e(((Boolean) obj).booleanValue());
                return Unit.f80348a;
            case 6:
                b((i0) obj);
                return Unit.f80348a;
            case 7:
                b((i0) obj);
                return Unit.f80348a;
            default:
                Unit it2 = (Unit) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return new g(gestaltRadioButton.getId());
        }
    }
}
