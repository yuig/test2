package l11;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import u50.f0;
import u50.k0;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f81398j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f81399k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f81400l = new d(2);

    /* renamed from: m, reason: collision with root package name */
    public static final d f81401m = new d(3);

    /* renamed from: n, reason: collision with root package name */
    public static final d f81402n = new d(4);

    /* renamed from: o, reason: collision with root package name */
    public static final d f81403o = new d(5);

    /* renamed from: p, reason: collision with root package name */
    public static final d f81404p = new d(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81405i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f81405i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f81405i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 1, null, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096991);
        }
    }

    public final void e(cn1.n bind) {
        switch (this.f81405i) {
            case 3:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.e(dn1.e.DEFAULT);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.e(dn1.e.TRAILING_BUTTON);
                int i13 = x0.cancel;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                bind.f28218j = new cn1.g(new k0(i13, new ArrayList(0)));
                break;
            case 5:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                int i14 = x0.search;
                bind.getClass();
                bind.f28212d = new k0(i14);
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.getClass();
                Intrinsics.checkNotNullParameter("", "text");
                bind.f28209a = new f0("");
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f81405i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                e((cn1.n) obj);
                break;
            case 4:
                e((cn1.n) obj);
                break;
            case 5:
                e((cn1.n) obj);
                break;
            default:
                e((cn1.n) obj);
                break;
        }
        return Unit.f80348a;
    }
}
