package com.pinterest.feature.home.view;

import a41.l0;
import a7.v0;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.uq;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.vn0;
import com.pinterest.component.alert.AlertContainer;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinCreationPlayerView;
import com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinOverlayViewColorPickerModal;
import com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinPageColorPickerModal;
import com.pinterest.feature.ideaPinCreation.closeup.view.f0;
import com.pinterest.feature.ideaPinCreation.closeup.view.k1;
import com.pinterest.feature.ideaPinCreation.closeup.view.p1;
import com.pinterest.feature.ideaPinCreation.closeup.view.q;
import com.pinterest.feature.ideaPinCreation.closeup.view.s0;
import com.pinterest.feature.ideaPinCreation.closeup.view.z0;
import com.pinterest.feature.ideaPinCreation.common.view.IdeaPinEditablePageLite;
import com.pinterest.feature.mediagallery.view.IdeaPinMediaThumbnailCell;
import com.pinterest.feature.notificationtab.view.NotificationsTabBadgeTooltip;
import com.pinterest.feature.pin.closeup.view.UnifiedPinActionBarView;
import com.pinterest.feature.pin.create.view.BoardSectionCell;
import com.pinterest.feature.pin.create.view.CreateBoardCell;
import com.pinterest.feature.pin.create.view.CreateBoardSectionCell;
import com.pinterest.feature.pin.edit.view.AttributeActionView;
import com.pinterest.feature.pincells.fixedsize.view.FixedSizePinOverlayView;
import com.pinterest.feature.profile.createdtab.scheduledpins.view.ScheduledPinsPreviewView;
import com.pinterest.feature.profile.header.UserProfileHeader;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.d2;
import com.pinterest.screens.n1;
import com.pinterest.screens.n2;
import e0.t;
import h32.c1;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import java.util.List;
import jk2.v;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import m60.u;
import nx.d0;
import pk.a0;
import pw0.x;
import s7.z;
import su0.r;
import sw0.j0;
import y31.b0;

