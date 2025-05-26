package s3;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w1 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final w1 f110991a = new w1();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        k0 k0Var2 = (k0) obj2;
        int i13 = Intrinsics.i(k0Var2.f110823k, k0Var.f110823k);
        return i13 != 0 ? i13 : Intrinsics.i(k0Var.hashCode(), k0Var2.hashCode());
    }
}
