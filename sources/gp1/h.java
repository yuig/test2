package gp1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import lh0.a4;
import lh0.g1;
import lh0.n1;
import lh0.z3;

/* loaded from: classes2.dex */
public final class h extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public static final h f65936i = new h(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        n1 c13 = n1.f83436b.c();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) c13.f83439a;
        return Boolean.valueOf(g1Var.o("android_max_video_ads_on_tablet", "enabled", z3Var) || g1Var.l("android_max_video_ads_on_tablet"));
    }
}
