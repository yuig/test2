package l9;

import java.util.List;
import pk.c1;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c1 f82294a;

    /* renamed from: b, reason: collision with root package name */
    public final long f82295b;

    /* renamed from: c, reason: collision with root package name */
    public final long f82296c;

    /* renamed from: d, reason: collision with root package name */
    public final long f82297d;

    public a(long j13, long j14, List list) {
        this.f82294a = c1.r(list);
        this.f82295b = j13;
        this.f82296c = j14;
        long j15 = -9223372036854775807L;
        if (j13 != -9223372036854775807L && j14 != -9223372036854775807L) {
            j15 = j13 + j14;
        }
        this.f82297d = j15;
    }
}