/* loaded from: classes5.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45846a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45847b;

    public /* synthetic */ c(Object obj, int i13) {
        this.f45846a = i13;
        this.f45847b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13;
        au0.d dVar;
        ln0 ln0Var;
        v0 v0Var;
        f30 f30Var;
        a11.e eVar;
        ih ihVar;
        String e13;
        String uid;
        String q13;
        ih ihVar2;
        int i14 = this.f45846a;
        r11 = null;
        c1 c1Var = null;
        Object obj = this.f45847b;
        switch (i14) {
            case 0:
                e this$0 = (e) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f45851f.invoke(null);
                break;
            case 1:
                IdeaPinOverlayViewColorPickerModal this$02 = (IdeaPinOverlayViewColorPickerModal) obj;
                int i15 = IdeaPinOverlayViewColorPickerModal.f46009u;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                View view2 = this$02.f46022m;
                boolean z13 = view2 instanceof z0;
                if (z13) {
                    z0 z0Var = z13 ? (z0) view2 : null;
                    uq uqVar = z0Var != null ? z0Var.f46411x : null;
                    i13 = uqVar != null ? k1.f46213a[uqVar.ordinal()] : -1;
                    if (i13 != 1) {
                        if (i13 == 2 && (dVar = this$02.f46028s) != null) {
                            String str = this$02.f46017h;
                            if (str == null) {
                                str = z0Var.f46405r;
                            }
                            int i16 = str != null ? 1 : 0;
                            if (i16 != 0) {
                                dVar.getPinalytics().X(u0.STORY_PIN_CREATE_PRODUCT_THUMBNAIL);
                            } else {
                                dVar.getPinalytics().X(u0.IDEA_PIN_VTO_ADD_STICKER_BUTTON);
                            }
                            tp u33 = dVar.u3();
                            if (u33 != null) {
                                i92.k kVar = dVar.f20479e;
                                if (i16 != 0 || u33.J() < 3) {
                                    if (i16 != 0 || (ln0Var = dVar.f20486l) == null || ln0Var.F() < 10) {
                                        ((q) ((yt0.d) dVar.getView())).Z8(str, true);
                                        break;
                                    } else {
                                        kVar.h(aq1.h.vto_product_tag_limit_per_pin);
                                        break;
                                    }
                                } else {
                                    kVar.h(aq1.h.vto_product_tag_limit_per_idea_pin_page);
                                    break;
                                }
                            }
                        }
                    } else {
                        au0.d dVar2 = this$02.f46028s;
                        if (dVar2 != null) {
                            String str2 = this$02.f46017h;
                            if (str2 == null) {
                                str2 = z0Var.f46405r;
                            }
                            au0.d.I3(dVar2, str2);
                            break;
                        }
                    }
                } else {
                    boolean z14 = view2 instanceof s0;
                    if (z14) {
                        s0 s0Var = z14 ? (s0) view2 : null;
                        uq a03 = s0Var != null ? s0Var.a0() : null;
                        i13 = a03 != null ? k1.f46213a[a03.ordinal()] : -1;
                        if (i13 == 1) {
                            au0.d dVar3 = this$02.f46028s;
                            if (dVar3 != null) {
                                String str3 = this$02.f46017h;
                                if (str3 == null) {
                                    str3 = s0Var.f46317s;
                                }
                                au0.d.I3(dVar3, str3);
                                break;
                            }
                        } else if (i13 == 3) {
                            String str4 = this$02.f46017h;
                            if (str4 == null) {
                                str4 = s0Var.f46317s;
                            }
                            au0.d dVar4 = this$02.f46028s;
                            if (dVar4 != null) {
                                q qVar = (q) ((yt0.d) dVar4.getView());
                                qVar.getClass();
                                qVar.O0 = str4 != null;
                                NavigationImpl V8 = q.V8(qVar, d2.c());
                                if (str4 != null) {
                                    V8.m0("com.pinterest.EXTRA_BOARD_ID", str4);
                                }
                                qVar.M1(V8);
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                IdeaPinPageColorPickerModal this$03 = (IdeaPinPageColorPickerModal) obj;
                int i17 = IdeaPinPageColorPickerModal.f46030e;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                this$03.f46031a.d();
                p1 p1Var = this$03.f46034d;
                if (p1Var != null) {
                    f0 f0Var = (f0) p1Var;
                    f0Var.G0();
                    bs1.c.U1(f0Var.q());
                    break;
                }
                break;
            case 3:
                IdeaPinEditablePageLite this$04 = (IdeaPinEditablePageLite) obj;
                int i18 = IdeaPinEditablePageLite.A;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                IdeaPinCreationPlayerView ideaPinCreationPlayerView = this$04.f46450n;
                if (ideaPinCreationPlayerView.getVisibility() == 0 && ideaPinCreationPlayerView.A && (v0Var = ideaPinCreationPlayerView.f18946k) != null) {
                    if (v0Var.f()) {
                        IdeaPinCreationPlayerView ideaPinCreationPlayerView2 = this$04.f46450n;
                        if (!bs1.c.j1(ideaPinCreationPlayerView2)) {
                            ideaPinCreationPlayerView2.M(true);
                        }
                        d0 d0Var = this$04.f46445i;
                        if (d0Var != null) {
                            d0.B(d0Var, f1.STORY_PIN_VIDEO_PAUSE, null, null, null, 30);
                        }
                    } else {
                        this$04.o2();
                        d0 d0Var2 = this$04.f46445i;
                        if (d0Var2 != null) {
                            d0.B(d0Var2, f1.STORY_PIN_VIDEO_PLAY, null, null, null, 30);
                        }
                    }
                    this$04.r0(!v0Var.f());
                    break;
                }
                break;
            case 4:
                ku0.a model = (ku0.a) obj;
                Intrinsics.checkNotNullParameter(model, "$model");
                model.f80894g.invoke();
                break;
            case 5:
                r this$05 = (r) obj;
                int i19 = r.f115216f;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                pu0.r rVar = this$05.f115221e;
                if (rVar != null && !rVar.e()) {
                    if (rVar instanceof pu0.p) {
                        rVar.a().invoke(new pu0.l(((pu0.p) rVar).f101409k));
                        break;
                    } else if (rVar instanceof pu0.q) {
                        rVar.a().invoke(new pu0.m(((pu0.q) rVar).f101415k));
                        break;
                    }
                }
                break;
            case 6:
                tu0.h this$06 = (tu0.h) obj;
                int i23 = tu0.h.f119333y0;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                FragmentActivity E4 = this$06.E4();
                if (E4 != null) {
                    E4.onBackPressed();
                    break;
                }
                break;
            case 7:
                cv0.i model2 = (cv0.i) obj;
                Intrinsics.checkNotNullParameter(model2, "$model");
                model2.f53271h.invoke();
                break;
            case 8:
                vv0.d listener = (vv0.d) obj;
                int i24 = zv0.b.f142849a;
                Intrinsics.checkNotNullParameter(listener, "$listener");
                yv0.c cVar = (yv0.c) listener;
                cVar.getPinalytics().X(u0.STORY_PIN_TRIMMER_ADD_CLIP_BUTTON);
                vn0 u34 = cVar.u3();
                long max = Math.max(pp2.a.u() - (u34 != null ? u34.v() : 0L), 0L);
                x type = x.IdeaPinAddMediaClip;
                vn0 u35 = cVar.u3();
                int g13 = u35 != null ? u35.g() : 0;
                zv0.j jVar = (zv0.j) cVar.f140200a;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(type, "type");
                ScreenLocation j13 = d2.j();
                int value = ml1.b.NO_TRANSITION.getValue();
                Pair[] pairArr = new Pair[11];
                Navigation navigation = jVar.I;
                pairArr[0] = new Pair("com.pinterest.EXTRA_ENABLE_VIDEO_UPLOAD", navigation != null ? Boolean.valueOf(navigation.S("com.pinterest.EXTRA_ENABLE_VIDEO_UPLOAD", false)) : null);
                pairArr[1] = new Pair("com.pinterest.EXTRA_LOCAL_STORY_PIN_CLIP_COUNT", Integer.valueOf(g13));
                pairArr[2] = new Pair("com.pinterest.EXTRA_MEDIA_GALLERY_MAX_SELECTED_ITEMS", Integer.valueOf(20 - g13));
                pairArr[3] = new Pair("com.pinterest.EXTRA_LOCAL_STORY_PIN_PAGE_DURATION", Long.valueOf(max));
                Navigation navigation2 = jVar.I;
                pairArr[4] = new Pair("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", Boolean.valueOf(navigation2 != null ? navigation2.S("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", false) : false));
                Navigation navigation3 = jVar.I;
                pairArr[5] = new Pair("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE", navigation3 != null ? navigation3.v0("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE") : null);
                pairArr[6] = new Pair("com.pinterest.EXTRA_MEDIA_GALLERY_TYPE", type.name());
                pairArr[7] = new Pair("com.pinterest.EXTRA_STORY_PIN_MEDIA_GALLERY_ENTRY_TYPE", type.name());
                pairArr[8] = new Pair("com.pinterest.EXTRA_LOCAL_STORY_PIN_CLIP_COUNT", Integer.valueOf(g13));
                pairArr[9] = new Pair("com.pinterest.EXTRA_IDEA_PIN_EDIT_FLOW", Boolean.TRUE);
                Navigation navigation4 = jVar.I;
                pairArr[10] = new Pair("com.pinterest.EXTRA_PIN_SCHEDULED_TIME_SECONDS", Integer.valueOf(navigation4 != null ? navigation4.J1("com.pinterest.EXTRA_PIN_SCHEDULED_TIME_SECONDS") : 0));
                jVar.M1(new NavigationImpl(j13, "", value, t.j(pairArr)));
                break;
            case 9:
                int i25 = zv0.j.f142878k1;
                ((AlertContainer) obj).b(yb0.d.CANCEL_BUTTON_CLICK);
                break;
            case 10:
                pw0.f0 data = (pw0.f0) obj;
                int i26 = IdeaPinMediaThumbnailCell.f46725c;
                Intrinsics.checkNotNullParameter(data, "$data");
                data.f101517c.invoke(data.f101516b);
                break;
            case 11:
                sw0.n this$07 = (sw0.n) obj;
                int i27 = sw0.n.E0;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                this$07.P7();
                break;
            case 12:
                j0 this$08 = (j0) obj;
                int i28 = j0.H1;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                this$08.g9().c(view);
                break;
            case 13:
                NotificationsTabBadgeTooltip this$09 = (NotificationsTabBadgeTooltip) obj;
                int i29 = NotificationsTabBadgeTooltip.f46842t;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                this$09.f46845s.d(Navigation.w1((ScreenLocation) n2.f51141a.getValue()));
                break;
            case 14:
                q01.p this$010 = (q01.p) obj;
                int i33 = q01.p.E0;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                this$010.U8("background_tapped");
                break;
            case 15:
                GestaltButton button = (GestaltButton) obj;
                int i34 = UnifiedPinActionBarView.L;
                Intrinsics.checkNotNullParameter(button, "$button");
                button.callOnClick();
                break;
            case 16:
                l11.e this$011 = (l11.e) obj;
                int i35 = l11.e.f81406g;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                this$011.setClickable(false);
                String str5 = this$011.f81410d;
                if (str5 != null) {
                    z createBoardParams = new z(str5, false, (z42.c) null, 12);
                    f11.c cVar2 = this$011.f81412f;
                    if (cVar2 != null) {
                        int i36 = this$011.f81411e;
                        i11.m mVar = (i11.m) cVar2;
                        Intrinsics.checkNotNullParameter(createBoardParams, "createBoardParams");
                        kk2.l lVar = mVar.Z;
                        if (lVar != null) {
                            lVar.dispose();
                        }
                        mVar.Z = null;
                        mVar.getPinalytics().F(g0.MODAL_DIALOG, u0.REPIN_DIALOG_SUGGESTED_BOARD);
                        if (mVar.isBound()) {
                            l11.j jVar2 = (l11.j) ((f11.d) mVar.getView());
                            ig1.b.O0(jVar2.J1, jVar2.getView(), jVar2.requireContext());
                        }
                        v f03 = mVar.f70997e.f0(createBoardParams);
                        i11.l lVar2 = new i11.l(mVar, i36);
                        f03.d(lVar2);
                        Intrinsics.checkNotNullExpressionValue(lVar2, "subscribeWith(...)");
                        mVar.addDisposable(lVar2);
                        mVar.f71012m.c();
                        break;
                    }
                }
                break;
            case 17:
                l11.j this$012 = (l11.j) obj;
                int i37 = l11.j.W1;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                this$012.P7();
                break;
            case 18:
                BoardSectionCell boardSectionCell = (BoardSectionCell) obj;
                int i38 = BoardSectionCell.f47065c;
                boardSectionCell.setClickable(false);
                if (!a0.s0(boardSectionCell.f47066a.getText())) {
                    sh.f.a().X(u0.BOARD_SECTION_DONE_BUTTON);
                    break;
                }
                break;
            case 19:
                CreateBoardCell this$013 = (CreateBoardCell) obj;
                int i39 = CreateBoardCell.f47068c;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                f11.c cVar3 = this$013.f47070b;
                if (cVar3 != null) {
                    cVar3.U0();
                    break;
                }
                break;
            case 20:
                CreateBoardSectionCell this$014 = (CreateBoardSectionCell) obj;
                int i43 = CreateBoardSectionCell.f47071a;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                this$014.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("reason", com.pinterest.feature.boardsection.a.BOARD_ADD_SECTION.getValue());
                sh.f.a().Z(u0.BOARD_SECTION_ADD_BUTTON, hashMap);
                break;
            case 21:
                AttributeActionView this$015 = (AttributeActionView) obj;
                int i44 = AttributeActionView.f47161l;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                this$015.f47169k.invoke();
                break;
            case 22:
                j21.f this$016 = (j21.f) obj;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                rs.a aVar = this$016.f74503f;
                if (aVar != null) {
                    q21.k kVar2 = view instanceof q21.k ? (q21.k) view : null;
                    aVar.b2(kVar2 != null ? kVar2.f102165h : 0);
                    break;
                }
                break;
            case 23:
                q21.d this$017 = (q21.d) obj;
                int i45 = q21.d.B;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                u.f85943a.d(new ls1.d(this$017));
                p21.f fVar = this$017.f102126e;
                if (fVar != null && (f30Var = fVar.f98692a) != null) {
                    d0 pinalytics = fVar.getPinalytics();
                    f1 f1Var = f1.TAP;
                    g0 g0Var = fVar.f98703l;
                    if (g0Var == null) {
                        g0Var = g0.FLOWED_PIN;
                    }
                    pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : fVar.f98695d, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : f30Var.getUid(), (r18 & 32) != 0 ? null : fVar.q3(fVar.f98694c), (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    String str6 = fVar.f98709r;
                    boolean z15 = fVar.f98708q;
                    if (z15 && str6 != null) {
                        c1Var = p21.f.s3(fVar, f30Var.getUid(), str6);
                    }
                    c1 c1Var2 = c1Var;
                    d0 pinalytics2 = fVar.getPinalytics();
                    String uid2 = f30Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("closeup_navigation_type", nq.b.CLICK.getType());
                    if (fVar.f98717z) {
                        hashMap2.put("click_type", "clickthrough");
                    }
                    Unit unit = Unit.f80348a;
                    pinalytics2.n(uid2, hashMap2, fVar.f98698g.b(f30Var), null, c1Var2, null);
                    qa2.d0 d0Var3 = fVar.f98696e;
                    if (d0Var3 == null) {
                        NavigationImpl z03 = Navigation.z0((ScreenLocation) n1.f51140a.getValue(), f30Var.getUid());
                        if (z15 && str6 != null) {
                            z03.m0("product_tag_parent_pin_id", str6);
                        }
                        fVar.f98697f.d(z03);
                        break;
                    } else if (!fVar.f98717z) {
                        d0Var3.onOpenPinCloseup(f30Var);
                        break;
                    } else {
                        String s53 = f30Var.s5();
                        if (s53 != null && (eVar = fVar.f98704m) != null) {
                            a11.e.c(eVar, s53, f30Var, false, 0, 0, null, false, false, null, null, null, false, false, null, false, false, false, 131064);
                            break;
                        }
                    }
                }
                break;
            case 24:
                FixedSizePinOverlayView this$018 = (FixedSizePinOverlayView) obj;
                int i46 = FixedSizePinOverlayView.f47436e;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                k21.b bVar = this$018.f47440d;
                if (bVar != null) {
                    bVar.f78197a.f66555d.invoke();
                    break;
                }
                break;
            case 25:
                ev.a this$019 = (ev.a) obj;
                int i47 = ev.a.f60192f;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                this$019.f60193a.invoke();
                break;
            case 26:
                ScheduledPinsPreviewView this$020 = (ScheduledPinsPreviewView) obj;
                int i48 = ScheduledPinsPreviewView.f47505f;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                this$020.f47510e.c(Unit.f80348a);
                break;
            case 27:
                UserProfileHeader this$021 = (UserProfileHeader) obj;
                int i49 = UserProfileHeader.f47517s;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                u50.r rVar2 = this$021.f47531q;
                if (rVar2 != null) {
                    rVar2.a(b0.f136776a);
                    break;
                }
                break;
            case 28:
                a41.r this$022 = (a41.r) obj;
                int i53 = a41.r.P1;
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                l0 l0Var = this$022.f668t1;
                if (l0Var != null) {
                    ((a41.d0) l0Var).M3();
                    break;
                }
                break;
            default:
                d61.b this$023 = (d61.b) obj;
                int i54 = d61.b.B;
                Intrinsics.checkNotNullParameter(this$023, "this$0");
                b61.a aVar2 = this$023.A;
                if (aVar2 != null) {
                    vh vhVar = aVar2.f22016b;
                    String e14 = (vhVar == null || (ihVar2 = vhVar.f42857o) == null) ? null : ihVar2.e();
                    if (e14 == null) {
                        e14 = "";
                    }
                    Uri parse = Uri.parse(e14);
                    d0 d0Var4 = aVar2.f22015a.f122379a;
                    Intrinsics.checkNotNullExpressionValue(d0Var4, "getPinalytics(...)");
                    g0 g0Var2 = g0.DYNAMIC_GRID_STORY;
                    HashMap hashMap3 = new HashMap();
                    vh vhVar2 = aVar2.f22016b;
                    if (vhVar2 != null && (q13 = vhVar2.q()) != null) {
                    }
                    vh vhVar3 = aVar2.f22016b;
                    if (vhVar3 != null && (uid = vhVar3.getUid()) != null) {
                    }
                    Integer num = aVar2.f22017c;
                    if (num != null) {
                    }
                    String p33 = aVar2.p3();
                    if (p33 != null) {
                    }
                    vh vhVar4 = aVar2.f22016b;
                    String queryParameter = (vhVar4 == null || (ihVar = vhVar4.f42857o) == null || (e13 = ihVar.e()) == null) ? null : Uri.parse(e13).getQueryParameter("today_article");
                    if (queryParameter != null) {
                        hashMap3.put("today_article_id", queryParameter);
                    }
                    Unit unit2 = Unit.f80348a;
                    d0.B(d0Var4, null, g0Var2, null, hashMap3, 21);
                    if (Intrinsics.d(aVar2.p3(), "slp_rec_seasonal")) {
                        String queryParameter2 = parse.getQueryParameter("q");
                        List split$default = queryParameter2 != null ? StringsKt__StringsKt.split$default(queryParameter2, new String[]{","}, false, 0, 6, null) : null;
                        String str7 = split$default != null ? (String) CollectionsKt.p0(split$default, ol2.f.f96454a) : null;
                        String str8 = str7 != null ? str7 : "";
                        a61.a aVar3 = (a61.a) aVar2.getView();
                        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                        for (String str9 : parse.getQueryParameterNames()) {
                            clearQuery.appendQueryParameter(str9, Intrinsics.d(str9, "q") ? str8 : parse.getQueryParameter(str9));
                        }
                        Uri build = clearQuery.build();
                        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                        String uri = build.toString();
                        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                        ((d61.b) aVar3).E1(uri);
                        break;
                    } else {
                        a61.a aVar4 = (a61.a) aVar2.getView();
                        String uri2 = parse.toString();
                        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
                        ((d61.b) aVar4).E1(uri2);
                        break;
                    }
                }
                break;
        }
    }
}
