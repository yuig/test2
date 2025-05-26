package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class xn {

    /* renamed from: a, reason: collision with root package name */
    public dk0 f43752a;

    /* renamed from: b, reason: collision with root package name */
    public String f43753b;

    /* renamed from: c, reason: collision with root package name */
    public String f43754c;

    /* renamed from: d, reason: collision with root package name */
    public String f43755d;

    /* renamed from: e, reason: collision with root package name */
    public String f43756e;

    /* renamed from: f, reason: collision with root package name */
    public String f43757f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f43758g;

    public /* synthetic */ xn(int i13) {
        this();
    }

    private xn() {
        this.f43758g = new boolean[6];
    }

    private xn(@NonNull ao aoVar) {
        dk0 dk0Var;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        dk0Var = aoVar.f35817a;
        this.f43752a = dk0Var;
        str = aoVar.f35818b;
        this.f43753b = str;
        str2 = aoVar.f35819c;
        this.f43754c = str2;
        str3 = aoVar.f35820d;
        this.f43755d = str3;
        str4 = aoVar.f35821e;
        this.f43756e = str4;
        str5 = aoVar.f35822f;
        this.f43757f = str5;
        boolean[] zArr = aoVar.f35823g;
        this.f43758g = Arrays.copyOf(zArr, zArr.length);
    }
}
