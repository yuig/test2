package ls;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.viewpager2.widget.r;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.t60;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.z;
import lh0.a4;
import lh0.e;
import lh0.g1;
import lh0.z3;
import tb0.g;
import tb0.h;
import tb0.p;
import yk1.i;
import yq0.t;

/* loaded from: classes3.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84611i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f84612j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i13) {
        super(1);
        this.f84611i = i13;
        this.f84612j = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        sr srVar;
        sr srVar2;
        int i13 = this.f84611i;
        d dVar = this.f84612j;
        switch (i13) {
            case 0:
                f30 it = (f30) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((js.b) dVar.D).getClass();
                String adPreviewDeeplinkUrl = dVar.f84615z;
                Intrinsics.checkNotNullParameter(adPreviewDeeplinkUrl, "adPreviewDeeplinkUrl");
                String queryParameter = Uri.parse(adPreviewDeeplinkUrl).getQueryParameter("ad_preview_key");
                if (queryParameter != null && !z.j(queryParameter)) {
                    break;
                } else {
                    break;
                }
                break;
            case 1:
                Pair pair = (Pair) obj;
                f30 f30Var = (f30) pair.f80346a;
                vd0.c cVar = (vd0.c) pair.f80347b;
                dVar.getClass();
                Map A4 = f30Var.A4();
                float doubleValue = (A4 == null || (srVar2 = (sr) A4.get("236x")) == null) ? 1.0f : (float) srVar2.h().doubleValue();
                Map A42 = f30Var.A4();
                float doubleValue2 = doubleValue / ((A42 == null || (srVar = (sr) A42.get("236x")) == null) ? 1.0f : (float) srVar.k().doubleValue());
                int i14 = 0;
                boolean z13 = doubleValue2 > 1.0f;
                dVar.I = ((js.b) dVar.D).a(f30Var, cVar, dVar.f84615z);
                dl1.s[] sVarArr = new dl1.s[13];
                float f13 = dVar.F;
                sVarArr[0] = new t60(f13, false, 2, null);
                float f14 = dVar.E;
                sVarArr[1] = new t60(f14, false, 2, null);
                sVarArr[2] = new t60(f14, false, 2, null);
                sVarArr[3] = new t60(f13, false, 2, null);
                sVarArr[4] = dVar.I;
                float f15 = dVar.G;
                sVarArr[5] = z13 ? new t60(f15, false, 2, null) : new t60(2 * doubleValue2, false, 2, null);
                sVarArr[6] = z13 ? new t60(f15, false, 2, null) : new t60(doubleValue2, false, 2, null);
                sVarArr[7] = z13 ? new t60(doubleValue2, false, 2, null) : new t60(2 * doubleValue2, false, 2, null);
                sVarArr[8] = new t60(f13, false, 2, null);
                sVarArr[9] = new t60(f14, false, 2, null);
                sVarArr[10] = new t60(f14, false, 2, null);
                sVarArr[11] = new t60(f13, false, 2, null);
                sVarArr[12] = new t60(dVar.H, true);
                dVar.S3(f0.j(sVarArr));
                Object adapter = dVar.getAdapter();
                if (adapter != null) {
                    ((b2) adapter).h();
                }
                ((t) ((ks.a) dVar.getView())).setLoadState(i.LOADED);
                List unmodifiableList = Collections.unmodifiableList(dVar.f109906r);
                Intrinsics.checkNotNullExpressionValue(unmodifiableList, "<get-items>(...)");
                Iterator it2 = unmodifiableList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        String uid = ((dl1.s) it2.next()).getUid();
                        f30 f30Var2 = dVar.I;
                        if (!Intrinsics.d(uid, f30Var2 != null ? f30Var2.getUid() : null)) {
                            i14++;
                        }
                    } else {
                        i14 = -1;
                    }
                }
                f30 f30Var3 = dVar.I;
                if (f30Var3 != null && Intrinsics.d(f30Var3.b5(), Boolean.TRUE)) {
                    e eVar = dVar.B;
                    eVar.getClass();
                    z3 z3Var = a4.f83297a;
                    g1 g1Var = (g1) eVar.f83333a;
                    if (g1Var.o("android_premiere_spotlight_ad_preview", "enabled", z3Var) || g1Var.l("android_premiere_spotlight_ad_preview")) {
                        RecyclerView g83 = ((ms.e) ((ks.a) dVar.getView())).g8();
                        if (g83 != null) {
                            g83.post(new r(g83, i14));
                        }
                        dVar.C.m(((yk1.a) dVar.f109891c).f139224a.getString(js.e.promoted_pin_preview_toast));
                        break;
                    }
                }
                RecyclerView g84 = ((ms.e) ((ks.a) dVar.getView())).g8();
                if (g84 != null) {
                    g84.G2(i14);
                }
                dVar.C.m(((yk1.a) dVar.f109891c).f139224a.getString(js.e.promoted_pin_preview_toast));
                break;
            default:
                HashSet hashSet = h.f117076w;
                g.f117075a.q((Throwable) obj, a.a.j("[Promoted Pin Preview] Load Promoted Pin Preview fail. pinId: ", dVar.f84614y), p.AD_FORMATS);
                break;
        }
        return Unit.f80348a;
    }
}
