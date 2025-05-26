package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class x01 {

    /* renamed from: a, reason: collision with root package name */
    public String f43532a;

    /* renamed from: b, reason: collision with root package name */
    public String f43533b;

    /* renamed from: c, reason: collision with root package name */
    public String f43534c;

    /* renamed from: d, reason: collision with root package name */
    public String f43535d;

    /* renamed from: e, reason: collision with root package name */
    public String f43536e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f43537f;

    public /* synthetic */ x01(int i13) {
        this();
    }

    private x01() {
        this.f43537f = new boolean[5];
    }

    private x01(@NonNull a11 a11Var) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        str = a11Var.f35620a;
        this.f43532a = str;
        str2 = a11Var.f35621b;
        this.f43533b = str2;
        str3 = a11Var.f35622c;
        this.f43534c = str3;
        str4 = a11Var.f35623d;
        this.f43535d = str4;
        str5 = a11Var.f35624e;
        this.f43536e = str5;
        boolean[] zArr = a11Var.f35625f;
        this.f43537f = Arrays.copyOf(zArr, zArr.length);
    }
}
