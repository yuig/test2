package gu0;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import vn1.c;
import vn1.g;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f66122j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f66123k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f66124i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f66124i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f66124i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, c.LIGHT, e0.b(vn1.b.START), null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097145);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                g gVar = g.BODY_100;
                return rn1.a.y(it, null, c.LIGHT, e0.b(vn1.b.START), null, gVar, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097065);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f66124i) {
        }
        return b((rn1.a) obj);
    }
}
