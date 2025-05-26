package v90;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e1 f124883j = new e1(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e1 f124884k = new e1(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e1 f124885l = new e1(2);

    /* renamed from: m, reason: collision with root package name */
    public static final e1 f124886m = new e1(3);

    /* renamed from: n, reason: collision with root package name */
    public static final e1 f124887n = new e1(4);

    /* renamed from: o, reason: collision with root package name */
    public static final e1 f124888o = new e1(5);

    /* renamed from: p, reason: collision with root package name */
    public static final e1 f124889p = new e1(6);

    /* renamed from: q, reason: collision with root package name */
    public static final e1 f124890q = new e1(7);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f124891i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(int i13) {
        super(1);
        this.f124891i = i13;
    }

    public final a b(a it) {
        switch (this.f124891i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 3:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return a.e(it, null, false, null, null, null, null, null, null, null, false, 2045);
    }

    public final k1 e(k1 it) {
        switch (this.f124891i) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return k1.b(it, null, null, false, 63);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return k1.b(it, null, null, true, 63);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f124891i) {
            case 0:
                return b((a) obj);
            case 1:
                return b((a) obj);
            case 2:
                return b((a) obj);
            case 3:
                return e((k1) obj);
            case 4:
                return b((a) obj);
            case 5:
                return b((a) obj);
            case 6:
                return b((a) obj);
            default:
                return e((k1) obj);
        }
    }
}
