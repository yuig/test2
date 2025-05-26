package com.pinterest.feature.home.view;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class k extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f45871i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f45872j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(String str, int i13) {
        super(1);
        this.f45871i = i13;
        this.f45872j = str;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f45871i;
        String str = this.f45872j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f45871i) {
        }
        return b((rn1.a) obj);
    }
}
