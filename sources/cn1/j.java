package cn1;

import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f28200i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f28201j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ vn1.c f28202k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ rm1.d f28203l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, vn1.c cVar, rm1.d dVar, int i13) {
        super(1);
        this.f28200i = i13;
        this.f28201j = str;
        this.f28202k = cVar;
        this.f28203l = dVar;
    }

    public final rn1.a b(rn1.a state) {
        int i13 = this.f28200i;
        String str = this.f28201j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(state, "state");
                return rn1.a.y(state, bs1.c.h2(str), this.f28202k, null, null, vn1.g.BODY_100, 2, d7.b.Z(str.length() > 0), null, null, this.f28203l, false, 0, ep.b.x(str, "string", str), null, null, new u50.b0(eo1.c.space_100), null, false, fm1.a.YES, null, 1535372);
            default:
                return rn1.a.y(state, jq.b.p(state, AnimatedTarget.PROPERTY_STATE, str, "string", str), this.f28202k, null, null, vn1.g.BODY_100, 2, d7.b.Z(str.length() > 0), null, null, this.f28203l, false, 0, null, null, null, new u50.b0(eo1.c.space_100), null, false, null, null, 2063756);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f28200i) {
        }
        return b((rn1.a) obj);
    }
}
