package bg0;

import android.content.Context;
import c91.e;
import cg0.b;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import com.pinterest.ui.imageview.ProportionalImageView;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import pg0.g0;
import pk.a0;
import rg0.n;
import yk1.c;
import yk1.r;

/* loaded from: classes5.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public n f22780a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f22781b;

    /* renamed from: c, reason: collision with root package name */
    public vh f22782c;

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        ag0.a view = (ag0.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((b) view).f27701q = this;
        r3(this.f22782c);
    }

    public final void q3() {
        vh story = this.f22782c;
        Integer num = this.f22781b;
        if (story != null && num != null) {
            ag0.a aVar = (ag0.a) getView();
            int intValue = num.intValue();
            b bVar = (b) aVar;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(story, "story");
            w wVar = bVar.f27695k;
            if (wVar == null) {
                Intrinsics.r("eventManager");
                throw null;
            }
            wVar.f(new g0(intValue));
        }
        b bVar2 = (b) ((ag0.a) getView());
        e eVar = bVar2.f27696l;
        if (eVar == null) {
            Intrinsics.r("onDemandModuleControllerFactory");
            throw null;
        }
        Context context = bVar2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        eVar.a(bs1.c.k0(context), bVar2.f27694j).a(new tc0.c(bVar2, 25), null, c91.a.f26973a);
        n nVar = this.f22780a;
        if (nVar != null) {
            nVar.a(null, null);
        }
    }

    public final void r3(vh vhVar) {
        String str;
        String text;
        if (!isBound() || vhVar == null) {
            return;
        }
        ag0.a aVar = (ag0.a) getView();
        String id3 = vhVar.getUid();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        b bVar = (b) aVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(id3, "id");
        bVar.f27699o = id3;
        kj kjVar = vhVar.f42855m;
        if (kjVar != null && (text = kjVar.a()) != null) {
            b bVar2 = (b) ((ag0.a) getView());
            bVar2.getClass();
            Intrinsics.checkNotNullParameter(text, "text");
            a0.p(bVar2.f27697m, text);
        }
        String imageUrl = vhVar.D;
        if (imageUrl != null) {
            b bVar3 = (b) ((ag0.a) getView());
            bVar3.getClass();
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            ProportionalImageView proportionalImageView = bVar3.f27698n;
            if (!Intrinsics.d(imageUrl, proportionalImageView.f52563o)) {
                proportionalImageView.loadUrl(imageUrl);
            }
        }
        if (this.f22780a == null && (str = vhVar.f42853k) != null) {
            this.f22780a = n.f(new vd0.c(str));
        }
        if (!vhVar.f42866x) {
            n nVar = this.f22780a;
            if (nVar != null) {
                nVar.g();
            }
            vhVar.f42866x = true;
        }
        ((b) ((ag0.a) getView())).f27700p = vhVar.u();
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        ag0.a view = (ag0.a) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((b) view).f27701q = this;
        r3(this.f22782c);
    }
}
