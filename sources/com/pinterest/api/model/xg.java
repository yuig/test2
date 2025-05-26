package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class xg {

    /* renamed from: a, reason: collision with root package name */
    public String f43676a;

    /* renamed from: b, reason: collision with root package name */
    public String f43677b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f43678c;

    /* renamed from: d, reason: collision with root package name */
    public String f43679d;

    /* renamed from: e, reason: collision with root package name */
    public List f43680e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f43681f;

    public /* synthetic */ xg(int i13) {
        this();
    }

    private xg() {
        this.f43681f = new boolean[5];
    }

    private xg(@NonNull ah ahVar) {
        String str;
        String str2;
        Integer num;
        String str3;
        List list;
        str = ahVar.f35736a;
        this.f43676a = str;
        str2 = ahVar.f35737b;
        this.f43677b = str2;
        num = ahVar.f35738c;
        this.f43678c = num;
        str3 = ahVar.f35739d;
        this.f43679d = str3;
        list = ahVar.f35740e;
        this.f43680e = list;
        boolean[] zArr = ahVar.f35741f;
        this.f43681f = Arrays.copyOf(zArr, zArr.length);
    }
}
