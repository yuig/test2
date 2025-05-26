package dg2;

import ei2.v;
import java.util.LinkedHashMap;
import java.util.Map;
import kg.p;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import xf2.r0;
import xf2.u;

/* loaded from: classes4.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f54952i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f54953j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f54954k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Map f54955l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f54956m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f54957n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, long j13, long j14, Map map, int i13, String str2) {
        super(1);
        this.f54952i = str;
        this.f54953j = str2;
        this.f54954k = i13;
        this.f54955l = map;
        this.f54956m = j13;
        this.f54957n = j14;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        v captureSpanData = (v) obj;
        Intrinsics.checkNotNullParameter(captureSpanData, "$this$captureSpanData");
        String name = this.f54952i;
        if (name == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String outcome = this.f54953j;
        if (outcome == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        Map properties = this.f54955l;
        Intrinsics.checkNotNullParameter(properties, "properties");
        u uVar = u.f134899e;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r0 r0Var = uVar.f134903d;
        if (r0Var != r0.DEFAULT) {
            linkedHashMap.put(sh2.h.f112969r.f134855a, r0Var.name());
        }
        Map g13 = z0.g(new Pair("name", name), new Pair("outcome", outcome), new Pair("payload_size", String.valueOf(this.f54954k)));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(y0.a(properties.size()));
        for (Map.Entry entry : properties.entrySet()) {
            linkedHashMap2.put(ig1.b.m1(String.valueOf(entry.getKey())), entry.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(y0.a(linkedHashMap2.size()));
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry2.getKey(), String.valueOf(entry2.getValue()));
        }
        p.U(captureSpanData, "rn-action", this.f54956m, this.f54957n, null, uVar, false, z0.j(p.e0(z0.j(g13, linkedHashMap3)), linkedHashMap), null, null, 1752);
        return Unit.f80348a;
    }
}
