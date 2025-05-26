package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ss {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f41979a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f41980b;

    /* renamed from: c, reason: collision with root package name */
    public String f41981c;

    /* renamed from: d, reason: collision with root package name */
    public String f41982d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f41983e;

    public /* synthetic */ ss(int i13) {
        this();
    }

    public final vs a() {
        return new vs(this.f41979a, this.f41980b, this.f41981c, this.f41982d, this.f41983e, 0);
    }

    public final void b(Boolean bool) {
        this.f41979a = bool;
        boolean[] zArr = this.f41983e;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public final void c(Boolean bool) {
        this.f41980b = bool;
        boolean[] zArr = this.f41983e;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void d(String str) {
        this.f41981c = str;
        boolean[] zArr = this.f41983e;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void e(String str) {
        this.f41982d = str;
        boolean[] zArr = this.f41983e;
        if (zArr.length > 3) {
            zArr[3] = true;
        }
    }

    private ss() {
        this.f41983e = new boolean[4];
    }

    private ss(@NonNull vs vsVar) {
        Boolean bool;
        Boolean bool2;
        String str;
        String str2;
        bool = vsVar.f42970a;
        this.f41979a = bool;
        bool2 = vsVar.f42971b;
        this.f41980b = bool2;
        str = vsVar.f42972c;
        this.f41981c = str;
        str2 = vsVar.f42973d;
        this.f41982d = str2;
        boolean[] zArr = vsVar.f42974e;
        this.f41983e = Arrays.copyOf(zArr, zArr.length);
    }
}
