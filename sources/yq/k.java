package yq;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import bm1.o;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.activity.sendapin.ui.PersonListCell;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.zs;
import com.pinterest.feature.pin.create.view.BoardSectionCell;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.n4;
import df.j1;
import h32.f1;
import h32.g0;
import h32.u0;
import i91.c0;
import java.util.HashMap;
import java.util.Map;
import kg.t;
import kh2.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lr.z;
import m60.u;
import m60.x0;
import nx.d0;
import pk.a0;
import u50.f0;
import u50.i0;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139670a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f139671b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f139672c;

    public /* synthetic */ k(int i13, Object obj, Object obj2) {
        this.f139670a = i13;
        this.f139671b = obj;
        this.f139672c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        sr srVar;
        int i13 = this.f139670a;
        r4 = null;
        String str = null;
        Object obj2 = this.f139672c;
        Object obj3 = this.f139671b;
        switch (i13) {
            case 0:
                up.c cVar = (up.c) obj3;
                do1.d displayState = (do1.d) obj;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                i0 i0Var = displayState.f55665a;
                f0 text = bs1.c.h2((SpannableStringBuilder) obj2);
                Intrinsics.checkNotNullParameter(text, "text");
                return new do1.d(text, new do1.j(Uri.parse((String) cVar.f122937e)), displayState.f55667c, displayState.f55668d, displayState.f55669e, displayState.f55670f, displayState.f55671g, displayState.f55672h, displayState.f55673i);
            case 1:
                dr.k kVar = (dr.k) obj3;
                TypeAheadItem typeAheadItem = (TypeAheadItem) obj2;
                bm1.m displayState2 = (bm1.m) obj;
                int i14 = dr.k.H;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(displayState2, "displayState");
                o oVar = displayState2.f23507a;
                bm1.n selectedState = typeAheadItem.f35152m ? bm1.n.SELECTED : bm1.n.UNSELECTED;
                Intrinsics.checkNotNullParameter(selectedState, "selectedState");
                boolean z13 = typeAheadItem.f35152m;
                Context context = kVar.f56199n;
                bm1.b buttonType = new bm1.b(z13 ? bs1.c.p2(context.getString(x0.added)) : bs1.c.p2(context.getString(x0.add)), null, false);
                Intrinsics.checkNotNullParameter(buttonType, "buttonType");
                return new bm1.m(oVar, selectedState, buttonType, displayState2.f23510d, displayState2.f23511e, displayState2.f23512f, displayState2.f23513g);
            case 2:
                em1.b checkedState = (em1.b) obj3;
                fm1.c visibility = (fm1.c) obj2;
                em1.d displayState3 = (em1.d) obj;
                int i15 = PersonListCell.f35160g;
                Intrinsics.checkNotNullParameter(displayState3, "displayState");
                em1.b bVar = displayState3.f59598a;
                Intrinsics.checkNotNullParameter(checkedState, "checkedState");
                Intrinsics.checkNotNullParameter(visibility, "visibility");
                return new em1.d(checkedState, displayState3.f59599b, visibility, displayState3.f59601d, displayState3.f59602e, displayState3.f59603f, displayState3.f59604g, displayState3.f59605h, displayState3.f59606i, displayState3.f59607j);
            case 3:
                lr.c cVar2 = (lr.c) obj3;
                do1.d displayState4 = (do1.d) obj;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(displayState4, "displayState");
                i0 i0Var2 = displayState4.f55665a;
                f0 text2 = bs1.c.h2((SpannableString) obj2);
                Intrinsics.checkNotNullParameter(text2, "text");
                return new do1.d(text2, new do1.j((String) cVar2.f84482h), displayState4.f55667c, displayState4.f55668d, displayState4.f55669e, displayState4.f55670f, displayState4.f55671g, displayState4.f55672h, displayState4.f55673i);
            case 4:
                lr.l lVar = (lr.l) obj3;
                do1.d displayState5 = (do1.d) obj;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(displayState5, "displayState");
                i0 i0Var3 = displayState5.f55665a;
                f0 text3 = bs1.c.h2(j1.a0((String) obj2));
                Intrinsics.checkNotNullParameter(text3, "text");
                String str2 = lVar.f84522g;
                return new do1.d(text3, str2 != null ? new do1.j(str2) : null, (do1.b) lVar.f84527l, displayState5.f55668d, displayState5.f55669e, ((Integer) lVar.f84528m).intValue(), displayState5.f55671g, displayState5.f55672h, displayState5.f55673i);
            case 5:
                z zVar = (z) obj3;
                do1.d displayState6 = (do1.d) obj;
                zVar.getClass();
                Intrinsics.checkNotNullParameter(displayState6, "displayState");
                i0 i0Var4 = displayState6.f55665a;
                f0 text4 = bs1.c.h2((SpannableString) obj2);
                Intrinsics.checkNotNullParameter(text4, "text");
                zs zsVar = (zs) zVar.f84572e;
                Intrinsics.checkNotNullParameter(zsVar, "<this>");
                Map B = zsVar.B();
                if (B != null && (srVar = (sr) B.get("75x75")) != null) {
                    str = srVar.j();
                }
                if (str == null) {
                    str = "";
                }
                return new do1.d(text4, new do1.j(str), displayState6.f55667c, displayState6.f55668d, displayState6.f55669e, displayState6.f55670f, displayState6.f55671g, displayState6.f55672h, displayState6.f55673i);
            case 6:
                BoardSectionCell boardSectionCell = (BoardSectionCell) obj3;
                rn1.a displayState7 = (rn1.a) obj;
                int i16 = BoardSectionCell.f47065c;
                boardSectionCell.getClass();
                Intrinsics.checkNotNullParameter(displayState7, "displayState");
                i0 i0Var5 = displayState7.f108849g;
                f0 text5 = bs1.c.h2((String) obj2);
                Intrinsics.checkNotNullParameter(text5, "text");
                return new rn1.a(text5, displayState7.f108850h, displayState7.f108851i, displayState7.f108852j, displayState7.f108853k, displayState7.f108854l, displayState7.f108855m, displayState7.f108856n, displayState7.f108857o, displayState7.f108858p, displayState7.f108859q, displayState7.f108860r, bs1.c.j2(new String[]{boardSectionCell.f47067b}, f02.g.double_tap_to_save_to_board_section), displayState7.f108862t, displayState7.f108863u, displayState7.f108864v, displayState7.f108865w, displayState7.f108866x, displayState7.f108867y, displayState7.f108868z, displayState7.A);
            case 7:
                i91.i0 i0Var6 = (i91.i0) obj3;
                String str3 = (String) obj2;
                Uri uri = (Uri) obj;
                i0Var6.getClass();
                HashMap hashMap = new HashMap();
                SendableObject sendableObject = i0Var6.f71841b;
                hashMap.put("board_id", sendableObject.d());
                i91.b bVar2 = i0Var6.f71842c;
                hashMap.put("item_id", bVar2.f71799b);
                f1 f1Var = f1.BOARD_SHARE_VIDEO_EXPORT_SUCCEEDED;
                d0 d0Var = i0Var6.f71844e;
                d0Var.g(f1Var, null, hashMap, false);
                if (a0.N("instagram_stories", str3)) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("ARG_SENDABLE_OBJECT", sendableObject);
                    bundle.putString("ARG_URI_STRING", uri.toString());
                    bundle.putString("ARG_SHARE_APP", "instagram_stories");
                    bundle.putSerializable("ARG_INVITE_CATEGORY", i0Var6.f71845f);
                    bundle.putSerializable("ARG_PREVIEW_STATE", bVar2);
                    u.f85943a.d(Navigation.v1((ScreenLocation) n4.f51147d.getValue(), bundle));
                } else if (a0.N("facebook_stories", str3)) {
                    Context context2 = i0Var6.f71840a;
                    context2.grantUriPermission("facebook_stories", uri, 1);
                    Intent intent = new Intent("com.facebook.stories.ADD_TO_STORY", uri);
                    intent.setPackage("com.facebook.katana");
                    context2.startActivity(intent);
                    new HashMap();
                    d0Var.h(g0.SEND_SHARE_FACEBOOK, u0.PIN_SHARE_FACEBOOK_STORY_BUTTON, b0.u0(sendableObject.d(), bVar2.f71799b, b0.q0("facebook_stories")));
                    d0Var.a(f1.SHARE_SHEET_FB_STORIES_EXPORT_SUCCESS, sendableObject.d(), false, true);
                } else if (a0.N("download_idea_pin", str3)) {
                    t.X0();
                    c0 c0Var = i0Var6.f71843d;
                    i0Var6.f71858s.o(sendableObject.d(), i0Var6.f71850k, bVar2, (c0Var == null || !(c0Var.d() instanceof v7)) ? null : (v7) i0Var6.f71843d.d());
                    d0Var.a(f1.SHARE_SHEET_DOWNLOAD_EXPORT_SUCCESS, sendableObject.d(), false, true);
                }
                return null;
            default:
                ((mo2.c) obj3).i(((mo2.b) obj2).f87809b);
                return Unit.f80348a;
        }
    }
}
