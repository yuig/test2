package ch0;

import android.content.Context;
import com.pinterest.api.model.vh;
import com.pinterest.gestalt.callout.GestaltCallout;
import dm1.l;
import dm1.m;
import i32.y0;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import t3.s1;
import ug0.i;
import uj2.q;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27728i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ hh0.e f27729j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d f27730k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ vh f27731l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ GestaltCallout f27732m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(hh0.e eVar, d dVar, vh vhVar, GestaltCallout gestaltCallout, int i13) {
        super(1);
        this.f27728i = i13;
        this.f27729j = eVar;
        this.f27730k = dVar;
        this.f27731l = vhVar;
        this.f27732m = gestaltCallout;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        q e13;
        String str;
        tg0.d dVar = tg0.d.f117578b;
        int i13 = this.f27728i;
        vh vhVar = this.f27731l;
        GestaltCallout gestaltCallout = this.f27732m;
        d dVar2 = this.f27730k;
        hh0.e eVar = this.f27729j;
        switch (i13) {
            case 0:
                l it = (l) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                y0 i03 = k3.i0(eVar);
                if (i03 != null) {
                    ((dh0.d) dVar2.f27735b).j(i03);
                }
                String str2 = ((fh0.a) eVar.f69143e).f62150c.f64995b;
                if (str2 != null) {
                    lu1.b bVar = dVar2.f27737d;
                    Context context = gestaltCallout.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    ((lu1.c) bVar).m(context, str2);
                }
                nl.b.s(s1.f(i.d(dVar2.f27734a, eVar.f69141c, eVar.f69140b, vhVar.f42862t, dVar, 16).H(tk2.e.f118017c), "observeOn(...)"), new a(dVar2, 0), null, null, 6);
                dVar2.f27736c.f(new qg0.a(vhVar));
                break;
            default:
                m it2 = (m) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                y0 i04 = k3.i0(eVar);
                if (i04 != null) {
                    ((dh0.d) dVar2.f27735b).j(i04);
                }
                gh0.a aVar = ((fh0.a) eVar.f69143e).f62151d;
                if (aVar != null && (str = aVar.f64995b) != null) {
                    lu1.b bVar2 = dVar2.f27737d;
                    Context context2 = gestaltCallout.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    ((lu1.c) bVar2).m(context2, str);
                }
                e13 = dVar2.f27734a.e(eVar.f69141c, eVar.f69140b, vhVar.f42862t, tg0.d.f117578b, null);
                nl.b.s(s1.f(e13.H(tk2.e.f118017c), "observeOn(...)"), new a(dVar2, 1), null, null, 6);
                dVar2.f27736c.f(new qg0.a(vhVar));
                break;
        }
        return Unit.f80348a;
    }
}
