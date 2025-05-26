package we1;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.activity.pin.view.unifiedcomments.CommentComposerView;
import com.pinterest.api.model.dk0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.style.spotlight.view.SpotlightBoardImmersiveHeaderView;
import com.pinterest.feature.todaytab.articlefeed.relatedarticles.RelatedArticlesHeaderView;
import com.pinterest.feature.unifiedcomments.view.AttachedPinCommentView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.video.core.view.PinterestVideoView;
import java.io.File;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.f4;
import lh0.z3;

/* loaded from: classes5.dex */
public final class n1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129492i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f129493j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(Object obj, int i13) {
        super(1);
        this.f129492i = i13;
        this.f129493j = obj;
    }

    public final HashMap b(String it) {
        int i13 = this.f129492i;
        Object obj = this.f129493j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                HashMap hashMap = ((p2) obj).f129552b.f129427k;
                return hashMap == null ? new HashMap() : hashMap;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return ((xe1.t) obj).f134760a.f94255b;
        }
    }

    public final om1.c e(om1.c it) {
        int i13 = this.f129492i;
        Object obj = this.f129493j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, rm1.q.ARROW_FORWARD, (om1.e) obj, om1.f.TRANSPARENT_GRAY, null, null, false, View.generateViewId(), 760);
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                rm1.q qVar = rm1.q.ARROW_BACK;
                om1.f fVar = om1.f.TRANSPARENT_DARK_GRAY;
                fm1.c cVar = fm1.c.GONE;
                String string = ((com.pinterest.feature.todaytab.tab.view.k) obj).getString(m60.x0.back);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return om1.c.e(it, qVar, null, fVar, cVar, bs1.c.h2(string), false, 0, 994);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, ((bi1.c) obj).f22836a ? rm1.q.CAPTIONS : rm1.q.CAPTIONS_OUTLINE, null, null, null, null, false, 0, 1022);
        }
    }

    public final rm1.d f(rm1.d it) {
        int i13 = this.f129492i;
        Object obj = this.f129493j;
        switch (i13) {
            case 17:
                Intrinsics.checkNotNullParameter(it, "it");
                return rm1.d.e(it, null, null, d7.b.Z(((hh1.n) obj).f69193g), 0, null, 27);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rm1.d.e(it, null, null, d7.b.Z(((hh1.o) obj).f69200g), 0, null, 27);
        }
    }

    public final rn1.a h(rn1.a it) {
        int i13 = this.f129492i;
        Object obj = this.f129493j;
        switch (i13) {
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                SpotlightBoardImmersiveHeaderView spotlightBoardImmersiveHeaderView = (SpotlightBoardImmersiveHeaderView) obj;
                int i14 = SpotlightBoardImmersiveHeaderView.f48587q;
                vn1.g gVar = (((Boolean) spotlightBoardImmersiveHeaderView.f48594o.getValue()).booleanValue() && ((Boolean) spotlightBoardImmersiveHeaderView.f48595p.getValue()).booleanValue()) ? vn1.g.BODY_300 : vn1.g.BODY_100;
                return rn1.a.y(it, null, ((Boolean) spotlightBoardImmersiveHeaderView.f48594o.getValue()).booleanValue() ? vn1.c.DARK : vn1.c.LIGHT, null, kotlin.collections.e0.b(vn1.e.BOLD), gVar, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097125);
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                vn1.c cVar = vn1.c.LIGHT;
                Context context = ((wg1.k) obj).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return rn1.a.y(it, null, cVar, kotlin.collections.e0.b(vn1.b.START), null, pk.a0.o0(context), 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097129);
            case 13:
            case 15:
            case 17:
            case 18:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String string = ((AttachedPinCommentView) obj).getResources().getString(fb0.f.attached_pin_comment_subtitle_placeholder);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                Intrinsics.checkNotNullParameter(string, "string");
                return rn1.a.y(it, new u50.f0(string), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, d7.g.q(((RelatedArticlesHeaderView) obj).getResources(), m60.x0.today_tab_related_articles_header, "getString(...)"), null, kotlin.collections.e0.b(vn1.b.CENTER), null, vn1.g.UI_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097130);
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, d7.g.q(((gh1.b) obj).getResources(), m60.x0.today_tab_label, "getString(...)"), null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 19:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(((hh1.p) obj).f69204g), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
        }
    }

    public final yl1.b i(yl1.b it) {
        int i13 = this.f129492i;
        Object obj = this.f129493j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                String str = ((re1.e) obj).f107573a;
                return yl1.b.f(it, bs1.c.h2(str != null ? str : ""), false, null, null, null, null, null, null, 0, null, 1022);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                String str2 = ((re1.x) obj).f107684a.f107573a;
                return yl1.b.f(it, bs1.c.h2(str2 != null ? str2 : ""), false, null, null, null, null, null, null, 0, null, 1022);
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                ih ihVar = ((wg1.p) obj).f129823n;
                String g13 = ihVar != null ? ihVar.g() : null;
                return yl1.b.f(it, bs1.c.h2(g13 != null ? g13 : ""), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, ((rh1.k1) obj).f108247i ? fm1.c.GONE : fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1019);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g70.b bVar;
        String r43;
        int i13 = this.f129492i;
        int i14 = 1;
        Object obj2 = this.f129493j;
        switch (i13) {
            case 0:
                return e((om1.c) obj);
            case 1:
                return i((yl1.b) obj);
            case 2:
                return i((yl1.b) obj);
            case 3:
                return b((String) obj);
            case 4:
                v7 board = (v7) obj;
                Intrinsics.checkNotNullParameter(board, "board");
                u2 u2Var = (u2) obj2;
                dk0 y03 = board.y0();
                String A = y03 != null ? y03.A() : null;
                int i15 = u2.f129633l;
                u2Var.getClass();
                if (kh2.d.B0(board)) {
                    f4 f4Var = u2Var.f129642i;
                    f4Var.getClass();
                    z3 z3Var = a4.f83297a;
                    lh0.g1 g1Var = (lh0.g1) f4Var.f83347a;
                    if (g1Var.o("android_automagical_board_surface", "enabled", z3Var) || g1Var.l("android_automagical_board_surface")) {
                        bVar = g70.b.AUTOMAGICAL_BOARD;
                        u2Var.f129641h.e(board, bVar, new r2(i14, board, A));
                        return Unit.f80348a;
                    }
                }
                bVar = kh2.d.B0(board) ? g70.b.PUBLIC_BOARD : g70.b.NONE;
                u2Var.f129641h.e(board, bVar, new r2(i14, board, A));
                return Unit.f80348a;
            case 5:
                return b((String) obj);
            case 6:
                j((Throwable) obj);
                return Unit.f80348a;
            case 7:
                sf1.e1 e1Var = (sf1.e1) ((sf1.k1) obj2);
                e1Var.getClass();
                Activity l03 = bs1.c.l0(e1Var);
                if (l03 != null) {
                    l03.onBackPressed();
                }
                return Unit.f80348a;
            case 8:
                String id3 = (String) obj;
                Intrinsics.checkNotNullParameter(id3, "id");
                return ((pg1.c) obj2).f100109s.c(id3);
            case 9:
                wy0 wy0Var = (wy0) obj;
                tg1.g gVar = (tg1.g) obj2;
                if (gVar != null) {
                    Intrinsics.f(wy0Var);
                    String name = dl2.b.i1(wy0Var);
                    wg1.e eVar = (wg1.e) gVar;
                    Intrinsics.checkNotNullParameter(name, "name");
                    pk.a0.p(eVar.f129770r, name);
                    eVar.f129769q.setVisibility(0);
                }
                return Unit.f80348a;
            case 10:
                gb2.i iVar = (gb2.i) obj;
                ug1.k kVar = (ug1.k) obj2;
                String str = iVar.f64753a;
                f30 f30Var = kVar.f122211o;
                if (Intrinsics.d(str, f30Var != null ? f30Var.getUid() : null)) {
                    int i16 = ug1.j.f122196a[iVar.f64754b.ordinal()];
                    m60.w wVar = kVar.f122198b;
                    if (i16 != 1) {
                        int i17 = 2;
                        if (i16 == 2) {
                            kVar.f122209m = false;
                            ac2.o1 q03 = ((wg1.z) ((tg1.k) kVar.getView())).f129881o.q0();
                            q03.f2019v = true;
                            q03.w();
                            tg1.k kVar2 = (tg1.k) kVar.getView();
                            f30 f30Var2 = kVar.f122211o;
                            boolean z13 = (f30Var2 == null || (r43 = f30Var2.r4()) == null || r43.length() == 0) ? false : true;
                            boolean q33 = kVar.q3();
                            wg1.z zVar = (wg1.z) kVar2;
                            zVar.Z(z13);
                            pk.a0.w1(zVar.f129884r);
                            zVar.f129885s.i(new wg1.x(zVar, i14));
                            pk.a0.k0(zVar.f129886t);
                            GestaltIconButton gestaltIconButton = zVar.f129882p;
                            if (gestaltIconButton == null) {
                                Intrinsics.r("overflowIcon");
                                throw null;
                            }
                            com.bumptech.glide.c.u1(gestaltIconButton);
                            GestaltIconButton gestaltIconButton2 = zVar.f129883q;
                            if (gestaltIconButton2 == null) {
                                Intrinsics.r("soundIcon");
                                throw null;
                            }
                            com.bumptech.glide.c.u1(gestaltIconButton2);
                            ((lh0.g1) zVar.f129877k.f83339a).c("slp_swap_overflow_audio_buttons");
                            zVar.f129888v.d(new wg1.x(zVar, i17));
                            zVar.f129879m.setVisibility(8);
                            zVar.f129878l.setOnClickListener(new wg1.u(zVar, 1));
                            if (zVar.f129890x) {
                                zVar.T();
                            }
                            if (q33) {
                                PinterestVideoView pinterestVideoView = zVar.f129881o;
                                pinterestVideoView.j(0L, false);
                                ug1.k kVar3 = zVar.A;
                                if (kVar3 != null) {
                                    kVar3.f122198b.d(new tg1.b());
                                }
                                pinterestVideoView.play();
                            }
                        } else if (i16 == 3) {
                            kVar.f122209m = true;
                            ((wg1.z) ((tg1.k) kVar.getView())).f129881o.q0().f2019v = false;
                            wg1.z zVar2 = (wg1.z) ((tg1.k) kVar.getView());
                            pk.a0.k0(zVar2.f129884r);
                            zVar2.f129885s.i(wg1.d.I);
                            pk.a0.k0(zVar2.f129886t);
                            GestaltIconButton gestaltIconButton3 = zVar2.f129882p;
                            if (gestaltIconButton3 == null) {
                                Intrinsics.r("overflowIcon");
                                throw null;
                            }
                            com.bumptech.glide.c.d0(gestaltIconButton3);
                            GestaltIconButton gestaltIconButton4 = zVar2.f129883q;
                            if (gestaltIconButton4 == null) {
                                Intrinsics.r("soundIcon");
                                throw null;
                            }
                            com.bumptech.glide.c.d0(gestaltIconButton4);
                            pk.a0.l0(zVar2.f129888v);
                            zVar2.f129879m.setVisibility(0);
                            zVar2.f129878l.setOnClickListener(new oq.m(7));
                            zVar2.f129881o.j(0L, false);
                            zVar2.L();
                            wVar.d(new tg1.a(true));
                        }
                    } else {
                        if (!kVar.f122209m) {
                            wVar.d(new tg1.a(true));
                        }
                        kVar.f122209m = true;
                        ((wg1.z) ((tg1.k) kVar.getView())).f129881o.q0().f2019v = false;
                        wg1.z zVar3 = (wg1.z) ((tg1.k) kVar.getView());
                        pk.a0.k0(zVar3.f129884r);
                        pk.a0.k0(zVar3.f129885s);
                        pk.a0.w1(zVar3.f129886t);
                        GestaltIconButton gestaltIconButton5 = zVar3.f129882p;
                        if (gestaltIconButton5 == null) {
                            Intrinsics.r("overflowIcon");
                            throw null;
                        }
                        com.bumptech.glide.c.n0(gestaltIconButton5);
                        GestaltIconButton gestaltIconButton6 = zVar3.f129883q;
                        if (gestaltIconButton6 == null) {
                            Intrinsics.r("soundIcon");
                            throw null;
                        }
                        com.bumptech.glide.c.n0(gestaltIconButton6);
                        boolean z14 = zVar3.f129890x;
                        GestaltButton gestaltButton = zVar3.f129888v;
                        if (!z14 && zVar3.D(zVar3.f129892z)) {
                            ViewGroup.LayoutParams layoutParams = gestaltButton.getLayoutParams();
                            if (layoutParams == null) {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            }
                            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                            layoutParams2.f17671i = -1;
                            layoutParams2.f17673j = -1;
                            layoutParams2.f17691t = 0;
                            layoutParams2.f17677l = 0;
                            layoutParams2.f17693v = 0;
                            int W = bs1.c.W(gestaltButton, eo1.c.space_800);
                            layoutParams2.setMargins(W, 0, W, bs1.c.W(gestaltButton, eo1.c.space_400));
                            gestaltButton.setLayoutParams(layoutParams2);
                            gestaltButton.requestLayout();
                        }
                        gestaltButton.d(wg1.d.H);
                        zVar3.f129879m.setVisibility(0);
                        zVar3.f129878l.setOnClickListener(new oq.m(6));
                        zVar3.f129881o.j(0L, false);
                        zVar3.L();
                    }
                }
                return Unit.f80348a;
            case 11:
                return h((rn1.a) obj);
            case 12:
                return h((rn1.a) obj);
            case 13:
                return i((yl1.b) obj);
            case 14:
                return h((rn1.a) obj);
            case 15:
                return e((om1.c) obj);
            case 16:
                return h((rn1.a) obj);
            case 17:
                return f((rm1.d) obj);
            case 18:
                return f((rm1.d) obj);
            case 19:
                return h((rn1.a) obj);
            case 20:
                xl1.a it = (xl1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                u50.r rVar = ((com.pinterest.feature.unauth.sba.h) obj2).f48821b;
                if (rVar != null) {
                    rVar.a(com.pinterest.feature.unauth.sba.l.f48837a);
                    return Unit.f80348a;
                }
                Intrinsics.r("eventIntake");
                throw null;
            case 21:
                l((l82.n) obj);
                return Unit.f80348a;
            case 22:
                l((l82.n) obj);
                return Unit.f80348a;
            case 23:
                qr1.d authResult = (qr1.d) obj;
                Intrinsics.checkNotNullParameter(authResult, "authResult");
                return ((lb2.n) ((kh1.c) obj2).f79414c).i(new c60.a(authResult.getV3AccessToken(), authResult.getV5AccessToken(), authResult.getV5RefreshToken()));
            case 24:
                wt1.c0 c0Var = (wt1.c0) obj;
                if (c0Var instanceof wt1.m) {
                    mh1.d.f0((mh1.d) obj2);
                } else if (c0Var instanceof wt1.b0) {
                    mh1.d.f0((mh1.d) obj2);
                } else if (c0Var instanceof wt1.u) {
                    mh1.d.f0((mh1.d) obj2);
                } else if (c0Var instanceof wt1.y) {
                    mh1.d.f0((mh1.d) obj2);
                }
                return Unit.f80348a;
            case 25:
                com.pinterest.feature.unifiedcomments.d view = (com.pinterest.feature.unifiedcomments.d) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                rp0.d comment = (rp0.d) obj2;
                rh1.k kVar4 = (rh1.k) view;
                kVar4.getClass();
                Intrinsics.checkNotNullParameter(comment, "comment");
                if (comment.g().length() > 0) {
                    ConstraintLayout constraintLayout = kVar4.P0;
                    if (constraintLayout == null) {
                        Intrinsics.r("commentPhotoDetailLayout");
                        throw null;
                    }
                    bs1.c.U1(constraintLayout);
                    CommentComposerView.T(kVar4.Y8());
                    WebImageView webImageView = kVar4.Q0;
                    if (webImageView == null) {
                        Intrinsics.r("commentPhotoDetailImageView");
                        throw null;
                    }
                    webImageView.f52569u = true;
                    webImageView.loadUrl(comment.g());
                    bs1.c.X0(kVar4.X8());
                } else if (comment.f().length() > 0) {
                    ConstraintLayout constraintLayout2 = kVar4.P0;
                    if (constraintLayout2 == null) {
                        Intrinsics.r("commentPhotoDetailLayout");
                        throw null;
                    }
                    bs1.c.U1(constraintLayout2);
                    CommentComposerView.T(kVar4.Y8());
                    WebImageView webImageView2 = kVar4.Q0;
                    if (webImageView2 == null) {
                        Intrinsics.r("commentPhotoDetailImageView");
                        throw null;
                    }
                    webImageView2.t2(new File(comment.f()));
                    bs1.c.X0(kVar4.X8());
                }
                return Unit.f80348a;
            case 26:
                j((Throwable) obj);
                return Unit.f80348a;
            case 27:
                return h((rn1.a) obj);
            case 28:
                return i((yl1.b) obj);
            default:
                return e((om1.c) obj);
        }
    }

    public final void j(Throwable th3) {
        int i13 = this.f129492i;
        Object obj = this.f129493j;
        switch (i13) {
            case 6:
                kf1.b bVar = (kf1.b) obj;
                bVar.f79354f = false;
                bVar.f79350b.q(th3, "Error while cleanup media items", tb0.p.IDEA_PINS_CREATION);
                break;
            default:
                ep.b.C(null, ((qh1.e) obj).f103900a);
                break;
        }
    }

    public final void l(l82.n start) {
        int i13 = this.f129492i;
        Object obj = this.f129493j;
        switch (i13) {
            case 21:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                com.pinterest.feature.unauth.sba.s0 s0Var = (com.pinterest.feature.unauth.sba.s0) obj;
                mb0.a aVar = (mb0.a) s0Var.f48868d.f63225b;
                start.a(aVar, new rb1.w(14), aVar.a());
                lh1.d dVar = s0Var.f48867c;
                start.a(dVar, new rb1.w(15), dVar.a());
                break;
            default:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                jh1.h hVar = (jh1.h) obj;
                kh1.c cVar = hVar.f76234c;
                start.a(cVar, new rb1.w(16), cVar.a());
                k92.l lVar = hVar.f76236e;
                start.a(lVar, new rb1.w(17), lVar.a());
                zy.d0 d0Var = hVar.f76235d;
                start.a(d0Var, new rb1.w(18), d0Var.a());
                break;
        }
    }
}
