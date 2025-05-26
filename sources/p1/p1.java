package p1;

import androidx.compose.ui.platform.AbstractComposeView;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.ScreenManager$Companion;
import i2.c3;
import i2.h2;
import i2.o2;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class p1 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f98568i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f98569j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(Object obj, int i13) {
        super(2);
        this.f98568i = i13;
        this.f98569j = obj;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f98568i;
        Object obj = this.f98569j;
        int i15 = 2;
        switch (i14) {
            case 8:
                if ((i13 & 3) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                ((AbstractComposeView) obj).b(oVar, 0);
                break;
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                yq1.k kVar = (yq1.k) obj;
                int i16 = yq1.k.R0;
                br1.e0.h(kVar.c8(), null, new yq1.j(kVar, i15), oVar, 8, 2);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Set set) {
        Collection l03;
        long j13 = 255;
        long j14 = -9187201950435737472L;
        char c13 = 7;
        ao2.m mVar = null;
        switch (this.f98568i) {
            case 3:
                o2 o2Var = (o2) this.f98569j;
                synchronized (o2Var.f71209b) {
                    try {
                        if (((h2) o2Var.f71225r.getValue()).compareTo(h2.Idle) >= 0) {
                            g1.g0 g0Var = o2Var.f71214g;
                            if (set instanceof k2.g) {
                                g1.m0 m0Var = ((k2.g) set).f78193a;
                                Object[] objArr = m0Var.f63286b;
                                long[] jArr = m0Var.f63285a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i13 = 0;
                                    while (true) {
                                        long j15 = jArr[i13];
                                        if ((((~j15) << c13) & j15 & j14) != j14) {
                                            int i14 = 8 - ((~(i13 - length)) >>> 31);
                                            for (int i15 = 0; i15 < i14; i15++) {
                                                if ((j15 & 255) < 128) {
                                                    Object obj = objArr[(i13 << 3) + i15];
                                                    if (!(obj instanceof s2.a0) || ((s2.a0) obj).f(1)) {
                                                        g0Var.d(obj);
                                                    }
                                                }
                                                j15 >>= 8;
                                            }
                                            if (i14 == 8) {
                                            }
                                        }
                                        if (i13 != length) {
                                            i13++;
                                            j14 = -9187201950435737472L;
                                            c13 = 7;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj2 : set) {
                                    if ((obj2 instanceof s2.a0) && !((s2.a0) obj2).f(1)) {
                                    }
                                    g0Var.d(obj2);
                                }
                            }
                            mVar = o2Var.x();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (mVar != null) {
                    xk2.q qVar = xk2.s.f135225b;
                    mVar.resumeWith(Unit.f80348a);
                    return;
                }
                return;
            case 4:
                if (!(set instanceof k2.g)) {
                    Set set2 = set;
                    if ((set2 instanceof Collection) && set2.isEmpty()) {
                        return;
                    }
                    for (Object obj3 : set2) {
                        if ((obj3 instanceof s2.a0) && !((s2.a0) obj3).f(4)) {
                        }
                    }
                    return;
                }
                g1.m0 m0Var2 = ((k2.g) set).f78193a;
                Object[] objArr2 = m0Var2.f63286b;
                long[] jArr2 = m0Var2.f63285a;
                int length2 = jArr2.length - 2;
                if (length2 < 0) {
                    return;
                }
                int i16 = 0;
                while (true) {
                    long j16 = jArr2[i16];
                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i17 = 8 - ((~(i16 - length2)) >>> 31);
                        int i18 = 0;
                        while (i18 < i17) {
                            if ((j16 & j13) < 128) {
                                Object obj4 = objArr2[(i16 << 3) + i18];
                                if ((obj4 instanceof s2.a0) && !((s2.a0) obj4).f(4)) {
                                }
                            }
                            j16 >>= 8;
                            i18++;
                            j13 = 255;
                        }
                        if (i17 != 8) {
                            return;
                        }
                    }
                    if (i16 == length2) {
                        return;
                    }
                    i16++;
                    j13 = 255;
                }
                ((co2.q) this.f98569j).g(set);
                return;
            default:
                s2.w wVar = (s2.w) this.f98569j;
                while (true) {
                    AtomicReference atomicReference = wVar.f110698b;
                    Object obj5 = atomicReference.get();
                    if (obj5 == null) {
                        l03 = set;
                    } else if (obj5 instanceof Set) {
                        l03 = kotlin.collections.f0.j(obj5, set);
                    } else {
                        if (!(obj5 instanceof List)) {
                            s2.w.d();
                            throw null;
                        }
                        l03 = CollectionsKt.l0(kotlin.collections.e0.b(set), (Collection) obj5);
                    }
                    while (!atomicReference.compareAndSet(obj5, l03)) {
                        if (atomicReference.get() != obj5) {
                            break;
                        }
                    }
                    if (s2.w.a(wVar)) {
                        wVar.f110697a.invoke(new androidx.activity.a0(wVar, 6));
                        return;
                    }
                    return;
                }
        }
    }

    public final long f(long j13, n4.k kVar) {
        int i13 = this.f98568i;
        Object obj = this.f98569j;
        switch (i13) {
            case 0:
                return d7.b.a(0, ((u2.h) ((u2.d) obj)).a(0, (int) (j13 & 4294967295L)));
            case 1:
                return ((u2.e) obj).a(0L, j13, kVar);
            default:
                return d7.b.a(((u2.g) ((u2.c) obj)).a(0, (int) (j13 >> 32), kVar), 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f98568i;
        int i14 = 1;
        int i15 = 0;
        Object obj3 = this.f98569j;
        switch (i13) {
            case 0:
                return new n4.h(f(((n4.j) obj).f89186a, (n4.k) obj2));
            case 1:
                return new n4.h(f(((n4.j) obj).f89186a, (n4.k) obj2));
            case 2:
                return new n4.h(f(((n4.j) obj).f89186a, (n4.k) obj2));
            case 3:
                e((Set) obj);
                return Unit.f80348a;
            case 4:
                e((Set) obj);
                return Unit.f80348a;
            case 5:
                e((Set) obj);
                return Unit.f80348a;
            case 6:
                u2.q qVar = (u2.q) obj;
                u2.q qVar2 = (u2.o) obj2;
                if (qVar2 instanceof u2.l) {
                    kl2.l lVar = ((u2.l) qVar2).f120039c;
                    Intrinsics.g(lVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                    dl2.b.y(3, lVar);
                    i2.o oVar = (i2.o) obj3;
                    qVar2 = ao2.m0.W(oVar, (u2.q) lVar.invoke(u2.n.f120041b, oVar, 0));
                }
                return qVar.j(qVar2);
            case 7:
                b3.u uVar = (b3.u) obj;
                e3.d dVar = (e3.d) obj2;
                s3.q1 q1Var = (s3.q1) obj3;
                if (q1Var.f110898l.H()) {
                    t3.c0 c0Var = (t3.c0) s3.n0.a(q1Var.f110898l);
                    b3.u0 u0Var = s3.q1.G;
                    c0Var.A.b(q1Var, s3.s0.f110920n, new s3.n1(q1Var, uVar, dVar, i15));
                    q1Var.D = false;
                } else {
                    q1Var.D = true;
                }
                return Unit.f80348a;
            case 8:
                b((i2.o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 9:
                int intValue = ((Number) obj).intValue();
                String query = (String) obj2;
                Intrinsics.checkNotNullParameter(query, "query");
                List list = ((HttpUrl) obj3).f95637g;
                if (list != null) {
                    return new Pair(query, (String) list.get((intValue * 2) + 1));
                }
                throw new IndexOutOfBoundsException();
            case 10:
                String experiment = (String) obj;
                Intrinsics.checkNotNullParameter(experiment, "experiment");
                i92.k kVar = (i92.k) obj3;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(experiment, "experiment");
                ((m60.d) kVar.f71937a).g();
                return Unit.f80348a;
            case 11:
                List conversations = (List) obj;
                List boardInvites = (List) obj2;
                Intrinsics.checkNotNullParameter(conversations, "conversations");
                Intrinsics.checkNotNullParameter(boardInvites, "boardInvites");
                long time = new Date().getTime();
                kt0.c0 c0Var2 = kt0.c0.f80805i;
                kt0.e0 e0Var = (kt0.e0) obj3;
                if (kt0.e0.p3(e0Var, boardInvites, time) && kt0.e0.q3(e0Var, conversations, time)) {
                    return new k1.q(e0Var, boardInvites, conversations, 28);
                }
                if (kt0.e0.p3(e0Var, boardInvites, time)) {
                    return new kt0.b0(e0Var, boardInvites, i15);
                }
                if (kt0.e0.q3(e0Var, conversations, time)) {
                    return new kt0.b0(e0Var, conversations, i14);
                }
                lr.f.f84504g = false;
                lr.f.f84505h = false;
                lr.d0.f84486g.getClass();
                lr.d0.f84487h = false;
                lr.d0.f84488i = false;
                return c0Var2;
            case 12:
                ScreenDescription it = (ScreenDescription) obj;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(it, "it");
                com.pinterest.framework.screens.s sVar = (com.pinterest.framework.screens.s) obj3;
                ScreenManager$Companion screenManager$Companion = com.pinterest.framework.screens.s.f49224n;
                if (sVar.q(it)) {
                    com.pinterest.framework.screens.l lVar2 = sVar.f49228c;
                    if (((il1.b) lVar2).g(it) instanceof ml1.q) {
                        com.pinterest.framework.screens.m g13 = ((il1.b) lVar2).g(it);
                        Intrinsics.g(g13, "null cannot be cast to non-null type com.pinterest.framework.screens.transition.ScreenTransitionListener");
                        ((ml1.q) g13).k5();
                    }
                }
                return Unit.f80348a;
            case 13:
                b((i2.o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            default:
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                u2.q qVar3 = br1.e0.f23779a;
                ((c3) ((i2.m1) obj3)).i(floatValue);
                return Unit.f80348a;
        }
    }
}
