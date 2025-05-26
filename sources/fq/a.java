package fq;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rn1.b;
import vn1.e;
import vn1.g;

/* loaded from: classes3.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f62790j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f62791k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62792i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f62792i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f62792i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                g gVar = g.BODY_300;
                return rn1.a.y(it, null, null, null, e0.b(e.BOLD), gVar, 1, null, b.END, null, null, false, 0, null, g.BODY_100, gVar, null, null, false, null, null, 2072391);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, e0.b(e.BOLD), g.BODY_100, 1, null, b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096967);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f62792i) {
        }
        return b((rn1.a) obj);
    }
}
