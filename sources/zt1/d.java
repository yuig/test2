package zt1;

import android.content.Context;
import android.os.Bundle;
import com.pinterest.component.modal.BaseModalViewWrapper;
import h32.a4;
import h32.d4;
import h32.i0;
import jc0.n;
import kotlin.jvm.internal.Intrinsics;
import me.o;
import nx.j0;
import nx.m;
import so.l5;
import so.s8;
import x02.i2;
import yk1.l;
import yq1.u1;

/* loaded from: classes4.dex */
public final class d extends l implements nx.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f142770a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f142771b;

    /* renamed from: c, reason: collision with root package name */
    public j0 f142772c;

    /* renamed from: d, reason: collision with root package name */
    public g f142773d;

    /* renamed from: e, reason: collision with root package name */
    public ed1.f f142774e;

    /* renamed from: f, reason: collision with root package name */
    public l5 f142775f;

    public d(String pinUid, Integer num) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f142770a = pinUid;
        this.f142771b = num;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        n nVar = new n(context, true);
        this.f142772c = ((m) nVar.C()).a(this);
        g gVar = new g(context, this);
        this.f142773d = gVar;
        nVar.x(gVar);
        nVar.T(false);
        nVar.l(yt1.d.music_sheet_title);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(eo1.c.space_400);
        nVar.Z(dimensionPixelSize, 0, dimensionPixelSize, 0);
        nVar.j(new yj1.d(this, 23));
        gVar.f142781c = new u1(nVar, 10);
        this.f142775f = (l5) ((s8) ((c) o.a(bs1.c.k0(context), c.class))).Fd.get();
        return nVar;
    }

    @Override // yk1.l
    public final yk1.m createPresenter() {
        l5 l5Var = this.f142775f;
        if (l5Var == null) {
            Intrinsics.r("musicSheetModalPresenterFactory");
            throw null;
        }
        j0 j0Var = this.f142772c;
        if (j0Var == null) {
            Intrinsics.r("pinalytics");
            throw null;
        }
        ed1.f fVar = new ed1.f(this.f142770a, this.f142771b, j0Var, (i2) l5Var.f113533a.f114090a.F3.get());
        this.f142774e = fVar;
        return fVar;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(d4.MODAL, a4.MUSIC_PLAYLIST, null, null, null, null);
    }

    @Override // jc0.a0
    public final String getPinId() {
        return this.f142770a;
    }

    @Override // yk1.l
    public final yk1.n getView() {
        g gVar = this.f142773d;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.r("musicSheetModalView");
        throw null;
    }

    @Override // jc0.a0
    public final d4 getViewType() {
        return d4.MODAL;
    }
}
