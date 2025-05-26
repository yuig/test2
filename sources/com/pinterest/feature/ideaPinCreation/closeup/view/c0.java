package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.os.Bundle;
import com.pinterest.navigation.NavigationImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f46094i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f0 f46095j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g1 f46096k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(f0 f0Var, g1 g1Var, int i13) {
        super(0);
        this.f46094i = i13;
        this.f46095j = f0Var;
        this.f46096k = g1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f46094i) {
            case 0:
                m117invoke();
                break;
            case 1:
                m117invoke();
                break;
            case 2:
                m117invoke();
                break;
            case 3:
                m117invoke();
                break;
            case 4:
                m117invoke();
                break;
            default:
                m117invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m117invoke() {
        int i13 = this.f46094i;
        f0 f0Var = this.f46095j;
        g1 g1Var = this.f46096k;
        switch (i13) {
            case 0:
                f0Var.n((c1) g1Var);
                return;
            case 1:
                f0Var.I0(g1Var.X1());
                return;
            case 2:
                f0Var.I0(g1Var.X1());
                return;
            case 3:
                f0Var.I0(g1Var.X1());
                return;
            case 4:
                String X1 = g1Var.X1();
                f0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("com.pinterest.EXTRA_IDEA_PIN_OVERLAY_BLOCK_ID", X1);
                zp.j jVar = f0Var.f46165i;
                if (jVar != null) {
                    Context context = f0Var.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    zp.j.b(jVar, context, pw0.x.IdeaPinImageSticker, 0, bundle, null, null, 492);
                    return;
                }
                Intrinsics.r("galleryRouter");
                throw null;
            default:
                String overlayElementId = g1Var.X1();
                au0.d dVar = f0Var.f46166i0;
                if (dVar != null) {
                    Intrinsics.checkNotNullParameter(overlayElementId, "overlayElementId");
                    q qVar = (q) ((yt0.d) dVar.getView());
                    qVar.getClass();
                    Intrinsics.checkNotNullParameter(overlayElementId, "overlayElementId");
                    NavigationImpl V8 = q.V8(qVar, com.pinterest.screens.d2.f());
                    V8.m0("com.pinterest.EXTRA_IDEA_PIN_OVERLAY_BLOCK_ID", overlayElementId);
                    qVar.M1(V8);
                    return;
                }
                return;
        }
    }
}
