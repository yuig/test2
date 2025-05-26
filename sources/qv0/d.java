package qv0;

import com.pinterest.navigation.Navigation;
import com.pinterest.screens.d2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.h0;
import u50.k0;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f105163j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f105164k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f105165l = new d(2);

    /* renamed from: m, reason: collision with root package name */
    public static final d f105166m = new d(3);

    /* renamed from: n, reason: collision with root package name */
    public static final d f105167n = new d(4);

    /* renamed from: o, reason: collision with root package name */
    public static final d f105168o = new d(5);

    /* renamed from: p, reason: collision with root package name */
    public static final d f105169p = new d(6);

    /* renamed from: q, reason: collision with root package name */
    public static final d f105170q = new d(7);

    /* renamed from: r, reason: collision with root package name */
    public static final d f105171r = new d(8);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f105172i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f105172i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f105172i) {
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.LIGHT, kotlin.collections.e0.b(vn1.b.CENTER_HORIZONTAL), null, vn1.g.UI_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097129);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2096383);
        }
    }

    public final void e(cn1.n bind) {
        switch (this.f105172i) {
            case 0:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                int i13 = aq1.h.idea_pin_sticker_search_hint_text;
                bind.getClass();
                bind.f28212d = new k0(i13);
                break;
            case 1:
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                h0 text = h0.f120562a;
                bind.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                bind.f28209a = text;
                bind.e(dn1.e.DEFAULT);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.e(dn1.e.TRAILING_BUTTON);
                break;
        }
    }

    public final void f(ln1.l bind) {
        switch (this.f105172i) {
            case 1:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(ln1.e.LOADING);
                bind.d(fm1.c.VISIBLE);
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(ln1.e.LOADING);
                bind.d(fm1.c.VISIBLE);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f105172i) {
            case 0:
                e((cn1.n) obj);
                return Unit.f80348a;
            case 1:
                f((ln1.l) obj);
                return Unit.f80348a;
            case 2:
                e((cn1.n) obj);
                return Unit.f80348a;
            case 3:
                e((cn1.n) obj);
                return Unit.f80348a;
            case 4:
                Navigation navigation = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                return Boolean.valueOf(Intrinsics.d(navigation.getF49939a(), d2.m()));
            case 5:
                f((ln1.l) obj);
                return Unit.f80348a;
            case 6:
                return b((rn1.a) obj);
            case 7:
                return Unit.f80348a;
            default:
                return b((rn1.a) obj);
        }
    }
}
