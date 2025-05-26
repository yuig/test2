package on2;

/* loaded from: classes2.dex */
public final class n extends m implements r {
    public static /* synthetic */ void b(int i13) {
        String str = i13 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i13 != 3 ? 3 : 2];
        if (i13 == 1) {
            objArr[0] = "map";
        } else if (i13 == 2) {
            objArr[0] = "compute";
        } else if (i13 != 3) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
        }
        if (i13 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
        } else {
            objArr[1] = "invoke";
        }
        if (i13 != 3) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i13 == 3) {
            throw new IllegalStateException(format);
        }
    }

    @Override // on2.m, kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object invoke = super.invoke(obj);
        if (invoke != null) {
            return invoke;
        }
        b(3);
        throw null;
    }
}
