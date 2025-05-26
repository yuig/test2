package a;

import ads_mobile_sdk.d82;
import ads_mobile_sdk.qc0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.webkit.CookieManager;
import androidx.work.impl.WorkDatabase;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.wy0;
import com.pinterest.database.PinterestDatabase;
import com.pinterest.error.NetworkResponseError;
import com.pinterest.feature.ideaPinCreation.worker.IdeaPinVideoExportWorker;
import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import com.pinterest.identity.core.error.UnauthException;
import java.io.File;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* loaded from: classes2.dex */
public final /* synthetic */ class k1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f72b;

    public /* synthetic */ k1(Object obj, int i13) {
        this.f71a = i13;
        this.f72b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3;
        Unit refreshForPlacement$lambda$36;
        ConcurrentHashMap concurrentHashMap4;
        a11.e eVar;
        v.f1 f1Var;
        int i13 = this.f71a;
        Object obj = this.f72b;
        switch (i13) {
            case 0:
                return ((d82) obj).b();
            case 1:
                return ((qc0) obj).c();
            case 2:
                return (ads_mobile_sdk.ng) ((n5) obj).get();
            case 3:
                return new bb.f((JsReplyProxyBoundaryInterface) obj);
            case 4:
                WorkDatabase workDatabase = ((ub.e) obj).f121655a;
                Long e13 = workDatabase.u().e("next_alarm_manager_id");
                int longValue = e13 != null ? (int) e13.longValue() : 0;
                workDatabase.u().h(new tb.d("next_alarm_manager_id", Long.valueOf(longValue != Integer.MAX_VALUE ? longValue + 1 : 0)));
                return Integer.valueOf(longValue);
            case 5:
                j90.b this$0 = (j90.b) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                qz.f0 f0Var = (qz.f0) this$0.getParams()[1];
                return (f0Var == null || (concurrentHashMap = f0Var.f105397a) == null) ? kotlin.collections.z0.d() : concurrentHashMap;
            case 6:
                j90.b this$02 = (j90.b) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                qz.f0 f0Var2 = (qz.f0) this$02.getParams()[1];
                return f0Var2 != null ? f0Var2.i() : kotlin.collections.z0.d();
            case 7:
                PinterestDatabase this$03 = (PinterestDatabase) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                zd0.d t13 = this$03.t();
                ja.d0 d0Var = t13.f141666a;
                d0Var.b();
                zd0.b bVar = t13.f141670e;
                oa.i a13 = bVar.a();
                try {
                    d0Var.c();
                    try {
                        int G = a13.G();
                        d0Var.r();
                        bVar.j(a13);
                        return Integer.valueOf(G);
                    } finally {
                        d0Var.m();
                    }
                } catch (Throwable th3) {
                    bVar.j(a13);
                    throw th3;
                }
            case 8:
                no0.a this$04 = (no0.a) obj;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                i32.y0 y0Var = i32.y0.ANDROID_HOME_FEED_TAKEOVER;
                int value = y0Var.getValue();
                i32.l lVar = i32.l.ANDROID_IN_APP_BRAND_SURVEY;
                String str = value + ":" + lVar.getValue();
                vd0.c cVar = new vd0.c();
                cVar.t("id", str);
                cVar.t("title_text", ((Context) this$04.f91655b).getString(m60.x0.thanks_for_your_feedback));
                cVar.r(Integer.valueOf(i32.i.FORWARD_ARROW.getValue()), "prompt_image");
                cVar.r(2000, "dismiss_timer_in_millis");
                return new dg0.c(new m.h(str, String.valueOf(y0Var.getValue()), String.valueOf(lVar.getValue()), Collections.singletonList(new eg0.b(cVar)), 26));
            case 9:
                j90.b this$05 = (j90.b) obj;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                qz.f0 f0Var3 = (qz.f0) this$05.getParams()[1];
                return f0Var3 != null ? f0Var3.i() : kotlin.collections.z0.d();
            case 10:
                j90.b this$06 = (j90.b) obj;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                qz.f0 f0Var4 = (qz.f0) this$06.getParams()[1];
                return (f0Var4 == null || (concurrentHashMap2 = f0Var4.f105397a) == null) ? kotlin.collections.z0.d() : concurrentHashMap2;
            case 11:
                IdeaPinVideoExportWorker this$07 = (IdeaPinVideoExportWorker) obj;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                sv0.l lVar2 = this$07.f46662s;
                String pageId = (String) this$07.f46667x.getValue();
                String registerMediaType = (String) this$07.I.getValue();
                int intValue = ((Number) this$07.f46653J.getValue()).intValue();
                tp tpVar = (tp) this$07.G.getValue();
                lVar2.getClass();
                Intrinsics.checkNotNullParameter(pageId, "pageId");
                Intrinsics.checkNotNullParameter(registerMediaType, "registerMediaType");
                lVar2.f115363l.put(pageId, lVar2.c(registerMediaType, intValue, tpVar));
                return Unit.f80348a;
            case 12:
                return ((File) obj).getAbsolutePath();
            case 13:
                j90.b this$08 = (j90.b) obj;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                qz.f0 f0Var5 = (qz.f0) this$08.getParams()[1];
                return (f0Var5 == null || (concurrentHashMap3 = f0Var5.f105397a) == null) ? kotlin.collections.z0.d() : concurrentHashMap3;
            case 14:
                refreshForPlacement$lambda$36 = PinCloseupPresenter.refreshForPlacement$lambda$36((PinCloseupPresenter) obj);
                return refreshForPlacement$lambda$36;
            case 15:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(pin, "$pin");
                if (pin != null) {
                    return b40.F(pin);
                }
                return null;
            case 16:
                j90.b this$09 = (j90.b) obj;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                qz.f0 f0Var6 = (qz.f0) this$09.getParams()[1];
                return (f0Var6 == null || (concurrentHashMap4 = f0Var6.f105397a) == null) ? kotlin.collections.z0.d() : concurrentHashMap4;
            case 17:
                j90.b this$010 = (j90.b) obj;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                qz.f0 f0Var7 = (qz.f0) this$010.getParams()[1];
                return f0Var7 != null ? f0Var7.i() : kotlin.collections.z0.d();
            case 18:
                j90.b this$011 = (j90.b) obj;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                return (qz.f0) this$011.getParams()[1];
            case 19:
                uf1.c this$012 = (uf1.c) obj;
                int i14 = uf1.c.K;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                Bitmap createBitmap = Bitmap.createBitmap(this$012.getWidth(), this$012.getHeight(), Bitmap.Config.RGB_565);
                this$012.draw(new Canvas(createBitmap));
                return createBitmap;
            case 20:
                com.pinterest.framework.multisection.datasource.pagedlist.o0 this$013 = (com.pinterest.framework.multisection.datasource.pagedlist.o0) obj;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                qz.f0 f0Var8 = (qz.f0) this$013.getParams()[1];
                return f0Var8 != null ? f0Var8.i() : kotlin.collections.z0.d();
            case 21:
                CookieManager cookieManager = (CookieManager) obj;
                Intrinsics.checkNotNullParameter(cookieManager, "$cookieManager");
                cookieManager.flush();
                return Unit.f80348a;
            case 22:
                qr1.b activityResult = (qr1.b) obj;
                Intrinsics.checkNotNullParameter(activityResult, "$activityResult");
                if (activityResult.f104974a == 111 && activityResult.f104975b == -1) {
                    return Unit.f80348a;
                }
                throw new UnauthException.AuthCanceledError(null);
            case 23:
                dv0.q this$014 = (dv0.q) obj;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                rg0.n d2 = this$014.d();
                ag2.e eVar2 = d2 != null ? d2.f108068j : null;
                rg0.g gVar = eVar2 instanceof rg0.g ? (rg0.g) eVar2 : null;
                String str2 = gVar != null ? gVar.f108008d : null;
                if (str2 != null) {
                    switch (this$014.f56380a) {
                        case 3:
                            eVar = (a11.e) ((xk2.k) this$014.f56383d).getValue();
                            break;
                        default:
                            eVar = (a11.e) ((xk2.k) this$014.f56383d).getValue();
                            break;
                    }
                    a11.e.e(eVar, str2, null, 6);
                }
                rg0.n d13 = this$014.d();
                if (d13 == null) {
                    return null;
                }
                d13.a(null, null);
                return Unit.f80348a;
            case 24:
                kotlin.jvm.internal.j0 entryFromMemoryCache = (kotlin.jvm.internal.j0) obj;
                gi2.b bVar2 = x02.z1.f131544c;
                Intrinsics.checkNotNullParameter(entryFromMemoryCache, "$entryFromMemoryCache");
                Object element = entryFromMemoryCache.f80434a;
                Intrinsics.checkNotNullExpressionValue(element, "element");
                return uj2.b0.j(new x02.y1((mc.a) element));
            case 25:
                mr1.h account = (mr1.h) obj;
                Intrinsics.checkNotNullParameter(account, "$account");
                c60.a aVar = account.f88090c;
                if (aVar != null) {
                    return aVar;
                }
                throw new IllegalStateException("Parent account must have an access token");
            case 26:
                String userUid = (String) obj;
                if (userUid != null) {
                    Intrinsics.checkNotNullParameter(userUid, "userUid");
                    a60.a.a(null).edit().remove(userUid).commit();
                }
                return hk2.i.f69412a;
            case 27:
                wy0 user = (wy0) obj;
                Intrinsics.checkNotNullParameter(user, "$user");
                return uj2.b0.j(user);
            case 28:
                Throwable throwable = (Throwable) obj;
                Intrinsics.checkNotNullParameter(throwable, "$throwable");
                NetworkResponseError networkResponseError = throwable instanceof NetworkResponseError ? (NetworkResponseError) throwable : null;
                if (networkResponseError != null && (f1Var = networkResponseError.f45043a) != null) {
                    int i15 = f1Var.f123449b;
                    if ((i15 == 429 ? Integer.valueOf(i15) : null) != null) {
                        return new UnauthException.UserLookUpRateLimitHit(throwable);
                    }
                }
                return new UnauthException.UserLookUpError(throwable);
            default:
                lb2.x this$015 = (lb2.x) obj;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                wy0 f13 = ((b60.d) this$015.f82835n).f();
                return f13 != null ? uj2.b0.j(f13) : uj2.b0.g(new IllegalStateException("User cannot be null"));
        }
    }
}
