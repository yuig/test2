package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class xe0 {

    /* renamed from: a, reason: collision with root package name */
    public String f43655a;

    /* renamed from: b, reason: collision with root package name */
    public String f43656b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f43657c;

    /* renamed from: d, reason: collision with root package name */
    public String f43658d;

    /* renamed from: e, reason: collision with root package name */
    public String f43659e;

    /* renamed from: f, reason: collision with root package name */
    public String f43660f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f43661g;

    public /* synthetic */ xe0(int i13) {
        this();
    }

    private xe0() {
        this.f43661g = new boolean[6];
    }

    private xe0(@NonNull af0 af0Var) {
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        String str5;
        str = af0Var.f35719a;
        this.f43655a = str;
        str2 = af0Var.f35720b;
        this.f43656b = str2;
        num = af0Var.f35721c;
        this.f43657c = num;
        str3 = af0Var.f35722d;
        this.f43658d = str3;
        str4 = af0Var.f35723e;
        this.f43659e = str4;
        str5 = af0Var.f35724f;
        this.f43660f = str5;
        boolean[] zArr = af0Var.f35725g;
        this.f43661g = Arrays.copyOf(zArr, zArr.length);
    }
}
