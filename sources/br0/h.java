package br0;

import android.content.Context;
import jc0.s;
import kg.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes5.dex */
public final /* synthetic */ class h extends p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23751a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Object obj, int i13) {
        super(0, obj, i.class, "onCreatePinTap", "onCreatePinTap()V", 0);
        this.f23751a = i13;
        if (i13 == 1) {
            super(0, obj, i.class, "onCreateBoardTap", "onCreateBoardTap()V", 0);
        } else if (i13 != 2) {
        } else {
            super(0, obj, i.class, "onCreateCollageTap", "onCreateCollageTap()V", 0);
        }
    }

    public final void h() {
        switch (this.f23751a) {
            case 0:
                i iVar = (i) this.receiver;
                iVar.getClass();
                iVar.f23756d.d(new s());
                Context context = iVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                t.M0(iVar.f23755c, context, ou1.e.NAVBAR_PLUS_BUTTON, null, null, 0, 56);
                break;
            case 1:
                i iVar2 = (i) this.receiver;
                iVar2.getClass();
                iVar2.f23756d.d(new s());
                t.K0(iVar2.f23755c, iVar2.f23757e);
                break;
            default:
                i iVar3 = (i) this.receiver;
                iVar3.getClass();
                iVar3.f23756d.d(new s());
                t.L0(iVar3.f23755c, null, null, d32.c.APP_TAB_BAR_PLUS_BUTTON, null, 22);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f23751a) {
            case 0:
                h();
                break;
            case 1:
                h();
                break;
            default:
                h();
                break;
        }
        return Unit.f80348a;
    }
}
