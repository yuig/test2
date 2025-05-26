package com.pinterest.feature.board.collab.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import com.pinterest.pushnotification.f;
import ep.b;
import fk2.l;
import ja.y;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import k1.q;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pz1.e;
import so.oa;
import tb0.g;
import tb0.h;
import tb0.k;
import wj2.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/pinterest/feature/board/collab/service/BoardActionService;", "Landroid/app/Service;", "<init>", "()V", "gi2/b", "a", "pushNotificationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardActionService extends Service {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f45114b = 0;

    /* renamed from: a, reason: collision with root package name */
    public a f45115a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/pinterest/feature/board/collab/service/BoardActionService$a;", "", "pushNotificationLibrary_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public interface a {
    }

    public final void a(f fVar, String str, String str2) {
        if (str != null) {
            String string = getString(e.board_notification_accept_message, str);
            fVar.f50267k = string;
            fVar.f50266j.put("payload", string);
        }
        if (str2 != null) {
            fVar.f50270n = str2;
            fVar.f50266j.put("image", str2);
        }
        fVar.f50275s = true;
        fVar.f50266j.put("invite_accepted", String.valueOf(true));
        if (d5.a.a(this, "android.permission.POST_NOTIFICATIONS") != 0) {
            new Thread(new y(fVar, this, this, 14)).start();
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i13, int i14) {
        f fVar;
        List<String> pathSegments;
        String Z;
        Bundle extras;
        Context context = kb0.a.f79058b;
        this.f45115a = (a) b.g(a.class);
        String stringExtra = intent != null ? intent.getStringExtra("ACTION_TYPE") : null;
        if (stringExtra == null || stringExtra.hashCode() != -1834783951 || !stringExtra.equals("ACTION_ACCEPT")) {
            return 2;
        }
        Intrinsics.checkNotNullParameter("InviteAcceptClicked", "actionValue");
        HashSet hashSet = h.f117076w;
        h hVar = g.f117075a;
        k kVar = new k();
        kVar.c("Action", "InviteAcceptClicked");
        hVar.k("BoardNotificationAccept", kVar.f117102a);
        String str = "";
        if (intent == null || (extras = intent.getExtras()) == null) {
            fVar = null;
        } else {
            HashMap hashMap = new HashMap();
            for (String str2 : extras.keySet()) {
                Intrinsics.f(str2);
                String string = extras.getString(str2);
                if (string == null) {
                    string = "";
                }
                hashMap.put(str2, string);
            }
            fVar = new f(hashMap);
        }
        if (fVar == null) {
            Intrinsics.checkNotNullParameter("IntentMissesExtra", "failureValue");
            HashSet hashSet2 = h.f117076w;
            h hVar2 = g.f117075a;
            k kVar2 = new k();
            kVar2.c("Failure", "IntentMissesExtra");
            hVar2.k("BoardNotificationAccept", kVar2.f117102a);
            return 2;
        }
        ij0.a aVar = new ij0.a(this, fVar);
        Uri uri = fVar.f50269m;
        if (uri != null && (pathSegments = uri.getPathSegments()) != null && (Z = CollectionsKt.Z(pathSegments, "/", null, null, 0, null, null, 62)) != null) {
            str = Z;
        }
        a aVar2 = this.f45115a;
        if (aVar2 == null) {
            Intrinsics.r("dependencies");
            throw null;
        }
        l h10 = ((oa) aVar2).q2().b(str).l(tk2.e.f118017c).h(c.a());
        Intrinsics.checkNotNullExpressionValue(h10, "observeOn(...)");
        int i15 = 20;
        nl.b.n(h10, new q(this, str, aVar, i15), new gd0.c(i15, this, fVar));
        return 2;
    }
}
