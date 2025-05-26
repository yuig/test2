package com.pinterest.widget;

import android.content.Context;
import android.content.Intent;
import kh2.j;
import kh2.u2;
import so.oa;
import vy.m;

/* loaded from: classes4.dex */
public abstract class Hilt_GalleryWallWidget extends xc2.c {

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f52800e = false;

    /* renamed from: f, reason: collision with root package name */
    public final Object f52801f = new Object();

    @Override // xc2.b
    public final void a(Context context) {
        if (this.f52800e) {
            return;
        }
        synchronized (this.f52801f) {
            try {
                if (!this.f52800e) {
                    GalleryWallWidget galleryWallWidget = (GalleryWallWidget) this;
                    oa oaVar = (oa) ((xc2.a) j.D(context));
                    u2.k0(galleryWallWidget, (lu1.b) oaVar.f113961v5.get());
                    u2.h0(galleryWallWidget, (m) oaVar.M1.get());
                    u2.D0(galleryWallWidget, oaVar.j3());
                    this.f52800e = true;
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
