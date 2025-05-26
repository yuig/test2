package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class d8 {

    /* renamed from: a, reason: collision with root package name */
    public String f36666a;

    /* renamed from: b, reason: collision with root package name */
    public String f36667b;

    /* renamed from: c, reason: collision with root package name */
    public i8 f36668c;

    /* renamed from: d, reason: collision with root package name */
    public String f36669d;

    /* renamed from: e, reason: collision with root package name */
    public String f36670e;

    /* renamed from: f, reason: collision with root package name */
    public String f36671f;

    /* renamed from: g, reason: collision with root package name */
    public String f36672g;

    /* renamed from: h, reason: collision with root package name */
    public String f36673h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f36674i;

    public /* synthetic */ d8(int i13) {
        this();
    }

    private d8() {
        this.f36674i = new boolean[8];
    }

    private d8(@NonNull e8 e8Var) {
        String str;
        String str2;
        i8 i8Var;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        str = e8Var.f37196a;
        this.f36666a = str;
        str2 = e8Var.f37197b;
        this.f36667b = str2;
        i8Var = e8Var.f37198c;
        this.f36668c = i8Var;
        str3 = e8Var.f37199d;
        this.f36669d = str3;
        str4 = e8Var.f37200e;
        this.f36670e = str4;
        str5 = e8Var.f37201f;
        this.f36671f = str5;
        str6 = e8Var.f37202g;
        this.f36672g = str6;
        str7 = e8Var.f37203h;
        this.f36673h = str7;
        boolean[] zArr = e8Var.f37204i;
        this.f36674i = Arrays.copyOf(zArr, zArr.length);
    }
}
