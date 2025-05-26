package com.pinterest.boardAutoCollages;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    public final String f44562a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f44563b;

    /* renamed from: c, reason: collision with root package name */
    public final String f44564c;

    public h(String draftId, String str, Integer num) {
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        this.f44562a = draftId;
        this.f44563b = num;
        this.f44564c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f44562a, hVar.f44562a) && Intrinsics.d(this.f44563b, hVar.f44563b) && Intrinsics.d(this.f44564c, hVar.f44564c);
    }

    public final int hashCode() {
        int hashCode = this.f44562a.hashCode() * 31;
        Integer num = this.f44563b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f44564c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DraftSelected(draftId=");
        sb3.append(this.f44562a);
        sb3.append(", position=");
        sb3.append(this.f44563b);
        sb3.append(", boardId=");
        return a.a.p(sb3, this.f44564c, ")");
    }
}
