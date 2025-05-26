package ql1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.p;
import bi1.a0;
import com.google.firebase.messaging.q;
import com.pinterest.gestalt.attribution.GestaltAttribution;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import e0.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.f0;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f104070i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltAttribution f104071j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(GestaltAttribution gestaltAttribution, int i13) {
        super(1);
        this.f104070i = i13;
        this.f104071j = gestaltAttribution;
    }

    public final gm1.c b(Unit it) {
        int i13 = this.f104070i;
        GestaltAttribution gestaltAttribution = this.f104071j;
        switch (i13) {
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                return new h(gestaltAttribution.getId());
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return new i(gestaltAttribution.getId());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        d bVar;
        int i13 = this.f104070i;
        int i14 = 7;
        int i15 = 6;
        GestaltAttribution gestaltAttribution = this.f104071j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                fm1.c cVar = GestaltAttribution.f49243f;
                gestaltAttribution.getClass();
                if ($receiver.getBoolean(o.GestaltAttribution_gestalt_attributionIsSponsored, false)) {
                    String string = $receiver.getString(o.GestaltAttribution_gestalt_attributionPinnerName);
                    str = string != null ? string : "";
                    bVar = new c(ep.b.x(str, "string", str), $receiver.getBoolean(o.GestaltAttribution_gestalt_attributionShowSponsoredLabelIcon, false));
                } else {
                    String string2 = $receiver.getString(o.GestaltAttribution_gestalt_attributionPinnerName);
                    str = string2 != null ? string2 : "";
                    f0 x13 = ep.b.x(str, "string", str);
                    boolean z13 = $receiver.getBoolean(o.GestaltAttribution_gestalt_attributionShowAvatar, false);
                    int i16 = o.GestaltAttribution_gestalt_attributionPinnerType;
                    f fVar = f.PINNER;
                    int i17 = $receiver.getInt(i16, -1);
                    if (i17 >= 0) {
                        fVar = f.values()[i17];
                    }
                    bVar = new b(x13, fVar, z13, $receiver.getString(o.GestaltAttribution_gestalt_attributionPinnerImageUrl));
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter((gm1.a) obj, "it");
                fm1.c cVar2 = GestaltAttribution.f49243f;
                gestaltAttribution.getClass();
                a aVar = new a(gestaltAttribution, 5);
                a aVar2 = new a(gestaltAttribution, i15);
                q qVar = gestaltAttribution.f49244a;
                qVar.F(aVar, aVar2);
                qVar.I(im1.m.f72670p, new a(gestaltAttribution, i14));
                break;
            case 2:
                d variant = (d) obj;
                Intrinsics.checkNotNullParameter(variant, "variant");
                fm1.c cVar3 = GestaltAttribution.f49243f;
                int i18 = 29;
                pp2.a.k(gestaltAttribution.L(), new a0(variant, 29));
                boolean z14 = variant instanceof b;
                p pVar = gestaltAttribution.f49248e;
                if (z14) {
                    b bVar2 = (b) variant;
                    if (bVar2.f104073c) {
                        if (gestaltAttribution.f49246c == null) {
                            Context context = gestaltAttribution.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                            GestaltAvatar gestaltAvatar = new GestaltAvatar(6, context, (AttributeSet) null);
                            t.g(gestaltAvatar, g.f104082k);
                            gestaltAttribution.f49246c = gestaltAvatar;
                            int G0 = dl2.b.G0(gestaltAttribution, eo1.a.comp_attribution_avatar_top_margin);
                            pVar.l(gestaltAvatar.getId(), 6, 0, 6);
                            gestaltAttribution.f49248e.m(gestaltAvatar.getId(), 3, 0, 3, G0);
                            pVar.l(gestaltAvatar.getId(), 4, 0, 4);
                            pVar.n(gestaltAvatar.getId(), -2);
                            pVar.o(gestaltAvatar.getId(), -2);
                            pVar.g(gestaltAttribution.L().getId());
                            gestaltAttribution.f49248e.m(gestaltAttribution.L().getId(), 6, gestaltAvatar.getId(), 7, bs1.c.W(gestaltAttribution, eo1.c.space_100));
                            pVar.l(gestaltAttribution.L().getId(), 7, 0, 7);
                            pVar.l(gestaltAttribution.L().getId(), 3, 0, 3);
                            pVar.l(gestaltAttribution.L().getId(), 4, 0, 4);
                            pVar.J(gestaltAttribution.L().getId(), 0.5f);
                            pVar.n(gestaltAttribution.L().getId(), -2);
                            pVar.o(gestaltAttribution.L().getId(), -1);
                            gestaltAttribution.addView(gestaltAvatar);
                            pVar.b(gestaltAttribution);
                        }
                        GestaltAvatar gestaltAvatar2 = gestaltAttribution.f49246c;
                        if (gestaltAvatar2 != null) {
                            t.g(gestaltAvatar2, new com.pinterest.framework.screens.q(3, bVar2, gestaltAttribution));
                        }
                    }
                    f fVar2 = f.PINNER;
                    f fVar3 = bVar2.f104072b;
                    if (fVar3 != fVar2) {
                        boolean z15 = fVar3 == f.VERIFIED_PINNER;
                        pp2.a.k(gestaltAttribution.L(), new fd1.h(z15, i18));
                        gestaltAttribution.setContentDescription(bs1.c.f2(gestaltAttribution, z15 ? n.attribution_non_sponsored_verified_pinner_content_description : n.attribution_non_sponsored_verified_merchant_content_description));
                    } else {
                        gestaltAttribution.setContentDescription(bs1.c.f2(gestaltAttribution, n.attribution_non_sponsored_pinner_content_description));
                    }
                } else if (variant instanceof c) {
                    c cVar4 = (c) variant;
                    if (gestaltAttribution.f49247d == null) {
                        Context context2 = gestaltAttribution.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        GestaltText gestaltText = new GestaltText(6, context2, (AttributeSet) null);
                        pp2.a.k(gestaltText, new a0(cVar4, 28));
                        gestaltAttribution.f49247d = gestaltText;
                        pVar.l(gestaltText.getId(), 6, gestaltAttribution.L().getId(), 6);
                        pVar.l(gestaltText.getId(), 3, gestaltAttribution.L().getId(), 4);
                        pVar.n(gestaltText.getId(), -2);
                        pVar.o(gestaltText.getId(), -2);
                        gestaltAttribution.addView(gestaltText);
                        pVar.b(gestaltAttribution);
                    }
                    GestaltText gestaltText2 = gestaltAttribution.f49247d;
                    if (gestaltText2 != null) {
                        pp2.a.k(gestaltText2, g.f104081j);
                    }
                    gestaltAttribution.setContentDescription(bs1.c.f2(gestaltAttribution, n.attribution_sponsored_content_description));
                }
                break;
            case 3:
                fm1.c it = (fm1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                gestaltAttribution.setVisibility(it.getVisibility());
                break;
            case 4:
                gestaltAttribution.setId(((Number) obj).intValue());
                break;
            case 5:
                Intrinsics.checkNotNullParameter((Unit) obj, "it");
                fm1.c cVar5 = GestaltAttribution.f49243f;
                gestaltAttribution.getClass();
                break;
        }
        return b((Unit) obj);
    }
}
