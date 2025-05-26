package qv0;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.pinterest.api.model.af0;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hf0;
import com.pinterest.api.model.kg0;
import com.pinterest.api.model.qx;
import com.pinterest.api.model.rx;
import com.pinterest.api.model.sf0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zq;
import com.pinterest.api.model.zs;
import com.pinterest.feature.mediagallery.view.MediaDirectoryView;
import com.pinterest.feature.onetap.view.OneTapPinCarouselView;
import com.pinterest.feature.onetap.view.OneTapPinVideoGridCell;
import com.pinterest.feature.pin.reactions.view.ReactionIconButton;
import com.pinterest.feature.profile.lego.header.view.LegoUserProfileHeader;
import com.pinterest.feature.scheduledpins.view.ScheduledPinCellView;
import com.pinterest.feature.search.results.goldstandard.views.GoldStandardActionView;
import com.pinterest.feature.search.results.goldstandard.views.GoldStandardImageAndTextView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.q3;
import com.pinterest.screens.s2;
import com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation;
import com.pinterest.ui.imageview.ProportionalImageView;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.u0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import va1.e1;

/* loaded from: classes5.dex */
public final /* synthetic */ class d0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f105174b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f105175c;

    public /* synthetic */ d0(int i13, Object obj, Object obj2) {
        this.f105173a = i13;
        this.f105174b = obj;
        this.f105175c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v13) {
        i0 i0Var;
        i0 i0Var2;
        ScreenLocation screenLocation;
        ScreenLocation screenLocation2;
        String str;
        int i13 = this.f105173a;
        Object obj = this.f105175c;
        Object obj2 = this.f105174b;
        switch (i13) {
            case 0:
                e0 this$0 = (e0) obj2;
                zq sticker = (zq) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(sticker, "$sticker");
                this$0.f105180c.L2(new nv0.g(sticker, g0.IDEA_PIN_STICKER_TOP_PICKS));
                return;
            case 1:
                jw0.d this$02 = (jw0.d) obj2;
                String text = (String) obj;
                int i14 = jw0.d.f77658e1;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(text, "$text");
                iw0.c cVar = this$02.W0;
                if (cVar != null) {
                    cVar.w3(text);
                    return;
                }
                return;
            case 2:
                MediaDirectoryView this$03 = (MediaDirectoryView) obj2;
                String path = (String) obj;
                int i15 = MediaDirectoryView.f46734f;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(path, "$path");
                pw0.k kVar = this$03.f46739e;
                if (kVar != null) {
                    kVar.o0(path);
                    return;
                }
                return;
            case 3:
                u50.r eventIntake = (u50.r) obj2;
                ax0.h this$04 = (ax0.h) obj;
                int i16 = ax0.h.f20618v;
                Intrinsics.checkNotNullParameter(eventIntake, "$eventIntake");
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                nx.d0 d0Var = this$04.f20619d;
                Intrinsics.checkNotNullParameter(d0Var, "<this>");
                i0 source = d0Var.p();
                if (source != null) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    d4 d4Var = source.f67081a;
                    if (d4Var == null) {
                        d4Var = d4.PIN;
                    }
                    d4 d4Var2 = d4Var;
                    a4 a4Var = source.f67082b;
                    if (a4Var == null) {
                        a4Var = a4.PIN_REGULAR;
                    }
                    i0Var = new i0(d4Var2, a4Var, source.f67083c, g0.SEE_IT_STYLED, source.f67085e, u0.PRODUCTS_CHIP);
                } else {
                    i0Var = new i0(d4.PIN, a4.PIN_REGULAR, null, g0.SEE_IT_STYLED, null, u0.PRODUCTS_CHIP);
                }
                eventIntake.a(new ax0.b(i0Var));
                return;
            case 4:
                u50.r eventIntake2 = (u50.r) obj2;
                cx0.i this$05 = (cx0.i) obj;
                int i17 = cx0.i.f53363r;
                Intrinsics.checkNotNullParameter(eventIntake2, "$eventIntake");
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                nx.d0 d0Var2 = this$05.f53364d;
                Intrinsics.checkNotNullParameter(d0Var2, "<this>");
                i0 source2 = d0Var2.p();
                if (source2 != null) {
                    Intrinsics.checkNotNullParameter(source2, "source");
                    d4 d4Var3 = source2.f67081a;
                    if (d4Var3 == null) {
                        d4Var3 = d4.PIN;
                    }
                    d4 d4Var4 = d4Var3;
                    a4 a4Var2 = source2.f67082b;
                    if (a4Var2 == null) {
                        a4Var2 = a4.PIN_REGULAR;
                    }
                    i0Var2 = new i0(d4Var4, a4Var2, source2.f67083c, g0.SHOP_YOUR_SAVES_STL, source2.f67085e, u0.PRODUCTS_CHIP);
                } else {
                    i0Var2 = new i0(d4.PIN, a4.PIN_REGULAR, null, g0.SHOP_YOUR_SAVES_STL, null, u0.PRODUCTS_CHIP);
                }
                eventIntake2.a(new cx0.b(i0Var2));
                return;
            case 5:
                qx model = (qx) obj2;
                bu0.a this$06 = (bu0.a) obj;
                Intrinsics.checkNotNullParameter(model, "$model");
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                kh2.w.m0(model, u0.NEWS_HUB_HEADER_ICON, (nx.d0) this$06.f23897b);
                List list = model.f41415v;
                if (list == null) {
                    return;
                }
                dl1.s sVar = (dl1.s) CollectionsKt.U(0, list);
                if (sVar instanceof wy0) {
                    r41.k kVar2 = r41.k.f106176a;
                    String userId = ((wy0) sVar).getUid();
                    Intrinsics.checkNotNullExpressionValue(userId, "getUid(...)");
                    Intrinsics.checkNotNullParameter(userId, "userId");
                    screenLocation2 = (ScreenLocation) r41.k.b(userId).f80346a;
                } else {
                    if (sVar instanceof v7) {
                        screenLocation = null;
                        g70.h.f((g70.h) this$06.f23900e, (v7) sVar, null, 6);
                    } else {
                        screenLocation = null;
                        if (sVar instanceof f30) {
                            screenLocation2 = (ScreenLocation) this$06.f23901f;
                        }
                    }
                    screenLocation2 = screenLocation;
                }
                if (sVar == null || screenLocation2 == null) {
                    return;
                }
                ((m60.w) this$06.f23898c).d(Navigation.z0(screenLocation2, sVar.getUid()));
                return;
            case 6:
                lx0.a this$07 = (lx0.a) obj2;
                zs model2 = (zs) obj;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(model2, "$model");
                this$07.f85060b.d(Navigation.r0((ScreenLocation) s2.f51345d.getValue(), model2));
                return;
            case 7:
                rx model3 = (rx) obj2;
                lx0.a this$08 = (lx0.a) obj;
                Intrinsics.checkNotNullParameter(model3, "$model");
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                NavigationImpl z03 = Navigation.z0((ScreenLocation) s2.f51349h.getValue(), model3.e());
                z03.m0("com.pinterest.EXTRA_SEARCH_REFERRING_SOURCE", model3.a());
                z03.m0("com.pinterest.EXTRA_SEARCH_SOURCE_ID", model3.c());
                this$08.f85060b.d(z03);
                return;
            case 8:
                OneTapPinCarouselView.setPin$lambda$0((OneTapPinCarouselView) obj2, (f30) obj, v13);
                return;
            case 9:
                ez0.h this$09 = (ez0.h) obj2;
                f30 pin = (f30) obj;
                int i18 = ez0.h.f60677j;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                Intrinsics.checkNotNullParameter(pin, "$pin");
                bz0.a aVar = this$09.f60684g;
                if (aVar != null) {
                    ((cz0.a) aVar).p3(pin);
                    return;
                }
                return;
            case 10:
                OneTapPinVideoGridCell.setPin$lambda$0((OneTapPinVideoGridCell) obj2, (f30) obj, v13);
                return;
            case 11:
                l11.c cVar2 = (l11.c) obj2;
                Context context = (Context) obj;
                if (!cVar2.f81397o || cVar2.f81393k == null) {
                    if (!cVar2.f81395m) {
                        cVar2.setClickable(false);
                    }
                    if (pk.a0.s0(pk.a0.R(cVar2.f81385c))) {
                        return;
                    }
                    int i19 = cVar2.f81396n;
                    boolean z13 = i19 >= 0 && i19 < 3;
                    ProportionalImageView proportionalImageView = cVar2.f81384b;
                    String str2 = proportionalImageView != null ? proportionalImageView.f52563o : null;
                    f11.b bVar = cVar2.f81394l;
                    if (bVar != null) {
                        String str3 = cVar2.f81391i;
                        String str4 = cVar2.f81392j;
                        boolean z14 = cVar2.f81395m;
                        int i23 = z13 ? i19 + 1 : 0;
                        if (str2 == null) {
                            str2 = "";
                        }
                        ((i11.m) bVar).S3(str3, str4, z14, i23, str2, Integer.valueOf(i19));
                        bs1.c.s2(cVar2, context.getString(x0.idea_pin_metadata_creation_talkback_selected, cVar2.f81392j));
                        return;
                    }
                    return;
                }
                return;
            case 12:
                u11.c this$010 = (u11.c) obj2;
                q11.e cancelEvent = (q11.e) obj;
                int i24 = u11.c.D0;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                Intrinsics.checkNotNullParameter(cancelEvent, "$cancelEvent");
                q11.c cVar3 = this$010.f120001y0;
                if (cVar3 != null) {
                    ((t11.f) cVar3).B3(cancelEvent);
                    return;
                }
                return;
            case 13:
                ReactionIconButton this$011 = (ReactionIconButton) obj2;
                String uid = (String) obj;
                int i25 = ReactionIconButton.f47281n;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                Intrinsics.checkNotNullParameter(uid, "$uid");
                f1 eventType = f1.TAP;
                this$011.getClass();
                Intrinsics.checkNotNullParameter(uid, "uid");
                Intrinsics.checkNotNullParameter(eventType, "eventType");
                v32.c cVar4 = this$011.f47289h;
                v32.c cVar5 = v32.c.NONE;
                v32.c cVar6 = cVar4 == cVar5 ? this$011.f47292k : cVar5;
                this$011.f2(cVar6, eventType);
                z11.a.b1(this$011, cVar6, Boolean.TRUE, 2);
                Context context2 = this$011.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                this$011.setContentDescription(kh2.w.S(context2, cVar6));
                this$011.performHapticFeedback(3);
                Rect R0 = bs1.c.R0(this$011);
                R0.left = this$011.getPaddingStart() + R0.left;
                R0.top = this$011.getPaddingTop() + R0.top;
                R0.right -= this$011.getPaddingEnd();
                R0.bottom -= this$011.getPaddingBottom();
                Object value = this$011.f47290i.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                m60.w wVar = (m60.w) value;
                int id3 = this$011.getId();
                cb2.z zVar = this$011.f47285d;
                if (zVar != null) {
                    wVar.d(new cb2.a0(uid, id3, R0, cVar6, zVar));
                    return;
                } else {
                    Intrinsics.r("reactionForType");
                    throw null;
                }
            case 14:
                i31.c this$012 = (i31.c) obj2;
                vh model4 = (vh) obj;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                Intrinsics.checkNotNullParameter(model4, "$model");
                this$012.f71467a.invoke(model4);
                return;
            case 15:
                i31.e this$013 = (i31.e) obj2;
                vh model5 = (vh) obj;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                Intrinsics.checkNotNullParameter(model5, "$model");
                this$013.f71472a.invoke(model5);
                return;
            case 16:
                LegoUserProfileHeader this$014 = (LegoUserProfileHeader) obj2;
                String instagramUrl = (String) obj;
                int i26 = LegoUserProfileHeader.T;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                Intrinsics.checkNotNullParameter(instagramUrl, "$instagramUrl");
                lu1.b bVar2 = this$014.H;
                if (bVar2 == null) {
                    Intrinsics.r("baseActivityHelper");
                    throw null;
                }
                Context context3 = this$014.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                ((lu1.c) bVar2).m(context3, instagramUrl);
                return;
            case 17:
                g51.c this$015 = (g51.c) obj2;
                v7 board = (v7) obj;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                Intrinsics.checkNotNullParameter(board, "$board");
                Intrinsics.checkNotNullParameter(v13, "v");
                this$015.getPinalytics().b0(u0.NEWS_FEED_BOARD, g0.NEWS_FEED, board.getUid(), false);
                g70.h.f(this$015.f63582e, board, null, 6);
                return;
            case 18:
                u51.f this$016 = (u51.f) obj2;
                r51.b item = (r51.b) obj;
                int i27 = u51.f.f120623d;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                Intrinsics.checkNotNullParameter(item, "$item");
                this$016.f120624a.invoke(item);
                return;
            case 19:
                z51.c listener = (z51.c) obj2;
                ScheduledPinCellView this$017 = (ScheduledPinCellView) obj;
                int i28 = ScheduledPinCellView.f47593e;
                Intrinsics.checkNotNullParameter(listener, "$listener");
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                kg0 scheduledPin = this$017.f47597d;
                if (scheduledPin == null) {
                    Intrinsics.r("scheduledPin");
                    throw null;
                }
                listener.getClass();
                Intrinsics.checkNotNullParameter(scheduledPin, "scheduledPin");
                z51.f fVar = listener.f140865a.X0;
                if (fVar != null) {
                    Intrinsics.checkNotNullParameter(scheduledPin, "scheduledPin");
                    ew.m(scheduledPin);
                    uk1.c cVar7 = (z51.g) ((y51.c) fVar).getView();
                    ScreenLocation screenLocation3 = (ScreenLocation) q3.f51229a.getValue();
                    Bundle bundle = new Bundle();
                    bundle.putString("com.pinterest.EXTRA_SCHEDULED_PIN_ID", scheduledPin.getUid());
                    Unit unit = Unit.f80348a;
                    NavigationImpl v14 = Navigation.v1(screenLocation3, bundle);
                    Intrinsics.checkNotNullExpressionValue(v14, "create(...)");
                    ((nl1.d) cVar7).M1(v14);
                    return;
                }
                return;
            case 20:
                GoldStandardActionView this$018 = (GoldStandardActionView) obj2;
                af0 content = (af0) obj;
                int i29 = GoldStandardActionView.f47639e;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                Intrinsics.checkNotNullParameter(content, "$content");
                l61.c cVar8 = this$018.f47643d;
                if (cVar8 != null) {
                    Intrinsics.checkNotNullParameter(content, "content");
                    l61.f fVar2 = cVar8.f81593a.f81597x0;
                    if (fVar2 != null) {
                        Intrinsics.checkNotNullParameter(content, "content");
                        int intValue = content.k().intValue();
                        String str5 = intValue != 1 ? intValue != 2 ? intValue != 3 ? null : "TAP_WEBSITE_BUTTON" : "TAP_SMS_BUTTON" : "TAP_CALL_BUTTON";
                        if (str5 != null) {
                            fVar2.f81605d.a(0L, str5);
                        }
                        fVar2.f81602a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(content.n())));
                        return;
                    }
                    return;
                }
                return;
            case 21:
                GoldStandardImageAndTextView this$019 = (GoldStandardImageAndTextView) obj2;
                hf0 content2 = (hf0) obj;
                int i33 = GoldStandardImageAndTextView.f47644f;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                Intrinsics.checkNotNullParameter(content2, "$content");
                t61.a aVar2 = this$019.f47649e;
                if (aVar2 != null) {
                    l61.b bVar3 = (l61.b) aVar2;
                    switch (bVar3.f81591a) {
                        case 0:
                            Intrinsics.checkNotNullParameter(content2, "content");
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(content2, "content");
                            l61.d dVar = bVar3.f81592b;
                            l61.f fVar3 = dVar.f81597x0;
                            if (fVar3 != null) {
                                Intrinsics.checkNotNullParameter(content2, "content");
                                fVar3.f81605d.a(0L, "TAP_MICROTREATMENT_CELL");
                                m60.w wVar2 = m60.u.f85943a;
                                NavigationImpl w13 = Navigation.w1(SearchResultsFeatureLocation.GOLD_STANDARD_AUDIO_INTRO);
                                w13.y0(content2, "extra_safety_audio_treatment");
                                wVar2.d(w13);
                            }
                            dVar.f81599z0 = true;
                            return;
                    }
                }
                return;
            case 22:
                GoldStandardImageAndTextView this$020 = (GoldStandardImageAndTextView) obj2;
                sf0 content3 = (sf0) obj;
                int i34 = GoldStandardImageAndTextView.f47644f;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                Intrinsics.checkNotNullParameter(content3, "$content");
                t61.a aVar3 = this$020.f47649e;
                if (aVar3 != null) {
                    l61.b bVar4 = (l61.b) aVar3;
                    switch (bVar4.f81591a) {
                        case 0:
                            Intrinsics.checkNotNullParameter(content3, "content");
                            l61.d dVar2 = bVar4.f81592b;
                            l61.f fVar4 = dVar2.f81597x0;
                            if (fVar4 != null) {
                                Intrinsics.checkNotNullParameter(content3, "content");
                                fVar4.f81605d.a(0L, "TAP_MICROTREATMENT_CELL");
                                m60.w wVar3 = m60.u.f85943a;
                                NavigationImpl w14 = Navigation.w1(SearchResultsFeatureLocation.GOLD_STANDARD_STEPS);
                                w14.y0(content3, "extra_safety_text_treatment");
                                wVar3.d(w14);
                            }
                            dVar2.f81599z0 = true;
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(content3, "content");
                            return;
                    }
                }
                return;
            case 23:
                d91.j this$021 = (d91.j) obj2;
                c91.g filterType = (c91.g) obj;
                int i35 = d91.j.f54083v1;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                Intrinsics.checkNotNullParameter(filterType, "$filterType");
                a91.f fVar5 = this$021.f54088l1;
                if (fVar5 != null) {
                    fVar5.D3(filterType);
                    return;
                }
                return;
            case 24:
                u91.h this$022 = (u91.h) obj2;
                yb0.n this_apply = (yb0.n) obj;
                int i36 = u91.h.N0;
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                lu1.b bVar5 = this$022.H0;
                if (bVar5 == null) {
                    Intrinsics.r("baseActivityHelper");
                    throw null;
                }
                Context context4 = this_apply.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                ((lu1.c) bVar5).l(context4, Uri.parse(this$022.getString(b52.c.url_linked_business_account_support_page)));
                return;
            case 25:
                ba1.y this$023 = (ba1.y) obj2;
                ba1.a displayState = (ba1.a) obj;
                int i37 = ba1.y.M0;
                Intrinsics.checkNotNullParameter(this$023, "this$0");
                Intrinsics.checkNotNullParameter(displayState, "$displayState");
                kh2.j.x2(this$023.b9(), new ba1.n(displayState.f22341d));
                return;
            case 26:
                xa1.o this$024 = (xa1.o) obj2;
                e1 item2 = (e1) obj;
                int i38 = xa1.o.f134461d;
                Intrinsics.checkNotNullParameter(this$024, "this$0");
                Intrinsics.checkNotNullParameter(item2, "$item");
                this$024.f134462a.invoke(item2);
                return;
            case 27:
                com.pinterest.feature.settings.notifications.f listener2 = (com.pinterest.feature.settings.notifications.f) obj2;
                gb1.w this$025 = (gb1.w) obj;
                int i39 = gb1.w.f64736f;
                Intrinsics.checkNotNullParameter(listener2, "$listener");
                Intrinsics.checkNotNullParameter(this$025, "this$0");
                gb1.m mVar = (gb1.m) listener2;
                gb1.o oVar = mVar.f64706a;
                boolean z15 = oVar.f64715c;
                gb1.o.a(oVar, mVar.f64707b, mVar.f64708c, true, z15 ? oVar.f64725m : oVar.f64723k, z15 ? oVar.f64724l : oVar.f64722j);
                m60.w wVar4 = this$025.f64739c;
                if (wVar4 != null) {
                    a.c.y(wVar4);
                    return;
                } else {
                    Intrinsics.r("eventManager");
                    throw null;
                }
            case 28:
                kc1.a displayState2 = (kc1.a) obj2;
                kc1.d0 this$026 = (kc1.d0) obj;
                int i43 = kc1.d0.L0;
                Intrinsics.checkNotNullParameter(displayState2, "$displayState");
                Intrinsics.checkNotNullParameter(this$026, "this$0");
                if (displayState2.f79133c || (str = displayState2.f79131a) == null) {
                    return;
                }
                this$026.b9().f79161e.e().a(new kc1.r(str));
                return;
            default:
                lc1.e this$027 = (lc1.e) obj2;
                ic1.r model6 = (ic1.r) obj;
                int i44 = lc1.e.f82858d;
                Intrinsics.checkNotNullParameter(this$027, "this$0");
                Intrinsics.checkNotNullParameter(model6, "$model");
                this$027.f82859a.invoke(Integer.valueOf(model6.f72088e.getValue()));
                return;
        }
    }
}
