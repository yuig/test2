package so2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class q extends c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f114807f;

    /* renamed from: g, reason: collision with root package name */
    public Object f114808g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ro2.c json, Function1 nodeConsumer, int i13) {
        super(json, nodeConsumer);
        this.f114807f = i13;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
            super(json, nodeConsumer);
            this.f114808g = new LinkedHashMap();
            return;
        }
        if (i13 != 2) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
            this.f104620a.add("primitive");
            return;
        }
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        super(json, nodeConsumer);
        this.f114808g = new ArrayList();
    }

    @Override // po2.b
    public final void A(oo2.g descriptor, int i13, no2.b serializer, Object obj) {
        int i14 = this.f114807f;
        ArrayList arrayList = this.f104620a;
        switch (i14) {
            case 1:
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                Intrinsics.checkNotNullParameter(serializer, "serializer");
                if (obj != null || this.f114763d.f109017f) {
                    Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                    Intrinsics.checkNotNullParameter(serializer, "serializer");
                    arrayList.add(J(descriptor, i13));
                    e0.t.p(this, serializer, obj);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                Intrinsics.checkNotNullParameter(serializer, "serializer");
                arrayList.add(J(descriptor, i13));
                e0.t.p(this, serializer, obj);
                break;
        }
    }

    @Override // so2.c
    public ro2.n L() {
        switch (this.f114807f) {
            case 0:
                ro2.n nVar = (ro2.n) this.f114808g;
                if (nVar != null) {
                    return nVar;
                }
                throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?".toString());
            case 1:
                return new ro2.c0((Map) this.f114808g);
            default:
                return new ro2.e((ArrayList) this.f114808g);
        }
    }

    @Override // so2.c
    public void M(String key, ro2.n element) {
        switch (this.f114807f) {
            case 0:
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(element, "element");
                if (key != "primitive") {
                    throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag".toString());
                }
                if (((ro2.n) this.f114808g) != null) {
                    throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?".toString());
                }
                this.f114808g = element;
                this.f114762c.invoke(element);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(element, "element");
                ((Map) this.f114808g).put(key, element);
                return;
            default:
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(element, "element");
                ((ArrayList) this.f114808g).add(Integer.parseInt(key), element);
                return;
        }
    }
}
