package xt0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f135894j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f135895k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f135896l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f135897m = new a(3);

    /* renamed from: n, reason: collision with root package name */
    public static final a f135898n = new a(4);

    /* renamed from: o, reason: collision with root package name */
    public static final a f135899o = new a(5);

    /* renamed from: p, reason: collision with root package name */
    public static final a f135900p = new a(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135901i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f135901i = i13;
    }

    public final rn1.a b(rn1.a state) {
        switch (this.f135901i) {
            case 0:
                Intrinsics.checkNotNullParameter(state, "state");
                return rn1.a.y(state, bs1.c.j2(new String[0], aq1.h.idea_pin_canvas_aspect_ratio_original), null, null, null, null, 0, null, null, null, null, false, 0, bs1.c.j2(new String[0], aq1.h.accessibility_idea_pin_aspect_ratio_original), null, null, null, null, false, null, null, 2093054);
            case 1:
                Intrinsics.checkNotNullParameter(state, "it");
                return rn1.a.y(state, null, vn1.c.INVERSE, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            case 2:
                Intrinsics.checkNotNullParameter(state, "it");
                return rn1.a.y(state, null, vn1.c.DEFAULT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            case 3:
                Intrinsics.checkNotNullParameter(state, "it");
                return rn1.a.y(state, null, vn1.c.DEFAULT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            case 4:
                Intrinsics.checkNotNullParameter(state, "it");
                return rn1.a.y(state, null, vn1.c.INVERSE, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            default:
                Intrinsics.checkNotNullParameter(state, "state");
                return rn1.a.y(state, null, vn1.c.INVERSE, null, null, vn1.g.BODY_100, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097133);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f135901i) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                return b((rn1.a) obj);
            case 2:
                return b((rn1.a) obj);
            case 3:
                return b((rn1.a) obj);
            case 4:
                return b((rn1.a) obj);
            case 5:
                return b((rn1.a) obj);
            default:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, om1.f.TRANSPARENT_ALWAYS_LIGHT, null, null, false, 0, 1019);
        }
    }
}
