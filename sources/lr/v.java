package lr;

import android.content.Context;
import android.os.Bundle;
import com.pinterest.collagesCoreLibrary.effects.EffectSliderView;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.n3;
import com.pinterest.screens.w1;
import com.pinterest.screens.z1;
import h32.b3;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.u0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import kh2.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import la0.x1;
import lh0.g1;

/* loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84555i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f84556j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj, int i13) {
        super(0);
        this.f84555i = i13;
        this.f84556j = obj;
    }

    public final i0 b() {
        int i13 = this.f84555i;
        Object obj = this.f84556j;
        switch (i13) {
            case 4:
                i0 source = ((ss.b) obj).getPinalytics().p();
                if (source == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(source, "source");
                g0 g0Var = g0.CLOSEUP_INLINE_CAROUSEL;
                return new i0(source.f67081a, source.f67082b, source.f67083c, g0Var, source.f67085e, source.f67086f);
            default:
                return ((k90.c) obj).generateLoggingContext();
        }
    }

    public final String e() {
        Bundle f49207c;
        Bundle f49207c2;
        int i13 = this.f84555i;
        Object obj = this.f84556j;
        switch (i13) {
            case 18:
                ScreenDescription screenDescription = ((iz.e) obj).f76937a;
                if (screenDescription == null || (f49207c = screenDescription.getF49207c()) == null) {
                    return null;
                }
                return f49207c.getString("finalMessage");
            default:
                ScreenDescription screenDescription2 = ((iz.q) obj).f76937a;
                if (screenDescription2 == null || (f49207c2 = screenDescription2.getF49207c()) == null) {
                    return null;
                }
                return f49207c2.getString("startMessage");
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f84555i;
        int i14 = 1;
        Object obj = this.f84556j;
        switch (i13) {
            case 0:
                m183invoke();
                break;
            case 1:
                m183invoke();
                break;
            case 2:
                m183invoke();
                break;
            case 3:
                m183invoke();
                break;
            case 4:
                break;
            case 5:
                dt.b bVar = (dt.b) ((st.b) obj).getView();
                if (bVar instanceof ct.b) {
                    break;
                }
                break;
            case 6:
                dt.b bVar2 = (dt.b) ((vt.g) obj).getView();
                if (bVar2 instanceof ft.c) {
                    break;
                }
                break;
            case 7:
                dt.b bVar3 = (dt.b) ((wt.f) obj).getView();
                if (bVar3 instanceof gt.a) {
                    break;
                }
                break;
            case 8:
                dt.b bVar4 = (dt.b) ((xt.c) obj).getView();
                if (bVar4 instanceof ht.a) {
                    break;
                }
                break;
            case 9:
                du.d dVar = (du.d) obj;
                Context context = dVar.getLayoutInflater().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                du.a aVar = new du.a(context, dVar.f53234n0);
                aVar.setLayoutParams(new androidx.coordinatorlayout.widget.c(-1, -1));
                break;
            case 10:
                break;
            case 11:
                fu.j jVar = (fu.j) obj;
                Context context2 = jVar.getLayoutInflater().getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                fu.i iVar = new fu.i(context2, jVar.f53234n0);
                iVar.setLayoutParams(new androidx.coordinatorlayout.widget.c(-1, (int) (hf0.b.f69003c * 0.9f)));
                break;
            case 12:
                ku.c cVar = (ku.c) obj;
                Context context3 = cVar.getLayoutInflater().getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                ku.a aVar2 = new ku.a(context3, cVar.f53234n0);
                aVar2.setLayoutParams(new androidx.coordinatorlayout.widget.c(-1, -1));
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                m183invoke();
                break;
            case 16:
                Navigation navigation = ((sv.e) obj).I;
                if (navigation != null) {
                    break;
                }
                break;
            case 17:
            default:
                m183invoke();
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                m183invoke();
                break;
            case 21:
                x10.c cVar2 = (x10.c) obj;
                String str = cVar2.f131325f;
                if (str != null && str.length() != 0) {
                    ByteArrayOutputStream g03 = com.bumptech.glide.d.g0(new File(cVar2.f131325f));
                    break;
                }
                break;
            case 22:
                break;
            case 23:
                m183invoke();
                break;
            case 24:
                x1 x1Var = (x1) obj;
                break;
            case 25:
                m183invoke();
                break;
            case 26:
                m183invoke();
                break;
            case 27:
                m183invoke();
                break;
            case 28:
                m183invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m183invoke() {
        uc0.h hVar = uc0.h.f121787a;
        int i13 = this.f84555i;
        Object obj = this.f84556j;
        switch (i13) {
            case 0:
                w wVar = (w) obj;
                wVar.getClass();
                we0.b bVar = new we0.b(wVar);
                m60.w wVar2 = wVar.f84564k;
                wVar2.d(bVar);
                new gy.f("quick_save_toast").i();
                NavigationImpl z03 = Navigation.z0((ScreenLocation) n3.f51143a.getValue(), "");
                z03.m0("com.pinterest.EXTRA_PIN_ID", wVar.f84558e);
                z03.m0("com.pinterest.EXTRA_AUTO_SAVE_ORIGIN_PIN_ID", wVar.f84557d);
                z03.m0("com.pinterest.EXTRA_PIN_MOVE_ORIGIN_BOARD_ID", wVar.f84562i);
                z03.Y1("com.pinterest.EXTRA_IS_MOVING_PIN", true);
                z03.Y1("com.pinterest.EXTRA_IS_STORY_PIN", wVar.f84560g);
                z03.Y1("com.pinterest.EXTRA_CLOSEUP_TOPLEVEL_SOURCE", wVar.f84559f);
                z03.m0("com.pinterest.EXTRA_PIN_CREATE_TYPE", "repin");
                wVar2.d(z03);
                wVar.d(f1.TAP, u0.BOARD_ORGANIZE_BUTTON);
                break;
            case 1:
                ((Function0) ((g) obj).f84515h).invoke();
                break;
            case 2:
                d0 d0Var = (d0) obj;
                d0Var.f84491f.d(Navigation.z0((ScreenLocation) z1.f51665b.getValue(), d0Var.f84490e.a()));
                break;
            case 3:
                c cVar = (c) obj;
                u0 u0Var = u0.VIRTUAL_TRY_ON_READY_TOAST;
                ((nx.d0) cVar.f84482h).X(u0Var);
                Unit unit = null;
                u2.a1(u0Var, null, b3.VIRTUAL_TRY_ON_READY);
                m60.w wVar3 = m60.u.f85943a;
                NavigationImpl w13 = Navigation.w1((ScreenLocation) w1.P.getValue());
                String str = cVar.f84481g;
                if (str != null) {
                    w13.m0("com.pinterest.EXTRA_PIN_ID", str);
                    w13.z(f42.i.CLOSEUP.getValue(), "com.pinterest.EXTRA_VIRTUAL_TRY_ON_SOURCE_TYPE");
                    unit = Unit.f80348a;
                }
                if (unit == null) {
                    w13.z(f42.i.ANDROID_DOWNLOAD_COMPLETE_TOAST.getValue(), "com.pinterest.EXTRA_VIRTUAL_TRY_ON_SOURCE_TYPE");
                }
                wVar3.d(w13);
                break;
            case 15:
                ((g1) ((jv.a) obj).f77619a.f83394a).c("mdl_carousel_holdout");
                break;
            case 20:
                ((e10.j) obj).f56795g.d();
                break;
            case 23:
                kh2.j.x2((ka0.w) ((ka0.j) obj).f78909d0.getValue(), ka0.b.f78895a);
                break;
            case 25:
                EffectSliderView effectSliderView = (EffectSliderView) obj;
                ((Function1) effectSliderView.f44677j.getValue()).invoke(Float.valueOf(((va0.j) effectSliderView.f44675h.getValue()).f125123a));
                break;
            case 26:
                ((ms0.b) obj).d();
                break;
            case 27:
                ((uc0.b) obj).i(hVar);
                break;
            case 28:
                ((uc0.d) obj).i(hVar);
                break;
            default:
                ((uc0.f) obj).i(hVar);
                break;
        }
    }
}
