package lr;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import df.j1;
import h32.f1;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import rg0.i0;

/* loaded from: classes3.dex */
public final class l extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f84519d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84520e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84521f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84522g;

    /* renamed from: h, reason: collision with root package name */
    public final int f84523h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f84524i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f84525j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f84526k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f84527l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f84528m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f84529n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(String str, String str2) {
        this(null, "", str, 1, null, null, null);
        this.f84519d = 1;
        this.f84524i = str2;
    }

    public static Unit d(l lVar, PinterestToastContainer pinterestToastContainer, GestaltToast gestaltToast) {
        View view;
        lVar.getClass();
        pinterestToastContainer.f(gestaltToast);
        Context context = pinterestToastContainer.getContext();
        switch (lVar.f84519d) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                nx.d0 d0Var = (nx.d0) lVar.f84525j;
                String contactRequestId = lVar.f84521f;
                if (d0Var != null) {
                    d0Var.g(f1.DECLINE_CONTACT_REQUEST_UNDO_CLICK, contactRequestId, new bg.f(lVar), false);
                }
                String str = lVar.f84520e;
                if (str == null && (view = (View) lVar.f84524i) != null) {
                    view.setClickable(true);
                    fp.b bVar = (fp.b) lVar.f84526k;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(contactRequestId, "contactRequestId");
                    bVar.f62754a.remove(contactRequestId);
                    ((m60.w) lVar.f84527l).d(new kp.g(lVar.f84523h, (View) lVar.f84524i, null));
                } else if (str != null) {
                    ((m60.w) lVar.f84527l).f(new pg0.q());
                    ((m60.w) lVar.f84527l).d(new pg0.a(contactRequestId, true));
                }
                ((m60.w) lVar.f84527l).d(new pg0.r(contactRequestId, true));
                break;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                break;
        }
        return Unit.f80348a;
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer pinterestToastContainer) {
        switch (this.f84519d) {
            case 0:
                GestaltToast gestaltToast = new GestaltToast(pinterestToastContainer.getContext());
                gestaltToast.v(new eq.a(this, pinterestToastContainer, gestaltToast, 2));
                return gestaltToast;
            default:
                Resources resources = pinterestToastContainer.getResources();
                String string = this.f84520e == null ? resources.getString(x0.profile) : this.f84521f;
                int i13 = this.f84523h;
                String quantityString = i13 > 1 ? pk.a0.x0(string) ? resources.getQuantityString(f02.f.pinned_multiple, i13, Integer.valueOf(i13)) : resources.getQuantityString(f02.f.pinned_multiple_to_board, i13, Integer.valueOf(i13), j1.X("<b>%s</b>", string)) : pk.a0.x0(string) ? resources.getString(x0.pinned) : resources.getString(x0.saved_onto_board_bold, string);
                String str = (String) this.f84525j;
                if (str != null) {
                    quantityString = j1.X("%s\n%s", quantityString, str);
                }
                GestaltToast gestaltToast2 = new GestaltToast(pinterestToastContainer.getContext());
                bs1.c.s2(gestaltToast2, j1.a0(quantityString));
                gestaltToast2.v(new yq.k(4, this, quantityString));
                return gestaltToast2;
        }
    }

    @Override // we0.a
    public final void b(Context context) {
        switch (this.f84519d) {
            case 1:
                String boardId = this.f84520e;
                if (boardId == null) {
                    String userId = (String) this.f84524i;
                    if (userId != null) {
                        m60.w wVar = m60.u.f85943a;
                        r41.k kVar = r41.k.f106176a;
                        r41.b aopOrigin = r41.b.PinnedToast;
                        r41.g origin = r41.g.Other;
                        Intrinsics.checkNotNullParameter(userId, "userId");
                        Intrinsics.checkNotNullParameter(aopOrigin, "aopOrigin");
                        Intrinsics.checkNotNullParameter(origin, "origin");
                        wVar.d(r41.k.c(kVar, userId, aopOrigin, origin, null, 24));
                    }
                } else {
                    g70.h hVar = (g70.h) this.f84529n;
                    g70.b override = g70.b.NONE;
                    xo.j applyExtras = new xo.j(21);
                    hVar.getClass();
                    Intrinsics.checkNotNullParameter(boardId, "boardId");
                    Intrinsics.checkNotNullParameter(override, "override");
                    Intrinsics.checkNotNullParameter(applyExtras, "applyExtras");
                    hVar.d(boardId, override, applyExtras, new g70.g(hVar, 0));
                }
                if (bs1.c.c1(context)) {
                    Activity k03 = bs1.c.k0(context);
                    if (k03 instanceof np.a) {
                        k03.finish();
                        break;
                    }
                }
                break;
            default:
                super.b(context);
                break;
        }
    }

    @Override // we0.a
    public final void c(Context context) {
        switch (this.f84519d) {
            case 0:
                super.c(context);
                Object obj = this.f84529n;
                String str = this.f84521f;
                String str2 = this.f84520e;
                if (str2 == null) {
                    ((p12.b) obj).a(str);
                    ((m60.w) this.f84527l).d(new pg0.r(str, false));
                    break;
                } else {
                    new ik2.b(0, ((p12.b) obj).a(str).l(tk2.e.f118017c).h(wj2.c.a()), ((dl1.l) ((dl1.t) this.f84528m)).P(str2)).F(new xo.a(this, 7), new xo.l(15), ck2.i.f27923c, ck2.i.f27924d);
                    break;
                }
            default:
                String str3 = (String) this.f84526k;
                if (str3 != null) {
                    i0.f108029b.u0(str3);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(String str, String str2, String str3, int i13, String str4, g70.h hVar) {
        this(str, str2, str3, i13, str4, null, hVar);
        this.f84519d = 1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(String str, String str2, String str3, String str4, do1.b bVar, g70.h hVar) {
        this(str, str2, str3, 1, str4, hVar);
        this.f84519d = 1;
        this.f84527l = bVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(String str, String str2, String str3, String str4, g70.h hVar) {
        this(str, str2, str3, 1, str4, hVar);
        this.f84519d = 1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(String str, String str2, String str3, String str4, String str5, g70.h hVar) {
        this(str, str2, str3, 1, str5, str4, hVar);
        this.f84519d = 1;
        this.f84528m = 5000;
    }

    public l(String str, String contactRequestId, int i13, String str2, View view, nx.d0 d0Var, fp.b bVar, m60.w wVar, dl1.t tVar, p12.b bVar2) {
        this.f84519d = 0;
        this.f84522g = str;
        this.f84521f = contactRequestId;
        this.f84523h = i13;
        this.f84520e = str2;
        this.f84524i = view;
        this.f84525j = d0Var;
        this.f84526k = bVar;
        this.f84527l = wVar;
        this.f84528m = tVar;
        this.f84529n = bVar2;
        if (str2 == null && view != null) {
            view.setClickable(false);
            bVar.getClass();
            Intrinsics.checkNotNullParameter(contactRequestId, "contactRequestId");
            bVar.f62754a.add(contactRequestId);
        }
        ((m60.w) this.f84527l).d(new pg0.r(contactRequestId, false));
    }

    public l(String str, String str2, String str3, int i13, String str4, String str5, g70.h hVar) {
        this.f84519d = 1;
        this.f84524i = null;
        this.f84527l = null;
        this.f84528m = 5000;
        this.f84520e = str;
        this.f84521f = str2;
        this.f84522g = str3;
        this.f84523h = i13;
        this.f84525j = str5;
        this.f84526k = str4;
        this.f84529n = hVar;
    }
}
