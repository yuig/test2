package fh1;

import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import gh1.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import rg0.n;
import xk2.v;
import yk1.c;
import yk1.r;

/* loaded from: classes5.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public n f62166a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f62167b;

    /* renamed from: c, reason: collision with root package name */
    public vh f62168c;

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        eh1.a view = (eh1.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((b) view).f65013n = this;
        q3(this.f62168c);
    }

    public final void q3(vh vhVar) {
        String str;
        String text;
        if (!isBound() || vhVar == null) {
            return;
        }
        ((b) ((eh1.a) getView())).f65014o = vhVar.getUid();
        ((b) ((eh1.a) getView())).f65015p = vhVar.u();
        String g13 = vhVar.f42857o.g();
        if (g13 != null) {
            ((eh1.a) getView()).X0(g13);
        }
        List urls = vhVar.M;
        if (urls != null) {
            b bVar = (b) ((eh1.a) getView());
            bVar.getClass();
            Intrinsics.checkNotNullParameter(urls, "urls");
            List y03 = CollectionsKt.y0(urls, 3);
            if (!Intrinsics.d(y03, bVar.f65011l)) {
                bVar.f65011l = urls;
                int size = y03.size();
                if (size != 0) {
                    v vVar = bVar.f65006g;
                    if (size != 1) {
                        ArrayList arrayList = bVar.f65016q;
                        arrayList.clear();
                        Object value = vVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        Object value2 = bVar.f65007h.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        Object value3 = bVar.f65008i.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        WebImageView[] webImageViewArr = {(WebImageView) value, (WebImageView) value2, (WebImageView) value3};
                        int i13 = 0;
                        for (Object obj : y03) {
                            int i14 = i13 + 1;
                            if (i13 < 0) {
                                f0.p();
                                throw null;
                            }
                            webImageViewArr[i13].loadUrl((String) obj);
                            arrayList.add(webImageViewArr[i13]);
                            i13 = i14;
                        }
                        if (!bVar.f65012m) {
                            bVar.L(0);
                        }
                    } else {
                        Object value4 = vVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        ((WebImageView) value4).loadUrl((String) urls.get(0));
                    }
                }
            }
        }
        Boolean bool = vhVar.N;
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        eh1.a aVar = (eh1.a) getView();
        boolean booleanValue = bool.booleanValue();
        b bVar2 = (b) aVar;
        Object value5 = bVar2.f65004e.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        bs1.c.R1((GestaltText) value5, booleanValue);
        Object value6 = bVar2.f65005f.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        bs1.c.R1((GestaltText) value6, booleanValue);
        kj kjVar = vhVar.f42855m;
        if (kjVar != null && (text = kjVar.a()) != null) {
            b bVar3 = (b) ((eh1.a) getView());
            bVar3.getClass();
            Intrinsics.checkNotNullParameter(text, "text");
            Object value7 = bVar3.f65009j.getValue();
            Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
            a0.p((GestaltText) value7, text);
        }
        if (this.f62166a == null && (str = vhVar.f42853k) != null) {
            this.f62166a = n.f(new vd0.c(str));
        }
        if (vhVar.f42866x) {
            return;
        }
        n nVar = this.f62166a;
        if (nVar != null) {
            nVar.g();
        }
        vhVar.f42866x = true;
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        eh1.a view = (eh1.a) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((b) view).f65013n = this;
        q3(this.f62168c);
    }
}
