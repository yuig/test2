package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class g90 {

    /* renamed from: a, reason: collision with root package name */
    public String f37996a;

    /* renamed from: b, reason: collision with root package name */
    public String f37997b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f37998c;

    /* renamed from: d, reason: collision with root package name */
    public String f37999d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f38000e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f38001f;

    public /* synthetic */ g90(int i13) {
        this();
    }

    public final j90 a() {
        return new j90(this.f37996a, this.f37997b, this.f37998c, this.f37999d, this.f38000e, this.f38001f, 0);
    }

    public final void b(Boolean bool) {
        this.f37998c = bool;
        boolean[] zArr = this.f38001f;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void c(String str) {
        this.f37999d = str;
        boolean[] zArr = this.f38001f;
        if (zArr.length > 3) {
            zArr[3] = true;
        }
    }

    public final void d(Integer num) {
        this.f38000e = num;
        boolean[] zArr = this.f38001f;
        if (zArr.length > 4) {
            zArr[4] = true;
        }
    }

    private g90() {
        this.f38001f = new boolean[5];
    }

    private g90(@NonNull j90 j90Var) {
        String str;
        String str2;
        Boolean bool;
        String str3;
        Integer num;
        str = j90Var.f39012a;
        this.f37996a = str;
        str2 = j90Var.f39013b;
        this.f37997b = str2;
        bool = j90Var.f39014c;
        this.f37998c = bool;
        str3 = j90Var.f39015d;
        this.f37999d = str3;
        num = j90Var.f39016e;
        this.f38000e = num;
        boolean[] zArr = j90Var.f39017f;
        this.f38001f = Arrays.copyOf(zArr, zArr.length);
    }
}
