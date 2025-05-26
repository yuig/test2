package et1;

import com.pinterest.mediaPipeline.PipelineException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u0 implements d {

    /* renamed from: a, reason: collision with root package name */
    public final f f60103a;

    /* renamed from: b, reason: collision with root package name */
    public final t.a f60104b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f60105c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f60106d;

    /* renamed from: e, reason: collision with root package name */
    public v0 f60107e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f60108f;

    public u0(f fVar, t.a componentFactory) {
        Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
        this.f60103a = fVar;
        this.f60104b = componentFactory;
        this.f60105c = new LinkedHashMap();
        this.f60106d = new LinkedHashMap();
        componentFactory.getClass();
        Intrinsics.checkNotNullParameter(this, "pipeline");
        this.f60107e = new v0(this);
    }

    public final void a(mt1.a consumer, mt1.d producer) {
        Object obj;
        Intrinsics.checkNotNullParameter(producer, "producer");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        LinkedHashMap linkedHashMap = this.f60105c;
        Object obj2 = linkedHashMap.get(producer);
        if (obj2 == null) {
            f(producer, false);
            Object obj3 = linkedHashMap.get(producer);
            Intrinsics.f(obj3);
            obj2 = (q0) obj3;
            linkedHashMap.put(producer, obj2);
        }
        q0 q0Var = (q0) obj2;
        LinkedHashMap linkedHashMap2 = this.f60106d;
        Object obj4 = linkedHashMap2.get(consumer);
        if (obj4 == null) {
            obj4 = new p0();
            linkedHashMap2.put(consumer, obj4);
        }
        p0 p0Var = (p0) obj4;
        p0Var.f60068a = false;
        LinkedHashMap linkedHashMap3 = q0Var.f60082c;
        if (linkedHashMap3.containsKey(consumer)) {
            return;
        }
        linkedHashMap3.put(consumer, new o0());
        p0Var.f60069b.add(producer);
        if (!q0Var.f60080a || this.f60108f || (obj = q0Var.f60081b) == null) {
            return;
        }
        if (obj instanceof a) {
            consumer.a(((a) obj).a());
        } else {
            consumer.a(obj);
        }
    }

    public final void b(mt1.a consumer, mt1.d producer) {
        o0 o0Var;
        Intrinsics.checkNotNullParameter(producer, "producer");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        q0 q0Var = (q0) this.f60105c.get(producer);
        if (q0Var == null || (o0Var = (o0) q0Var.f60082c.get(consumer)) == null) {
            return;
        }
        o0Var.f60065a = true;
        d(consumer);
    }

    public final void c(Object node) {
        String str;
        LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(node, "node");
        boolean z13 = node instanceof mt1.a;
        LinkedHashMap linkedHashMap2 = this.f60105c;
        LinkedHashMap linkedHashMap3 = this.f60106d;
        int i13 = 0;
        if (z13) {
            mt1.a aVar = (mt1.a) node;
            p0 p0Var = (p0) linkedHashMap3.get(aVar);
            if (p0Var != null) {
                for (mt1.d dVar : p0Var.f60069b) {
                    b(aVar, dVar);
                    q0 q0Var = (q0) linkedHashMap2.get(dVar);
                    if (q0Var != null) {
                        nt1.h.a(new p91.v(29, q0Var, aVar));
                    } else if (this.f60103a != null) {
                        new PipelineException("Warning: producer is not connected to consumer, but consumer has a back-reference", kotlin.collections.f0.j(new Pair("Producer", dVar), new Pair("Consumer", aVar)), null, null, this, 12);
                        Intrinsics.checkNotNullParameter(this, "pipeline");
                    }
                }
                nt1.h.a(new r0(i13, this, aVar));
                d(aVar);
            }
        }
        if (node instanceof mt1.d) {
            mt1.d dVar2 = (mt1.d) node;
            q0 q0Var2 = (q0) linkedHashMap2.get(dVar2);
            int i14 = 1;
            if (q0Var2 != null && (linkedHashMap = q0Var2.f60082c) != null) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    mt1.a aVar2 = (mt1.a) ((Map.Entry) it.next()).getKey();
                    p0 p0Var2 = (p0) linkedHashMap3.get(aVar2);
                    if (p0Var2 != null) {
                        b(aVar2, dVar2);
                        nt1.h.a(new r0(i14, p0Var2, dVar2));
                        d(aVar2);
                    }
                }
            }
            nt1.h.a(new r0(2, this, dVar2));
            try {
                dVar2.c(s0.f60093j);
                dVar2.d(i.f60026k);
            } catch (PipelineException e13) {
                throw e13;
            } catch (Throwable th3) {
                StackTraceElement[] stackTrace = th3.getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
                StackTraceElement stackTraceElement = (stackTrace.length == 0) ^ true ? th3.getStackTrace()[0] : null;
                if (stackTraceElement == null || (str = Integer.valueOf(stackTraceElement.getLineNumber()).toString()) == null) {
                    str = "NO STACK TRACE AVAILABLE";
                }
                String d2 = this.f60107e.d(dVar2);
                if (d2 == null) {
                    d2 = "<PRODUCER NOT IN A COMPONENT>";
                }
                Class<?> cls = th3.getClass();
                StringBuilder sb3 = new StringBuilder("Failed setting producer callbacks to empty lambdas: Exception [");
                sb3.append(cls);
                sb3.append("] Node [");
                sb3.append(d2);
                sb3.append("] At line [");
                String p13 = a.a.p(sb3, str, "]");
                String message = th3.getMessage();
                if (message != null) {
                    p13 = ((Object) p13) + " Error Message [" + message + "]";
                }
                throw new PipelineException(p13, kotlin.collections.e0.b(new Pair("Producer", dVar2)), th3, null, this, 8);
            }
        }
    }

    public final void d(mt1.a aVar) {
        String str;
        LinkedHashSet linkedHashSet;
        o0 o0Var;
        LinkedHashMap linkedHashMap = this.f60106d;
        p0 p0Var = (p0) linkedHashMap.get(aVar);
        if (p0Var == null) {
            return;
        }
        p0 p0Var2 = (p0) linkedHashMap.get(aVar);
        if (p0Var2 != null && (linkedHashSet = p0Var2.f60069b) != null && !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                q0 q0Var = (q0) this.f60105c.get((mt1.d) it.next());
                if (q0Var != null && (o0Var = (o0) q0Var.f60082c.get(aVar)) != null && !o0Var.f60065a) {
                    return;
                }
            }
        }
        if (p0Var.f60068a) {
            return;
        }
        try {
            p0Var.f60068a = true;
            aVar.g();
        } catch (PipelineException e13) {
            throw e13;
        } catch (Throwable th3) {
            StackTraceElement[] stackTrace = th3.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            StackTraceElement stackTraceElement = true ^ (stackTrace.length == 0) ? th3.getStackTrace()[0] : null;
            if (stackTraceElement == null || (str = Integer.valueOf(stackTraceElement.getLineNumber()).toString()) == null) {
                str = "NO STACK TRACE AVAILABLE";
            }
            String d2 = this.f60107e.d(aVar);
            if (d2 == null) {
                d2 = "<CONSUMER NOT IN A COMPONENT>";
            }
            Class<?> cls = th3.getClass();
            StringBuilder sb3 = new StringBuilder("Failed sending end-of-input to consumer: Exception [");
            sb3.append(cls);
            sb3.append("] Node [");
            sb3.append(d2);
            sb3.append("] At line [");
            String p13 = a.a.p(sb3, str, "]");
            String message = th3.getMessage();
            if (message != null) {
                p13 = ((Object) p13) + " Error Message [" + message + "]";
            }
            throw new PipelineException(p13, kotlin.collections.e0.b(new Pair("From", aVar)), th3, null, this, 8);
        }
    }

    public final void e(mt1.d producer) {
        Intrinsics.checkNotNullParameter(producer, "producer");
        LinkedHashMap linkedHashMap = this.f60105c;
        Object obj = linkedHashMap.get(producer);
        if (obj == null) {
            f(producer, true);
            Object obj2 = linkedHashMap.get(producer);
            Intrinsics.f(obj2);
            obj = (q0) obj2;
            linkedHashMap.put(producer, obj);
        }
    }

    public final void f(mt1.d dVar, boolean z13) {
        q0 q0Var = new q0();
        q0Var.f60080a = z13;
        this.f60105c.put(dVar, q0Var);
        LinkedHashMap linkedHashMap = q0Var.f60082c;
        dVar.c(new t0(this, q0Var, linkedHashMap, dVar, 0));
        dVar.d(new j1.v0(q0Var, linkedHashMap, dVar, this, 17));
    }
}
