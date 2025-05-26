package androidx.media3.ui;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.EditText;
import android.widget.ImageView;
import com.facebook.AccessToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.textfield.TextInputLayout;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer;
import df.u1;
import df.v1;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kh2.j1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19144b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19145c;

    public /* synthetic */ z(int i13, Object obj, Object obj2) {
        this.f19143a = i13;
        this.f19144b = obj;
        this.f19145c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        me.k u13;
        switch (this.f19143a) {
            case 0:
                PlayerView playerView = (PlayerView) this.f19144b;
                Bitmap bitmap = (Bitmap) this.f19145c;
                int i13 = PlayerView.f18983p;
                playerView.getClass();
                BitmapDrawable bitmapDrawable = new BitmapDrawable(playerView.getResources(), bitmap);
                ImageView imageView = playerView.f18988e;
                if (imageView != null) {
                    imageView.setImageDrawable(bitmapDrawable);
                    playerView.c();
                }
                ImageView imageView2 = playerView.f18988e;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    playerView.c();
                }
                View view = playerView.f18986c;
                if (view != null) {
                    view.setVisibility(0);
                    return;
                }
                return;
            case 1:
                a8.n0 this$0 = (a8.n0) this.f19144b;
                String[] tables = (String[]) this.f19145c;
                int i14 = ja.u.f75278a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(tables, "$tables");
                ja.s sVar = (ja.s) this$0.f1403c;
                String[] tables2 = (String[]) Arrays.copyOf(tables, tables.length);
                sVar.getClass();
                Intrinsics.checkNotNullParameter(tables2, "tables");
                synchronized (sVar.f75272k) {
                    try {
                        Iterator it = sVar.f75272k.iterator();
                        while (true) {
                            p.e eVar = (p.e) it;
                            if (eVar.hasNext()) {
                                Map.Entry entry = (Map.Entry) eVar.next();
                                Intrinsics.checkNotNullExpressionValue(entry, "(observer, wrapper)");
                                ja.p pVar = (ja.p) entry.getKey();
                                ja.q qVar = (ja.q) entry.getValue();
                                if (!pVar.a()) {
                                    qVar.b(tables2);
                                }
                            } else {
                                Unit unit = Unit.f80348a;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 2:
                Runnable command = (Runnable) this.f19144b;
                androidx.appcompat.app.r this$02 = (androidx.appcompat.app.r) this.f19145c;
                Intrinsics.checkNotNullParameter(command, "$command");
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                try {
                    command.run();
                    return;
                } finally {
                    this$02.a();
                }
            case 3:
                ab.f fVar = (ab.f) this.f19144b;
                ab.d dVar = (ab.d) this.f19145c;
                int i15 = ab.e.f1688a;
                j1.i0();
                if (bb.k.f22458f.b()) {
                    bb.l.f22459a.a(fVar, new a8.v(dVar, 8));
                    return;
                }
                if (fVar.f1690b) {
                    WebSettings.getDefaultUserAgent(null);
                }
                new Handler(Looper.getMainLooper()).post(new u0.n(dVar, 26));
                return;
            case 4:
                ab.d dVar2 = (ab.d) this.f19144b;
                ab.g gVar = (ab.g) this.f19145c;
                int i16 = ab.e.f1688a;
                dVar2.onSuccess(gVar);
                return;
            case 5:
                hb.m this$03 = (hb.m) this.f19144b;
                eb.p newLayoutInfo = (eb.p) this.f19145c;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(newLayoutInfo, "$newLayoutInfo");
                this$03.f68505c.accept(newLayoutInfo);
                return;
            case 6:
                lb.j0 j0Var = (lb.j0) this.f19144b;
                String uuid = ((UUID) this.f19145c).toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
                d7.b.m(j0Var, uuid);
                return;
            case 7:
                le.e this$04 = (le.e) this.f19144b;
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(this.f19145c);
                wc.b bVar = le.e.f83036f;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                this$04.b();
                return;
            case 8:
            case 22:
            default:
                lo.i this$05 = (lo.i) this.f19144b;
                lo.d playerState = (lo.d) this.f19145c;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(playerState, "$playerState");
                for (mo.b bVar2 : ((WebViewYouTubePlayer) this$05.f84162a).c()) {
                    WebViewYouTubePlayer webViewYouTubePlayer = (WebViewYouTubePlayer) this$05.f84162a;
                    webViewYouTubePlayer.getClass();
                    bVar2.h(webViewYouTubePlayer, playerState);
                }
                return;
            case 9:
                me.b accessTokenAppIdPair = (me.b) this.f19144b;
                me.e appEvent = (me.e) this.f19145c;
                String str = me.i.f86987a;
                if (p001if.a.b(me.i.class)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "$accessTokenAppId");
                    Intrinsics.checkNotNullParameter(appEvent, "$appEvent");
                    rd.j jVar = me.i.f86989c;
                    synchronized (jVar) {
                        Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
                        Intrinsics.checkNotNullParameter(appEvent, "appEvent");
                        me.u k13 = jVar.k(accessTokenAppIdPair);
                        if (k13 != null) {
                            k13.a(appEvent);
                        }
                    }
                    switch (me.l.f86994b.f129077a) {
                        case 23:
                            u13 = me.m.f86996c.u();
                            break;
                        default:
                            u13 = me.m.f86996c.u();
                            break;
                    }
                    if (u13 != me.k.EXPLICIT_ONLY && me.i.f86989c.j() > me.i.f86988b) {
                        me.i.d(me.p.EVENT_THRESHOLD);
                        return;
                    } else {
                        if (me.i.f86991e == null) {
                            me.i.f86991e = me.i.f86990d.schedule(me.i.f86992f, 15L, TimeUnit.SECONDS);
                            return;
                        }
                        return;
                    }
                } catch (Throwable th4) {
                    p001if.a.a(me.i.class, th4);
                    return;
                }
            case 10:
                me.b accessTokenAppId = (me.b) this.f19144b;
                me.u appEvents = (me.u) this.f19145c;
                String str2 = me.i.f86987a;
                if (p001if.a.b(me.i.class)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
                    Intrinsics.checkNotNullParameter(appEvents, "$appEvents");
                    me.j.a(accessTokenAppId, appEvents);
                    return;
                } catch (Throwable th5) {
                    p001if.a.a(me.i.class, th5);
                    return;
                }
            case 11:
                View view2 = (View) this.f19144b;
                ne.d this$06 = (ne.d) this.f19145c;
                me.f fVar2 = ne.d.f90439e;
                if (p001if.a.b(ne.d.class)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(view2, "$view");
                    Intrinsics.checkNotNullParameter(this$06, "this$0");
                    if (view2 instanceof EditText) {
                        this$06.b(view2);
                        return;
                    }
                    return;
                } catch (Throwable th6) {
                    p001if.a.a(ne.d.class, th6);
                    return;
                }
            case 12:
                Integer num = (Integer) this.f19144b;
                List processedEvents = (List) this.f19145c;
                Intrinsics.checkNotNullParameter(processedEvents, "$processedEvents");
                if (CollectionsKt.L(oe.q.f94208a, num)) {
                    return;
                }
                Intrinsics.checkNotNullParameter(processedEvents, "processedEvents");
                if (CollectionsKt.L(oe.q.f94209b, num)) {
                    if (oe.q.f94212e >= 5) {
                        oe.q.b().clear();
                        oe.q.f94212e = 0;
                        return;
                    } else {
                        oe.q.b().addAll(0, processedEvents);
                        oe.q.f94212e++;
                        return;
                    }
                }
                return;
            case 13:
                String eventName = (String) this.f19144b;
                Bundle parameters = (Bundle) this.f19145c;
                if (p001if.a.b(pe.c.class)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(eventName, "$eventName");
                    Intrinsics.checkNotNullParameter(parameters, "$parameters");
                    Context context = le.v.a();
                    wc.b bVar3 = me.l.f86994b;
                    Intrinsics.checkNotNullParameter(context, "context");
                    new me.l(context).f86995a.d(eventName, parameters);
                    return;
                } catch (Throwable th7) {
                    p001if.a.a(pe.c.class, th7);
                    return;
                }
            case 14:
                pe.k this$07 = (pe.k) this.f19144b;
                TimerTask indexingTask = (TimerTask) this.f19145c;
                String str3 = pe.k.f99921e;
                if (p001if.a.b(pe.k.class)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(this$07, "this$0");
                    Intrinsics.checkNotNullParameter(indexingTask, "$indexingTask");
                    try {
                        Timer timer = this$07.f99924c;
                        if (timer != null) {
                            timer.cancel();
                        }
                        this$07.f99925d = null;
                        Timer timer2 = new Timer();
                        timer2.scheduleAtFixedRate(indexingTask, 0L, 1000L);
                        this$07.f99924c = timer2;
                        return;
                    } catch (Exception e13) {
                        Log.e(pe.k.f99921e, "Error scheduling indexing job", e13);
                        return;
                    }
                } catch (Throwable th8) {
                    p001if.a.a(pe.k.class, th8);
                    return;
                }
            case 15:
                String key = (String) this.f19144b;
                pe.k this$08 = (pe.k) this.f19145c;
                String str4 = pe.k.f99921e;
                if (p001if.a.b(pe.k.class)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(key, "$tree");
                    Intrinsics.checkNotNullParameter(this$08, "this$0");
                    Intrinsics.checkNotNullParameter(key, "key");
                    Charset charset = Charsets.UTF_8;
                    if (key == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    byte[] bytes = key.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                    String C0 = df.j1.C0("MD5", bytes);
                    Date date = AccessToken.f29844l;
                    AccessToken s13 = wc.j.s();
                    if (C0 == null || !Intrinsics.d(C0, this$08.f99925d)) {
                        this$08.b(me.f.e(key, s13, le.v.b()), C0);
                        return;
                    }
                    return;
                } catch (Throwable th9) {
                    p001if.a.a(pe.k.class, th9);
                    return;
                }
            case 16:
                se.g this$09 = (se.g) this.f19144b;
                Runnable queryPurchaseHistoryRunnable = (Runnable) this.f19145c;
                me.f fVar3 = se.g.f112334s;
                if (p001if.a.b(se.g.class)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(this$09, "this$0");
                    Intrinsics.checkNotNullParameter(queryPurchaseHistoryRunnable, "$queryPurchaseHistoryRunnable");
                    this$09.d(new ArrayList(this$09.f112357r), queryPurchaseHistoryRunnable);
                    return;
                } catch (Throwable th10) {
                    p001if.a.a(se.g.class, th10);
                    return;
                }
            case 17:
                String applicationId = (String) this.f19144b;
                me.e event = (me.e) this.f19145c;
                we.a aVar = we.a.f129234a;
                if (p001if.a.b(we.a.class)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
                    Intrinsics.checkNotNullParameter(event, "$event");
                    we.f fVar4 = we.f.f129239a;
                    List appEvents2 = kotlin.collections.e0.b(event);
                    if (p001if.a.b(we.f.class)) {
                        return;
                    }
                    try {
                        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                        Intrinsics.checkNotNullParameter(appEvents2, "appEvents");
                        we.f.f129239a.b(we.c.CUSTOM_APP_EVENTS, applicationId, appEvents2);
                        return;
                    } catch (Throwable th11) {
                        p001if.a.a(we.f.class, th11);
                        return;
                    }
                } catch (Throwable th12) {
                    p001if.a.a(we.a.class, th12);
                    return;
                }
            case 18:
                u1 node = (u1) this.f19144b;
                v1 this$010 = (v1) this.f19145c;
                Intrinsics.checkNotNullParameter(node, "$node");
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                try {
                    node.f54865a.run();
                    return;
                } finally {
                    this$010.b(node);
                }
            case 19:
                com.facebook.login.r this$011 = (com.facebook.login.r) this.f19144b;
                Bundle bundle = (Bundle) this.f19145c;
                ScheduledExecutorService scheduledExecutorService = com.facebook.login.r.f30036d;
                if (p001if.a.b(com.facebook.login.r.class)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(this$011, "this$0");
                    Intrinsics.checkNotNullParameter(bundle, "$bundle");
                    this$011.f30038b.c("fb_mobile_login_heartbeat", bundle);
                    return;
                } catch (Throwable th13) {
                    p001if.a.a(com.facebook.login.r.class, th13);
                    return;
                }
            case 20:
                com.google.android.material.datepicker.g gVar2 = (com.google.android.material.datepicker.g) this.f19144b;
                String str5 = (String) this.f19145c;
                TextInputLayout textInputLayout = gVar2.f32521a;
                Context context2 = textInputLayout.getContext();
                textInputLayout.G(context2.getString(fj.k.mtrl_picker_invalid_format) + "\n" + String.format(context2.getString(fj.k.mtrl_picker_invalid_format_use), str5.replace(' ', (char) 160)) + "\n" + String.format(context2.getString(fj.k.mtrl_picker_invalid_format_example), gVar2.f32523c.format(new Date(com.google.android.material.datepicker.i0.f().getTimeInMillis())).replace(' ', (char) 160)));
                gVar2.a();
                return;
            case 21:
                com.google.common.util.concurrent.i iVar = (com.google.common.util.concurrent.i) this.f19144b;
                pk.v0 v0Var = (pk.v0) this.f19145c;
                com.google.common.util.concurrent.b0 b0Var = com.google.common.util.concurrent.i.f33565j;
                iVar.G(v0Var);
                return;
            case 23:
                Callable callable = (Callable) this.f19144b;
                ll.j jVar2 = (ll.j) this.f19145c;
                try {
                    Object call = callable.call();
                    tl.h hVar = (tl.h) jVar2.f83754b;
                    int i17 = tl.h.f118044i;
                    hVar.j(call);
                    return;
                } catch (Exception e14) {
                    tl.h hVar2 = (tl.h) jVar2.f83754b;
                    int i18 = tl.h.f118044i;
                    hVar2.k(e14);
                    return;
                }
            case 24:
                com.google.firebase.messaging.l lVar = (com.google.firebase.messaging.l) this.f19144b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f19145c;
                lVar.getClass();
                try {
                    taskCompletionSource.setResult(lVar.a());
                    return;
                } catch (Exception e15) {
                    taskCompletionSource.setException(e15);
                    return;
                }
            case 25:
                lo.i this$012 = (lo.i) this.f19144b;
                lo.a playbackQuality = (lo.a) this.f19145c;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                Intrinsics.checkNotNullParameter(playbackQuality, "$playbackQuality");
                for (mo.b bVar4 : ((WebViewYouTubePlayer) this$012.f84162a).c()) {
                    WebViewYouTubePlayer webViewYouTubePlayer2 = (WebViewYouTubePlayer) this$012.f84162a;
                    webViewYouTubePlayer2.getClass();
                    bVar4.j(webViewYouTubePlayer2, playbackQuality);
                }
                return;
            case 26:
                lo.i this$013 = (lo.i) this.f19144b;
                lo.b playbackRate = (lo.b) this.f19145c;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                Intrinsics.checkNotNullParameter(playbackRate, "$playbackRate");
                for (mo.b bVar5 : ((WebViewYouTubePlayer) this$013.f84162a).c()) {
                    WebViewYouTubePlayer webViewYouTubePlayer3 = (WebViewYouTubePlayer) this$013.f84162a;
                    webViewYouTubePlayer3.getClass();
                    bVar5.i(webViewYouTubePlayer3, playbackRate);
                }
                return;
            case 27:
                lo.i this$014 = (lo.i) this.f19144b;
                String videoId = (String) this.f19145c;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                Intrinsics.checkNotNullParameter(videoId, "$videoId");
                for (mo.b bVar6 : ((WebViewYouTubePlayer) this$014.f84162a).c()) {
                    WebViewYouTubePlayer webViewYouTubePlayer4 = (WebViewYouTubePlayer) this$014.f84162a;
                    webViewYouTubePlayer4.getClass();
                    bVar6.a(webViewYouTubePlayer4, videoId);
                }
                return;
            case 28:
                lo.i this$015 = (lo.i) this.f19144b;
                lo.c playerError = (lo.c) this.f19145c;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                Intrinsics.checkNotNullParameter(playerError, "$playerError");
                for (mo.b bVar7 : ((WebViewYouTubePlayer) this$015.f84162a).c()) {
                    WebViewYouTubePlayer webViewYouTubePlayer5 = (WebViewYouTubePlayer) this$015.f84162a;
                    webViewYouTubePlayer5.getClass();
                    bVar7.f(webViewYouTubePlayer5, playerError);
                }
                return;
        }
    }
}
