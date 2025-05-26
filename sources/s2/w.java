package s2;

import ao2.m0;
import i2.r3;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import k1.s2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p1.p1;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f110697a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f110699c;

    /* renamed from: g, reason: collision with root package name */
    public h f110703g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f110704h;

    /* renamed from: i, reason: collision with root package name */
    public v f110705i;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f110698b = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final p1 f110700d = new p1(this, 5);

    /* renamed from: e, reason: collision with root package name */
    public final s2 f110701e = new s2(this, 8);

    /* renamed from: f, reason: collision with root package name */
    public final k2.e f110702f = new k2.e(new v[16]);

    /* renamed from: j, reason: collision with root package name */
    public long f110706j = -1;

    public w(Function1 function1) {
        this.f110697a = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(w wVar) {
        boolean z13;
        Set set;
        synchronized (wVar.f110702f) {
            z13 = wVar.f110699c;
        }
        if (z13) {
            return false;
        }
        boolean z14 = false;
        while (true) {
            AtomicReference atomicReference = wVar.f110698b;
            Object obj = atomicReference.get();
            Set set2 = null;
            r4 = null;
            List list = null;
            if (obj != null) {
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        d();
                        throw null;
                    }
                    List list2 = (List) obj;
                    set = (Set) list2.get(0);
                    if (list2.size() == 2) {
                        list = list2.get(1);
                    } else if (list2.size() > 2) {
                        list = list2.subList(1, list2.size());
                    }
                }
                List list3 = list;
                while (!atomicReference.compareAndSet(obj, list3)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set2 = set;
            }
            if (set2 == null) {
                return z14;
            }
            synchronized (wVar.f110702f) {
                try {
                    k2.e eVar = wVar.f110702f;
                    int i13 = eVar.f78184c;
                    if (i13 > 0) {
                        Object[] objArr = eVar.f78182a;
                        int i14 = 0;
                        do {
                            if (!((v) objArr[i14]).b(set2) && !z14) {
                                z14 = false;
                                i14++;
                            }
                            z14 = true;
                            i14++;
                        } while (i14 < i13);
                    }
                    Unit unit = Unit.f80348a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public static void d() {
        i2.u.j("Unexpected notification");
        throw null;
    }

    public final void b() {
        synchronized (this.f110702f) {
            try {
                k2.e eVar = this.f110702f;
                int i13 = eVar.f78184c;
                if (i13 > 0) {
                    Object[] objArr = eVar.f78182a;
                    int i14 = 0;
                    do {
                        v vVar = (v) objArr[i14];
                        vVar.f110689e.f78194a.a();
                        vVar.f110690f.a();
                        vVar.f110695k.f78194a.a();
                        vVar.f110696l.clear();
                        i14++;
                    } while (i14 < i13);
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void c(Object obj, Function1 function1, Function0 function0) {
        Object obj2;
        v vVar;
        synchronized (this.f110702f) {
            k2.e eVar = this.f110702f;
            int i13 = eVar.f78184c;
            if (i13 > 0) {
                Object[] objArr = eVar.f78182a;
                int i14 = 0;
                do {
                    obj2 = objArr[i14];
                    if (((v) obj2).f110685a == function1) {
                        break;
                    } else {
                        i14++;
                    }
                } while (i14 < i13);
            }
            obj2 = null;
            vVar = (v) obj2;
            if (vVar == null) {
                Intrinsics.g(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                dl2.b.y(1, function1);
                vVar = new v(function1);
                eVar.b(vVar);
            }
        }
        boolean z13 = this.f110704h;
        v vVar2 = this.f110705i;
        long j13 = this.f110706j;
        if (j13 != -1 && j13 != tb.f.G()) {
            StringBuilder u13 = a.a.u("Detected multithreaded access to SnapshotStateObserver: previousThreadId=", j13, "), currentThread={id=");
            u13.append(tb.f.G());
            u13.append(", name=");
            u13.append(Thread.currentThread().getName());
            u13.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            m0.o0(u13.toString());
            throw null;
        }
        try {
            this.f110704h = false;
            this.f110705i = vVar;
            this.f110706j = tb.f.G();
            vVar.a(obj, this.f110701e, function0);
        } finally {
            this.f110705i = vVar2;
            this.f110704h = z13;
            this.f110706j = j13;
        }
    }

    public final void e() {
        p1 p1Var = this.f110700d;
        r3 r3Var = p.f110666a;
        p.f(o.f110664k);
        synchronized (p.f110667b) {
            p.f110672g = CollectionsKt.m0(p1Var, p.f110672g);
            Unit unit = Unit.f80348a;
        }
        this.f110703g = new h(p1Var, 0);
    }
}
