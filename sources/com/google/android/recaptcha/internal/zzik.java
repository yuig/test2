package com.google.android.recaptcha.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ao2.w;
import io.embrace.android.embracesdk.WebViewClientSwazzledHooks;
import java.io.ByteArrayInputStream;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import xk2.d;

/* loaded from: classes3.dex */
public final class zzik extends WebViewClient {
    final /* synthetic */ zzja zza;

    public zzik(zzja zzjaVar) {
        this.zza = zzjaVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        System.currentTimeMillis();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        zzjh zzjhVar;
        zzjhVar = this.zza.zzh;
        long zza = zzjhVar.zza(TimeUnit.MICROSECONDS);
        int i13 = zzbk.zza;
        zzbk.zza(zzbl.zzg.zza(), zza);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClientSwazzledHooks._preOnPageStarted(webView, str, bitmap);
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    @d
    public final void onReceivedError(WebView webView, int i13, String str, String str2) {
        Map map;
        super.onReceivedError(webView, i13, str, str2);
        zzbb zzbbVar = zzbb.zzc;
        map = this.zza.zzd;
        zzba zzbaVar = (zzba) map.get(Integer.valueOf(i13));
        if (zzbaVar == null) {
            zzbaVar = zzba.zzM;
        }
        zzbd zzbdVar = new zzbd(zzbbVar, zzbaVar, null);
        this.zza.zzA().hashCode();
        zzbdVar.getMessage();
        ((w) this.zza.zzA()).e0(zzbdVar);
    }

    @Override // android.webkit.WebViewClient
    @d
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        zzja zzjaVar = this.zza;
        Uri parse = Uri.parse(str);
        zzja.zzp(zzjaVar);
        Intrinsics.f(parse);
        if (!zzfk.zzc(parse) || zzja.zzp(this.zza).zza(parse)) {
            return super.shouldInterceptRequest(webView, str);
        }
        zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzQ, null);
        this.zza.zzA().hashCode();
        parse.toString();
        ((w) this.zza.zzA()).e0(zzbdVar);
        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
    }
}
