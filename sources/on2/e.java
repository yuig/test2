package on2;

import kotlin.jvm.functions.Function1;
import nn2.v;

/* loaded from: classes2.dex */
public final class e extends k implements s {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f96771e = pn2.j.f100806i;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function1 f96772f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q qVar, v vVar, pn2.k kVar) {
        super(qVar, vVar);
        this.f96772f = kVar;
        if (qVar == null) {
            h(0);
            throw null;
        }
        this.f96778d = null;
    }

    public static /* synthetic */ void b(int i13) {
        String str = i13 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i13 != 2 ? 2 : 3];
        if (i13 != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i13 != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i13 == 2) {
            objArr[2] = "doPostCompute";
        }
        String format = String.format(str, objArr);
        if (i13 == 2) {
            throw new IllegalArgumentException(format);
        }
    }

    public static /* synthetic */ void h(int i13) {
        String str = i13 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i13 != 2 ? 3 : 2];
        if (i13 == 1) {
            objArr[0] = "computable";
        } else if (i13 != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        }
        if (i13 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        } else {
            objArr[1] = "invoke";
        }
        if (i13 != 2) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i13 == 2) {
            throw new IllegalStateException(format);
        }
    }

    @Override // on2.j
    public final p f(boolean z13) {
        Function1 function1 = this.f96771e;
        return function1 == null ? super.f(z13) : p.c(function1.invoke(Boolean.valueOf(z13)));
    }

    @Override // on2.k, on2.j, kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object invoke = super.invoke();
        if (invoke != null) {
            return invoke;
        }
        h(2);
        throw null;
    }
}
