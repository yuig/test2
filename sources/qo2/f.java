package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f extends b1 {

    /* renamed from: c, reason: collision with root package name */
    public static final f f104549c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.b.f80420a, "<this>");
        f104549c = new f(g.f104555a);
    }

    @Override // qo2.a
    public final int i(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }

    @Override // qo2.o, qo2.a
    public final void k(po2.a decoder, int i13, Object obj, boolean z13) {
        e builder = (e) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean h10 = decoder.h(this.f104534b, i13);
        builder.getClass();
        builder.b(builder.d() + 1);
        boolean[] zArr = builder.f104544a;
        int i14 = builder.f104545b;
        builder.f104545b = i14 + 1;
        zArr[i14] = h10;
    }

    @Override // qo2.a
    public final Object l(Object obj) {
        boolean[] bufferWithData = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        e eVar = new e();
        eVar.f104544a = bufferWithData;
        eVar.f104545b = bufferWithData.length;
        eVar.b(10);
        return eVar;
    }

    @Override // qo2.b1
    public final Object o() {
        return new boolean[0];
    }

    @Override // qo2.b1
    public final void p(po2.b encoder, Object obj, int i13) {
        boolean[] content = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i14 = 0; i14 < i13; i14++) {
            encoder.E(this.f104534b, i14, content[i14]);
        }
    }
}
