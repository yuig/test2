package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import ao2.j0;
import bl2.c;
import cl2.a;
import dl2.j;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
final class zzfv extends j implements Function2 {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzfw zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfv(String[] strArr, zzfw zzfwVar, String str, c cVar) {
        super(2, cVar);
        this.zza = strArr;
        this.zzb = zzfwVar;
        this.zzc = str;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new zzfv(this.zza, this.zzb, this.zzc, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfv) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        WebView webView;
        a aVar = a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        zzfw zzfwVar = this.zzb;
        String str2 = this.zzc;
        webView = zzfwVar.zza;
        webView.evaluateJavascript(a.a.l(str2, "(", CollectionsKt.Z(arrayList, ",", null, null, 0, null, null, 62), ")"), null);
        return Unit.f80348a;
    }
}
