package qz0;

import com.pinterest.api.model.h20;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import pe.i;
import rz0.c;
import rz0.e;

/* loaded from: classes5.dex */
public final /* synthetic */ class a extends p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        h20 p03 = (h20) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        b bVar = (b) this.receiver;
        if (bVar.isBound()) {
            e eVar = (e) bVar.getView();
            String imageUrl = i.z(p03);
            c cVar = (c) eVar;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            WebImageView webImageView = cVar.C0;
            if (webImageView == null) {
                Intrinsics.r("coverImageView");
                throw null;
            }
            webImageView.V1(imageUrl, (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
        }
        return Unit.f80348a;
    }
}
