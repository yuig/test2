package com.pinterest.api.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class tr0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f42279a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42280b;

    public tr0(List<or0> list, String str) {
        this.f42279a = list;
        this.f42280b = str;
    }

    public final List a() {
        return this.f42279a;
    }

    public final String b() {
        return this.f42280b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr0)) {
            return false;
        }
        tr0 tr0Var = (tr0) obj;
        return Intrinsics.d(this.f42279a, tr0Var.f42279a) && Intrinsics.d(this.f42280b, tr0Var.f42280b);
    }

    public final int hashCode() {
        List list = this.f42279a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f42280b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "SurveyConditionalData(conditions=" + this.f42279a + ", goTo=" + this.f42280b + ")";
    }
}
