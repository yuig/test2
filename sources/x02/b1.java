package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b1 extends dl1.l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(dl1.p localDataSource, dl1.a0 remoteDataSource, dl1.z persistencePolicy, gl1.d repositorySchedulerPolicy) {
        super(localDataSource, remoteDataSource, persistencePolicy, repositorySchedulerPolicy, null, null, null, null, null, null, null, null, null, null, 32752);
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(persistencePolicy, "persistencePolicy");
        Intrinsics.checkNotNullParameter(repositorySchedulerPolicy, "repositorySchedulerPolicy");
    }
}
