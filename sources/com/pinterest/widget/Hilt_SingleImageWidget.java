package com.pinterest.widget;

import android.content.Context;
import android.content.Intent;
import kh2.j;
import kh2.u2;
import so.oa;
import vy.m;

/* loaded from: classes4.dex */
public abstract class Hilt_SingleImageWidget extends xc2.c {

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f52802e = false;

    /* renamed from: f, reason: collision with root package name */
    public final Object f52803f = new Object();

    @Override // xc2.b
    public final void a(Context context) {
        if (this.f52802e) {
            return;
        }
        synchronized (this.f52803f) {
            try {
                if (!this.f52802e) {
                    SingleImageWidget singleImageWidget = (SingleImageWidget) this;
                    oa oaVar = (oa) ((xc2.h) j.D(context));
                    u2.k0(singleImageWidget, (lu1.b) oaVar.f113961v5.get());
                    u2.h0(singleImageWidget, (m) oaVar.M1.get());
                    u2.D0(singleImageWidget, oaVar.j3());
                    this.f52802e = true;
                }
            } finally {
            }
        }
    }

    @Override // xc2.c, xc2.b, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a(context);
        super.onReceive(context, intent);
    }
}
