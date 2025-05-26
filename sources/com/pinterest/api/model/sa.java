package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class sa {

    /* renamed from: a, reason: collision with root package name */
    public String f41837a;

    /* renamed from: b, reason: collision with root package name */
    public String f41838b;

    /* renamed from: c, reason: collision with root package name */
    public ls0 f41839c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f41840d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f41841e;

    /* renamed from: f, reason: collision with root package name */
    public String f41842f;

    /* renamed from: g, reason: collision with root package name */
    public ps0 f41843g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f41844h;

    /* renamed from: i, reason: collision with root package name */
    public String f41845i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean[] f41846j;

    public /* synthetic */ sa(int i13) {
        this();
    }

    public final ta a() {
        return new ta(this.f41837a, this.f41838b, this.f41839c, this.f41840d, this.f41841e, this.f41842f, this.f41843g, this.f41844h, this.f41845i, this.f41846j, 0);
    }

    public final void b(ps0 ps0Var) {
        this.f41843g = ps0Var;
        boolean[] zArr = this.f41846j;
        if (zArr.length > 6) {
            zArr[6] = true;
        }
    }

    public /* synthetic */ sa(ta taVar, int i13) {
        this(taVar);
    }

    private sa() {
        this.f41846j = new boolean[9];
    }

    private sa(@NonNull ta taVar) {
        String str;
        String str2;
        ls0 ls0Var;
        Integer num;
        Integer num2;
        String str3;
        ps0 ps0Var;
        Integer num3;
        String str4;
        str = taVar.f42141a;
        this.f41837a = str;
        str2 = taVar.f42142b;
        this.f41838b = str2;
        ls0Var = taVar.f42143c;
        this.f41839c = ls0Var;
        num = taVar.f42144d;
        this.f41840d = num;
        num2 = taVar.f42145e;
        this.f41841e = num2;
        str3 = taVar.f42146f;
        this.f41842f = str3;
        ps0Var = taVar.f42147g;
        this.f41843g = ps0Var;
        num3 = taVar.f42148h;
        this.f41844h = num3;
        str4 = taVar.f42149i;
        this.f41845i = str4;
        boolean[] zArr = taVar.f42150j;
        this.f41846j = Arrays.copyOf(zArr, zArr.length);
    }
}
