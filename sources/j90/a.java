package j90;

import com.pinterest.collage.cutoutcloseup.remoterequest.CollagesCarouselCutoutRelatedModulesPagedRemoteRequest;
import com.pinterest.framework.multisection.datasource.pagedlist.i0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import vd0.c;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f75097i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ CollagesCarouselCutoutRelatedModulesPagedRemoteRequest f75098j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(CollagesCarouselCutoutRelatedModulesPagedRemoteRequest collagesCarouselCutoutRelatedModulesPagedRemoteRequest, int i13) {
        super(1);
        this.f75097i = i13;
        this.f75098j = collagesCarouselCutoutRelatedModulesPagedRemoteRequest;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f75097i;
        CollagesCarouselCutoutRelatedModulesPagedRemoteRequest collagesCarouselCutoutRelatedModulesPagedRemoteRequest = this.f75098j;
        switch (i13) {
            case 0:
                c it = (c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return collagesCarouselCutoutRelatedModulesPagedRemoteRequest.parseResponse(it);
            default:
                i0 i0Var = (i0) obj;
                Intrinsics.f(i0Var);
                collagesCarouselCutoutRelatedModulesPagedRemoteRequest.postParseResponse(i0Var);
                return Unit.f80348a;
        }
    }
}
