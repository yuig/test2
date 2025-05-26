package wc2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class o extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final o f129143j = new o(0);

    /* renamed from: k, reason: collision with root package name */
    public static final o f129144k = new o(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129145i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i13) {
        super(1);
        this.f129145i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f129145i) {
            case 0:
                f it = (f) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.f129135c;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2.f129149c;
        }
    }
}
