package wl1;

import android.content.Context;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.bannerOverlay.GestaltBannerOverlay;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130194i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f130195j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ GestaltBannerOverlay f130196k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(GestaltBannerOverlay gestaltBannerOverlay, c cVar, int i13) {
        super(1);
        this.f130194i = i13;
        this.f130196k = gestaltBannerOverlay;
        this.f130195j = cVar;
    }

    public final void b(rn1.a it) {
        int i13 = this.f130194i;
        c cVar = this.f130195j;
        GestaltBannerOverlay gestaltBannerOverlay = this.f130196k;
        switch (i13) {
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                if (gestaltBannerOverlay.f49308b == null && cVar.f130179a.f108855m == fm1.c.VISIBLE) {
                    Context context = gestaltBannerOverlay.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    GestaltText gestaltText = new GestaltText(context, cVar.f130179a);
                    gestaltBannerOverlay.f49309c = gestaltText.getId();
                    gestaltBannerOverlay.f49308b = gestaltText;
                    gestaltBannerOverlay.addView(gestaltText);
                }
                GestaltText gestaltText2 = gestaltBannerOverlay.f49308b;
                if (gestaltText2 != null) {
                    gestaltText2.i(new k(cVar, gestaltBannerOverlay));
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                al1.n nVar = GestaltBannerOverlay.f49304m;
                gestaltBannerOverlay.T().i(new j(cVar, 2));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f130194i;
        int i14 = 1;
        c cVar = this.f130195j;
        GestaltBannerOverlay gestaltBannerOverlay = this.f130196k;
        switch (i13) {
            case 0:
                c newState = (c) obj;
                Intrinsics.checkNotNullParameter(newState, "newState");
                al1.n nVar = GestaltBannerOverlay.f49304m;
                gestaltBannerOverlay.Z(cVar, newState);
                break;
            case 1:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                rn1.a aVar = cVar.f130179a;
                Context context = gestaltBannerOverlay.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Intrinsics.checkNotNullParameter(context, "<this>");
                break;
            case 2:
                om1.c it2 = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (gestaltBannerOverlay.f49317k == null && cVar.f130183e.f96642d == fm1.c.VISIBLE) {
                    Context context2 = gestaltBannerOverlay.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    GestaltIconButton gestaltIconButton = new GestaltIconButton(context2, cVar.f130183e);
                    gestaltBannerOverlay.f49318l = gestaltIconButton.getId();
                    gestaltBannerOverlay.f49317k = gestaltIconButton;
                    gestaltBannerOverlay.addView(gestaltIconButton);
                }
                GestaltIconButton gestaltIconButton2 = gestaltBannerOverlay.f49317k;
                if (gestaltIconButton2 != null) {
                    gestaltIconButton2.t(new j(cVar, 1));
                }
                break;
            case 3:
                h it3 = (h) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                h hVar = cVar.f130182d;
                al1.n nVar2 = GestaltBannerOverlay.f49304m;
                gestaltBannerOverlay.getClass();
                if (hVar instanceof e) {
                    if (gestaltBannerOverlay.f49313g == null) {
                        float dimension = gestaltBannerOverlay.getResources().getDimension(eo1.c.rounding_100);
                        gestaltBannerOverlay.f49314h = t.bannerOverlay_image;
                        WebImageView webImageView = new WebImageView(gestaltBannerOverlay.getContext());
                        webImageView.setId(gestaltBannerOverlay.f49314h);
                        gestaltBannerOverlay.addView(webImageView);
                        webImageView.g2(dimension, dimension, dimension, dimension);
                        gestaltBannerOverlay.f49313g = webImageView;
                    }
                    WebImageView webImageView2 = gestaltBannerOverlay.f49313g;
                    if (webImageView2 != null) {
                        webImageView2.loadUrl(((e) hVar).f130188a);
                        webImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        webImageView2.setVisibility(0);
                    }
                    WebImageView webImageView3 = gestaltBannerOverlay.f49313g;
                    if (webImageView3 != null) {
                        webImageView3.setLayoutParams(new ConstraintLayout.LayoutParams(gestaltBannerOverlay.getResources().getDimensionPixelSize(eo1.c.space_1000), gestaltBannerOverlay.getResources().getDimensionPixelSize(eo1.c.space_1000)));
                    }
                } else if (hVar instanceof d) {
                    if (gestaltBannerOverlay.f49311e == null) {
                        gestaltBannerOverlay.f49312f = t.bannerOverlay_icon;
                        Context context3 = gestaltBannerOverlay.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        GestaltIcon gestaltIcon = new GestaltIcon(context3);
                        gestaltBannerOverlay.addView(gestaltIcon);
                        gestaltBannerOverlay.f49311e = gestaltIcon;
                    }
                    GestaltIcon gestaltIcon2 = gestaltBannerOverlay.f49311e;
                    if (gestaltIcon2 != null) {
                        dl2.b.z(gestaltIcon2, new com.pinterest.framework.screens.q(7, hVar, gestaltBannerOverlay));
                    }
                } else if (hVar instanceof f) {
                    if (gestaltBannerOverlay.f49311e == null) {
                        gestaltBannerOverlay.f49312f = t.bannerOverlay_icon;
                        Context context4 = gestaltBannerOverlay.getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                        GestaltIcon gestaltIcon3 = new GestaltIcon(context4);
                        gestaltBannerOverlay.addView(gestaltIcon3);
                        gestaltBannerOverlay.f49311e = gestaltIcon3;
                    }
                    GestaltIcon gestaltIcon4 = gestaltBannerOverlay.f49311e;
                    if (gestaltIcon4 != null) {
                        dl2.b.z(gestaltIcon4, new b(gestaltBannerOverlay, i14));
                    }
                } else {
                    boolean z13 = hVar instanceof g;
                }
                break;
            case 4:
                fm1.c it4 = (fm1.c) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                gestaltBannerOverlay.setVisibility(cVar.f130185g.getVisibility());
                break;
            case 5:
                b((rn1.a) obj);
                break;
            case 6:
                b((rn1.a) obj);
                break;
            default:
                cm1.d it5 = (cm1.d) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                if (gestaltBannerOverlay.f49315i == null && cVar.f130181c.f28017f == fm1.c.VISIBLE) {
                    Context context5 = gestaltBannerOverlay.getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                    GestaltButtonGroup gestaltButtonGroup = new GestaltButtonGroup(context5, cVar.f130181c);
                    gestaltBannerOverlay.f49316j = gestaltButtonGroup.getId();
                    gestaltBannerOverlay.f49315i = gestaltButtonGroup;
                    gestaltBannerOverlay.addView(gestaltButtonGroup);
                }
                GestaltButtonGroup gestaltButtonGroup2 = gestaltBannerOverlay.f49315i;
                if (gestaltButtonGroup2 != null) {
                    gestaltButtonGroup2.a(new j(cVar, 0));
                }
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(c cVar, GestaltBannerOverlay gestaltBannerOverlay) {
        super(1);
        this.f130194i = 1;
        this.f130195j = cVar;
        this.f130196k = gestaltBannerOverlay;
    }
}
