package nh2;

import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import sh2.h;

/* loaded from: classes4.dex */
public final class b extends gb2.d {

    /* renamed from: b, reason: collision with root package name */
    public final String f90558b;

    /* renamed from: c, reason: collision with root package name */
    public final c f90559c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f90560d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String id3, String url, d counter) {
        super(id3);
        c cVar;
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(counter, "counter");
        this.f90558b = url;
        if (!((Boolean) counter.invoke()).booleanValue()) {
            cVar = c.OVER_MAX_ATTACHMENTS;
        } else if (url.length() == 0) {
            cVar = c.UNKNOWN;
        } else {
            try {
                UUID.fromString(id3);
                cVar = null;
            } catch (IllegalArgumentException unused) {
                cVar = c.UNKNOWN;
            }
        }
        this.f90559c = cVar;
        this.f90560d = z0.k(gb2.d.a(id3, cVar), new Pair(h.f112971t, this.f90558b));
    }

    @Override // gb2.d
    public final Map b() {
        return this.f90560d;
    }

    @Override // gb2.d
    public final c c() {
        return this.f90559c;
    }
}
