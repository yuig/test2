package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ra0 {

    /* renamed from: a, reason: collision with root package name */
    public String f41524a;

    /* renamed from: b, reason: collision with root package name */
    public String f41525b;

    /* renamed from: c, reason: collision with root package name */
    public String f41526c;

    /* renamed from: d, reason: collision with root package name */
    public String f41527d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f41528e;

    public /* synthetic */ ra0(int i13) {
        this();
    }

    private ra0() {
        this.f41528e = new boolean[4];
    }

    private ra0(@NonNull ua0 ua0Var) {
        String str;
        String str2;
        String str3;
        String str4;
        str = ua0Var.f42486a;
        this.f41524a = str;
        str2 = ua0Var.f42487b;
        this.f41525b = str2;
        str3 = ua0Var.f42488c;
        this.f41526c = str3;
        str4 = ua0Var.f42489d;
        this.f41527d = str4;
        boolean[] zArr = ua0Var.f42490e;
        this.f41528e = Arrays.copyOf(zArr, zArr.length);
    }
}
