package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class lu {

    /* renamed from: a, reason: collision with root package name */
    public String f39894a;

    /* renamed from: b, reason: collision with root package name */
    public String f39895b;

    /* renamed from: c, reason: collision with root package name */
    public String f39896c;

    /* renamed from: d, reason: collision with root package name */
    public String f39897d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f39898e;

    public /* synthetic */ lu(int i13) {
        this();
    }

    private lu() {
        this.f39898e = new boolean[4];
    }

    private lu(@NonNull ou ouVar) {
        String str;
        String str2;
        String str3;
        String str4;
        str = ouVar.f40813a;
        this.f39894a = str;
        str2 = ouVar.f40814b;
        this.f39895b = str2;
        str3 = ouVar.f40815c;
        this.f39896c = str3;
        str4 = ouVar.f40816d;
        this.f39897d = str4;
        boolean[] zArr = ouVar.f40817e;
        this.f39898e = Arrays.copyOf(zArr, zArr.length);
    }
}
