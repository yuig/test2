package rl1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b0 f108525j = new b0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b0 f108526k = new b0(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108527i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i13) {
        super(1);
        this.f108527i = i13;
    }

    public final q b(q it) {
        switch (this.f108527i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, null, null, false, null, null, false, false, fm1.c.GONE, 0, null, null, 1919);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, null, null, false, null, null, false, false, fm1.c.VISIBLE, 0, null, null, 1919);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f108527i) {
        }
        return b((q) obj);
    }
}
