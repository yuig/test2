package sf0;

import a11.e;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import com.pinterest.feature.home.view.k;
import com.pinterest.gestalt.text.GestaltText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import nx.d1;
import pk.a0;
import uj2.q;
import uk1.d;
import yk1.n;
import yk1.r;

/* loaded from: classes5.dex */
public final class b extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final e f112502a;

    /* renamed from: b, reason: collision with root package name */
    public final d1 f112503b;

    /* renamed from: c, reason: collision with root package name */
    public vh f112504c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d pinalytics, q networkStateStream, e clickthroughHelper, d1 trackingParamAttacher) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(clickthroughHelper, "clickthroughHelper");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        this.f112502a = clickthroughHelper;
        this.f112503b = trackingParamAttacher;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        tf0.a view = (tf0.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        ((d61.e) view).f53767k = this;
        vh vhVar = this.f112504c;
        if (vhVar != null) {
            q3(vhVar);
        }
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        ((d61.e) ((tf0.a) getView())).f53767k = null;
        ((tf0.a) getView()).getClass();
        super.onUnbind();
    }

    public final void q3(vh model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f112504c = model;
        if (isBound()) {
            String id3 = model.getUid();
            if (id3 != null) {
                d61.e eVar = (d61.e) ((tf0.a) getView());
                eVar.getClass();
                Intrinsics.checkNotNullParameter(id3, "id");
                eVar.f53768l = id3;
            }
            d61.e eVar2 = (d61.e) ((tf0.a) getView());
            eVar2.f53769m = model.u();
            eVar2.f53770n = null;
            List list = model.f42865w;
            Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
            ArrayList pins = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof f30) {
                    pins.add(obj);
                }
            }
            tf0.a aVar = (tf0.a) getView();
            kj kjVar = model.f42855m;
            String text = kjVar != null ? kjVar.a() : null;
            ih ihVar = model.f42857o;
            String text2 = ihVar != null ? ihVar.g() : null;
            Map c13 = model.c();
            Object obj2 = c13 != null ? c13.get("eyebrow_text") : null;
            Map map = obj2 instanceof Map ? (Map) obj2 : null;
            String text3 = map != null ? (String) map.get("format") : null;
            Map c14 = model.c();
            Object obj3 = c14 != null ? c14.get("hide_action_button") : null;
            if (obj3 instanceof Boolean) {
            }
            d61.e eVar3 = (d61.e) aVar;
            eVar3.getClass();
            Intrinsics.checkNotNullParameter(pins, "pins");
            if (text != null) {
                Intrinsics.checkNotNullParameter(text, "text");
                boolean z13 = !z.j(text);
                GestaltText gestaltText = eVar3.f45878e;
                if (z13) {
                    gestaltText.i(new k(text, 1));
                } else {
                    a0.k0(gestaltText);
                }
            }
            Intrinsics.checkNotNullParameter(pins, "pins");
            eVar3.post(new dp.a(21, eVar3, pins));
            com.pinterest.feature.home.view.e eVar4 = eVar3.f45880g;
            if (text2 != null) {
                Intrinsics.checkNotNullParameter(text2, "text");
                eVar4.f45860o = text2;
            }
            if (text3 != null) {
                Intrinsics.checkNotNullParameter(text3, "text");
                boolean z14 = !z.j(text3);
                GestaltText gestaltText2 = eVar3.f45877d;
                if (z14) {
                    gestaltText2.i(new k(text3, 0));
                } else {
                    a0.k0(gestaltText2);
                }
            }
            if (!pins.isEmpty()) {
                eVar4.f45857l = true;
            }
            Iterator it = pins.iterator();
            while (it.hasNext()) {
                this.f112503b.h(getPinalytics(), (f30) it.next());
            }
        }
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        tf0.a view = (tf0.a) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        ((d61.e) view).f53767k = this;
        vh vhVar = this.f112504c;
        if (vhVar != null) {
            q3(vhVar);
        }
    }
}
