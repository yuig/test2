package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class hm {

    /* renamed from: a, reason: collision with root package name */
    public List f38485a;

    /* renamed from: b, reason: collision with root package name */
    public String f38486b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f38487c;

    public /* synthetic */ hm(int i13) {
        this();
    }

    private hm() {
        this.f38487c = new boolean[2];
    }

    private hm(@NonNull jm jmVar) {
        List list;
        String str;
        list = jmVar.f39096a;
        this.f38485a = list;
        str = jmVar.f39097b;
        this.f38486b = str;
        boolean[] zArr = jmVar.f39098c;
        this.f38487c = Arrays.copyOf(zArr, zArr.length);
    }
}
