package yf1;

import a42.r;
import android.content.Context;
import android.os.Bundle;
import com.google.gson.reflect.TypeToken;
import com.pinterest.api.model.rl0;
import com.pinterest.api.model.ul0;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import df.j1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import jc0.s;
import jc0.v;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m60.u;
import m60.w;
import nm.o;
import so.oa;
import yb0.n;

/* loaded from: classes5.dex */
public final class i extends jc0.b {

    /* renamed from: a, reason: collision with root package name */
    public final r f138980a;

    /* renamed from: b, reason: collision with root package name */
    public final n f138981b;

    /* renamed from: c, reason: collision with root package name */
    public k f138982c;

    /* renamed from: d, reason: collision with root package name */
    public GestaltButton f138983d;

    /* renamed from: e, reason: collision with root package name */
    public h22.f f138984e;

    /* renamed from: f, reason: collision with root package name */
    public i92.k f138985f;

    public i(n nVar, r satisfaction) {
        Intrinsics.checkNotNullParameter(satisfaction, "satisfaction");
        this.f138980a = satisfaction;
        this.f138981b = nVar;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        final int i13 = 1;
        this.f138982c = new k(context, this.f138980a, new a(this, 1));
        oa oaVar = (oa) ((f) j1.b0(f.class, context.getApplicationContext()));
        h22.f fVar = (h22.f) oaVar.P7.get();
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.f138984e = fVar;
        i92.k E2 = oaVar.E2();
        Intrinsics.checkNotNullParameter(E2, "<set-?>");
        this.f138985f = E2;
        jc0.n nVar = new jc0.n(context, true);
        k kVar = this.f138982c;
        if (kVar == null) {
            Intrinsics.r("modalView");
            throw null;
        }
        nVar.x(kVar);
        final int i14 = 0;
        nVar.T(false);
        GestaltButton gestaltButton = nVar.f44752d;
        if (gestaltButton != null) {
            gestaltButton.d(jc0.k.f75411j);
        }
        GestaltIconButton gestaltIconButton = nVar.f44749a;
        if (gestaltIconButton != null) {
            gestaltIconButton.t(g.f138972j);
            gestaltIconButton.u(new gm1.a(this) { // from class: yf1.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f138971b;

                {
                    this.f138971b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i15 = i14;
                    i this$0 = this.f138971b;
                    switch (i15) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                r rVar = this$0.f138980a;
                                w wVar = u.f85943a;
                                wVar.d(new s());
                                wVar.d(new v(new b(this$0.f138981b, rVar), false, 0L, 30));
                                return;
                            }
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            GestaltButton gestaltButton2 = this$0.f138983d;
                            if (gestaltButton2 == null) {
                                Intrinsics.r("submitButton");
                                throw null;
                            }
                            gestaltButton2.setEnabled(false);
                            k kVar2 = this$0.f138982c;
                            if (kVar2 == null) {
                                Intrinsics.r("modalView");
                                throw null;
                            }
                            LinkedHashSet linkedHashSet = kVar2.f138995g;
                            ArrayList arrayList = new ArrayList(g0.q(linkedHashSet, 10));
                            Iterator it2 = linkedHashSet.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(Integer.valueOf(((a42.i) it2.next()).getValue()));
                            }
                            List F0 = CollectionsKt.F0(arrayList);
                            k kVar3 = this$0.f138982c;
                            if (kVar3 == null) {
                                Intrinsics.r("modalView");
                                throw null;
                            }
                            String obj = StringsKt.i0(kVar3.f138994f.B0()).toString();
                            rl0 rl0Var = new rl0(0);
                            Integer valueOf = Integer.valueOf(this$0.f138980a.getValue());
                            rl0Var.f41623c = valueOf;
                            boolean[] zArr = rl0Var.f41624d;
                            if (zArr.length > 2) {
                                zArr[2] = true;
                            }
                            rl0Var.f41621a = obj;
                            if (zArr.length > 0) {
                                zArr[0] = true;
                            }
                            rl0Var.f41622b = F0;
                            if (zArr.length > 1) {
                                zArr[1] = true;
                            }
                            ul0 ul0Var = new ul0(obj, F0, valueOf, zArr, 0);
                            Intrinsics.checkNotNullExpressionValue(ul0Var, "build(...)");
                            o oVar = vd0.c.f125622b;
                            oVar.getClass();
                            nm.u i16 = oVar.g(new TypeToken(ul0.class)).b().d(ul0Var).i();
                            h22.f fVar2 = this$0.f138984e;
                            if (fVar2 == null) {
                                Intrinsics.r("storyPinService");
                                throw null;
                            }
                            String sVar = i16.toString();
                            Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
                            fVar2.m(sVar).r(tk2.e.f118017c).l(wj2.c.a()).o(new rf1.v(9, new h(this$0, 1)), new rf1.v(10, new h(this$0, 2)));
                            return;
                    }
                }
            });
        }
        GestaltButton gestaltButton2 = nVar.f44752d;
        if (gestaltButton2 != null) {
            this.f138983d = gestaltButton2;
            gestaltButton2.d(new h(this, i14));
            gestaltButton2.e(new gm1.a(this) { // from class: yf1.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f138971b;

                {
                    this.f138971b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i15 = i13;
                    i this$0 = this.f138971b;
                    switch (i15) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                r rVar = this$0.f138980a;
                                w wVar = u.f85943a;
                                wVar.d(new s());
                                wVar.d(new v(new b(this$0.f138981b, rVar), false, 0L, 30));
                                return;
                            }
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            GestaltButton gestaltButton22 = this$0.f138983d;
                            if (gestaltButton22 == null) {
                                Intrinsics.r("submitButton");
                                throw null;
                            }
                            gestaltButton22.setEnabled(false);
                            k kVar2 = this$0.f138982c;
                            if (kVar2 == null) {
                                Intrinsics.r("modalView");
                                throw null;
                            }
                            LinkedHashSet linkedHashSet = kVar2.f138995g;
                            ArrayList arrayList = new ArrayList(g0.q(linkedHashSet, 10));
                            Iterator it2 = linkedHashSet.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(Integer.valueOf(((a42.i) it2.next()).getValue()));
                            }
                            List F0 = CollectionsKt.F0(arrayList);
                            k kVar3 = this$0.f138982c;
                            if (kVar3 == null) {
                                Intrinsics.r("modalView");
                                throw null;
                            }
                            String obj = StringsKt.i0(kVar3.f138994f.B0()).toString();
                            rl0 rl0Var = new rl0(0);
                            Integer valueOf = Integer.valueOf(this$0.f138980a.getValue());
                            rl0Var.f41623c = valueOf;
                            boolean[] zArr = rl0Var.f41624d;
                            if (zArr.length > 2) {
                                zArr[2] = true;
                            }
                            rl0Var.f41621a = obj;
                            if (zArr.length > 0) {
                                zArr[0] = true;
                            }
                            rl0Var.f41622b = F0;
                            if (zArr.length > 1) {
                                zArr[1] = true;
                            }
                            ul0 ul0Var = new ul0(obj, F0, valueOf, zArr, 0);
                            Intrinsics.checkNotNullExpressionValue(ul0Var, "build(...)");
                            o oVar = vd0.c.f125622b;
                            oVar.getClass();
                            nm.u i16 = oVar.g(new TypeToken(ul0.class)).b().d(ul0Var).i();
                            h22.f fVar2 = this$0.f138984e;
                            if (fVar2 == null) {
                                Intrinsics.r("storyPinService");
                                throw null;
                            }
                            String sVar = i16.toString();
                            Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
                            fVar2.m(sVar).r(tk2.e.f118017c).l(wj2.c.a()).o(new rf1.v(9, new h(this$0, 1)), new rf1.v(10, new h(this$0, 2)));
                            return;
                    }
                }
            });
        }
        return nVar;
    }

    @Override // jc0.a0
    public final int getLayoutHeight() {
        return -1;
    }
}
