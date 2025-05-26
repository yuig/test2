package e02;

import android.os.Parcelable;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hi0;
import com.pinterest.feature.board.BoardCreateOrPickerNavigation;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pin.RepinAnimationData;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.m3;
import df.j1;
import gp1.g;
import h32.a4;
import hk0.m;
import i32.l;
import i32.y0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k11.k;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import l11.j;
import l11.r;
import m60.w;
import net.quikkly.android.utils.BitmapUtils;
import rg0.s;
import zf0.f;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final s f56762a;

    /* renamed from: b, reason: collision with root package name */
    public final f f56763b;

    /* renamed from: c, reason: collision with root package name */
    public final w f56764c;

    /* renamed from: d, reason: collision with root package name */
    public final k f56765d;

    public a(s experiences, f educationHelper, w eventManager, k repinSessionDataManager) {
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(educationHelper, "educationHelper");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(repinSessionDataManager, "repinSessionDataManager");
        this.f56762a = experiences;
        this.f56763b = educationHelper;
        this.f56764c = eventManager;
        this.f56765d = repinSessionDataManager;
    }

    public static nl1.d a(a aVar, f30 f30Var, il1.a fragmentFactory, String pinCreateMethod, BoardCreateOrPickerNavigation boardCreateOrPickerNavigation, String str, String str2, String str3, String str4, String str5) {
        gp1.k kVar = gp1.k.UNKNOWN;
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        Intrinsics.checkNotNullParameter(pinCreateMethod, "pinCreateMethod");
        Intrinsics.checkNotNullParameter("offsite", "navigationOrigin");
        return b(aVar, f30Var, false, fragmentFactory, pinCreateMethod, boardCreateOrPickerNavigation, null, str, str2, str3, str4, null, str5, null, null, null, false, false, null, null, "offsite", kVar, null, 2585600);
    }

    public static nl1.d b(a aVar, f30 f30Var, boolean z13, il1.a fragmentFactory, String str, Parcelable parcelable, HashMap hashMap, String str2, String str3, String str4, String str5, String str6, String str7, String str8, g gVar, String str9, boolean z14, boolean z15, RepinAnimationData repinAnimationData, String str10, String str11, gp1.k kVar, d32.c cVar, int i13) {
        HashMap hashMap2;
        boolean z16;
        String str12;
        boolean z17;
        String str13;
        String navigationOrigin;
        String str14;
        String str15;
        RepinAnimationData repinAnimationData2;
        boolean z18;
        a aVar2;
        NavigationImpl navigationImpl;
        hi0 s63;
        String pwtPinCreateMethod = (i13 & 8) != 0 ? "repin" : str;
        Parcelable parcelable2 = (i13 & 16) != 0 ? null : parcelable;
        HashMap hashMap3 = (i13 & 32) != 0 ? null : hashMap;
        String str16 = (i13 & 64) != 0 ? null : str2;
        String str17 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : str3;
        String str18 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : str4;
        String str19 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : str5;
        String str20 = (i13 & 1024) != 0 ? null : str6;
        String str21 = (i13 & 2048) != 0 ? null : str7;
        String str22 = (i13 & 4096) != 0 ? null : str8;
        g gVar2 = (i13 & 8192) != 0 ? null : gVar;
        String str23 = (i13 & 16384) != 0 ? null : str9;
        if ((i13 & 32768) != 0) {
            hashMap2 = hashMap3;
            z16 = false;
        } else {
            hashMap2 = hashMap3;
            z16 = z14;
        }
        if ((i13 & 65536) != 0) {
            str12 = str16;
            z17 = false;
        } else {
            str12 = str16;
            z17 = z15;
        }
        g gVar3 = gVar2;
        RepinAnimationData repinAnimationData3 = (i13 & 131072) != 0 ? null : repinAnimationData;
        String str24 = (i13 & 262144) != 0 ? "TAP" : str10;
        if ((i13 & 524288) != 0) {
            str13 = str22;
            navigationOrigin = "other";
        } else {
            str13 = str22;
            navigationOrigin = str11;
        }
        gp1.k kVar2 = (i13 & 1048576) != 0 ? gp1.k.UNKNOWN : kVar;
        d32.c collageDraftEntryPointSource = (i13 & 2097152) != 0 ? d32.c.UNKNOWN : cVar;
        aVar.getClass();
        String str25 = str21;
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        String str26 = str20;
        Intrinsics.checkNotNullParameter(pwtPinCreateMethod, "pinCreateMethod");
        String str27 = str17;
        Intrinsics.checkNotNullParameter(navigationOrigin, "navigationOrigin");
        String str28 = str19;
        Intrinsics.checkNotNullParameter(collageDraftEntryPointSource, "collageDraftEntryPointSource");
        if (f30Var != null) {
            str14 = str18;
            str15 = f30Var.getUid();
        } else {
            str14 = str18;
            str15 = null;
        }
        if (f30Var != null) {
            repinAnimationData2 = repinAnimationData3;
            z18 = b40.Q0(f30Var);
        } else {
            repinAnimationData2 = repinAnimationData3;
            z18 = false;
        }
        boolean v03 = b40.v0(f30Var);
        String uid = (f30Var == null || (s63 = f30Var.s6()) == null) ? null : s63.getUid();
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        Intrinsics.checkNotNullParameter(pwtPinCreateMethod, "pinCreateMethod");
        Intrinsics.checkNotNullParameter(navigationOrigin, "navigationOrigin");
        Intrinsics.checkNotNullParameter(collageDraftEntryPointSource, "collageDraftEntryPointSource");
        y0 y0Var = y0.ANDROID_REPIN_DIALOG_TAKEOVER;
        ((dh0.d) aVar.f56762a).c(y0Var);
        BoardCreateOrPickerNavigation boardCreateOrPickerNavigation = parcelable2 != null ? (BoardCreateOrPickerNavigation) parcelable2 : new BoardCreateOrPickerNavigation();
        boardCreateOrPickerNavigation.f45096j = z13;
        boolean z19 = Intrinsics.d(pwtPinCreateMethod, "in_app_browser") || Intrinsics.d(pwtPinCreateMethod, "share_extension_android") || Intrinsics.d(pwtPinCreateMethod, "scraped");
        aVar.f56763b.getClass();
        d32.c cVar2 = collageDraftEntryPointSource;
        if (j1.D0(y0Var, l.ANDROID_FIRST_BOARD_CREATE)) {
            navigationImpl = Navigation.w1(m3.a());
            navigationImpl.Y1("com.pinterest.EXTRA_CLOSEUP_TOPLEVEL_SOURCE", z13);
            Intrinsics.checkNotNullExpressionValue(navigationImpl, "apply(...)");
            navigationImpl.Y1("com.pinterest.EXTRA_FULL_SCREEN", z16);
            if (z19) {
                nl1.d dVar = (nl1.d) fragmentFactory.e(m3.a());
                navigationImpl.y0(boardCreateOrPickerNavigation, "com.pinterest.EXTRA_BOARD_CREATE_OR_PICKER_NAVIGATION_OBJECT");
                dVar.R7(navigationImpl);
                return dVar;
            }
            if (str15 != null) {
                boardCreateOrPickerNavigation.f45088b = new ArrayList(e0.b(str15));
            }
            if (str23 != null) {
                navigationImpl.m0("product_tag_parent_pin_id", str23);
            }
            aVar2 = aVar;
        } else {
            new gy.f(navigationOrigin).i();
            NavigationImpl nav = Navigation.w1(m3.b());
            if (str15 != null) {
                nav.m0("com.pinterest.EXTRA_PIN_ID", str15);
                nav.Y1("com.pinterest.EXTRA_IS_STORY_PIN", z18);
            }
            nav.Y1("com.pinterest.EXTRA_IS_ELIGIBLE_FOR_REPIN_ANIMATION", z17);
            nav.w0(repinAnimationData2, "com.pinterest.EXTRA_REPIN_ANIMATION_DATA");
            nav.Y1("com.pinterest.EXTRA_CLOSEUP_TOPLEVEL_SOURCE", z13);
            nav.m0("com.pinterest.EXTRA_BOARD_ID", str14);
            nav.m0("com.pinterest.EXTRA_BOARD_NAME", str28);
            nav.m0("com.pinterest.CLOSEUP_PIN_ID", str27);
            nav.m0("com.pinterest.EXTRA_PIN_CREATE_TYPE", pwtPinCreateMethod);
            nav.m0("IDEA_STREAM_EXTRAS_KEY_COMPONENT_TYPE", str26);
            nav.m0("IDEA_STREAM_EXTRAS_KEY_VIEW_PARAMETER_TYPE", str25);
            nav.m0("IDEA_STREAM_EXTRAS_KEY_PARENT_PAIR_ID", str13);
            if (str23 != null) {
                nav.m0("product_tag_parent_pin_id", str23);
            }
            if (gVar3 != null) {
                nav.m0("com.pinterest.EXTRA_PIN_ID", gVar3.f65934c);
                nav.m0("com.pinterest.EXTRA_AUTO_SAVE_ORIGIN_PIN_ID", gVar3.f65932a);
                nav.m0("com.pinterest.EXTRA_PIN_MOVE_ORIGIN_BOARD_ID", gVar3.f65933b);
                nav.Y1("com.pinterest.EXTRA_IS_MOVING_PIN", true);
                if (gVar3.f65935d) {
                    nav.m0("com.pinterest.EXTRA_SOURCE", m.STRUCTURED_FEED.toString());
                }
            }
            nav.Y1("com.pinterest.EXTRA_FULL_SCREEN", z16);
            if (str25 != null) {
                nav.z(a4.valueOf(str25).getValue(), "com.pinterest.EXTRA_BOARD_PICKER_SURFACE_ORIGIN");
            }
            String str29 = str24;
            if (str29 != null) {
                nav.m0("com.pinterest.EXTRA_USER_ACTION", str29);
            }
            aVar2 = aVar;
            String str30 = aVar2.f56765d.f78148a.f78145a;
            if (str30 != null) {
                nav.m0("com.pinterest.EXTRA_SESSION_ID", str30);
            }
            String str31 = uid;
            if (str31 != null) {
                nav.m0("com.pinterest.EXTRA_SHUFFLE_ASSET_ID", str31);
            }
            if (v03) {
                nav.Y1("com.pinterest.EXTRA_PIN_CAN_ADD_TO_COLLAGE", true);
                nav.z(cVar2.getValue(), "CutoutComposerExtras.EXTRA_ENTRY_POINT_SOURCE");
            }
            if (kVar2 != null) {
                nav.m0("com.pinterest.EXTRA_REPIN_SOURCE", kVar2.name());
            }
            Intrinsics.checkNotNullExpressionValue(nav, "apply(...)");
            if (z19) {
                Object obj = (r) fragmentFactory.e(m3.b());
                List pinnableImages = boardCreateOrPickerNavigation.f45087a;
                Intrinsics.f(pinnableImages);
                j jVar = (j) obj;
                Intrinsics.checkNotNullParameter(pinnableImages, "pinnableImages");
                jVar.f81423b1 = pinnableImages;
                Intrinsics.checkNotNullParameter(pwtPinCreateMethod, "pwtPinCreateMethod");
                jVar.f81428g1 = pwtPinCreateMethod;
                jVar.f81429h1 = str12;
                Intrinsics.checkNotNullParameter(nav, "nav");
                jVar.R7(nav);
                return (nl1.d) obj;
            }
            navigationImpl = nav;
        }
        boardCreateOrPickerNavigation.f45090d = hashMap2;
        navigationImpl.y0(boardCreateOrPickerNavigation, "com.pinterest.EXTRA_BOARD_CREATE_OR_PICKER_NAVIGATION_OBJECT");
        aVar2.f56764c.d(navigationImpl);
        return null;
    }

    public final void c(f30 f30Var, boolean z13, il1.a fragmentFactory, String str, String navigationOrigin, boolean z14, RepinAnimationData repinAnimationData, gp1.k kVar) {
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        Intrinsics.checkNotNullParameter(navigationOrigin, "navigationOrigin");
        b(this, f30Var, z13, fragmentFactory, null, null, null, null, null, null, null, null, null, null, null, str, false, z14, repinAnimationData, null, navigationOrigin, kVar, null, 2408440);
    }
}
