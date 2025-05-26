package com.pinterest.shuffles.scene.composer;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class h0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ie2.a f52051r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ao2.m f52052s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ie2.a aVar, ao2.m mVar, bl2.c cVar) {
        super(2, cVar);
        this.f52051r = aVar;
        this.f52052s = mVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new h0(this.f52051r, this.f52052s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        ao2.m mVar = this.f52052s;
        ie2.a aVar = this.f52051r;
        cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        try {
            try {
                Bitmap b13 = aVar.b(0.0f);
                xk2.q qVar = xk2.s.f135225b;
                mVar.resumeWith(b13);
            } catch (Exception e13) {
                xk2.q qVar2 = xk2.s.f135225b;
                mVar.resumeWith(ue.c.m(e13));
            }
            return Unit.f80348a;
        } finally {
            aVar.a();
        }
    }
}
