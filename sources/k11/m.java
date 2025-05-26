package k11;

import androidx.appcompat.widget.c2;
import com.pinterest.api.model.f30;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import lh0.a3;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import uj2.b0;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final i92.k f78154a;

    /* renamed from: b, reason: collision with root package name */
    public final a3 f78155b;

    /* renamed from: c, reason: collision with root package name */
    public final c2 f78156c;

    /* renamed from: d, reason: collision with root package name */
    public final q f78157d;

    public m(i92.k toastUtils, a3 repinLibraryExperiments, c2 sharesheetUtils, q prefsManagerPersisted) {
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(repinLibraryExperiments, "repinLibraryExperiments");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        this.f78154a = toastUtils;
        this.f78155b = repinLibraryExperiments;
        this.f78156c = sharesheetUtils;
        this.f78157d = prefsManagerPersisted;
    }

    public final b0 a(String str, String boardName, f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        q qVar = this.f78157d;
        if (new Date().getTime() - qVar.a("PREF_LAST_SHARING_UPSELL_SHOWN_AT", 0L) >= 604800000) {
            a3 a3Var = this.f78155b;
            a3Var.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) a3Var.f83296a;
            if (g1Var.o("sg_android_post_repin_toast_share_upsell", "enabled", z3Var) || g1Var.l("sg_android_post_repin_toast_share_upsell")) {
                qVar.c("PREF_LAST_SHARING_UPSELL_SHOWN_AT", new Date().getTime());
                return new kk2.k(new l(this, pin, str, boardName, 0), 1).r(wj2.c.a());
            }
        }
        return b0.j(Boolean.FALSE);
    }
}
