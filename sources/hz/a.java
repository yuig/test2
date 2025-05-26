package hz;

import android.os.Bundle;
import com.pinterest.framework.screens.ScreenDescription;
import kh2.u2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lh0.a4;
import lh0.g1;
import lh0.n;
import lh0.z3;

/* loaded from: classes3.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70595i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f70596j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, int i13) {
        super(0);
        this.f70595i = i13;
        this.f70596j = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Bundle f49207c;
        int i13 = this.f70595i;
        Boolean bool = null;
        d dVar = this.f70596j;
        switch (i13) {
            case 0:
                ScreenDescription screenDescription = dVar.f76937a;
                if (screenDescription != null && (f49207c = screenDescription.getF49207c()) != null) {
                    bool = Boolean.valueOf(f49207c.getBoolean("isInline"));
                }
                return Boolean.valueOf(com.bumptech.glide.d.o0(bool));
            default:
                n nVar = dVar.f70603k0;
                if (nVar == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) nVar.f83426a;
                return Boolean.valueOf(g1Var.o("android_anket_question_sba", "enabled", z3Var) || g1Var.l("android_anket_question_sba"));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Bundle f49207c;
        int i13 = this.f70595i;
        d dVar = this.f70596j;
        switch (i13) {
            case 0:
                return invoke();
            case 1:
                ScreenDescription screenDescription = dVar.f76937a;
                if (screenDescription == null || (f49207c = screenDescription.getF49207c()) == null) {
                    return null;
                }
                return f49207c.getString("questionId");
            case 2:
                return invoke();
            default:
                u6.c defaultViewModelCreationExtras = dVar.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                return u2.f1(defaultViewModelCreationExtras, new wt.c(dVar, 24));
        }
    }
}
