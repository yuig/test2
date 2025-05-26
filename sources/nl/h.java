package nl;

import ao2.f0;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import pd.s;
import sl.q;

/* loaded from: classes.dex */
public final class h implements sl.e {

    /* renamed from: b, reason: collision with root package name */
    public static final h f91226b = new h(0);

    /* renamed from: c, reason: collision with root package name */
    public static final h f91227c = new h(1);

    /* renamed from: d, reason: collision with root package name */
    public static final h f91228d = new h(2);

    /* renamed from: e, reason: collision with root package name */
    public static final h f91229e = new h(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91230a;

    public /* synthetic */ h(int i13) {
        this.f91230a = i13;
    }

    public final f0 a(s sVar) {
        switch (this.f91230a) {
            case 0:
                Object e13 = sVar.e(new q(rl.a.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return dl2.b.o0((Executor) e13);
            case 1:
                Object e14 = sVar.e(new q(rl.c.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e14, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return dl2.b.o0((Executor) e14);
            case 2:
                Object e15 = sVar.e(new q(rl.b.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e15, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return dl2.b.o0((Executor) e15);
            default:
                Object e16 = sVar.e(new q(rl.d.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e16, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return dl2.b.o0((Executor) e16);
        }
    }

    @Override // sl.e
    public final /* bridge */ /* synthetic */ Object e(s sVar) {
        switch (this.f91230a) {
        }
        return a(sVar);
    }
}
