package lx0;

import com.pinterest.api.model.rx;
import com.pinterest.api.model.zs;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.ui.grid.TopicGridCell;
import java.util.ArrayList;
import jk.v;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nk1.g;
import pk.a0;
import qa2.l;
import qv0.d0;
import uo0.f;
import vq0.h;
import xo0.x;
import yk1.n;

/* loaded from: classes5.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85059a;

    /* renamed from: b, reason: collision with root package name */
    public final w f85060b;

    public a(w eventManager, int i13) {
        this.f85059a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(eventManager, "eventManager");
            this.f85060b = eventManager;
        } else {
            Intrinsics.checkNotNullParameter(eventManager, "eventManager");
            this.f85060b = eventManager;
        }
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        String topicName;
        switch (this.f85059a) {
            case 0:
                TopicGridCell view = (TopicGridCell) nVar;
                zs model = (zs) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                view.setOnClickListener(new d0(6, this, model));
                view.b();
                view.e(v.n(model), v.o(model));
                String D = model.D();
                topicName = D != null ? D : "";
                Intrinsics.checkNotNullParameter(topicName, "topicName");
                a0.p(view.f52540a, topicName);
                view.a(model, new g(null, null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK), l.f103310t);
                break;
            default:
                x view2 = (x) nVar;
                rx model2 = (rx) obj;
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(model2, "model");
                view2.setOnClickListener(new d0(7, model2, this));
                ArrayList arrayList = model2.f41711f;
                String str = arrayList != null ? (String) CollectionsKt.U(0, arrayList) : null;
                topicName = str != null ? str : "";
                uo0.g.f122925a.getClass();
                view2.k(topicName, f.f122924b);
                String e13 = model2.e();
                Intrinsics.checkNotNullExpressionValue(e13, "getTerm(...)");
                view2.l(e13, true);
                view2.f();
                break;
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        switch (this.f85059a) {
            case 0:
                zs model = (zs) obj;
                Intrinsics.checkNotNullParameter(model, "model");
                return model.D();
            default:
                rx model2 = (rx) obj;
                Intrinsics.checkNotNullParameter(model2, "model");
                return model2.e();
        }
    }
}
