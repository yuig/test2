package s60;

import d7.g;
import h32.i0;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f111218a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f111219b;

    /* renamed from: c, reason: collision with root package name */
    public final String f111220c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f111221d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f111222e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f111223f;

    public c(d0 d0Var, i0 i0Var, String str) {
        this(d0Var, i0Var, str, 56);
    }

    public static c a(c cVar, String str) {
        d0 d0Var = cVar.f111218a;
        i0 i0Var = cVar.f111219b;
        HashMap hashMap = cVar.f111221d;
        Function0 idProvider = cVar.f111222e;
        Function0 auxDataProvider = cVar.f111223f;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(idProvider, "idProvider");
        Intrinsics.checkNotNullParameter(auxDataProvider, "auxDataProvider");
        return new c(d0Var, i0Var, str, hashMap, idProvider, auxDataProvider);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f111218a, cVar.f111218a) && Intrinsics.d(this.f111219b, cVar.f111219b) && Intrinsics.d(this.f111220c, cVar.f111220c) && Intrinsics.d(this.f111221d, cVar.f111221d) && Intrinsics.d(this.f111222e, cVar.f111222e) && Intrinsics.d(this.f111223f, cVar.f111223f);
    }

    public final int hashCode() {
        d0 d0Var = this.f111218a;
        int hashCode = (d0Var == null ? 0 : d0Var.hashCode()) * 31;
        i0 i0Var = this.f111219b;
        int hashCode2 = (hashCode + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        String str = this.f111220c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        HashMap hashMap = this.f111221d;
        return this.f111223f.hashCode() + g.b(this.f111222e, (hashCode3 + (hashMap != null ? hashMap.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "BlockActionLoggingContext(pinalytics=" + this.f111218a + ", pinalyticsContext=" + this.f111219b + ", id=" + this.f111220c + ", auxData=" + this.f111221d + ", idProvider=" + this.f111222e + ", auxDataProvider=" + this.f111223f + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ c(nx.d0 r10, h32.i0 r11, java.lang.String r12, int r13) {
        /*
            r9 = this;
            r0 = r13 & 1
            r1 = 0
            if (r0 == 0) goto L7
            r3 = r1
            goto L8
        L7:
            r3 = r10
        L8:
            r10 = r13 & 2
            if (r10 == 0) goto Le
            r4 = r1
            goto Lf
        Le:
            r4 = r11
        Lf:
            r10 = r13 & 4
            if (r10 == 0) goto L15
            r5 = r1
            goto L16
        L15:
            r5 = r12
        L16:
            s60.a r7 = new s60.a
            r10 = 0
            r7.<init>(r5, r10)
            s60.b r8 = new s60.b
            r6 = 0
            r8.<init>(r10, r6)
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s60.c.<init>(nx.d0, h32.i0, java.lang.String, int):void");
    }

    public c(d0 d0Var, i0 i0Var, String str, HashMap hashMap, Function0 idProvider, Function0 auxDataProvider) {
        Intrinsics.checkNotNullParameter(idProvider, "idProvider");
        Intrinsics.checkNotNullParameter(auxDataProvider, "auxDataProvider");
        this.f111218a = d0Var;
        this.f111219b = i0Var;
        this.f111220c = str;
        this.f111221d = hashMap;
        this.f111222e = idProvider;
        this.f111223f = auxDataProvider;
    }
}
