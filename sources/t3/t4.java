package t3;

import android.content.Context;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t4 implements do2.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f116202b;

    public /* synthetic */ t4(Object obj, int i13) {
        this.f116201a = i13;
        this.f116202b = obj;
    }

    public final Object a(boolean z13) {
        com.pinterest.feature.unauth.sba.f fVar;
        int i13 = this.f116201a;
        Object obj = this.f116202b;
        switch (i13) {
            case 1:
                if (z13) {
                    yq1.k kVar = (yq1.k) obj;
                    int i14 = yq1.k.R0;
                    dy.a aVar = kVar.f139879m0;
                    if (aVar == null) {
                        Intrinsics.r("appsFlyerManager");
                        throw null;
                    }
                    Boolean bool = aVar.f56520m;
                    if (bool != null && bool.booleanValue()) {
                        GestaltTextField gestaltTextField = kVar.D0;
                        if (gestaltTextField == null) {
                            Intrinsics.r("userInputEt");
                            throw null;
                        }
                        if (gestaltTextField.B0().length() == 0) {
                            lb0.q qVar = kVar.f139892z0;
                            if (qVar == null) {
                                Intrinsics.r("prefsManagerPersisted");
                                throw null;
                            }
                            if (!qVar.f("PRELOAD_EXPERIENCE_SEEN", false) && qb0.d.f103396a.c() && kVar.b8().d()) {
                                lb0.q qVar2 = kVar.f139892z0;
                                if (qVar2 == null) {
                                    Intrinsics.r("prefsManagerPersisted");
                                    throw null;
                                }
                                qVar2.k("PRELOAD_EXPERIENCE_SEEN", true);
                                m60.w f73 = kVar.f7();
                                androidx.fragment.app.w0 fragmentManager = kVar.getFragmentManager();
                                if (fragmentManager != null) {
                                    Context requireContext = kVar.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                                    il1.a aVar2 = kVar.f139882p0;
                                    if (aVar2 == null) {
                                        Intrinsics.r("fragmentFactory");
                                        throw null;
                                    }
                                    fVar = new com.pinterest.feature.unauth.sba.f(requireContext, aVar2, fragmentManager, kVar.getAnalyticsApi());
                                } else {
                                    fVar = null;
                                }
                                f73.d(new jc0.v(fVar, false, 0L, 30));
                            }
                        }
                    }
                }
                return Unit.f80348a;
            default:
                if (z13) {
                    ((Function1) obj).invoke(br1.k.f23798a);
                }
                return Unit.f80348a;
        }
    }

    @Override // do2.j
    public final Object emit(Object obj, bl2.c frame) {
        int i13 = this.f116201a;
        Object obj2 = this.f116202b;
        switch (i13) {
            case 0:
                ((y2) obj2).f116281a.i(((Number) obj).floatValue());
                return Unit.f80348a;
            case 1:
                return a(((Boolean) obj).booleanValue());
            case 2:
                return a(((Boolean) obj).booleanValue());
            default:
                io2.f fVar = (io2.f) obj2;
                fVar.f73333e.c(obj);
                if (io2.f.f73330f.decrementAndGet(fVar) > 0) {
                    ao2.m0.t(fVar.f20108c);
                    return Unit.f80348a;
                }
                ao2.o oVar = new ao2.o(1, cl2.h.b(frame));
                oVar.v();
                io2.f.f73331g.set(fVar, oVar);
                Object u13 = oVar.u();
                cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
                if (u13 == aVar) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                return u13 == aVar ? u13 : Unit.f80348a;
        }
    }
}
