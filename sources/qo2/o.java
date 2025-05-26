package qo2;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class o extends a {

    /* renamed from: a, reason: collision with root package name */
    public final no2.b f104601a;

    public o(no2.b bVar) {
        this.f104601a = bVar;
    }

    @Override // no2.h
    public void c(po2.d encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int i13 = i(obj);
        oo2.g a13 = a();
        po2.b h10 = encoder.h(a13, i13);
        Iterator h13 = h(obj);
        for (int i14 = 0; i14 < i13; i14++) {
            h10.u(a(), i14, this.f104601a, h13.next());
        }
        h10.a(a13);
    }

    @Override // qo2.a
    public void k(po2.a decoder, int i13, Object obj, boolean z13) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        n(i13, obj, decoder.C(a(), i13, this.f104601a, null));
    }

    public abstract void n(int i13, Object obj, Object obj2);
}
