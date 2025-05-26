package hk1;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.Log;
import com.facebook.login.x;
import com.google.firebase.messaging.a0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.ScreenManager$Companion;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import com.pinterest.navigation.view.lego.LegoFloatingBottomNavBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.z;
import u50.f0;
import uj2.c0;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69370i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f69371j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, int i13) {
        super(1);
        this.f69370i = i13;
        this.f69371j = obj;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f69370i;
        Object obj = this.f69371j;
        switch (i13) {
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                return (rn1.a) obj;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                SpannableStringBuilder string = (SpannableStringBuilder) obj;
                Intrinsics.checkNotNullParameter(string, "string");
                f0 f0Var = new f0(string);
                Intrinsics.checkNotNullParameter(string, "string");
                return rn1.a.y(it, f0Var, null, null, null, null, 0, null, null, null, null, true, 0, new f0(string), null, null, null, null, false, null, null, 2092030);
        }
    }

    public final tn1.b e(tn1.b it) {
        int i13 = this.f69370i;
        Object obj = this.f69371j;
        switch (i13) {
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                return (tn1.b) obj;
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                return tn1.b.a(it, null, (vn1.b) obj, null, null, 13);
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                return tn1.b.a(it, (vn1.c) obj, null, null, null, 14);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return tn1.b.a(it, null, null, null, (vn1.g) obj, 7);
        }
    }

    public final uj2.b f(Activity activity) {
        int i13 = this.f69370i;
        Object obj = this.f69371j;
        switch (i13) {
            case 19:
                Intrinsics.checkNotNullParameter(activity, "activity");
                ((hr1.e) obj).getClass();
                return le.v.f83119p.get() ? fk2.m.f62459a : new fk2.g(new a0(activity, 23), 0).h(wj2.c.a());
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                return new fk2.g(new androidx.fragment.app.c(12, (x) obj, activity), 0);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List split$default;
        int i13 = this.f69370i;
        Object obj2 = this.f69371j;
        switch (i13) {
            case 0:
                v it = (v) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return v.b(it, null, false, ((k) ((o) obj2)).f69355a.M, false, null, 895);
            case 1:
                ((yk1.p) obj2).onNetworkStateChange(((Boolean) obj).booleanValue());
                return Unit.f80348a;
            case 2:
                ep.b.A(obj2);
                return Unit.f80348a;
            case 3:
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                return Boolean.valueOf(Intrinsics.d((dl1.m) obj2, (dl1.m) pair.f80346a));
            case 4:
                ScreenDescription it2 = (ScreenDescription) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                com.pinterest.framework.screens.s sVar = (com.pinterest.framework.screens.s) obj2;
                ScreenManager$Companion screenManager$Companion = com.pinterest.framework.screens.s.f49224n;
                if (sVar.q(it2)) {
                    com.pinterest.framework.screens.l lVar = sVar.f49228c;
                    if (((il1.b) lVar).g(it2) instanceof ml1.q) {
                        com.pinterest.framework.screens.m g13 = ((il1.b) lVar).g(it2);
                        Intrinsics.g(g13, "null cannot be cast to non-null type com.pinterest.framework.screens.transition.ScreenTransitionListener");
                        ((ml1.q) g13).e3();
                    }
                }
                return Unit.f80348a;
            case 5:
                Boolean bool = (Boolean) obj;
                Intrinsics.f(bool);
                if (bool.booleanValue()) {
                    int i14 = nl1.d.W;
                    ((nl1.d) obj2).W6();
                }
                return Unit.f80348a;
            case 6:
                gb2.i iVar = (gb2.i) obj;
                String str = iVar.f64753a;
                ((uj2.v) obj2).c(new ol1.a(str, iVar.f64754b, str));
                return Unit.f80348a;
            case 7:
                Intrinsics.checkNotNullParameter((yl1.b) obj, "it");
                yl1.l lVar2 = (yl1.l) obj2;
                return new yl1.b(lVar2.f139348a, lVar2.f139349b, lVar2.f139350c, lVar2.f139351d, lVar2.f139352e, lVar2.f139353f, lVar2.f139354g, lVar2.f139355h, lVar2.f139356i, lVar2.f139357j);
            case 8:
                return b((rn1.a) obj);
            case 9:
                Intrinsics.checkNotNullParameter((rm1.d) obj, "it");
                rm1.k kVar = (rm1.k) obj2;
                return new rm1.d(kVar.f108709a, kVar.f108710b, kVar.f108711c, kVar.f108712d, kVar.f108713e);
            case 10:
                Intrinsics.checkNotNullParameter((um1.b) obj, "it");
                um1.d dVar = (um1.d) obj2;
                return new um1.b(dVar.f122796a, dVar.f122797b, dVar.f122798c, dVar.f122799d);
            case 11:
                pn1.b state = (pn1.b) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                return pn1.b.e(state, null, null, 0, ((GestaltTabLayout) obj2).W, RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO);
            case 12:
                tn1.b newState = (tn1.b) obj;
                Intrinsics.checkNotNullParameter(newState, "newState");
                tn1.c cVar = (tn1.c) obj2;
                Context context = cVar.f118619a;
                if (context != null) {
                    cVar.setColor(dl2.b.x0(context, newState.f118608a.getColorRes()));
                    vn1.g gVar = newState.f118611d;
                    cVar.setTextSize(dl2.b.F0(context, gVar.getFontSize()));
                    cVar.setTypeface(bs1.c.u0(context, gVar.getFont(newState.f118610c)));
                    cVar.setTextAlign(newState.f118609b.toTextPaintAlignment());
                }
                return Unit.f80348a;
            case 13:
                return e((tn1.b) obj);
            case 14:
                return e((tn1.b) obj);
            case 15:
                return e((tn1.b) obj);
            case 16:
                return e((tn1.b) obj);
            case 17:
                return b((rn1.a) obj);
            case 18:
                if (((Number) obj).intValue() > 1) {
                    ((Function0) obj2).invoke();
                }
                return Unit.f80348a;
            case 19:
                return f((Activity) obj);
            case 20:
                return f((Activity) obj);
            case 21:
                Throwable throwable = (Throwable) obj;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                lr1.e eVar = (lr1.e) obj2;
                return lr1.e.c(eVar, throwable, eVar.d(lr1.h.GoogleUnifiedAutologin));
            case 22:
                Activity activity = (Activity) obj;
                Intrinsics.checkNotNullParameter(activity, "activity");
                ((kk2.a) ((c0) obj2)).b(activity);
                return Unit.f80348a;
            case 23:
                Integer num = (Integer) obj;
                LegoFloatingBottomNavBar legoFloatingBottomNavBar = (LegoFloatingBottomNavBar) obj2;
                fv1.b w13 = legoFloatingBottomNavBar.w();
                Intrinsics.f(num);
                w13.f63029c = num.intValue();
                w13.f63027a.d(new fv1.a());
                LegoFloatingBottomNavBar.t(legoFloatingBottomNavBar);
                return Unit.f80348a;
            case 24:
                m60.a aVar = (m60.a) obj;
                xu1.d dVar2 = (xu1.d) obj2;
                Log.d("NetworkStateMonitor", "App in " + aVar.name() + " inForeground? " + dVar2.f135953f.get());
                m60.a aVar2 = m60.a.FOREGROUND;
                AtomicBoolean atomicBoolean = dVar2.f135953f;
                if (aVar == aVar2) {
                    if (!atomicBoolean.get()) {
                        atomicBoolean.set(true);
                        dVar2.f135952e.c(Boolean.valueOf(dVar2.f135954g.f135957a.get()));
                        kotlin.jvm.internal.j.z(dVar2.f135950c, null, null, new xu1.a(dVar2, null), 3);
                    }
                } else if (atomicBoolean.get()) {
                    atomicBoolean.set(false);
                }
                return Unit.f80348a;
            case 25:
                Pair it3 = (Pair) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                int intValue = ((Number) it3.f80346a).intValue();
                int intValue2 = ((Number) it3.f80347b).intValue();
                fv1.b bVar = ((bv1.a) obj2).f23957b;
                bVar.f63028b = intValue;
                bVar.f63029c = intValue2;
                bVar.f63027a.d(new fv1.a());
                return Unit.f80348a;
            case 26:
                MatchResult it4 = (MatchResult) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                String value = it4.getValue();
                Regex regex = iz1.a.f73940e;
                ((iz1.a) obj2).getClass();
                split$default = StringsKt__StringsKt.split$default(value, new String[]{"_"}, false, 0, 6, null);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : split$default) {
                    if (!z.j((String) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                String str2 = (String) CollectionsKt.S(arrayList);
                List N = CollectionsKt.N(arrayList, 1);
                ArrayList arrayList2 = new ArrayList(g0.q(N, 10));
                Iterator it5 = N.iterator();
                while (it5.hasNext()) {
                    arrayList2.add(StringsKt.toIntOrNull((String) it5.next()));
                }
                return new Pair(str2, arrayList2);
            case 27:
                ((com.pinterest.pushnotification.l) obj2).getClass();
                com.pinterest.pushnotification.l.a((String) obj);
                return Unit.f80348a;
            case 28:
                ((uk2.d) obj2).c(Boolean.TRUE);
                return Unit.f80348a;
            default:
                String recaptchaToken = (String) obj;
                Intrinsics.checkNotNullParameter(recaptchaToken, "recaptchaToken");
                return ((b20.d) ((com.pinterest.security.i) obj2).f51758b.f21278a).a(recaptchaToken, null, null).l(tk2.e.f118017c);
        }
    }
}
