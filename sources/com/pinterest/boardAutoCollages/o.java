package com.pinterest.boardAutoCollages;

import android.view.View;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f44592r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f44593s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, bl2.c cVar) {
        super(2, cVar);
        this.f44593s = qVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        o oVar = new o(this.f44593s, cVar);
        oVar.f44592r = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((e) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        boolean z13 = ((e) this.f44592r).f44552b;
        int i13 = q.T0;
        q qVar = this.f44593s;
        if (z13) {
            View view = qVar.M0;
            if (view == null) {
                Intrinsics.r("progressOverlay");
                throw null;
            }
            if (view.getVisibility() != 0) {
                View view2 = qVar.M0;
                if (view2 == null) {
                    Intrinsics.r("progressOverlay");
                    throw null;
                }
                kg.a.s(view2, 0L, null, 6);
                GestaltSpinner gestaltSpinner = qVar.N0;
                if (gestaltSpinner == null) {
                    Intrinsics.r("progressOverlayLoadingView");
                    throw null;
                }
                dl2.b.X2(gestaltSpinner, ln1.e.LOADING);
            }
        } else {
            View view3 = qVar.M0;
            if (view3 == null) {
                Intrinsics.r("progressOverlay");
                throw null;
            }
            if (view3.getVisibility() == 0) {
                View view4 = qVar.M0;
                if (view4 == null) {
                    Intrinsics.r("progressOverlay");
                    throw null;
                }
                bs1.c.X0(view4);
                GestaltSpinner gestaltSpinner2 = qVar.N0;
                if (gestaltSpinner2 == null) {
                    Intrinsics.r("progressOverlayLoadingView");
                    throw null;
                }
                dl2.b.X2(gestaltSpinner2, ln1.e.NONE);
            }
        }
        return Unit.f80348a;
    }
}
