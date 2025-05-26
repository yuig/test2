package ro2;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements no2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final h f108991a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final g f108992b = g.f108988b;

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f108992b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        e value = (e) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        kg.p.m(encoder);
        r element = r.f109037a;
        Intrinsics.checkNotNullParameter(element, "elementSerializer");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(element, "element");
        qo2.c cVar = new qo2.c(element.a(), 1);
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "<this>");
        int size = value.size();
        po2.b h10 = encoder.h(cVar, size);
        Intrinsics.checkNotNullParameter(value, "<this>");
        Iterator<n> it = value.iterator();
        for (int i13 = 0; i13 < size; i13++) {
            h10.u(cVar, i13, element, it.next());
        }
        h10.a(cVar);
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        kg.p.l(decoder);
        r elementSerializer = r.f109037a;
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new e((List) new qo2.d(elementSerializer, 0).e(decoder));
    }
}
