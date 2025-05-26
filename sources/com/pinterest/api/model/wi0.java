package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class wi0 {

    /* renamed from: a, reason: collision with root package name */
    public String f43259a;

    /* renamed from: b, reason: collision with root package name */
    public String f43260b;

    /* renamed from: c, reason: collision with root package name */
    public List f43261c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f43262d;

    public /* synthetic */ wi0(int i13) {
        this();
    }

    private wi0() {
        this.f43262d = new boolean[3];
    }

    private wi0(@NonNull zi0 zi0Var) {
        String str;
        String str2;
        List list;
        str = zi0Var.f44337a;
        this.f43259a = str;
        str2 = zi0Var.f44338b;
        this.f43260b = str2;
        list = zi0Var.f44339c;
        this.f43261c = list;
        boolean[] zArr = zi0Var.f44340d;
        this.f43262d = Arrays.copyOf(zArr, zArr.length);
    }
}
