package e90;

import com.pinterest.collage.cutoutcloseup.remoterequest.CollagesCarouselCutoutRelatedModulesPagedRemoteRequest;
import com.pinterest.hairball.network.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;

/* loaded from: classes5.dex */
public final class b extends com.pinterest.framework.multisection.datasource.pagedlist.c {
    public String L;

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final e M(r requestState) {
        Intrinsics.checkNotNullParameter(requestState, "requestState");
        return new CollagesCarouselCutoutRelatedModulesPagedRemoteRequest(this.f49132v, this.f49116f, this.f49117g, this.L);
    }
}
