package oi;

import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public final class h4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f94806a;

    /* renamed from: b, reason: collision with root package name */
    public final long f94807b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f94808c;

    /* renamed from: d, reason: collision with root package name */
    public long f94809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g4 f94810e;

    public h4(g4 g4Var, String str, long j13) {
        this.f94810e = g4Var;
        com.bumptech.glide.d.o(str);
        this.f94806a = str;
        this.f94807b = j13;
    }

    public final long a() {
        if (!this.f94808c) {
            this.f94808c = true;
            this.f94809d = this.f94810e.w().getLong(this.f94806a, this.f94807b);
        }
        return this.f94809d;
    }

    public final void b(long j13) {
        SharedPreferences.Editor edit = this.f94810e.w().edit();
        edit.putLong(this.f94806a, j13);
        edit.apply();
        this.f94809d = j13;
    }
}
