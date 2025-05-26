package com.google.android.recaptcha.internal;

import ao2.j0;
import bl2.c;
import cl2.a;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
final class zzbg extends j implements Function2 {
    public zzbg(c cVar) {
        super(2, cVar);
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new zzbg(cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbg) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        Thread.currentThread().setPriority(8);
        return Unit.f80348a;
    }
}
