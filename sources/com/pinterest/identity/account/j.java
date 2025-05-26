package com.pinterest.identity.account;

import com.pinterest.api.model.wy0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lb2.n;

/* loaded from: classes2.dex */
public final class j extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f49798i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f49799j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, int i13) {
        super(1);
        this.f49798i = i13;
        this.f49799j = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f49798i;
        k kVar = this.f49799j;
        switch (i13) {
            case 0:
                wy0 it = (wy0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return ((n) kVar.f49801b).g();
            default:
                qr1.d result = (qr1.d) obj;
                Intrinsics.checkNotNullParameter(result, "result");
                return new fk2.c(1, new fk2.c(4, ((n) kVar.f49801b).i(new c60.a(result.getV3AccessToken(), result.getV5AccessToken(), result.getV5RefreshToken())), new oo1.d(5, new j(kVar, 0))), ck2.i.f27926f).h(wj2.c.a());
        }
    }
}
