package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ml {

    /* renamed from: a, reason: collision with root package name */
    public String f40157a;

    /* renamed from: b, reason: collision with root package name */
    public String f40158b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f40159c;

    public /* synthetic */ ml(int i13) {
        this();
    }

    private ml() {
        this.f40159c = new boolean[2];
    }

    private ml(@NonNull pl plVar) {
        String str;
        String str2;
        str = plVar.f41016a;
        this.f40157a = str;
        str2 = plVar.f41017b;
        this.f40158b = str2;
        boolean[] zArr = plVar.f41018c;
        this.f40159c = Arrays.copyOf(zArr, zArr.length);
    }
}
