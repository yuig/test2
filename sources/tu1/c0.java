package tu1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;
import lh0.a4;
import lh0.g1;
import lh0.g2;
import lh0.z3;

/* loaded from: classes2.dex */
public final class c0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final c0 f119356j = new c0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c0 f119357k = new c0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c0 f119358l = new c0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c0 f119359m = new c0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final c0 f119360n = new c0(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119361i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i13) {
        super(0);
        this.f119361i = i13;
    }

    public final ExecutorService b() {
        switch (this.f119361i) {
            case 1:
                return Executors.newCachedThreadPool();
            case 2:
                return Executors.newFixedThreadPool(4);
            case 3:
                return Executors.newFixedThreadPool(8);
            default:
                return Executors.newSingleThreadExecutor();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f119361i) {
            case 0:
                g2 d2 = g2.f83370b.d();
                z3 z3Var = a4.f83297a;
                g1 g1Var = (g1) d2.f83373a;
                break;
        }
        return b();
    }
}
