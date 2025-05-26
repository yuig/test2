package x02;

import a.cb;
import com.pinterest.api.model.u7;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.d3;
import net.quikkly.android.utils.BitmapUtils;
import so.w9;

/* loaded from: classes2.dex */
public final class x0 extends dl1.l {
    public final fl1.e A;
    public final dl1.r B;
    public final uk2.p C;
    public final uk2.p D;
    public final uk2.p E;
    public final uk2.p F;
    public final AtomicInteger G;
    public final uk2.l H;
    public final Map I;

    /* renamed from: J, reason: collision with root package name */
    public final x2 f131522J;
    public final se2.a K;
    public final w9 L;
    public final b60.b M;
    public final d3 N;
    public final uk2.f O;
    public final uk2.f P;
    public final uk2.f Q;

    /* renamed from: v, reason: collision with root package name */
    public final dl1.p f131523v;

    /* renamed from: w, reason: collision with root package name */
    public final dl1.a0 f131524w;

    /* renamed from: x, reason: collision with root package name */
    public final dl1.z f131525x;

    /* renamed from: y, reason: collision with root package name */
    public final gl1.d f131526y;

    /* renamed from: z, reason: collision with root package name */
    public final dl1.r0 f131527z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(dl1.p localDataSource, dl1.a0 remoteDataSource, dl1.z persistencePolicy, gl1.d repositorySchedulerPolicy, dl1.r0 modelValidator, fl1.e modelMerger, dl1.r memoryCache, uk2.p updateSubject, uk2.p updateSubjectForComparison, uk2.p createSubject, uk2.p deleteSubject, AtomicInteger modelUpdatesSequenceId, uk2.l sequencedReplaySubject, Map requestToObservableMap, x2 userRepository, se2.a lazyBoardFeedRepository, w9 retrofitRemoteDataSourceFactory, b60.b activeUserManager, d3 repositoryExperiments) {
        super(localDataSource, remoteDataSource, persistencePolicy, repositorySchedulerPolicy, modelValidator, modelMerger, memoryCache, updateSubject, updateSubjectForComparison, createSubject, deleteSubject, modelUpdatesSequenceId, sequencedReplaySubject, requestToObservableMap, BitmapUtils.BITMAP_TO_JPEG_SIZE);
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(persistencePolicy, "persistencePolicy");
        Intrinsics.checkNotNullParameter(repositorySchedulerPolicy, "repositorySchedulerPolicy");
        Intrinsics.checkNotNullParameter(modelValidator, "modelValidator");
        Intrinsics.checkNotNullParameter(modelMerger, "modelMerger");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(updateSubject, "updateSubject");
        Intrinsics.checkNotNullParameter(updateSubjectForComparison, "updateSubjectForComparison");
        Intrinsics.checkNotNullParameter(createSubject, "createSubject");
        Intrinsics.checkNotNullParameter(deleteSubject, "deleteSubject");
        Intrinsics.checkNotNullParameter(modelUpdatesSequenceId, "modelUpdatesSequenceId");
        Intrinsics.checkNotNullParameter(sequencedReplaySubject, "sequencedReplaySubject");
        Intrinsics.checkNotNullParameter(requestToObservableMap, "requestToObservableMap");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(lazyBoardFeedRepository, "lazyBoardFeedRepository");
        Intrinsics.checkNotNullParameter(retrofitRemoteDataSourceFactory, "retrofitRemoteDataSourceFactory");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(repositoryExperiments, "repositoryExperiments");
        this.f131523v = localDataSource;
        this.f131524w = remoteDataSource;
        this.f131525x = persistencePolicy;
        this.f131526y = repositorySchedulerPolicy;
        this.f131527z = modelValidator;
        this.A = modelMerger;
        this.B = memoryCache;
        this.C = updateSubject;
        this.D = updateSubjectForComparison;
        this.E = createSubject;
        this.F = deleteSubject;
        this.G = modelUpdatesSequenceId;
        this.H = sequencedReplaySubject;
        this.I = requestToObservableMap;
        this.f131522J = userRepository;
        this.K = lazyBoardFeedRepository;
        this.L = retrofitRemoteDataSourceFactory;
        this.M = activeUserManager;
        this.N = repositoryExperiments;
        this.O = cb.r("create(...)");
        this.P = cb.r("create(...)");
        Intrinsics.checkNotNullExpressionValue(new uk2.f(), "create(...)");
        Intrinsics.checkNotNullExpressionValue(new uk2.f(), "create(...)");
        uk2.f fVar = new uk2.f();
        Intrinsics.checkNotNullExpressionValue(fVar, "create(...)");
        this.Q = fVar;
    }

