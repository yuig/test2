package com.pinterest.schoolTeenPrompt;

import hn1.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rg0.j0;
import u50.h0;
import u50.w;

/* loaded from: classes4.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f50463i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j0 f50464j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(j0 j0Var, int i13) {
        super(1);
        this.f50463i = i13;
        this.f50464j = j0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f50463i;
        j0 j0Var = this.f50464j;
        switch (i13) {
            case 0:
                kn1.b it = (kn1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                String str = j0Var.f15163a;
                if (str == null) {
                    str = "";
                }
                return kn1.b.e(it, false, false, null, ep.b.x(str, "string", str), null, null, new k(new w(j0Var.f108039d), h0.f120562a), 1909);
            default:
                in1.b it2 = (in1.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                String str2 = j0Var.f108038c.f58913a;
                return in1.b.e(it2, new hn1.d(new yl1.b(ep.b.x(str2, "string", str2), false, fm1.c.VISIBLE, null, yl1.i.b(), null, null, null, 0, null, 1002)), false, null, 14);
        }
    }
}
