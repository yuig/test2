package es;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.p0;

/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f59991i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f59992j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f59993k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f59994l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f59995m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i13, int i14, int i15, String str, String str2) {
        super(1);
        this.f59991i = i15;
        this.f59992j = i13;
        this.f59993k = str;
        this.f59994l = i14;
        this.f59995m = str2;
    }

    public final void b(p0 styledString) {
        int i13 = this.f59992j;
        int i14 = this.f59991i;
        int i15 = this.f59994l;
        String str = this.f59995m;
        String str2 = this.f59993k;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(styledString, "$this$styledString");
                p0.b(styledString, i13, new k(styledString, str2, 0));
                p0.b(styledString, i15, new k(styledString, str, 1));
                break;
            case 1:
                Intrinsics.checkNotNullParameter(styledString, "$this$styledString");
                p0.a(styledString, i13, new k(styledString, str2, 2));
                styledString.e(" ");
                p0.d(styledString, new po1.a(styledString, i15, str, 0));
                break;
            default:
                Intrinsics.checkNotNullParameter(styledString, "$this$styledString");
                p0.b(styledString, i13, new k(styledString, str2, 5));
                styledString.e(" ");
                p0.d(styledString, new po1.a(styledString, i15, str, 1));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f59991i) {
            case 0:
                b((p0) obj);
                break;
            case 1:
                b((p0) obj);
                break;
            default:
                b((p0) obj);
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, int i13, int i14, String str2) {
        super(1);
        this.f59991i = 0;
        this.f59992j = i13;
        this.f59994l = i14;
        this.f59993k = str;
        this.f59995m = str2;
    }
}