    public final fk2.x a0(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        u7 G1 = board.G1();
        G1.c(new Date());
        v7 a13 = G1.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        String id3 = board.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        uj2.l G = G(new k0(id3, true), a13);
        G.getClass();
        fk2.x xVar = new fk2.x(new hk2.u(G), new e0(1, new s0(this, 0)), ck2.i.f27924d, ck2.i.f27923c);
        Intrinsics.checkNotNullExpressionValue(xVar, "doOnSubscribe(...)");
        return xVar;
    }

    public final void b0() {
        ((y) ((bf2.b) this.K).get()).a();
    }

    public final void c0(int i13, v7 v7Var) {
        u7 G1 = v7Var.G1();
        G1.E(Integer.valueOf(Math.max(0, v7Var.l1().intValue() - i13)));
        v7 a13 = G1.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        Integer l13 = a13.l1();
        Intrinsics.checkNotNullExpressionValue(l13, "getPinCount(...)");
        if (l13.intValue() <= 0) {
            u7 G12 = a13.G1();
            G12.f42424J = kotlin.collections.z0.d();
            boolean[] zArr = G12.f42452n0;
            if (zArr.length > 35) {
                zArr[35] = true;
            }
            G12.w("");
            G12.l(kotlin.collections.z0.d());
            G12.G = "";
            boolean[] zArr2 = G12.f42452n0;
            if (zArr2.length > 32) {
                zArr2[32] = true;
            }
            G12.H = "";
            if (zArr2.length > 33) {
                zArr2[33] = true;
            }
            a13 = G12.a();
            Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        }
        W(a13);
    }

    public final void d0(String str, List pinIds) {
        v7 v7Var;
        Intrinsics.checkNotNullParameter(pinIds, "pinIds");
        if (str == null || kotlin.text.z.j(str) || (v7Var = (v7) O(str)) == null) {
            return;
        }
        c0(pinIds.size(), v7Var);
    }

    public final fk2.x e0(v7 originBoard, String str, String destinationBoardId, String str2, List selectAllExcludePinIds) {
        Intrinsics.checkNotNullParameter(originBoard, "originBoard");
        Intrinsics.checkNotNullParameter(destinationBoardId, "destinationBoardId");
        Intrinsics.checkNotNullParameter(selectAllExcludePinIds, "selectAllExcludePinIds");
        String id3 = originBoard.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        uj2.l G = G(new l0(id3, selectAllExcludePinIds, str, destinationBoardId, str2), originBoard);
        G.getClass();
        fk2.x e13 = new hk2.u(G).e(new qb1.a(7, this, originBoard));
        Intrinsics.checkNotNullExpressionValue(e13, "doOnComplete(...)");
        return e13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return Intrinsics.d(this.f131523v, x0Var.f131523v) && Intrinsics.d(this.f131524w, x0Var.f131524w) && Intrinsics.d(this.f131525x, x0Var.f131525x) && Intrinsics.d(this.f131526y, x0Var.f131526y) && Intrinsics.d(this.f131527z, x0Var.f131527z) && Intrinsics.d(this.A, x0Var.A) && Intrinsics.d(this.B, x0Var.B) && Intrinsics.d(this.C, x0Var.C) && Intrinsics.d(this.D, x0Var.D) && Intrinsics.d(this.E, x0Var.E) && Intrinsics.d(this.F, x0Var.F) && Intrinsics.d(this.G, x0Var.G) && Intrinsics.d(this.H, x0Var.H) && Intrinsics.d(this.I, x0Var.I) && Intrinsics.d(this.f131522J, x0Var.f131522J) && Intrinsics.d(this.K, x0Var.K) && Intrinsics.d(this.L, x0Var.L) && Intrinsics.d(this.M, x0Var.M) && Intrinsics.d(this.N, x0Var.N);
    }

    public final jk2.v f0(s7.z createBoardParams) {
        Intrinsics.checkNotNullParameter(createBoardParams, "createBoardParams");
        int i13 = 1;
        jk2.v vVar = new jk2.v(k(new f0((String) createBoardParams.f111347c, createBoardParams.f111345a, (z42.f) createBoardParams.f111346b, (z42.c) createBoardParams.f111348d)).i(new b22.f(18, new t0(this.f131526y, 0))), new e0(4, new s0(this, i13)), ck2.i.f27923c, i13);
        Intrinsics.checkNotNullExpressionValue(vVar, "doOnSubscribe(...)");
        return vVar;
    }

