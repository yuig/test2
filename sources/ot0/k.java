package ot0;

import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import sq0.c0;
import tj0.s;
import wk1.q;

/* loaded from: classes5.dex */
public final class k extends q {

    /* renamed from: a, reason: collision with root package name */
    public final ss0.a f97528a;

    /* renamed from: b, reason: collision with root package name */
    public String f97529b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(s presenterPinalytics, c boardSelectionListener, uj2.q networkStateStream) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(boardSelectionListener, "boardSelectionListener");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f97528a = new ss0.a(boardSelectionListener);
        this.f97529b = "";
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((wk1.i) dataSources).b(this.f97528a);
    }

    @Override // wk1.q, yk1.p
    /* renamed from: t3, reason: merged with bridge method [inline-methods] */
    public final void r3(d view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        i iVar = (i) view;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        iVar.G0 = this;
        ((uk2.d) this.f97528a.F).c(this.f97529b);
    }

    public final void u3(String newQuery) {
        Intrinsics.checkNotNullParameter(newQuery, "newQuery");
        this.f97529b = newQuery;
        ((uk2.d) this.f97528a.F).c(newQuery);
    }

    public final void v3(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        HashMap hashMap = new HashMap();
        hashMap.put("board_id", id3);
        getPresenterPinalytics().f122379a.h(g0.IDEA_PIN_BOARD_STICKER_PICKER, u0.IDEA_PIN_BOARD_STICKER_PICKER_OPTION, hashMap);
    }
}
