package on2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public class l extends j implements s {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, Function0 function0) {
        super(qVar, function0);
        if (qVar != null) {
        } else {
            b(0);
            throw null;
        }
    }

    public static /* synthetic */ void b(int i13) {
        String str = i13 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i13 != 2 ? 3 : 2];
        if (i13 == 1) {
            objArr[0] = "computable";
        } else if (i13 != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
        }
        if (i13 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
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

    @Override // on2.j, kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object invoke = super.invoke();
        if (invoke != null) {
            return invoke;
        }
        b(2);
        throw null;
    }
}
