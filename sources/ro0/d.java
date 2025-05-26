package ro0;

import android.webkit.JavascriptInterface;
import com.pinterest.api.model.PinnableImage;
import com.pinterest.api.model.b40;
import com.pinterest.repository.pinnableimagefeed.PinnableImageFeed;
import java.util.ArrayList;
import java.util.HashSet;
import m60.x0;
import pk.a0;
import tb0.h;

/* loaded from: classes5.dex */
public final class d implements po0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f108940a;

    public d(e eVar) {
        this.f108940a = eVar;
    }

    @Override // po0.c
    @JavascriptInterface
    public void onPinsLoaded(String str) {
        e eVar = this.f108940a;
        if (a0.x0(str)) {
            return;
        }
        try {
            vd0.c cVar = new vd0.c(str);
            String o13 = cVar.o("pinmarkletClosedReason", "");
            if (!a0.x0(o13)) {
                e.p3(eVar, o13);
                return;
            }
            PinnableImageFeed pinnableImageFeed = new PinnableImageFeed(cVar.k("thumb"));
            vd0.c m13 = cVar.m("meta");
            vd0.c m14 = cVar.m("rich");
            if (eVar.f108942c != null && eVar.f108950k <= 1) {
                PinnableImage pinnableImage = new PinnableImage();
                pinnableImage.f35564a = eVar.f108942c.getUid();
                pinnableImage.f35569f = bs1.c.B0(eVar.f108942c);
                pinnableImage.f35565b = bs1.c.C0(eVar.f108942c);
                pinnableImage.f35566c = bs1.c.A0(eVar.f108942c);
                pinnableImage.f35568e = eVar.f108942c.c4();
                pinnableImage.f35570g = b40.h(eVar.f108942c);
                if (!pinnableImageFeed.v()) {
                    pinnableImageFeed.B();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(pinnableImage);
                arrayList.addAll(pinnableImageFeed.f35557i);
                pinnableImageFeed.H(arrayList);
            }
            e.q3(eVar, pinnableImageFeed, m13 != null ? m13.f125623a.toString() : null, m14);
        } catch (Exception e13) {
            HashSet hashSet = h.f117076w;
            tb0.g.f117075a.o("PinMarkletFailure", e13);
            eVar.x3(x0.pinmarklet_generic_error);
        }
    }
}
