package com.pinterest.boardAutoCollages;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements v {

    /* renamed from: a, reason: collision with root package name */
    public final String f44596a;

    /* renamed from: b, reason: collision with root package name */
    public final String f44597b;

    public t(String str, String str2) {
        this.f44596a = str;
        this.f44597b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f44596a, tVar.f44596a) && Intrinsics.d(this.f44597b, tVar.f44597b);
    }

    public final int hashCode() {
        String str = this.f44596a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f44597b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CollageComposer(draftId=");
        sb3.append(this.f44596a);
        sb3.append(", boardId=");
        return a.a.p(sb3, this.f44597b, ")");
    }
}
