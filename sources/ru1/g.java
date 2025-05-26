package ru1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f110037j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f110038k = new g(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g f110039l = new g(2);

    /* renamed from: m, reason: collision with root package name */
    public static final g f110040m = new g(3);

    /* renamed from: n, reason: collision with root package name */
    public static final g f110041n = new g(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110042i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(1);
        this.f110042i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f110042i;
        switch (i13) {
            case 0:
                break;
            case 1:
                rm1.d it = (rm1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 2:
                um1.d bind = (um1.d) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.getClass();
                        bind.f122798c = fm1.c.VISIBLE;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.getClass();
                        bind.f122798c = fm1.c.VISIBLE;
                        break;
                }
                break;
            case 3:
                um1.d bind2 = (um1.d) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.getClass();
                        bind2.f122798c = fm1.c.VISIBLE;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.getClass();
                        bind2.f122798c = fm1.c.VISIBLE;
                        break;
                }
                break;
            default:
                break;
        }
        return Unit.f80348a;
    }
}
