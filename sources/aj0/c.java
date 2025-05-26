package aj0;

import com.pinterest.api.model.ih;
import com.pinterest.api.model.xk;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import dl1.s;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import pk.a0;
import sq0.e0;

/* loaded from: classes5.dex */
public final class c extends vq0.b {

    /* renamed from: c, reason: collision with root package name */
    public List f15419c;

    /* renamed from: d, reason: collision with root package name */
    public String f15420d;

    /* renamed from: e, reason: collision with root package name */
    public String f15421e;

    @Override // vq0.g
    /* renamed from: D3, reason: merged with bridge method [inline-methods] */
    public final void r3(zi0.b bVar) {
        super.r3(bVar);
        x3(this.f15419c);
        String title = this.f15420d;
        Intrinsics.checkNotNullParameter(title, "title");
        a0.p(((bj0.e) bVar).f22952d, title);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        String str;
        s sVar = (s) d().get(i13);
        boolean z13 = sVar instanceof xk;
        if (z13 && (str = ((xk) sVar).f43730v) != null) {
            Intrinsics.checkNotNullExpressionValue(str, "getVideoCoverPinId(...)");
            if (str.length() > 0) {
                return RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_VIDEO;
            }
        }
        if (!z13) {
            return RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_IMAGE;
        }
        ih ihVar = ((xk) sVar).f43728t;
        return (ihVar != null ? ihVar.g() : null) != null ? z.i("virtual_try_on_shop", this.f15421e, true) ? RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM_TINTED : RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM : RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_IMAGE;
    }

    @Override // vq0.g
    public final e0 p3() {
        return this;
    }
}