    @Override // dl1.l, dl1.t
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final fk2.x d(v7 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        String id3 = model.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        Integer l13 = model.l1();
        Intrinsics.checkNotNullExpressionValue(l13, "getPinCount(...)");
        uj2.b a13 = this.f131526y.a(m(new h0(id3, l13.intValue()), model));
        ck2.i.b(a13, "source is null");
        fk2.x xVar = new fk2.x(a13, new e0(8, new s0(this, 2)), ck2.i.f27924d, ck2.i.f27923c);
        Intrinsics.checkNotNullExpressionValue(xVar, "doOnSubscribe(...)");
        return xVar;
    }

    public final fk2.x h0(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        u7 G1 = board.G1();
        G1.q(Boolean.TRUE);
        boolean[] zArr = board.f42764n0;
        int i13 = 0;
        if (zArr.length > 25 && zArr[25]) {
            G1.r(Integer.valueOf(board.W0().intValue() + 1));
        }
        v7 a13 = G1.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        o0(1, board);
        String id3 = board.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        uj2.l G = G(new n0(id3, true), a13);
        G.getClass();
        fk2.x f13 = new hk2.u(G).f(new e0(2, new u0(i13, board, this)));
        Intrinsics.checkNotNullExpressionValue(f13, "doOnError(...)");
        return f13;
    }

