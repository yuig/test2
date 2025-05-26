package g31;

import com.pinterest.analytics.TrackingParamKeyBuilder;
import com.pinterest.api.model.PinFeed;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.i3;
import com.pinterest.screens.o4;
import h32.d4;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements np0.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackingParamKeyBuilder f63447b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f63448c;

    public /* synthetic */ f(Object obj, TrackingParamKeyBuilder trackingParamKeyBuilder, int i13) {
        this.f63446a = i13;
        this.f63448c = obj;
        this.f63447b = trackingParamKeyBuilder;
    }

    @Override // np0.f
    public final void I4(String pinUid, PinFeed pinFeed, int i13, int i14, String str) {
        switch (this.f63446a) {
            case 0:
                Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                Intrinsics.checkNotNullParameter(pinFeed, "pinFeed");
                String lowerCase = d4.FEED.toString().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                v4(pinUid, pinFeed, i13, i14, new i01.d(str, lowerCase, new ArrayList(e0.b(pinUid)), null));
                break;
            default:
                Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                Intrinsics.checkNotNullParameter(pinFeed, "pinFeed");
                String lowerCase2 = d4.FEED.toString().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                v4(pinUid, pinFeed, i13, i14, new i01.d(str, lowerCase2, new ArrayList(e0.b(pinUid)), null));
                break;
        }
    }

    @Override // np0.f
    public final void v4(String pinUid, PinFeed pinFeed, int i13, int i14, i01.e metadataProvider) {
        int i15 = this.f63446a;
        Object obj = this.f63448c;
        switch (i15) {
            case 0:
                Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                Intrinsics.checkNotNullParameter(pinFeed, "pinFeed");
                Intrinsics.checkNotNullParameter(metadataProvider, "metadataProvider");
                NavigationImpl z03 = Navigation.z0((ScreenLocation) i3.f50979m.getValue(), pinUid);
                String f13 = metadataProvider.f();
                String z13 = metadataProvider.z();
                int y13 = metadataProvider.y();
                ArrayList w13 = metadataProvider.w();
                g gVar = (g) obj;
                gVar.getClass();
                bs1.c.i(z03, pinFeed, i13, f13, z13, y13, w13, "user_pins", this.f63447b, null);
                z03.m0("com.pinterest.EXTRA_CLOSEUP_MODULE_SOURCE", metadataProvider.e());
                gVar.f63449a.d(z03);
                break;
            default:
                Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                Intrinsics.checkNotNullParameter(pinFeed, "pinFeed");
                Intrinsics.checkNotNullParameter(metadataProvider, "metadataProvider");
                NavigationImpl z04 = Navigation.z0((ScreenLocation) o4.f51173a.getValue(), pinUid);
                String f14 = metadataProvider.f();
                String z14 = metadataProvider.z();
                int y14 = metadataProvider.y();
                ArrayList w14 = metadataProvider.w();
                qd1.a aVar = (qd1.a) obj;
                aVar.getClass();
                bs1.c.i(z04, pinFeed, i13, f14, z14, y14, w14, "user_pins", this.f63447b, null);
                z04.m0("com.pinterest.EXTRA_CLOSEUP_MODULE_SOURCE", metadataProvider.e());
                aVar.f103573a.d(z04);
                break;
        }
    }
}
