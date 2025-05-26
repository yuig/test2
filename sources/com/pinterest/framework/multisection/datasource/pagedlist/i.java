package com.pinterest.framework.multisection.datasource.pagedlist;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import so.oa;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final i f49137j = new i(0);

    /* renamed from: k, reason: collision with root package name */
    public static final i f49138k = new i(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f49139i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13) {
        super(0);
        this.f49139i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f49139i) {
            case 0:
                return Boolean.TRUE;
            default:
                Context context = kb0.a.f79058b;
                return (d12.i) ((oa) ((so1.b) ep.b.g(so1.b.class))).N2.get();
        }
    }
}
