package on2;

/* loaded from: classes2.dex */
public final class f extends g {
    public static /* synthetic */ void b(int i13) {
        String str = i13 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i13 != 3 ? 3 : 2];
        if (i13 == 1) {
            objArr[0] = "map";
        } else if (i13 == 2) {
            objArr[0] = "computation";
        } else if (i13 != 3) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        }
        if (i13 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        } else {
            objArr[1] = "computeIfAbsent";
        }
        if (i13 == 2) {
            objArr[2] = "computeIfAbsent";
        } else if (i13 != 3) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i13 == 3) {
            throw new IllegalStateException(format);
        }
    }
}
