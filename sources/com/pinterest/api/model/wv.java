package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class wv {

    /* renamed from: a, reason: collision with root package name */
    public String f43379a;

    /* renamed from: b, reason: collision with root package name */
    public String f43380b;

    /* renamed from: c, reason: collision with root package name */
    public String f43381c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f43382d;

    public /* synthetic */ wv(int i13) {
        this();
    }

    public final zv a() {
        return new zv(this.f43379a, this.f43380b, this.f43381c, this.f43382d, 0);
    }

    public final void b(String str) {
        this.f43381c = str;
        boolean[] zArr = this.f43382d;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void c(String str) {
        this.f43380b = str;
        boolean[] zArr = this.f43382d;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void d(String str) {
        this.f43379a = str;
        boolean[] zArr = this.f43382d;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    private wv() {
        this.f43382d = new boolean[3];
    }

    private wv(@NonNull zv zvVar) {
        String str;
        String str2;
        String str3;
        str = zvVar.f44467a;
        this.f43379a = str;
        str2 = zvVar.f44468b;
        this.f43380b = str2;
        str3 = zvVar.f44469c;
        this.f43381c = str3;
        boolean[] zArr = zvVar.f44470d;
        this.f43382d = Arrays.copyOf(zArr, zArr.length);
    }
}
