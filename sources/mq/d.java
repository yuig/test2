package mq;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f87962j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f87963k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f87964l = new d(2);

    /* renamed from: m, reason: collision with root package name */
    public static final d f87965m = new d(3);

    /* renamed from: n, reason: collision with root package name */
    public static final d f87966n = new d(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87967i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f87967i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f87967i) {
            case 0:
                return Unit.f80348a;
            case 1:
                return Unit.f80348a;
            case 2:
                return Unit.f80348a;
            case 3:
                return Unit.f80348a;
            default:
                y01.h0 it = (y01.h0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return kotlin.collections.e0.b(it.f136413b);
        }
    }
}
