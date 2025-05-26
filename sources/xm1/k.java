package xm1;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.w0;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.modalAlert.GestaltModalAlert;
import com.pinterest.gestalt.radioGroup.GestaltRadio;
import com.pinterest.gestalt.radioGroup.GestaltRadioButton;
import com.pinterest.gestalt.radioGroup.GestaltRadioGroup;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import com.pinterest.gestalt.sheet.header.GestaltSheetHeader;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.splitButton.view.GestaltSplitButton;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import com.pinterest.gestalt.tag.GestaltTag;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.text.previewText.GestaltPreviewTextView;
import com.pinterest.gestalt.toast.GestaltToast;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.identity.UnauthActivity;
import com.pinterest.identity.core.error.AccountException;
import com.pinterest.identity.core.error.UnauthException;
import df.j1;
import h32.f1;
import is1.b0;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.x0;
import nx.d0;
import pk.a0;
import q5.x;
import rl1.c0;
import rl1.t;
import so.oa;
import u50.f0;
import u50.i0;
import u50.k0;
import yq1.s2;
import yq1.y1;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135383i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f135384j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f135385k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i13, Object obj, Object obj2) {
        super(1);
        this.f135383i = i13;
        this.f135384j = obj;
        this.f135385k = obj2;
    }

    public final rn1.a b(rn1.a titleState) {
        int i13 = this.f135383i;
        Object obj = this.f135385k;
        Object obj2 = this.f135384j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(titleState, "titleState");
                i0 i0Var = ((e) obj2).f135363a;
                f0 f0Var = GestaltModalAlert.f49438l;
                Context context = ((GestaltModalAlert) obj).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return rn1.a.y(titleState, i0Var, null, null, null, dl2.b.f1(context) == g92.d.VR ? vn1.g.HEADING_400 : vn1.g.HEADING_600, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
            case 3:
                Intrinsics.checkNotNullParameter(titleState, "state");
                i0 i0Var2 = (i0) obj2;
                Context context2 = ((GestaltRadioButton) obj).getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return rn1.a.y(titleState, i0Var2, null, null, null, null, 0, d7.b.Z(true ^ bs1.c.e1(i0Var2, context2)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 5:
                Intrinsics.checkNotNullParameter(titleState, "state");
                String str = (String) obj2;
                f0 x13 = ep.b.x(str, "string", str);
                vn1.g gVar = vn1.g.BODY_100;
                fm1.c Z = d7.b.Z(str.length() > 0);
                vn1.c cVar = GestaltStaticSearchBar.f49525q;
                return rn1.a.y(titleState, x13, null, null, null, gVar, 0, Z, null, null, null, false, 0, null, null, null, null, Integer.valueOf(((GestaltStaticSearchBar) obj).z0().getId()), false, null, null, 2031534);
            case 7:
                Intrinsics.checkNotNullParameter(titleState, "oldTextState");
                i0 i0Var3 = (i0) obj2;
                if (i0Var3 == null) {
                    return rn1.a.y(titleState, null, null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
                }
                Context context3 = ((GestaltSheetHeader) obj).getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                return rn1.a.y(titleState, i0Var3, null, null, null, null, 3, i0Var3.a(context3).length() == 0 ? fm1.c.GONE : fm1.c.VISIBLE, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096926);
            case 11:
                Intrinsics.checkNotNullParameter(titleState, "it");
                f0 f0Var2 = (f0) obj;
                return rn1.a.y(titleState, f0Var2, vn1.c.DEFAULT, ((on1.k) obj2).f96744e.toGestaltTextAlignment$switchComponent_release(), null, vn1.g.HEADING_300, 0, null, null, null, null, false, 0, f0Var2, null, null, null, null, false, null, null, 2093032);
            case 16:
                Intrinsics.checkNotNullParameter(titleState, "it");
                CharSequence charSequence = (CharSequence) obj2;
                f0 h23 = bs1.c.h2(charSequence == null ? "" : charSequence);
                if (charSequence == null) {
                    charSequence = "";
                }
                return rn1.a.y(titleState, h23, null, null, null, null, 0, (fm1.c) obj, null, null, null, false, 0, bs1.c.h2(charSequence), null, null, null, null, false, null, null, 2092990);
            case 17:
                Intrinsics.checkNotNullParameter(titleState, "it");
                return rn1.a.y(titleState, bs1.c.h2(((GestaltToolbarImpl) obj2).f49701a), null, null, e0.b(vn1.e.BOLD), a0.w((Context) obj), 2, fm1.c.GONE, rn1.b.END, null, null, false, 0, null, null, null, null, null, true, null, null, 1965830);
            case 21:
                Intrinsics.checkNotNullParameter(titleState, "it");
                fm1.c cVar2 = fm1.c.VISIBLE;
                Resources resources = ((yq1.k) obj2).getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                return rn1.a.y(titleState, bs1.c.h2(gp1.e.b(resources, (String) obj)), null, null, null, null, 0, cVar2, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            default:
                Intrinsics.checkNotNullParameter(titleState, "it");
                Spanned fromHtml = Html.fromHtml(j1.U((String) obj2, new Object[]{((fw1.i) obj).f63059l}), 63);
                Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
                return rn1.a.y(titleState, bs1.c.h2(fromHtml), null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096126);
        }
    }

    public final void e(Throwable th3) {
        String error;
        int i13 = this.f135383i;
        Object obj = this.f135384j;
        Object obj2 = this.f135385k;
        switch (i13) {
            case 20:
                com.pinterest.identity.account.k kVar = (com.pinterest.identity.account.k) obj;
                androidx.appcompat.app.n nVar = (androidx.appcompat.app.n) obj2;
                Intrinsics.f(th3);
                kVar.getClass();
                if (th3 instanceof AccountException.UnlinkAccountError.InvalidEmailAddress) {
                    error = nVar.getString(x0.unlink_ba_email_password_invalid_email_address);
                    Intrinsics.f(error);
                } else if (th3 instanceof AccountException.UnlinkAccountError.InvalidPasswordOrConfirmation) {
                    error = nVar.getString(x0.unlink_ba_email_password_invalid_password_or_conformation);
                    Intrinsics.f(error);
                } else if (th3 instanceof AccountException.UnlinkAccountError.UserSettingsConstraintsError) {
                    error = nVar.getString(x0.unlink_ba_email_password_user_settings_constraints_error);
                    Intrinsics.f(error);
                } else if (th3 instanceof AccountException.UnlinkAccountError.BusinessOrOwnerAccountError) {
                    error = nVar.getString(x0.unlink_ba_email_password_business_or_owner_account_not_found);
                    Intrinsics.f(error);
                } else if (th3 instanceof AccountException.UnlinkAccountError.EmailAlreadyTakenError) {
                    error = nVar.getString(x0.unlink_ba_email_password_email_already_taken_error);
                    Intrinsics.f(error);
                } else {
                    error = nVar.getString(x0.generic_error);
                    Intrinsics.f(error);
                }
                com.pinterest.identity.account.h hVar = (com.pinterest.identity.account.h) ((com.pinterest.identity.account.d) kVar.getView());
                hVar.getClass();
                Intrinsics.checkNotNullParameter(error, "error");
                d0.v(hVar.s7(), f1.UNLINK_ACCOUNT_FAILED, null, false, 12);
                hVar.f7().g(1000L, new i92.i(new i92.f(error, 5000)));
                break;
            case 22:
                Intrinsics.f(th3);
                ((zq1.j) obj).t3(th3, (lr1.h) obj2);
                break;
            case 26:
                uk2.f fVar = ((is1.i0) obj).f73606b;
                Intrinsics.f(th3);
                fVar.c(new b0((String) obj2, th3));
                break;
            default:
                ((zt1.g) ((yt1.a) ((ed1.f) obj2).getView())).f142779a.getClass();
                a.c.y(m60.u.f85943a);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f135383i;
        final int i14 = 0;
        final int i15 = 1;
        Object obj2 = this.f135385k;
        Object obj3 = this.f135384j;
        switch (i13) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                an1.b newState = (an1.b) obj;
                Intrinsics.checkNotNullParameter(newState, "newState");
                fm1.c cVar = GestaltRadio.f49479f;
                ((GestaltRadio) obj3).d((an1.b) obj2, newState);
                return Unit.f80348a;
            case 2:
                an1.e newState2 = (an1.e) obj;
                Intrinsics.checkNotNullParameter(newState2, "newState");
                int i16 = GestaltRadioButton.f49481g;
                ((GestaltRadioButton) obj3).Z((an1.e) obj2, newState2);
                return Unit.f80348a;
            case 3:
                return b((rn1.a) obj);
            case 4:
                an1.l newState3 = (an1.l) obj;
                Intrinsics.checkNotNullParameter(newState3, "newState");
                fm1.c cVar2 = GestaltRadioGroup.f49488x;
                ((GestaltRadioGroup) obj3).v((an1.l) obj2, newState3);
                return Unit.f80348a;
            case 5:
                return b((rn1.a) obj);
            case 6:
                om1.q bind = (om1.q) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a((rm1.q) obj3);
                bind.f96680e = (k0) obj2;
                bind.e(fm1.c.VISIBLE);
                return Unit.f80348a;
            case 7:
                return b((rn1.a) obj);
            case 8:
                rn1.k bind2 = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                i0 i0Var = (i0) obj3;
                bind2.g(i0Var);
                bind2.h(vn1.g.BODY_200);
                Context context = ((GestaltSpinner) obj2).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                bind2.f108892g = z.j(i0Var.a(context)) ^ true ? fm1.c.VISIBLE : fm1.c.GONE;
                return Unit.f80348a;
            case 9:
                nn1.b newState4 = (nn1.b) obj;
                Intrinsics.checkNotNullParameter(newState4, "newState");
                rn1.b bVar = GestaltSplitButton.f49606d;
                ((GestaltSplitButton) obj3).Z((nn1.b) obj2, newState4);
                return Unit.f80348a;
            case 10:
                on1.b newState5 = (on1.b) obj;
                Intrinsics.checkNotNullParameter(newState5, "newState");
                fm1.c cVar3 = GestaltSwitch.L;
                ((GestaltSwitch) obj3).k((on1.b) obj2, newState5);
                return Unit.f80348a;
            case 11:
                return b((rn1.a) obj);
            case 12:
                qn1.b newState6 = (qn1.b) obj;
                Intrinsics.checkNotNullParameter(newState6, "newState");
                qn1.c cVar4 = GestaltTag.f49633c;
                ((GestaltTag) obj3).j((qn1.b) obj2, newState6);
                return Unit.f80348a;
            case 13:
                un1.c newState7 = (un1.c) obj;
                Intrinsics.checkNotNullParameter(newState7, "newState");
                int i17 = GestaltPreviewTextView.f49643g;
                ((GestaltPreviewTextView) obj3).n((un1.c) obj2, newState7);
                return Unit.f80348a;
            case 14:
                c0 bind3 = (c0) obj;
                Intrinsics.checkNotNullParameter(bind3, "$this$bind");
                fm1.c visibility = fm1.c.VISIBLE;
                bind3.getClass();
                Intrinsics.checkNotNullParameter(visibility, "visibility");
                bind3.f108535h = visibility;
                do1.e eVar = (do1.e) obj3;
                String imageUrl = eVar.f55674a;
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                bind3.f108528a = imageUrl;
                String name = eVar.f55675b;
                Intrinsics.checkNotNullParameter(name, "name");
                bind3.f108529b = name;
                bind3.f108530c = false;
                rl1.r size = rl1.r.MD;
                Intrinsics.checkNotNullParameter(size, "size");
                bind3.f108531d = size;
                Integer num = eVar.f55676c;
                rl1.c backgroundColor = num == null ? rl1.b.f108524a : new rl1.d(num.intValue());
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                bind3.f108537j = backgroundColor;
                String string = ((GestaltToast) obj2).getResources().getString(do1.b0.content_description_user_avatar, name);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                bind3.a(string);
                bind3.f108536i = do1.z.avatar;
                return Unit.f80348a;
            case 15:
                Intrinsics.checkNotNullParameter((yl1.b) obj, "it");
                i0 i0Var2 = ((do1.b) obj3).f55663a;
                do1.c cVar5 = ((GestaltToast) obj2).f49695v;
                if (cVar5 != null) {
                    return new yl1.b(i0Var2, false, null, null, cVar5.getValue().getColorPalette(), yl1.c.SMALL, null, null, do1.z.action_button, null, 718);
                }
                Intrinsics.r("buttonVariant");
                throw null;
            case 16:
                return b((rn1.a) obj);
            case 17:
                return b((rn1.a) obj);
            case 18:
                int intValue = ((Number) obj).intValue();
                if (((cp1.p) obj3).getToastContainer() != null) {
                    m92.d dVar = (m92.d) obj2;
                    ViewGroup.LayoutParams layoutParams = dVar.getLayoutParams();
                    Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.bottomMargin = intValue;
                    dVar.setLayoutParams(layoutParams2);
                }
                return Unit.f80348a;
            case 19:
                wy0 wy0Var = (wy0) obj;
                Intrinsics.f(wy0Var);
                String imageUrl2 = dl2.b.u0(wy0Var);
                final String userId = wy0Var.getUid();
                Intrinsics.checkNotNullExpressionValue(userId, "getUid(...)");
                String z43 = wy0Var.z4();
                String userInitial = dl2.b.M0(wy0Var);
                Integer q23 = wy0Var.q2();
                Intrinsics.checkNotNullExpressionValue(q23, "getAvatarColorIndex(...)");
                int intValue2 = q23.intValue();
                jq1.n nVar = (jq1.n) ((gq1.c) obj3);
                nVar.getClass();
                Intrinsics.checkNotNullParameter(imageUrl2, "imageUrl");
                Intrinsics.checkNotNullParameter(userId, "userId");
                Intrinsics.checkNotNullParameter(userInitial, "userInitial");
                GestaltAvatar gestaltAvatar = nVar.f77509p1;
                if (gestaltAvatar == null) {
                    Intrinsics.r("creatorAvatar");
                    throw null;
                }
                gestaltAvatar.H2(new mp.d(z43, userInitial, intValue2, imageUrl2));
                gestaltAvatar.M2(new gm1.a() { // from class: jq1.i
                    @Override // gm1.a
                    public final void h3(gm1.c event) {
                        int i18 = i14;
                        String userId2 = userId;
                        switch (i18) {
                            case 0:
                                int i19 = n.H1;
                                Intrinsics.checkNotNullParameter(userId2, "$userId");
                                Intrinsics.checkNotNullParameter(event, "event");
                                if (event instanceof t) {
                                    r41.k.f106176a.d(userId2, r41.b.IdeaPinBottomSheet);
                                    break;
                                }
                                break;
                            default:
                                int i23 = n.H1;
                                Intrinsics.checkNotNullParameter(userId2, "$userId");
                                Intrinsics.checkNotNullParameter(event, "it");
                                r41.k.f106176a.d(userId2, r41.b.IdeaPinBottomSheet);
                                break;
                        }
                    }
                });
                if (z43 != null) {
                    GestaltText gestaltText = nVar.f77510q1;
                    if (gestaltText == null) {
                        Intrinsics.r("creatorName");
                        throw null;
                    }
                    gestaltText.i(new jq1.m(nVar, z43)).j(new gm1.a() { // from class: jq1.i
                        @Override // gm1.a
                        public final void h3(gm1.c event) {
                            int i18 = i15;
                            String userId2 = userId;
                            switch (i18) {
                                case 0:
                                    int i19 = n.H1;
                                    Intrinsics.checkNotNullParameter(userId2, "$userId");
                                    Intrinsics.checkNotNullParameter(event, "event");
                                    if (event instanceof t) {
                                        r41.k.f106176a.d(userId2, r41.b.IdeaPinBottomSheet);
                                        break;
                                    }
                                    break;
                                default:
                                    int i23 = n.H1;
                                    Intrinsics.checkNotNullParameter(userId2, "$userId");
                                    Intrinsics.checkNotNullParameter(event, "it");
                                    r41.k.f106176a.d(userId2, r41.b.IdeaPinBottomSheet);
                                    break;
                            }
                        }
                    });
                }
                ca2.e D9 = nVar.D9();
                View view = D9.f27254m;
                if (view != null) {
                    x.a(view, new s.f(view, nVar, D9, 25, 0));
                }
                ((iq1.e) obj2).getPinalytics().z(null);
                return Unit.f80348a;
            case 20:
                e((Throwable) obj);
                return Unit.f80348a;
            case 21:
                return b((rn1.a) obj);
            case 22:
                e((Throwable) obj);
                return Unit.f80348a;
            case 23:
                Boolean bool = (Boolean) obj;
                Intrinsics.f(bool);
                if (bool.booleanValue()) {
                    zq1.f0 f0Var = (zq1.f0) obj3;
                    ep.b.C(null, f0Var.f142671d);
                    String email = (String) obj2;
                    com.pinterest.identity.authentication.a aVar = f0Var.f142672e;
                    aVar.getClass();
                    Intrinsics.checkNotNullParameter(email, "email");
                    androidx.appcompat.app.n nVar2 = aVar.f49817b;
                    if (nVar2 instanceof UnauthActivity) {
                        w0 supportFragmentManager = ((UnauthActivity) nVar2).getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                        int i18 = nVar2 instanceof MainActivity ? tr.b.main_container : vq1.b.fragment_wrapper;
                        mu1.a aVar2 = (mu1.a) d7.b.R(nVar2);
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(s2.class, "fragmentClass");
                        s2 s2Var = (s2) aVar2.f(s2.class);
                        kh2.d.h(s2Var, email, null);
                        mo1.c.c(supportFragmentManager, i18, s2Var, true, mo1.a.FADE, 32);
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("com.pinterest.EXTRA_BLOCK_AUTOLOGIN", true);
                        bundle.putBoolean("EXTRA_UNAUTH_LOGIN", true);
                        bundle.putString("EXTRA_EMAIL", email);
                        Unit unit = Unit.f80348a;
                        ((lu1.c) aVar.f49821f).q(nVar2, bundle);
                    }
                } else {
                    ((y1) ((zq1.a0) ((zq1.f0) obj3).getView())).c8(ar1.d.PASSWORD_STEP);
                }
                return Unit.f80348a;
            case 24:
                qr1.b bVar2 = (qr1.b) obj;
                Intrinsics.checkNotNullParameter(bVar2, "<name for destructuring parameter 0>");
                final int i19 = bVar2.f104974a;
                final hr1.l lVar = (hr1.l) obj3;
                final le.m mVar = (le.m) obj2;
                final int i23 = bVar2.f104975b;
                final Intent intent = bVar2.f104976c;
                return new kk2.b(new uj2.e0() { // from class: hr1.n
                    @Override // uj2.e0
                    public final void g(kk2.a emitter) {
                        l callback = l.this;
                        Intrinsics.checkNotNullParameter(callback, "$callback");
                        le.m callbackManager = mVar;
                        Intrinsics.checkNotNullParameter(callbackManager, "$callbackManager");
                        Intrinsics.checkNotNullParameter(emitter, "emitter");
                        callback.getClass();
                        Intrinsics.checkNotNullParameter(emitter, "<set-?>");
                        callback.f70002a = emitter;
                        ((df.j) callbackManager).a(i19, i23, intent);
                    }
                }, 0);
            case 25:
                Throwable throwable = (Throwable) obj;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                if (!(throwable instanceof UnauthException.AuthenticationError.UserNotFoundError)) {
                    return uj2.b0.g(throwable);
                }
                jr1.f fVar = (jr1.f) obj3;
                jr1.b lineLoginResult = (jr1.b) obj2;
                Intrinsics.checkNotNullExpressionValue(lineLoginResult, "$lineLoginResult");
                fVar.getClass();
                String str = lineLoginResult.f77548b;
                oa oaVar = fVar.f77555j.f113567a.f113568a;
                sr1.d dVar2 = new sr1.d(str, lineLoginResult.f77547a);
                dVar2.f115120e = (cr1.b) oaVar.Z5.get();
                dVar2.f115121f = (or1.i) oaVar.f114015y5.get();
                dVar2.f115122g = (b60.b) oaVar.f113850p0.get();
                dVar2.f115123h = (tr1.a) oaVar.f113734i6.get();
                dVar2.f115124i = (fr1.c) oaVar.f113821n6.get();
                return dVar2.b();
            case 26:
                e((Throwable) obj);
                return Unit.f80348a;
            case 27:
                e((Throwable) obj);
                return Unit.f80348a;
            case 28:
                jb2.b it = (jb2.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return jb2.b.e(it, null, null, false, 0.0f, null, false, new jb2.c((Integer) obj3, (Integer) obj2), 0, 383);
            default:
                return b((rn1.a) obj);
        }
    }
}
