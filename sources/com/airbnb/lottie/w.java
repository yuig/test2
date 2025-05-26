package com.airbnb.lottie;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f28472a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28473b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28474c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28475d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28476e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f28477f;

    public w(String str, int i13, String str2, int i14, String str3) {
        this.f28472a = i13;
        this.f28473b = i14;
        this.f28474c = str;
        this.f28475d = str2;
        this.f28476e = str3;
    }

    public final w a(float f13) {
        int i13 = (int) (this.f28472a * f13);
        int i14 = (int) (this.f28473b * f13);
        w wVar = new w(this.f28474c, i13, this.f28475d, i14, this.f28476e);
        Bitmap bitmap = this.f28477f;
        if (bitmap != null) {
            wVar.f28477f = Bitmap.createScaledBitmap(bitmap, i13, i14, true);
        }
        return wVar;
    }
}
