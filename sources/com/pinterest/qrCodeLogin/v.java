package com.pinterest.qrCodeLogin;

import com.pinterest.gestalt.spinner.GestaltSpinner;
import kh2.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nt.k2;

/* loaded from: classes4.dex */
public final class v extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f50354r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z f50355s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, bl2.c cVar) {
        super(2, cVar);
        this.f50355s = zVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        v vVar = new v(this.f50355s, cVar);
        vVar.f50354r = obj;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        j jVar = (j) this.f50354r;
        ln1.e eVar = jVar.f50319a;
        z zVar = this.f50355s;
        GestaltSpinner gestaltSpinner = zVar.f50366j0;
        if (gestaltSpinner == null) {
            Intrinsics.r("gestaltSpinner");
            throw null;
        }
        s0.w(gestaltSpinner, new k2(eVar, 4));
        zVar.e8(jVar.f50320b);
        return Unit.f80348a;
    }
}
