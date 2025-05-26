package x02;

import com.pinterest.api.model.ba;
import com.pinterest.api.model.ha;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class z0 extends dl1.l {

    /* renamed from: v, reason: collision with root package name */
    public final se2.a f131543v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(p10.m localDataSource, j12.j remoteDataSource, fl1.a persistencePolicy, gl1.c repositorySchedulerPolicy, ha modelValidator, se2.a lazyBoardRepository) {
        super(localDataSource, remoteDataSource, persistencePolicy, repositorySchedulerPolicy, modelValidator, null, null, null, null, null, null, null, null, null, 32736);
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(persistencePolicy, "persistencePolicy");
        Intrinsics.checkNotNullParameter(repositorySchedulerPolicy, "repositorySchedulerPolicy");
        Intrinsics.checkNotNullParameter(modelValidator, "modelValidator");
        Intrinsics.checkNotNullParameter(lazyBoardRepository, "lazyBoardRepository");
        this.f131543v = lazyBoardRepository;
    }

    public final jk2.v a0(String boardId, String boardSectionTitle, List initialPinIds) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardSectionTitle, "boardSectionTitle");
        Intrinsics.checkNotNullParameter(initialPinIds, "initialPinIds");
        jk2.v vVar = new jk2.v(k(new j12.c(boardId, boardSectionTitle, initialPinIds)), new e0(10, new y0(this, 0)), ck2.i.f27923c, 1);
        Intrinsics.checkNotNullExpressionValue(vVar, "doOnSubscribe(...)");
        return vVar;
    }

    @Override // dl1.l, dl1.t
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final fk2.x d(ba model) {
        Intrinsics.checkNotNullParameter(model, "model");
        fk2.x xVar = new fk2.x(super.d(model), new e0(11, new y0(this, 2)), ck2.i.f27924d, ck2.i.f27923c);
        Intrinsics.checkNotNullExpressionValue(xVar, "doOnSubscribe(...)");
        return xVar;
    }
}
