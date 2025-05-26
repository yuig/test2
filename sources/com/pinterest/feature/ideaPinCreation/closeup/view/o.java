package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.view.View;
import com.pinterest.api.model.ln0;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f46275i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f46276j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(q qVar, int i13) {
        super(0);
        this.f46275i = i13;
        this.f46276j = qVar;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m118invoke() {
        ln0 ln0Var;
        int i13 = this.f46275i;
        q qVar = this.f46276j;
        switch (i13) {
            case 0:
                qVar.getClass();
                NavigationImpl V8 = q.V8(qVar, com.pinterest.screens.d2.q());
                V8.Y1("com.pinterest.EXTRA_STORY_PIN_TRIM_REQUIRED", true);
                qVar.M1(V8);
                Navigation navigation = qVar.I;
                if (navigation != null) {
                    navigation.Y1("com.pinterest.EXTRA_STORY_PIN_TRIM_REQUIRED", false);
                    return;
                }
                return;
            case 1:
                au0.d dVar = qVar.H0;
                if (dVar != null) {
                    dVar.w3();
                }
                au0.d dVar2 = qVar.I0;
                if (dVar2 != null) {
                    dVar2.t3();
                }
                View view = qVar.getView();
                if (view != null) {
                    i92.k kVar = qVar.C0;
                    if (kVar == null) {
                        Intrinsics.r("toastUtils");
                        throw null;
                    }
                    uv0.k.d(kVar, view);
                }
                qVar.requireActivity().finish();
                return;
            default:
                au0.d dVar3 = qVar.I0;
                if (dVar3 != null) {
                    dVar3.t3();
                }
                if (qVar.W8()) {
                    au0.d dVar4 = qVar.H0;
                    if (dVar4 != null) {
                        dVar4.f20476b.b(new om0.m1(12, dVar4.f20486l, dVar4));
                    }
                } else {
                    au0.d dVar5 = qVar.H0;
                    if (dVar5 != null && (ln0Var = dVar5.f20486l) != null) {
                        kh2.d.o(dVar5.f20475a, dVar5.f20476b.d());
                        uv0.k.c(ln0Var);
                    }
                }
                qVar.f7().d(new ag1.j());
                qVar.D5();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f46275i) {
            case 0:
                m118invoke();
                return Unit.f80348a;
            case 1:
                m118invoke();
                return Unit.f80348a;
            case 2:
                m118invoke();
                return Unit.f80348a;
            default:
                Context requireContext = this.f46276j.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new f0(requireContext);
        }
    }
}
