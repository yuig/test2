package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Date;

/* loaded from: classes3.dex */
public final class ze {

    /* renamed from: a, reason: collision with root package name */
    public String f44312a;

    /* renamed from: b, reason: collision with root package name */
    public String f44313b;

    /* renamed from: c, reason: collision with root package name */
    public mv f44314c;

    /* renamed from: d, reason: collision with root package name */
    public Date f44315d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f44316e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f44317f;

    public /* synthetic */ ze(int i13) {
        this();
    }

    public /* synthetic */ ze(cf cfVar, int i13) {
        this(cfVar);
    }

    private ze() {
        this.f44317f = new boolean[5];
    }

    private ze(@NonNull cf cfVar) {
        String str;
        String str2;
        mv mvVar;
        Date date;
        Integer num;
        str = cfVar.f36402a;
        this.f44312a = str;
        str2 = cfVar.f36403b;
        this.f44313b = str2;
        mvVar = cfVar.f36404c;
        this.f44314c = mvVar;
        date = cfVar.f36405d;
        this.f44315d = date;
        num = cfVar.f36406e;
        this.f44316e = num;
        boolean[] zArr = cfVar.f36407f;
        this.f44317f = Arrays.copyOf(zArr, zArr.length);
    }
}
