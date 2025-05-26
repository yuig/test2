package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public class jm implements gp0.a {

    /* renamed from: a, reason: collision with root package name */
    @om.b("content")
    private List<String> f39096a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("type")
    private String f39097b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f39098c;

    public /* synthetic */ jm(List list, String str, boolean[] zArr, int i13) {
        this(list, str, zArr);
    }

    public final List c() {
        return this.f39096a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jm jmVar = (jm) obj;
        return Objects.equals(this.f39096a, jmVar.f39096a) && Objects.equals(this.f39097b, jmVar.f39097b);
    }

    public final int hashCode() {
        return Objects.hash(this.f39096a, this.f39097b);
    }

    public jm() {
        this.f39098c = new boolean[2];
    }

    private jm(List<String> list, String str, boolean[] zArr) {
        this.f39096a = list;
        this.f39097b = str;
        this.f39098c = zArr;
    }
}
