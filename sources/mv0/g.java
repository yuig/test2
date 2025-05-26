package mv0;

import com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.d2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import u50.h0;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f88347j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f88348k = new g(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g f88349l = new g(2);

    /* renamed from: m, reason: collision with root package name */
    public static final g f88350m = new g(3);

    /* renamed from: n, reason: collision with root package name */
    public static final g f88351n = new g(4);

    /* renamed from: o, reason: collision with root package name */
    public static final g f88352o = new g(5);

    /* renamed from: p, reason: collision with root package name */
    public static final g f88353p = new g(6);

    /* renamed from: q, reason: collision with root package name */
    public static final g f88354q = new g(7);

    /* renamed from: r, reason: collision with root package name */
    public static final g f88355r = new g(8);

    /* renamed from: s, reason: collision with root package name */
    public static final g f88356s = new g(9);

    /* renamed from: t, reason: collision with root package name */
    public static final g f88357t = new g(10);

    /* renamed from: u, reason: collision with root package name */
    public static final g f88358u = new g(11);

    /* renamed from: v, reason: collision with root package name */
    public static final g f88359v = new g(12);

    /* renamed from: w, reason: collision with root package name */
    public static final g f88360w = new g(13);

    /* renamed from: x, reason: collision with root package name */
    public static final g f88361x = new g(14);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88362i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(1);
        this.f88362i = i13;
    }

    public final Boolean b(Navigation navigation) {
        switch (this.f88362i) {
            case 0:
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                return Boolean.valueOf(Intrinsics.d(navigation.getF49939a(), d2.m()));
            case 1:
                Intrinsics.checkNotNullParameter(navigation, "it");
                return Boolean.valueOf(navigation.getF49939a() == IdeaPinCreationLocation.IDEA_PIN_CREATION_PRODUCT_TAG_LIST);
            case 10:
                Intrinsics.checkNotNullParameter(navigation, "it");
                return Boolean.valueOf(navigation.getF49939a() == IdeaPinCreationLocation.IDEA_PIN_CREATION_PRODUCT_TAG_LIST);
            case 11:
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                return Boolean.valueOf(navigation.getF49939a() == IdeaPinCreationLocation.STORY_PIN_CREATION_METADATA_LIST);
            default:
                Intrinsics.checkNotNullParameter(navigation, "it");
                return Boolean.valueOf(Intrinsics.d(navigation.getF49939a(), (ScreenLocation) d2.f50645f.getValue()));
        }
    }

    public final rn1.a e(rn1.a it) {
        switch (this.f88362i) {
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], aq1.h.domain_filter_search_header), vn1.c.LIGHT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.LIGHT, null, null, null, 1, null, rn1.b.END, null, null, false, 0, null, vn1.g.BODY_100, vn1.h.f126278d, null, null, false, null, null, 2072413);
        }
    }

    public final yl1.b f(yl1.b it) {
        switch (this.f88362i) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], aq1.h.idea_pin_affiliate_link_create), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.done), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    public final void h(cn1.n bind) {
        h0 helperText = h0.f120562a;
        switch (this.f88362i) {
            case 4:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f28227s = false;
                Intrinsics.checkNotNullParameter(helperText, "helperText");
                bind.f28211c = helperText;
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.getClass();
                Intrinsics.checkNotNullParameter(helperText, "text");
                bind.f28209a = helperText;
                break;
        }
    }

    public final void i(ln1.l bind) {
        switch (this.f88362i) {
            case 3:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(ln1.e.LOADED);
                break;
            case 4:
            case 6:
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(ln1.e.LOADED);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(ln1.e.LOADING);
                break;
            case 7:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(ln1.e.LOADED);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f88362i) {
            case 0:
                return b((Navigation) obj);
            case 1:
                return b((Navigation) obj);
            case 2:
                return f((yl1.b) obj);
            case 3:
                i((ln1.l) obj);
                return Unit.f80348a;
            case 4:
                h((cn1.n) obj);
                return Unit.f80348a;
            case 5:
                i((ln1.l) obj);
                return Unit.f80348a;
            case 6:
                h((cn1.n) obj);
                return Unit.f80348a;
            case 7:
                i((ln1.l) obj);
                return Unit.f80348a;
            case 8:
                i((ln1.l) obj);
                return Unit.f80348a;
            case 9:
                return e((rn1.a) obj);
            case 10:
                return b((Navigation) obj);
            case 11:
                return b((Navigation) obj);
            case 12:
                return b((Navigation) obj);
            case 13:
                return f((yl1.b) obj);
            default:
                return e((rn1.a) obj);
        }
    }
}
