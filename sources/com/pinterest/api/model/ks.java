package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class ks {

    /* renamed from: a, reason: collision with root package name */
    public String f39521a;

    /* renamed from: b, reason: collision with root package name */
    public List f39522b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f39523c;

    public /* synthetic */ ks(int i13) {
        this();
    }

    private ks() {
        this.f39523c = new boolean[2];
    }

    private ks(@NonNull ns nsVar) {
        String str;
        List list;
        str = nsVar.f40472a;
        this.f39521a = str;
        list = nsVar.f40473b;
        this.f39522b = list;
        boolean[] zArr = nsVar.f40474c;
        this.f39523c = Arrays.copyOf(zArr, zArr.length);
    }
}
