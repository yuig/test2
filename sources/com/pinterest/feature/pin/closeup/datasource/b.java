package com.pinterest.feature.pin.closeup.datasource;

import kg.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import lh0.a0;
import lh0.a4;
import lh0.g1;
import lh0.z3;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f46928j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f46929k = new b(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f46930i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(0);
        this.f46930i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f46930i) {
        }
        return invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z13 = true;
        switch (this.f46930i) {
            case 0:
                a0 a0Var = a0.f83292b;
                a0 u13 = p.u();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) u13.f83294a;
                if (!g1Var.o("android_related_pins_video_link_header", "enabled", z3Var) && !g1Var.l("android_related_pins_video_link_header")) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            case 1:
                return Boolean.TRUE;
            default:
                a0 a0Var2 = a0.f83292b;
                a0 u14 = p.u();
                z3 z3Var2 = a4.f83298b;
                g1 g1Var2 = (g1) u14.f83294a;
                if (!g1Var2.o("android_related_pins_video_link_header", "enabled", z3Var2) && !g1Var2.l("android_related_pins_video_link_header")) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
        }
    }
}
