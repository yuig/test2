package fi1;

import com.pinterest.api.model.UploadStatus;
import com.pinterest.feature.video.worker.StatusMediaWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import tk2.e;
import uj2.q;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62219i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ StatusMediaWorker f62220j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(StatusMediaWorker statusMediaWorker, int i13) {
        super(1);
        this.f62219i = i13;
        this.f62220j = statusMediaWorker;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f62219i;
        StatusMediaWorker statusMediaWorker = this.f62220j;
        switch (i13) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.m(statusMediaWorker.A(), TimeUnit.MILLISECONDS, e.f118017c);
            case 1:
                List it2 = (List) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return Boolean.valueOf(statusMediaWorker.D(it2));
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return Boolean.valueOf(statusMediaWorker.D(it2));
                }
            case 2:
                List it3 = (List) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        return Boolean.valueOf(statusMediaWorker.D(it3));
                    default:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        return Boolean.valueOf(statusMediaWorker.D(it3));
                }
            default:
                List uploadStatuses = (List) obj;
                Intrinsics.checkNotNullParameter(uploadStatuses, "uploadStatuses");
                if (!statusMediaWorker.E(uploadStatuses)) {
                    return q.r(new IllegalAccessException("Failed to upload media"));
                }
                List list = uploadStatuses;
                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList.add(((UploadStatus) it4.next()).getSignature());
                }
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    String str = (String) it5.next();
                    if (str != null) {
                        statusMediaWorker.f49016q.add(str);
                    }
                }
                return q.y(uploadStatuses);
        }
    }
}
