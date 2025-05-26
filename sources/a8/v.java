package a8;

import a7.c1;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.facebook.FacebookException;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.h2;
import com.pinterest.design.brio.widget.voice.PinterestToolTip;
import com.pinterest.education.view.EducationToolTipView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.HashMap;
import java.util.Iterator;
import kh2.a1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import la0.x1;
import nx.h1;
import o82.o2;
import pk.t2;
import pk.v2;
import pk.x0;

/* loaded from: classes3.dex */
public final /* synthetic */ class v implements k8.n, q8.i, d7.i, e7.v, ab.d, df.s, sg.a, r5.p, r5.b, ex.f, o2, h1, oe0.f, uj2.s {

    /* renamed from: a */
    public final /* synthetic */ int f1464a;

    /* renamed from: b */
    public final /* synthetic */ Object f1465b;

    public /* synthetic */ v(Object obj, int i13) {
        this.f1464a = i13;
        this.f1465b = obj;
    }

    @Override // e7.v
    public final void a(long j13, d7.d0 d0Var) {
        f0.h.u(j13, d0Var, (q8.k0[]) ((m.h) this.f1465b).f85199d);
    }

    @Override // d7.i
    public final void accept(Object obj) {
        int i13 = this.f1464a;
        Object obj2 = this.f1465b;
        switch (i13) {
            case 4:
                l9.g gVar = (l9.g) obj2;
                l9.a aVar = (l9.a) obj;
                gVar.getClass();
                long j13 = aVar.f82295b;
                gVar.f82305b.getClass();
                l9.f fVar = new l9.f(j13, g4.u.d0(aVar.f82296c, aVar.f82294a));
                gVar.f82307d.add(fVar);
                long j14 = gVar.f82314k;
                if (j14 == -9223372036854775807L || aVar.f82295b >= j14) {
                    gVar.c(fVar);
                    break;
                }
                break;
            default:
                ((x0) obj2).e((l9.a) obj);
                break;
        }
    }

    @Override // oe0.f
    public final void b() {
        EducationToolTipView this$0 = (EducationToolTipView) this.f1465b;
        int i13 = EducationToolTipView.f45022m;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        oe0.g gVar = this$0.f45025c;
        PinterestToolTip pinterestToolTip = this$0.f45024b;
        Intrinsics.g(pinterestToolTip, "null cannot be cast to non-null type com.pinterest.design.brio.widget.voice.PinterestVoiceLayout");
        gVar.getClass();
        oe0.g.c(pinterestToolTip, 0.0f, this$0.f45026d, this$0.f45027e, null);
    }

    @Override // sg.a
    public final void c() {
        qg.h hVar = (qg.h) this.f1465b;
        rg.g gVar = (rg.g) hVar.f103821b;
        gVar.getClass();
        Iterator it = ((Iterable) gVar.c(new c3.e(2))).iterator();
        while (it.hasNext()) {
            ((qg.c) hVar.f103822c).a((lg.b) it.next());
        }
    }

    @Override // q8.i
    public final long d(long j13) {
        return d7.n0.j((j13 * r0.f103001e) / 1000000, 0L, ((q8.x) this.f1465b).f103006j - 1);
    }

    @Override // k8.n
    public final v2 e(int i13, c1 c1Var, int[] iArr) {
        k8.j jVar = (k8.j) this.f1465b;
        t2 t2Var = k8.q.f78564j;
        x0 n13 = pk.c1.n();
        for (int i14 = 0; i14 < c1Var.f964a; i14++) {
            n13.e(new k8.g(i13, c1Var, i14, jVar, iArr[i14]));
        }
        return n13.i();
    }

    @Override // nx.h1
    public final HashMap f() {
        int i13 = this.f1464a;
        Object obj = this.f1465b;
        switch (i13) {
            case 24:
                x1 this$0 = (x1) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return this$0.f82481b.f();
            case 27:
                tj0.z this$02 = (tj0.z) obj;
                int i14 = tj0.z.f117908n;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                return this$02.f117911c.f();
            default:
                jm0.j this$03 = (jm0.j) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                return this$03.s7().f();
        }
    }

    @Override // o82.o2
    public final Object invoke(Object obj) {
        int i13 = this.f1464a;
        Object obj2 = this.f1465b;
        switch (i13) {
            case 21:
                com.pinterest.boardAutoCollages.q this$0 = (com.pinterest.boardAutoCollages.q) obj2;
                com.pinterest.boardAutoCollages.d vmState = (com.pinterest.boardAutoCollages.d) obj;
                int i14 = com.pinterest.boardAutoCollages.q.T0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                this$0.getClass();
                e30 R6 = new f30().R6();
                R6.h2(vmState.f44549a);
                return new xa0.a(R6.a(), 0, true, false, false, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN);
            case 22:
                w90.p this$02 = (w90.p) obj2;
                xa0.f vmState2 = (xa0.f) obj;
                int i15 = w90.p.V0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(vmState2, "vmState");
                this$02.getClass();
                if ((vmState2 instanceof xa0.d) || (vmState2 instanceof xa0.b) || (vmState2 instanceof xa0.e)) {
                    return new xa0.a(null, 0, false, false, false, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
                }
                if (!(vmState2 instanceof xa0.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                e30 R62 = new f30().R6();
                xa0.c cVar = (xa0.c) vmState2;
                R62.h2(cVar.f134396a);
                return new xa0.a(R62.a(), cVar.f134397b, false, true, false, false, RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW);
            default:
                ea0.t this$03 = (ea0.t) obj2;
                ea0.z vmState3 = (ea0.z) obj;
                int i16 = ea0.t.W0;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(vmState3, "vmState");
                this$03.getClass();
                return ea0.v.d(vmState3, com.bumptech.glide.d.G(this$03, "RetrievalExtras.COLLAGE_IS_TEMPLATES", false));
        }
    }

    @Override // df.s
    public final void j(boolean z13) {
        String str = (String) this.f1465b;
        int i13 = FacebookException.f29901a;
        if (z13) {
            try {
                a1.q0(str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // r5.p
    public final boolean l(View view) {
        BottomSheetDragHandleView bottomSheetDragHandleView = (BottomSheetDragHandleView) this.f1465b;
        int i13 = BottomSheetDragHandleView.f32328j;
        return bottomSheetDragHandleView.f2();
    }

    @Override // uj2.s
    public final void o(fk2.f emitter) {
        m60.w this_actionEvents = (m60.w) this.f1465b;
        Intrinsics.checkNotNullParameter(this_actionEvents, "$this_actionEvents");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        sg0.g gVar = new sg0.g(emitter);
        this_actionEvents.h(gVar);
        xj2.a aVar = new xj2.a(new fp.a(4, this_actionEvents, gVar));
        switch (emitter.f62432a) {
            case 0:
                bk2.c.set(emitter, aVar);
                break;
            default:
                bk2.c.set(emitter, aVar);
                break;
        }
    }

    @Override // ab.d
    public final void onSuccess(ab.g gVar) {
        ab.d dVar = (ab.d) this.f1465b;
        int i13 = ab.e.f1688a;
        new Handler(Looper.getMainLooper()).post(new androidx.media3.ui.z(4, dVar, gVar));
    }

    @Override // ex.f
    public final void p(h2 it) {
        gx.m this$0 = (gx.m) this.f1465b;
        int i13 = gx.m.f66260l;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        u50.r rVar = this$0.f66267g;
        if (rVar != null) {
            rVar.a(new gx.c(it));
        }
    }
}
