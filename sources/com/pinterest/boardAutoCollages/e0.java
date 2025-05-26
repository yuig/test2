package com.pinterest.boardAutoCollages;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e0 f44554j = new e0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e0 f44555k = new e0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e0 f44556l = new e0(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f44557i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(int i13) {
        super(1);
        this.f44557i = i13;
    }

    public final e b(e it) {
        switch (this.f44557i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return e.e(it, false, null, 5);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f44557i) {
        }
        return b((e) obj);
    }
}
