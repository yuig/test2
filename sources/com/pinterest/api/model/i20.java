package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class i20 {

    /* renamed from: a, reason: collision with root package name */
    public String f38604a;

    /* renamed from: b, reason: collision with root package name */
    public String f38605b;

    /* renamed from: c, reason: collision with root package name */
    public List f38606c;

    /* renamed from: d, reason: collision with root package name */
    public String f38607d;

    /* renamed from: e, reason: collision with root package name */
    public String f38608e;

    /* renamed from: f, reason: collision with root package name */
    public String f38609f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f38610g;

    public /* synthetic */ i20(int i13) {
        this();
    }

    private i20() {
        this.f38610g = new boolean[6];
    }

    private i20(@NonNull l20 l20Var) {
        String str;
        String str2;
        List list;
        String str3;
        String str4;
        String str5;
        str = l20Var.f39627a;
        this.f38604a = str;
        str2 = l20Var.f39628b;
        this.f38605b = str2;
        list = l20Var.f39629c;
        this.f38606c = list;
        str3 = l20Var.f39630d;
        this.f38607d = str3;
        str4 = l20Var.f39631e;
        this.f38608e = str4;
        str5 = l20Var.f39632f;
        this.f38609f = str5;
        boolean[] zArr = l20Var.f39633g;
        this.f38610g = Arrays.copyOf(zArr, zArr.length);
    }
}
