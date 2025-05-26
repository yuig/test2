package ht0;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final k f70115j = new k(0);

    /* renamed from: k, reason: collision with root package name */
    public static final k f70116k = new k(1);

    /* renamed from: l, reason: collision with root package name */
    public static final k f70117l = new k(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70118i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i13) {
        super(1);
        this.f70118i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f70118i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.DEFAULT, null, null, vn1.g.BODY_200, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097133);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], xp1.d.add_more_personalization), null, e0.b(vn1.b.CENTER), null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097146);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f70118i) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], xp1.d.update_setting), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                return b((rn1.a) obj);
        }
    }
}
