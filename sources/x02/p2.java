package x02;

import com.pinterest.api.model.az0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p2 extends dl1.l {

    /* renamed from: v, reason: collision with root package name */
    public final se2.a f131465v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(dl1.p localDataSource, dl1.a0 remoteDataSource, dl1.z persistencePolicy, gl1.d repositorySchedulerPolicy, se2.a lazyPinRepository) {
        super(localDataSource, remoteDataSource, persistencePolicy, repositorySchedulerPolicy, null, null, null, null, null, null, null, null, null, null, 32752);
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(persistencePolicy, "persistencePolicy");
        Intrinsics.checkNotNullParameter(repositorySchedulerPolicy, "repositorySchedulerPolicy");
        Intrinsics.checkNotNullParameter(lazyPinRepository, "lazyPinRepository");
        this.f131465v = lazyPinRepository;
    }

    public final fk2.x a0(String didItUid, az0 didItData, String str, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(didItUid, "didItUid");
        Intrinsics.checkNotNullParameter(didItData, "didItData");
        uj2.l G = G(new l22.b(didItUid, str, arrayList), didItData);
        G.getClass();
        fk2.x e13 = new hk2.u(G).e(new qb1.a(9, didItData, this));
        Intrinsics.checkNotNullExpressionValue(e13, "doOnComplete(...)");
        return e13;
    }
}
