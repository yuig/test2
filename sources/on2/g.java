package on2;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class g extends m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(q qVar, ConcurrentHashMap concurrentHashMap) {
        super(qVar, concurrentHashMap, new ym2.d(3));
        if (qVar != null) {
        } else {
            b(0);
            throw null;
        }
    }

    public static /* synthetic */ void b(int i13) {
        Object[] objArr = new Object[3];
        if (i13 == 1) {
            objArr[0] = "map";
        } else if (i13 != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "computation";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
        if (i13 != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "computeIfAbsent";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
