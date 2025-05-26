package lc1;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.settings.SettingsUnlinkBAFeatureLocation;
import com.pinterest.feature.settings.shared.view.GestaltSettingsPageItemView;
import com.pinterest.feature.settings.shared.view.SettingsPageItemView;
import com.pinterest.feature.settings.shared.view.SettingsToggleItemView;
import com.pinterest.feature.sharesheet.view.ContactSearchListCell;
import com.pinterest.feature.sharesheet.view.SharesheetBoardPreviewContainer;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.j4;
import ed1.v;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import od1.t;
import re1.s;
import va1.m1;
import va1.q;
import we1.k0;
import we1.l0;
import we1.m0;
import we1.o0;
import we1.p0;
import we1.q1;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f82852b;

    public /* synthetic */ b(Object obj, int i13) {
        this.f82851a = i13;
        this.f82852b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
    /* JADX WARN: Type inference failed for: r1v29, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Function1 function1;
        Function1 function12;
        h71.a aVar;
        Unit unit;
        kj kjVar;
        Function1 function13;
        int i13 = this.f82851a;
        Object obj = this.f82852b;
        switch (i13) {
            case 0:
                c this$0 = (c) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                jc1.g gVar = this$0.f82853a;
                String aboutFieldText = this$0.f82855c;
                if (aboutFieldText == null) {
                    Intrinsics.r("existingFormFieldText");
                    throw null;
                }
                gVar.getClass();
                Intrinsics.checkNotNullParameter(aboutFieldText, "aboutFieldText");
                gVar.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.USER_EDIT_ABOUT_TEXT_FIELD, (r18 & 4) != 0 ? null : g0.USER_PROFILE_EDIT_FIELD_CARD, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                NavigationImpl w13 = Navigation.w1((ScreenLocation) j4.f51017c.getValue());
                w13.m0("about_arg_key", aboutFieldText);
                gVar.f75460c.d(w13);
                return;
            case 1:
                m this$02 = (m) obj;
                int i14 = m.f82895c;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                jc1.g gVar2 = this$02.f82896a;
                gVar2.getClass();
                NavigationImpl w14 = Navigation.w1((ScreenLocation) j4.f51019e.getValue());
                w14.y0(gVar2.f75466i, "pronounsField");
                gVar2.f75460c.d(w14);
                return;
            case 2:
                pc1.d this$03 = (pc1.d) obj;
                int i15 = pc1.d.J0;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                this$03.P7();
                return;
            case 3:
                sc1.b this$04 = (sc1.b) obj;
                int i16 = sc1.b.f112293p0;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                this$04.P7();
                return;
            case 4:
                wc1.e this$05 = (wc1.e) obj;
                int i17 = wc1.e.I0;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                this$05.P7();
                return;
            case 5:
                GestaltSettingsPageItemView this$06 = (GestaltSettingsPageItemView) obj;
                int i18 = GestaltSettingsPageItemView.f48320f;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                va1.f1 f1Var = this$06.f48325e;
                if (f1Var != null) {
                    va1.f1 f1Var2 = f1Var.h() ? f1Var : null;
                    if (f1Var2 == null || (function1 = this$06.f48321a) == null) {
                        return;
                    }
                    function1.invoke(f1Var2);
                    return;
                }
                return;
            case 6:
                zc1.d this$07 = (zc1.d) obj;
                int i19 = zc1.d.f141588d;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                q qVar = this$07.f141591c;
                if (qVar != null) {
                    this$07.f141589a.invoke(qVar);
                    return;
                }
                return;
            case 7:
                zc1.f this$08 = (zc1.f) obj;
                int i23 = zc1.f.f141597f;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                this$08.f141602e.invoke();
                return;
            case 8:
                SettingsPageItemView this$09 = (SettingsPageItemView) obj;
                int i24 = SettingsPageItemView.f48345j;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                va1.f1 f1Var3 = this$09.f48354i;
                if (f1Var3 != null) {
                    va1.f1 f1Var4 = f1Var3.h() ? f1Var3 : null;
                    if (f1Var4 == null || (function12 = this$09.f48346a) == null) {
                        return;
                    }
                    function12.invoke(f1Var4);
                    return;
                }
                return;
            case 9:
                SettingsToggleItemView this$010 = (SettingsToggleItemView) obj;
                int i25 = SettingsToggleItemView.f48364h;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                boolean z13 = !this$010.f48369e.isChecked();
                u81.h hVar = new u81.h(z13, 29);
                GestaltSwitch gestaltSwitch = this$010.f48369e;
                gestaltSwitch.i(hVar);
                m1 m1Var = this$010.f48370f;
                if (m1Var != null) {
                    m1Var.f125210e = z13;
                    kl2.l lVar = this$010.f48365a;
                    if (lVar != null) {
                        lVar.invoke(m1Var, Boolean.valueOf(z13), gestaltSwitch);
                    }
                }
                this$010.b();
                return;
            case 10:
                ad1.d this$011 = (ad1.d) obj;
                int i26 = ad1.d.f2090h0;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                d7.g.s(Navigation.w1(SettingsUnlinkBAFeatureLocation.UNLINK_BA_EXPIRED_LINK_MODAL), this$011.f7());
                return;
            case 11:
                ContactSearchListCell this$012 = (ContactSearchListCell) obj;
                int i27 = ContactSearchListCell.f48383m;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                this$012.f48395l.invoke();
                return;
            case 12:
                SharesheetBoardPreviewContainer this$013 = (SharesheetBoardPreviewContainer) obj;
                int i28 = SharesheetBoardPreviewContainer.f48407w;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                cd1.e eVar = this$013.f48408s;
                if (eVar != null) {
                    ((v) eVar).t3();
                    return;
                }
                return;
            case 13:
                t this$014 = (t) obj;
                int i29 = t.f94174d1;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                kh2.j.x2(this$014.k9(), od1.c.f94117a);
                return;
            case 14:
                fe1.a this$015 = (fe1.a) obj;
                int i33 = fe1.a.f62040h;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                zd1.b bVar = this$015.f62042g;
                if (bVar != null) {
                    boolean z14 = bVar.f141686e;
                    bVar.f141686e = !z14;
                    if (z14 && (aVar = this$015.f63891d) != null) {
                        aVar.setAlpha(0.0f);
                    }
                    this$015.f63888a = bVar.f141686e;
                    this$015.f63889b = z14;
                    i71.a aVar2 = this$015.f63890c;
                    if (aVar2 != null) {
                        androidx.appcompat.widget.d animatorListener = this$015.f63892e;
                        Intrinsics.checkNotNullParameter(animatorListener, "animatorListener");
                        ArrayList G = kg.a.G(aVar2, 1.0f, 0.85f, 250L, 250L);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playSequentially(G);
                        animatorSet.start();
                        animatorSet.addListener(animatorListener);
                    }
                    ae1.b bVar2 = this$015.f62041f;
                    if (bVar2 != null) {
                        bVar2.m3(bVar);
                    }
                    String string = this$015.getResources().getString(mz1.g.content_description_color_filter, String.valueOf(bVar.f141687f));
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    boolean z15 = bVar.f141686e;
                    Resources resources = this$015.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    this$015.setContentDescription(zd1.f.P1(z15, resources, string));
                    return;
                }
                return;
            case 15:
                fe1.c this$016 = (fe1.c) obj;
                int i34 = fe1.c.f62049f;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                this$016.f62053d.performClick();
                return;
            case 16:
                fe1.m this$017 = (fe1.m) obj;
                int i35 = fe1.m.f62079e;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                this$017.f62081b.performClick();
                return;
            case 17:
                ie1.a listener = (ie1.a) obj;
                int i36 = je1.a.f75842m;
                Intrinsics.checkNotNullParameter(listener, "$listener");
                vh vhVar = listener.f72202b;
                if (vhVar != null) {
                    HashMap E = kh2.d.E(vhVar);
                    String str = listener.f72206f;
                    if (str != null) {
                    }
                    d0.B(listener.getPinalytics(), null, g0.DYNAMIC_GRID_STORY, null, E, 21);
                    if (listener.isBound()) {
                        ih ihVar = vhVar.f42857o;
                        if ((ihVar != null ? ihVar.e() : null) != null) {
                            rg0.n nVar = listener.f72208h;
                            if (nVar != null) {
                                nVar.a(null, null);
                            }
                            Uri parse = Uri.parse(vhVar.f42857o.e());
                            Intrinsics.f(parse);
                            vh vhVar2 = listener.f72202b;
                            String a13 = (vhVar2 == null || (kjVar = vhVar2.f42855m) == null) ? null : kjVar.a();
                            if (parse.getPathSegments().contains("style_content") && !parse.getQueryParameterNames().contains("title") && a13 != null && a13.length() != 0) {
                                vh vhVar3 = listener.f72202b;
                                ih ihVar2 = vhVar3 != null ? vhVar3.f42857o : null;
                                if (ihVar2 != null) {
                                    ihVar2.x(parse.buildUpon().appendQueryParameter("title", a13).build().toString());
                                }
                            }
                            yd1.a aVar3 = listener.f72210j;
                            if (aVar3 != null) {
                                he1.a aVar4 = (he1.a) listener.getView();
                                String e13 = vhVar.f42857o.e();
                                Intrinsics.checkNotNullExpressionValue(e13, "getActionDeepLink(...)");
                                String str2 = listener.f72211k;
                                String q13 = vhVar.q();
                                Intrinsics.checkNotNullExpressionValue(q13, "getStoryType(...)");
                                he1.a.X3(aVar4, e13, new ze1.d(aVar3.f138780a, aVar3.f138781b, aVar3.f138783d, str2, Intrinsics.d(q13, "shop_brand_story") ? "module_source_package" : Intrinsics.d(q13, "related_domain_collage") ? "module_source_closeup" : "", listener.f72207g, 80), 4);
                                unit = Unit.f80348a;
                            } else {
                                unit = null;
                            }
                            if (unit == null) {
                                he1.a aVar5 = (he1.a) listener.getView();
                                String e14 = vhVar.f42857o.e();
                                Intrinsics.checkNotNullExpressionValue(e14, "getActionDeepLink(...)");
                                he1.a.X3(aVar5, e14, null, 6);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 18:
                xe1.f this_with = (xe1.f) obj;
                int i37 = we1.c.f129303b;
                Intrinsics.checkNotNullParameter(this_with, "$this_with");
                this_with.f134705a.f134701d.invoke();
                return;
            case 19:
                we1.d this$018 = (we1.d) obj;
                int i38 = we1.d.f129318c;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                rg0.n nVar2 = this$018.f129320b;
                if (nVar2 != null) {
                    nVar2.a(null, null);
                }
                uo0.c cVar = this$018.f129319a;
                if (cVar != null) {
                    cVar.c();
                    return;
                }
                return;
            case 20:
                we1.g this$019 = (we1.g) obj;
                int i39 = we1.g.f129349e;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                uo0.c cVar2 = this$019.f129350a;
                if (cVar2 != null) {
                    cVar2.c();
                    return;
                }
                return;
            case 21:
                we1.h this$020 = (we1.h) obj;
                int i43 = we1.h.f129368h;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                uo0.c cVar3 = this$020.f129375g;
                if (cVar3 != null) {
                    cVar3.c();
                    return;
                }
                return;
            case 22:
                we1.p this$021 = (we1.p) obj;
                int i44 = we1.p.f129536d;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                uo0.c cVar4 = this$021.f129539c;
                if (cVar4 != null) {
                    cVar4.c();
                    return;
                }
                return;
            case 23:
                we1.t this$022 = (we1.t) obj;
                int i45 = we1.t.f129606e;
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                uo0.c cVar5 = this$022.f129608b;
                if (cVar5 != null) {
                    cVar5.c();
                    return;
                }
                return;
            case 24:
                k0 this$023 = (k0) obj;
                int i46 = k0.f129444f;
                Intrinsics.checkNotNullParameter(this$023, "this$0");
                uo0.c cVar6 = this$023.f129447c;
                if (cVar6 != null) {
                    cVar6.c();
                    return;
                }
                return;
            case 25:
                l0 this$024 = (l0) obj;
                int i47 = l0.f129455d;
                Intrinsics.checkNotNullParameter(this$024, "this$0");
                uo0.c cVar7 = this$024.f129456a;
                if (cVar7 != null) {
                    cVar7.c();
                    return;
                }
                return;
            case 26:
                m0 this$025 = (m0) obj;
                int i48 = m0.f129469m;
                Intrinsics.checkNotNullParameter(this$025, "this$0");
                uo0.c cVar8 = this$025.f129478i;
                if (cVar8 != null) {
                    cVar8.c();
                    return;
                }
                return;
            case 27:
                o0 this$026 = (o0) obj;
                int i49 = o0.f129527g;
                Intrinsics.checkNotNullParameter(this$026, "this$0");
                uo0.c cVar9 = this$026.f129529b;
                if (cVar9 != null) {
                    cVar9.c();
                    return;
                }
                return;
            case 28:
                p0 this$027 = (p0) obj;
                int i53 = p0.f129540i;
                Intrinsics.checkNotNullParameter(this$027, "this$0");
                uo0.c cVar10 = this$027.f129546f;
                if (cVar10 != null) {
                    cVar10.c();
                    return;
                }
                return;
            default:
                s thumbnailData = (s) obj;
                int i54 = q1.f129559v;
                Intrinsics.checkNotNullParameter(thumbnailData, "$thumbnailData");
                String str3 = thumbnailData.f107661b;
                if (str3 == null || (function13 = thumbnailData.f107662c) == null) {
                    return;
                }
                function13.invoke(str3);
                return;
        }
    }
}
