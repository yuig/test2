package com.pinterest.api.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class or0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f40785a;

    /* renamed from: b, reason: collision with root package name */
    public final List f40786b;

    public or0(String str, List<Integer> list) {
        this.f40785a = str;
        this.f40786b = list;
    }

    public final String a() {
        return this.f40785a;
    }

    public final List b() {
        return this.f40786b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or0)) {
            return false;
        }
        or0 or0Var = (or0) obj;
        return Intrinsics.d(this.f40785a, or0Var.f40785a) && Intrinsics.d(this.f40786b, or0Var.f40786b);
    }

    public final int hashCode() {
        String str = this.f40785a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f40786b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SurveyConditionData(operator=");
        sb3.append(this.f40785a);
        sb3.append(", values=");
        return a.c.j(sb3, this.f40786b, ")");
    }
}
