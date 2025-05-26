package kn0;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import tk2.e;
import uj2.q;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f80212j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f80213k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80214i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f80214i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f80214i) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                TimeUnit timeUnit = TimeUnit.SECONDS;
                it.getClass();
                return it.m(5L, timeUnit, e.f118016b);
            default:
                t60.a it2 = (t60.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2.f116455a;
        }
    }
}
