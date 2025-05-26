package wc;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final m f129080a;

    /* renamed from: b, reason: collision with root package name */
    public final long f129081b;

    /* renamed from: c, reason: collision with root package name */
    public final long f129082c;

    /* renamed from: d, reason: collision with root package name */
    public final int f129083d;

    public f(m record, long j13) {
        Intrinsics.checkNotNullParameter(record, "record");
        this.f129080a = record;
        this.f129081b = j13;
        int i13 = cd.b.f27547a;
        this.f129082c = System.currentTimeMillis();
        Map map = record.f129096d;
        int size = map != null ? map.size() * 8 : 0;
        Intrinsics.checkNotNullParameter(record, "record");
        int length = l0.J(record.f129093a).length + 16;
        for (Map.Entry entry : record.f129094b.entrySet()) {
            String str = (String) entry.getKey();
            length += com.bumptech.glide.d.C0(entry.getValue()) + l0.J(str).length;
        }
        this.f129083d = length + size + 8;
    }
}
