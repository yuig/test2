package nx;

import h32.v2;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final v2 f92481a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f92482b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f92483c;

    /* renamed from: d, reason: collision with root package name */
    public final h32.g0 f92484d;

    public y0(v2 impression, HashMap hashMap, HashMap hashMap2, h32.g0 g0Var) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        this.f92481a = impression;
        this.f92482b = hashMap;
        this.f92483c = hashMap2;
        this.f92484d = g0Var;
    }

    public final h32.g0 a() {
        return this.f92484d;
    }

    public final HashMap b() {
        return this.f92483c;
    }

    public final v2 c() {
        return this.f92481a;
    }

    public final HashMap d() {
        return this.f92482b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return Intrinsics.d(this.f92481a, y0Var.f92481a) && Intrinsics.d(this.f92482b, y0Var.f92482b) && Intrinsics.d(this.f92483c, y0Var.f92483c) && this.f92484d == y0Var.f92484d;
    }

    public final int hashCode() {
        int hashCode = this.f92481a.hashCode() * 31;
        HashMap hashMap = this.f92482b;
        int hashCode2 = (hashCode + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        HashMap hashMap2 = this.f92483c;
        int hashCode3 = (hashCode2 + (hashMap2 == null ? 0 : hashMap2.hashCode())) * 31;
        h32.g0 g0Var = this.f92484d;
        return hashCode3 + (g0Var != null ? g0Var.hashCode() : 0);
    }

    public final String toString() {
        return "StoryImpressionContextWrapper(impression=" + this.f92481a + ", storyAuxData=" + this.f92482b + ", extraAuxData=" + this.f92483c + ", componentType=" + this.f92484d + ")";
    }

    public /* synthetic */ y0(v2 v2Var, HashMap hashMap, HashMap hashMap2, h32.g0 g0Var, int i13) {
        this(v2Var, (i13 & 2) != 0 ? null : hashMap, (i13 & 4) != 0 ? null : hashMap2, (i13 & 8) != 0 ? null : g0Var);
    }
}
