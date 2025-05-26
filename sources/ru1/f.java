package ru1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final f f110033j = new f(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f f110034k = new f(1);

    /* renamed from: l, reason: collision with root package name */
    public static final f f110035l = new f(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110036i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13) {
        super(1);
        this.f110036i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f110036i) {
            case 0:
                um1.d bind = (um1.d) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f122796a = null;
                return Unit.f80348a;
            case 1:
                um1.b it = (um1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return um1.b.e(it, null, fm1.c.GONE, 0, 11);
            default:
                return Unit.f80348a;
        }
    }
}
