package nk1;

import h32.i0;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public d0 f91127a;

    /* renamed from: b, reason: collision with root package name */
    public i0 f91128b;

    /* renamed from: c, reason: collision with root package name */
    public String f91129c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f91130d;

    /* renamed from: e, reason: collision with root package name */
    public String f91131e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f91132f;

    /* renamed from: g, reason: collision with root package name */
    public final Function0 f91133g;

    public g(d0 d0Var, i0 i0Var, String str, HashMap hashMap, String str2, Function0 idProvider, Function0 auxDataProvider) {
        Intrinsics.checkNotNullParameter(idProvider, "idProvider");
        Intrinsics.checkNotNullParameter(auxDataProvider, "auxDataProvider");
        this.f91127a = d0Var;
        this.f91128b = i0Var;
        this.f91129c = str;
        this.f91130d = hashMap;
        this.f91131e = str2;
        this.f91132f = idProvider;
        this.f91133g = auxDataProvider;
    }

    public static g a(g gVar, String str) {
        d0 d0Var = gVar.f91127a;
        i0 i0Var = gVar.f91128b;
        HashMap hashMap = gVar.f91130d;
        String str2 = gVar.f91131e;
        Function0 idProvider = gVar.f91132f;
        Function0 auxDataProvider = gVar.f91133g;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(idProvider, "idProvider");
        Intrinsics.checkNotNullParameter(auxDataProvider, "auxDataProvider");
        return new g(d0Var, i0Var, str, hashMap, str2, idProvider, auxDataProvider);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f91127a, gVar.f91127a) && Intrinsics.d(this.f91128b, gVar.f91128b) && Intrinsics.d(this.f91129c, gVar.f91129c) && Intrinsics.d(this.f91130d, gVar.f91130d) && Intrinsics.d(this.f91131e, gVar.f91131e) && Intrinsics.d(this.f91132f, gVar.f91132f) && Intrinsics.d(this.f91133g, gVar.f91133g);
    }

    public final int hashCode() {
        d0 d0Var = this.f91127a;
        int hashCode = (d0Var == null ? 0 : d0Var.hashCode()) * 31;
        i0 i0Var = this.f91128b;
        int hashCode2 = (hashCode + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        String str = this.f91129c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        HashMap hashMap = this.f91130d;
        int hashCode4 = (hashCode3 + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        String str2 = this.f91131e;
        return this.f91133g.hashCode() + d7.g.b(this.f91132f, (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        d0 d0Var = this.f91127a;
        i0 i0Var = this.f91128b;
        String str = this.f91129c;
        HashMap hashMap = this.f91130d;
        String str2 = this.f91131e;
        StringBuilder sb3 = new StringBuilder("FollowActionLoggingContext(pinalytics=");
        sb3.append(d0Var);
        sb3.append(", pinalyticsContext=");
        sb3.append(i0Var);
        sb3.append(", id=");
        sb3.append(str);
        sb3.append(", auxData=");
        sb3.append(hashMap);
        sb3.append(", clientTrackingParams=");
        sb3.append(str2);
        sb3.append(", idProvider=");
        sb3.append(this.f91132f);
        sb3.append(", auxDataProvider=");
        return pk2.f.i(sb3, this.f91133g, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ g(nx.d0 r11, h32.i0 r12, java.lang.String r13, java.util.HashMap r14, kotlin.jvm.functions.Function0 r15, int r16) {
        /*
            r10 = this;
            r0 = r16 & 1
            r1 = 0
            if (r0 == 0) goto L7
            r3 = r1
            goto L8
        L7:
            r3 = r11
        L8:
            r0 = r16 & 2
            if (r0 == 0) goto Le
            r4 = r1
            goto Lf
        Le:
            r4 = r12
        Lf:
            r0 = r16 & 4
            if (r0 == 0) goto L15
            r5 = r1
            goto L16
        L15:
            r5 = r13
        L16:
            r0 = r16 & 8
            if (r0 == 0) goto L1c
            r6 = r1
            goto L1d
        L1c:
            r6 = r14
        L1d:
            s60.a r8 = new s60.a
            r0 = 1
            r8.<init>(r5, r0)
            r1 = r16 & 64
            if (r1 == 0) goto L2e
            s60.b r1 = new s60.b
            r1.<init>(r0, r6)
            r9 = r1
            goto L2f
        L2e:
            r9 = r15
        L2f:
            r7 = 0
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nk1.g.<init>(nx.d0, h32.i0, java.lang.String, java.util.HashMap, kotlin.jvm.functions.Function0, int):void");
    }
}
