package y52;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f137860a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f137861b;

    /* renamed from: c, reason: collision with root package name */
    public final d f137862c;

    /* renamed from: d, reason: collision with root package name */
    public final String f137863d;

    public w(h32.i0 context, HashMap auxData, d params, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f137860a = context;
        this.f137861b = auxData;
        this.f137862c = params;
        this.f137863d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.f137860a, wVar.f137860a) && Intrinsics.d(this.f137861b, wVar.f137861b) && Intrinsics.d(this.f137862c, wVar.f137862c) && Intrinsics.d(this.f137863d, wVar.f137863d);
    }

    @Override // y52.a0
    public final HashMap getAuxData() {
        return this.f137861b;
    }

    @Override // y52.a0
    public final h32.i0 getContext() {
        return this.f137860a;
    }

    public final int hashCode() {
        int hashCode = (this.f137862c.hashCode() + a.c.d(this.f137861b, this.f137860a.hashCode() * 31, 31)) * 31;
        String str = this.f137863d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "LogShareSuccess(context=" + this.f137860a + ", auxData=" + this.f137861b + ", params=" + this.f137862c + ", inviteCode=" + this.f137863d + ")";
    }
}
