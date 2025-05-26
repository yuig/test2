package vl1;

import android.content.Context;
import android.content.res.TypedArray;
import com.pinterest.gestalt.banner.GestaltBanner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.f0;
import u50.h0;
import u50.i0;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126106i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltBanner f126107j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(GestaltBanner gestaltBanner, int i13) {
        super(1);
        this.f126106i = i13;
        this.f126107j = gestaltBanner;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        l hVar;
        int i13 = this.f126106i;
        GestaltBanner gestaltBanner = this.f126107j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                h0 h0Var = GestaltBanner.f49286o;
                gestaltBanner.getClass();
                String string = $receiver.getString(s.GestaltBanner_gestalt_bannerTitleText);
                c cVar = null;
                f0 h23 = string != null ? bs1.c.h2(string) : null;
                String string2 = $receiver.getString(s.GestaltBanner_gestalt_bannerMessageText);
                i0 h24 = string2 != null ? bs1.c.h2(string2) : h0.f120562a;
                String string3 = $receiver.getString(s.GestaltBanner_gestalt_bannerPrimaryActionText);
                i0 p23 = string3 != null ? bs1.c.p2(string3) : GestaltBanner.f49286o;
                String string4 = $receiver.getString(s.GestaltBanner_gestalt_bannerSecondaryActionText);
                i0 p24 = string4 != null ? bs1.c.p2(string4) : GestaltBanner.f49287p;
                boolean z13 = $receiver.getBoolean(s.GestaltBanner_gestalt_bannerDismissable, true);
                switch ($receiver.getInt(s.GestaltBanner_gestalt_bannerVariant, 0)) {
                    case 1:
                        hVar = new h(rm1.q.COG);
                        break;
                    case 2:
                        hVar = k.f126123d;
                        break;
                    case 3:
                        hVar = g.f126119d;
                        break;
                    case 4:
                        hVar = i.f126121d;
                        break;
                    case 5:
                        hVar = j.f126122d;
                        break;
                    case 6:
                        hVar = f.f126118d;
                        break;
                    default:
                        hVar = new e();
                        break;
                }
                l lVar = hVar;
                int i14 = $receiver.getInt(s.GestaltBanner_gestalt_bannerStyle, -1);
                b bVar = i14 >= 0 ? b.values()[i14] : GestaltBanner.f49289r;
                int id3 = gestaltBanner.getId();
                fm1.c Y = d7.b.Y($receiver, s.GestaltBanner_android_visibility, GestaltBanner.f49288q);
                if (p23 != null) {
                    Context context = gestaltBanner.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    if (!bs1.c.e1(p23, context)) {
                        cVar = new c(p23, p24);
                    }
                }
                return new d(h23, h24, z13, cVar, lVar, bVar, id3, Y);
            case 1:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Context context2 = gestaltBanner.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                rm1.m mVar = dl2.b.T1(context2) ? rm1.n.CANCEL : rm1.q.CANCEL;
                fm1.c cVar2 = fm1.c.VISIBLE;
                Context context3 = gestaltBanner.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                return om1.c.e(it, mVar, dl2.b.T1(context3) ? om1.e.MD : om1.e.SM, om1.f.TRANSPARENT_DARK_GRAY, cVar2, null, false, 0, 1008);
            default:
                fm1.c it2 = (fm1.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                gestaltBanner.setVisibility(it2.getVisibility());
                return Unit.f80348a;
        }
    }
}
