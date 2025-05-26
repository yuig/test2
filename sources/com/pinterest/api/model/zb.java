package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class zb {

    /* renamed from: a, reason: collision with root package name */
    public List f44270a;

    /* renamed from: b, reason: collision with root package name */
    public String f44271b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f44272c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f44273d;

    public /* synthetic */ zb(int i13) {
        this();
    }

    public final cc a() {
        return new cc(this.f44270a, this.f44271b, this.f44272c, this.f44273d, 0);
    }

    public /* synthetic */ zb(cc ccVar, int i13) {
        this(ccVar);
    }

    private zb() {
        this.f44273d = new boolean[3];
    }

    private zb(@NonNull cc ccVar) {
        List list;
        String str;
        Integer num;
        list = ccVar.f36356a;
        this.f44270a = list;
        str = ccVar.f36357b;
        this.f44271b = str;
        num = ccVar.f36358c;
        this.f44272c = num;
        boolean[] zArr = ccVar.f36359d;
        this.f44273d = Arrays.copyOf(zArr, zArr.length);
    }
}