    public final int hashCode() {
        return this.N.hashCode() + ((this.M.hashCode() + ((this.L.hashCode() + ((this.K.hashCode() + ((this.f131522J.hashCode() + a.c.e(this.I, (this.H.hashCode() + ((this.G.hashCode() + ((this.F.hashCode() + ((this.E.hashCode() + ((this.D.hashCode() + ((this.C.hashCode() + ((this.B.hashCode() + ((this.A.hashCode() + ((this.f131527z.hashCode() + ((this.f131526y.hashCode() + ((this.f131525x.hashCode() + ((this.f131524w.hashCode() + (this.f131523v.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final x0 i0() {
        d0 remoteDataSource = this.L.a(b0.AUTO_MAGICAL);
        dl1.p localDataSource = this.f131523v;
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        dl1.z persistencePolicy = this.f131525x;
        Intrinsics.checkNotNullParameter(persistencePolicy, "persistencePolicy");
        gl1.d repositorySchedulerPolicy = this.f131526y;
        Intrinsics.checkNotNullParameter(repositorySchedulerPolicy, "repositorySchedulerPolicy");
        dl1.r0 modelValidator = this.f131527z;
        Intrinsics.checkNotNullParameter(modelValidator, "modelValidator");
        fl1.e modelMerger = this.A;
        Intrinsics.checkNotNullParameter(modelMerger, "modelMerger");
        dl1.r memoryCache = this.B;
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        uk2.p updateSubject = this.C;
        Intrinsics.checkNotNullParameter(updateSubject, "updateSubject");
        uk2.p updateSubjectForComparison = this.D;
        Intrinsics.checkNotNullParameter(updateSubjectForComparison, "updateSubjectForComparison");
        uk2.p createSubject = this.E;
        Intrinsics.checkNotNullParameter(createSubject, "createSubject");
        uk2.p deleteSubject = this.F;
        Intrinsics.checkNotNullParameter(deleteSubject, "deleteSubject");
        AtomicInteger modelUpdatesSequenceId = this.G;
        Intrinsics.checkNotNullParameter(modelUpdatesSequenceId, "modelUpdatesSequenceId");
        uk2.l sequencedReplaySubject = this.H;
        Intrinsics.checkNotNullParameter(sequencedReplaySubject, "sequencedReplaySubject");
        Map requestToObservableMap = this.I;
        Intrinsics.checkNotNullParameter(requestToObservableMap, "requestToObservableMap");
        x2 userRepository = this.f131522J;
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        se2.a lazyBoardFeedRepository = this.K;
        Intrinsics.checkNotNullParameter(lazyBoardFeedRepository, "lazyBoardFeedRepository");
        w9 retrofitRemoteDataSourceFactory = this.L;
        Intrinsics.checkNotNullParameter(retrofitRemoteDataSourceFactory, "retrofitRemoteDataSourceFactory");
        b60.b activeUserManager = this.M;
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        d3 repositoryExperiments = this.N;
        Intrinsics.checkNotNullParameter(repositoryExperiments, "repositoryExperiments");
        return new x0(localDataSource, remoteDataSource, persistencePolicy, repositorySchedulerPolicy, modelValidator, modelMerger, memoryCache, updateSubject, updateSubjectForComparison, createSubject, deleteSubject, modelUpdatesSequenceId, sequencedReplaySubject, requestToObservableMap, userRepository, lazyBoardFeedRepository, retrofitRemoteDataSourceFactory, activeUserManager, repositoryExperiments);
    }

    public final hk2.u j0(List inviteIds, boolean z13, String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(inviteIds, "inviteIds");
        uj2.l G = G(new o0(boardId, CollectionsKt.Z(inviteIds, ",", null, null, 0, null, null, 62), z13), null);
        G.getClass();
        hk2.u uVar = new hk2.u(G);
        Intrinsics.checkNotNullExpressionValue(uVar, "ignoreElement(...)");
        return uVar;
    }

    public final uj2.q k0(String boardId, String str) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        b22.f fVar = new b22.f(9, new uq.j(boardId, str, 12));
        uk2.f fVar2 = this.P;
        fVar2.getClass();
        uj2.q i13 = new jk2.x(fVar2, fVar, 2).i(new b22.f(16, new t0(this.f131526y, 4)));
        Intrinsics.checkNotNullExpressionValue(i13, "compose(...)");
        return i13;
    }

    public final fk2.x l0(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        u7 G1 = board.G1();
        G1.c(null);
        v7 a13 = G1.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        String id3 = board.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        uj2.l G = G(new k0(id3, false), a13);
        G.getClass();
        fk2.x xVar = new fk2.x(new hk2.u(G), new e0(0, new s0(this, 5)), ck2.i.f27924d, ck2.i.f27923c);
        Intrinsics.checkNotNullExpressionValue(xVar, "doOnSubscribe(...)");
        return xVar;
    }

    public final fk2.x m0(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        u7 G1 = board.G1();
        G1.q(Boolean.FALSE);
        boolean[] zArr = board.f42764n0;
        int i13 = 1;
        if (zArr.length > 25 && zArr[25]) {
            G1.r(Integer.valueOf(Math.max(0, board.W0().intValue() - 1)));
        }
        v7 a13 = G1.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        o0(-1, board);
        String id3 = board.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        uj2.l G = G(new n0(id3, false), a13);
        G.getClass();
        fk2.x f13 = new hk2.u(G).f(new e0(6, new u0(i13, board, this)));
        Intrinsics.checkNotNullExpressionValue(f13, "doOnError(...)");
        return f13;
    }

    public final fk2.x n0(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        String id3 = board.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        uj2.l G = G(new m0(id3), board);
        G.getClass();
        fk2.x xVar = new fk2.x(new hk2.u(G), new e0(5, new s0(this, 6)), ck2.i.f27924d, ck2.i.f27923c);
        Intrinsics.checkNotNullExpressionValue(xVar, "doOnSubscribe(...)");
        return xVar;
    }

    @Override // dl1.q0
    public final dl1.m o(dl1.s sVar) {
        v7 model = (v7) sVar;
        Intrinsics.checkNotNullParameter(model, "model");
        String id3 = model.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        return new j0(id3);
    }

    public final void o0(int i13, v7 v7Var) {
        String id3;
        wy0 f13 = ((b60.d) this.M).f();
        wy0 wy0Var = null;
        String id4 = f13 != null ? f13.getId() : null;
        if (id4 != null) {
            wy0 k13 = v7Var.k1();
            x2 x2Var = this.f131522J;
            if (k13 != null && (id3 = k13.getId()) != null) {
                wy0Var = (wy0) x2Var.O(id3);
            }
            x2Var.Y(id4, new w0(i13, wy0Var != null ? Intrinsics.d(wy0Var.R2(), Boolean.FALSE) : false));
        }
    }

    public final String toString() {
        return "BoardRepository(localDataSource=" + this.f131523v + ", remoteDataSource=" + this.f131524w + ", persistencePolicy=" + this.f131525x + ", repositorySchedulerPolicy=" + this.f131526y + ", modelValidator=" + this.f131527z + ", modelMerger=" + this.A + ", memoryCache=" + this.B + ", updateSubject=" + this.C + ", updateSubjectForComparison=" + this.D + ", createSubject=" + this.E + ", deleteSubject=" + this.F + ", modelUpdatesSequenceId=" + this.G + ", sequencedReplaySubject=" + this.H + ", requestToObservableMap=" + this.I + ", userRepository=" + this.f131522J + ", lazyBoardFeedRepository=" + this.K + ", retrofitRemoteDataSourceFactory=" + this.L + ", activeUserManager=" + this.M + ", repositoryExperiments=" + this.N + ")";
    }
}
