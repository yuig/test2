package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class t3 {

    /* renamed from: a, reason: collision with root package name */
    public String f42060a;

    /* renamed from: b, reason: collision with root package name */
    public String f42061b;

    /* renamed from: c, reason: collision with root package name */
    public String f42062c;

    /* renamed from: d, reason: collision with root package name */
    public y3 f42063d;

    /* renamed from: e, reason: collision with root package name */
    public String f42064e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f42065f;

    public /* synthetic */ t3(int i13) {
        this();
    }

    private t3() {
        this.f42065f = new boolean[5];
    }

    private t3(@NonNull u3 u3Var) {
        String str;
        String str2;
        String str3;
        y3 y3Var;
        String str4;
        str = u3Var.f42397a;
        this.f42060a = str;
        str2 = u3Var.f42398b;
        this.f42061b = str2;
        str3 = u3Var.f42399c;
        this.f42062c = str3;
        y3Var = u3Var.f42400d;
        this.f42063d = y3Var;
        str4 = u3Var.f42401e;
        this.f42064e = str4;
        boolean[] zArr = u3Var.f42402f;
        this.f42065f = Arrays.copyOf(zArr, zArr.length);
    }
}
