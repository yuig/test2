package com.pinterest.framework.multisection.datasource.pagedlist;

import android.os.Bundle;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends v implements wt1.c {

    /* renamed from: k, reason: collision with root package name */
    public final x f49099k;

    /* renamed from: l, reason: collision with root package name */
    public final w f49100l;

    /* renamed from: m, reason: collision with root package name */
    public final d f49101m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(com.pinterest.framework.multisection.datasource.pagedlist.c r5, int r6) {
        /*
            r4 = this;
            r6 = r6 & 2
            r0 = 0
            if (r6 == 0) goto L7
            r6 = 1
            goto L8
        L7:
            r6 = r0
        L8:
            com.pinterest.framework.multisection.datasource.pagedlist.d r1 = new com.pinterest.framework.multisection.datasource.pagedlist.d
            r1.<init>()
            java.lang.String r2 = "pagedList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            java.lang.String r3 = "headerFooterSpacing"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            r4.<init>(r5, r6, r0)
            r4.f49099k = r5
            r4.f49100l = r5
            r4.f49101m = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.framework.multisection.datasource.pagedlist.f.<init>(com.pinterest.framework.multisection.datasource.pagedlist.c, int):void");
    }

    @Override // wt1.c
    public final void b(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f49099k.b(bundle);
    }

    @Override // nr0.g
    public final boolean c3(int i13) {
        return this.f49100l.q(getItemViewType(i13));
    }

    @Override // nr0.g
    public final boolean e(int i13) {
        return r(this.f49101m.f49093d, new e(this.f49100l, 0), i13);
    }

    @Override // nr0.g
    public final boolean f(int i13) {
        if (this.f49193d.contains(Integer.valueOf(i13)) || this.f49194e.contains(Integer.valueOf(i13))) {
            return true;
        }
        return this.f49100l.f(i13);
    }

    @Override // nr0.g
    public final boolean f3(int i13) {
        return r(this.f49101m.f49092c, new e(this.f49100l, 2), i13);
    }

    @Override // nr0.g
    public final boolean h(int i13) {
        return r(this.f49101m.f49091b, new e(this.f49100l, 3), i13);
    }

    @Override // nr0.g
    public final boolean k2(int i13) {
        return r(this.f49101m.f49090a, new e(this.f49100l, 1), i13);
    }

    @Override // wt1.c
    public final void l(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f49099k.l(bundle);
    }

    @Override // nr0.g
    public final boolean n0(int i13) {
        return f(getItemViewType(i13));
    }

    @Override // nr0.g
    public final boolean q(int i13) {
        return this.f49100l.q(i13);
    }

    public final boolean r(boolean z13, e eVar, int i13) {
        int itemViewType = getItemViewType(i13);
        ArrayList arrayList = this.f49193d;
        if (arrayList.contains(Integer.valueOf(itemViewType)) || this.f49194e.contains(Integer.valueOf(itemViewType))) {
            return z13;
        }
        return ((Boolean) eVar.invoke(Integer.valueOf(i13 - (this.f49196g ? arrayList.size() : 0)))).booleanValue();
    }
}
