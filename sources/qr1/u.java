package qr1;

import android.content.SharedPreferences;
import oi.g4;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public boolean f105034a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f105035b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f105036c;

    /* renamed from: d, reason: collision with root package name */
    public final String f105037d;

    /* renamed from: e, reason: collision with root package name */
    public Object f105038e;

    public u(g4 g4Var, String str, boolean z13) {
        this.f105038e = g4Var;
        com.bumptech.glide.d.o(str);
        this.f105037d = str;
        this.f105034a = z13;
    }

    public final u a() {
        if (!pk.a0.x0((String) this.f105038e)) {
            String str = ((String) this.f105038e).split("\\?")[0];
            this.f105038e = str;
            String replaceAll = str.replaceAll("\\/\\d+\\/", "/_id/");
            this.f105038e = replaceAll;
            this.f105038e = replaceAll.replaceAll("\\/[a-z,0-9,_,-]*[A-Z]+[a-z,0-9,_,-]*\\/", "/_id/");
        }
        return new u(this.f105034a, this.f105035b, this.f105037d, (String) this.f105038e, this.f105036c);
    }

    public final void b() {
        this.f105036c = true;
    }

    public final void c() {
        this.f105035b = true;
    }

    public final void d(String str) {
        this.f105038e = str;
    }

    public final void e(boolean z13) {
        this.f105034a = z13;
    }

    public final void f(boolean z13) {
        SharedPreferences.Editor edit = ((g4) this.f105038e).w().edit();
        edit.putBoolean(this.f105037d, z13);
        edit.apply();
        this.f105036c = z13;
    }

    public final boolean g() {
        if (!this.f105035b) {
            this.f105035b = true;
            this.f105036c = ((g4) this.f105038e).w().getBoolean(this.f105037d, this.f105034a);
        }
        return this.f105036c;
    }

    public u(boolean z13, boolean z14, String str, String str2, boolean z15) {
        this.f105034a = z13;
        this.f105035b = z14;
        this.f105037d = str;
        this.f105038e = str2;
        this.f105036c = z15;
    }

    public u(String str) {
        this.f105034a = true;
        this.f105035b = true;
        this.f105036c = false;
        this.f105038e = null;
        this.f105037d = str;
    }
}
