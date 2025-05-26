package wl1;

import android.content.res.TypedArray;
import com.pinterest.gestalt.bannerOverlay.GestaltBannerOverlay;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.f0;
import u50.h0;
import u50.i0;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130177i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltBannerOverlay f130178j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(GestaltBannerOverlay gestaltBannerOverlay, int i13) {
        super(1);
        this.f130177i = i13;
        this.f130178j = gestaltBannerOverlay;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f130177i;
        GestaltBannerOverlay gestaltBannerOverlay = this.f130178j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                al1.n nVar = GestaltBannerOverlay.f49304m;
                gestaltBannerOverlay.getClass();
                String string = $receiver.getString(u.GestaltBannerOverlay_gestalt_bannerOverlayTitleText);
                f0 x13 = string != null ? ep.b.x(string, "string", string) : null;
                int i14 = u.GestaltBannerOverlay_gestalt_bannerOverlayMessageText;
                Intrinsics.checkNotNullParameter($receiver, "<this>");
                String string2 = $receiver.getString(i14);
                i0 f0Var = string2 != null ? new f0(string2) : h0.f120562a;
                String string3 = $receiver.getString(u.GestaltBannerOverlay_gestalt_bannerOverlayPrimaryActionText);
                f0 h23 = string3 != null ? bs1.c.h2(string3) : null;
                String string4 = $receiver.getString(u.GestaltBannerOverlay_gestalt_bannerOverlaySecondaryActionText);
                f0 h24 = string4 != null ? bs1.c.h2(string4) : null;
                boolean z13 = $receiver.getBoolean(u.GestaltBannerOverlay_gestalt_bannerOverlayDismissible, true);
                boolean z14 = $receiver.getBoolean(u.GestaltBannerOverlay_gestalt_bannerOverlayTitleSupportsLinks, false);
                boolean z15 = $receiver.getBoolean(u.GestaltBannerOverlay_gestalt_bannerOverlayMessageSupportsLinks, false);
                int id3 = gestaltBannerOverlay.getId();
                fm1.c Y = d7.b.Y($receiver, u.GestaltBannerOverlay_android_visibility, GestaltBannerOverlay.f49306o);
                rm1.q b13 = rm1.r.b($receiver, u.GestaltBannerOverlay_gestalt_bannerOverlay_iconIcon);
                int i15 = $receiver.getInt(u.GestaltBannerOverlay_gestalt_bannerOverlay_iconColor, -1);
                break;
            case 1:
                rm1.k bind = (rm1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                rm1.f iconAndSize = new rm1.f(rm1.q.PINTEREST, rm1.i.MD);
                bind.getClass();
                Intrinsics.checkNotNullParameter(iconAndSize, "iconAndSize");
                bind.f108709a = iconAndSize;
                bind.c(fm1.c.VISIBLE);
                bind.a(rm1.c.BRAND);
                bind.f108712d = gestaltBannerOverlay.f49312f;
                break;
            default:
                ((Number) obj).intValue();
                if (gestaltBannerOverlay.L().f130184f != Integer.MIN_VALUE) {
                    gestaltBannerOverlay.setId(gestaltBannerOverlay.L().f130184f);
                }
                break;
        }
        return Unit.f80348a;
    }
}
