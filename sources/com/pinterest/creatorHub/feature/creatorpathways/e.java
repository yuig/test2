package com.pinterest.creatorHub.feature.creatorpathways;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f44782i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f44783j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, int i13) {
        super(1);
        this.f44782i = i13;
        this.f44783j = obj;
    }

    public final yl1.b b(yl1.b it) {
        int i13 = this.f44782i;
        Object obj = this.f44783j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.p2(((jr0.b) obj).f77543e.f77537a), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.p2(((jr0.a) obj).f77537a), false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1018);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f44782i) {
        }
        return b((yl1.b) obj);
    }
}
