package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v1 extends dl1.l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(dl1.p localDataSource, dl1.a0 remoteDataSource, dl1.z persistencePolicy, gl1.d repositorySchedulerPolicy, dl1.r0 modelValidator) {
        super(localDataSource, remoteDataSource, persistencePolicy, repositorySchedulerPolicy, modelValidator, null, null, null, null, null, null, null, null, null, 32736);
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(persistencePolicy, "persistencePolicy");
        Intrinsics.checkNotNullParameter(repositorySchedulerPolicy, "repositorySchedulerPolicy");
        Intrinsics.checkNotNullParameter(modelValidator, "modelValidator");
    }
}
