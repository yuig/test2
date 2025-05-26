package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class vw {

    /* renamed from: a, reason: collision with root package name */
    public String f43009a;

    /* renamed from: b, reason: collision with root package name */
    public String f43010b;

    /* renamed from: c, reason: collision with root package name */
    public cx f43011c;

    /* renamed from: d, reason: collision with root package name */
    public cx f43012d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f43013e;

    public /* synthetic */ vw(int i13) {
        this();
    }

    private vw() {
        this.f43013e = new boolean[4];
    }

    private vw(@NonNull yw ywVar) {
        String str;
        String str2;
        cx cxVar;
        cx cxVar2;
        str = ywVar.f44134a;
        this.f43009a = str;
        str2 = ywVar.f44135b;
        this.f43010b = str2;
        cxVar = ywVar.f44136c;
        this.f43011c = cxVar;
        cxVar2 = ywVar.f44137d;
        this.f43012d = cxVar2;
        boolean[] zArr = ywVar.f44138e;
        this.f43013e = Arrays.copyOf(zArr, zArr.length);
    }
}
