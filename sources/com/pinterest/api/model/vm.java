package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class vm {

    /* renamed from: a, reason: collision with root package name */
    public String f42923a;

    /* renamed from: b, reason: collision with root package name */
    public String f42924b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f42925c;

    public /* synthetic */ vm(int i13) {
        this();
    }

    private vm() {
        this.f42925c = new boolean[2];
    }

    private vm(@NonNull ym ymVar) {
        String str;
        String str2;
        str = ymVar.f44078a;
        this.f42923a = str;
        str2 = ymVar.f44079b;
        this.f42924b = str2;
        boolean[] zArr = ymVar.f44080c;
        this.f42925c = Arrays.copyOf(zArr, zArr.length);
    }
}
