package com.pinterest.api.model;

import androidx.annotation.NonNull;
import com.pinterest.api.model.e7;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h7 {

    /* renamed from: a, reason: collision with root package name */
    public String f38320a;

    /* renamed from: b, reason: collision with root package name */
    public String f38321b;

    /* renamed from: c, reason: collision with root package name */
    public String f38322c;

    /* renamed from: d, reason: collision with root package name */
    public e7.a f38323d;

    /* renamed from: e, reason: collision with root package name */
    public e7.b f38324e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f38325f;

    public /* synthetic */ h7(int i13) {
        this();
    }

    public final void a(String str) {
        this.f38321b = str;
        boolean[] zArr = this.f38325f;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void b(String str) {
        this.f38320a = str;
        boolean[] zArr = this.f38325f;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    private h7() {
        this.f38325f = new boolean[5];
    }

    private h7(@NonNull e7 e7Var) {
        String str;
        String str2;
        String str3;
        e7.a aVar;
        e7.b bVar;
        str = e7Var.f37188a;
        this.f38320a = str;
        str2 = e7Var.f37189b;
        this.f38321b = str2;
        str3 = e7Var.f37190c;
        this.f38322c = str3;
        aVar = e7Var.f37191d;
        this.f38323d = aVar;
        bVar = e7Var.f37192e;
        this.f38324e = bVar;
        boolean[] zArr = e7Var.f37193f;
        this.f38325f = Arrays.copyOf(zArr, zArr.length);
    }
}
