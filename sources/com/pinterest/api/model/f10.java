package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class f10 {

    /* renamed from: a, reason: collision with root package name */
    public String f37411a;

    /* renamed from: b, reason: collision with root package name */
    public String f37412b;

    /* renamed from: c, reason: collision with root package name */
    public String f37413c;

    /* renamed from: d, reason: collision with root package name */
    public String f37414d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f37415e;

    public /* synthetic */ f10(int i13) {
        this();
    }

    private f10() {
        this.f37415e = new boolean[4];
    }

    private f10(@NonNull i10 i10Var) {
        String str;
        String str2;
        String str3;
        String str4;
        str = i10Var.f38591a;
        this.f37411a = str;
        str2 = i10Var.f38592b;
        this.f37412b = str2;
        str3 = i10Var.f38593c;
        this.f37413c = str3;
        str4 = i10Var.f38594d;
        this.f37414d = str4;
        boolean[] zArr = i10Var.f38595e;
        this.f37415e = Arrays.copyOf(zArr, zArr.length);
    }
}
