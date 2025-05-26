package ads_mobile_sdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class my1 {

    /* renamed from: b, reason: collision with root package name */
    public static final jl f8429b = jl.a(new byte[0], 0);

    /* renamed from: a, reason: collision with root package name */
    public final Map f8430a;

    public my1(HashMap hashMap) {
        this.f8430a = hashMap;
    }

    public final Iterable a(byte[] bArr) {
        List list = (List) this.f8430a.get(f8429b);
        List list2 = bArr.length >= 5 ? (List) this.f8430a.get(jl.a(bArr, 5)) : null;
        return (list == null && list2 == null) ? new ArrayList() : list == null ? list2 : list2 == null ? list : new ky1(list2, list);
    }
}
