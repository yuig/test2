package ru0;

import android.content.Context;
import android.graphics.RectF;
import android.view.KeyEvent;
import com.facebook.login.o;
import com.pinterest.api.model.dk;
import com.pinterest.api.model.fk;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.qq;
import com.pinterest.api.model.rq;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.tq;
import com.pinterest.api.model.uk;
import com.pinterest.api.model.wk;
import com.pinterest.feature.ideaPinCreation.closeup.view.a2;
import com.pinterest.feature.ideaPinCreation.closeup.view.r0;
import com.pinterest.feature.ideaPinCreation.closeup.view.s0;
import com.pinterest.feature.ideaPinCreation.closeup.view.u1;
import com.pinterest.feature.ideaPinCreation.closeup.view.z0;
import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import dl1.l;
import dl1.t;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pu0.m;
import pu0.p;
import pu0.q;
import pu0.s;
import pu0.z;
import x02.i2;
import x02.x2;
import yk1.n;

/* loaded from: classes5.dex */
public final class j extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f109996a;

    /* renamed from: b, reason: collision with root package name */
    public final z f109997b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f109998c;

    /* renamed from: d, reason: collision with root package name */
    public final ag1.b f109999d;

    /* renamed from: e, reason: collision with root package name */
    public final t f110000e;

    /* renamed from: f, reason: collision with root package name */
    public final i2 f110001f;

    /* renamed from: g, reason: collision with root package name */
    public final x2 f110002g;

    /* renamed from: h, reason: collision with root package name */
    public s f110003h;

    /* renamed from: i, reason: collision with root package name */
    public ln0 f110004i;

    /* renamed from: j, reason: collision with root package name */
    public tp f110005j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String overlayBlockId, z modalType, Context context, ag1.b dataManager, t storyPinLocalDataRepository, i2 pinRepository, x2 userRepository) {
        super(0);
        Intrinsics.checkNotNullParameter(overlayBlockId, "overlayBlockId");
        Intrinsics.checkNotNullParameter(modalType, "modalType");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(storyPinLocalDataRepository, "storyPinLocalDataRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f109996a = overlayBlockId;
        this.f109997b = modalType;
        this.f109998c = context;
        this.f109999d = dataManager;
        this.f110000e = storyPinLocalDataRepository;
        this.f110001f = pinRepository;
        this.f110002g = userRepository;
    }

    public static final tq p3(j jVar, tq tqVar, tp tpVar) {
        jVar.getClass();
        return tq.b(tqVar, 0L, tqVar.h() ? tqVar.g(tpVar.v()) : tqVar.getEndTimeMs() - tqVar.getStartTimeMs() == tpVar.v() ? 0L : tqVar.getEndTimeMs(), null, null, 13);
    }

    public static final void q3(qq qqVar, j jVar, RectF rectF, Function1 function1, dl1.s sVar) {
        jVar.getClass();
        qq s33 = s3(qqVar);
        float f13 = 3;
        s0 s0Var = new s0(jVar.f109998c, s33, sVar, rectF.height() * f13, rectF.width() * f13, rectF);
        o bitmapListener = new o(function1);
        Intrinsics.checkNotNullParameter(bitmapListener, "bitmapListener");
        KeyEvent.Callback callback = s0Var.f46318t;
        Intrinsics.g(callback, "null cannot be cast to non-null type com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinStickerRepView");
        ((u1) callback).b(new l0.d(s0Var, callback, bitmapListener, 16));
    }

    public static final void r3(qq qqVar, Function1 function1, j jVar, RectF rectF, a2 a2Var, String str) {
        Context context = jVar.f109998c;
        qq s33 = s3(qqVar);
        float f13 = 3;
        function1.invoke(new z0(context, a2Var, s33, str, rectF.width() * f13, rectF.height() * f13, rectF).g2());
    }

    public static qq s3(qq qqVar) {
        return qqVar.a(rq.a(qqVar.getConfig(), null, null, null, 23), qqVar.getDurationConfig());
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        pu0.t view = (pu0.t) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        addDisposable(((l) this.f110000e).P(this.f109999d.d()).F(new mu0.a(7, new h(this, view, 1)), new mu0.a(8, i.f109995i), ck2.i.f27923c, ck2.i.f27924d));
    }

    public final void t3(pu0.o action) {
        Intrinsics.checkNotNullParameter(action, "action");
        boolean z13 = action instanceof pu0.l;
        String str = this.f109996a;
        if (z13) {
            fk type = ((dk) ((pu0.l) action).f101400a.getSpec()).getType();
            tp tpVar = this.f110005j;
            if (tpVar == null) {
                Intrinsics.r("currentPage");
                throw null;
            }
            this.f110005j = tp.h0(tpVar, str, null, new r0(3, this, type), 2);
            s sVar = this.f110003h;
            if (sVar == null) {
                Intrinsics.r(AnimatedTarget.PROPERTY_STATE);
                throw null;
            }
            ArrayList arrayList = sVar.f101424d;
            ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                p pVar = (p) it.next();
                arrayList2.add(((dk) pVar.f101409k.getSpec()).getType() == type ? p.f(pVar, true) : p.f(pVar, false));
            }
            this.f110003h = s.a(sVar, arrayList2);
            pu0.t tVar = (pu0.t) getView();
            s sVar2 = this.f110003h;
            if (sVar2 != null) {
                ((su0.o) tVar).b8(sVar2);
                return;
            } else {
                Intrinsics.r(AnimatedTarget.PROPERTY_STATE);
                throw null;
            }
        }
        if (!(action instanceof m)) {
            if (!Intrinsics.d(action, pu0.n.f101403b)) {
                if (Intrinsics.d(action, pu0.n.f101402a)) {
                    ((su0.o) ((pu0.t) getView())).P7();
                    return;
                }
                return;
            }
            tp tpVar2 = this.f110005j;
            if (tpVar2 == null) {
                Intrinsics.r("currentPage");
                throw null;
            }
            tp q13 = tpVar2.q(false, true);
            ln0 ln0Var = this.f110004i;
            if (ln0Var == null) {
                Intrinsics.r("currentPin");
                throw null;
            }
            ((l) this.f110000e).W(ln0.a(ln0Var, null, q13, null, null, null, null, false, null, null, null, null, 16379));
            ((su0.o) ((pu0.t) getView())).P7();
            return;
        }
        wk type2 = ((uk) ((m) action).f101401a.getSpec()).getType();
        tp tpVar3 = this.f110005j;
        if (tpVar3 == null) {
            Intrinsics.r("currentPage");
            throw null;
        }
        this.f110005j = tp.h0(tpVar3, str, null, new r0(4, this, type2), 2);
        s sVar3 = this.f110003h;
        if (sVar3 == null) {
            Intrinsics.r(AnimatedTarget.PROPERTY_STATE);
            throw null;
        }
        ArrayList arrayList3 = sVar3.f101425e;
        ArrayList arrayList4 = new ArrayList(g0.q(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            q qVar = (q) it2.next();
            arrayList4.add(((uk) qVar.f101415k.getSpec()).getType() == type2 ? q.f(qVar, true) : q.f(qVar, false));
        }
        this.f110003h = s.a(sVar3, arrayList4);
        pu0.t tVar2 = (pu0.t) getView();
        s sVar4 = this.f110003h;
        if (sVar4 != null) {
            ((su0.o) tVar2).b8(sVar4);
        } else {
            Intrinsics.r(AnimatedTarget.PROPERTY_STATE);
            throw null;
        }
    }
}
