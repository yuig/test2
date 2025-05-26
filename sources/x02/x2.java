package x02;

import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import so.o9;

/* loaded from: classes2.dex */
public final class x2 extends dl1.l {
    public final gl1.d A;
    public final o9 B;
    public final dl1.r C;
    public final uk2.p D;
    public final uk2.p E;
    public final uk2.p F;
    public final uk2.p G;
    public final AtomicInteger H;
    public final uk2.l I;

    /* renamed from: J, reason: collision with root package name */
    public final Map f131529J;
    public final b60.b K;

    /* renamed from: v, reason: collision with root package name */
    public final dl1.p f131530v;

    /* renamed from: w, reason: collision with root package name */
    public final dl1.a0 f131531w;

    /* renamed from: x, reason: collision with root package name */
    public final dl1.z f131532x;

    /* renamed from: y, reason: collision with root package name */
    public final dl1.r0 f131533y;

    /* renamed from: z, reason: collision with root package name */
    public final fl1.e f131534z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(dl1.p localDataSource, dl1.a0 remoteDataSource, dl1.z persistencePolicy, dl1.r0 modelValidator, fl1.e modelMerger, gl1.d repositorySchedulerPolicy, o9 retrofitRemoteDataSourceFactory, dl1.r memoryCache, uk2.p updateSubject, uk2.p updateSubjectForComparison, uk2.p createSubject, uk2.p deleteSubject, AtomicInteger modelUpdatesSequenceId, uk2.l sequencedReplaySubject, Map requestToObservableMap, b60.b activeUserManager) {
        super(localDataSource, remoteDataSource, persistencePolicy, repositorySchedulerPolicy, modelValidator, modelMerger, memoryCache, updateSubject, updateSubjectForComparison, createSubject, deleteSubject, modelUpdatesSequenceId, sequencedReplaySubject, requestToObservableMap, BitmapUtils.BITMAP_TO_JPEG_SIZE);
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(persistencePolicy, "persistencePolicy");
        Intrinsics.checkNotNullParameter(modelValidator, "modelValidator");
        Intrinsics.checkNotNullParameter(modelMerger, "modelMerger");
        Intrinsics.checkNotNullParameter(repositorySchedulerPolicy, "repositorySchedulerPolicy");
        Intrinsics.checkNotNullParameter(retrofitRemoteDataSourceFactory, "retrofitRemoteDataSourceFactory");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(updateSubject, "updateSubject");
        Intrinsics.checkNotNullParameter(updateSubjectForComparison, "updateSubjectForComparison");
        Intrinsics.checkNotNullParameter(createSubject, "createSubject");
        Intrinsics.checkNotNullParameter(deleteSubject, "deleteSubject");
        Intrinsics.checkNotNullParameter(modelUpdatesSequenceId, "modelUpdatesSequenceId");
        Intrinsics.checkNotNullParameter(sequencedReplaySubject, "sequencedReplaySubject");
        Intrinsics.checkNotNullParameter(requestToObservableMap, "requestToObservableMap");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f131530v = localDataSource;
        this.f131531w = remoteDataSource;
        this.f131532x = persistencePolicy;
        this.f131533y = modelValidator;
        this.f131534z = modelMerger;
        this.A = repositorySchedulerPolicy;
        this.B = retrofitRemoteDataSourceFactory;
        this.C = memoryCache;
        this.D = updateSubject;
        this.E = updateSubjectForComparison;
        this.F = createSubject;
        this.G = deleteSubject;
        this.H = modelUpdatesSequenceId;
        this.I = sequencedReplaySubject;
        this.f131529J = requestToObservableMap;
        this.K = activeUserManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [dl1.r0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [dl1.z] */
    public static x2 b0(x2 x2Var, k22.l remoteDataSource, v vVar, v2 v2Var, int i13) {
        dl1.p localDataSource = x2Var.f131530v;
        v persistencePolicy = (i13 & 4) != 0 ? x2Var.f131532x : vVar;
        v2 modelValidator = (i13 & 8) != 0 ? x2Var.f131533y : v2Var;
        fl1.e modelMerger = x2Var.f131534z;
        gl1.d repositorySchedulerPolicy = x2Var.A;
        o9 retrofitRemoteDataSourceFactory = x2Var.B;
        dl1.r memoryCache = x2Var.C;
        uk2.p updateSubject = x2Var.D;
        uk2.p updateSubjectForComparison = x2Var.E;
        uk2.p createSubject = x2Var.F;
        uk2.p deleteSubject = x2Var.G;
        AtomicInteger modelUpdatesSequenceId = x2Var.H;
        uk2.l sequencedReplaySubject = x2Var.I;
        Map requestToObservableMap = x2Var.f131529J;
        b60.b activeUserManager = x2Var.K;
        x2Var.getClass();
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(persistencePolicy, "persistencePolicy");
        Intrinsics.checkNotNullParameter(modelValidator, "modelValidator");
        Intrinsics.checkNotNullParameter(modelMerger, "modelMerger");
        Intrinsics.checkNotNullParameter(repositorySchedulerPolicy, "repositorySchedulerPolicy");
        Intrinsics.checkNotNullParameter(retrofitRemoteDataSourceFactory, "retrofitRemoteDataSourceFactory");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(updateSubject, "updateSubject");
        Intrinsics.checkNotNullParameter(updateSubjectForComparison, "updateSubjectForComparison");
        Intrinsics.checkNotNullParameter(createSubject, "createSubject");
        Intrinsics.checkNotNullParameter(deleteSubject, "deleteSubject");
        Intrinsics.checkNotNullParameter(modelUpdatesSequenceId, "modelUpdatesSequenceId");
        Intrinsics.checkNotNullParameter(sequencedReplaySubject, "sequencedReplaySubject");
        Intrinsics.checkNotNullParameter(requestToObservableMap, "requestToObservableMap");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        return new x2(localDataSource, remoteDataSource, persistencePolicy, modelValidator, modelMerger, repositorySchedulerPolicy, retrofitRemoteDataSourceFactory, memoryCache, updateSubject, updateSubjectForComparison, createSubject, deleteSubject, modelUpdatesSequenceId, sequencedReplaySubject, requestToObservableMap, activeUserManager);
    }

    public final hk2.b0 a0(wy0 user, String str, String str2) {
        Intrinsics.checkNotNullParameter(user, "user");
        vy0 H4 = user.H4();
        H4.l(Boolean.TRUE);
        Boolean bool = Boolean.FALSE;
        H4.H(bool);
        H4.e0(bool);
        wy0 a13 = H4.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        String id3 = user.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        uj2.b0 k13 = l0(a13, new k22.a(id3, str, str2, true)).k();
        Intrinsics.checkNotNullExpressionValue(k13, "toSingle(...)");
        return (hk2.b0) k13;
    }

    public final uj2.b0 c0(wy0 user, String str, String str2) {
        Intrinsics.checkNotNullParameter(user, "user");
        Boolean R2 = user.R2();
        Intrinsics.checkNotNullExpressionValue(R2, "getExplicitlyFollowedByMe(...)");
        if (R2.booleanValue()) {
            kk2.b j13 = uj2.b0.j(user);
            Intrinsics.checkNotNullExpressionValue(j13, "just(...)");
            return j13;
        }
        vy0 H4 = user.H4();
        Boolean bool = Boolean.TRUE;
        H4.H(bool);
        H4.e0(bool);
        if (user.W2()) {
            H4.L(Integer.valueOf(user.V2().intValue() + 1));
        }
        wy0 a13 = H4.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        W(a13);
        k0(1);
        String id3 = user.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        kk2.g gVar = new kk2.g(l0(a13, new k22.c(id3, str, str2, true)).k(), new e0(16, new w2(this, user, 0)), 1);
        Intrinsics.checkNotNullExpressionValue(gVar, "doOnError(...)");
        return gVar;
    }

    public final x2 d0() {
        return b0(this, this.B.a(k22.j.ACCOUNT_SETTINGS), null, null, 65533);
    }

    public final x2 e0() {
        return b0(this, this.B.a(k22.j.USER_PROFILE), null, new v2(), 65525);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return Intrinsics.d(this.f131530v, x2Var.f131530v) && Intrinsics.d(this.f131531w, x2Var.f131531w) && Intrinsics.d(this.f131532x, x2Var.f131532x) && Intrinsics.d(this.f131533y, x2Var.f131533y) && Intrinsics.d(this.f131534z, x2Var.f131534z) && Intrinsics.d(this.A, x2Var.A) && Intrinsics.d(this.B, x2Var.B) && Intrinsics.d(this.C, x2Var.C) && Intrinsics.d(this.D, x2Var.D) && Intrinsics.d(this.E, x2Var.E) && Intrinsics.d(this.F, x2Var.F) && Intrinsics.d(this.G, x2Var.G) && Intrinsics.d(this.H, x2Var.H) && Intrinsics.d(this.I, x2Var.I) && Intrinsics.d(this.f131529J, x2Var.f131529J) && Intrinsics.d(this.K, x2Var.K);
    }

    public final x2 f0() {
        return b0(this, this.B.a(k22.j.MESSAGE_SETTINGS), null, null, 65533);
    }

    public final x2 g0() {
        return b0(this, this.B.a(k22.j.USER_PROFILE), new v(2), null, 65529);
    }

    public final hk2.b0 h0(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        vy0 H4 = user.H4();
        H4.l(Boolean.FALSE);
        wy0 a13 = H4.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        String id3 = user.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        uj2.b0 k13 = l0(a13, new k22.a(id3)).k();
        Intrinsics.checkNotNullExpressionValue(k13, "toSingle(...)");
        return (hk2.b0) k13;
    }

    public final int hashCode() {
        return this.K.hashCode() + a.c.e(this.f131529J, (this.I.hashCode() + ((this.H.hashCode() + ((this.G.hashCode() + ((this.F.hashCode() + ((this.E.hashCode() + ((this.D.hashCode() + ((this.C.hashCode() + ((this.B.hashCode() + ((this.A.hashCode() + ((this.f131534z.hashCode() + ((this.f131533y.hashCode() + ((this.f131532x.hashCode() + ((this.f131531w.hashCode() + (this.f131530v.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31);
    }

    public final uj2.b0 i0(wy0 user, String str) {
        Intrinsics.checkNotNullParameter(user, "user");
        if (!user.R2().booleanValue()) {
            kk2.b j13 = uj2.b0.j(user);
            Intrinsics.checkNotNullExpressionValue(j13, "just(...)");
            return j13;
        }
        vy0 H4 = user.H4();
        Boolean bool = Boolean.FALSE;
        H4.H(bool);
        H4.e0(bool);
        if (user.W2()) {
            H4.L(Integer.valueOf(Math.max(0, user.V2().intValue() - 1)));
        }
        wy0 a13 = H4.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        W(a13);
        k0(-1);
        String id3 = user.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        kk2.g gVar = new kk2.g(l0(a13, new k22.c(id3, str)).k(), new e0(15, new w2(this, user, 2)), 1);
        Intrinsics.checkNotNullExpressionValue(gVar, "doOnError(...)");
        return gVar;
    }

    public final hk2.u j0(wy0 user, Map fieldMap) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(fieldMap, "fieldMap");
        String id3 = user.getId();
        Intrinsics.f(id3);
        uj2.l l03 = l0(user, new k22.f(id3, fieldMap));
        l03.getClass();
        hk2.u uVar = new hk2.u(l03);
        Intrinsics.checkNotNullExpressionValue(uVar, "ignoreElement(...)");
        return uVar;
    }

    public final void k0(int i13) {
        wy0 f13 = ((b60.d) this.K).f();
        String id3 = f13 != null ? f13.getId() : null;
        if (id3 != null) {
            Y(id3, new pn1.g(i13, 12));
        }
    }

    public final uj2.l l0(wy0 wy0Var, j12.h hVar) {
        return kh2.j1.m0(wy0Var) ? G(hVar, wy0Var) : new gk2.d1(new IllegalArgumentException(a.a.j("Invalid User ID: ", wy0Var.getId())), 1);
    }

    public final String toString() {
        return "UserRepository(localDataSource=" + this.f131530v + ", remoteDataSource=" + this.f131531w + ", persistencePolicy=" + this.f131532x + ", modelValidator=" + this.f131533y + ", modelMerger=" + this.f131534z + ", repositorySchedulerPolicy=" + this.A + ", retrofitRemoteDataSourceFactory=" + this.B + ", memoryCache=" + this.C + ", updateSubject=" + this.D + ", updateSubjectForComparison=" + this.E + ", createSubject=" + this.F + ", deleteSubject=" + this.G + ", modelUpdatesSequenceId=" + this.H + ", sequencedReplaySubject=" + this.I + ", requestToObservableMap=" + this.f131529J + ", activeUserManager=" + this.K + ")";
    }
}
