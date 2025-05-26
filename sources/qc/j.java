package qc;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import wo2.k;
import wo2.m;
import xk2.v;

/* loaded from: classes3.dex */
public final class j implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Map f103437a;

    /* renamed from: b, reason: collision with root package name */
    public final m f103438b;

    /* renamed from: c, reason: collision with root package name */
    public final String f103439c;

    /* renamed from: d, reason: collision with root package name */
    public final String f103440d;

    /* renamed from: e, reason: collision with root package name */
    public final v f103441e;

    public j(LinkedHashMap uploads, m operationByteString) {
        Intrinsics.checkNotNullParameter(uploads, "uploads");
        Intrinsics.checkNotNullParameter(operationByteString, "operationByteString");
        this.f103437a = uploads;
        this.f103438b = operationByteString;
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
        String uuid = randomUUID.toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "uuid4().toString()");
        this.f103439c = uuid;
        this.f103440d = a.a.j("multipart/form-data; boundary=", uuid);
        this.f103441e = xk2.m.b(new db.m(this, 2));
    }

    @Override // qc.e
    public final long a() {
        return ((Number) this.f103441e.getValue()).longValue();
    }

    @Override // qc.e
    public final void b(k bufferedSink) {
        Intrinsics.checkNotNullParameter(bufferedSink, "bufferedSink");
        c(bufferedSink);
    }

    public final void c(k kVar) {
        StringBuilder sb3 = new StringBuilder("--");
        String str = this.f103439c;
        sb3.append(str);
        sb3.append("\r\n");
        kVar.l0(sb3.toString());
        kVar.l0("Content-Disposition: form-data; name=\"operations\"\r\n");
        kVar.l0("Content-Type: application/json\r\n");
        StringBuilder sb4 = new StringBuilder("Content-Length: ");
        m mVar = this.f103438b;
        sb4.append(mVar.b());
        sb4.append("\r\n");
        kVar.l0(sb4.toString());
        kVar.l0("\r\n");
        kVar.t1(mVar);
        wo2.j jVar = new wo2.j();
        tc.b bVar = new tc.b(jVar, null);
        Map map = this.f103437a;
        Set entrySet = map.entrySet();
        ArrayList arrayList = new ArrayList(g0.q(entrySet, 10));
        int i13 = 0;
        for (Object obj : entrySet) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            arrayList.add(new Pair(String.valueOf(i13), e0.b(((Map.Entry) obj).getKey())));
            i13 = i14;
        }
        bs1.c.z2(bVar, z0.m(arrayList));
        m a13 = jVar.a1(jVar.f130711b);
        kVar.l0("\r\n--" + str + "\r\n");
        kVar.l0("Content-Disposition: form-data; name=\"map\"\r\n");
        kVar.l0("Content-Type: application/json\r\n");
        kVar.l0("Content-Length: " + a13.b() + "\r\n");
        kVar.l0("\r\n");
        kVar.t1(a13);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            kVar.l0("\r\n--" + str + "--\r\n");
            return;
        }
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
        kVar.l0("\r\n--" + str + "\r\n");
        kVar.l0("Content-Disposition: form-data; name=\"0\"");
        throw null;
    }

    @Override // qc.e
    public final String getContentType() {
        return this.f103440d;
    }
}
