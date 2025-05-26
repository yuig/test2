package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class sv0 {

    /* renamed from: a, reason: collision with root package name */
    public String f42003a;

    /* renamed from: b, reason: collision with root package name */
    public String f42004b;

    /* renamed from: c, reason: collision with root package name */
    public String f42005c;

    /* renamed from: d, reason: collision with root package name */
    public String f42006d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f42007e;

    /* renamed from: f, reason: collision with root package name */
    public String f42008f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f42009g;

    public /* synthetic */ sv0(int i13) {
        this();
    }

    public /* synthetic */ sv0(vv0 vv0Var, int i13) {
        this(vv0Var);
    }

    private sv0() {
        this.f42009g = new boolean[6];
    }

    private sv0(@NonNull vv0 vv0Var) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        String str5;
        str = vv0Var.f43002a;
        this.f42003a = str;
        str2 = vv0Var.f43003b;
        this.f42004b = str2;
        str3 = vv0Var.f43004c;
        this.f42005c = str3;
        str4 = vv0Var.f43005d;
        this.f42006d = str4;
        num = vv0Var.f43006e;
        this.f42007e = num;
        str5 = vv0Var.f43007f;
        this.f42008f = str5;
        boolean[] zArr = vv0Var.f43008g;
        this.f42009g = Arrays.copyOf(zArr, zArr.length);
    }
}
