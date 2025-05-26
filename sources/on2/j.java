package on2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class j implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final q f96775a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f96776b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f96777c;

    public j(q qVar, Function0 function0) {
        if (qVar == null) {
            b(0);
            throw null;
        }
        this.f96777c = o.NOT_COMPUTED;
        this.f96775a = qVar;
        this.f96776b = function0;
    }

    public static /* synthetic */ void b(int i13) {
        String str = (i13 == 2 || i13 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 2 || i13 == 3) ? 2 : 3];
        if (i13 == 1) {
            objArr[0] = "computable";
        } else if (i13 == 2 || i13 == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i13 == 2) {
            objArr[1] = "recursionDetected";
        } else if (i13 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i13 != 2 && i13 != 3) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i13 != 2 && i13 != 3) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public void e(Object obj) {
    }

    public p f(boolean z13) {
        p g13 = this.f96775a.g(null, "in a lazy value");
        if (g13 != null) {
            return g13;
        }
        b(2);
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        h hVar;
        Object obj = this.f96777c;
        if (!(obj instanceof o)) {
            if (!(obj instanceof wn2.j)) {
                return obj;
            }
            Throwable e13 = ((wn2.j) obj).b();
            Intrinsics.checkNotNullParameter(e13, "e");
            throw e13;
        }
        this.f96775a.f96786a.lock();
        try {
            Object obj2 = this.f96777c;
            if (obj2 instanceof o) {
                o oVar = o.COMPUTING;
                if (obj2 == oVar) {
                    this.f96777c = o.RECURSION_WAS_DETECTED;
                    p f13 = f(true);
                    if (!f13.b()) {
                        obj2 = f13.a();
                    }
                }
                if (obj2 == o.RECURSION_WAS_DETECTED) {
                    p f14 = f(false);
                    if (!f14.b()) {
                        obj2 = f14.a();
                    }
                }
                this.f96777c = oVar;
                try {
                    obj2 = this.f96776b.invoke();
                    e(obj2);
                    this.f96777c = obj2;
                } catch (Throwable th3) {
                    if (l3.c.F0(th3)) {
                        this.f96777c = o.NOT_COMPUTED;
                        throw th3;
                    }
                    if (this.f96777c == o.COMPUTING) {
                        this.f96777c = new wn2.j(th3);
                    }
                    hVar = this.f96775a.f96787b;
                    ((ln2.k) hVar).i(th3);
                    throw null;
                }
            } else if (obj2 instanceof wn2.j) {
                Throwable e14 = ((wn2.j) obj2).b();
                Intrinsics.checkNotNullParameter(e14, "e");
                throw e14;
            }
            this.f96775a.f96786a.unlock();
            return obj2;
        } catch (Throwable th4) {
            this.f96775a.f96786a.unlock();
            throw th4;
        }
    }
}
