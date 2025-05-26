package com.pinterest.social;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.pinterest.activity.sendapin.model.SendableObject;
import e0.t;
import e82.a0;
import e82.h0;
import e82.k;
import e82.r;
import kh2.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import p32.a;
import p32.c;
import p32.f;
import so.oa;
import vy.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/social/ExternalShareSelectionBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "socialLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ExternalShareSelectionBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f52182a = false;

    /* renamed from: b, reason: collision with root package name */
    public final Object f52183b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public h0 f52184c;

    /* renamed from: d, reason: collision with root package name */
    public m f52185d;

    /* renamed from: e, reason: collision with root package name */
    public w f52186e;

    public final void a(Context context, Intent intent) {
        if (this.f52182a) {
            return;
        }
        synchronized (this.f52183b) {
            try {
                if (!this.f52182a) {
                    oa oaVar = (oa) ((k) j.D(context));
                    this.f52184c = oaVar.b3();
                    this.f52185d = (m) oaVar.M1.get();
                    this.f52186e = (w) oaVar.f113885r0.get();
                    this.f52182a = true;
                }
            } finally {
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a(context, intent);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
        Bundle bundleExtra = intent.getBundleExtra("com.pinterest.EXTRA_BUNDLE");
        f fVar = f.OTHER;
        if (componentName != null) {
            String packageName = componentName.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            fVar = a0.a(packageName);
            h0 h0Var = this.f52184c;
            if (h0Var == null) {
                Intrinsics.r("socialUtils");
                throw null;
            }
            h0Var.k(packageName);
        }
        f fVar2 = fVar;
        if (bundleExtra != null) {
            String string = bundleExtra.getString("com.pinterest.EXTRA_INVITE_CODE");
            a aVar = c.Companion;
            int i13 = bundleExtra.getInt("com.pinterest.EXTRA_INVITE_CATEGORY", 0);
            aVar.getClass();
            c a13 = a.a(i13);
            SendableObject sendableObject = (SendableObject) bundleExtra.getParcelable("com.pinterest.EXTRA_SENDABLE_OBJECT");
            if (sendableObject != null && a13 != null && fVar2 != null && string != null) {
                h0 h0Var2 = this.f52184c;
                if (h0Var2 == null) {
                    Intrinsics.r("socialUtils");
                    throw null;
                }
                h0Var2.i(sendableObject, a13, fVar2, t.f56747e, string);
                int i14 = t.f56747e;
                m mVar = this.f52185d;
                if (mVar == null) {
                    Intrinsics.r("analyticsApi");
                    throw null;
                }
                t.M0(i14, mVar);
            }
            w wVar = this.f52186e;
            if (wVar != null) {
                wVar.d(new r());
            } else {
                Intrinsics.r("eventManager");
                throw null;
            }
        }
    }
}
