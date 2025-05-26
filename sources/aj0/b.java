package aj0;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import bc2.k;
import bc2.q;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hk0;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.xk;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.ui.brio.view.RoundedCornersImageView;
import h32.f1;
import h32.i0;
import h32.r;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import ku1.l;
import m60.w;
import nx.d0;
import pb0.g;
import pk.a0;
import u50.i;
import x02.i2;
import x02.x2;
import yk1.n;

/* loaded from: classes5.dex */
public class b extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f15410a;

    /* renamed from: b, reason: collision with root package name */
    public final uk1.d f15411b;

    /* renamed from: c, reason: collision with root package name */
    public final w f15412c;

    /* renamed from: d, reason: collision with root package name */
    public final pb0.a f15413d;

    /* renamed from: e, reason: collision with root package name */
    public final i2 f15414e;

    /* renamed from: f, reason: collision with root package name */
    public final x2 f15415f;

    /* renamed from: g, reason: collision with root package name */
    public final l f15416g;

    /* renamed from: h, reason: collision with root package name */
    public xk f15417h;

    /* renamed from: i, reason: collision with root package name */
    public r f15418i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(uk1.d presenterPinalytics, w eventManager, i2 pinRepository, x2 userRepository, l uriNavigator) {
        super(0);
        g clock = g.f99432a;
        Intrinsics.checkNotNullParameter("homefeed_bubble", "referrerSource");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(uriNavigator, "uriNavigator");
        this.f15410a = "homefeed_bubble";
        this.f15411b = presenterPinalytics;
        this.f15412c = eventManager;
        this.f15413d = clock;
        this.f15414e = pinRepository;
        this.f15415f = userRepository;
        this.f15416g = uriNavigator;
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        String g13;
        q videoTracks;
        zi0.a view = (zi0.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        xk xkVar = this.f15417h;
        if (xkVar != null) {
            String title = xkVar.n();
            if (title != null) {
                Intrinsics.checkNotNullParameter(title, "title");
                GestaltText gestaltText = ((bj0.g) view).f22956c;
                if (gestaltText != null) {
                    a0.p(gestaltText, title);
                }
            }
            String imageUrl = n10.b.b(xkVar);
            i placeholderColor = n10.b.d(xkVar, zi0.c.f141997a);
            bj0.g gVar = (bj0.g) view;
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(placeholderColor, "placeholderColor");
            RoundedCornersImageView roundedCornersImageView = gVar.f22955b;
            if (roundedCornersImageView != null) {
                Context context = gVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                roundedCornersImageView.V1(imageUrl, (r18 & 2) != 0, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : new ColorDrawable(((Number) placeholderColor.a(context)).intValue()), (r18 & 64) != 0 ? null : null, null);
            }
            Intrinsics.checkNotNullParameter(this, "listener");
            gVar.f22954a = this;
            String str = xkVar.f43730v;
            if (str != null && str.length() != 0) {
                String str2 = xkVar.f43730v;
                Intrinsics.checkNotNullExpressionValue(str2, "getVideoCoverPinId(...)");
                f30 f30Var = (f30) this.f15414e.O(str2);
                if (f30Var != null && (videoTracks = dl2.b.S0(f30Var, null)) != null) {
                    i0 generateLoggingContext = this.f15411b.generateLoggingContext();
                    Intrinsics.checkNotNullExpressionValue(generateLoggingContext, "generateLoggingContext(...)");
                    String uid = f30Var.getUid();
                    Intrinsics.f(uid);
                    Intrinsics.checkNotNullParameter(uid, "uid");
                    Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
                    k kVar = new k(uid, videoTracks.a(), generateLoggingContext.f67081a, generateLoggingContext.f67082b, videoTracks, null);
                    HashMap hashMap = new HashMap();
                    String uid2 = f30Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                    hashMap.put("pin_id", uid2);
                    String i03 = b40.i0(f30Var);
                    if (i03 != null && i03.length() != 0) {
                        hashMap.put(SbaPinRep.AUX_DATA_VIDEO_ID, i03);
                    }
                    view.k1(kVar, hashMap);
                }
            }
            String str3 = xkVar.f43721m;
            if (str3 == null || str3.length() == 0) {
                gVar.g();
            } else {
                String str4 = xkVar.f43721m;
                Intrinsics.checkNotNullExpressionValue(str4, "getCuratorUid(...)");
                xj2.c F = this.f15415f.L(str4).F(new dh0.a(21, new a(view, 0)), new dh0.a(22, new a(view, 1)), ck2.i.f27923c, ck2.i.f27924d);
                Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
                addDisposable(F);
            }
            ih ihVar = xkVar.f43728t;
            if (ihVar == null || (g13 = ihVar.g()) == null) {
                return;
            }
            view.h(g13);
        }
    }

    public void p3() {
        ih ihVar;
        d0 d0Var = this.f15411b.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        f1 f1Var = f1.BUBBLE_OPEN;
        xk xkVar = this.f15417h;
        String str = null;
        d0.v(d0Var, f1Var, xkVar != null ? xkVar.getUid() : null, false, 12);
        xk xkVar2 = this.f15417h;
        if (xkVar2 != null && (ihVar = xkVar2.f43728t) != null) {
            str = ihVar.e();
        }
        String actionUri = str;
        xk xkVar3 = this.f15417h;
        if (xkVar3 != null) {
            Integer j13 = xkVar3.j();
            Intrinsics.checkNotNullExpressionValue(j13, "getStoryCategory(...)");
            int intValue = j13.intValue();
            int value = hk0.BUBBLE_DAILY_ROUNDUP.getValue();
            int value2 = hk0.BUBBLE_RANDOM.getValue();
            w wVar = this.f15412c;
            if ((intValue <= value2 && value <= intValue) || intValue == hk0.TRENDING_TOPIC_CATEGORY.getValue() || intValue == hk0.TRENDING_TOPIC_EVERYTHING.getValue() || intValue == hk0.SEASONAL_SEARCH.getValue() || intValue == hk0.SEASONAL_UPSELL.getValue()) {
                String uid = xkVar3.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                String n13 = xkVar3.n();
                Intrinsics.checkNotNullExpressionValue(n13, "getTitle(...)");
                NavigationImpl z03 = Navigation.z0((ScreenLocation) com.pinterest.screens.i.f50922b.getValue(), n13);
                z03.m0("com.pinterest.EXTRA_SEARCH_ARTICLE", uid);
                z03.m0("com.pinterest.EXTRA_SEARCH_REFERRING_SOURCE", this.f15410a);
                wVar.d(z03);
                return;
            }
            if (actionUri == null) {
                wVar.d(Navigation.z0((ScreenLocation) com.pinterest.screens.i.f50921a.getValue(), xkVar3.getUid()));
                return;
            }
            bj0.g gVar = (bj0.g) ((zi0.a) getView());
            gVar.getClass();
            Intrinsics.checkNotNullParameter(actionUri, "actionUri");
            l uriNavigator = this.f15416g;
            Intrinsics.checkNotNullParameter(uriNavigator, "uriNavigator");
            Context context = gVar.getContext();
            Intrinsics.f(context);
            l.b(uriNavigator, context, actionUri, true, false, null, null, 96);
        }
    }
}
