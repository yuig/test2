package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class b50 {

    /* renamed from: a, reason: collision with root package name */
    public String f35975a;

    /* renamed from: b, reason: collision with root package name */
    public String f35976b;

    /* renamed from: c, reason: collision with root package name */
    public List f35977c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f35978d;

    public /* synthetic */ b50(int i13) {
        this();
    }

    private b50() {
        this.f35978d = new boolean[3];
    }

    private b50(@NonNull e50 e50Var) {
        String str;
        String str2;
        List list;
        str = e50Var.f37182a;
        this.f35975a = str;
        str2 = e50Var.f37183b;
        this.f35976b = str2;
        list = e50Var.f37184c;
        this.f35977c = list;
        boolean[] zArr = e50Var.f37185d;
        this.f35978d = Arrays.copyOf(zArr, zArr.length);
    }
}
