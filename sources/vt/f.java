package vt;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.pinterest.api.model.ea0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ge0;
import com.pinterest.api.model.s00;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.z90;
import h32.f1;
import h32.g0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lu.b0;

/* loaded from: classes3.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126597i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f126598j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, int i13) {
        super(1);
        this.f126597i = i13;
        this.f126598j = gVar;
    }

    public final void b(f30 pin) {
        List g13;
        ge0 ge0Var;
        String g14;
        List g15;
        String Z2;
        List<ea0> f13;
        int i13 = this.f126597i;
        g gVar = this.f126598j;
        switch (i13) {
            case 0:
                ft.c cVar = (ft.c) gVar.H.getValue();
                if (cVar != null) {
                    lu.k kVar = (lu.k) cVar;
                    if (pin != null) {
                        gs0.k kVar2 = kVar.f53226f0;
                        if (kVar2 == null) {
                            Intrinsics.r("pinOverflowMenuModalProvider");
                            throw null;
                        }
                        if (kVar.f53225e0 != null) {
                            gs0.k.a(kVar2, pin, jo1.c.a(kVar), true, false, null, null, false, null, null, false, null, null, false, null, null, null, false, false, false, false, null, null, false, 8388600).showFeedBack();
                            return;
                        } else {
                            Intrinsics.r("baseGridActionUtils");
                            throw null;
                        }
                    }
                    return;
                }
                return;
            default:
                Intrinsics.f(pin);
                gVar.v3(pin);
                e eVar = gVar.G;
                if (eVar != null) {
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    eVar.f126577d = pin;
                    es.c cVar2 = (es.c) eVar.f126575b;
                    cVar2.getClass();
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    eVar.f126596w = cVar2.Y(pin);
                    z90 Z5 = pin.Z5();
                    ArrayList arrayList = eVar.f126586m;
                    if (Z5 != null && (f13 = Z5.f()) != null) {
                        eVar.f126587n = new int[f13.size()];
                        List d2 = ((ea0) f13.get(0)).d();
                        int size = d2 != null ? d2.size() : 0;
                        Integer[] numArr = new Integer[size];
                        for (int i14 = 0; i14 < size; i14++) {
                            numArr[i14] = 0;
                        }
                        eVar.f126592s = numArr;
                        int size2 = f13.size();
                        Integer[] numArr2 = new Integer[size2];
                        for (int i15 = 0; i15 < size2; i15++) {
                            numArr2[i15] = 0;
                        }
                        eVar.f126594u = numArr2;
                        for (ea0 ea0Var : f13) {
                            ArrayList arrayList2 = new ArrayList();
                            String f14 = ea0Var.f();
                            if (f14 == null) {
                                f14 = "";
                            }
                            List d13 = ea0Var.d();
                            if (d13 != null) {
                                Iterator it = d13.iterator();
                                while (it.hasNext()) {
                                    String d14 = ((s00) it.next()).d();
                                    if (d14 != null) {
                                        arrayList2.add(d14);
                                    }
                                }
                            }
                            arrayList.add(new ot.a(arrayList2, f14));
                        }
                    }
                    wy0 a63 = pin.a6();
                    if (a63 != null && (Z2 = a63.Z2()) != null) {
                        Intrinsics.checkNotNullParameter(Z2, "<set-?>");
                        eVar.f126579f = Z2;
                    }
                    float[] fArr = new float[3];
                    Color.colorToHSV(Color.parseColor(pin.i4()), fArr);
                    if (fArr[1] > 0.1f) {
                        fArr[1] = 0.1f;
                    }
                    fArr[2] = 0.95f;
                    int HSVToColor = Color.HSVToColor(fArr);
                    String str = eVar.f126579f;
                    if (str == null) {
                        Intrinsics.r("promotedByString");
                        throw null;
                    }
                    eVar.j(new n(HSVToColor, arrayList, str, eVar.f(), b0.QUESTIONNAIRE));
                    eVar.b(g0.AD_QUIZ_PIN_QUESTIONNAIRE, null, f1.VIEW);
                }
                ArrayList arrayList3 = new ArrayList();
                z90 Z52 = gVar.t3().Z5();
                int size3 = (Z52 == null || (g15 = Z52.g()) == null) ? 0 : g15.size();
                for (int i16 = 0; i16 < size3; i16++) {
                    z90 Z53 = gVar.t3().Z5();
                    if (Z53 != null && (g13 = Z53.g()) != null && (ge0Var = (ge0) g13.get(i16)) != null && (g14 = ge0Var.g()) != null) {
                        arrayList3.add(g14);
                    }
                }
                xj2.c o13 = gVar.F.getPins(CollectionsKt.Z(arrayList3, ",", null, null, 0, null, null, 62), n00.b.a(n00.c.ADS_QUIZ_PIN)).r(tk2.e.f118017c).l(wj2.c.a()).o(new st.c(9, new hs.a(10, gVar, arrayList3)), new st.c(10, a.f126558q));
                Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                gVar.addDisposable(o13);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f126597i) {
            case 0:
                b((f30) obj);
                break;
            case 1:
                r viewState = (r) obj;
                g gVar = this.f126598j;
                ft.c cVar = (ft.c) gVar.H.getValue();
                if (cVar != null) {
                    Intrinsics.f(viewState);
                    Intrinsics.checkNotNullParameter(viewState, "viewState");
                    ((lu.f) ((lu.k) cVar).W0.getValue()).L(null, -2);
                }
                ft.c cVar2 = (ft.c) gVar.H.getValue();
                if (cVar2 != null) {
                    Intrinsics.f(viewState);
                    lu.k kVar = (lu.k) cVar2;
                    Intrinsics.checkNotNullParameter(viewState, "viewState");
                    if (viewState instanceof m) {
                        kVar.V0 = false;
                        kVar.x8(false);
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 80.0f);
                        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                        ofFloat.setDuration(200L);
                        ofFloat.addUpdateListener(new lu.h(kVar, 0));
                        ofFloat.start();
                        if (!((m) viewState).f126617c) {
                            kVar.d8().n1().q();
                        }
                    } else if (viewState instanceof l) {
                        kVar.V0 = true;
                        if (!((l) viewState).f126614m) {
                            kVar.x8(true);
                        }
                        FrameLayout frameLayout = kVar.d8().f35324k0;
                        if (frameLayout != null) {
                            frameLayout.setOnClickListener(new tq.j(kVar, 11));
                        }
                        kVar.d8().n1().e();
                    } else if (viewState instanceof q) {
                        String str = ((q) viewState).f126631a;
                        if (str != null) {
                            kVar.V0 = false;
                            kVar.loadUrl(str);
                            kVar.d8().n1().e();
                        } else {
                            HashSet hashSet = tb0.h.f117076w;
                            tb0.g.f117075a.q(new Exception("Invalid result pin destination URL and invalid root pin destination URL"), "Invalid result pin destination URL and invalid root pin destination URL means the outbound click is a no-op", tb0.p.QUIZ);
                        }
                    }
                }
                break;
            default:
                b((f30) obj);
                break;
        }
        return Unit.f80348a;
    }
}
