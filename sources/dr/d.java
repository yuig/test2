package dr;

import com.pinterest.api.model.PinnableImage;
import com.pinterest.api.model.kr;
import com.pinterest.feature.sharesheet.view.ContactSearchListCell;
import com.pinterest.gestalt.text.GestaltText;
import i11.p;
import i11.q;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements ak2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f56165b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f56166c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f56167d;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i13) {
        this.f56164a = i13;
        this.f56165b = obj;
        this.f56166c = obj2;
        this.f56167d = obj3;
    }

    @Override // ak2.e
    public final void accept(Object obj) {
        int i13 = 0;
        int i14 = this.f56164a;
        Object obj2 = this.f56167d;
        Object obj3 = this.f56166c;
        Object obj4 = this.f56165b;
        switch (i14) {
            case 0:
                k kVar = (k) obj4;
                ContactSearchListCell contactSearchListCell = (ContactSearchListCell) obj3;
                kVar.getClass();
                GestaltText gestaltText = (GestaltText) contactSearchListCell.findViewById(vc0.b.inline_send_confirmation);
                contactSearchListCell.a(false);
                gestaltText.i(new cp.i(kVar, 4));
                kVar.f56197l.put((String) obj2, "");
                break;
            default:
                q this$0 = (q) obj4;
                h11.d data = (h11.d) obj3;
                PinnableImage image = (PinnableImage) obj2;
                tt1.a imageApiResponse = (tt1.a) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(data, "$data");
                Intrinsics.checkNotNullParameter(image, "$image");
                Intrinsics.checkNotNullParameter(imageApiResponse, "imageApiResponse");
                n22.a aVar = this$0.f71040r0;
                int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(this$0.f71036n0.getTime());
                String str = data.f66457a;
                String str2 = image.f35568e;
                Intrinsics.checkNotNullExpressionValue(str2, "getDescription(...)");
                String str3 = image.f35576m;
                Intrinsics.checkNotNullExpressionValue(str3, "getAltText(...)");
                String str4 = image.f35570g;
                Intrinsics.checkNotNullExpressionValue(str4, "getSourceUrl(...)");
                String a13 = ((kr) imageApiResponse.c()).a();
                String str5 = image.f35567d;
                Intrinsics.checkNotNullExpressionValue(str5, "getTitle(...)");
                aVar.a(seconds, str, data.f66464h, str2, null, str3, str4, a13, str5, null, n00.b.a(n00.c.SCHEDULED_PIN_FEED)).r(tk2.e.f118017c).l(wj2.c.a()).o(new i11.c(1, new rx0.f(this$0, data, image, 6)), new i11.c(2, new p(this$0, i13)));
                break;
        }
    }
}
