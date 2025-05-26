package gw1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ln1.l;

/* loaded from: classes4.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f66215j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f66216k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f66217l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f66218m = new b(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f66219i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f66219i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f66219i) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return rn1.a.y(it, bs1.c.h2("-"), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
    }

    public final void e(l bind) {
        switch (this.f66219i) {
            case 0:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(ln1.e.LOADING);
                bind.d(fm1.c.VISIBLE);
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(ln1.e.LOADING);
                bind.d(fm1.c.VISIBLE);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f66219i) {
            case 0:
                e((l) obj);
                break;
            case 1:
                e((l) obj);
                break;
        }
        return b((rn1.a) obj);
    }
}
