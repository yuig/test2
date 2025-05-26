package ls0;

import android.net.Uri;
import androidx.appcompat.widget.c2;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.oc;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import i01.r0;
import i32.y0;
import java.io.File;
import java.util.HashSet;
import kh2.g0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.l1;
import lh0.z3;
import rg0.y;
import tb0.p;
import x81.h0;

/* loaded from: classes5.dex */
public final class m implements gw0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f84662a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oc f84663b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f30 f84664c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f84665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ File f84666e;

    public m(n nVar, oc ocVar, f30 f30Var, String str, File file) {
        this.f84662a = nVar;
        this.f84663b = ocVar;
        this.f84664c = f30Var;
        this.f84665d = str;
        this.f84666e = file;
    }

    @Override // gw0.e
    public final void a(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        f30 f30Var = this.f84664c;
        String uid = f30Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        n nVar = this.f84662a;
        nVar.getClass();
        iv1.a aVar = iv1.a.NRT_AUTO_ORG_DOWNLOAD_V1;
        int i13 = i.f84654b[nVar.f84670d.ordinal()];
        y0 y0Var = i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? i13 != 5 ? null : y0.ANDROID_USER_PROFILE_AFTER_DOWNLOAD : y0.ANDROID_SEARCH_RESULTS_AFTER_DOWNLOAD : y0.ANDROID_BOARD_AFTER_DOWNLOAD : y0.ANDROID_PIN_CLOSEUP_AFTER_DOWNLOAD : y0.ANDROID_HOME_FEED_AFTER_DOWNLOAD;
        rg0.n b13 = y0Var != null ? ((dh0.d) y.a()).b(y0Var) : null;
        oc ocVar = this.f84663b;
        if (g0.g0(ocVar)) {
            l1 l1Var = nVar.f84681o;
            l1Var.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) l1Var.f83416a;
            if ((g1Var.o("android_nrt_auto_org_downloads", "enabled", z3Var) || g1Var.l("android_nrt_auto_org_downloads")) && b13 != null) {
                iv1.b bVar = nVar.f84679m;
                if (bVar.c(ocVar, b13, aVar, uid)) {
                    f1 f1Var = f1.NRT_AUTO_ORG_VIEW;
                    String uid2 = f30Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                    bVar.b(f1Var, ocVar, uid2);
                    return;
                }
            }
        }
        f30 pin = this.f84664c;
        l onUpsellShowing = new l(nVar, pin, 0);
        l onUpsellSkipped = new l(nVar, pin, 1);
        c2 c2Var = nVar.f84678l;
        c2Var.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(onUpsellShowing, "onUpsellShowing");
        Intrinsics.checkNotNullParameter(onUpsellSkipped, "onUpsellSkipped");
        new fk2.g(new n.g(c2Var, pin, onUpsellShowing, onUpsellSkipped, 9, 0), 3).l(tk2.e.f118017c).h(wj2.c.a()).i(new r0(8), new h0(17, i91.g.f71828o));
    }

    @Override // gw0.e
    public final void onError(Throwable t13) {
        Intrinsics.checkNotNullParameter(t13, "t");
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.q(t13, "Failed to store image to gallery", p.CLOSEUP);
        n nVar = this.f84662a;
        nVar.f84674h.h(f80.b.pin_more_save_fail);
        ms0.d.a(nVar.f84683q, ms0.c.SAVE_TO_STORAGE_FAILED, nVar.f84682p, nVar.f84667a, this.f84665d, this.f84666e.getPath(), t13.getMessage(), null, null, nVar.f84677k, RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY);
    }
}
