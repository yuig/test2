package oi;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdd;

/* loaded from: classes3.dex */
public final class i5 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f94844a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94845b;

    /* renamed from: c, reason: collision with root package name */
    public final String f94846c;

    /* renamed from: d, reason: collision with root package name */
    public final String f94847d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f94848e;

    /* renamed from: f, reason: collision with root package name */
    public final long f94849f;

    /* renamed from: g, reason: collision with root package name */
    public final zzdd f94850g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f94851h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f94852i;

    /* renamed from: j, reason: collision with root package name */
    public final String f94853j;

    public i5(Context context, zzdd zzddVar, Long l13) {
        this.f94851h = true;
        com.bumptech.glide.d.t(context);
        Context applicationContext = context.getApplicationContext();
        com.bumptech.glide.d.t(applicationContext);
        this.f94844a = applicationContext;
        this.f94852i = l13;
        if (zzddVar != null) {
            this.f94850g = zzddVar;
            this.f94845b = zzddVar.f31729k;
            this.f94846c = zzddVar.f31728j;
            this.f94847d = zzddVar.f31727i;
            this.f94851h = zzddVar.f31726h;
            this.f94849f = zzddVar.f31725g;
            this.f94853j = zzddVar.f31731m;
            Bundle bundle = zzddVar.f31730l;
            if (bundle != null) {
                this.f94848e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
