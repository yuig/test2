package mu0;

import com.pinterest.api.model.bo0;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.tp;
import com.pinterest.navigation.Navigation;
import h32.f1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nx.d0;
import wt1.c0;
import wt1.p;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88287i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f88288j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(j jVar, int i13) {
        super(1);
        this.f88287i = i13;
        this.f88288j = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        tp pageData;
        String y13;
        int i13 = 0;
        int i14 = this.f88287i;
        j jVar = this.f88288j;
        switch (i14) {
            case 0:
                jVar.f88314k.i2();
                break;
            case 1:
                c0 c0Var = (c0) obj;
                if (c0Var instanceof p) {
                    iu0.a aVar = (iu0.a) jVar.getView();
                    gd0.g gVar = jVar.f88314k;
                    ((nu0.i) aVar).X8(gVar.a(), gVar.z());
                } else if (c0Var instanceof wt1.i) {
                    d0.v(jVar.getPinalytics(), f1.STORY_PIN_LOAD_DRAFT_FAILED, null, false, 12);
                }
                break;
            case 2:
                ln0 draft = (ln0) obj;
                jVar.f88315l = draft;
                tp y14 = draft.y();
                c cVar = new c(y14, i13);
                ag1.h sessionDataManager = jVar.f88312i;
                sessionDataManager.d(cVar, false);
                Intrinsics.checkNotNullParameter(draft, "draft");
                Intrinsics.checkNotNullParameter(sessionDataManager, "sessionDataManager");
                byte[] extractedImageMetadata = draft.getExtractedImageMetadata();
                if (extractedImageMetadata != null && (pageData = draft.getPageData()) != null && (y13 = pageData.y()) != null) {
                    sessionDataManager.d(new ic1.c(18, y13, extractedImageMetadata), false);
                }
                jVar.f88315l = draft;
                if (jVar.m1()) {
                    boolean z13 = false;
                    for (bo0 bo0Var : y14.getMediaList().getItems()) {
                        d30 mediaItem = bo0Var.getPhotoItem();
                        k01 videoItem = bo0Var.getVideoItem();
                        if (mediaItem != null && (videoItem == null || videoItem.f39242e != 10000)) {
                            lg1.h hVar = jVar.f88316m;
                            hVar.getClass();
                            Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
                            hVar.f83272j.add(mediaItem);
                            hVar.c();
                            ((nu0.i) ((iu0.a) jVar.getView())).W8(true);
                            z13 = true;
                        }
                    }
                    if (z13) {
                        d0.v(jVar.getPinalytics(), f1.IDEA_PIN_DRAFT_COMPATIBILITY_CONVERSION, null, false, 12);
                        break;
                    }
                }
                ((nu0.i) ((iu0.a) jVar.getView())).W8(false);
                j.t3(jVar);
                break;
            default:
                Navigation navigation = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                ((nu0.i) jVar.f88304a).V8(navigation);
                break;
        }
        return Unit.f80348a;
    }
}
