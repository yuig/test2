package w1;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class k0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127336i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f127337j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f127338k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f127339l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f127340m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f127341n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Context context, InputStream inputStream, File file, boolean z13, boolean z14) {
        super(1);
        this.f127336i = 1;
        this.f127339l = context;
        this.f127340m = inputStream;
        this.f127341n = file;
        this.f127337j = z13;
        this.f127338k = z14;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CharSequence b83;
        int i13 = this.f127336i;
        boolean z13 = this.f127338k;
        boolean z14 = this.f127337j;
        Object obj2 = this.f127340m;
        Object obj3 = this.f127339l;
        Object obj4 = this.f127341n;
        switch (i13) {
            case 0:
                b4.g gVar = (b4.g) obj;
                if (z14 || !z13) {
                    return Boolean.FALSE;
                }
                l1 l1Var = (l1) obj3;
                h4.m0 m0Var = l1Var.f127359e;
                e0 e0Var = l1Var.f127374t;
                Unit unit = null;
                if (m0Var != null) {
                    h4.f0 a13 = l1Var.f127358d.a(kotlin.collections.f0.j(new h4.m(), new h4.a(gVar, 1)));
                    m0Var.a(null, a13);
                    e0Var.invoke(a13);
                    unit = Unit.f80348a;
                }
                if (unit == null) {
                    h4.f0 f0Var = (h4.f0) obj4;
                    String str = f0Var.f67559a.f21571a;
                    int i14 = b4.p0.f21640c;
                    long j13 = f0Var.f67560b;
                    int i15 = (int) (j13 >> 32);
                    String obj5 = StringsKt.U(str, i15, (int) (j13 & 4294967295L), gVar).toString();
                    int length = gVar.f21571a.length() + i15;
                    e0Var.invoke(new h4.f0(obj5, b7.c.h(length, length), 4));
                }
                return Boolean.TRUE;
            case 1:
                String path = (String) obj;
                Intrinsics.checkNotNullParameter(path, "path");
                fk2.h hVar = new fk2.h(new gw0.b((Context) obj3, new FileOutputStream((File) obj4), (InputStream) obj2, path, this.f127337j, this.f127338k), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromCallable(...)");
                return hVar;
            default:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (z14 && z13) {
                    b83 = b31.g.b8((b31.g) obj3, (String) obj2).append((CharSequence) (" · " + ((String) obj4)));
                } else {
                    b83 = z14 ? b31.g.b8((b31.g) obj3, (String) obj2) : (String) obj4;
                }
                Intrinsics.f(b83);
                return rn1.a.y(it, bs1.c.h2(b83), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096062);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(boolean z13, boolean z14, Object obj, Object obj2, Object obj3, int i13) {
        super(1);
        this.f127336i = i13;
        this.f127337j = z13;
        this.f127338k = z14;
        this.f127339l = obj;
        this.f127340m = obj2;
        this.f127341n = obj3;
    }
}
