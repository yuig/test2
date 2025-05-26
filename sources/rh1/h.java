package rh1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.p implements Function0 {
    public h(Object obj) {
        super(0, obj, k.class, "onClickCommentBannerCancel", "onClickCommentBannerCancel()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        com.pinterest.feature.unifiedcomments.c cVar = ((k) this.receiver).Z0;
        if (cVar != null) {
            cVar.d3();
        }
        return Unit.f80348a;
    }
}
