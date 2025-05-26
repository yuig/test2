package so;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.pinterest.engage.GoogleEngageWorker;
import com.pinterest.pushnotification.PushTokenRegistrationRxWorker;
import com.pinterest.typeahead.ClientCacheWorker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v9 implements p6.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114674a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ na f114675b;

    public /* synthetic */ v9(na naVar, int i13) {
        this.f114674a = i13;
        this.f114675b = naVar;
    }

    @Override // p6.b
    public final kb.a0 a(Context context, WorkerParameters workerParameters) {
        int i13 = this.f114674a;
        na naVar = this.f114675b;
        switch (i13) {
            case 0:
                oa oaVar = naVar.f113568a;
                pq2.c1 retrofitBuilder = oaVar.f3();
                rz.c adapterFactory = (rz.c) oaVar.f114011y1.get();
                Intrinsics.checkNotNullParameter(retrofitBuilder, "retrofitBuilder");
                Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
                retrofitBuilder.a(adapterFactory);
                Object b13 = retrofitBuilder.d().b(y20.b.class);
                Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
                y20.b searchTypeaheadService = (y20.b) b13;
                dl2.b.I(searchTypeaheadService);
                x92.c searchTypeaheadLocal = x92.c.f134368a;
                Intrinsics.checkNotNullParameter(searchTypeaheadService, "searchTypeaheadService");
                Intrinsics.checkNotNullParameter(searchTypeaheadLocal, "searchTypeaheadLocal");
                y20.a aVar = new y20.a(searchTypeaheadService);
                oa oaVar2 = naVar.f113568a;
                return new ClientCacheWorker(context, workerParameters, aVar, (gp1.l) oaVar2.L7.get(), (tb0.h) oaVar2.f113797m0.get());
            case 1:
                oc.c cVar = (oc.c) naVar.f113568a.f113788l8.get();
                oa oaVar3 = naVar.f113568a;
                return new GoogleEngageWorker(context, workerParameters, cVar, (oc.c) oaVar3.f113907s5.get(), (b60.b) oaVar3.f113850p0.get());
            default:
                gz1.b bVar = (gz1.b) naVar.f113568a.C1.get();
                oa oaVar4 = naVar.f113568a;
                return new PushTokenRegistrationRxWorker(context, workerParameters, bVar, new com.pinterest.pushnotification.c(new uo.a((oc.c) oaVar4.f113907s5.get(), 0), oaVar4.k2()));
        }
    }
}
