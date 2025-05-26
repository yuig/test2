package cd2;

import ei2.q;
import ei2.v;
import io.embrace.android.embracesdk.Severity;
import java.util.List;
import kh2.n3;
import kh2.s0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s;
import qo2.j1;
import qo2.l1;
import qo2.w;
import qo2.y0;
import xf2.l0;
import xf2.p0;

/* loaded from: classes4.dex */
public final class n extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27567i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f27568j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, int i13) {
        super(1);
        this.f27567i = i13;
        this.f27568j = obj;
    }

    public final void b(v captureSpanData) {
        int i13 = this.f27567i;
        Object obj = this.f27568j;
        switch (i13) {
            case 7:
                Intrinsics.checkNotNullParameter(captureSpanData, "$this$captureSpanData");
                ((ei2.k) ((oi2.b) obj)).s(null, null);
                break;
            default:
                Intrinsics.checkNotNullParameter(captureSpanData, "$this$captureData");
                hg2.c cVar = (hg2.c) obj;
                q T0 = s0.T0(captureSpanData, p0.f134884d, cVar.f69085f.now());
                if (T0 != null) {
                    cVar.f69087h = T0;
                    break;
                }
                break;
        }
    }

    public final void e(oo2.a buildSerialDescriptor) {
        int i13 = this.f27567i;
        Object obj = this.f27568j;
        switch (i13) {
            case 17:
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                f0.h.n0(o0.f80439a);
                oo2.a.a(buildSerialDescriptor, "type", j1.f104577b);
                StringBuilder sb3 = new StringBuilder("kotlinx.serialization.Polymorphic<");
                no2.d dVar = (no2.d) obj;
                sb3.append(dVar.f91668a.f());
                sb3.append('>');
                oo2.a.a(buildSerialDescriptor, "value", n3.o(sb3.toString(), oo2.l.f96901a, new oo2.g[0], oo2.k.f96900i));
                q0 q0Var = dVar.f91669b;
                Intrinsics.checkNotNullParameter(q0Var, "<set-?>");
                buildSerialDescriptor.f96863b = q0Var;
                break;
            case 18:
            default:
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildClassSerialDescriptor");
                l1 l1Var = (l1) obj;
                oo2.a.a(buildSerialDescriptor, "first", l1Var.f104587a.a());
                oo2.a.a(buildSerialDescriptor, "second", l1Var.f104588b.a());
                oo2.a.a(buildSerialDescriptor, "third", l1Var.f104589c.a());
                break;
            case 19:
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                List list = (List) ((w) obj).f104645d;
                buildSerialDescriptor.getClass();
                Intrinsics.checkNotNullParameter(list, "<set-?>");
                buildSerialDescriptor.f96863b = list;
                break;
        }
    }

    public final void f(vf2.b captureData) {
        int i13 = this.f27567i;
        Object obj = this.f27568j;
        switch (i13) {
            case 6:
                Intrinsics.checkNotNullParameter(captureData, "$this$captureData");
                th2.e eVar = (th2.e) obj;
                l0 l0Var = new l0(eVar);
                si2.g T2 = c0.d.T2(Severity.INFO);
                String str = eVar.f117667i;
                if (str == null) {
                    str = "";
                }
                kg.p.k(captureData, l0Var, T2, str, false, null, 56);
                break;
            default:
                Intrinsics.checkNotNullParameter(captureData, "$this$captureData");
                kg.p.k(captureData, new l0((Throwable) obj), c0.d.T2(Severity.ERROR), "", true, null, 48);
                break;
        }
    }

    public final String h(int i13) {
        int i14 = this.f27567i;
        Object obj = this.f27568j;
        switch (i14) {
            case 18:
                StringBuilder sb3 = new StringBuilder();
                oo2.h hVar = (oo2.h) obj;
                sb3.append(hVar.f96888f[i13]);
                sb3.append(": ");
                sb3.append(hVar.f96889g[i13].i());
                return sb3.toString();
            default:
                StringBuilder sb4 = new StringBuilder();
                y0 y0Var = (y0) obj;
                sb4.append(y0Var.f104660e[i13]);
                sb4.append(": ");
                sb4.append(y0Var.h(i13).i());
                return sb4.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f3, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cd2.n.invoke(java.lang.Object):java.lang.Object");
    }
}
