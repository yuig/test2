package ot0;

import android.content.res.Resources;
import com.pinterest.api.model.v7;
import com.pinterest.component.board.view.LegoBoardRep;
import dc0.q;
import kotlin.jvm.internal.Intrinsics;
import xa0.m;
import yk1.n;

/* loaded from: classes5.dex */
public final class b extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final c f97518a;

    public b(c boardSelectionListener) {
        Intrinsics.checkNotNullParameter(boardSelectionListener, "boardSelectionListener");
        this.f97518a = boardSelectionListener;
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        LegoBoardRep view = (LegoBoardRep) nVar;
        v7 model = (v7) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        q qVar = q.List;
        Resources resources = view.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        view.d0(gi2.b.W(model, qVar, resources));
        view.setOnClickListener(new m(22, this, model));
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        v7 model = (v7) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
