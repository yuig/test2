package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aw {

    /* renamed from: a, reason: collision with root package name */
    public String f35873a;

    /* renamed from: b, reason: collision with root package name */
    public String f35874b;

    /* renamed from: c, reason: collision with root package name */
    public String f35875c;

    /* renamed from: d, reason: collision with root package name */
    public String f35876d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f35877e;

    public /* synthetic */ aw(int i13) {
        this();
    }

    public final dw a() {
        return new dw(this.f35873a, this.f35874b, this.f35875c, this.f35876d, this.f35877e, 0);
    }

    public final void b(String str) {
        this.f35873a = str;
        boolean[] zArr = this.f35877e;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public final void c(String str) {
        this.f35874b = str;
        boolean[] zArr = this.f35877e;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void d(String str) {
        this.f35875c = str;
        boolean[] zArr = this.f35877e;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void e(String str) {
        this.f35876d = str;
        boolean[] zArr = this.f35877e;
        if (zArr.length > 3) {
            zArr[3] = true;
        }
    }

    private aw() {
        this.f35877e = new boolean[4];
    }

    private aw(@NonNull dw dwVar) {
        String str;
        String str2;
        String str3;
        String str4;
        str = dwVar.f36973a;
        this.f35873a = str;
        str2 = dwVar.f36974b;
        this.f35874b = str2;
        str3 = dwVar.f36975c;
        this.f35875c = str3;
        str4 = dwVar.f36976d;
        this.f35876d = str4;
        boolean[] zArr = dwVar.f36977e;
        this.f35877e = Arrays.copyOf(zArr, zArr.length);
    }
}
