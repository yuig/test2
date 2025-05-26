package com.google.android.recaptcha.internal;

import android.content.Context;
import android.webkit.WebView;
import ao2.j0;
import bl2.c;
import cl2.a;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
final class zzjc extends j implements Function2 {
    final /* synthetic */ zzjd zza;
    final /* synthetic */ Context zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjc(zzjd zzjdVar, Context context, c cVar) {
        super(2, cVar);
        this.zza = zzjdVar;
        this.zzb = context;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new zzjc(this.zza, this.zzb, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzjc) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        WebView webView;
        a aVar = a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        webView = this.zza.zza;
        if (webView == null) {
            webView = new WebView(this.zzb);
        }
        this.zza.zza = webView;
        return webView;
    }
}
