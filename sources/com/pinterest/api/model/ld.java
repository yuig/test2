package com.pinterest.api.model;

import androidx.annotation.NonNull;
import com.pinterest.api.model.md;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class ld {

    /* renamed from: a, reason: collision with root package name */
    public String f39711a;

    /* renamed from: b, reason: collision with root package name */
    public String f39712b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f39713c;

    /* renamed from: d, reason: collision with root package name */
    public String f39714d;

    /* renamed from: e, reason: collision with root package name */
    public md.a f39715e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f39716f;

    /* renamed from: g, reason: collision with root package name */
    public List f39717g;

    /* renamed from: h, reason: collision with root package name */
    public String f39718h;

    /* renamed from: i, reason: collision with root package name */
    public Double f39719i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean[] f39720j;

    public /* synthetic */ ld(int i13) {
        this();
    }

    public final void a(Integer num) {
        this.f39713c = num;
        boolean[] zArr = this.f39720j;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void b(String str) {
        this.f39714d = str;
        boolean[] zArr = this.f39720j;
        if (zArr.length > 3) {
            zArr[3] = true;
        }
    }

    public final void c(Boolean bool) {
        this.f39716f = bool;
        boolean[] zArr = this.f39720j;
        if (zArr.length > 5) {
            zArr[5] = true;
        }
    }

    public final void d(String str) {
        this.f39712b = str;
        boolean[] zArr = this.f39720j;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void e(Double d2) {
        this.f39719i = d2;
        boolean[] zArr = this.f39720j;
        if (zArr.length > 8) {
            zArr[8] = true;
        }
    }

    public final void f(String str) {
        this.f39711a = str;
        boolean[] zArr = this.f39720j;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    private ld() {
        this.f39720j = new boolean[9];
    }

    private ld(@NonNull md mdVar) {
        String str;
        String str2;
        Integer num;
        String str3;
        md.a aVar;
        Boolean bool;
        List list;
        String str4;
        Double d2;
        str = mdVar.f40063a;
        this.f39711a = str;
        str2 = mdVar.f40064b;
        this.f39712b = str2;
        num = mdVar.f40065c;
        this.f39713c = num;
        str3 = mdVar.f40066d;
        this.f39714d = str3;
        aVar = mdVar.f40067e;
        this.f39715e = aVar;
        bool = mdVar.f40068f;
        this.f39716f = bool;
        list = mdVar.f40069g;
        this.f39717g = list;
        str4 = mdVar.f40070h;
        this.f39718h = str4;
        d2 = mdVar.f40071i;
        this.f39719i = d2;
        boolean[] zArr = mdVar.f40072j;
        this.f39720j = Arrays.copyOf(zArr, zArr.length);
    }
}
