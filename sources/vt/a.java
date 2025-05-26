package vt;

import com.pinterest.api.model.f30;
import java.util.HashSet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f126551j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f126552k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f126553l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f126554m = new a(3);

    /* renamed from: n, reason: collision with root package name */
    public static final a f126555n = new a(4);

    /* renamed from: o, reason: collision with root package name */
    public static final a f126556o = new a(5);

    /* renamed from: p, reason: collision with root package name */
    public static final a f126557p = new a(6);

    /* renamed from: q, reason: collision with root package name */
    public static final a f126558q = new a(7);

    /* renamed from: r, reason: collision with root package name */
    public static final a f126559r = new a(8);

    /* renamed from: s, reason: collision with root package name */
    public static final a f126560s = new a(9);

    /* renamed from: t, reason: collision with root package name */
    public static final a f126561t = new a(10);

    /* renamed from: u, reason: collision with root package name */
    public static final a f126562u = new a(11);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126563i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f126563i = i13;
    }

    public final void b(Throwable th3) {
        switch (this.f126563i) {
            case 6:
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.o("failed to initialize quiz pin", th3);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f126563i) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                Pair it = (Pair) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Object obj2 = it.f80346a;
                Intrinsics.checkNotNullExpressionValue(obj2, "<get-first>(...)");
                int[] iArr = (int[]) obj2;
                int i13 = Integer.MAX_VALUE;
                for (int i14 : iArr) {
                    if (i14 < i13) {
                        i13 = i14;
                    }
                }
                int i15 = iArr[0];
                break;
            case 2:
                int[] it2 = (int[]) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2.length == 0) {
                    break;
                } else {
                    for (int i16 : it2) {
                        if (i16 <= 0) {
                            break;
                        }
                    }
                    break;
                }
            case 3:
                b((Throwable) obj);
                break;
            case 4:
                b((Throwable) obj);
                break;
            case 5:
                f30 it3 = (f30) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                break;
            case 6:
                b((Throwable) obj);
                break;
            case 7:
                b((Throwable) obj);
                break;
            case 8:
                b((Throwable) obj);
                break;
            case 9:
                b((Throwable) obj);
                break;
            case 10:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
