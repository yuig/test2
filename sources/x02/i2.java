package x02;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import so.x9;

/* loaded from: classes2.dex */
public final class i2 extends dl1.l {
    public static final a2 Q = new a2(0);
    public final fl1.e A;
    public final pb0.a B;
    public final dl1.r C;
    public final uk2.p D;
    public final uk2.p E;
    public final uk2.p F;
    public final uk2.p G;
    public final AtomicInteger H;
    public final uk2.l I;

    /* renamed from: J, reason: collision with root package name */
    public final Map f131414J;
    public final x9 K;
    public final String L;
    public final se2.a M;
    public final se2.a N;
    public final se2.a O;
    public final e12.c P;

    /* renamed from: v, reason: collision with root package name */
    public final dl1.p f131415v;

    /* renamed from: w, reason: collision with root package name */
    public final dl1.a0 f131416w;

    /* renamed from: x, reason: collision with root package name */
    public final dl1.z f131417x;

    /* renamed from: y, reason: collision with root package name */
    public final gl1.d f131418y;

    /* renamed from: z, reason: collision with root package name */
    public final dl1.r0 f131419z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(dl1.p localDataSource, dl1.a0 remoteDataSource, dl1.z persistencePolicy, gl1.d repositorySchedulerPolicy, dl1.r0 modelValidator, fl1.e modelMerger, pb0.a clock, dl1.r memoryCache, uk2.p updateSubject, uk2.p updateSubjectForComparison, uk2.p createSubject, uk2.p deleteSubject, AtomicInteger modelUpdatesSequenceId, uk2.l sequencedReplaySubject, Map requestToObservableMap, x9 retrofitRemoteDataSourceFactory, String str, se2.a lazyUserRepository, se2.a lazyBoardSectionRepository, se2.a lazyBoardRepository, e12.c boardOrganizationService) {
        super(localDataSource, remoteDataSource, persistencePolicy, repositorySchedulerPolicy, modelValidator, modelMerger, memoryCache, updateSubject, updateSubjectForComparison, createSubject, deleteSubject, modelUpdatesSequenceId, sequencedReplaySubject, requestToObservableMap, BitmapUtils.BITMAP_TO_JPEG_SIZE);
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(persistencePolicy, "persistencePolicy");
        Intrinsics.checkNotNullParameter(repositorySchedulerPolicy, "repositorySchedulerPolicy");
        Intrinsics.checkNotNullParameter(modelValidator, "modelValidator");
        Intrinsics.checkNotNullParameter(modelMerger, "modelMerger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(updateSubject, "updateSubject");
        Intrinsics.checkNotNullParameter(updateSubjectForComparison, "updateSubjectForComparison");
        Intrinsics.checkNotNullParameter(createSubject, "createSubject");
        Intrinsics.checkNotNullParameter(deleteSubject, "deleteSubject");
        Intrinsics.checkNotNullParameter(modelUpdatesSequenceId, "modelUpdatesSequenceId");
        Intrinsics.checkNotNullParameter(sequencedReplaySubject, "sequencedReplaySubject");
        Intrinsics.checkNotNullParameter(requestToObservableMap, "requestToObservableMap");
        Intrinsics.checkNotNullParameter(retrofitRemoteDataSourceFactory, "retrofitRemoteDataSourceFactory");
        Intrinsics.checkNotNullParameter(lazyUserRepository, "lazyUserRepository");
        Intrinsics.checkNotNullParameter(lazyBoardSectionRepository, "lazyBoardSectionRepository");
        Intrinsics.checkNotNullParameter(lazyBoardRepository, "lazyBoardRepository");
        Intrinsics.checkNotNullParameter(boardOrganizationService, "boardOrganizationService");
        this.f131415v = localDataSource;
        this.f131416w = remoteDataSource;
        this.f131417x = persistencePolicy;
        this.f131418y = repositorySchedulerPolicy;
        this.f131419z = modelValidator;
        this.A = modelMerger;
        this.B = clock;
        this.C = memoryCache;
        this.D = updateSubject;
        this.E = updateSubjectForComparison;
        this.F = createSubject;
        this.G = deleteSubject;
        this.H = modelUpdatesSequenceId;
        this.I = sequencedReplaySubject;
        this.f131414J = requestToObservableMap;
        this.K = retrofitRemoteDataSourceFactory;
        this.L = str;
        this.M = lazyUserRepository;
        this.N = lazyBoardSectionRepository;
        this.O = lazyBoardRepository;
        this.P = boardOrganizationService;
    }

    public static i2 a0(i2 i2Var, b22.i remoteDataSource, String str, int i13) {
        x9 x9Var;
        String str2;
        dl1.p localDataSource = i2Var.f131415v;
        dl1.z persistencePolicy = i2Var.f131417x;
        gl1.d repositorySchedulerPolicy = i2Var.f131418y;
        dl1.r0 modelValidator = i2Var.f131419z;
        fl1.e modelMerger = i2Var.A;
        pb0.a clock = i2Var.B;
        dl1.r memoryCache = i2Var.C;
        uk2.p updateSubject = i2Var.D;
        uk2.p updateSubjectForComparison = i2Var.E;
        uk2.p createSubject = i2Var.F;
        uk2.p deleteSubject = i2Var.G;
        AtomicInteger modelUpdatesSequenceId = i2Var.H;
        uk2.l sequencedReplaySubject = i2Var.I;
        Map requestToObservableMap = i2Var.f131414J;
        x9 x9Var2 = i2Var.K;
        if ((i13 & 65536) != 0) {
            x9Var = x9Var2;
            str2 = i2Var.L;
        } else {
            x9Var = x9Var2;
            str2 = str;
        }
        se2.a lazyUserRepository = i2Var.M;
        se2.a lazyBoardSectionRepository = i2Var.N;
        se2.a lazyBoardRepository = i2Var.O;
        e12.c boardOrganizationService = i2Var.P;
        i2Var.getClass();
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(persistencePolicy, "persistencePolicy");
        Intrinsics.checkNotNullParameter(repositorySchedulerPolicy, "repositorySchedulerPolicy");
        Intrinsics.checkNotNullParameter(modelValidator, "modelValidator");
        Intrinsics.checkNotNullParameter(modelMerger, "modelMerger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(updateSubject, "updateSubject");
        Intrinsics.checkNotNullParameter(updateSubjectForComparison, "updateSubjectForComparison");
        Intrinsics.checkNotNullParameter(createSubject, "createSubject");
        Intrinsics.checkNotNullParameter(deleteSubject, "deleteSubject");
        Intrinsics.checkNotNullParameter(modelUpdatesSequenceId, "modelUpdatesSequenceId");
        Intrinsics.checkNotNullParameter(sequencedReplaySubject, "sequencedReplaySubject");
        Intrinsics.checkNotNullParameter(requestToObservableMap, "requestToObservableMap");
        x9 retrofitRemoteDataSourceFactory = x9Var;
        Intrinsics.checkNotNullParameter(retrofitRemoteDataSourceFactory, "retrofitRemoteDataSourceFactory");
        Intrinsics.checkNotNullParameter(lazyUserRepository, "lazyUserRepository");
        Intrinsics.checkNotNullParameter(lazyBoardSectionRepository, "lazyBoardSectionRepository");
        Intrinsics.checkNotNullParameter(lazyBoardRepository, "lazyBoardRepository");
        Intrinsics.checkNotNullParameter(boardOrganizationService, "boardOrganizationService");
        return new i2(localDataSource, remoteDataSource, persistencePolicy, repositorySchedulerPolicy, modelValidator, modelMerger, clock, memoryCache, updateSubject, updateSubjectForComparison, createSubject, deleteSubject, modelUpdatesSequenceId, sequencedReplaySubject, requestToObservableMap, x9Var, str2, lazyUserRepository, lazyBoardSectionRepository, lazyBoardRepository, boardOrganizationService);
    }

    @Override // dl1.l, dl1.t
    public final uj2.b d(dl1.s sVar) {
        f30 model = (f30) sVar;
        Intrinsics.checkNotNullParameter(model, "model");
        uj2.b d2 = super.d(model);
        x0 x0Var = (x0) ((bf2.b) this.O).get();
        String boardId = b40.i(model);
        String pinId = model.getId();
        Intrinsics.checkNotNullExpressionValue(pinId, "getUid(...)");
        x0Var.getClass();
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        uj2.b gVar = new fk2.g(new xo.c((Object) x0Var, (Object) pinId, boardId, 18), 1);
        Intrinsics.checkNotNullExpressionValue(gVar, "fromAction(...)");
        fk2.c b13 = d2.b(gVar);
        Intrinsics.checkNotNullExpressionValue(b13, "andThen(...)");
        return b13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return Intrinsics.d(this.f131415v, i2Var.f131415v) && Intrinsics.d(this.f131416w, i2Var.f131416w) && Intrinsics.d(this.f131417x, i2Var.f131417x) && Intrinsics.d(this.f131418y, i2Var.f131418y) && Intrinsics.d(this.f131419z, i2Var.f131419z) && Intrinsics.d(this.A, i2Var.A) && Intrinsics.d(this.B, i2Var.B) && Intrinsics.d(this.C, i2Var.C) && Intrinsics.d(this.D, i2Var.D) && Intrinsics.d(this.E, i2Var.E) && Intrinsics.d(this.F, i2Var.F) && Intrinsics.d(this.G, i2Var.G) && Intrinsics.d(this.H, i2Var.H) && Intrinsics.d(this.I, i2Var.I) && Intrinsics.d(this.f131414J, i2Var.f131414J) && Intrinsics.d(this.K, i2Var.K) && Intrinsics.d(this.L, i2Var.L) && Intrinsics.d(this.M, i2Var.M) && Intrinsics.d(this.N, i2Var.N) && Intrinsics.d(this.O, i2Var.O) && Intrinsics.d(this.P, i2Var.P);
    }

    public final int hashCode() {
        int hashCode = (this.K.hashCode() + a.c.e(this.f131414J, (this.I.hashCode() + ((this.H.hashCode() + ((this.G.hashCode() + ((this.F.hashCode() + ((this.E.hashCode() + ((this.D.hashCode() + ((this.C.hashCode() + ((this.B.hashCode() + ((this.A.hashCode() + ((this.f131419z.hashCode() + ((this.f131418y.hashCode() + ((this.f131417x.hashCode() + ((this.f131416w.hashCode() + (this.f131415v.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31;
        String str = this.L;
        return this.P.hashCode() + ((this.O.hashCode() + ((this.N.hashCode() + ((this.M.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PinRepository(localDataSource=" + this.f131415v + ", remoteDataSource=" + this.f131416w + ", persistencePolicy=" + this.f131417x + ", repositorySchedulerPolicy=" + this.f131418y + ", modelValidator=" + this.f131419z + ", modelMerger=" + this.A + ", clock=" + this.B + ", memoryCache=" + this.C + ", updateSubject=" + this.D + ", updateSubjectForComparison=" + this.E + ", createSubject=" + this.F + ", deleteSubject=" + this.G + ", modelUpdatesSequenceId=" + this.H + ", sequencedReplaySubject=" + this.I + ", requestToObservableMap=" + this.f131414J + ", retrofitRemoteDataSourceFactory=" + this.K + ", localTrackingParams=" + this.L + ", lazyUserRepository=" + this.M + ", lazyBoardSectionRepository=" + this.N + ", lazyBoardRepository=" + this.O + ", boardOrganizationService=" + this.P + ")";
    }
}
