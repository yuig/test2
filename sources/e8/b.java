package e8;

import android.net.Uri;
import java.util.List;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f57701a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57702b;

    /* renamed from: c, reason: collision with root package name */
    public final long f57703c;

    /* renamed from: d, reason: collision with root package name */
    public final String f57704d;

    /* renamed from: e, reason: collision with root package name */
    public final int f57705e;

    /* renamed from: f, reason: collision with root package name */
    public final int f57706f;

    /* renamed from: g, reason: collision with root package name */
    public final int f57707g;

    /* renamed from: h, reason: collision with root package name */
    public final int f57708h;

    /* renamed from: i, reason: collision with root package name */
    public final String f57709i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.media3.common.b[] f57710j;

    /* renamed from: k, reason: collision with root package name */
    public final int f57711k;

    /* renamed from: l, reason: collision with root package name */
    public final String f57712l;

    /* renamed from: m, reason: collision with root package name */
    public final String f57713m;

    /* renamed from: n, reason: collision with root package name */
    public final List f57714n;

    /* renamed from: o, reason: collision with root package name */
    public final long[] f57715o;

    /* renamed from: p, reason: collision with root package name */
    public final long f57716p;

    public b(String str, String str2, int i13, String str3, long j13, String str4, int i14, int i15, int i16, int i17, String str5, androidx.media3.common.b[] bVarArr, List list, long[] jArr, long j14) {
        this.f57712l = str;
        this.f57713m = str2;
        this.f57701a = i13;
        this.f57702b = str3;
        this.f57703c = j13;
        this.f57704d = str4;
        this.f57705e = i14;
        this.f57706f = i15;
        this.f57707g = i16;
        this.f57708h = i17;
        this.f57709i = str5;
        this.f57710j = bVarArr;
        this.f57714n = list;
        this.f57715o = jArr;
        this.f57716p = j14;
        this.f57711k = list.size();
    }

    public final Uri a(int i13, int i14) {
        androidx.media3.common.b[] bVarArr = this.f57710j;
        bf.b.t(bVarArr != null);
        List list = this.f57714n;
        bf.b.t(list != null);
        bf.b.t(i14 < list.size());
        String num = Integer.toString(bVarArr[i13].f18760j);
        String l13 = ((Long) list.get(i14)).toString();
        return b7.c.O(this.f57712l, this.f57713m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l13).replace("{start_time}", l13));
    }

    public final b b(androidx.media3.common.b[] bVarArr) {
        return new b(this.f57712l, this.f57713m, this.f57701a, this.f57702b, this.f57703c, this.f57704d, this.f57705e, this.f57706f, this.f57707g, this.f57708h, this.f57709i, bVarArr, this.f57714n, this.f57715o, this.f57716p);
    }

    public final long c(int i13) {
        if (i13 == this.f57711k - 1) {
            return this.f57716p;
        }
        long[] jArr = this.f57715o;
        return jArr[i13 + 1] - jArr[i13];
    }
}
