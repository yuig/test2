package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class fq {

    /* renamed from: a, reason: collision with root package name */
    public String f37739a;

    /* renamed from: b, reason: collision with root package name */
    public String f37740b;

    /* renamed from: c, reason: collision with root package name */
    public String f37741c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f37742d;

    /* renamed from: e, reason: collision with root package name */
    public String f37743e;

    /* renamed from: f, reason: collision with root package name */
    public String f37744f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f37745g;

    public /* synthetic */ fq(int i13) {
        this();
    }

    private fq() {
        this.f37745g = new boolean[6];
    }

    private fq(@NonNull iq iqVar) {
        String str;
        String str2;
        String str3;
        Integer num;
        String str4;
        String str5;
        str = iqVar.f38840a;
        this.f37739a = str;
        str2 = iqVar.f38841b;
        this.f37740b = str2;
        str3 = iqVar.f38842c;
        this.f37741c = str3;
        num = iqVar.f38843d;
        this.f37742d = num;
        str4 = iqVar.f38844e;
        this.f37743e = str4;
        str5 = iqVar.f38845f;
        this.f37744f = str5;
        boolean[] zArr = iqVar.f38846g;
        this.f37745g = Arrays.copyOf(zArr, zArr.length);
    }
}
