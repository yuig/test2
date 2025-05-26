package a01;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import b01.l;
import b01.n;
import com.pinterest.api.model.v7;
import g70.h;
import i92.k;
import java.util.ArrayList;
import java.util.List;
import kh2.b0;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import lb0.o;
import m60.w;
import m60.x0;
import ni1.d0;
import ni1.t2;
import sq0.c0;
import wk1.i;
import wk1.q;
import xz0.c;
import yk1.r;

/* loaded from: classes5.dex */
public final class b extends q {

    /* renamed from: a, reason: collision with root package name */
    public final h f209a;

    /* renamed from: b, reason: collision with root package name */
    public final xz0.b f210b;

    /* renamed from: c, reason: collision with root package name */
    public final c f211c;

    /* renamed from: d, reason: collision with root package name */
    public List f212d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String insightId, yz0.a pinalytics, o preferencesManager, w eventManager, t2 viewModelFactory, d0 pinModelToVMStateConverterFactory, uj2.q networkStateStream, s20.a pearService, h boardNavigator) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(insightId, "insightId");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(preferencesManager, "preferencesManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(pinModelToVMStateConverterFactory, "pinModelToVMStateConverterFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pearService, "pearService");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f209a = boardNavigator;
        this.f210b = new xz0.b(insightId, pearService, preferencesManager, new a(1, this, b.class, "onInsightLoaded", "onInsightLoaded(Lcom/pinterest/api/model/PearInsight;)V", 0));
        this.f211c = new c(insightId, pinalytics, viewModelFactory, pinModelToVMStateConverterFactory);
        this.f212d = q0.f80391a;
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        i iVar = (i) dataSources;
        iVar.b(this.f210b);
        iVar.b(this.f211c);
    }

    @Override // wk1.q
    /* renamed from: onBind */
    public final void r3(c0 c0Var) {
        b01.q view = (b01.q) c0Var;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        ((l) view).f20750f1 = this;
    }

    @Override // wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        super.onUnbind();
        ((l) ((b01.q) getView())).f20750f1 = null;
    }

    public final void t3() {
        this.f210b.i2();
    }

    public final void u3(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        h.f(this.f209a, board, null, 6);
    }

    public final void v3() {
        String str;
        List F0 = CollectionsKt.F0(this.f210b.f135191h);
        ArrayList arrayList = new ArrayList();
        for (Object obj : F0) {
            if (obj instanceof zz0.b) {
                arrayList.add(obj);
            }
        }
        zz0.b headerModel = (zz0.b) CollectionsKt.firstOrNull(arrayList);
        if (headerModel == null) {
            return;
        }
        b01.q qVar = (b01.q) getView();
        List coverPins = this.f212d;
        l lVar = (l) qVar;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(coverPins, "coverPins");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        if (lVar.f20756l1.length() > 0) {
            e01.a j93 = lVar.j9();
            Context requireContext = lVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            j93.d(requireContext, lVar.f20756l1);
            return;
        }
        lVar.f7().d(new of0.a(new mf0.l()));
        Context requireContext2 = lVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        n nVar = new n(requireContext2);
        nVar.L(coverPins, headerModel);
        if (lVar.V0 == null) {
            Intrinsics.r("deviceInfoProvider");
            throw null;
        }
        nVar.measure(View.MeasureSpec.makeMeasureSpec(hf0.b.f69002b, 1073741824), 0);
        nVar.layout(0, 0, nVar.getMeasuredWidth(), nVar.getMeasuredHeight());
        if (!nVar.isLaidOut() || nVar.isLayoutRequested()) {
            nVar.addOnLayoutChangeListener(new n5.h(4, nVar, lVar));
            return;
        }
        View findViewById = lVar.requireActivity().getWindow().findViewById(R.id.content);
        Bitmap Q1 = b0.Q1(nVar, null, findViewById != null ? findViewById.getHeight() : -1, 1);
        if (Q1 != null) {
            lVar.j9();
            Context requireContext3 = lVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
            str = e01.a.a(requireContext3, Q1);
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            k kVar = lVar.T0;
            if (kVar == null) {
                Intrinsics.r("toastUtils");
                throw null;
            }
            Context context = nVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            kVar.i(bs1.c.d2(context, x0.generic_error));
        } else {
            lVar.f20756l1 = str;
            e01.a j94 = lVar.j9();
            Context requireContext4 = lVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
            j94.d(requireContext4, str);
        }
        ep.b.C(null, lVar.f7());
    }

    @Override // wk1.q, yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        b01.q view = (b01.q) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        ((l) view).f20750f1 = this;
    }

    @Override // wk1.q, yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        b01.q view = (b01.q) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        ((l) view).f20750f1 = this;
    }
}
