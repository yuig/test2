package wy0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import lh0.a4;
import lh0.g1;
import lh0.j2;
import lh0.z3;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f131221i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f131222j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i13) {
        super(0);
        this.f131221i = i13;
        this.f131222j = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f131221i;
        d dVar = this.f131222j;
        switch (i13) {
            case 0:
                j2 j2Var = dVar.f131229d;
                j2Var.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) j2Var.f83397a;
                return Boolean.valueOf(g1Var.o("android_gestalt_spinner_mod_nux_picker_fragment", "enabled", z3Var) || g1Var.l("android_gestalt_spinner_mod_nux_picker_fragment"));
            default:
                return new sy0.d(dVar.f131227b, dVar);
        }
    }
}
