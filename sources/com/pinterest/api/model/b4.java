package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b4 {

    /* renamed from: a, reason: collision with root package name */
    public String f35961a;

    /* renamed from: b, reason: collision with root package name */
    public String f35962b;

    /* renamed from: c, reason: collision with root package name */
    public y3 f35963c;

    /* renamed from: d, reason: collision with root package name */
    public String f35964d;

    /* renamed from: e, reason: collision with root package name */
    public Double f35965e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f35966f;

    public /* synthetic */ b4(int i13) {
        this();
    }

    private b4() {
        this.f35966f = new boolean[5];
    }

    private b4(@NonNull c4 c4Var) {
        String str;
        String str2;
        y3 y3Var;
        String str3;
        Double d2;
        str = c4Var.f36287a;
        this.f35961a = str;
        str2 = c4Var.f36288b;
        this.f35962b = str2;
        y3Var = c4Var.f36289c;
        this.f35963c = y3Var;
        str3 = c4Var.f36290d;
        this.f35964d = str3;
        d2 = c4Var.f36291e;
        this.f35965e = d2;
        boolean[] zArr = c4Var.f36292f;
        this.f35966f = Arrays.copyOf(zArr, zArr.length);
    }
}
