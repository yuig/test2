package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class ba0 {

    /* renamed from: a, reason: collision with root package name */
    public List f36035a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f36036b;

    /* renamed from: c, reason: collision with root package name */
    public String f36037c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f36038d;

    public /* synthetic */ ba0(int i13) {
        this();
    }

    private ba0() {
        this.f36038d = new boolean[3];
    }

    private ba0(@NonNull ea0 ea0Var) {
        List list;
        Integer num;
        String str;
        list = ea0Var.f37218a;
        this.f36035a = list;
        num = ea0Var.f37219b;
        this.f36036b = num;
        str = ea0Var.f37220c;
        this.f36037c = str;
        boolean[] zArr = ea0Var.f37221d;
        this.f36038d = Arrays.copyOf(zArr, zArr.length);
    }
}
