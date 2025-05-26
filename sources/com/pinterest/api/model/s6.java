package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* loaded from: classes.dex */
public final class s6 {

    /* renamed from: a, reason: collision with root package name */
    public String f41791a;

    /* renamed from: b, reason: collision with root package name */
    public String f41792b;

    /* renamed from: c, reason: collision with root package name */
    public List f41793c;

    /* renamed from: d, reason: collision with root package name */
    public Date f41794d;

    /* renamed from: e, reason: collision with root package name */
    public String f41795e;

    /* renamed from: f, reason: collision with root package name */
    public String f41796f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f41797g;

    public /* synthetic */ s6(int i13) {
        this();
    }

    public final void a(String str) {
        this.f41792b = str;
        boolean[] zArr = this.f41797g;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    private s6() {
        this.f41797g = new boolean[6];
    }

    private s6(@NonNull t6 t6Var) {
        String str;
        String str2;
        List list;
        Date date;
        String str3;
        String str4;
        str = t6Var.f42101a;
        this.f41791a = str;
        str2 = t6Var.f42102b;
        this.f41792b = str2;
        list = t6Var.f42103c;
        this.f41793c = list;
        date = t6Var.f42104d;
        this.f41794d = date;
        str3 = t6Var.f42105e;
        this.f41795e = str3;
        str4 = t6Var.f42106f;
        this.f41796f = str4;
        boolean[] zArr = t6Var.f42107g;
        this.f41797g = Arrays.copyOf(zArr, zArr.length);
    }
}
