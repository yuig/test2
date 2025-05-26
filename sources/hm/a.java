package hm;

import ao2.f0;
import dl2.b;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import pd.s;
import rl.c;
import rl.d;
import sl.e;
import sl.q;

/* loaded from: classes3.dex */
public final class a implements e {

    /* renamed from: b, reason: collision with root package name */
    public static final a f69554b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f69555c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f69556d = new a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final a f69557e = new a(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69558a;

    public /* synthetic */ a(int i13) {
        this.f69558a = i13;
    }

    public final f0 a(s sVar) {
        switch (this.f69558a) {
            case 0:
                Object e13 = sVar.e(new q(rl.a.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return b.o0((Executor) e13);
            case 1:
                Object e14 = sVar.e(new q(c.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e14, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return b.o0((Executor) e14);
            case 2:
                Object e15 = sVar.e(new q(rl.b.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e15, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return b.o0((Executor) e15);
            default:
                Object e16 = sVar.e(new q(d.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e16, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return b.o0((Executor) e16);
        }
    }

    @Override // sl.e
    public final /* bridge */ /* synthetic */ Object e(s sVar) {
        switch (this.f69558a) {
        }
        return a(sVar);
    }
}
