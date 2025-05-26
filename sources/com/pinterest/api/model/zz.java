package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class zz {

    /* renamed from: a, reason: collision with root package name */
    public String f44533a;

    /* renamed from: b, reason: collision with root package name */
    public String f44534b;

    /* renamed from: c, reason: collision with root package name */
    public List f44535c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f44536d;

    /* renamed from: e, reason: collision with root package name */
    public String f44537e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f44538f;

    public /* synthetic */ zz(int i13) {
        this();
    }

    private zz() {
        this.f44538f = new boolean[5];
    }

    private zz(@NonNull c00 c00Var) {
        String str;
        String str2;
        List list;
        Integer num;
        String str3;
        str = c00Var.f36263a;
        this.f44533a = str;
        str2 = c00Var.f36264b;
        this.f44534b = str2;
        list = c00Var.f36265c;
        this.f44535c = list;
        num = c00Var.f36266d;
        this.f44536d = num;
        str3 = c00Var.f36267e;
        this.f44537e = str3;
        boolean[] zArr = c00Var.f36268f;
        this.f44538f = Arrays.copyOf(zArr, zArr.length);
    }
}
