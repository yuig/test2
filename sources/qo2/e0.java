package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e0 extends b1 {

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f104546c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.q.f80441a, "<this>");
        f104546c = new e0(f0.f104550a);
    }

    @Override // qo2.a
    public final int i(Object obj) {
        int[] iArr = (int[]) obj;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }

    @Override // qo2.o, qo2.a
    public final void k(po2.a decoder, int i13, Object obj, boolean z13) {
        d0 builder = (d0) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        int D = decoder.D(this.f104534b, i13);
        builder.getClass();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f104541a;
        int i14 = builder.f104542b;
        builder.f104542b = i14 + 1;
        iArr[i14] = D;
    }

    @Override // qo2.a
    public final Object l(Object obj) {
        int[] bufferWithData = (int[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        d0 d0Var = new d0();
        d0Var.f104541a = bufferWithData;
        d0Var.f104542b = bufferWithData.length;
        d0Var.b(10);
        return d0Var;
    }

    @Override // qo2.b1
    public final Object o() {
        return new int[0];
    }

    @Override // qo2.b1
    public final void p(po2.b encoder, Object obj, int i13) {
        int[] content = (int[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i14 = 0; i14 < i13; i14++) {
            encoder.D(i14, content[i14], this.f104534b);
        }
    }
}
