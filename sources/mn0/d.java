package mn0;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.f30;
import com.pinterest.error.NetworkResponseError;
import com.pinterest.feature.gridactions.pingridhide.view.PinGridHideView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import df.j1;
import i91.h0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import je.v2;
import jk2.d0;
import kh2.k3;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;
import lr.j;
import m60.x0;
import n60.o;
import nx.b0;
import sk0.x;
import so.oa;
import sv.y;
import tb0.p;
import v.f1;
import yk1.i;

/* loaded from: classes5.dex */
public final class d extends rk2.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f87759b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f87760c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f87761d;

    public /* synthetic */ d(int i13, Object obj, Object obj2) {
        this.f87759b = i13;
        this.f87760c = obj;
        this.f87761d = obj2;
    }

    @Override // rk2.c
    public final void a() {
        switch (this.f87759b) {
            case 2:
                y42.g gVar = (y42.g) this.f87761d;
                gVar.f137726i++;
                gVar.c(x0.notification_uploading);
                break;
        }
    }

    public final void c(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        e eVar = (e) this.f87760c;
        e.p3(eVar, pin, eVar.f87763b);
        ba baVar = (ba) this.f87761d;
        try {
            eVar.f87772k.P(eVar.f87763b).d(new d0(new hk2.b(new xl0.a(8, new y(pin, baVar, eVar, 27)), new xl0.a(9, new x(16, eVar, pin)), new fp.a(8, eVar, pin)), 0L));
            if (eVar.isBound()) {
                ln0.b bVar = (ln0.b) eVar.getView();
                String boardSectionId = baVar.getUid();
                Intrinsics.checkNotNullExpressionValue(boardSectionId, "getUid(...)");
                String boardSectionTitle = baVar.A();
                Intrinsics.checkNotNullExpressionValue(boardSectionTitle, "getTitle(...)");
                rn0.e eVar2 = (rn0.e) bVar;
                eVar2.getClass();
                Intrinsics.checkNotNullParameter(boardSectionId, "boardSectionId");
                Intrinsics.checkNotNullParameter(boardSectionTitle, "boardSectionTitle");
                String string = eVar2.getResources().getString(l70.d.saved_to_board_section);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String Y = j1.Y(string, new Object[]{boardSectionTitle}, null, 6);
                if (eVar2.E4() instanceof MainActivity) {
                    NavigationImpl z03 = Navigation.z0(com.pinterest.screens.y.b(), boardSectionId);
                    String str = eVar2.f108835i0;
                    if (str == null) {
                        Intrinsics.r("boardId");
                        throw null;
                    }
                    z03.m0("com.pinterest.EXTRA_BOARD_ID", str);
                    j jVar = new j(z03, Y, null);
                    Context context = kb0.a.f79058b;
                    ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().c(jVar);
                } else if (eVar2.E4() != null) {
                    FragmentActivity context2 = eVar2.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(context2, "requireActivity(...)");
                    Spanned text = Html.fromHtml(Y, 0);
                    Intrinsics.checkNotNullExpressionValue(text, "fromHtml(...)");
                    Intrinsics.checkNotNullParameter(context2, "context");
                    Intrinsics.checkNotNullParameter(text, "text");
                    Toast.makeText(context2, text, 0).show();
                }
            }
            e();
        } catch (NullPointerException e13) {
            throw e13;
        } catch (Throwable th3) {
            throw o.g(th3, "subscribeActual failed", th3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.pinterest.api.model.f30 r13) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mn0.d.d(com.pinterest.api.model.f30):void");
    }

    public final void e() {
        e eVar = (e) this.f87760c;
        if (eVar.isBound()) {
            ((rn0.e) ((ln0.b) eVar.getView())).setLoadState(i.LOADED);
            rn0.e eVar2 = (rn0.e) ((ln0.b) eVar.getView());
            if (!(eVar2.E4() instanceof MainActivity)) {
                FragmentActivity E4 = eVar2.E4();
                if (E4 != null) {
                    E4.finish();
                    return;
                }
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("com.pinterest.EXTRA_BOARD_PICKER_RESULT_KEY_REPINNED", true);
            eVar2.P6("com.pinterest.EXTRA_BOARD_PICKER_RESULT_CODE", bundle);
            za.c remove = Navigation.remove();
            remove.a(eVar2.I);
            ScreenLocation f13 = com.pinterest.screens.y.f();
            String str = eVar2.f108835i0;
            if (str == null) {
                Intrinsics.r("boardId");
                throw null;
            }
            remove.a(Navigation.z0(f13, str));
            remove.a(Navigation.w1(com.pinterest.screens.y.a()));
            eVar2.f7().d(remove);
        }
    }

    public final void f(qz.d dVar) {
        if (dVar != null) {
            List list = t00.h.f115687a;
            if (t00.h.f115688b.contains(Integer.valueOf(dVar.f105387g))) {
                return;
            }
            ((y42.g) this.f87761d).f137731n.h(x0.pin_creation_failure_message);
        }
    }

    @Override // uj2.d0
    public final void onError(Throwable throwable) {
        f1 f1Var;
        qz.d dVar;
        int i13 = this.f87759b;
        Object obj = this.f87761d;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                e();
                break;
            case 1:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Set set = is0.h.B;
                ((PinGridHideView) ((hs0.b) ((is0.h) obj).getView())).b();
                break;
            default:
                Intrinsics.checkNotNullParameter(throwable, "error");
                HashMap hashMap = new HashMap();
                x10.c cVar = (x10.c) this.f87760c;
                String str = cVar.f131338s;
                Intrinsics.g(str, "null cannot be cast to non-null type kotlin.String");
                hashMap.put("save_session_id", str);
                String str2 = cVar.f131328i;
                Intrinsics.g(str2, "null cannot be cast to non-null type kotlin.String");
                hashMap.put("pin_creation_method", str2);
                hashMap.put("board_id", cVar.f131320a);
                if (throwable instanceof NetworkResponseError) {
                    f1Var = ((NetworkResponseError) throwable).f45043a;
                    dVar = f1Var != null ? k3.M(f1Var) : null;
                } else {
                    f1Var = null;
                    dVar = null;
                }
                y42.g gVar = (y42.g) obj;
                b0 b0Var = gVar.f137725h;
                int i14 = gVar.f137726i;
                b0Var.getClass();
                b0.j(hashMap, cVar, throwable, dVar, i14);
                gVar.f137719b.g(h32.f1.PIN_CREATE_FAILURE, null, hashMap, false);
                if (dVar != null) {
                    Object obj2 = dVar.f105381a;
                    if (obj2 instanceof vd0.c) {
                        Intrinsics.g(obj2, "null cannot be cast to non-null type com.pinterest.customjson.PinterestJsonObject");
                        String o13 = ((vd0.c) obj2).o("param_name", "");
                        Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
                        if (!z.i(o13, "sdk_client_id", true)) {
                            if (f1Var != null && f1Var.f123449b == 403) {
                                f(dVar);
                                y42.g gVar2 = (y42.g) obj;
                                gVar2.f137726i = 10;
                                gVar2.f137724g.a(0);
                                gVar2.b();
                                break;
                            }
                        } else {
                            f(dVar);
                            y42.g gVar3 = (y42.g) obj;
                            gVar3.f137726i = 10;
                            gVar3.f137724g.a(0);
                            gVar3.b();
                            break;
                        }
                    }
                }
                if (gVar.f137726i <= 3) {
                    new Timer().schedule(new pe.j(gVar, 1), gVar.f137726i * 10000);
                    break;
                } else {
                    gVar.c(x0.notification_upload_cant);
                    gVar.b();
                    f(dVar);
                    break;
                }
                break;
        }
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        switch (this.f87759b) {
            case 0:
                d((f30) obj);
                break;
            case 1:
                d((f30) obj);
                break;
            default:
                tt1.a response = (tt1.a) obj;
                Object obj2 = this.f87761d;
                Intrinsics.checkNotNullParameter(response, "response");
                f30 f30Var = (f30) response.c();
                HashMap hashMap = new HashMap();
                Object obj3 = this.f87760c;
                x10.c cVar = (x10.c) obj3;
                String str = cVar.f131338s;
                Intrinsics.g(str, "null cannot be cast to non-null type kotlin.String");
                hashMap.put("save_session_id", str);
                hashMap.put("is_video", "false");
                String str2 = cVar.f131328i;
                Intrinsics.g(str2, "null cannot be cast to non-null type kotlin.String");
                hashMap.put("pin_creation_method", str2);
                hashMap.put("board_id", cVar.f131320a);
                String str3 = cVar.f131324e;
                Intrinsics.g(str3, "null cannot be cast to non-null type kotlin.String");
                hashMap.put("image_url", str3);
                try {
                    ((y42.g) obj2).f137719b.g(h32.f1.PIN_CREATE, f30Var.getUid(), hashMap, false);
                    String str4 = ((x10.c) obj3).f131333n;
                    int i13 = 1;
                    if (str4 != null && StringsKt.E(str4, "guid", false)) {
                        new y42.c(((y42.g) obj2).f137723f, f0.j(((x10.c) obj3).f(), ((x10.c) obj3).f131333n, f30Var.getUid())).a(new h0(4), new h0(5));
                    }
                    if (f30Var.D3() != null) {
                        new v2((y42.g) obj2, i13).execute(f30Var);
                        ((y42.g) obj2).f137720c.d(new y42.d(f30Var, ((y42.g) obj2).f137730m, false));
                        ((y42.g) obj2).f137730m = false;
                        break;
                    }
                } catch (Exception e13) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("code", String.valueOf(response.b()));
                    String e14 = response.e();
                    Intrinsics.checkNotNullExpressionValue(e14, "getStatus(...)");
                    hashMap2.put("status", e14);
                    String d2 = response.d();
                    Intrinsics.checkNotNullExpressionValue(d2, "getMessage(...)");
                    hashMap2.put("message", d2);
                    HashSet hashSet = tb0.h.f117076w;
                    tb0.g.f117075a.q(e13, "PinUploader onSuccess() Error :" + hashMap2, p.IDEA_PINS_CREATION);
                }
                break;
        }
    }

    public d(y42.g gVar, x10.c params) {
        this.f87759b = 2;
        Intrinsics.checkNotNullParameter(params, "params");
        this.f87761d = gVar;
        this.f87760c = params;
    }
}
