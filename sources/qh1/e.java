package qh1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import ck2.i;
import com.pinterest.api.model.az0;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wd;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.y2;
import com.pinterest.api.model.z2;
import com.pinterest.api.model.zy0;
import com.pinterest.error.NetworkResponseError;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import h32.a4;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.u0;
import h32.v0;
import h32.x3;
import i01.r0;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import kh2.k3;
import kl2.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lb0.r;
import lh0.m0;
import m60.w;
import m60.x0;
import net.quikkly.android.utils.BitmapUtils;
import nx.d0;
import nx.d1;
import oh1.h;
import oh1.k;
import rh1.s;
import so.b6;
import so.d6;
import so.oa;
import so.r8;
import uj2.q;
import up0.l;
import vb0.j;
import x02.g1;
import x02.i1;
import x02.i2;
import x02.p1;
import x02.u;
import xk2.m;
import xk2.v;
import z9.n;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final w f103900a;

    /* renamed from: b, reason: collision with root package name */
    public final c30.a f103901b;

    /* renamed from: c, reason: collision with root package name */
    public final b6 f103902c;

    /* renamed from: d, reason: collision with root package name */
    public final d6 f103903d;

    /* renamed from: e, reason: collision with root package name */
    public final m0 f103904e;

    /* renamed from: f, reason: collision with root package name */
    public final l22.a f103905f;

    /* renamed from: g, reason: collision with root package name */
    public final r f103906g;

    /* renamed from: h, reason: collision with root package name */
    public final u f103907h;

    /* renamed from: i, reason: collision with root package name */
    public final p1 f103908i;

    /* renamed from: j, reason: collision with root package name */
    public final i2 f103909j;

    /* renamed from: k, reason: collision with root package name */
    public final d1 f103910k;

    /* renamed from: l, reason: collision with root package name */
    public final l f103911l;

    /* renamed from: m, reason: collision with root package name */
    public final b60.b f103912m;

    /* renamed from: n, reason: collision with root package name */
    public final v f103913n;

    public e(w eventManager, c30.a userStateService, b6 commentCodeModalFactory, d6 commentReactionEducationModalFactory, m0 experiments, l22.a didItService, r prefsManagerUser, u aggregatedCommentRepository, p1 didItRepository, i2 pinRepository, d1 trackingParamAttacher, l typeaheadTextUtility, b60.b activeUserManager) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(userStateService, "userStateService");
        Intrinsics.checkNotNullParameter(commentCodeModalFactory, "commentCodeModalFactory");
        Intrinsics.checkNotNullParameter(commentReactionEducationModalFactory, "commentReactionEducationModalFactory");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(didItService, "didItService");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        Intrinsics.checkNotNullParameter(aggregatedCommentRepository, "aggregatedCommentRepository");
        Intrinsics.checkNotNullParameter(didItRepository, "didItRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(typeaheadTextUtility, "typeaheadTextUtility");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f103900a = eventManager;
        this.f103901b = userStateService;
        this.f103902c = commentCodeModalFactory;
        this.f103903d = commentReactionEducationModalFactory;
        this.f103904e = experiments;
        this.f103905f = didItService;
        this.f103906g = prefsManagerUser;
        this.f103907h = aggregatedCommentRepository;
        this.f103908i = didItRepository;
        this.f103909j = pinRepository;
        this.f103910k = trackingParamAttacher;
        this.f103911l = typeaheadTextUtility;
        this.f103912m = activeUserManager;
        this.f103913n = m.b(new ee1.d(this, 16));
    }

    public static final void a(e eVar, d0 d0Var, uk1.d dVar, String str) {
        eVar.getClass();
        d0Var.U(new i0(dVar.j(), dVar.i(), null, dVar.f(), null, null), f1.COMMENTS_COMPOSER_CLOSED_WITH_POST, str, null, null, false);
    }

    public static xj2.c c(e eVar, d0 pinalytics, uk1.d presenterPinalytics, f30 validPin, Editable editable, String str, boolean z13, k postAction, oh1.v vVar, h hVar, int i13) {
        oh1.v vVar2 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : vVar;
        h hVar2 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : hVar;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(validPin, "validPin");
        Intrinsics.checkNotNullParameter(postAction, "postAction");
        String obj = StringsKt.i0(String.valueOf(editable)).toString();
        List list = q0.f80391a;
        if (editable != null) {
            list = eVar.g(editable);
        }
        String g13 = b40.g(validPin);
        String uid = validPin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        String uid2 = validPin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
        xj2.c F = eVar.f103907h.b0(g13, uid, obj, str, eVar.f103910k.c(uid2), list, z13).F(new oh1.a(19, new e.c(eVar, validPin, pinalytics, presenterPinalytics, vVar2, 14)), new oh1.a(20, new b(eVar, pinalytics, editable, postAction, 0)), new a(eVar, hVar2, 2), i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        return F;
    }

    public static xj2.c d(e eVar, d0 pinalytics, uk1.d presenterPinalytics, f30 pin, Editable editable, String imageSignature, String photoPath, boolean z13, k postAction, oh1.v vVar, h hVar, int i13) {
        oh1.v vVar2 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : vVar;
        h hVar2 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : hVar;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(pin, "validPin");
        Intrinsics.checkNotNullParameter(imageSignature, "imageSignature");
        Intrinsics.checkNotNullParameter(photoPath, "photoPath");
        Intrinsics.checkNotNullParameter(postAction, "postAction");
        String valueOf = String.valueOf(editable);
        Boolean valueOf2 = Boolean.valueOf(z13);
        int ordinal = az0.a.DEFAULT.ordinal();
        p1 p1Var = eVar.f103908i;
        p1Var.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        xj2.c F = p1Var.k(new g1(pin, imageSignature, valueOf, ordinal, null, null, null, valueOf2)).F(new oh1.a(17, new r60.d(eVar, pin, photoPath, pinalytics, presenterPinalytics, vVar2, 4)), new oh1.a(18, new b(eVar, pinalytics, editable, postAction, 1)), new a(eVar, hVar2, 1), i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        return F;
    }

    public static xj2.c f(e eVar, d0 pinalytics, uk1.d presenterPinalytics, f30 validPin, Editable editable, rp0.d replyTo, boolean z13, k postAction, oh1.v vVar, h hVar, int i13) {
        q a03;
        oh1.v vVar2 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : vVar;
        h hVar2 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : hVar;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(validPin, "validPin");
        Intrinsics.checkNotNullParameter(replyTo, "replyTo");
        Intrinsics.checkNotNullParameter(postAction, "postAction");
        String obj = StringsKt.i0(String.valueOf(editable)).toString();
        List list = q0.f80391a;
        if (editable != null) {
            list = eVar.g(editable);
        }
        List list2 = list;
        String m13 = replyTo.m();
        if (m13 == null) {
            m13 = replyTo.v();
        }
        String str = m13;
        String v13 = replyTo.m() != null ? replyTo.v() : null;
        boolean z14 = replyTo instanceof rp0.b;
        u uVar = eVar.f103907h;
        if (z14) {
            a03 = uVar.c0(str, obj, validPin.getUid(), v13, list2, z13);
        } else {
            if (!(replyTo instanceof rp0.c)) {
                throw new NoWhenBranchMatchedException();
            }
            a03 = u.a0(32, uVar, replyTo.v(), obj, validPin.getUid(), list2, z13);
        }
        xj2.c F = a03.F(new oh1.a(14, new r60.d(replyTo, eVar, pinalytics, presenterPinalytics, validPin, vVar2)), new oh1.a(15, new b(eVar, pinalytics, editable, postAction, 3)), new a(eVar, hVar2, 0), i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        return F;
    }

    public static boolean h(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        return ((b40.Q0(pin) || b40.X0(pin)) && hf0.b.q()) ? false : true;
    }

    public static void m(Editable editable, d0 d0Var, e eVar, Throwable th3, p pVar) {
        eVar.getClass();
        eVar.f103900a.d(new of0.a(null));
        if (!(th3 instanceof NetworkResponseError)) {
            j.f125466a.I(th3, "expected throwable to be a NetworkResponseError", tb0.p.COMMENTS_AND_TRIES);
        }
        if (editable != null) {
            eVar.i(editable, d0Var, null, null, null, null, th3, pVar);
        }
    }

    public final String b(wy0 user, boolean z13) {
        String z43;
        Intrinsics.checkNotNullParameter(user, "user");
        if (ai0.a.d(user, this.f103912m)) {
            z43 = user.U2();
            if (z43 == null) {
                return "";
            }
        } else {
            if (!z13) {
                return dl2.b.i1(user);
            }
            z43 = user.z4();
            if (z43 == null) {
                return "";
            }
        }
        return z43;
    }

    public final ek2.f e(d0 pinalytics, f30 validPin, Editable editable, rp0.d validComment, boolean z13, k postAction, Function1 function1) {
        List list;
        hk2.u uVar;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(validPin, "validPin");
        Intrinsics.checkNotNullParameter(validComment, "validComment");
        Intrinsics.checkNotNullParameter(postAction, "postAction");
        String text = StringsKt.i0(String.valueOf(editable)).toString();
        if (editable == null || (list = g(editable)) == null) {
            list = q0.f80391a;
        }
        List textTags = list;
        if (validComment instanceof rp0.b) {
            z2 model = ((rp0.b) validComment).f109053a;
            String uid = validPin.getUid();
            u uVar2 = this.f103907h;
            uVar2.getClass();
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(textTags, "textTags");
            String uid2 = model.getUid();
            Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
            x02.k kVar = new x02.k(uid2, z13, text, textTags, uid);
            y2 c03 = model.c0();
            c03.f43900w = text;
            boolean[] zArr = c03.f43903z;
            if (zArr.length > 22) {
                zArr[22] = true;
            }
            c03.f43899v = textTags;
            if (zArr.length > 21) {
                zArr[21] = true;
            }
            c03.f43887j = Boolean.TRUE;
            if (zArr.length > 9) {
                zArr[9] = true;
            }
            Unit unit = Unit.f80348a;
            uj2.l G = uVar2.G(kVar, c03.a());
            G.getClass();
            hk2.u uVar3 = new hk2.u(G);
            Intrinsics.checkNotNullExpressionValue(uVar3, "ignoreElement(...)");
            uVar = uVar3;
        } else {
            if (!(validComment instanceof rp0.c)) {
                throw new NoWhenBranchMatchedException();
            }
            az0 model2 = ((rp0.c) validComment).f109054a;
            String uid3 = validPin.getUid();
            p1 p1Var = this.f103908i;
            p1Var.getClass();
            Intrinsics.checkNotNullParameter(model2, "model");
            List list2 = n10.c.f88919a;
            Intrinsics.checkNotNullParameter(model2, "<this>");
            List L = model2.L();
            String str = L != null ? (String) CollectionsKt.firstOrNull(L) : null;
            if (str == null) {
                str = "";
            }
            String uid4 = model2.getUid();
            Intrinsics.checkNotNullExpressionValue(uid4, "getUid(...)");
            i1 i1Var = new i1(uid4, str, text, uid3);
            Intrinsics.checkNotNullParameter(model2, "<this>");
            zy0 V = model2.V();
            List list3 = V.f44518j;
            if (list3 != null) {
            }
            az0 a13 = V.a();
            Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
            zy0 V2 = a13.V();
            V2.f44512d = text;
            boolean[] zArr2 = V2.f44532x;
            if (zArr2.length > 3) {
                zArr2[3] = true;
            }
            uj2.l G2 = p1Var.G(i1Var, V2.a());
            G2.getClass();
            hk2.u uVar4 = new hk2.u(G2);
            Intrinsics.checkNotNullExpressionValue(uVar4, "ignoreElement(...)");
            uVar = uVar4;
        }
        ek2.f i13 = uVar.i(new px0.b(function1, validComment, text, textTags, 3), new oh1.a(16, new b(editable, this, pinalytics, postAction)));
        Intrinsics.checkNotNullExpressionValue(i13, "subscribe(...)");
        return i13;
    }

    public final List g(Editable comment) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        Editable newEditable = Editable.Factory.getInstance().newEditable(comment);
        if ((newEditable instanceof SpannableStringBuilder ? (SpannableStringBuilder) newEditable : null) == null) {
            return q0.f80391a;
        }
        Intrinsics.f(newEditable);
        this.f103911l.getClass();
        return l.e(l.i((SpannableStringBuilder) newEditable));
    }

    public final void i(Editable editable, d0 d0Var, rp0.d dVar, rp0.d dVar2, String str, String str2, Throwable th3, p pVar) {
        v.f1 f1Var;
        qz.d M;
        Integer num = null;
        NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
        if (networkResponseError != null && (f1Var = networkResponseError.f45043a) != null && (M = k3.M(f1Var)) != null) {
            num = Integer.valueOf(M.f105387g);
        }
        w wVar = this.f103900a;
        if (num != null && num.intValue() == 2915) {
            wVar.d(new jc0.v(new rh1.i1(d0Var, editable, str, str2, dVar, dVar2, false, pVar), false, 0L, 30));
        } else if (num != null && num.intValue() == 2986) {
            wVar.d(new jc0.v(new rh1.i1(d0Var, editable, str, str2, dVar, dVar2, true, pVar), false, 0L, 30));
        }
    }

    public final boolean k(d0 d0Var, Function0 onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        r rVar = this.f103906g;
        boolean f13 = rVar.f("PREF_COMMENT_CODE_MODAL_IS_ACCEPTED", false);
        int g13 = rVar.g("PREF_COMMENT_CODE_MODAL_VIEW_COUNT", 0);
        if (f13 || g13 != 0) {
            return false;
        }
        this.f103901b.c("COMMENT_CODE_VIEW_COUNT", 1).l(tk2.e.f118017c).h(wj2.c.a()).i(new r0(13), new oh1.a(13, c.f103894i));
        rVar.h("PREF_COMMENT_CODE_MODAL_VIEW_COUNT", 1);
        if (d0Var != null) {
            d0.v(d0Var, f1.COMMENT_CODE_VIEWED, null, false, 12);
        }
        r8 r8Var = this.f103902c.f113347a;
        c30.a U1 = oa.U1(r8Var.f114090a);
        oa oaVar = r8Var.f114090a;
        this.f103900a.d(new jc0.v(new gs0.a(onComplete, U1, (w) oaVar.f113885r0.get(), (uk1.e) oaVar.f113702ga.get(), (q) oaVar.f113947u9.get(), (r) oaVar.f113622c1.get()), false, 0L, 30));
        return true;
    }

    public final void l(Function0 onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        if (this.f103906g.f("PREF_COMMENT_REACTION_EDUCATION_IS_ACCEPTED", false)) {
            onComplete.invoke();
            return;
        }
        r8 r8Var = this.f103903d.f113384a;
        w wVar = (w) r8Var.f114090a.f113885r0.get();
        oa oaVar = r8Var.f114090a;
        this.f103900a.d(new jc0.v(new s(onComplete, wVar, (uk1.e) oaVar.f113702ga.get(), (r) oaVar.f113622c1.get(), (q) oaVar.f113947u9.get()), false, 0L, 30));
    }

    public final void n(d0 d0Var, String pinId, String apdId, u0 u0Var, g0 g0Var, String str, String str2, rp0.d dVar, String str3, String str4, boolean z13, String str5, wd wdVar, Boolean bool, boolean z14, boolean z15, boolean z16) {
        String str6;
        i0 p13;
        a4 a4Var;
        i0 p14;
        String str7;
        v0 v0Var;
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(apdId, "apdId");
        ((lh0.g1) this.f103904e.f83421a).c("ce_android_comment_composer_redesign");
        if (!z15 || d0Var == null) {
            str6 = str3;
        } else {
            f1 f1Var = f1.COMMUNITY_VIEW_INTENT;
            HashMap o13 = ep.b.o("pin_id", pinId);
            Unit unit = Unit.f80348a;
            String c13 = this.f103910k.c(pinId);
            if (c13 != null) {
                v0 v0Var2 = new v0();
                v0Var2.G = c13;
                v0Var = v0Var2;
            } else {
                v0Var = null;
            }
            str6 = str3;
            d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : pinId, (r18 & 32) != 0 ? null : o13, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? v0Var : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
        NavigationImpl L = Navigation.L(z16 ? (ScreenLocation) com.pinterest.screens.u0.f51403b.getValue() : (ScreenLocation) com.pinterest.screens.u0.f51404c.getValue(), z16 ? apdId : pinId, (hf0.b.q() || !((Boolean) this.f103913n.getValue()).booleanValue()) ? ml1.b.NO_TRANSITION.getValue() : ml1.b.DEFAULT_TRANSITION.getValue());
        L.m0("com.pinterest.EXTRA_PIN_ID", pinId);
        L.m0("com.pinterest.EXTRA_AGGREGATED_UID", apdId);
        L.Y1("com.pinterest.EXTRA_SHOW_KEYBOARD", !z16 || z14);
        if (str != null) {
            L.m0("com.pinterest.EXTRA_COMMENT_ID", str);
        }
        if (str2 != null) {
            L.m0("com.pinterest.EXTRA_COMMENT_TYPE", str2);
        }
        if (dVar != null) {
            L.m0("com.pinterest.EXTRA_COMPOSE_REPLY_TO_COMMENT_ID", dVar.v());
            L.m0("com.pinterest.EXTRA_COMPOSE_REPLY_TO_COMMENT_TYPE", dVar.k());
        }
        if (str6 != null) {
            L.m0("com.pinterest.EXTRA_COMMENT_TEXT", str6);
        }
        if (str4 != null) {
            L.m0("com.pinterest.EXTRA_COMMENT_HINT_TEXT", str4);
        }
        if (str5 != null) {
            L.m0("com.pinterest.EXTRA_PHOTO_PATH", str5);
        }
        if (wdVar != null) {
            L.m0("com.pinterest.EXTRA_PHOTO_PATH", wdVar.u());
            L.m0("com.pinterest.EXTRA_COMMENT_STICKER_ID", wdVar.getUid());
        }
        L.Y1("com.pinterest.EXTRA_COMMENT_GO_TO_THREAD_ON_POST", z13);
        if (Intrinsics.d(bool, Boolean.TRUE)) {
            L.m0("com.pinterest.EXTRA_COMMENT_VIEW_TYPE", "PIN");
        } else {
            L.m0("com.pinterest.EXTRA_COMMENT_VIEW_TYPE", "PIN_COMMENTS");
        }
        if (d0Var != null && (p14 = d0Var.p()) != null) {
            g0 g0Var2 = p14.f67084d;
            if (g0Var2 != null) {
                L.m0("com.pinterest.EXTRA_COMMENT_COMPONENT", g0Var2.name());
            }
            x3 x3Var = p14.f67083c;
            if (x3Var != null && (str7 = x3Var.f67413q) != null) {
                L.m0("com.pinterest.EXTRA_COMMENT_PARENT_PAIR_ID", str7);
            }
        }
        if (d0Var != null && (p13 = d0Var.p()) != null && (a4Var = p13.f67082b) != null) {
            L.m0("com.pinterest.EXTRA_COMMENT_VIEW_PARAMETER", a4Var.name());
        }
        if (k(d0Var, new p91.v(22, this, L))) {
            return;
        }
        this.f103900a.e(0L, L);
    }

    public final void p(Context context, String filePath, n onUpload) {
        Pair pair;
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(onUpload, "onUpload");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(filePath, options);
        int i13 = options.outWidth;
        if (i13 == 0) {
            pair = null;
        } else {
            int i14 = options.outHeight;
            int min = Math.min(i13, 1200);
            pair = new Pair(Integer.valueOf(min), Integer.valueOf((i14 / i13) * min));
        }
        if (pair != null) {
            try {
                bitmap = qb0.b.k(context, Uri.fromFile(new File(filePath)), ((Number) pair.f80346a).intValue(), ((Number) pair.f80347b).intValue());
            } catch (OutOfMemoryError unused) {
                bitmap = null;
            }
            if (bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
                return;
            }
            mf0.l lVar = new mf0.l();
            int i15 = x0.notification_uploading;
            Context context2 = lVar.getContext();
            lVar.q7(context2 != null ? context2.getString(i15) : null);
            this.f103900a.d(new of0.a(lVar));
            new d(bitmap, this, onUpload).b();
        }
    }
}
