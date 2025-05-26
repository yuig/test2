package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class pg {

    /* renamed from: a, reason: collision with root package name */
    public String f40973a;

    /* renamed from: b, reason: collision with root package name */
    public String f40974b;

    /* renamed from: c, reason: collision with root package name */
    public String f40975c;

    /* renamed from: d, reason: collision with root package name */
    public String f40976d;

    /* renamed from: e, reason: collision with root package name */
    public String f40977e;

    /* renamed from: f, reason: collision with root package name */
    public String f40978f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f40979g;

    public /* synthetic */ pg(int i13) {
        this();
    }

    private pg() {
        this.f40979g = new boolean[6];
    }

    private pg(@NonNull sg sgVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        str = sgVar.f41911a;
        this.f40973a = str;
        str2 = sgVar.f41912b;
        this.f40974b = str2;
        str3 = sgVar.f41913c;
        this.f40975c = str3;
        str4 = sgVar.f41914d;
        this.f40976d = str4;
        str5 = sgVar.f41915e;
        this.f40977e = str5;
        str6 = sgVar.f41916f;
        this.f40978f = str6;
        boolean[] zArr = sgVar.f41917g;
        this.f40979g = Arrays.copyOf(zArr, zArr.length);
    }
}
